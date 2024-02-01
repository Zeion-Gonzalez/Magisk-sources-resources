package p000a;

import android.app.ActivityManager;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.Y0 */
/* loaded from: classes.dex */
public final class C1282Y0 implements InterfaceC0431IA {

    /* renamed from: S */
    public final IBinder f4117S;

    public C1282Y0(IBinder iBinder) {
        this.f4117S = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4117S;
    }

    @Override // p000a.InterfaceC0431IA
    /* renamed from: e */
    public final IBinder mo968e() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.magisk.core.utils.IRootUtils");
            this.f4117S.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readStrongBinder();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC0431IA
    /* renamed from: f */
    public final ActivityManager.RunningAppProcessInfo mo969f(int i) {
        Object obj;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.magisk.core.utils.IRootUtils");
            obtain.writeInt(i);
            this.f4117S.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            Parcelable.Creator creator = ActivityManager.RunningAppProcessInfo.CREATOR;
            if (obtain2.readInt() != 0) {
                obj = creator.createFromParcel(obtain2);
            } else {
                obj = null;
            }
            return (ActivityManager.RunningAppProcessInfo) obj;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
