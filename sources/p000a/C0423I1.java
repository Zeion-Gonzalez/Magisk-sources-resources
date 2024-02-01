package p000a;

/* renamed from: a.I1 */
/* loaded from: classes.dex */
public final class C0423I1 extends AbstractC1333Z {

    /* renamed from: w */
    public int f1400w;

    public C0423I1() {
        this.f1400w = -1;
    }

    /* renamed from: H */
    public final AbstractC1913k m951H() {
        return new C0283FN(this, 1);
    }

    @Override // p000a.AbstractC1333Z
    /* renamed from: J */
    public final AbstractC0102C mo143J() {
        return new C0152Cy(this.f4224S, 0);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m337R(48, z);
        C0784Ob mo344v = c0175dp.mo344v();
        int length = this.f4224S.length;
        int i = 0;
        if (this.f1400w >= 0 || length > 16) {
            c0175dp.m340W(m952c());
            while (i < length) {
                mo344v.mo516I(this.f4224S[i].mo302N());
                i++;
            }
            return;
        }
        AbstractC1593e[] abstractC1593eArr = new AbstractC1593e[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            AbstractC1593e mo148g = this.f4224S[i3].mo302N().mo148g();
            abstractC1593eArr[i3] = mo148g;
            i2 += mo148g.mo151w(true);
        }
        this.f1400w = i2;
        c0175dp.m340W(i2);
        while (i < length) {
            mo344v.mo516I(abstractC1593eArr[i]);
            i++;
        }
    }

    @Override // p000a.AbstractC1333Z
    /* renamed from: Y */
    public final AbstractC0477J mo145Y() {
        return new C1745gp(C1787hb.m3324s(m2715s()));
    }

    /* renamed from: c */
    public final int m952c() {
        if (this.f1400w < 0) {
            int length = this.f4224S.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.f4224S[i2].mo302N().mo148g().mo151w(true);
            }
            this.f1400w = i;
        }
        return this.f1400w;
    }

    @Override // p000a.AbstractC1333Z, p000a.AbstractC1593e
    /* renamed from: g */
    public final AbstractC1593e mo148g() {
        return this;
    }

    @Override // p000a.AbstractC1333Z
    /* renamed from: r */
    public final AbstractC1176W mo150r() {
        return new C0781OX(1, C1400aG.m2820U(m2716y()));
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return C0175DP.m334Q(m952c(), z);
    }

    public C0423I1(InterfaceC0959S interfaceC0959S) {
        super(interfaceC0959S);
        this.f1400w = -1;
    }

    public C0423I1(C2551w c2551w) {
        super(c2551w);
        this.f1400w = -1;
    }

    public C0423I1(InterfaceC0959S[] interfaceC0959SArr) {
        super(interfaceC0959SArr, 0);
        this.f1400w = -1;
    }
}
