package p000a;

import java.util.concurrent.Executor;

/* renamed from: a.Bp */
/* loaded from: classes.dex */
public final class ExecutorC0094Bp extends AbstractC1209Wb implements Executor {

    /* renamed from: I */
    public static final AbstractC1859j1 f354I;

    /* renamed from: w */
    public static final ExecutorC0094Bp f355w = new ExecutorC0094Bp();

    static {
        AbstractC1859j1 abstractC1859j1 = C0619Le.f2024w;
        int i = AbstractC2655y4.f8274z;
        if (64 >= i) {
            i = 64;
        }
        int m2685nF = AbstractC1292YB.m2685nF("kotlinx.coroutines.io.parallelism", i, 0, 0, 12);
        AbstractC1843ih.m3417M(m2685nF);
        if (m2685nF < AbstractC0331GL.f1125P) {
            AbstractC1843ih.m3417M(m2685nF);
            abstractC1859j1 = new C1947kf(m2685nF);
        }
        f354I = abstractC1859j1;
    }

    @Override // p000a.AbstractC1859j1
    /* renamed from: C */
    public final void mo195C(InterfaceC1255XS interfaceC1255XS, Runnable runnable) {
        f354I.mo195C(interfaceC1255XS, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo195C(C0070BN.f302S, runnable);
    }

    @Override // p000a.AbstractC1859j1
    public final String toString() {
        return "Dispatchers.IO";
    }
}
