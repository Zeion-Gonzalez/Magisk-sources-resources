package p000a;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: a.q4 */
/* loaded from: classes.dex */
public final class C2232q4 extends FilterInputStream {

    /* renamed from: R */
    public long f6879R;

    /* renamed from: S */
    public final InterfaceC2364sT f6880S;

    /* renamed from: w */
    public long f6881w;

    public C2232q4(InputStream inputStream, C1207WZ c1207wz) {
        super(inputStream);
        this.f6880S = c1207wz;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.f6880S.mo85W(Long.valueOf(this.f6879R));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = read();
        if (read >= 0) {
            this.f6879R++;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f6881w > 1000) {
                this.f6881w = currentTimeMillis;
                this.f6880S.mo85W(Long.valueOf(this.f6879R));
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.f6879R += read;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f6881w > 1000) {
                this.f6881w = currentTimeMillis;
                this.f6880S.mo85W(Long.valueOf(this.f6879R));
            }
        }
        return read;
    }
}
