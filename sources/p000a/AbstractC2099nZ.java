package p000a;

/* renamed from: a.nZ */
/* loaded from: classes.dex */
public abstract class AbstractC2099nZ implements InterfaceC2578wb {

    /* renamed from: S */
    public final InterfaceC2578wb f6475S;

    public AbstractC2099nZ(InterfaceC2578wb interfaceC2578wb) {
        this.f6475S = interfaceC2578wb;
    }

    @Override // p000a.InterfaceC2578wb
    /* renamed from: P */
    public final C1819iG mo607P() {
        return this.f6475S.mo607P();
    }

    @Override // p000a.InterfaceC2578wb
    /* renamed from: Q */
    public void mo608Q(C2361sQ c2361sQ, long j) {
        this.f6475S.mo608Q(c2361sQ, j);
    }

    @Override // p000a.InterfaceC2578wb, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6475S.close();
    }

    @Override // p000a.InterfaceC2578wb, java.io.Flushable
    public void flush() {
        this.f6475S.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f6475S + ')';
    }
}
