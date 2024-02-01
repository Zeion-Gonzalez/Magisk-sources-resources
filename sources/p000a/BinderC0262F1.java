package p000a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.SparseArray;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: a.F1 */
/* loaded from: classes.dex */
public final class BinderC0262F1 extends Binder implements InterfaceC1313Yb {

    /* renamed from: I */
    public static final /* synthetic */ int f926I = 0;

    /* renamed from: R */
    public final C0073BQ f927R;

    /* renamed from: S */
    public final C1797hp f928S;

    /* renamed from: w */
    public final ExecutorService f929w;

    public BinderC0262F1() {
        attachInterface(this, "com.topjohnwu.superuser.internal.IFileSystemService");
        this.f928S = new C1797hp();
        this.f927R = new C0073BQ(5);
        this.f929w = Executors.newCachedThreadPool();
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: E */
    public final long mo485E(String str) {
        return ((File) this.f928S.get(str)).length();
    }

    /* renamed from: F */
    public final C0676Mn m559F(int i, int i2, long j) {
        long lseek;
        try {
            C2654y3 m156v = this.f927R.m156v(i);
            synchronized (m156v) {
                FileDescriptor fileDescriptor = m156v.f8271S;
                if (fileDescriptor != null) {
                    lseek = Os.lseek(fileDescriptor, j, i2);
                } else {
                    throw new ClosedChannelException();
                }
            }
            return new C0676Mn(Long.valueOf(lseek));
        } catch (ErrnoException | IOException e) {
            return new C0676Mn(e);
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: G */
    public final long mo486G(String str) {
        return ((File) this.f928S.get(str)).getUsableSpace();
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: H */
    public final boolean mo487H(String str, boolean z, boolean z2) {
        return ((File) this.f928S.get(str)).setReadable(z, z2);
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: I */
    public final boolean mo488I(long j, String str) {
        return ((File) this.f928S.get(str)).setLastModified(j);
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: M */
    public final C0676Mn mo489M(String str, ParcelFileDescriptor parcelFileDescriptor, boolean z) {
        C2654y3 c2654y3 = new C2654y3();
        try {
            c2654y3.f8271S = Os.open(str, (z ? OsConstants.O_APPEND : OsConstants.O_TRUNC) | OsConstants.O_CREAT | OsConstants.O_WRONLY, 438);
            this.f929w.execute(new RunnableC0720NY(c2654y3, parcelFileDescriptor, 0));
            return new C0676Mn();
        } catch (ErrnoException e) {
            c2654y3.close();
            return new C0676Mn(e);
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: N */
    public final boolean mo490N(String str) {
        return ((File) this.f928S.get(str)).isHidden();
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: P */
    public final boolean mo491P(String str, String str2) {
        C1797hp c1797hp = this.f928S;
        return ((File) c1797hp.get(str)).renameTo((File) c1797hp.get(str2));
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: Q */
    public final boolean mo492Q(String str, boolean z, boolean z2) {
        return ((File) this.f928S.get(str)).setWritable(z, z2);
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: R */
    public final boolean mo493R(String str) {
        return ((File) this.f928S.get(str)).mkdirs();
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: S */
    public final long mo494S(String str) {
        return ((File) this.f928S.get(str)).lastModified();
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: U */
    public final boolean mo495U(int i, String str) {
        try {
            return Os.access(str, i);
        } catch (ErrnoException unused) {
            return false;
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: V */
    public final C0676Mn mo496V(String str) {
        try {
            return new C0676Mn(((File) this.f928S.get(str)).getCanonicalPath());
        } catch (IOException e) {
            return new C0676Mn(e);
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: W */
    public final boolean mo497W(String str) {
        return ((File) this.f928S.get(str)).delete();
    }

    /* renamed from: X */
    public final C0676Mn m560X(int i, long j) {
        try {
            C2654y3 m156v = this.f927R.m156v(i);
            synchronized (m156v) {
                FileDescriptor fileDescriptor = m156v.f8271S;
                if (fileDescriptor != null) {
                    Os.ftruncate(fileDescriptor, j);
                } else {
                    throw new ClosedChannelException();
                }
            }
            return new C0676Mn();
        } catch (ErrnoException | IOException e) {
            return new C0676Mn(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    /* renamed from: Z */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C0676Mn mo496V;
        long mo494S;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        C0676Mn c0676Mn;
        C2654y3 c2654y3;
        C0676Mn c0676Mn2;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("com.topjohnwu.superuser.internal.IFileSystemService");
        }
        if (i != 1598968902) {
            boolean z4 = false;
            int i4 = 0;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            switch (i) {
                case 1:
                    mo496V = mo496V(parcel.readString());
                    parcel2.writeNoException();
                    AbstractC0438II.m1052z(parcel2, mo496V, 1);
                    break;
                case 2:
                    i3 = mo506u(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 3:
                    i3 = mo503q(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 4:
                    i3 = mo490N(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 5:
                    mo494S = mo494S(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeLong(mo494S);
                    break;
                case 6:
                    mo494S = mo485E(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeLong(mo494S);
                    break;
                case 7:
                    mo496V = mo500h(parcel.readString());
                    parcel2.writeNoException();
                    AbstractC0438II.m1052z(parcel2, mo496V, 1);
                    break;
                case 8:
                    i3 = mo497W(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 9:
                    String[] mo501k = mo501k(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStringArray(mo501k);
                    break;
                case 10:
                    i3 = mo498c(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 11:
                    i3 = mo493R(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 12:
                    i3 = mo491P(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 13:
                    i3 = mo488I(parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 14:
                    i3 = mo505s(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 15:
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    }
                    i3 = mo492Q(readString, z, z4);
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 16:
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z9 = true;
                    }
                    i3 = mo487H(readString2, z2, z9);
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 17:
                    String readString3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z8 = true;
                    }
                    i3 = mo508y(readString3, z3, z8);
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 18:
                    i3 = mo495U(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 19:
                    mo494S = mo507v(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeLong(mo494S);
                    break;
                case 20:
                    mo494S = mo499g(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeLong(mo494S);
                    break;
                case 21:
                    mo494S = mo486G(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeLong(mo494S);
                    break;
                case 22:
                    try {
                        i4 = Os.lstat(parcel.readString()).st_mode;
                    } catch (ErrnoException unused) {
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(i4);
                    break;
                case 23:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z7 = true;
                    }
                    try {
                        if (z7) {
                            Os.symlink(readString5, readString4);
                        } else {
                            Os.link(readString5, readString4);
                        }
                        mo496V = new C0676Mn(Boolean.TRUE);
                    } catch (ErrnoException e) {
                        if (e.errno == OsConstants.EEXIST) {
                            mo496V = new C0676Mn(Boolean.FALSE);
                        } else {
                            c0676Mn = new C0676Mn(e);
                            mo496V = c0676Mn;
                        }
                    }
                    parcel2.writeNoException();
                    AbstractC0438II.m1052z(parcel2, mo496V, 1);
                    break;
                case 24:
                    mo504r(parcel.readStrongBinder());
                    break;
                case 25:
                    String readString6 = parcel.readString();
                    int readInt = parcel.readInt();
                    String readString7 = parcel.readString();
                    C2654y3 c2654y32 = new C2654y3();
                    try {
                        c2654y32.f8271S = Os.open(readString6, readInt | OsConstants.O_NONBLOCK, 438);
                        c2654y32.f8270R = Os.open(readString7, OsConstants.O_RDONLY | OsConstants.O_NONBLOCK, 0);
                        c2654y32.f8273w = Os.open(readString7, OsConstants.O_WRONLY | OsConstants.O_NONBLOCK, 0);
                        mo496V = new C0676Mn(Integer.valueOf(this.f927R.m154Q(c2654y32)));
                    } catch (ErrnoException e2) {
                        c2654y32.close();
                        c0676Mn = new C0676Mn(e2);
                        mo496V = c0676Mn;
                        parcel2.writeNoException();
                        AbstractC0438II.m1052z(parcel2, mo496V, 1);
                        return true;
                    }
                    parcel2.writeNoException();
                    AbstractC0438II.m1052z(parcel2, mo496V, 1);
                case 26:
                    mo496V = mo502o(parcel.readString(), (ParcelFileDescriptor) AbstractC0438II.m1048v(parcel, ParcelFileDescriptor.CREATOR));
                    parcel2.writeNoException();
                    AbstractC0438II.m1052z(parcel2, mo496V, 1);
                    break;
                case 27:
                    String readString8 = parcel.readString();
                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC0438II.m1048v(parcel, ParcelFileDescriptor.CREATOR);
                    if (parcel.readInt() != 0) {
                        z6 = true;
                    }
                    mo496V = mo489M(readString8, parcelFileDescriptor, z6);
                    parcel2.writeNoException();
                    AbstractC0438II.m1052z(parcel2, mo496V, 1);
                    break;
                case 28:
                    int readInt2 = parcel.readInt();
                    C0073BQ c0073bq = this.f927R;
                    synchronized (c0073bq) {
                        SparseArray sparseArray = (SparseArray) ((SparseArray) c0073bq.f309R).get(Binder.getCallingPid());
                        if (sparseArray != null && (c2654y3 = (C2654y3) sparseArray.get(readInt2)) != null) {
                            sparseArray.remove(readInt2);
                            synchronized (c2654y3) {
                                c2654y3.close();
                            }
                        }
                        break;
                    }
                case 29:
                    try {
                        c0676Mn2 = new C0676Mn(Integer.valueOf(this.f927R.m156v(parcel.readInt()).m4560z(parcel.readInt(), parcel.readLong())));
                    } catch (ErrnoException | IOException e3) {
                        c0676Mn2 = new C0676Mn(e3);
                    }
                    parcel2.writeNoException();
                    AbstractC0438II.m1052z(parcel2, c0676Mn2, 1);
                    break;
                case 30:
                    try {
                        this.f927R.m156v(parcel.readInt()).m4559h(parcel.readInt(), parcel.readLong(), true);
                        mo496V = new C0676Mn();
                    } catch (ErrnoException | IOException e4) {
                        c0676Mn = new C0676Mn(e4);
                        mo496V = c0676Mn;
                        parcel2.writeNoException();
                        AbstractC0438II.m1052z(parcel2, mo496V, 1);
                        return true;
                    }
                    parcel2.writeNoException();
                    AbstractC0438II.m1052z(parcel2, mo496V, 1);
                case 31:
                    mo496V = m559F(parcel.readInt(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    AbstractC0438II.m1052z(parcel2, mo496V, 1);
                    break;
                case 32:
                    try {
                        c0676Mn2 = new C0676Mn(Long.valueOf(this.f927R.m156v(parcel.readInt()).m4557G()));
                    } catch (ErrnoException | IOException e5) {
                        c0676Mn2 = new C0676Mn(e5);
                    }
                    parcel2.writeNoException();
                    AbstractC0438II.m1052z(parcel2, c0676Mn2, 1);
                    break;
                case 33:
                    mo496V = m560X(parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    AbstractC0438II.m1052z(parcel2, mo496V, 1);
                    break;
                case 34:
                    int readInt3 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z5 = true;
                    }
                    try {
                        this.f927R.m156v(readInt3).m4558V(z5);
                        mo496V = new C0676Mn();
                    } catch (ErrnoException | IOException e6) {
                        c0676Mn = new C0676Mn(e6);
                        mo496V = c0676Mn;
                        parcel2.writeNoException();
                        AbstractC0438II.m1052z(parcel2, mo496V, 1);
                        return true;
                    }
                    parcel2.writeNoException();
                    AbstractC0438II.m1052z(parcel2, mo496V, 1);
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }
        parcel2.writeString("com.topjohnwu.superuser.internal.IFileSystemService");
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: c */
    public final boolean mo498c(String str) {
        return ((File) this.f928S.get(str)).mkdir();
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: g */
    public final long mo499g(String str) {
        return ((File) this.f928S.get(str)).getFreeSpace();
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: h */
    public final C0676Mn mo500h(String str) {
        try {
            return new C0676Mn(Boolean.valueOf(((File) this.f928S.get(str)).createNewFile()));
        } catch (IOException e) {
            return new C0676Mn(e);
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: k */
    public final String[] mo501k(String str) {
        return ((File) this.f928S.get(str)).list();
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: o */
    public final C0676Mn mo502o(String str, ParcelFileDescriptor parcelFileDescriptor) {
        C2654y3 c2654y3 = new C2654y3();
        try {
            c2654y3.f8271S = Os.open(str, OsConstants.O_RDONLY, 0);
            this.f929w.execute(new RunnableC0720NY(c2654y3, parcelFileDescriptor, 1));
            return new C0676Mn();
        } catch (ErrnoException e) {
            c2654y3.close();
            return new C0676Mn(e);
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: q */
    public final boolean mo503q(String str) {
        return ((File) this.f928S.get(str)).isFile();
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: r */
    public final void mo504r(IBinder iBinder) {
        final int callingPid = Binder.getCallingPid();
        try {
            iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: a.Cn
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    BinderC0262F1 binderC0262F1 = BinderC0262F1.this;
                    int i = callingPid;
                    C0073BQ c0073bq = binderC0262F1.f927R;
                    synchronized (c0073bq) {
                        SparseArray sparseArray = (SparseArray) ((SparseArray) c0073bq.f309R).get(i);
                        if (sparseArray != null) {
                            ((SparseArray) c0073bq.f309R).remove(i);
                            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                                ((C2654y3) sparseArray.valueAt(i2)).close();
                            }
                        }
                    }
                }
            }, 0);
        } catch (RemoteException unused) {
        }
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: s */
    public final boolean mo505s(String str) {
        return ((File) this.f928S.get(str)).setReadOnly();
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: u */
    public final boolean mo506u(String str) {
        return ((File) this.f928S.get(str)).isDirectory();
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: v */
    public final long mo507v(String str) {
        return ((File) this.f928S.get(str)).getTotalSpace();
    }

    @Override // p000a.InterfaceC1313Yb
    /* renamed from: y */
    public final boolean mo508y(String str, boolean z, boolean z2) {
        return ((File) this.f928S.get(str)).setExecutable(z, z2);
    }
}
