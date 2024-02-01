package p000a;

import java.util.concurrent.Executor;

/* renamed from: a.jC */
/* loaded from: classes.dex */
public final /* synthetic */ class C1868jC implements InterfaceC0636Lz, InterfaceC2487ut {

    /* renamed from: R */
    public final /* synthetic */ Executor f5838R;

    /* renamed from: S */
    public final /* synthetic */ C0357Gq f5839S;

    /* renamed from: w */
    public final /* synthetic */ InterfaceC2487ut f5840w;

    public /* synthetic */ C1868jC(C0357Gq c0357Gq, Executor executor, InterfaceC2487ut interfaceC2487ut) {
        this.f5839S = c0357Gq;
        this.f5838R = executor;
        this.f5840w = interfaceC2487ut;
    }

    @Override // p000a.InterfaceC2487ut
    /* renamed from: h */
    public final void mo57h(AbstractC1823iK abstractC1823iK) {
        C0357Gq c0357Gq = this.f5839S;
        boolean z = c0357Gq.f1206E;
        InterfaceC2487ut interfaceC2487ut = this.f5840w;
        if (z && abstractC1823iK == C0876QR.f2982N) {
            c0357Gq.f1206E = false;
            c0357Gq.mo780dG(this.f5838R, interfaceC2487ut);
        } else if (interfaceC2487ut != null) {
            interfaceC2487ut.mo57h(abstractC1823iK);
        }
    }

    @Override // p000a.InterfaceC0636Lz
    /* renamed from: v */
    public final void mo765v(AbstractC0017AI abstractC0017AI) {
        C0357Gq.m779yF(this.f5839S, this.f5838R, this.f5840w, abstractC0017AI);
    }
}
