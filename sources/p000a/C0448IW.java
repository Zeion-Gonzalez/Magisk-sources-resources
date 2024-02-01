package p000a;

/* renamed from: a.IW */
/* loaded from: classes.dex */
public final class C0448IW extends AbstractC0102C {
    public C0448IW(C2551w c2551w) {
        super(c2551w, false);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m339V(z, 49, this.f388S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        int i = z ? 4 : 3;
        for (InterfaceC0959S interfaceC0959S : this.f388S) {
            i += interfaceC0959S.mo302N().mo151w(true);
        }
        return i;
    }

    public C0448IW(InterfaceC0959S[] interfaceC0959SArr) {
        super(false, interfaceC0959SArr);
    }
}
