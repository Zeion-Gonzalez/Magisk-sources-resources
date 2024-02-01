package p000a;

import android.app.ActivityManager;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: a.kY */
/* loaded from: classes.dex */
public final class BinderC1942kY extends Binder implements InterfaceC0431IA {

    /* renamed from: R */
    public static final /* synthetic */ int f6025R = 0;

    /* renamed from: S */
    public final /* synthetic */ C0346Gc f6026S;

    public BinderC1942kY(C0346Gc c0346Gc) {
        this.f6026S = c0346Gc;
        attachInterface(this, "com.topjohnwu.magisk.core.utils.IRootUtils");
    }

    @Override // android.os.Binder
    /* renamed from: X */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("com.topjohnwu.magisk.core.utils.IRootUtils");
        }
        if (i != 1598968902) {
            if (i != 1) {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                IBinder mo968e = mo968e();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(mo968e);
            } else {
                ActivityManager.RunningAppProcessInfo mo969f = mo969f(parcel.readInt());
                parcel2.writeNoException();
                if (mo969f != null) {
                    parcel2.writeInt(1);
                    mo969f.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
            }
            return true;
        }
        parcel2.writeString("com.topjohnwu.magisk.core.utils.IRootUtils");
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // p000a.InterfaceC0431IA
    /* renamed from: e */
    public final IBinder mo968e() {
        BinderC0262F1 binderC0262F1;
        synchronized (AbstractC1026TE.class) {
            if (AbstractC1026TE.f3429h == null) {
                AbstractC1026TE.f3429h = new BinderC0262F1();
            }
            binderC0262F1 = AbstractC1026TE.f3429h;
        }
        return binderC0262F1;
    }

    @Override // p000a.InterfaceC0431IA
    /* renamed from: f */
    public final ActivityManager.RunningAppProcessInfo mo969f(int i) {
        ActivityManager.RunningAppProcessInfo m746E;
        try {
            m746E = this.f6026S.m746E(i);
            return m746E;
        } catch (Throwable th) {
            AbstractC1530cs.f4727z.mo1160v(th);
            return null;
        }
    }
}
