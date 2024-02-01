package p000a;

/* renamed from: a.hg */
/* loaded from: classes.dex */
public abstract class AbstractC1790hg implements InterfaceC1298YI {

    /* renamed from: P */
    public int f5624P;

    /* renamed from: h */
    public C1628ed f5627h;

    /* renamed from: v */
    public C2682ye f5630v;

    /* renamed from: z */
    public int f5631z;

    /* renamed from: N */
    public final C2546vv f5623N = new C2546vv(this);

    /* renamed from: Q */
    public int f5625Q = 0;

    /* renamed from: u */
    public boolean f5629u = false;

    /* renamed from: o */
    public final C1472bf f5628o = new C1472bf(this);

    /* renamed from: W */
    public final C1472bf f5626W = new C1472bf(this);

    /* renamed from: G */
    public int f5622G = 1;

    public AbstractC1790hg(C1628ed c1628ed) {
        this.f5627h = c1628ed;
    }

    /* renamed from: W */
    public static C1472bf m3325W(C0287FS c0287fs, int i) {
        C0287FS c0287fs2 = c0287fs.f994Q;
        if (c0287fs2 == null) {
            return null;
        }
        C1628ed c1628ed = c0287fs2.f993P;
        AbstractC1790hg abstractC1790hg = i == 0 ? c1628ed.f5039P : c1628ed.f5037N;
        int ordinal = c0287fs2.f992N.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return abstractC1790hg.f5628o;
        }
        if (ordinal == 3 || ordinal == 4) {
            return abstractC1790hg.f5626W;
        }
        return null;
    }

    /* renamed from: h */
    public static void m3326h(C1472bf c1472bf, C1472bf c1472bf2, int i) {
        c1472bf.f4568V.add(c1472bf2);
        c1472bf.f4567Q = i;
        c1472bf2.f4564M.add(c1472bf);
    }

    /* renamed from: o */
    public static C1472bf m3327o(C0287FS c0287fs) {
        AbstractC1790hg abstractC1790hg;
        AbstractC1790hg abstractC1790hg2;
        C0287FS c0287fs2 = c0287fs.f994Q;
        if (c0287fs2 == null) {
            return null;
        }
        int ordinal = c0287fs2.f992N.ordinal();
        C1628ed c1628ed = c0287fs2.f993P;
        if (ordinal == 1) {
            abstractC1790hg = c1628ed.f5039P;
        } else {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    abstractC1790hg2 = c1628ed.f5039P;
                } else {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            return null;
                        }
                        return c1628ed.f5037N.f3981M;
                    }
                    abstractC1790hg2 = c1628ed.f5037N;
                }
                return abstractC1790hg2.f5626W;
            }
            abstractC1790hg = c1628ed.f5037N;
        }
        return abstractC1790hg.f5628o;
    }

    /* renamed from: G */
    public long mo1909G() {
        if (this.f5623N.f4563G) {
            return r0.f4572u;
        }
        return 0L;
    }

    /* renamed from: M */
    public abstract boolean mo1910M();

    /* renamed from: N */
    public abstract void mo1911N();

    /* renamed from: P */
    public abstract void mo1912P();

    /* renamed from: Q */
    public abstract void mo1913Q();

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0051, code lost:
    
        if (r9.f5631z == 3) goto L119;
     */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3328V(p000a.C0287FS r12, p000a.C0287FS r13, int r14) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC1790hg.m3328V(a.FS, a.FS, int):void");
    }

    /* renamed from: u */
    public final int m3329u(int i, int i2) {
        int max;
        if (i2 == 0) {
            C1628ed c1628ed = this.f5627h;
            int i3 = c1628ed.f5078s;
            max = Math.max(c1628ed.f5084y, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C1628ed c1628ed2 = this.f5627h;
            int i4 = c1628ed2.f5059f;
            max = Math.max(c1628ed2.f5024E, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    /* renamed from: v */
    public final void m3330v(C1472bf c1472bf, C1472bf c1472bf2, int i, C2546vv c2546vv) {
        c1472bf.f4568V.add(c1472bf2);
        c1472bf.f4568V.add(this.f5623N);
        c1472bf.f4571o = i;
        c1472bf.f4569W = c2546vv;
        c1472bf2.f4564M.add(c1472bf);
        c2546vv.f4564M.add(c1472bf);
    }
}
