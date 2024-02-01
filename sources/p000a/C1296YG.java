package p000a;

import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: a.YG */
/* loaded from: classes.dex */
public final class C1296YG implements InterfaceC2625xN {

    /* renamed from: S */
    public final IBinder f4151S;

    public C1296YG(IBinder iBinder) {
        this.f4151S = iBinder;
    }

    @Override // p000a.InterfaceC2625xN
    /* renamed from: J */
    public final void mo2700J(int i, ComponentName componentName) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IRootServiceManager");
            if (componentName != null) {
                obtain.writeInt(1);
                componentName.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            this.f4151S.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC2625xN
    /* renamed from: Y */
    public final IBinder mo2701Y(Intent intent) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IRootServiceManager");
            if (intent != null) {
                obtain.writeInt(1);
                intent.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f4151S.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4151S;
    }

    @Override // p000a.InterfaceC2625xN
    /* renamed from: w */
    public final void mo2702w(IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IRootServiceManager");
            obtain.writeStrongBinder(iBinder);
            this.f4151S.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC2625xN
    /* renamed from: z */
    public final void mo2703z(ComponentName componentName) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IRootServiceManager");
            if (componentName != null) {
                obtain.writeInt(1);
                componentName.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f4151S.transact(5, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
