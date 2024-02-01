package p000a;

import java.util.Arrays;

/* renamed from: a.ca */
/* loaded from: classes.dex */
public final class C1516ca {

    /* renamed from: P */
    public boolean f4685P;

    /* renamed from: W */
    public int f4687W;

    /* renamed from: h */
    public final C2361sQ f4688h;

    /* renamed from: o */
    public int f4689o;

    /* renamed from: z */
    public final boolean f4692z = true;

    /* renamed from: v */
    public int f4691v = Integer.MAX_VALUE;

    /* renamed from: N */
    public int f4684N = 4096;

    /* renamed from: Q */
    public C0668Me[] f4686Q = new C0668Me[8];

    /* renamed from: u */
    public int f4690u = 7;

    public C1516ca(C2361sQ c2361sQ) {
        this.f4688h = c2361sQ;
    }

    /* renamed from: N */
    public final void m2937N(int i, int i2, int i3) {
        C2361sQ c2361sQ = this.f4688h;
        if (i < i2) {
            c2361sQ.m4086nB(i | i3);
            return;
        }
        c2361sQ.m4086nB(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c2361sQ.m4086nB(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c2361sQ.m4086nB(i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0072  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2938P(java.util.ArrayList r13) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1516ca.m2938P(java.util.ArrayList):void");
    }

    /* renamed from: h */
    public final void m2939h(C0668Me c0668Me) {
        int i = this.f4684N;
        int i2 = c0668Me.f2182v;
        if (i2 > i) {
            C0668Me[] c0668MeArr = this.f4686Q;
            Arrays.fill(c0668MeArr, 0, c0668MeArr.length, (Object) null);
            this.f4690u = this.f4686Q.length - 1;
            this.f4689o = 0;
            this.f4687W = 0;
            return;
        }
        m2941z((this.f4687W + i2) - i);
        int i3 = this.f4689o + 1;
        C0668Me[] c0668MeArr2 = this.f4686Q;
        if (i3 > c0668MeArr2.length) {
            C0668Me[] c0668MeArr3 = new C0668Me[c0668MeArr2.length * 2];
            System.arraycopy(c0668MeArr2, 0, c0668MeArr3, c0668MeArr2.length, c0668MeArr2.length);
            this.f4690u = this.f4686Q.length - 1;
            this.f4686Q = c0668MeArr3;
        }
        int i4 = this.f4690u;
        this.f4690u = i4 - 1;
        this.f4686Q[i4] = c0668Me;
        this.f4689o++;
        this.f4687W += i2;
    }

    /* renamed from: v */
    public final void m2940v(C1623eY c1623eY) {
        int mo1980P;
        int i = 0;
        if (this.f4692z) {
            int[] iArr = AbstractC2599wx.f8004z;
            int mo1980P2 = c1623eY.mo1980P();
            long j = 0;
            for (int i2 = 0; i2 < mo1980P2; i2++) {
                byte mo1987u = c1623eY.mo1987u(i2);
                byte[] bArr = AbstractC1181W6.f3860z;
                j += AbstractC2599wx.f8002h[mo1987u & 255];
            }
            if (((int) ((j + 7) >> 3)) < c1623eY.mo1980P()) {
                C2361sQ c2361sQ = new C2361sQ();
                int[] iArr2 = AbstractC2599wx.f8004z;
                int mo1980P3 = c1623eY.mo1980P();
                long j2 = 0;
                byte b = 0;
                while (i < mo1980P3) {
                    byte mo1987u2 = c1623eY.mo1987u(i);
                    byte[] bArr2 = AbstractC1181W6.f3860z;
                    int i3 = mo1987u2 & 255;
                    int i4 = AbstractC2599wx.f8004z[i3];
                    byte b2 = AbstractC2599wx.f8002h[i3];
                    j2 = (j2 << b2) | i4;
                    int i5 = b + b2;
                    while (i5 >= 8) {
                        i5 = (i5 == 1 ? 1 : 0) - 8;
                        c2361sQ.m4086nB((int) (j2 >> i5));
                    }
                    i++;
                    b = i5;
                }
                if (b > 0) {
                    c2361sQ.m4086nB((int) ((255 >>> b) | (j2 << (8 - b))));
                }
                c1623eY = c2361sQ.mo1631q();
                mo1980P = c1623eY.mo1980P();
                i = 128;
                m2937N(mo1980P, 127, i);
                C2361sQ c2361sQ2 = this.f4688h;
                c2361sQ2.getClass();
                c1623eY.mo1983V(c2361sQ2, c1623eY.mo1980P());
            }
        }
        mo1980P = c1623eY.mo1980P();
        m2937N(mo1980P, 127, i);
        C2361sQ c2361sQ22 = this.f4688h;
        c2361sQ22.getClass();
        c1623eY.mo1983V(c2361sQ22, c1623eY.mo1980P());
    }

    /* renamed from: z */
    public final void m2941z(int i) {
        int i2;
        if (i > 0) {
            int length = this.f4686Q.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f4690u;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f4686Q[length].f2182v;
                i -= i4;
                this.f4687W -= i4;
                this.f4689o--;
                i3++;
                length--;
            }
            C0668Me[] c0668MeArr = this.f4686Q;
            int i5 = i2 + 1;
            System.arraycopy(c0668MeArr, i5, c0668MeArr, i5 + i3, this.f4689o);
            C0668Me[] c0668MeArr2 = this.f4686Q;
            int i6 = this.f4690u + 1;
            Arrays.fill(c0668MeArr2, i6, i6 + i3, (Object) null);
            this.f4690u += i3;
        }
    }
}
