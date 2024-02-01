package p000a;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: a.Ni */
/* loaded from: classes.dex */
public final class C0730Ni extends AbstractExecutorService {

    /* renamed from: R */
    public final C0442IO f2460R;

    /* renamed from: S */
    public final C2514vJ f2461S;

    /* renamed from: w */
    public final CountDownLatch f2462w;

    public C0730Ni(ExecutorC0094Bp executorC0094Bp) {
        C2514vJ c2514vJ = new C2514vJ(null);
        this.f2461S = c2514vJ;
        this.f2460R = AbstractC1843ih.m3468z(AbstractC0438II.m1002L(c2514vJ, executorC0094Bp));
        this.f2462w = new CountDownLatch(1);
        c2514vJ.m1746e(false, true, new C2670yQ(6, this));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f2462w.await(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC0438II.m994F(this.f2460R, null, new C1268Xm(runnable, null), 3);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f2461S.m1742X();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        if (this.f2461S.m1742X() && (!(r0.m1743Y() instanceof InterfaceC0732Nl)) != false) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f2461S.mo1719z(null);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        this.f2461S.mo1719z(null);
        return C1239X8.f4021S;
    }
}
