package p000a;

import java.util.zip.Inflater;

/* renamed from: a.La */
/* loaded from: classes.dex */
public final class C0616La implements InterfaceC0984SS {

    /* renamed from: I */
    public boolean f2020I;

    /* renamed from: R */
    public final Inflater f2021R;

    /* renamed from: S */
    public final InterfaceC0694N7 f2022S;

    /* renamed from: w */
    public int f2023w;

    public C0616La(C2323ri c2323ri, Inflater inflater) {
        this.f2022S = c2323ri;
        this.f2021R = inflater;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0084  */
    @Override // p000a.InterfaceC0984SS
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo188M(p000a.C2361sQ r10, long r11) {
        /*
            r9 = this;
        L0:
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r3 = 1
            if (r2 < 0) goto L9
            r4 = r3
            goto La
        L9:
            r4 = 0
        La:
            if (r4 == 0) goto Lb7
            boolean r4 = r9.f2020I
            r4 = r4 ^ r3
            if (r4 == 0) goto Lab
            a.N7 r4 = r9.f2022S
            java.util.zip.Inflater r5 = r9.f2021R
            if (r2 != 0) goto L18
            goto L7e
        L18:
            a.gk r2 = r10.m4081d2(r3)     // Catch: java.util.zip.DataFormatException -> La4
            int r3 = r2.f5482v     // Catch: java.util.zip.DataFormatException -> La4
            int r3 = 8192 - r3
            long r6 = (long) r3     // Catch: java.util.zip.DataFormatException -> La4
            long r6 = java.lang.Math.min(r11, r6)     // Catch: java.util.zip.DataFormatException -> La4
            int r3 = (int) r6     // Catch: java.util.zip.DataFormatException -> La4
            boolean r6 = r5.needsInput()     // Catch: java.util.zip.DataFormatException -> La4
            if (r6 != 0) goto L2d
            goto L46
        L2d:
            boolean r6 = r4.mo1626b()     // Catch: java.util.zip.DataFormatException -> La4
            if (r6 == 0) goto L34
            goto L46
        L34:
            a.sQ r6 = r4.mo1634v()     // Catch: java.util.zip.DataFormatException -> La4
            a.gk r6 = r6.f7261S     // Catch: java.util.zip.DataFormatException -> La4
            int r7 = r6.f5482v     // Catch: java.util.zip.DataFormatException -> La4
            int r8 = r6.f5480h     // Catch: java.util.zip.DataFormatException -> La4
            int r7 = r7 - r8
            r9.f2023w = r7     // Catch: java.util.zip.DataFormatException -> La4
            byte[] r6 = r6.f5483z     // Catch: java.util.zip.DataFormatException -> La4
            r5.setInput(r6, r8, r7)     // Catch: java.util.zip.DataFormatException -> La4
        L46:
            byte[] r6 = r2.f5483z     // Catch: java.util.zip.DataFormatException -> La4
            int r7 = r2.f5482v     // Catch: java.util.zip.DataFormatException -> La4
            int r3 = r5.inflate(r6, r7, r3)     // Catch: java.util.zip.DataFormatException -> La4
            int r6 = r9.f2023w     // Catch: java.util.zip.DataFormatException -> La4
            if (r6 != 0) goto L53
            goto L61
        L53:
            int r7 = r5.getRemaining()     // Catch: java.util.zip.DataFormatException -> La4
            int r6 = r6 - r7
            int r7 = r9.f2023w     // Catch: java.util.zip.DataFormatException -> La4
            int r7 = r7 - r6
            r9.f2023w = r7     // Catch: java.util.zip.DataFormatException -> La4
            long r6 = (long) r6     // Catch: java.util.zip.DataFormatException -> La4
            r4.mo1632r(r6)     // Catch: java.util.zip.DataFormatException -> La4
        L61:
            if (r3 <= 0) goto L6f
            int r6 = r2.f5482v     // Catch: java.util.zip.DataFormatException -> La4
            int r6 = r6 + r3
            r2.f5482v = r6     // Catch: java.util.zip.DataFormatException -> La4
            long r6 = r10.f7260R     // Catch: java.util.zip.DataFormatException -> La4
            long r2 = (long) r3     // Catch: java.util.zip.DataFormatException -> La4
            long r6 = r6 + r2
            r10.f7260R = r6     // Catch: java.util.zip.DataFormatException -> La4
            goto L7f
        L6f:
            int r3 = r2.f5480h     // Catch: java.util.zip.DataFormatException -> La4
            int r6 = r2.f5482v     // Catch: java.util.zip.DataFormatException -> La4
            if (r3 != r6) goto L7e
            a.gk r3 = r2.m3272z()     // Catch: java.util.zip.DataFormatException -> La4
            r10.f7261S = r3     // Catch: java.util.zip.DataFormatException -> La4
            p000a.AbstractC0539KA.m1253z(r2)     // Catch: java.util.zip.DataFormatException -> La4
        L7e:
            r2 = r0
        L7f:
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L84
            return r2
        L84:
            boolean r0 = r5.finished()
            if (r0 != 0) goto La1
            boolean r0 = r5.needsDictionary()
            if (r0 == 0) goto L91
            goto La1
        L91:
            boolean r0 = r4.mo1626b()
            if (r0 != 0) goto L99
            goto L0
        L99:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r11 = "source exhausted prematurely"
            r10.<init>(r11)
            throw r10
        La1:
            r10 = -1
            return r10
        La4:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r10)
            throw r11
        Lab:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "closed"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Lb7:
            java.lang.String r10 = "byteCount < 0: "
            java.lang.String r10 = p000a.AbstractC2441tz.m4205u(r10, r11)
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0616La.mo188M(a.sQ, long):long");
    }

    @Override // p000a.InterfaceC0984SS
    /* renamed from: P */
    public final C1819iG mo189P() {
        return this.f2022S.mo189P();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2020I) {
            return;
        }
        this.f2021R.end();
        this.f2020I = true;
        this.f2022S.close();
    }
}
