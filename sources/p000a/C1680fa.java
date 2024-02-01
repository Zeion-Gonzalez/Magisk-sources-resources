package p000a;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* renamed from: a.fa */
/* loaded from: classes.dex */
public final class C1680fa extends FilterInputStream {

    /* renamed from: R */
    public long f5267R;

    /* renamed from: S */
    public C2627xS f5268S;

    /* renamed from: w */
    public long f5269w;

    public C1680fa(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
        this.f5267R = 0L;
        this.f5269w = 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        return read != -1 ? bArr[0] & 255 : read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        byte[] bArr = new byte[2048];
        long j2 = j;
        while (j2 > 0) {
            int read = read(bArr, 0, (int) (j2 < 2048 ? j2 : 2048L));
            if (read < 0) {
                break;
            }
            j2 -= read;
        }
        return j - j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C2627xS c2627xS = this.f5268S;
        if (c2627xS != null) {
            long j = this.f5267R;
            long j2 = c2627xS.f8148z.f6787N;
            if (j == j2) {
                return -1;
            }
            if (j2 - j < i2) {
                i2 = (int) (j2 - j);
            }
        }
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            if (this.f5268S != null) {
                this.f5267R += read;
            }
            this.f5269w += read;
        }
        return read;
    }
}
