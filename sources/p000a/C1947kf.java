package p000a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: a.kf */
/* loaded from: classes.dex */
public final class C1947kf extends AbstractC1859j1 implements InterfaceC1810i5 {

    /* renamed from: g */
    public static final AtomicIntegerFieldUpdater f6035g = AtomicIntegerFieldUpdater.newUpdater(C1947kf.class, "runningWorkers");

    /* renamed from: I */
    public final int f6036I;

    /* renamed from: k */
    public final Object f6037k;

    /* renamed from: q */
    public final C0304Fn f6038q;
    private volatile int runningWorkers;

    /* renamed from: w */
    public final AbstractC1859j1 f6039w;

    public C1947kf(int i) {
        InterfaceC1810i5 interfaceC1810i5;
        C0619Le c0619Le = C0619Le.f2024w;
        this.f6039w = c0619Le;
        this.f6036I = i;
        if (c0619Le instanceof InterfaceC1810i5) {
            interfaceC1810i5 = (InterfaceC1810i5) c0619Le;
        } else {
            interfaceC1810i5 = null;
        }
        if (interfaceC1810i5 == null) {
            int i2 = AbstractC2519vO.f7713z;
        }
        this.f6038q = new C0304Fn();
        this.f6037k = new Object();
    }

    /* renamed from: BO */
    public final Runnable m3559BO() {
        while (true) {
            Runnable runnable = (Runnable) this.f6038q.m645P();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f6037k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6035g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f6038q.m647v() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // p000a.AbstractC1859j1
    /* renamed from: C */
    public final void mo195C(InterfaceC1255XS interfaceC1255XS, Runnable runnable) {
        boolean z;
        Runnable m3559BO;
        this.f6038q.m648z(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6035g;
        if (atomicIntegerFieldUpdater.get(this) < this.f6036I) {
            synchronized (this.f6037k) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f6036I) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z = true;
                }
            }
            if (z && (m3559BO = m3559BO()) != null) {
                this.f6039w.mo195C(this, new RunnableC1387Zz(this, 4, m3559BO));
            }
        }
    }
}
