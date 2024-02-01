package p000a;

import java.io.IOException;

/* renamed from: a.gR */
/* loaded from: classes.dex */
public final class C1723gR extends AbstractC1449bB {

    /* renamed from: R */
    public final C2323ri f5404R;

    /* renamed from: S */
    public final AbstractC1449bB f5405S;

    /* renamed from: w */
    public IOException f5406w;

    public C1723gR(AbstractC1449bB abstractC1449bB) {
        this.f5405S = abstractC1449bB;
        this.f5404R = new C2323ri(new C2289r6(this, abstractC1449bB.mo1577G()));
    }

    @Override // p000a.AbstractC1449bB
    /* renamed from: G */
    public final InterfaceC0694N7 mo1577G() {
        return this.f5404R;
    }

    @Override // p000a.AbstractC1449bB, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5405S.close();
    }

    @Override // p000a.AbstractC1449bB
    /* renamed from: h */
    public final C0003A3 mo1578h() {
        return this.f5405S.mo1578h();
    }

    @Override // p000a.AbstractC1449bB
    /* renamed from: z */
    public final long mo1579z() {
        return this.f5405S.mo1579z();
    }
}
