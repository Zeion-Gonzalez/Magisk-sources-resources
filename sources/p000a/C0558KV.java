package p000a;

/* renamed from: a.KV */
/* loaded from: classes.dex */
public final class C0558KV extends AbstractC2262qa {

    /* renamed from: z */
    public final C2524vT f1823z;

    public C0558KV(C2524vT c2524vT) {
        this.f1823z = c2524vT;
    }

    @Override // p000a.InterfaceC2728zV
    /* renamed from: P */
    public final void mo231P(AbstractC0614LY abstractC0614LY) {
        C2524vT c2524vT = this.f1823z;
        int i = c2524vT.f7731d - 1;
        c2524vT.f7731d = i;
        if (i == 0) {
            c2524vT.f7730O = false;
            c2524vT.m1363I();
        }
        abstractC0614LY.mo1364J(this);
    }

    @Override // p000a.AbstractC2262qa, p000a.InterfaceC2728zV
    /* renamed from: h */
    public final void mo1084h(AbstractC0614LY abstractC0614LY) {
        C2524vT c2524vT = this.f1823z;
        if (c2524vT.f7730O) {
            return;
        }
        c2524vT.m1365L();
        c2524vT.f7730O = true;
    }
}
