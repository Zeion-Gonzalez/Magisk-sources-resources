package p000a;

/* renamed from: a.f */
/* loaded from: classes.dex */
public final class C1648f extends AbstractC1593e {

    /* renamed from: S */
    public final C1338Z4 f5110S;

    public C1648f(C1338Z4 c1338z4) {
        if (c1338z4 == null) {
            throw new NullPointerException("'baseGraphicString' cannot be null");
        }
        this.f5110S = c1338z4;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final boolean mo215R() {
        return false;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m337R(7, z);
        c0175dp.m336M(25, false, this.f5110S.f4232S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (abstractC1593e instanceof C1648f) {
            return this.f5110S.mo216V(((C1648f) abstractC1593e).f5110S);
        }
        return false;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: g */
    public final AbstractC1593e mo148g() {
        this.f5110S.getClass();
        return this;
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    public final int hashCode() {
        return ~this.f5110S.hashCode();
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: k */
    public final AbstractC1593e mo149k() {
        this.f5110S.getClass();
        return this;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return this.f5110S.mo151w(z);
    }
}
