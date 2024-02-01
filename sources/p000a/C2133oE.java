package p000a;

import java.io.EOFException;
import java.io.InputStream;

/* renamed from: a.oE */
/* loaded from: classes.dex */
public final class C2133oE extends AbstractC1405aM {

    /* renamed from: I */
    public int f6573I;

    /* renamed from: k */
    public boolean f6574k;

    /* renamed from: q */
    public boolean f6575q;

    /* renamed from: w */
    public int f6576w;

    public C2133oE(InputStream inputStream, int i) {
        super(inputStream, i);
        this.f6575q = false;
        this.f6574k = true;
        this.f6576w = inputStream.read();
        int read = inputStream.read();
        this.f6573I = read;
        if (read < 0) {
            throw new EOFException();
        }
        m3757h();
    }

    /* renamed from: h */
    public final boolean m3757h() {
        if (!this.f6575q && this.f6574k && this.f6576w == 0 && this.f6573I == 0) {
            this.f6575q = true;
            m2825z();
        }
        return this.f6575q;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (m3757h()) {
            return -1;
        }
        int read = this.f4419S.read();
        if (read < 0) {
            throw new EOFException();
        }
        int i = this.f6576w;
        this.f6576w = this.f6573I;
        this.f6573I = read;
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f6574k || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.f6575q) {
            return -1;
        }
        InputStream inputStream = this.f4419S;
        int read = inputStream.read(bArr, i + 2, i2 - 2);
        if (read < 0) {
            throw new EOFException();
        }
        bArr[i] = (byte) this.f6576w;
        bArr[i + 1] = (byte) this.f6573I;
        this.f6576w = inputStream.read();
        int read2 = inputStream.read();
        this.f6573I = read2;
        if (read2 >= 0) {
            return read + 2;
        }
        throw new EOFException();
    }
}
