package p000a;

/* renamed from: a.F6 */
/* loaded from: classes.dex */
public final class C0267F6 {

    /* renamed from: G */
    public boolean f937G;

    /* renamed from: N */
    public C2006lk f938N;

    /* renamed from: P */
    public C2043mV f939P;

    /* renamed from: Q */
    public C2006lk f940Q;

    /* renamed from: W */
    public C2051me f941W;

    /* renamed from: h */
    public C2339s f942h;

    /* renamed from: o */
    public C1133VD f943o;

    /* renamed from: u */
    public C2043mV f944u;

    /* renamed from: v */
    public C2074n2 f945v;

    /* renamed from: z */
    public final C1524cl f946z;

    public C0267F6() {
        int i = 0;
        this.f946z = new C1524cl(i, i, new C2339s(2L), true);
    }

    /* renamed from: z */
    public final C2661yC m574z() {
        if (this.f942h != null && this.f945v != null && this.f939P != null && this.f938N != null && this.f940Q != null && ((this.f944u != null || this.f937G) && this.f943o != null)) {
            C2551w c2551w = new C2551w(10);
            c2551w.m4371z(this.f946z);
            c2551w.m4371z(this.f942h);
            C2074n2 c2074n2 = this.f945v;
            if (c2074n2 != null) {
                c2551w.m4371z(c2074n2);
            }
            c2551w.m4371z(this.f939P);
            C2551w c2551w2 = new C2551w(2);
            c2551w2.m4371z(this.f938N);
            c2551w2.m4371z(this.f940Q);
            c2551w.m4371z(new C1802hw(c2551w2));
            InterfaceC0959S interfaceC0959S = this.f944u;
            if (interfaceC0959S == null) {
                interfaceC0959S = new C1802hw();
            }
            c2551w.m4371z(interfaceC0959S);
            c2551w.m4371z(this.f943o);
            C2051me c2051me = this.f941W;
            if (c2051me != null) {
                c2551w.m4371z(new C1524cl(3, 0, c2051me, true));
            }
            C1802hw c1802hw = new C1802hw(c2551w);
            if (c1802hw instanceof C2661yC) {
                return (C2661yC) c1802hw;
            }
            return new C2661yC(AbstractC1333Z.m2714U(c1802hw));
        }
        throw new IllegalStateException("not all mandatory fields set in V3 TBScertificate generator");
    }
}
