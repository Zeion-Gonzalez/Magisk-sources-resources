package p000a;

import java.util.concurrent.Executor;

/* renamed from: a.Nf */
/* loaded from: classes.dex */
public final class C0727Nf implements InterfaceC0987SV {

    /* renamed from: R */
    public final InterfaceC0987SV f2454R;

    /* renamed from: S */
    public final Executor f2455S;

    public C0727Nf(Executor executor, InterfaceC0987SV interfaceC0987SV) {
        this.f2455S = executor;
        this.f2454R = interfaceC0987SV;
    }

    @Override // p000a.InterfaceC0987SV
    /* renamed from: G */
    public final InterfaceC0987SV clone() {
        return new C0727Nf(this.f2455S, this.f2454R.clone());
    }

    @Override // p000a.InterfaceC0987SV
    /* renamed from: V */
    public final C1364ZX mo1685V() {
        return this.f2454R.mo1685V();
    }

    @Override // p000a.InterfaceC0987SV
    public final void cancel() {
        this.f2454R.cancel();
    }

    @Override // p000a.InterfaceC0987SV
    /* renamed from: h */
    public final void mo1686h(InterfaceC1636el interfaceC1636el) {
        this.f2454R.mo1686h(new C1361ZT(this, 2, interfaceC1636el));
    }

    @Override // p000a.InterfaceC0987SV
    /* renamed from: y */
    public final boolean mo1687y() {
        return this.f2454R.mo1687y();
    }
}
