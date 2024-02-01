package p000a;

import java.util.ArrayList;

/* renamed from: a.Wk */
/* loaded from: classes.dex */
public final class C1217Wk extends AbstractC1790hg {

    /* renamed from: M */
    public final C1472bf f3981M;

    /* renamed from: V */
    public C2125o5 f3982V;

    public C1217Wk(C1628ed c1628ed) {
        super(c1628ed);
        C1472bf c1472bf = new C1472bf(this);
        this.f3981M = c1472bf;
        this.f3982V = null;
        this.f5628o.f4565N = 6;
        this.f5626W.f4565N = 7;
        c1472bf.f4565N = 8;
        this.f5625Q = 1;
    }

    @Override // p000a.AbstractC1790hg
    /* renamed from: M */
    public final boolean mo1910M() {
        return this.f5624P != 3 || this.f5627h.f5065k == 0;
    }

    @Override // p000a.AbstractC1790hg
    /* renamed from: N */
    public final void mo1911N() {
        C1472bf c1472bf = this.f5628o;
        if (c1472bf.f4563G) {
            this.f5627h.f5071nP = c1472bf.f4572u;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:282:0x025b, code lost:
    
        if (r15.f5627h.f5058e != false) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0292, code lost:
    
        if (r0.f5624P == 3) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x02b8, code lost:
    
        if (r15.f5627h.f5058e != false) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x02ba, code lost:
    
        m3330v(r7, r3, 1, r15.f3982V);
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0309, code lost:
    
        if (r0.f5624P == 3) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x030b, code lost:
    
        r0.f5623N.f4564M.add(r2);
        r10.add(r15.f5627h.f5039P.f5623N);
        r2.f4574z = r15;
     */
    @Override // p000a.AbstractC1790hg
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1912P() {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1217Wk.mo1912P():void");
    }

    @Override // p000a.AbstractC1790hg
    /* renamed from: Q */
    public final void mo1913Q() {
        this.f5630v = null;
        this.f5628o.m2883v();
        this.f5626W.m2883v();
        this.f3981M.m2883v();
        this.f5623N.m2883v();
        this.f5629u = false;
    }

    /* renamed from: S */
    public final void m2509S() {
        this.f5629u = false;
        C1472bf c1472bf = this.f5628o;
        c1472bf.m2883v();
        c1472bf.f4563G = false;
        C1472bf c1472bf2 = this.f5626W;
        c1472bf2.m2883v();
        c1472bf2.f4563G = false;
        C1472bf c1472bf3 = this.f3981M;
        c1472bf3.m2883v();
        c1472bf3.f4563G = false;
        this.f5623N.f4563G = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f5627h.f5069n0;
    }

    @Override // p000a.InterfaceC1298YI
    /* renamed from: z */
    public final void mo1916z(InterfaceC1298YI interfaceC1298YI) {
        float f;
        int i;
        if (AbstractC2441tz.m4204s(this.f5622G) != 3) {
            C2546vv c2546vv = this.f5623N;
            if (c2546vv.f4573v && !c2546vv.f4563G && this.f5624P == 3) {
                C1628ed c1628ed = this.f5627h;
                int i2 = c1628ed.f5065k;
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (c1628ed.f5039P.f5623N.f4563G) {
                            int i3 = c1628ed.f5066l;
                            if (i3 != -1) {
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        i = 0;
                                    }
                                } else {
                                    f = r5.f4572u * c1628ed.f5067m;
                                    i = (int) (f + 0.5f);
                                }
                            }
                            f = r5.f4572u / c1628ed.f5067m;
                            i = (int) (f + 0.5f);
                        }
                    }
                } else {
                    C1628ed c1628ed2 = c1628ed.f5020B;
                    if (c1628ed2 != null) {
                        if (c1628ed2.f5037N.f5623N.f4563G) {
                            f = r5.f4572u * c1628ed.f5077r;
                            i = (int) (f + 0.5f);
                        }
                    }
                }
                c2546vv.mo2881P(i);
            }
            C1472bf c1472bf = this.f5628o;
            if (c1472bf.f4573v) {
                C1472bf c1472bf2 = this.f5626W;
                if (c1472bf2.f4573v) {
                    if (c1472bf.f4563G && c1472bf2.f4563G && c2546vv.f4563G) {
                        return;
                    }
                    boolean z = c2546vv.f4563G;
                    ArrayList arrayList = c1472bf.f4568V;
                    ArrayList arrayList2 = c1472bf2.f4568V;
                    if (!z && this.f5624P == 3) {
                        C1628ed c1628ed3 = this.f5627h;
                        if (c1628ed3.f5075q == 0 && !c1628ed3.m3100U()) {
                            C1472bf c1472bf3 = (C1472bf) arrayList.get(0);
                            C1472bf c1472bf4 = (C1472bf) arrayList2.get(0);
                            int i4 = c1472bf3.f4572u + c1472bf.f4567Q;
                            int i5 = c1472bf4.f4572u + c1472bf2.f4567Q;
                            c1472bf.mo2881P(i4);
                            c1472bf2.mo2881P(i5);
                            c2546vv.mo2881P(i5 - i4);
                            return;
                        }
                    }
                    if (!c2546vv.f4563G && this.f5624P == 3 && this.f5631z == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                        C1472bf c1472bf5 = (C1472bf) arrayList.get(0);
                        int i6 = (((C1472bf) arrayList2.get(0)).f4572u + c1472bf2.f4567Q) - (c1472bf5.f4572u + c1472bf.f4567Q);
                        int i7 = c2546vv.f7789S;
                        if (i6 < i7) {
                            c2546vv.mo2881P(i6);
                        } else {
                            c2546vv.mo2881P(i7);
                        }
                    }
                    if (c2546vv.f4563G && arrayList.size() > 0 && arrayList2.size() > 0) {
                        C1472bf c1472bf6 = (C1472bf) arrayList.get(0);
                        C1472bf c1472bf7 = (C1472bf) arrayList2.get(0);
                        int i8 = c1472bf6.f4572u;
                        int i9 = c1472bf.f4567Q + i8;
                        int i10 = c1472bf7.f4572u;
                        int i11 = c1472bf2.f4567Q + i10;
                        float f2 = this.f5627h.f5070nF;
                        if (c1472bf6 == c1472bf7) {
                            f2 = 0.5f;
                        } else {
                            i8 = i9;
                            i10 = i11;
                        }
                        c1472bf.mo2881P((int) ((((i10 - i8) - c2546vv.f4572u) * f2) + i8 + 0.5f));
                        c1472bf2.mo2881P(c1472bf.f4572u + c2546vv.f4572u);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C1628ed c1628ed4 = this.f5627h;
        m3328V(c1628ed4.f5074p, c1628ed4.f5034L, 1);
    }
}
