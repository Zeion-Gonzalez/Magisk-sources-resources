package p000a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: a.AA */
/* loaded from: classes.dex */
public final class C0010AA extends C2485ur {

    /* renamed from: q */
    public static final AtomicIntegerFieldUpdater f97q = AtomicIntegerFieldUpdater.newUpdater(C0010AA.class, "_decision");
    private volatile int _decision;

    @Override // p000a.C2485ur, p000a.C0757O9
    /* renamed from: M */
    public final void mo31M(Object obj) {
        boolean z;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f97q;
            int i = atomicIntegerFieldUpdater.get(this);
            z = false;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, 0, 2)) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        AbstractC2575wW.m4428dx(AbstractC0438II.m1026e(this.f7618I), AbstractC0438II.m1001K(obj), null);
    }

    @Override // p000a.C2485ur, p000a.C0757O9
    /* renamed from: W */
    public final void mo32W(Object obj) {
        mo31M(obj);
    }
}
