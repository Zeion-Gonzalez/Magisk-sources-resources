package p000a;

/* renamed from: a.Cm */
/* loaded from: classes.dex */
public final class C0144Cm extends AbstractC0209E {

    /* renamed from: R */
    public final C2074n2 f496R;

    /* renamed from: S */
    public final C2074n2 f497S;

    /* renamed from: w */
    public final C2074n2 f498w;

    public C0144Cm(C2074n2 c2074n2, C2074n2 c2074n22) {
        if (c2074n2 == null || c2074n22 == null) {
            throw new NullPointerException("AlgorithmIdentifiers cannot be null");
        }
        this.f497S = c2074n2;
        this.f496R = c2074n22;
        this.f498w = null;
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        C2551w c2551w = new C2551w(3);
        c2551w.m4371z(this.f497S);
        boolean z = false;
        C2074n2 c2074n2 = this.f496R;
        if (c2074n2 != null) {
            c2551w.m4371z(new C1524cl(1, z ? 1 : 0, c2074n2, z));
        }
        C2074n2 c2074n22 = this.f498w;
        if (c2074n22 != null) {
            c2551w.m4371z(new C1524cl(2, z ? 1 : 0, c2074n22, z));
        }
        return new C1802hw(c2551w);
    }
}
