package p000a;

/* renamed from: a.jn */
/* loaded from: classes.dex */
public final class C1901jn implements InterfaceC2578wb {

    /* renamed from: R */
    public boolean f5937R;

    /* renamed from: S */
    public final C1903jp f5938S;

    /* renamed from: w */
    public final /* synthetic */ C1177W2 f5939w;

    public C1901jn(C1177W2 c1177w2) {
        this.f5939w = c1177w2;
        this.f5938S = new C1903jp(c1177w2.f3836P.mo607P());
    }

    @Override // p000a.InterfaceC2578wb
    /* renamed from: P */
    public final C1819iG mo607P() {
        return this.f5938S;
    }

    @Override // p000a.InterfaceC2578wb
    /* renamed from: Q */
    public final void mo608Q(C2361sQ c2361sQ, long j) {
        if ((!this.f5937R) != false) {
            if (j == 0) {
                return;
            }
            C1177W2 c1177w2 = this.f5939w;
            c1177w2.f3836P.mo940R(j);
            c1177w2.f3836P.mo938K("\r\n");
            c1177w2.f3836P.mo608Q(c2361sQ, j);
            c1177w2.f3836P.mo938K("\r\n");
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000a.InterfaceC2578wb, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f5937R) {
            return;
        }
        this.f5937R = true;
        this.f5939w.f3836P.mo938K("0\r\n\r\n");
        C1177W2 c1177w2 = this.f5939w;
        C1903jp c1903jp = this.f5938S;
        c1177w2.getClass();
        C1819iG c1819iG = c1903jp.f5941N;
        c1903jp.f5941N = C1819iG.f5685P;
        c1819iG.mo3379z();
        c1819iG.mo3377h();
        this.f5939w.f3835N = 3;
    }

    @Override // p000a.InterfaceC2578wb, java.io.Flushable
    public final synchronized void flush() {
        if (this.f5937R) {
            return;
        }
        this.f5939w.f3836P.flush();
    }
}
