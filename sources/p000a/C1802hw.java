package p000a;

/* renamed from: a.hw */
/* loaded from: classes.dex */
public final class C1802hw extends AbstractC1333Z {

    /* renamed from: I */
    public static final /* synthetic */ int f5663I = 0;

    /* renamed from: w */
    public int f5664w;

    public C1802hw() {
        this.f5664w = -1;
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
        C0242Ec mo341h = c0175dp.mo341h();
        int length = this.f4224S.length;
        int i = 0;
        if (this.f5664w >= 0 || length > 16) {
            c0175dp.m340W(m3357c());
            while (i < length) {
                this.f4224S[i].mo302N().mo149k().mo144S(mo341h, true);
                i++;
            }
            return;
        }
        AbstractC1593e[] abstractC1593eArr = new AbstractC1593e[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            AbstractC1593e mo149k = this.f4224S[i3].mo302N().mo149k();
            abstractC1593eArr[i3] = mo149k;
            i2 += mo149k.mo151w(true);
        }
        this.f5664w = i2;
        c0175dp.m340W(i2);
        while (i < length) {
            abstractC1593eArr[i].mo144S(mo341h, true);
            i++;
        }
    }

    @Override // p000a.AbstractC1333Z
    /* renamed from: Y */
    public final AbstractC0477J mo145Y() {
        return new C1745gp(C1787hb.m3324s(m2715s()));
    }

    /* renamed from: c */
    public final int m3357c() {
        if (this.f5664w < 0) {
            int length = this.f4224S.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.f4224S[i2].mo302N().mo149k().mo151w(true);
            }
            this.f5664w = i;
        }
        return this.f5664w;
    }

    @Override // p000a.AbstractC1333Z, p000a.AbstractC1593e
    /* renamed from: g */
    public final AbstractC1593e mo148g() {
        return this;
    }

    @Override // p000a.AbstractC1333Z, p000a.AbstractC1593e
    /* renamed from: k */
    public final AbstractC1593e mo149k() {
        return this;
    }

    @Override // p000a.AbstractC1333Z
    /* renamed from: r */
    public final AbstractC1176W mo150r() {
        return new C0781OX(0, C1400aG.m2820U(m2716y()));
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return C0175DP.m334Q(m3357c(), z);
    }

    public C1802hw(InterfaceC0959S interfaceC0959S) {
        super(interfaceC0959S);
        this.f5664w = -1;
    }

    public C1802hw(C2551w c2551w) {
        super(c2551w);
        this.f5664w = -1;
    }

    public C1802hw(InterfaceC0959S[] interfaceC0959SArr) {
        super(interfaceC0959SArr);
        this.f5664w = -1;
    }

    public C1802hw(InterfaceC0959S[] interfaceC0959SArr, int i) {
        super(interfaceC0959SArr, 0);
        this.f5664w = -1;
    }
}
