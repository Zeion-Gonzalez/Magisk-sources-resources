package p000a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: a.wT */
/* loaded from: classes.dex */
public final class C2572wT extends AbstractC0250Em {

    /* renamed from: k */
    public static final AtomicIntegerFieldUpdater f7849k = AtomicIntegerFieldUpdater.newUpdater(C2572wT.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: q */
    public final InterfaceC2364sT f7850q;

    public C2572wT(InterfaceC2364sT interfaceC2364sT) {
        this.f7850q = interfaceC2364sT;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final /* bridge */ /* synthetic */ Object mo85W(Object obj) {
        mo364q((Throwable) obj);
        return C0329GJ.f1115z;
    }

    @Override // p000a.AbstractC1380Zq
    /* renamed from: q */
    public final void mo364q(Throwable th) {
        if (f7849k.compareAndSet(this, 0, 1)) {
            this.f7850q.mo85W(th);
        }
    }
}
