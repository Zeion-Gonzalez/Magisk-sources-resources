package p000a;

/* renamed from: a.ta */
/* loaded from: classes.dex */
public final class C2420ta extends AbstractC0102C {

    /* renamed from: I */
    public int f7409I;

    public C2420ta(C2551w c2551w) {
        super(c2551w, true);
        this.f7409I = -1;
    }

    /* renamed from: E */
    public final int m4173E() {
        if (this.f7409I < 0) {
            int i = 0;
            for (InterfaceC0959S interfaceC0959S : this.f388S) {
                i += interfaceC0959S.mo302N().mo149k().mo151w(true);
            }
            this.f7409I = i;
        }
        return this.f7409I;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m337R(49, z);
        C0242Ec mo341h = c0175dp.mo341h();
        InterfaceC0959S[] interfaceC0959SArr = this.f388S;
        int length = interfaceC0959SArr.length;
        int i = 0;
        if (this.f7409I >= 0 || length > 16) {
            c0175dp.m340W(m4173E());
            while (i < length) {
                interfaceC0959SArr[i].mo302N().mo149k().mo144S(mo341h, true);
                i++;
            }
            return;
        }
        AbstractC1593e[] abstractC1593eArr = new AbstractC1593e[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            AbstractC1593e mo149k = interfaceC0959SArr[i3].mo302N().mo149k();
            abstractC1593eArr[i3] = mo149k;
            i2 += mo149k.mo151w(true);
        }
        this.f7409I = i2;
        c0175dp.m340W(i2);
        while (i < length) {
            abstractC1593eArr[i].mo144S(mo341h, true);
            i++;
        }
    }

    @Override // p000a.AbstractC0102C, p000a.AbstractC1593e
    /* renamed from: g */
    public final AbstractC1593e mo148g() {
        return this;
    }

    @Override // p000a.AbstractC0102C, p000a.AbstractC1593e
    /* renamed from: k */
    public final AbstractC1593e mo149k() {
        return this.f387R != null ? this : super.mo149k();
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return C0175DP.m334Q(m4173E(), z);
    }

    public C2420ta(AbstractC0209E abstractC0209E) {
        super(abstractC0209E);
        this.f7409I = -1;
    }

    public C2420ta(InterfaceC0959S[] interfaceC0959SArr) {
        super(interfaceC0959SArr, true);
        this.f7409I = -1;
    }

    public C2420ta(InterfaceC0959S[] interfaceC0959SArr, int i) {
        super(true, interfaceC0959SArr);
        this.f7409I = -1;
    }
}
