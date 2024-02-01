package p000a;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* renamed from: a.mX */
/* loaded from: classes.dex */
public abstract class AbstractC2044mX extends AbstractC1209Wb {

    /* renamed from: w */
    public final ExecutorC0289FU f6368w;

    public AbstractC2044mX(int i, int i2, long j, String str) {
        this.f6368w = new ExecutorC0289FU(i, i2, j, str);
    }

    @Override // p000a.AbstractC1859j1
    /* renamed from: C */
    public final void mo195C(InterfaceC1255XS interfaceC1255XS, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0289FU.f1004y;
        this.f6368w.m600h(runnable, AbstractC0331GL.f1129u, false);
    }
}
