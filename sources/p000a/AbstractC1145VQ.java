package p000a;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Pair;
import java.util.concurrent.Executor;

/* renamed from: a.VQ */
/* loaded from: classes.dex */
public abstract class AbstractC1145VQ extends ContextWrapper {

    /* renamed from: z */
    public static final String f3727z = "com.topjohnwu.superuser.DAEMON_MODE";

    public AbstractC1145VQ() {
        super(null);
    }

    @Deprecated
    /* renamed from: P */
    public static Runnable m2347P(Intent intent, Executor executor, ServiceConnection serviceConnection) {
        InterfaceC1798hr m2351v = m2351v(intent, executor, serviceConnection);
        if (m2351v == null) {
            return null;
        }
        return new RunnableC0308Fs(18, m2351v);
    }

    /* renamed from: S */
    public static InterfaceC1798hr m2348S(Intent intent) {
        C1178W3 c1178w3;
        if (C2024m6.f6281u == null) {
            C2024m6.f6281u = new C2024m6();
        }
        C2024m6 c2024m6 = C2024m6.f6281u;
        c2024m6.getClass();
        if (AbstractC1292YB.m2640B()) {
            C2036mK m3657v = C2024m6.m3657v(intent);
            if (((Boolean) ((Pair) m3657v).second).booleanValue()) {
                c1178w3 = c2024m6.f6285h;
            } else {
                c1178w3 = c2024m6.f6287z;
            }
            if (c1178w3 == null) {
                if (((Boolean) ((Pair) m3657v).second).booleanValue()) {
                    return c2024m6.m3658P((ComponentName) ((Pair) m3657v).first, "stop");
                }
            } else {
                try {
                    c1178w3.f3841h.mo2700J(-1, (ComponentName) ((Pair) m3657v).first);
                } catch (RemoteException e) {
                    AbstractC1292YB.m2644E("IPC", e);
                }
                C0803Oz c0803Oz = (C0803Oz) c2024m6.f6282N.remove(m3657v);
                if (c0803Oz != null) {
                    c2024m6.m3659h(new C0024AR(6, c0803Oz));
                }
            }
            return null;
        }
        throw new IllegalStateException("This method can only be called on the main thread");
    }

    /* renamed from: V */
    public static void m2349V(Intent intent) {
        InterfaceC1798hr m2348S;
        if (!AbstractC1292YB.m2683n() && (m2348S = m2348S(intent)) != null) {
            AbstractC0017AI.f108S.execute(new RunnableC0308Fs(18, m2348S));
        }
    }

    /* renamed from: h */
    public static void m2350h(Intent intent, Executor executor, ServiceConnection serviceConnection) {
        InterfaceC1798hr m2351v;
        if (!AbstractC1292YB.m2683n() && (m2351v = m2351v(intent, executor, serviceConnection)) != null) {
            AbstractC0017AI.f108S.execute(new RunnableC0308Fs(18, m2351v));
        }
    }

    /* renamed from: v */
    public static InterfaceC1798hr m2351v(Intent intent, Executor executor, ServiceConnection serviceConnection) {
        int i;
        String str;
        if (C2024m6.f6281u == null) {
            C2024m6.f6281u = new C2024m6();
        }
        C2024m6 c2024m6 = C2024m6.f6281u;
        C2036mK m3660z = c2024m6.m3660z(intent, executor, serviceConnection);
        if (m3660z != null) {
            c2024m6.f6283P.add(new C1958kq(c2024m6, intent, executor, serviceConnection));
            if (((Boolean) ((Pair) m3660z).second).booleanValue()) {
                i = 2;
            } else {
                i = 1;
            }
            int i2 = c2024m6.f6286v;
            if ((i2 & i) == 0) {
                c2024m6.f6286v = i | i2;
                if (((Boolean) ((Pair) m3660z).second).booleanValue()) {
                    str = "daemon";
                } else {
                    str = "start";
                }
                return c2024m6.m3658P((ComponentName) ((Pair) m3660z).first, str);
            }
        }
        return null;
    }

    /* renamed from: w */
    public static void m2352w(ServiceConnection serviceConnection) {
        if (C2024m6.f6281u == null) {
            C2024m6.f6281u = new C2024m6();
        }
        C2024m6 c2024m6 = C2024m6.f6281u;
        c2024m6.getClass();
        if (AbstractC1292YB.m2640B()) {
            C0312Fx c0312Fx = (C0312Fx) c2024m6.f6284Q.remove(serviceConnection);
            if (c0312Fx != null) {
                C0803Oz c0803Oz = (C0803Oz) ((Pair) c0312Fx).first;
                int i = c0803Oz.f2739P - 1;
                c0803Oz.f2739P = i;
                if (i == 0) {
                    ArrayMap arrayMap = c2024m6.f6282N;
                    C2036mK c2036mK = c0803Oz.f2742z;
                    arrayMap.remove(c2036mK);
                    try {
                        c0803Oz.f2741v.f3841h.mo2703z((ComponentName) ((Pair) c2036mK).first);
                    } catch (RemoteException e) {
                        AbstractC1292YB.m2644E("IPC", e);
                    }
                }
                ((Executor) ((Pair) c0312Fx).second).execute(new RunnableC1547d8(c0312Fx, 17, serviceConnection));
                return;
            }
            return;
        }
        throw new IllegalStateException("This method can only be called on the main thread");
    }

    /* renamed from: z */
    public static void m2353z(Intent intent, ServiceConnection serviceConnection) {
        m2350h(intent, AbstractC1110Un.f3613h, serviceConnection);
    }

    /* renamed from: G */
    public void m2354G(Intent intent) {
    }

    /* renamed from: M */
    public boolean m2355M(Intent intent) {
        return false;
    }

    /* renamed from: N */
    public abstract ComponentName mo755N();

    /* renamed from: Q */
    public Context m2356Q(Context context) {
        return context;
    }

    /* renamed from: R */
    public final void m2357R() {
        if (BinderC2198pP.f6759I == null) {
            BinderC2198pP.f6759I = new BinderC2198pP(this);
        }
        BinderC2198pP binderC2198pP = BinderC2198pP.f6759I;
        ComponentName mo755N = mo755N();
        binderC2198pP.getClass();
        AbstractC1110Un.m2289z(new RunnableC1677fW(binderC2198pP, mo755N, 0));
    }

    /* renamed from: W */
    public void m2358W() {
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        super.attachBaseContext(m2356Q(context2));
        if (BinderC2198pP.f6759I == null) {
            BinderC2198pP.f6759I = new BinderC2198pP(context);
        }
        BinderC2198pP binderC2198pP = BinderC2198pP.f6759I;
        binderC2198pP.getClass();
        binderC2198pP.f6761S.put(mo755N(), new C2452uC(this));
        mo756o();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return AbstractC1292YB.f4144v;
    }

    /* renamed from: o */
    public abstract void mo756o();

    /* renamed from: u */
    public abstract IBinder mo757u(Intent intent);
}
