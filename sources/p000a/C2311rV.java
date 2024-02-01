package p000a;

/* renamed from: a.rV */
/* loaded from: classes.dex */
public final class C2311rV extends AbstractC1790hg {
    public C2311rV(C1628ed c1628ed) {
        super(c1628ed);
        c1628ed.f5039P.mo1913Q();
        c1628ed.f5037N.mo1913Q();
        this.f5625Q = ((C2009ln) c1628ed).f6239d2;
    }

    @Override // p000a.AbstractC1790hg
    /* renamed from: M */
    public final boolean mo1910M() {
        return false;
    }

    @Override // p000a.AbstractC1790hg
    /* renamed from: N */
    public final void mo1911N() {
        C1628ed c1628ed = this.f5627h;
        int i = ((C2009ln) c1628ed).f6239d2;
        C1472bf c1472bf = this.f5628o;
        if (i == 1) {
            c1628ed.f5054b = c1472bf.f4572u;
        } else {
            c1628ed.f5071nP = c1472bf.f4572u;
        }
    }

    @Override // p000a.AbstractC1790hg
    /* renamed from: P */
    public final void mo1912P() {
        AbstractC1790hg abstractC1790hg;
        C1628ed c1628ed = this.f5627h;
        C2009ln c2009ln = (C2009ln) c1628ed;
        int i = c2009ln.f6241oI;
        int i2 = c2009ln.f6237G5;
        int i3 = c2009ln.f6239d2;
        C1472bf c1472bf = this.f5628o;
        if (i3 == 1) {
            if (i != -1) {
                c1472bf.f4568V.add(c1628ed.f5020B.f5039P.f5628o);
                this.f5627h.f5020B.f5039P.f5628o.f4564M.add(c1472bf);
                c1472bf.f4567Q = i;
            } else if (i2 != -1) {
                c1472bf.f4568V.add(c1628ed.f5020B.f5039P.f5626W);
                this.f5627h.f5020B.f5039P.f5626W.f4564M.add(c1472bf);
                c1472bf.f4567Q = -i2;
            } else {
                c1472bf.f4570h = true;
                c1472bf.f4568V.add(c1628ed.f5020B.f5039P.f5626W);
                this.f5627h.f5020B.f5039P.f5626W.f4564M.add(c1472bf);
            }
            m3973S(this.f5627h.f5039P.f5628o);
            abstractC1790hg = this.f5627h.f5039P;
        } else {
            if (i != -1) {
                c1472bf.f4568V.add(c1628ed.f5020B.f5037N.f5628o);
                this.f5627h.f5020B.f5037N.f5628o.f4564M.add(c1472bf);
                c1472bf.f4567Q = i;
            } else if (i2 != -1) {
                c1472bf.f4568V.add(c1628ed.f5020B.f5037N.f5626W);
                this.f5627h.f5020B.f5037N.f5626W.f4564M.add(c1472bf);
                c1472bf.f4567Q = -i2;
            } else {
                c1472bf.f4570h = true;
                c1472bf.f4568V.add(c1628ed.f5020B.f5037N.f5626W);
                this.f5627h.f5020B.f5037N.f5626W.f4564M.add(c1472bf);
            }
            m3973S(this.f5627h.f5037N.f5628o);
            abstractC1790hg = this.f5627h.f5037N;
        }
        m3973S(abstractC1790hg.f5626W);
    }

    @Override // p000a.AbstractC1790hg
    /* renamed from: Q */
    public final void mo1913Q() {
        this.f5628o.m2883v();
    }

    /* renamed from: S */
    public final void m3973S(C1472bf c1472bf) {
        C1472bf c1472bf2 = this.f5628o;
        c1472bf2.f4564M.add(c1472bf);
        c1472bf.f4568V.add(c1472bf2);
    }

    @Override // p000a.InterfaceC1298YI
    /* renamed from: z */
    public final void mo1916z(InterfaceC1298YI interfaceC1298YI) {
        C1472bf c1472bf = this.f5628o;
        if (!c1472bf.f4573v || c1472bf.f4563G) {
            return;
        }
        c1472bf.mo2881P((int) ((((C1472bf) c1472bf.f4568V.get(0)).f4572u * ((C2009ln) this.f5627h).f6238Pm) + 0.5f));
    }
}
