package p000a;

/* renamed from: a.xt */
/* loaded from: classes.dex */
public final class C2645xt extends AbstractC1857j {
    public C2645xt(int i, AbstractC0102C abstractC0102C) {
        super(false, i, abstractC0102C);
    }

    @Override // p000a.AbstractC1857j
    /* renamed from: E */
    public final AbstractC1333Z mo2950E(AbstractC1593e abstractC1593e) {
        return new C0622Lh(abstractC1593e);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final boolean mo215R() {
        return m3474U() || this.f5791I.mo302N().mo215R();
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        AbstractC1593e mo302N = this.f5791I.mo302N();
        boolean m3474U = m3474U();
        if (z) {
            int i = this.f5792R;
            if (m3474U || mo302N.mo215R()) {
                i |= 32;
            }
            c0175dp.m338S(i, this.f5794w);
        }
        if (!m3474U) {
            mo302N.mo144S(c0175dp, false);
            return;
        }
        c0175dp.m343u(128);
        mo302N.mo144S(c0175dp, true);
        c0175dp.m343u(0);
        c0175dp.m343u(0);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        int i;
        AbstractC1593e mo302N = this.f5791I.mo302N();
        boolean m3474U = m3474U();
        int mo151w = mo302N.mo151w(m3474U);
        if (m3474U) {
            mo151w += 3;
        }
        if (z) {
            int i2 = this.f5794w;
            if (i2 < 31) {
                i = 1;
            } else {
                i = 2;
                while (true) {
                    i2 >>>= 7;
                    if (i2 == 0) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            i = 0;
        }
        return mo151w + i;
    }

    public C2645xt(InterfaceC0959S interfaceC0959S) {
        super(true, 0, interfaceC0959S);
    }
}
