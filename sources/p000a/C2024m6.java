package p000a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: a.m6 */
/* loaded from: classes.dex */
public final class C2024m6 implements Handler.Callback {

    /* renamed from: u */
    public static C2024m6 f6281u;

    /* renamed from: h */
    public C1178W3 f6285h;

    /* renamed from: z */
    public C1178W3 f6287z;

    /* renamed from: v */
    public int f6286v = 0;

    /* renamed from: P */
    public final ArrayList f6283P = new ArrayList();

    /* renamed from: N */
    public final ArrayMap f6282N = new ArrayMap();

    /* renamed from: Q */
    public final ArrayMap f6284Q = new ArrayMap();

    /* renamed from: v */
    public static C2036mK m3657v(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            throw new IllegalArgumentException("The intent does not have a component set");
        }
        if (component.getPackageName().equals(AbstractC1292YB.m2646F().getPackageName())) {
            return new C2036mK(component, intent.hasCategory(AbstractC1145VQ.f3727z));
        }
        throw new IllegalArgumentException("RootServices outside of the app are not supported");
    }

    /* renamed from: P */
    public final C0351Gh m3658P(ComponentName componentName, String str) {
        Context m2646F = AbstractC1292YB.m2646F();
        if ((this.f6286v & 4) == 0) {
            IntentFilter intentFilter = new IntentFilter("com.topjohnwu.superuser.RECEIVER_BROADCAST");
            if (Build.VERSION.SDK_INT >= 26) {
                m2646F.registerReceiver(new C1845ij(this), intentFilter, "android.permission.BROADCAST_PACKAGE_REMOVED", null, 4);
            } else {
                m2646F.registerReceiver(new C1845ij(this), intentFilter, "android.permission.BROADCAST_PACKAGE_REMOVED", null);
            }
            this.f6286v |= 4;
        }
        return new C0351Gh(str, componentName);
    }

    /* renamed from: h */
    public final void m3659h(C0024AR c0024ar) {
        boolean z;
        Iterator it = this.f6284Q.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C0312Fx c0312Fx = (C0312Fx) entry.getValue();
            C0803Oz c0803Oz = (C0803Oz) ((Pair) c0312Fx).first;
            int i = c0024ar.f142S;
            Object obj = c0024ar.f141R;
            switch (i) {
                case 6:
                    z = ((C0803Oz) obj).equals(c0803Oz);
                    break;
                default:
                    C1178W3 c1178w3 = (C1178W3) obj;
                    c1178w3.getClass();
                    if (c0803Oz.f2741v == c1178w3) {
                        z = true;
                        break;
                    } else {
                        z = false;
                        break;
                    }
            }
            if (z) {
                ((Executor) ((Pair) c0312Fx).second).execute(new RunnableC1547d8(c0312Fx, 17, (ServiceConnection) entry.getKey()));
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z = true;
        if (message.what == 1) {
            ComponentName componentName = (ComponentName) message.obj;
            if (message.arg1 == 0) {
                z = false;
            }
            C0803Oz c0803Oz = (C0803Oz) this.f6282N.remove(new C2036mK(componentName, z));
            if (c0803Oz != null) {
                m3659h(new C0024AR(6, c0803Oz));
            }
        }
        return false;
    }

    /* renamed from: z */
    public final C2036mK m3660z(Intent intent, Executor executor, final ServiceConnection serviceConnection) {
        C1178W3 c1178w3;
        if (AbstractC1292YB.m2640B()) {
            final C2036mK m3657v = m3657v(intent);
            ArrayMap arrayMap = this.f6282N;
            C0803Oz c0803Oz = (C0803Oz) arrayMap.get(m3657v);
            final int i = 1;
            ArrayMap arrayMap2 = this.f6284Q;
            if (c0803Oz != null) {
                arrayMap2.put(serviceConnection, new C0312Fx(c0803Oz, executor));
                c0803Oz.f2739P++;
                final int i2 = 0;
                final IBinder iBinder = c0803Oz.f2740h;
                executor.execute(new Runnable() { // from class: a.mu
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        IBinder iBinder2 = iBinder;
                        ServiceConnection serviceConnection2 = serviceConnection;
                        C2036mK c2036mK = m3657v;
                        switch (i3) {
                            case AbstractC0795Op.f2698E /* 0 */:
                                serviceConnection2.onServiceConnected((ComponentName) ((Pair) c2036mK).first, iBinder2);
                                return;
                            default:
                                serviceConnection2.onServiceConnected((ComponentName) ((Pair) c2036mK).first, iBinder2);
                                return;
                        }
                    }
                });
                return null;
            }
            if (((Boolean) ((Pair) m3657v).second).booleanValue()) {
                c1178w3 = this.f6285h;
            } else {
                c1178w3 = this.f6287z;
            }
            if (c1178w3 == null) {
                return m3657v;
            }
            try {
                final IBinder mo2701Y = c1178w3.f3841h.mo2701Y(intent);
                if (mo2701Y != null) {
                    C0803Oz c0803Oz2 = new C0803Oz(m3657v, mo2701Y, c1178w3);
                    arrayMap2.put(serviceConnection, new C0312Fx(c0803Oz2, executor));
                    arrayMap.put(m3657v, c0803Oz2);
                    executor.execute(new Runnable() { // from class: a.mu
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i;
                            IBinder iBinder2 = mo2701Y;
                            ServiceConnection serviceConnection2 = serviceConnection;
                            C2036mK c2036mK = m3657v;
                            switch (i3) {
                                case AbstractC0795Op.f2698E /* 0 */:
                                    serviceConnection2.onServiceConnected((ComponentName) ((Pair) c2036mK).first, iBinder2);
                                    return;
                                default:
                                    serviceConnection2.onServiceConnected((ComponentName) ((Pair) c2036mK).first, iBinder2);
                                    return;
                            }
                        }
                    });
                } else if (Build.VERSION.SDK_INT >= 28) {
                    executor.execute(new RunnableC1547d8(serviceConnection, 16, m3657v));
                }
                return null;
            } catch (RemoteException e) {
                AbstractC1292YB.m2644E("IPC", e);
                c1178w3.binderDied();
                return m3657v;
            }
        }
        throw new IllegalStateException("This method can only be called on the main thread");
    }
}
