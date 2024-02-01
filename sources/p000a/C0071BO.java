package p000a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.BO */
/* loaded from: classes.dex */
public final class C0071BO extends AbstractC1500cH {

    /* renamed from: N */
    public final AtomicReferenceFieldUpdater f303N;

    /* renamed from: P */
    public final AtomicReferenceFieldUpdater f304P;

    /* renamed from: Q */
    public final AtomicReferenceFieldUpdater f305Q;

    /* renamed from: h */
    public final AtomicReferenceFieldUpdater f306h;

    /* renamed from: v */
    public final AtomicReferenceFieldUpdater f307v;

    public C0071BO(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super((Object) null);
        this.f306h = atomicReferenceFieldUpdater;
        this.f307v = atomicReferenceFieldUpdater2;
        this.f304P = atomicReferenceFieldUpdater3;
        this.f303N = atomicReferenceFieldUpdater4;
        this.f305Q = atomicReferenceFieldUpdater5;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: E */
    public final void mo137E(C1590dx c1590dx, Thread thread) {
        this.f306h.lazySet(c1590dx, thread);
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: N */
    public final boolean mo138N(AbstractFutureC1350ZH abstractFutureC1350ZH, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f305Q;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1350ZH, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1350ZH) == obj);
        return false;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: P */
    public final boolean mo139P(AbstractFutureC1350ZH abstractFutureC1350ZH, C1074U8 c1074u8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1074U8 c1074u82 = C1074U8.f3541h;
        do {
            atomicReferenceFieldUpdater = this.f303N;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1350ZH, c1074u8, c1074u82)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1350ZH) == c1074u8);
        return false;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: Q */
    public final boolean mo140Q(AbstractFutureC1350ZH abstractFutureC1350ZH, C1590dx c1590dx, C1590dx c1590dx2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f304P;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1350ZH, c1590dx, c1590dx2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC1350ZH) == c1590dx);
        return false;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: U */
    public final void mo141U(C1590dx c1590dx, C1590dx c1590dx2) {
        this.f307v.lazySet(c1590dx, c1590dx2);
    }
}
