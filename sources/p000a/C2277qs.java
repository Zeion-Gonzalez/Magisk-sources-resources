package p000a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: a.qs */
/* loaded from: classes.dex */
public final class C2277qs {

    /* renamed from: Q */
    public int f7001Q;

    /* renamed from: u */
    public int f7003u;

    /* renamed from: v */
    public final C2323ri f7004v;

    /* renamed from: z */
    public int f7005z = 4096;

    /* renamed from: h */
    public final ArrayList f7002h = new ArrayList();

    /* renamed from: P */
    public C0668Me[] f7000P = new C0668Me[8];

    /* renamed from: N */
    public int f6999N = 7;

    public C2277qs(C2126o6 c2126o6) {
        this.f7004v = new C2323ri(c2126o6);
    }

    /* renamed from: N */
    public final int m3911N(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte mo1616EC = this.f7004v.mo1616EC();
            byte[] bArr = AbstractC1181W6.f3860z;
            int i5 = mo1616EC & 255;
            if ((i5 & 128) != 0) {
                i2 += (i5 & 127) << i4;
                i4 += 7;
            } else {
                return i2 + (i5 << i4);
            }
        }
    }

    /* renamed from: P */
    public final C1623eY m3912P() {
        boolean z;
        int i;
        C2323ri c2323ri = this.f7004v;
        byte mo1616EC = c2323ri.mo1616EC();
        byte[] bArr = AbstractC1181W6.f3860z;
        int i2 = mo1616EC & 255;
        int i3 = 0;
        if ((i2 & 128) == 128) {
            z = true;
        } else {
            z = false;
        }
        long m3911N = m3911N(i2, 127);
        if (z) {
            C2361sQ c2361sQ = new C2361sQ();
            C2275qq c2275qq = AbstractC2599wx.f8003v;
            C2275qq c2275qq2 = c2275qq;
            int i4 = 0;
            for (long j = 0; j < m3911N; j++) {
                byte mo1616EC2 = c2323ri.mo1616EC();
                byte[] bArr2 = AbstractC1181W6.f3860z;
                i3 = (i3 << 8) | (mo1616EC2 & 255);
                i4 += 8;
                while (i4 >= 8) {
                    int i5 = i4 - 8;
                    c2275qq2 = ((C2275qq[]) c2275qq2.f6995v)[(i3 >>> i5) & 255];
                    if (((C2275qq[]) c2275qq2.f6995v) == null) {
                        c2361sQ.m4086nB(c2275qq2.f6996z);
                        i4 -= c2275qq2.f6994h;
                        c2275qq2 = c2275qq;
                    } else {
                        i4 = i5;
                    }
                }
            }
            while (i4 > 0) {
                C2275qq c2275qq3 = ((C2275qq[]) c2275qq2.f6995v)[(i3 << (8 - i4)) & 255];
                if (((C2275qq[]) c2275qq3.f6995v) != null || (i = c2275qq3.f6994h) > i4) {
                    break;
                }
                c2361sQ.m4086nB(c2275qq3.f6996z);
                i4 -= i;
                c2275qq2 = c2275qq;
            }
            return c2361sQ.mo1631q();
        }
        return c2323ri.mo1627g(m3911N);
    }

    /* renamed from: h */
    public final C1623eY m3913h(int i) {
        boolean z;
        C0668Me c0668Me;
        if (i >= 0 && i <= AbstractC1761h5.f5557z.length - 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c0668Me = AbstractC1761h5.f5557z[i];
        } else {
            int length = this.f6999N + 1 + (i - AbstractC1761h5.f5557z.length);
            if (length >= 0) {
                C0668Me[] c0668MeArr = this.f7000P;
                if (length < c0668MeArr.length) {
                    c0668Me = c0668MeArr[length];
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }
        return c0668Me.f2183z;
    }

    /* renamed from: v */
    public final void m3914v(C0668Me c0668Me) {
        this.f7002h.add(c0668Me);
        int i = this.f7005z;
        int i2 = c0668Me.f2182v;
        if (i2 > i) {
            C0668Me[] c0668MeArr = this.f7000P;
            Arrays.fill(c0668MeArr, 0, c0668MeArr.length, (Object) null);
            this.f6999N = this.f7000P.length - 1;
            this.f7001Q = 0;
            this.f7003u = 0;
            return;
        }
        m3915z((this.f7003u + i2) - i);
        int i3 = this.f7001Q + 1;
        C0668Me[] c0668MeArr2 = this.f7000P;
        if (i3 > c0668MeArr2.length) {
            C0668Me[] c0668MeArr3 = new C0668Me[c0668MeArr2.length * 2];
            System.arraycopy(c0668MeArr2, 0, c0668MeArr3, c0668MeArr2.length, c0668MeArr2.length);
            this.f6999N = this.f7000P.length - 1;
            this.f7000P = c0668MeArr3;
        }
        int i4 = this.f6999N;
        this.f6999N = i4 - 1;
        this.f7000P[i4] = c0668Me;
        this.f7001Q++;
        this.f7003u += i2;
    }

    /* renamed from: z */
    public final int m3915z(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f7000P.length;
            while (true) {
                length--;
                i2 = this.f6999N;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f7000P[length].f2182v;
                i -= i4;
                this.f7003u -= i4;
                this.f7001Q--;
                i3++;
            }
            C0668Me[] c0668MeArr = this.f7000P;
            System.arraycopy(c0668MeArr, i2 + 1, c0668MeArr, i2 + 1 + i3, this.f7001Q);
            this.f6999N += i3;
        }
        return i3;
    }
}
