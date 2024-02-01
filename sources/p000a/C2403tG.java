package p000a;

/* renamed from: a.tG */
/* loaded from: classes.dex */
public final class C2403tG extends AbstractC1965ky {

    /* renamed from: I */
    public final /* synthetic */ InterfaceC2374sf f7339I;

    /* renamed from: R */
    public final /* synthetic */ InterfaceC1459bP f7340R;

    /* renamed from: S */
    public final /* synthetic */ int f7341S;

    /* renamed from: w */
    public final /* synthetic */ boolean f7342w;

    public C2403tG(int i, InterfaceC2374sf interfaceC2374sf, C2188pD c2188pD, boolean z) {
        this.f7341S = i;
        this.f7340R = c2188pD;
        this.f7342w = z;
        this.f7339I = interfaceC2374sf;
    }

    @Override // p000a.AbstractC1965ky
    /* renamed from: z */
    public final void mo2925z(int i, InterfaceC0281FL interfaceC0281FL) {
        if (this.f7341S == i) {
            this.f7340R.mo93z();
            if (this.f7342w) {
                this.f7339I.mo578P(this);
            }
        }
    }
}
