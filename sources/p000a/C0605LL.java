package p000a;

/* renamed from: a.LL */
/* loaded from: classes.dex */
public final class C0605LL implements InterfaceC2578wb {

    /* renamed from: R */
    public boolean f1966R;

    /* renamed from: S */
    public final C1903jp f1967S;

    /* renamed from: w */
    public final /* synthetic */ C1177W2 f1968w;

    public C0605LL(C1177W2 c1177w2) {
        this.f1968w = c1177w2;
        this.f1967S = new C1903jp(c1177w2.f3836P.mo607P());
    }

    @Override // p000a.InterfaceC2578wb
    /* renamed from: P */
    public final C1819iG mo607P() {
        return this.f1967S;
    }

    @Override // p000a.InterfaceC2578wb
    /* renamed from: Q */
    public final void mo608Q(C2361sQ c2361sQ, long j) {
        if ((!this.f1966R) != false) {
            AbstractC1181W6.m2424h(c2361sQ.f7260R, 0L, j);
            this.f1968w.f3836P.mo608Q(c2361sQ, j);
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000a.InterfaceC2578wb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1966R) {
            return;
        }
        this.f1966R = true;
        C1177W2 c1177w2 = this.f1968w;
        c1177w2.getClass();
        C1903jp c1903jp = this.f1967S;
        C1819iG c1819iG = c1903jp.f5941N;
        c1903jp.f5941N = C1819iG.f5685P;
        c1819iG.mo3379z();
        c1819iG.mo3377h();
        c1177w2.f3835N = 3;
    }

    @Override // p000a.InterfaceC2578wb, java.io.Flushable
    public final void flush() {
        if (this.f1966R) {
            return;
        }
        this.f1968w.f3836P.flush();
    }
}
