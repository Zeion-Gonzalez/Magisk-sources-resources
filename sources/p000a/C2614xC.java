package p000a;

/* renamed from: a.xC */
/* loaded from: classes.dex */
public final class C2614xC extends AbstractC2392t {

    /* renamed from: h */
    public boolean f8084h;

    /* renamed from: v */
    public int f8085v;

    /* renamed from: z */
    public final AbstractC0900Qy f8086z;

    public C2614xC(AbstractC0900Qy abstractC0900Qy) {
        this.f8086z = abstractC0900Qy;
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: P */
    public final AbstractC0883Qb mo39P() {
        return this.f8086z;
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: h */
    public final boolean mo3491h(AbstractC0883Qb abstractC0883Qb) {
        if (!(abstractC0883Qb instanceof C0797Os)) {
            return false;
        }
        if (this.f8084h && this.f8085v == 1) {
            this.f8086z.f3084Q = false;
            this.f8084h = false;
        }
        return true;
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: u */
    public final C1253XQ mo41u(InterfaceC1036TR interfaceC1036TR) {
        int i;
        C1858j0 c1858j0 = (C1858j0) interfaceC1036TR;
        if (c1858j0.f5807o) {
            this.f8084h = true;
            i = 0;
        } else {
            if (this.f8084h) {
                i = this.f8085v + 1;
            }
            return C1253XQ.m2558z(c1858j0.f5806h);
        }
        this.f8085v = i;
        return C1253XQ.m2558z(c1858j0.f5806h);
    }
}
