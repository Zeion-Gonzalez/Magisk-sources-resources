package p000a;

import java.util.Arrays;

/* renamed from: a.wF */
/* loaded from: classes.dex */
public final class C2561wF {

    /* renamed from: N */
    public final /* synthetic */ C2406tL f7826N;

    /* renamed from: P */
    public final short[] f7827P;

    /* renamed from: v */
    public final int[] f7829v;

    /* renamed from: h */
    public final int f7828h = 0;

    /* renamed from: z */
    public int f7830z = 0;

    public C2561wF(C2406tL c2406tL) {
        this.f7826N = c2406tL;
        int[] iArr = new int[32768];
        this.f7829v = iArr;
        Arrays.fill(iArr, -1);
        this.f7827P = new short[65536];
    }

    /* renamed from: h */
    public final boolean m4378h(byte[] bArr, int i, int i2, int i3, int i4, C0069BM c0069bm) {
        c0069bm.f300v = i4;
        m4379z(i, bArr);
        int i5 = this.f7829v[(EnumC2649xy.m4546h(i, bArr) * (-1640531535)) >>> 17];
        for (int i6 = 0; i6 < this.f7826N.f7349z; i6++) {
            int i7 = this.f7828h;
            if (i5 < Math.max(i7, (i - 65536) + 1) || i5 > i) {
                break;
            }
            if (EnumC2450uA.m4228N(bArr, i5, i)) {
                int m4234z = EnumC2450uA.m4234z(i5 + 4, i + 4, i3, bArr) + 4;
                int m4231h = EnumC2450uA.m4231h(bArr, i5, i, i7, i2);
                int i8 = m4234z + m4231h;
                if (i8 > c0069bm.f300v) {
                    c0069bm.f300v = i8;
                    c0069bm.f299h = i5 - m4231h;
                    c0069bm.f301z = i - m4231h;
                }
            }
            i5 -= 65535 & this.f7827P[i5 & 65535];
        }
        if (c0069bm.f300v <= i4) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public final void m4379z(int i, byte[] bArr) {
        while (true) {
            int i2 = this.f7830z;
            if (i2 < i) {
                int m4546h = (EnumC2649xy.m4546h(i2, bArr) * (-1640531535)) >>> 17;
                int[] iArr = this.f7829v;
                int i3 = i2 - iArr[m4546h];
                if (i3 >= 65536) {
                    i3 = 65535;
                }
                this.f7827P[i2 & 65535] = (short) i3;
                iArr[m4546h] = i2;
                this.f7830z++;
            } else {
                return;
            }
        }
    }
}
