package p000a;

import java.util.ArrayList;

/* renamed from: a.gF */
/* loaded from: classes.dex */
public final class C1715gF extends AbstractC1790hg {

    /* renamed from: M */
    public static final int[] f5391M = new int[2];

    public C1715gF(C1628ed c1628ed) {
        super(c1628ed);
        this.f5628o.f4565N = 4;
        this.f5626W.f4565N = 5;
        this.f5625Q = 0;
    }

    /* renamed from: S */
    public static void m3247S(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    @Override // p000a.AbstractC1790hg
    /* renamed from: M */
    public final boolean mo1910M() {
        return this.f5624P != 3 || this.f5627h.f5075q == 0;
    }

    @Override // p000a.AbstractC1790hg
    /* renamed from: N */
    public final void mo1911N() {
        C1472bf c1472bf = this.f5628o;
        if (c1472bf.f4563G) {
            this.f5627h.f5054b = c1472bf.f4572u;
        }
    }

    @Override // p000a.AbstractC1790hg
    /* renamed from: P */
    public final void mo1912P() {
        C1628ed c1628ed;
        C1628ed c1628ed2;
        int i;
        C1628ed c1628ed3;
        C0287FS c0287fs;
        ArrayList arrayList;
        C1628ed c1628ed4;
        int i2;
        C1628ed c1628ed5 = this.f5627h;
        boolean z = c1628ed5.f5085z;
        C2546vv c2546vv = this.f5623N;
        if (z) {
            c2546vv.mo2881P(c1628ed5.m3098R());
        }
        boolean z2 = c2546vv.f4563G;
        C1472bf c1472bf = this.f5626W;
        C1472bf c1472bf2 = this.f5628o;
        if (!z2) {
            C1628ed c1628ed6 = this.f5627h;
            int i3 = c1628ed6.f5030Ha[0];
            this.f5624P = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c1628ed4 = c1628ed6.f5020B) != null && ((i2 = c1628ed4.f5030Ha[0]) == 1 || i2 == 4)) {
                    int m3098R = (c1628ed4.m3098R() - this.f5627h.f5022C.m587N()) - this.f5627h.f5064j.m587N();
                    AbstractC1790hg.m3326h(c1472bf2, c1628ed4.f5039P.f5628o, this.f5627h.f5022C.m587N());
                    AbstractC1790hg.m3326h(c1472bf, c1628ed4.f5039P.f5626W, -this.f5627h.f5064j.m587N());
                    c2546vv.mo2881P(m3098R);
                    return;
                }
                if (i3 == 1) {
                    c2546vv.mo2881P(c1628ed6.m3098R());
                }
            }
        } else if (this.f5624P == 4 && (c1628ed2 = (c1628ed = this.f5627h).f5020B) != null && ((i = c1628ed2.f5030Ha[0]) == 1 || i == 4)) {
            AbstractC1790hg.m3326h(c1472bf2, c1628ed2.f5039P.f5628o, c1628ed.f5022C.m587N());
            AbstractC1790hg.m3326h(c1472bf, c1628ed2.f5039P.f5626W, -this.f5627h.f5064j.m587N());
            return;
        }
        if (c2546vv.f4563G) {
            C1628ed c1628ed7 = this.f5627h;
            if (c1628ed7.f5085z) {
                C0287FS[] c0287fsArr = c1628ed7.f5083x;
                C0287FS c0287fs2 = c0287fsArr[0];
                C0287FS c0287fs3 = c0287fs2.f994Q;
                if (c0287fs3 != null && c0287fsArr[1].f994Q != null) {
                    if (c1628ed7.m3113s()) {
                        c1472bf2.f4567Q = this.f5627h.f5083x[0].m587N();
                        c0287fs = this.f5627h.f5083x[1];
                        c1472bf.f4567Q = -c0287fs.m587N();
                        return;
                    }
                    C1472bf m3327o = AbstractC1790hg.m3327o(this.f5627h.f5083x[0]);
                    if (m3327o != null) {
                        AbstractC1790hg.m3326h(c1472bf2, m3327o, this.f5627h.f5083x[0].m587N());
                    }
                    C1472bf m3327o2 = AbstractC1790hg.m3327o(this.f5627h.f5083x[1]);
                    if (m3327o2 != null) {
                        AbstractC1790hg.m3326h(c1472bf, m3327o2, -this.f5627h.f5083x[1].m587N());
                    }
                    c1472bf2.f4570h = true;
                    c1472bf.f4570h = true;
                    return;
                }
                if (c0287fs3 != null) {
                    C1472bf m3327o3 = AbstractC1790hg.m3327o(c0287fs2);
                    if (m3327o3 != null) {
                        AbstractC1790hg.m3326h(c1472bf2, m3327o3, this.f5627h.f5083x[0].m587N());
                    } else {
                        return;
                    }
                } else {
                    C0287FS c0287fs4 = c0287fsArr[1];
                    if (c0287fs4.f994Q != null) {
                        C1472bf m3327o4 = AbstractC1790hg.m3327o(c0287fs4);
                        if (m3327o4 != null) {
                            AbstractC1790hg.m3326h(c1472bf, m3327o4, -this.f5627h.f5083x[1].m587N());
                            AbstractC1790hg.m3326h(c1472bf2, c1472bf, -c2546vv.f4572u);
                            return;
                        }
                        return;
                    }
                    if (!(c1628ed7 instanceof InterfaceC0617Lb) && c1628ed7.f5020B != null && c1628ed7.mo3091G(EnumC0494JK.f1648k).f994Q == null) {
                        C1628ed c1628ed8 = this.f5627h;
                        AbstractC1790hg.m3326h(c1472bf2, c1628ed8.f5020B.f5039P.f5628o, c1628ed8.m3115w());
                    } else {
                        return;
                    }
                }
                AbstractC1790hg.m3326h(c1472bf, c1472bf2, c2546vv.f4572u);
                return;
            }
        }
        if (this.f5624P == 3) {
            C1628ed c1628ed9 = this.f5627h;
            int i4 = c1628ed9.f5075q;
            ArrayList arrayList2 = c2546vv.f4564M;
            ArrayList arrayList3 = c2546vv.f4568V;
            if (i4 != 2) {
                if (i4 == 3) {
                    if (c1628ed9.f5065k == 3) {
                        c1472bf2.f4574z = this;
                        c1472bf.f4574z = this;
                        C1217Wk c1217Wk = c1628ed9.f5037N;
                        c1217Wk.f5628o.f4574z = this;
                        c1217Wk.f5626W.f4574z = this;
                        c2546vv.f4574z = this;
                        if (c1628ed9.m3100U()) {
                            arrayList3.add(this.f5627h.f5037N.f5623N);
                            this.f5627h.f5037N.f5623N.f4564M.add(c2546vv);
                            C1217Wk c1217Wk2 = this.f5627h.f5037N;
                            c1217Wk2.f5623N.f4574z = this;
                            arrayList3.add(c1217Wk2.f5628o);
                            arrayList3.add(this.f5627h.f5037N.f5626W);
                            this.f5627h.f5037N.f5628o.f4564M.add(c2546vv);
                            arrayList = this.f5627h.f5037N.f5626W.f4564M;
                        } else if (this.f5627h.m3113s()) {
                            this.f5627h.f5037N.f5623N.f4568V.add(c2546vv);
                            arrayList2.add(this.f5627h.f5037N.f5623N);
                        } else {
                            arrayList = this.f5627h.f5037N.f5623N.f4568V;
                        }
                    } else {
                        C2546vv c2546vv2 = c1628ed9.f5037N.f5623N;
                        arrayList3.add(c2546vv2);
                        c2546vv2.f4564M.add(c2546vv);
                        this.f5627h.f5037N.f5628o.f4564M.add(c2546vv);
                        this.f5627h.f5037N.f5626W.f4564M.add(c2546vv);
                        c2546vv.f4570h = true;
                        arrayList2.add(c1472bf2);
                        arrayList2.add(c1472bf);
                        c1472bf2.f4568V.add(c2546vv);
                        arrayList = c1472bf.f4568V;
                    }
                    arrayList.add(c2546vv);
                }
            } else {
                C1628ed c1628ed10 = c1628ed9.f5020B;
                if (c1628ed10 != null) {
                    C2546vv c2546vv3 = c1628ed10.f5037N.f5623N;
                    arrayList3.add(c2546vv3);
                    c2546vv3.f4564M.add(c2546vv);
                    c2546vv.f4570h = true;
                    arrayList2.add(c1472bf2);
                    arrayList2.add(c1472bf);
                }
            }
        }
        C1628ed c1628ed11 = this.f5627h;
        C0287FS[] c0287fsArr2 = c1628ed11.f5083x;
        C0287FS c0287fs5 = c0287fsArr2[0];
        C0287FS c0287fs6 = c0287fs5.f994Q;
        if (c0287fs6 != null && c0287fsArr2[1].f994Q != null) {
            if (c1628ed11.m3113s()) {
                c1472bf2.f4567Q = this.f5627h.f5083x[0].m587N();
                c0287fs = this.f5627h.f5083x[1];
                c1472bf.f4567Q = -c0287fs.m587N();
                return;
            }
            C1472bf m3327o5 = AbstractC1790hg.m3327o(this.f5627h.f5083x[0]);
            C1472bf m3327o6 = AbstractC1790hg.m3327o(this.f5627h.f5083x[1]);
            if (m3327o5 != null) {
                m3327o5.m2882h(this);
            }
            if (m3327o6 != null) {
                m3327o6.m2882h(this);
            }
            this.f5622G = 4;
            return;
        }
        if (c0287fs6 != null) {
            C1472bf m3327o7 = AbstractC1790hg.m3327o(c0287fs5);
            if (m3327o7 != null) {
                AbstractC1790hg.m3326h(c1472bf2, m3327o7, this.f5627h.f5083x[0].m587N());
            } else {
                return;
            }
        } else {
            C0287FS c0287fs7 = c0287fsArr2[1];
            if (c0287fs7.f994Q != null) {
                C1472bf m3327o8 = AbstractC1790hg.m3327o(c0287fs7);
                if (m3327o8 != null) {
                    AbstractC1790hg.m3326h(c1472bf, m3327o8, -this.f5627h.f5083x[1].m587N());
                    m3330v(c1472bf2, c1472bf, -1, c2546vv);
                    return;
                }
                return;
            }
            if (!(c1628ed11 instanceof InterfaceC0617Lb) && (c1628ed3 = c1628ed11.f5020B) != null) {
                AbstractC1790hg.m3326h(c1472bf2, c1628ed3.f5039P.f5628o, c1628ed11.m3115w());
            } else {
                return;
            }
        }
        m3330v(c1472bf, c1472bf2, 1, c2546vv);
    }

    @Override // p000a.AbstractC1790hg
    /* renamed from: Q */
    public final void mo1913Q() {
        this.f5630v = null;
        this.f5628o.m2883v();
        this.f5626W.m2883v();
        this.f5623N.m2883v();
        this.f5629u = false;
    }

    /* renamed from: R */
    public final void m3248R() {
        this.f5629u = false;
        C1472bf c1472bf = this.f5628o;
        c1472bf.m2883v();
        c1472bf.f4563G = false;
        C1472bf c1472bf2 = this.f5626W;
        c1472bf2.m2883v();
        c1472bf2.f4563G = false;
        this.f5623N.f4563G = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f5627h.f5069n0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:293:0x022a, code lost:
    
        if (r3 != 1) goto L309;
     */
    @Override // p000a.InterfaceC1298YI
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1916z(p000a.InterfaceC1298YI r24) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1715gF.mo1916z(a.YI):void");
    }
}
