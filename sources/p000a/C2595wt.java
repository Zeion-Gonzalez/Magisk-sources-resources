package p000a;

/* renamed from: a.wt */
/* loaded from: classes.dex */
public final class C2595wt extends AbstractC2392t {

    /* renamed from: h */
    public final int f7974h;

    /* renamed from: v */
    public boolean f7975v;

    /* renamed from: z */
    public final C0797Os f7976z = new C0797Os();

    public C2595wt(int i) {
        this.f7974h = i;
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: N */
    public final boolean mo3490N() {
        return true;
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: P */
    public final AbstractC0883Qb mo39P() {
        return this.f7976z;
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: h */
    public final boolean mo3491h(AbstractC0883Qb abstractC0883Qb) {
        if (this.f7975v) {
            AbstractC0883Qb abstractC0883Qb2 = (AbstractC0883Qb) this.f7976z.f4557z;
            if (abstractC0883Qb2 instanceof AbstractC0900Qy) {
                ((AbstractC0900Qy) abstractC0883Qb2).f3084Q = false;
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: u */
    public final C1253XQ mo41u(InterfaceC1036TR interfaceC1036TR) {
        C1858j0 c1858j0 = (C1858j0) interfaceC1036TR;
        boolean z = false;
        if (c1858j0.f5807o) {
            if (this.f7976z.f4555h == null) {
                return null;
            }
            AbstractC0883Qb mo39P = c1858j0.m3482o().mo39P();
            if ((mo39P instanceof C0172DL) || (mo39P instanceof C0797Os)) {
                z = true;
            }
            this.f7975v = z;
            return C1253XQ.m2558z(c1858j0.f5799N);
        }
        int i = c1858j0.f5808u;
        int i2 = this.f7974h;
        if (i < i2) {
            return null;
        }
        return new C1253XQ(-1, c1858j0.f5809v + i2, false);
    }
}
