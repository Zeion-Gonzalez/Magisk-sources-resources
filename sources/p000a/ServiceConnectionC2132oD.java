package p000a;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* renamed from: a.oD */
/* loaded from: classes.dex */
public final class ServiceConnectionC2132oD extends AbstractQueuedSynchronizer implements ServiceConnection {

    /* renamed from: S */
    public static final ServiceConnectionC2132oD f6572S;

    static {
        ServiceConnectionC2132oD serviceConnectionC2132oD = new ServiceConnectionC2132oD();
        f6572S = serviceConnectionC2132oD;
        serviceConnectionC2132oD.setState(1);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0431IA c1282y0;
        InterfaceC1313Yb c0239ey;
        AbstractC1530cs.f4727z.mo1161z(new Object[0]);
        int i = BinderC1942kY.f6025R;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.topjohnwu.magisk.core.utils.IRootUtils");
        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0431IA)) {
            c1282y0 = (InterfaceC0431IA) queryLocalInterface;
        } else {
            c1282y0 = new C1282Y0(iBinder);
        }
        C0346Gc.f1165u = c1282y0;
        IBinder mo968e = c1282y0.mo968e();
        int i2 = BinderC0262F1.f926I;
        if (mo968e == null) {
            c0239ey = null;
        } else {
            IInterface queryLocalInterface2 = mo968e.queryLocalInterface("com.topjohnwu.superuser.internal.IFileSystemService");
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof InterfaceC1313Yb)) {
                c0239ey = (InterfaceC1313Yb) queryLocalInterface2;
            } else {
                c0239ey = new C0239EY(mo968e);
            }
        }
        if (c0239ey != null) {
            c0239ey.mo504r(new Binder());
            C0346Gc.f1164Q = new C0147Cr(c0239ey);
            releaseShared(1);
            return;
        }
        throw new IllegalArgumentException("The IBinder provided is invalid");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        setState(1);
        C0346Gc.f1165u = null;
        AbstractC1145VQ.m2353z(new Intent().setComponent(componentName), this);
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final int tryAcquireShared(int i) {
        return getState() == 0 ? 1 : -1;
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final boolean tryReleaseShared(int i) {
        int state;
        int i2;
        do {
            state = getState();
            if (state == 0) {
                return false;
            }
            i2 = state - 1;
        } while (!compareAndSetState(state, i2));
        return i2 == 0;
    }

    /* renamed from: z */
    public final void m3756z() {
        C1910jw c1910jw = C1910jw.f5967z;
        if (!C1910jw.f5958R) {
            return;
        }
        if (!AbstractC1292YB.m2640B()) {
            acquireSharedInterruptibly(1);
        } else if (getState() == 0) {
        } else {
            throw new IllegalStateException("Cannot await on the main thread");
        }
    }
}
