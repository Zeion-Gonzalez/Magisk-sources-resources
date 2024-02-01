package p000a;

/* renamed from: a.b2 */
/* loaded from: classes.dex */
public abstract class AbstractC1442b2 implements InterfaceC0984SS {

    /* renamed from: S */
    public final InterfaceC0984SS f4518S;

    public AbstractC1442b2(InterfaceC0984SS interfaceC0984SS) {
        this.f4518S = interfaceC0984SS;
    }

    @Override // p000a.InterfaceC0984SS
    /* renamed from: M */
    public long mo188M(C2361sQ c2361sQ, long j) {
        return this.f4518S.mo188M(c2361sQ, j);
    }

    @Override // p000a.InterfaceC0984SS
    /* renamed from: P */
    public final C1819iG mo189P() {
        return this.f4518S.mo189P();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4518S.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f4518S + ')';
    }
}
