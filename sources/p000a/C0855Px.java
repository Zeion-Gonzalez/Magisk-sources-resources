package p000a;

import java.security.MessageDigest;

/* renamed from: a.Px */
/* loaded from: classes.dex */
public final class C0855Px extends C1623eY {

    /* renamed from: k */
    public final transient int[] f2892k;

    /* renamed from: q */
    public final transient byte[][] f2893q;

    public C0855Px(byte[][] bArr, int[] iArr) {
        super(C1623eY.f5009I.f5011S);
        this.f2893q = bArr;
        this.f2892k = iArr;
    }

    @Override // p000a.C1623eY
    /* renamed from: G */
    public final C1623eY mo1978G() {
        return new C1623eY(m1982S()).mo1978G();
    }

    @Override // p000a.C1623eY
    /* renamed from: N */
    public final String mo1979N() {
        return new C1623eY(m1982S()).mo1979N();
    }

    @Override // p000a.C1623eY
    /* renamed from: P */
    public final int mo1980P() {
        return this.f2892k[this.f2893q.length - 1];
    }

    @Override // p000a.C1623eY
    /* renamed from: Q */
    public final byte[] mo1981Q() {
        return m1982S();
    }

    /* renamed from: S */
    public final byte[] m1982S() {
        byte[] bArr = new byte[mo1980P()];
        byte[][] bArr2 = this.f2893q;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f2892k;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            System.arraycopy(bArr2[i], i4, bArr, i3, (i4 + i6) - i4);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // p000a.C1623eY
    /* renamed from: V */
    public final void mo1983V(C2361sQ c2361sQ, int i) {
        int i2;
        int i3 = 0 + i;
        int m2671b = AbstractC1292YB.m2671b(this, 0);
        int i4 = 0;
        while (i4 < i3) {
            int[] iArr = this.f2892k;
            if (m2671b == 0) {
                i2 = 0;
            } else {
                i2 = iArr[m2671b - 1];
            }
            int i5 = iArr[m2671b] - i2;
            byte[][] bArr = this.f2893q;
            int i6 = iArr[bArr.length + m2671b];
            int min = Math.min(i3, i5 + i2) - i4;
            int i7 = (i4 - i2) + i6;
            C1740gk c1740gk = new C1740gk(bArr[m2671b], i7, i7 + min, true);
            C1740gk c1740gk2 = c2361sQ.f7261S;
            if (c1740gk2 == null) {
                c1740gk.f5481u = c1740gk;
                c1740gk.f5479Q = c1740gk;
                c2361sQ.f7261S = c1740gk;
            } else {
                c1740gk2.f5481u.m3270h(c1740gk);
            }
            i4 += min;
            m2671b++;
        }
        c2361sQ.f7260R += i;
    }

    @Override // p000a.C1623eY
    /* renamed from: W */
    public final boolean mo1984W(C1623eY c1623eY, int i) {
        int i2;
        if (mo1980P() - i < 0) {
            return false;
        }
        int i3 = i + 0;
        int m2671b = AbstractC1292YB.m2671b(this, 0);
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int[] iArr = this.f2892k;
            if (m2671b == 0) {
                i2 = 0;
            } else {
                i2 = iArr[m2671b - 1];
            }
            int i6 = iArr[m2671b] - i2;
            byte[][] bArr = this.f2893q;
            int i7 = iArr[bArr.length + m2671b];
            int min = Math.min(i3, i6 + i2) - i4;
            if (!c1623eY.mo1986o(i5, (i4 - i2) + i7, min, bArr[m2671b])) {
                return false;
            }
            i5 += min;
            i4 += min;
            m2671b++;
        }
        return true;
    }

    @Override // p000a.C1623eY
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C1623eY) {
                C1623eY c1623eY = (C1623eY) obj;
                if (c1623eY.mo1980P() != mo1980P() || !mo1984W(c1623eY, mo1980P())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // p000a.C1623eY
    /* renamed from: h */
    public final String mo1985h() {
        return new C1623eY(m1982S()).mo1985h();
    }

    @Override // p000a.C1623eY
    public final int hashCode() {
        int i = this.f5010R;
        if (i == 0) {
            byte[][] bArr = this.f2893q;
            int length = bArr.length;
            int i2 = 0;
            int i3 = 1;
            int i4 = 0;
            while (i2 < length) {
                int[] iArr = this.f2892k;
                int i5 = iArr[length + i2];
                int i6 = iArr[i2];
                byte[] bArr2 = bArr[i2];
                int i7 = (i6 - i4) + i5;
                while (i5 < i7) {
                    i3 = (i3 * 31) + bArr2[i5];
                    i5++;
                }
                i2++;
                i4 = i6;
            }
            this.f5010R = i3;
            return i3;
        }
        return i;
    }

    @Override // p000a.C1623eY
    /* renamed from: o */
    public final boolean mo1986o(int i, int i2, int i3, byte[] bArr) {
        int i4;
        if (i < 0 || i > mo1980P() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int m2671b = AbstractC1292YB.m2671b(this, i);
        while (true) {
            boolean z = true;
            if (i >= i5) {
                return true;
            }
            int[] iArr = this.f2892k;
            if (m2671b == 0) {
                i4 = 0;
            } else {
                i4 = iArr[m2671b - 1];
            }
            int i6 = iArr[m2671b] - i4;
            byte[][] bArr2 = this.f2893q;
            int i7 = iArr[bArr2.length + m2671b];
            int min = Math.min(i5, i6 + i4) - i;
            int i8 = (i - i4) + i7;
            byte[] bArr3 = bArr2[m2671b];
            int i9 = 0;
            while (true) {
                if (i9 >= min) {
                    break;
                }
                if (bArr3[i9 + i8] != bArr[i9 + i2]) {
                    z = false;
                    break;
                }
                i9++;
            }
            if (!z) {
                return false;
            }
            i2 += min;
            i += min;
            m2671b++;
        }
    }

    @Override // p000a.C1623eY
    public final String toString() {
        return new C1623eY(m1982S()).toString();
    }

    @Override // p000a.C1623eY
    /* renamed from: u */
    public final byte mo1987u(int i) {
        byte[][] bArr = this.f2893q;
        int length = bArr.length - 1;
        int[] iArr = this.f2892k;
        AbstractC0795Op.m1872u(iArr[length], i, 1L);
        int m2671b = AbstractC1292YB.m2671b(this, i);
        return bArr[m2671b][(i - (m2671b == 0 ? 0 : iArr[m2671b - 1])) + iArr[bArr.length + m2671b]];
    }

    @Override // p000a.C1623eY
    /* renamed from: v */
    public final C1623eY mo1988v(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f2893q;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f2892k;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        return new C1623eY(messageDigest.digest());
    }

    @Override // p000a.C1623eY
    /* renamed from: z */
    public final String mo1989z() {
        throw null;
    }
}
