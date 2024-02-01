package p000a;

import java.util.Arrays;

/* renamed from: a.Sp */
/* loaded from: classes.dex */
public final class C1004Sp extends C1335Z1 {

    /* renamed from: Q */
    public C2598ww[] f3370Q;

    /* renamed from: W */
    public final C1174Vy f3371W;

    /* renamed from: o */
    public int f3372o;

    /* renamed from: u */
    public C2598ww[] f3373u;

    public C1004Sp(C0525Ju c0525Ju) {
        super(c0525Ju);
        this.f3370Q = new C2598ww[128];
        this.f3373u = new C2598ww[128];
        this.f3372o = 0;
        this.f3371W = new C1174Vy(this, this);
    }

    /* renamed from: G */
    public final void m2178G(C2598ww c2598ww) {
        int i;
        int i2 = this.f3372o + 1;
        C2598ww[] c2598wwArr = this.f3370Q;
        if (i2 > c2598wwArr.length) {
            C2598ww[] c2598wwArr2 = (C2598ww[]) Arrays.copyOf(c2598wwArr, c2598wwArr.length * 2);
            this.f3370Q = c2598wwArr2;
            this.f3373u = (C2598ww[]) Arrays.copyOf(c2598wwArr2, c2598wwArr2.length * 2);
        }
        C2598ww[] c2598wwArr3 = this.f3370Q;
        int i3 = this.f3372o;
        c2598wwArr3[i3] = c2598ww;
        int i4 = i3 + 1;
        this.f3372o = i4;
        if (i4 > 1 && c2598wwArr3[i4 - 1].f7992R > c2598ww.f7992R) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i = this.f3372o;
                if (i6 >= i) {
                    break;
                }
                this.f3373u[i6] = this.f3370Q[i6];
                i6++;
            }
            Arrays.sort(this.f3373u, 0, i, new C1051Th(i5, this));
            while (i5 < this.f3372o) {
                this.f3370Q[i5] = this.f3373u[i5];
                i5++;
            }
        }
        c2598ww.f7993S = true;
        c2598ww.m4480z(this);
    }

    /* renamed from: M */
    public final void m2179M(C2598ww c2598ww) {
        int i = 0;
        while (i < this.f3372o) {
            if (this.f3370Q[i] == c2598ww) {
                while (true) {
                    int i2 = this.f3372o;
                    if (i >= i2 - 1) {
                        this.f3372o = i2 - 1;
                        c2598ww.f7993S = false;
                        return;
                    } else {
                        C2598ww[] c2598wwArr = this.f3370Q;
                        int i3 = i + 1;
                        c2598wwArr[i] = c2598wwArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p000a.C1335Z1
    /* renamed from: N */
    public final boolean mo2180N() {
        return this.f3372o == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0051, code lost:
    
        if (r9 < r8) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0054, code lost:
    
        r5 = false;
     */
    @Override // p000a.C1335Z1
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000a.C2598ww mo2181P(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            int r4 = r11.f3372o
            if (r2 >= r4) goto L5b
            a.ww[] r4 = r11.f3370Q
            r5 = r4[r2]
            int r6 = r5.f7992R
            boolean r6 = r12[r6]
            if (r6 == 0) goto L13
            goto L58
        L13:
            a.Vy r6 = r11.f3371W
            r6.f3828R = r5
            r5 = 1
            r7 = 8
            if (r3 != r0) goto L38
        L1c:
            if (r7 < 0) goto L34
            java.lang.Object r4 = r6.f3828R
            a.ww r4 = (p000a.C2598ww) r4
            float[] r4 = r4.f8001y
            r4 = r4[r7]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L2c
            goto L34
        L2c:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L31
            goto L35
        L31:
            int r7 = r7 + (-1)
            goto L1c
        L34:
            r5 = r1
        L35:
            if (r5 == 0) goto L58
            goto L57
        L38:
            r4 = r4[r3]
        L3a:
            if (r7 < 0) goto L54
            float[] r8 = r4.f8001y
            r8 = r8[r7]
            java.lang.Object r9 = r6.f3828R
            a.ww r9 = (p000a.C2598ww) r9
            float[] r9 = r9.f8001y
            r9 = r9[r7]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L4f
            int r7 = r7 + (-1)
            goto L3a
        L4f:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L54
            goto L55
        L54:
            r5 = r1
        L55:
            if (r5 == 0) goto L58
        L57:
            r3 = r2
        L58:
            int r2 = r2 + 1
            goto L4
        L5b:
            if (r3 != r0) goto L5f
            r12 = 0
            return r12
        L5f:
            a.ww[] r12 = r11.f3370Q
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1004Sp.mo2181P(boolean[]):a.ww");
    }

    @Override // p000a.C1335Z1
    /* renamed from: W */
    public final void mo2182W(C0457If c0457If, C1335Z1 c1335z1, boolean z) {
        boolean z2;
        C2598ww c2598ww = c1335z1.f4229z;
        if (c2598ww == null) {
            return;
        }
        InterfaceC0921RL interfaceC0921RL = c1335z1.f4226P;
        int mo1662M = interfaceC0921RL.mo1662M();
        for (int i = 0; i < mo1662M; i++) {
            C2598ww mo1665Q = interfaceC0921RL.mo1665Q(i);
            float mo1671z = interfaceC0921RL.mo1671z(i);
            C1174Vy c1174Vy = this.f3371W;
            c1174Vy.f3828R = mo1665Q;
            boolean z3 = mo1665Q.f7993S;
            float[] fArr = c2598ww.f8001y;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C2598ww) c1174Vy.f3828R).f8001y;
                    float f = (fArr[i2] * mo1671z) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((C2598ww) c1174Vy.f3828R).f8001y[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C1004Sp) c1174Vy.f3827I).m2179M((C2598ww) c1174Vy.f3828R);
                }
                z2 = false;
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * mo1671z;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((C2598ww) c1174Vy.f3828R).f8001y[i3] = f3;
                    } else {
                        ((C2598ww) c1174Vy.f3828R).f8001y[i3] = 0.0f;
                    }
                }
                z2 = true;
            }
            if (z2) {
                m2178G(mo1665Q);
            }
            this.f4227h = (c1335z1.f4227h * mo1671z) + this.f4227h;
        }
        m2179M(c2598ww);
    }

    @Override // p000a.C1335Z1
    public final String toString() {
        String str = " goal -> (" + this.f4227h + ") : ";
        for (int i = 0; i < this.f3372o; i++) {
            C2598ww c2598ww = this.f3370Q[i];
            C1174Vy c1174Vy = this.f3371W;
            c1174Vy.f3828R = c2598ww;
            str = str + c1174Vy + " ";
        }
        return str;
    }
}
