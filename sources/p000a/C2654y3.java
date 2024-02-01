package p000a;

import android.os.Build;
import android.system.ErrnoException;
import android.system.Int64Ref;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import android.util.MutableLong;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;

/* renamed from: a.y3 */
/* loaded from: classes.dex */
public final class C2654y3 implements Closeable {

    /* renamed from: I */
    public ByteBuffer f8269I;

    /* renamed from: R */
    public FileDescriptor f8270R;

    /* renamed from: S */
    public FileDescriptor f8271S;

    /* renamed from: q */
    public StructStat f8272q;

    /* renamed from: w */
    public FileDescriptor f8273w;

    /* renamed from: G */
    public final synchronized long m4557G() {
        long lseek;
        FileDescriptor fileDescriptor = this.f8271S;
        if (fileDescriptor != null) {
            long lseek2 = Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            Os.lseek(this.f8271S, 0L, OsConstants.SEEK_END);
            lseek = Os.lseek(this.f8271S, 0L, OsConstants.SEEK_CUR);
            Os.lseek(this.f8271S, lseek2, OsConstants.SEEK_SET);
        } else {
            throw new ClosedChannelException();
        }
        return lseek;
    }

    /* renamed from: V */
    public final synchronized void m4558V(boolean z) {
        FileDescriptor fileDescriptor = this.f8271S;
        if (fileDescriptor != null) {
            if (z) {
                Os.fsync(fileDescriptor);
            } else {
                Os.fdatasync(fileDescriptor);
            }
        } else {
            throw new ClosedChannelException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        FileDescriptor fileDescriptor = this.f8271S;
        if (fileDescriptor != null) {
            try {
                Os.close(fileDescriptor);
            } catch (ErrnoException unused) {
            }
            this.f8271S = null;
        }
        FileDescriptor fileDescriptor2 = this.f8270R;
        if (fileDescriptor2 != null) {
            try {
                Os.close(fileDescriptor2);
            } catch (ErrnoException unused2) {
            }
            this.f8270R = null;
        }
        FileDescriptor fileDescriptor3 = this.f8273w;
        if (fileDescriptor3 != null) {
            try {
                Os.close(fileDescriptor3);
            } catch (ErrnoException unused3) {
            }
            this.f8273w = null;
        }
    }

    /* renamed from: h */
    public final synchronized int m4559h(int i, long j, boolean z) {
        int read;
        Int64Ref m455N;
        if (this.f8271S != null && this.f8270R != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                if (j < 0) {
                    m455N = null;
                } else {
                    AbstractC0232EQ.m454M();
                    m455N = AbstractC0232EQ.m455N(j);
                }
                if (z) {
                    int i2 = i;
                    while (i2 > 0) {
                        long j2 = i2;
                        i2 = (int) (j2 - AbstractC1244XD.m2551P(this.f8270R, null, this.f8271S, m455N, j2));
                    }
                    return i;
                }
                return (int) AbstractC1244XD.m2551P(this.f8270R, null, this.f8271S, m455N, i);
            }
            if (this.f8269I == null) {
                this.f8269I = ByteBuffer.allocateDirect(65536);
            }
            this.f8269I.clear();
            ByteBuffer byteBuffer = this.f8269I;
            byteBuffer.limit(i);
            if (z) {
                read = 0;
                while (i > read) {
                    read += Os.read(this.f8270R, byteBuffer);
                }
            } else {
                read = Os.read(this.f8270R, byteBuffer);
            }
            byteBuffer.flip();
            int i3 = read;
            while (i3 > 0) {
                if (j < 0) {
                    i3 -= Os.write(this.f8271S, byteBuffer);
                } else {
                    int pwrite = Os.pwrite(this.f8271S, byteBuffer, j);
                    i3 -= pwrite;
                    j += pwrite;
                }
            }
            return read;
        }
        throw new ClosedChannelException();
    }

    /* renamed from: z */
    public final synchronized int m4560z(int i, long j) {
        long m2553v;
        FileDescriptor fileDescriptor = this.f8271S;
        if (fileDescriptor != null && this.f8273w != null) {
            MutableLong mutableLong = null;
            Int64Ref m455N = null;
            if (Build.VERSION.SDK_INT >= 28) {
                if (j >= 0) {
                    AbstractC0232EQ.m454M();
                    m455N = AbstractC0232EQ.m455N(j);
                }
                m2553v = AbstractC1244XD.m2551P(this.f8271S, m455N, this.f8273w, null, i);
            } else {
                if (this.f8272q == null) {
                    this.f8272q = Os.fstat(fileDescriptor);
                }
                StructStat structStat = this.f8272q;
                if (!OsConstants.S_ISREG(structStat.st_mode) && !OsConstants.S_ISBLK(structStat.st_mode)) {
                    if (this.f8269I == null) {
                        this.f8269I = ByteBuffer.allocateDirect(65536);
                    }
                    this.f8269I.clear();
                    ByteBuffer byteBuffer = this.f8269I;
                    byteBuffer.limit(Math.min(i, byteBuffer.capacity()));
                    if (j < 0) {
                        Os.read(this.f8271S, byteBuffer);
                    } else {
                        Os.pread(this.f8271S, byteBuffer, j);
                    }
                    byteBuffer.flip();
                    m2553v = byteBuffer.remaining();
                    int i2 = (int) m2553v;
                    while (i2 > 0) {
                        i2 -= Os.write(this.f8273w, byteBuffer);
                    }
                }
                if (j >= 0) {
                    mutableLong = new MutableLong(j);
                }
                m2553v = AbstractC1244XD.m2553v(this.f8273w, this.f8271S, mutableLong, i);
            }
        } else {
            throw new ClosedChannelException();
        }
        return (int) m2553v;
    }
}
