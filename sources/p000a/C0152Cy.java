package p000a;

/* renamed from: a.Cy */
/* loaded from: classes.dex */
public final class C0152Cy extends AbstractC0102C {

    /* renamed from: I */
    public int f510I;

    public C0152Cy() {
        this.f510I = -1;
    }

    /* renamed from: E */
    public final int m309E() {
        if (this.f510I < 0) {
            int i = 0;
            for (InterfaceC0959S interfaceC0959S : this.f388S) {
                i += interfaceC0959S.mo302N().mo148g().mo151w(true);
            }
            this.f510I = i;
        }
        return this.f510I;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m337R(49, z);
        C0784Ob mo344v = c0175dp.mo344v();
        InterfaceC0959S[] interfaceC0959SArr = this.f388S;
        int length = interfaceC0959SArr.length;
        int i = 0;
        if (this.f510I >= 0 || length > 16) {
            c0175dp.m340W(m309E());
            while (i < length) {
                mo344v.mo516I(interfaceC0959SArr[i].mo302N());
                i++;
            }
            return;
        }
        AbstractC1593e[] abstractC1593eArr = new AbstractC1593e[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            AbstractC1593e mo148g = interfaceC0959SArr[i3].mo302N().mo148g();
            abstractC1593eArr[i3] = mo148g;
            i2 += mo148g.mo151w(true);
        }
        this.f510I = i2;
        c0175dp.m340W(i2);
        while (i < length) {
            mo344v.mo516I(abstractC1593eArr[i]);
            i++;
        }
    }

    @Override // p000a.AbstractC0102C, p000a.AbstractC1593e
    /* renamed from: g */
    public final AbstractC1593e mo148g() {
        return this;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return C0175DP.m334Q(m309E(), z);
    }

    public C0152Cy(C2551w c2551w) {
        super(c2551w, false);
        this.f510I = -1;
    }

    public C0152Cy(InterfaceC0959S[] interfaceC0959SArr) {
        super(interfaceC0959SArr, false);
        this.f510I = -1;
    }

    public C0152Cy(InterfaceC0959S[] interfaceC0959SArr, int i) {
        super(false, interfaceC0959SArr);
        this.f510I = -1;
    }

    public C0152Cy(InterfaceC0959S[] interfaceC0959SArr, InterfaceC0959S[] interfaceC0959SArr2) {
        super(interfaceC0959SArr, interfaceC0959SArr2);
        this.f510I = -1;
    }
}
