package p000a;

/* renamed from: a.Hf */
/* loaded from: classes.dex */
public final class C0403Hf extends AbstractC1389a2 {

    /* renamed from: G5 */
    public int f1364G5 = 0;

    /* renamed from: BX */
    public boolean f1363BX = true;

    /* renamed from: d2 */
    public int f1365d2 = 0;

    /* renamed from: dG */
    public boolean f1366dG = false;

    /* renamed from: O */
    public final int m900O() {
        int i = this.f1364G5;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // p000a.C1628ed
    /* renamed from: P */
    public final boolean mo901P() {
        return true;
    }

    /* renamed from: d */
    public final boolean m902d() {
        int i;
        C0287FS mo3091G;
        C0287FS mo3091G2;
        C0287FS mo3091G3;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f4326oI;
            if (i4 >= i) {
                break;
            }
            C1628ed c1628ed = this.f4325Pm[i4];
            if ((this.f1363BX || c1628ed.mo901P()) && ((((i2 = this.f1364G5) == 0 || i2 == 1) && !c1628ed.mo903f()) || (((i3 = this.f1364G5) == 2 || i3 == 3) && !c1628ed.mo904r()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f4326oI; i6++) {
            C1628ed c1628ed2 = this.f4325Pm[i6];
            if (this.f1363BX || c1628ed2.mo901P()) {
                EnumC0494JK enumC0494JK = EnumC0494JK.f1644I;
                EnumC0494JK enumC0494JK2 = EnumC0494JK.f1645R;
                EnumC0494JK enumC0494JK3 = EnumC0494JK.f1650w;
                EnumC0494JK enumC0494JK4 = EnumC0494JK.f1646S;
                if (!z2) {
                    int i7 = this.f1364G5;
                    if (i7 == 0) {
                        mo3091G3 = c1628ed2.mo3091G(enumC0494JK4);
                    } else if (i7 == 1) {
                        mo3091G3 = c1628ed2.mo3091G(enumC0494JK3);
                    } else if (i7 == 2) {
                        mo3091G3 = c1628ed2.mo3091G(enumC0494JK2);
                    } else {
                        if (i7 == 3) {
                            mo3091G3 = c1628ed2.mo3091G(enumC0494JK);
                        }
                        z2 = true;
                    }
                    i5 = mo3091G3.m588P();
                    z2 = true;
                }
                int i8 = this.f1364G5;
                if (i8 == 0) {
                    mo3091G2 = c1628ed2.mo3091G(enumC0494JK4);
                } else {
                    if (i8 == 1) {
                        mo3091G = c1628ed2.mo3091G(enumC0494JK3);
                    } else if (i8 == 2) {
                        mo3091G2 = c1628ed2.mo3091G(enumC0494JK2);
                    } else if (i8 == 3) {
                        mo3091G = c1628ed2.mo3091G(enumC0494JK);
                    }
                    i5 = Math.max(i5, mo3091G.m588P());
                }
                i5 = Math.min(i5, mo3091G2.m588P());
            }
        }
        int i9 = i5 + this.f1365d2;
        int i10 = this.f1364G5;
        if (i10 == 0 || i10 == 1) {
            m3106e(i9, i9);
        } else {
            m3103X(i9, i9);
        }
        this.f1366dG = true;
        return true;
    }

    @Override // p000a.C1628ed
    /* renamed from: f */
    public final boolean mo903f() {
        return this.f1366dG;
    }

    @Override // p000a.C1628ed
    /* renamed from: r */
    public final boolean mo904r() {
        return this.f1366dG;
    }

    @Override // p000a.C1628ed
    public final String toString() {
        String m4187M = AbstractC2441tz.m4187M(new StringBuilder("[Barrier] "), this.f5069n0, " {");
        for (int i = 0; i < this.f4326oI; i++) {
            C1628ed c1628ed = this.f4325Pm[i];
            if (i > 0) {
                m4187M = AbstractC2441tz.m4195W(m4187M, ", ");
            }
            m4187M = m4187M + c1628ed.f5069n0;
        }
        return AbstractC2441tz.m4195W(m4187M, "}");
    }

    @Override // p000a.C1628ed
    /* renamed from: v */
    public final void mo905v(C0457If c0457If, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        C2598ww c2598ww;
        C0287FS c0287fs;
        int i2;
        int i3;
        int i4;
        C2598ww c2598ww2;
        int i5;
        C0287FS[] c0287fsArr = this.f5083x;
        C0287FS c0287fs2 = this.f5022C;
        c0287fsArr[0] = c0287fs2;
        int i6 = 2;
        C0287FS c0287fs3 = this.f5074p;
        c0287fsArr[2] = c0287fs3;
        C0287FS c0287fs4 = this.f5064j;
        c0287fsArr[1] = c0287fs4;
        C0287FS c0287fs5 = this.f5034L;
        c0287fsArr[3] = c0287fs5;
        for (C0287FS c0287fs6 : c0287fsArr) {
            c0287fs6.f995W = c0457If.m1102V(c0287fs6);
        }
        int i7 = this.f1364G5;
        if (i7 >= 0 && i7 < 4) {
            C0287FS c0287fs7 = c0287fsArr[i7];
            if (!this.f1366dG) {
                m902d();
            }
            if (this.f1366dG) {
                this.f1366dG = false;
                int i8 = this.f1364G5;
                if (i8 != 0 && i8 != 1) {
                    if (i8 == 2 || i8 == 3) {
                        c0457If.m1098P(c0287fs3.f995W, this.f5071nP);
                        c2598ww2 = c0287fs5.f995W;
                        i5 = this.f5071nP;
                    } else {
                        return;
                    }
                } else {
                    c0457If.m1098P(c0287fs2.f995W, this.f5054b);
                    c2598ww2 = c0287fs4.f995W;
                    i5 = this.f5054b;
                }
                c0457If.m1098P(c2598ww2, i5);
                return;
            }
            for (int i9 = 0; i9 < this.f4326oI; i9++) {
                C1628ed c1628ed = this.f4325Pm[i9];
                if ((this.f1363BX || c1628ed.mo901P()) && ((((i4 = this.f1364G5) == 0 || i4 == 1) && c1628ed.f5030Ha[0] == 3 && c1628ed.f5022C.f994Q != null && c1628ed.f5064j.f994Q != null) || ((i4 == 2 || i4 == 3) && c1628ed.f5030Ha[1] == 3 && c1628ed.f5074p.f994Q != null && c1628ed.f5034L.f994Q != null))) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (!c0287fs2.m594u() && !c0287fs4.m594u()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!c0287fs3.m594u() && !c0287fs5.m594u()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z2 && (((i3 = this.f1364G5) == 0 && z3) || ((i3 == 2 && z4) || ((i3 == 1 && z3) || (i3 == 3 && z4))))) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                i = 4;
            } else {
                i = 5;
            }
            int i10 = 0;
            while (i10 < this.f4326oI) {
                C1628ed c1628ed2 = this.f4325Pm[i10];
                if (this.f1363BX || c1628ed2.mo901P()) {
                    C2598ww m1102V = c0457If.m1102V(c1628ed2.f5083x[this.f1364G5]);
                    int i11 = this.f1364G5;
                    C0287FS c0287fs8 = c1628ed2.f5083x[i11];
                    c0287fs8.f995W = m1102V;
                    C0287FS c0287fs9 = c0287fs8.f994Q;
                    if (c0287fs9 != null && c0287fs9.f993P == this) {
                        i2 = c0287fs8.f998u + 0;
                    } else {
                        i2 = 0;
                    }
                    if (i11 != 0 && i11 != i6) {
                        C2598ww c2598ww3 = c0287fs7.f995W;
                        int i12 = this.f1365d2 + i2;
                        C1335Z1 m1101S = c0457If.m1101S();
                        C2598ww m1100R = c0457If.m1100R();
                        m1100R.f7991I = 0;
                        m1101S.m2724h(c2598ww3, m1102V, m1100R, i12);
                        c0457If.m1111v(m1101S);
                    } else {
                        C2598ww c2598ww4 = c0287fs7.f995W;
                        int i13 = this.f1365d2 - i2;
                        C1335Z1 m1101S2 = c0457If.m1101S();
                        C2598ww m1100R2 = c0457If.m1100R();
                        m1100R2.f7991I = 0;
                        m1101S2.m2727v(c2598ww4, m1102V, m1100R2, i13);
                        c0457If.m1111v(m1101S2);
                    }
                    c0457If.m1097N(c0287fs7.f995W, m1102V, this.f1365d2 + i2, i);
                }
                i10++;
                i6 = 2;
            }
            int i14 = this.f1364G5;
            if (i14 == 0) {
                c0457If.m1097N(c0287fs4.f995W, c0287fs2.f995W, 0, 8);
                c0457If.m1097N(c0287fs2.f995W, this.f5020B.f5064j.f995W, 0, 4);
                c2598ww = c0287fs2.f995W;
                c0287fs = this.f5020B.f5022C;
            } else if (i14 == 1) {
                c0457If.m1097N(c0287fs2.f995W, c0287fs4.f995W, 0, 8);
                c0457If.m1097N(c0287fs2.f995W, this.f5020B.f5022C.f995W, 0, 4);
                c2598ww = c0287fs2.f995W;
                c0287fs = this.f5020B.f5064j;
            } else if (i14 == 2) {
                c0457If.m1097N(c0287fs5.f995W, c0287fs3.f995W, 0, 8);
                c0457If.m1097N(c0287fs3.f995W, this.f5020B.f5034L.f995W, 0, 4);
                c2598ww = c0287fs3.f995W;
                c0287fs = this.f5020B.f5074p;
            } else if (i14 == 3) {
                c0457If.m1097N(c0287fs3.f995W, c0287fs5.f995W, 0, 8);
                c0457If.m1097N(c0287fs3.f995W, this.f5020B.f5074p.f995W, 0, 4);
                c2598ww = c0287fs3.f995W;
                c0287fs = this.f5020B.f5034L;
            } else {
                return;
            }
            c0457If.m1097N(c2598ww, c0287fs.f995W, 0, 0);
        }
    }
}
