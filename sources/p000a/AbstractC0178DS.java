package p000a;

import java.io.IOException;

/* renamed from: a.DS */
/* loaded from: classes.dex */
public abstract class AbstractC0178DS implements InterfaceC0984SS {

    /* renamed from: R */
    public boolean f546R;

    /* renamed from: S */
    public final C1903jp f547S;

    /* renamed from: w */
    public final /* synthetic */ C1177W2 f548w;

    public AbstractC0178DS(C1177W2 c1177w2) {
        this.f548w = c1177w2;
        this.f547S = new C1903jp(c1177w2.f3839v.mo189P());
    }

    @Override // p000a.InterfaceC0984SS
    /* renamed from: M */
    public long mo188M(C2361sQ c2361sQ, long j) {
        C1177W2 c1177w2 = this.f548w;
        try {
            return c1177w2.f3839v.mo188M(c2361sQ, j);
        } catch (IOException e) {
            c1177w2.f3838h.m1783V();
            m348z();
            throw e;
        }
    }

    @Override // p000a.InterfaceC0984SS
    /* renamed from: P */
    public final C1819iG mo189P() {
        return this.f547S;
    }

    /* renamed from: z */
    public final void m348z() {
        C1177W2 c1177w2 = this.f548w;
        int i = c1177w2.f3835N;
        if (i == 6) {
            return;
        }
        if (i == 5) {
            C1903jp c1903jp = this.f547S;
            C1819iG c1819iG = c1903jp.f5941N;
            c1903jp.f5941N = C1819iG.f5685P;
            c1819iG.mo3379z();
            c1819iG.mo3377h();
            c1177w2.f3835N = 6;
            return;
        }
        throw new IllegalStateException("state: " + c1177w2.f3835N);
    }
}
