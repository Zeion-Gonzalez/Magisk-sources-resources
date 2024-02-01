package p000a;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.ZO */
/* loaded from: classes.dex */
public final class C1357ZO extends AbstractC1790hg {
    @Override // p000a.AbstractC1790hg
    /* renamed from: M */
    public final boolean mo1910M() {
        return false;
    }

    @Override // p000a.AbstractC1790hg
    /* renamed from: N */
    public final void mo1911N() {
        C1628ed c1628ed = this.f5627h;
        if (c1628ed instanceof C0403Hf) {
            int i = ((C0403Hf) c1628ed).f1364G5;
            C1472bf c1472bf = this.f5628o;
            if (i != 0 && i != 1) {
                c1628ed.f5071nP = c1472bf.f4572u;
            } else {
                c1628ed.f5054b = c1472bf.f4572u;
            }
        }
    }

    @Override // p000a.AbstractC1790hg
    /* renamed from: P */
    public final void mo1912P() {
        AbstractC1790hg abstractC1790hg;
        C1628ed c1628ed = this.f5627h;
        if (c1628ed instanceof C0403Hf) {
            C1472bf c1472bf = this.f5628o;
            c1472bf.f4570h = true;
            C0403Hf c0403Hf = (C0403Hf) c1628ed;
            int i = c0403Hf.f1364G5;
            boolean z = c0403Hf.f1363BX;
            ArrayList arrayList = c1472bf.f4568V;
            int i2 = 0;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            c1472bf.f4565N = 7;
                            while (i2 < c0403Hf.f4326oI) {
                                C1628ed c1628ed2 = c0403Hf.f4325Pm[i2];
                                if (z || c1628ed2.f5046UZ != 8) {
                                    C1472bf c1472bf2 = c1628ed2.f5037N.f5626W;
                                    c1472bf2.f4564M.add(c1472bf);
                                    arrayList.add(c1472bf2);
                                }
                                i2++;
                            }
                        } else {
                            return;
                        }
                    } else {
                        c1472bf.f4565N = 6;
                        while (i2 < c0403Hf.f4326oI) {
                            C1628ed c1628ed3 = c0403Hf.f4325Pm[i2];
                            if (z || c1628ed3.f5046UZ != 8) {
                                C1472bf c1472bf3 = c1628ed3.f5037N.f5628o;
                                c1472bf3.f4564M.add(c1472bf);
                                arrayList.add(c1472bf3);
                            }
                            i2++;
                        }
                    }
                    m2752S(this.f5627h.f5037N.f5628o);
                    abstractC1790hg = this.f5627h.f5037N;
                    m2752S(abstractC1790hg.f5626W);
                }
                c1472bf.f4565N = 5;
                while (i2 < c0403Hf.f4326oI) {
                    C1628ed c1628ed4 = c0403Hf.f4325Pm[i2];
                    if (z || c1628ed4.f5046UZ != 8) {
                        C1472bf c1472bf4 = c1628ed4.f5039P.f5626W;
                        c1472bf4.f4564M.add(c1472bf);
                        arrayList.add(c1472bf4);
                    }
                    i2++;
                }
            } else {
                c1472bf.f4565N = 4;
                while (i2 < c0403Hf.f4326oI) {
                    C1628ed c1628ed5 = c0403Hf.f4325Pm[i2];
                    if (z || c1628ed5.f5046UZ != 8) {
                        C1472bf c1472bf5 = c1628ed5.f5039P.f5628o;
                        c1472bf5.f4564M.add(c1472bf);
                        arrayList.add(c1472bf5);
                    }
                    i2++;
                }
            }
            m2752S(this.f5627h.f5039P.f5628o);
            abstractC1790hg = this.f5627h.f5039P;
            m2752S(abstractC1790hg.f5626W);
        }
    }

    @Override // p000a.AbstractC1790hg
    /* renamed from: Q */
    public final void mo1913Q() {
        this.f5630v = null;
        this.f5628o.m2883v();
    }

    /* renamed from: S */
    public final void m2752S(C1472bf c1472bf) {
        C1472bf c1472bf2 = this.f5628o;
        c1472bf2.f4564M.add(c1472bf);
        c1472bf.f4568V.add(c1472bf2);
    }

    @Override // p000a.InterfaceC1298YI
    /* renamed from: z */
    public final void mo1916z(InterfaceC1298YI interfaceC1298YI) {
        C0403Hf c0403Hf = (C0403Hf) this.f5627h;
        int i = c0403Hf.f1364G5;
        C1472bf c1472bf = this.f5628o;
        Iterator it = c1472bf.f4568V.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C1472bf) it.next()).f4572u;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i != 0 && i != 2) {
            c1472bf.mo2881P(i2 + c0403Hf.f1365d2);
        } else {
            c1472bf.mo2881P(i3 + c0403Hf.f1365d2);
        }
    }
}
