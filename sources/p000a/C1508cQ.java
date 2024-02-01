package p000a;

import androidx.databinding.AbstractC2760z;
import java.lang.ref.ReferenceQueue;

/* renamed from: a.cQ */
/* loaded from: classes.dex */
public final class C1508cQ extends AbstractC1965ky implements InterfaceC2369sa {

    /* renamed from: S */
    public final C0376HA f4661S;

    public C1508cQ(AbstractC2760z abstractC2760z, int i, ReferenceQueue referenceQueue) {
        this.f4661S = new C0376HA(abstractC2760z, i, this, referenceQueue);
    }

    @Override // p000a.InterfaceC2369sa
    /* renamed from: M */
    public final void mo2264M(InterfaceC1546d7 interfaceC1546d7) {
    }

    @Override // p000a.InterfaceC2369sa
    /* renamed from: S */
    public final void mo2265S(Object obj) {
        ((InterfaceC0281FL) obj).mo578P(this);
    }

    @Override // p000a.InterfaceC2369sa
    /* renamed from: v */
    public final void mo2266v(Object obj) {
        ((InterfaceC0281FL) obj).mo579z(this);
    }

    @Override // p000a.AbstractC1965ky
    /* renamed from: z */
    public final void mo2925z(int i, InterfaceC0281FL interfaceC0281FL) {
        C0376HA c0376ha = this.f4661S;
        AbstractC2760z abstractC2760z = (AbstractC2760z) c0376ha.get();
        if (abstractC2760z == null) {
            c0376ha.m866h();
        }
        if (abstractC2760z != null && ((InterfaceC0281FL) c0376ha.f1290v) == interfaceC0281FL && !abstractC2760z.f8976J && abstractC2760z.mo16R(c0376ha.f1289h, i, interfaceC0281FL)) {
            abstractC2760z.m4816I();
        }
    }
}
