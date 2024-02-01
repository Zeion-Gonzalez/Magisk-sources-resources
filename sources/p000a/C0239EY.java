package p000a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: a.EY */
/* loaded from: classes.dex */
public final class C0239EY implements InterfaceC1313Yb {

    /* renamed from: S */
    public final IBinder f821S;

    public C0239EY(IBinder iBinder) {
        this.f821S = iBinder;
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: E */
    public final long mo485E(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            this.f821S.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readLong();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: G */
    public final long mo486G(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            this.f821S.transact(21, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readLong();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: H */
    public final boolean mo487H(String str, boolean z, boolean z2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(z2 ? 1 : 0);
            this.f821S.transact(16, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: I */
    public final boolean mo488I(long j, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            obtain.writeLong(j);
            this.f821S.transact(13, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: M */
    public final C0676Mn mo489M(String str, ParcelFileDescriptor parcelFileDescriptor, boolean z) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            AbstractC0438II.m1052z(obtain, parcelFileDescriptor, 0);
            obtain.writeInt(z ? 1 : 0);
            this.f821S.transact(27, obtain, obtain2, 0);
            obtain2.readException();
            return (C0676Mn) AbstractC0438II.m1048v(obtain2, C0676Mn.f2228w);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: N */
    public final boolean mo490N(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            this.f821S.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: P */
    public final boolean mo491P(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f821S.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: Q */
    public final boolean mo492Q(String str, boolean z, boolean z2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(z2 ? 1 : 0);
            this.f821S.transact(15, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: R */
    public final boolean mo493R(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            this.f821S.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: S */
    public final long mo494S(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            this.f821S.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readLong();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: U */
    public final boolean mo495U(int i, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            obtain.writeInt(i);
            this.f821S.transact(18, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: V */
    public final C0676Mn mo496V(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            this.f821S.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return (C0676Mn) AbstractC0438II.m1048v(obtain2, C0676Mn.f2228w);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: W */
    public final boolean mo497W(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            this.f821S.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f821S;
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: c */
    public final boolean mo498c(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            this.f821S.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: g */
    public final long mo499g(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            this.f821S.transact(20, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readLong();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: h */
    public final C0676Mn mo500h(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            this.f821S.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return (C0676Mn) AbstractC0438II.m1048v(obtain2, C0676Mn.f2228w);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: k */
    public final String[] mo501k(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            this.f821S.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createStringArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: o */
    public final C0676Mn mo502o(String str, ParcelFileDescriptor parcelFileDescriptor) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            AbstractC0438II.m1052z(obtain, parcelFileDescriptor, 0);
            this.f821S.transact(26, obtain, obtain2, 0);
            obtain2.readException();
            return (C0676Mn) AbstractC0438II.m1048v(obtain2, C0676Mn.f2228w);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: q */
    public final boolean mo503q(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            this.f821S.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: r */
    public final void mo504r(IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeStrongBinder(iBinder);
            this.f821S.transact(24, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: s */
    public final boolean mo505s(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            this.f821S.transact(14, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: u */
    public final boolean mo506u(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            this.f821S.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: v */
    public final long mo507v(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            this.f821S.transact(19, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readLong();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: y */
    public final boolean mo508y(String str, boolean z, boolean z2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            obtain.writeString(str);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(z2 ? 1 : 0);
            this.f821S.transact(17, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
