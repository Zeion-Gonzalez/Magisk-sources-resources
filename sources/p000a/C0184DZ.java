package p000a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.DZ */
/* loaded from: classes.dex */
public final class C0184DZ extends AbstractC0250Em {

    /* renamed from: q */
    public final C1525cm f569q;

    public C0184DZ(C1525cm c1525cm) {
        this.f569q = c1525cm;
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
        boolean z;
        C0757O9 m2778I = m2778I();
        C1525cm c1525cm = this.f569q;
        c1525cm.getClass();
        CancellationException m1741U = m2778I.m1741U();
        boolean z2 = false;
        if (c1525cm.m2958U()) {
            C2266qf c2266qf = (C2266qf) c1525cm.f4708I;
            c2266qf.getClass();
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2266qf.f6966y;
                Object obj = atomicReferenceFieldUpdater.get(c2266qf);
                C0175DP c0175dp = AbstractC2575wW.f7870U;
                boolean z3 = true;
                if (AbstractC1292YB.m2695u(obj, c0175dp)) {
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(c2266qf, c0175dp, m1741U)) {
                            z = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(c2266qf) != c0175dp) {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        break;
                    }
                } else {
                    if (obj instanceof Throwable) {
                        break;
                    }
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(c2266qf, obj, null)) {
                            break;
                        } else if (atomicReferenceFieldUpdater.get(c2266qf) != obj) {
                            z3 = false;
                            break;
                        }
                    }
                    if (z3) {
                        break;
                    }
                }
            }
            z2 = true;
        }
        if (!z2) {
            c1525cm.m2956R(m1741U);
            if (!c1525cm.m2958U()) {
                c1525cm.m2967w();
            }
        }
    }
}
