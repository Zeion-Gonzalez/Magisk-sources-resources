package p000a;

/* renamed from: a.yY */
/* loaded from: classes.dex */
public final class C2676yY extends C1158Vg {
    public C2676yY() {
        super("denylist");
    }

    @Override // p000a.C1158Vg
    /* renamed from: P */
    public final /* bridge */ /* synthetic */ void mo2367P(Object obj, InterfaceC0609LP interfaceC0609LP, Integer num) {
        mo2369v((InterfaceC0806P1) obj, interfaceC0609LP, ((Boolean) num).booleanValue());
    }

    @Override // p000a.C1158Vg
    /* renamed from: v */
    public final void mo2369v(InterfaceC0806P1 interfaceC0806P1, InterfaceC0609LP interfaceC0609LP, boolean z) {
        int i;
        synchronized (((C2106ng) this.f3754R)) {
            C2106ng c2106ng = (C2106ng) this.f3754R;
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            c2106ng.f6505w = i;
        }
    }
}
