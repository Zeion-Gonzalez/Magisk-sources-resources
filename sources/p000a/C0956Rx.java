package p000a;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: a.Rx */
/* loaded from: classes.dex */
public final class C0956Rx extends OutputStream {

    /* renamed from: I */
    public C2627xS f3257I;

    /* renamed from: S */
    public final OutputStream f3259S;

    /* renamed from: R */
    public long f3258R = 0;

    /* renamed from: w */
    public long f3260w = 0;

    public C0956Rx(OutputStream outputStream) {
        this.f3259S = outputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m2115z();
        write(new byte[1024]);
        this.f3259S.close();
    }

    /* renamed from: h */
    public final void m2114h(C2627xS c2627xS) {
        m2115z();
        byte[] bArr = new byte[512];
        C2210pd c2210pd = c2627xS.f8148z;
        int m1044r = AbstractC0438II.m1044r(AbstractC0438II.m1044r(AbstractC0438II.m1044r(AbstractC0438II.m1044r(AbstractC0438II.m1044r(C2210pd.m3852z(c2210pd.f6796z, bArr, 0, 100), 8, c2210pd.f6792h, bArr), 8, c2210pd.f6795v, bArr), 8, c2210pd.f6788P, bArr), 12, c2210pd.f6787N, bArr), 12, c2210pd.f6789Q, bArr);
        int i = m1044r + 8;
        Arrays.fill(bArr, m1044r, i, (byte) 32);
        bArr[i] = c2210pd.f6794u;
        for (int m3852z = C2210pd.m3852z(c2210pd.f6790V, bArr, C2210pd.m3852z(c2210pd.f6786M, bArr, C2210pd.m3852z(c2210pd.f6785G, bArr, C2210pd.m3852z(c2210pd.f6791W, bArr, C2210pd.m3852z(c2210pd.f6793o, bArr, i + 1, 100), 8), 32), 32) + 16, 155); m3852z < 512; m3852z++) {
            bArr[m3852z] = 0;
        }
        long j = 0;
        for (int i2 = 0; i2 < 512; i2++) {
            j += bArr[i2] & 255;
        }
        AbstractC0438II.m1044r(m1044r, 7, j, bArr);
        bArr[i - 1] = 32;
        write(bArr);
        this.f3257I = c2627xS;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f3259S.write(i);
        this.f3258R++;
        if (this.f3257I != null) {
            this.f3260w++;
        }
    }

    /* renamed from: z */
    public final void m2115z() {
        int i;
        C2627xS c2627xS = this.f3257I;
        if (c2627xS != null) {
            if (c2627xS.f8148z.f6787N <= this.f3260w) {
                this.f3257I = null;
                this.f3260w = 0L;
                long j = this.f3258R;
                if (j > 0 && (i = (int) (j % 512)) > 0) {
                    write(new byte[512 - i]);
                    return;
                }
                return;
            }
            throw new IOException("The current entry[" + this.f3257I.m4525z() + "] of size[" + this.f3257I.f8148z.f6787N + "] has not been fully written.");
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        C2627xS c2627xS = this.f3257I;
        if (c2627xS != null) {
            C2210pd c2210pd = c2627xS.f8148z;
            if (!(c2210pd != null && (c2210pd.f6794u == 53 || c2210pd.f6796z.toString().endsWith("/")))) {
                long j = i2;
                if (this.f3257I.f8148z.f6787N < this.f3260w + j) {
                    throw new IOException("The current entry[" + this.f3257I.m4525z() + "] size[" + this.f3257I.f8148z.f6787N + "] is smaller than the bytes[" + (this.f3260w + j) + "] being written.");
                }
            }
        }
        this.f3259S.write(bArr, i, i2);
        long j2 = i2;
        this.f3258R += j2;
        if (this.f3257I != null) {
            this.f3260w += j2;
        }
    }
}
