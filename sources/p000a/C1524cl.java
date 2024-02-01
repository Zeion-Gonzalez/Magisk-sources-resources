package p000a;

/* renamed from: a.cl */
/* loaded from: classes.dex */
public final class C1524cl extends AbstractC1857j {

    /* renamed from: q */
    public final /* synthetic */ int f4704q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1524cl(int i, int i2, int i3, InterfaceC0959S interfaceC0959S, int i4) {
        super(i, i2, i3, interfaceC0959S);
        this.f4704q = i4;
    }

    @Override // p000a.AbstractC1857j
    /* renamed from: E */
    public final AbstractC1333Z mo2950E(AbstractC1593e abstractC1593e) {
        switch (this.f4704q) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new C1802hw(abstractC1593e);
            default:
                return new C0423I1(abstractC1593e);
        }
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final boolean mo215R() {
        int i = this.f4704q;
        InterfaceC0959S interfaceC0959S = this.f5791I;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (!m3474U() && !interfaceC0959S.mo302N().mo149k().mo215R()) {
                    return false;
                }
                return true;
            default:
                if (!m3474U() && !interfaceC0959S.mo302N().mo148g().mo215R()) {
                    return false;
                }
                return true;
        }
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        int i = this.f4704q;
        int i2 = this.f5794w;
        int i3 = this.f5792R;
        InterfaceC0959S interfaceC0959S = this.f5791I;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                AbstractC1593e mo149k = interfaceC0959S.mo302N().mo149k();
                boolean m3474U = m3474U();
                if (z) {
                    if (m3474U || mo149k.mo215R()) {
                        i3 |= 32;
                    }
                    c0175dp.m338S(i3, i2);
                }
                if (m3474U) {
                    c0175dp.m340W(mo149k.mo151w(true));
                }
                mo149k.mo144S(c0175dp.mo341h(), m3474U);
                return;
            default:
                AbstractC1593e mo148g = interfaceC0959S.mo302N().mo148g();
                boolean m3474U2 = m3474U();
                if (z) {
                    if (m3474U2 || mo148g.mo215R()) {
                        i3 |= 32;
                    }
                    c0175dp.m338S(i3, i2);
                }
                if (m3474U2) {
                    c0175dp.m340W(mo148g.mo151w(true));
                }
                mo148g.mo144S(c0175dp.mo344v(), m3474U2);
                return;
        }
    }

    @Override // p000a.AbstractC1857j, p000a.AbstractC1593e
    /* renamed from: g */
    public final AbstractC1593e mo148g() {
        return this;
    }

    @Override // p000a.AbstractC1857j, p000a.AbstractC1593e
    /* renamed from: k */
    public final AbstractC1593e mo149k() {
        switch (this.f4704q) {
            case AbstractC0795Op.f2698E /* 0 */:
                return this;
            default:
                return super.mo149k();
        }
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        int i = 2;
        int i2 = 1;
        int i3 = this.f4704q;
        int i4 = this.f5794w;
        int i5 = 0;
        InterfaceC0959S interfaceC0959S = this.f5791I;
        switch (i3) {
            case AbstractC0795Op.f2698E /* 0 */:
                AbstractC1593e mo149k = interfaceC0959S.mo302N().mo149k();
                boolean m3474U = m3474U();
                int mo151w = mo149k.mo151w(m3474U);
                if (m3474U) {
                    mo151w += C0175DP.m333N(mo151w);
                }
                if (z) {
                    if (i4 >= 31) {
                        while (true) {
                            i4 >>>= 7;
                            if (i4 != 0) {
                                i++;
                            } else {
                                i2 = i;
                            }
                        }
                    }
                    i5 = i2;
                }
                return mo151w + i5;
            default:
                AbstractC1593e mo148g = interfaceC0959S.mo302N().mo148g();
                boolean m3474U2 = m3474U();
                int mo151w2 = mo148g.mo151w(m3474U2);
                if (m3474U2) {
                    mo151w2 += C0175DP.m333N(mo151w2);
                }
                if (z) {
                    if (i4 >= 31) {
                        while (true) {
                            i4 >>>= 7;
                            if (i4 != 0) {
                                i++;
                            } else {
                                i2 = i;
                            }
                        }
                    }
                    i5 = i2;
                }
                return mo151w2 + i5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1524cl(int i, int i2, InterfaceC0959S interfaceC0959S, boolean z) {
        super(z, i, interfaceC0959S);
        this.f4704q = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1524cl(InterfaceC0959S interfaceC0959S) {
        super(true, 0, interfaceC0959S);
        this.f4704q = 1;
    }
}
