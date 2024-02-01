package p000a;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.UserHandle;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.SparseArray;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: a.pP */
/* loaded from: classes.dex */
public final class BinderC2198pP extends Binder implements Runnable, InterfaceC2625xN {

    /* renamed from: I */
    public static BinderC2198pP f6759I;

    /* renamed from: R */
    public final SparseArray f6760R;

    /* renamed from: S */
    public final ArrayMap f6761S;

    /* renamed from: w */
    public final boolean f6762w;

    public BinderC2198pP(Context context) {
        attachInterface(this, "com.topjohnwu.superuser.internal.IRootServiceManager");
        this.f6761S = new ArrayMap();
        this.f6760R = new SparseArray();
        System.getenv("LIBSU_VERBOSE_LOGGING");
        ExecutorService executorService = AbstractC0017AI.f108S;
        AbstractC1292YB.f4144v = context;
        if (System.getenv("LIBSU_DEBUGGER") != null) {
            try {
                AbstractC1166Vp.f3796v.invoke(null, context.getPackageName() + ":root", 0);
                while (true) {
                    try {
                        Thread.sleep(200L);
                    } catch (InterruptedException unused) {
                    }
                }
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException(e);
            }
        } else {
            new FileObserverC1311YY(this, new File(context.getPackageCodePath())).startWatching();
            if (context instanceof Callable) {
                try {
                    Object[] objArr = (Object[]) ((Callable) context).call();
                    boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                    this.f6762w = booleanValue;
                    if (booleanValue) {
                        String packageName = context.getPackageName();
                        int i = AbstractCallableC1983lI.f6152S;
                        AbstractC1166Vp.m2382z("libsu-" + packageName, this);
                    }
                    m3823F(((Integer) objArr[0]).intValue());
                    if (!booleanValue) {
                        AbstractC1110Un.f3614z.postDelayed(this, 10000L);
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            throw new IllegalArgumentException("Expected Context to be Callable");
        }
    }

    /* renamed from: C */
    public final void m3822C(C2452uC c2452uC, int i, Runnable runnable) {
        boolean z = !c2452uC.f7526h.isEmpty();
        Integer valueOf = Integer.valueOf(i);
        ArraySet arraySet = c2452uC.f7526h;
        arraySet.remove(valueOf);
        if (i < 0 || arraySet.isEmpty()) {
            AbstractC1145VQ abstractC1145VQ = c2452uC.f7528z;
            if (z) {
                c2452uC.f7524N = abstractC1145VQ.m2355M(c2452uC.f7527v);
            }
            boolean z2 = this.f6762w;
            if (i < 0 || !z2) {
                abstractC1145VQ.m2358W();
                runnable.run();
                Iterator it = arraySet.iterator();
                while (it.hasNext()) {
                    C1539d0 c1539d0 = (C1539d0) this.f6760R.get(((Integer) it.next()).intValue());
                    if (c1539d0 != null) {
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        obtain.arg1 = z2 ? 1 : 0;
                        obtain.obj = c2452uC.f7527v.getComponent();
                        try {
                            try {
                                c1539d0.f4767h.send(obtain);
                            } catch (RemoteException e) {
                                AbstractC1292YB.m2644E("IPC", e);
                            }
                        } finally {
                            obtain.recycle();
                        }
                    }
                }
            }
        }
        if (this.f6761S.isEmpty()) {
            System.exit(0);
        }
    }

    /* renamed from: F */
    public final void m3823F(int i) {
        UserHandle userHandleForUid;
        if (Binder.getCallingUid() != 0) {
            i = Binder.getCallingUid();
        }
        Bundle bundle = new Bundle();
        bundle.putBinder("binder", this);
        Intent putExtra = new Intent("com.topjohnwu.superuser.RECEIVER_BROADCAST").setPackage(AbstractC1292YB.m2646F().getPackageName()).addFlags(AbstractC1166Vp.f3794P).putExtra("extra.daemon", this.f6762w).putExtra("extra.bundle", bundle);
        if (Build.VERSION.SDK_INT >= 24) {
            userHandleForUid = UserHandle.getUserHandleForUid(i);
            AbstractC1292YB.f4144v.sendBroadcastAsUser(putExtra, userHandleForUid);
        } else {
            AbstractC1292YB.f4144v.sendBroadcast(putExtra);
        }
    }

    @Override // p000a.InterfaceC2625xN
    /* renamed from: J */
    public final void mo2700J(int i, ComponentName componentName) {
        if (Binder.getCallingUid() != 0) {
            i = Binder.getCallingUid();
        }
        AbstractC1110Un.m2289z(new RunnableC2208pb(this, componentName, i, 1));
    }

    /* renamed from: X */
    public final IBinder m3824X(Intent intent, int i) {
        if (((C1539d0) this.f6760R.get(i)) == null) {
            return null;
        }
        ComponentName component = intent.getComponent();
        ArrayMap arrayMap = this.f6761S;
        C2452uC c2452uC = (C2452uC) arrayMap.get(component);
        if (c2452uC == null) {
            Context context = AbstractC1292YB.f4144v;
            Constructor<?> declaredConstructor = context.getClassLoader().loadClass(component.getClassName()).getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            Object newInstance = declaredConstructor.newInstance(new Object[0]);
            Method method = AbstractC1166Vp.f3797z;
            if (newInstance instanceof ContextWrapper) {
                try {
                    AbstractC1166Vp.f3795h.invoke(newInstance, context);
                } catch (ReflectiveOperationException unused) {
                }
            }
            c2452uC = (C2452uC) arrayMap.get(component);
            if (c2452uC == null) {
                return null;
            }
        }
        IBinder iBinder = c2452uC.f7525P;
        component.getClassName();
        AbstractC1145VQ abstractC1145VQ = c2452uC.f7528z;
        if (iBinder != null) {
            if (c2452uC.f7524N) {
                abstractC1145VQ.m2354G(c2452uC.f7527v);
            }
        } else {
            c2452uC.f7525P = abstractC1145VQ.mo757u(intent);
            c2452uC.f7527v = intent.cloneFilter();
        }
        c2452uC.f7526h.add(Integer.valueOf(i));
        return c2452uC.f7525P;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [a.G8] */
    @Override // p000a.InterfaceC2625xN
    /* renamed from: Y */
    public final IBinder mo2701Y(final Intent intent) {
        final IBinder[] iBinderArr = new IBinder[1];
        final int callingUid = Binder.getCallingUid();
        ?? r2 = new Runnable() { // from class: a.G8
            @Override // java.lang.Runnable
            public final void run() {
                IBinder[] iBinderArr2 = iBinderArr;
                int i = callingUid;
                Intent intent2 = intent;
                BinderC2198pP binderC2198pP = BinderC2198pP.this;
                binderC2198pP.getClass();
                try {
                    iBinderArr2[0] = binderC2198pP.m3824X(intent2, i);
                } catch (Exception e) {
                    AbstractC1292YB.m2644E("IPC", e);
                }
            }
        };
        Handler handler = AbstractC1110Un.f3614z;
        if (AbstractC1292YB.m2640B()) {
            r2.run();
        } else {
            RunnableC2623xL runnableC2623xL = new RunnableC2623xL(r2);
            AbstractC1110Un.f3614z.post(runnableC2623xL);
            synchronized (runnableC2623xL) {
                while (runnableC2623xL.f8139S != null) {
                    try {
                        runnableC2623xL.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        return iBinderArr[0];
    }

    @Override // android.os.Binder
    /* renamed from: Z */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("com.topjohnwu.superuser.internal.IRootServiceManager");
        }
        if (i != 1598968902) {
            if (i != 1) {
                Object obj = null;
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return super.onTransact(i, parcel, parcel2, i2);
                            }
                            Parcelable.Creator creator = ComponentName.CREATOR;
                            if (parcel.readInt() != 0) {
                                obj = creator.createFromParcel(parcel);
                            }
                            mo2703z((ComponentName) obj);
                        } else {
                            Parcelable.Creator creator2 = Intent.CREATOR;
                            if (parcel.readInt() != 0) {
                                obj = creator2.createFromParcel(parcel);
                            }
                            IBinder mo2701Y = mo2701Y((Intent) obj);
                            parcel2.writeNoException();
                            parcel2.writeStrongBinder(mo2701Y);
                        }
                    } else {
                        mo2702w(parcel.readStrongBinder());
                        parcel2.writeNoException();
                    }
                } else {
                    Parcelable.Creator creator3 = ComponentName.CREATOR;
                    if (parcel.readInt() != 0) {
                        obj = creator3.createFromParcel(parcel);
                    }
                    mo2700J(parcel.readInt(), (ComponentName) obj);
                }
            } else {
                m3823F(parcel.readInt());
            }
            return true;
        }
        parcel2.writeString("com.topjohnwu.superuser.internal.IRootServiceManager");
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* renamed from: p */
    public final void m3826p(int i, ComponentName componentName) {
        C2452uC c2452uC = (C2452uC) this.f6761S.get(componentName);
        if (c2452uC == null) {
            return;
        }
        m3822C(c2452uC, i, new RunnableC1677fW(this, componentName, 1));
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6760R.size() == 0) {
            System.exit(0);
        }
    }

    @Override // p000a.InterfaceC2625xN
    /* renamed from: w */
    public final void mo2702w(IBinder iBinder) {
        AbstractC1110Un.m2289z(new RunnableC1421ah(Binder.getCallingUid(), 3, this, iBinder));
    }

    @Override // p000a.InterfaceC2625xN
    /* renamed from: z */
    public final void mo2703z(ComponentName componentName) {
        AbstractC1110Un.m2289z(new RunnableC2208pb(this, componentName, Binder.getCallingUid(), 0));
    }
}
