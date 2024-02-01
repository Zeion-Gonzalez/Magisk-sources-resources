package p000a;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.system.OsConstants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: a.cr */
/* loaded from: classes.dex */
public final class C1529cr extends AbstractC1062Tx {

    /* renamed from: S */
    public final InterfaceC1313Yb f4724S;

    public C1529cr(InterfaceC1313Yb interfaceC1313Yb, String str) {
        super(str);
        this.f4724S = interfaceC1313Yb;
    }

    @Override // p000a.AbstractC1062Tx
    /* renamed from: N */
    public final OutputStream mo2221N() {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        try {
            try {
                this.f4724S.mo489M(getPath(), createPipe[0], false).m1573h();
                createPipe[0].close();
                return new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
            } catch (RemoteException e) {
                createPipe[1].close();
                throw new IOException(e);
            }
        } catch (Throwable th) {
            createPipe[0].close();
            throw th;
        }
    }

    @Override // p000a.AbstractC1062Tx
    /* renamed from: P */
    public final InputStream mo2222P() {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        try {
            try {
                this.f4724S.mo502o(getPath(), createPipe[1]).m1573h();
                createPipe[1].close();
                return new ParcelFileDescriptor.AutoCloseInputStream(createPipe[0]);
            } catch (RemoteException e) {
                createPipe[0].close();
                throw new IOException(e);
            }
        } catch (Throwable th) {
            createPipe[1].close();
            throw th;
        }
    }

    /* renamed from: Q */
    public final boolean m2973Q(int i) {
        try {
            return this.f4724S.mo495U(i, getPath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final boolean canExecute() {
        return m2973Q(OsConstants.X_OK);
    }

    @Override // java.io.File
    public final boolean canRead() {
        return m2973Q(OsConstants.R_OK);
    }

    @Override // java.io.File
    public final boolean canWrite() {
        return m2973Q(OsConstants.W_OK);
    }

    @Override // java.io.File
    public final boolean createNewFile() {
        try {
            C0676Mn mo500h = this.f4724S.mo500h(getPath());
            mo500h.m1573h();
            return ((Boolean) mo500h.f2229S).booleanValue();
        } catch (RemoteException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.File
    public final boolean delete() {
        try {
            return this.f4724S.mo497W(getPath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final void deleteOnExit() {
        throw new UnsupportedOperationException("deleteOnExit() is not supported in RemoteFile");
    }

    @Override // java.io.File
    public final boolean exists() {
        return m2973Q(OsConstants.F_OK);
    }

    @Override // java.io.File
    public final String getCanonicalPath() {
        try {
            C0676Mn mo496V = this.f4724S.mo496V(getPath());
            mo496V.m1573h();
            return (String) mo496V.f2229S;
        } catch (RemoteException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.File
    public final long getFreeSpace() {
        try {
            return this.f4724S.mo499g(getPath());
        } catch (RemoteException unused) {
            return 0L;
        }
    }

    @Override // java.io.File
    public final long getTotalSpace() {
        try {
            return this.f4724S.mo507v(getPath());
        } catch (RemoteException unused) {
            return 0L;
        }
    }

    @Override // java.io.File
    public final long getUsableSpace() {
        try {
            return this.f4724S.mo486G(getPath());
        } catch (RemoteException unused) {
            return 0L;
        }
    }

    @Override // p000a.AbstractC1062Tx
    /* renamed from: h */
    public final AbstractC1062Tx[] mo2223h(int i) {
        return new C1529cr[i];
    }

    @Override // java.io.File
    public final boolean isDirectory() {
        try {
            return this.f4724S.mo506u(getPath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final boolean isFile() {
        try {
            return this.f4724S.mo503q(getPath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final boolean isHidden() {
        try {
            return this.f4724S.mo490N(getPath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final long lastModified() {
        try {
            return this.f4724S.mo494S(getPath());
        } catch (RemoteException unused) {
            return Long.MIN_VALUE;
        }
    }

    @Override // java.io.File
    public final long length() {
        try {
            return this.f4724S.mo485E(getPath());
        } catch (RemoteException unused) {
            return 0L;
        }
    }

    @Override // java.io.File
    public final String[] list() {
        try {
            return this.f4724S.mo501k(getPath());
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // java.io.File
    public final boolean mkdir() {
        try {
            return this.f4724S.mo498c(getPath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final boolean mkdirs() {
        try {
            return this.f4724S.mo493R(getPath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final boolean renameTo(File file) {
        try {
            return this.f4724S.mo491P(getPath(), file.getAbsolutePath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final boolean setExecutable(boolean z, boolean z2) {
        try {
            return this.f4724S.mo508y(getPath(), z, z2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final boolean setLastModified(long j) {
        try {
            return this.f4724S.mo488I(j, getPath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final boolean setReadOnly() {
        try {
            return this.f4724S.mo505s(getPath());
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final boolean setReadable(boolean z, boolean z2) {
        try {
            return this.f4724S.mo487H(getPath(), z, z2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // java.io.File
    public final boolean setWritable(boolean z, boolean z2) {
        try {
            return this.f4724S.mo492Q(getPath(), z, z2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // p000a.AbstractC1062Tx
    /* renamed from: v */
    public final AbstractC1062Tx mo2224v(String str) {
        return new C1529cr(this.f4724S, getPath(), str);
    }

    @Override // p000a.AbstractC1062Tx
    /* renamed from: z */
    public final AbstractC1062Tx mo2225z(String str) {
        return new C1529cr(this.f4724S, str);
    }

    public C1529cr(InterfaceC1313Yb interfaceC1313Yb, String str, String str2) {
        super(str, str2);
        this.f4724S = interfaceC1313Yb;
    }
}
