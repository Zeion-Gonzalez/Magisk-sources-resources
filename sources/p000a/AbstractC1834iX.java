package p000a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.iX */
/* loaded from: classes.dex */
public abstract class AbstractC1834iX {
    private volatile Object _next;
    private volatile Object _prev;

    /* renamed from: S */
    public static final AtomicReferenceFieldUpdater f5734S = AtomicReferenceFieldUpdater.newUpdater(AbstractC1834iX.class, Object.class, "_next");

    /* renamed from: R */
    public static final AtomicReferenceFieldUpdater f5733R = AtomicReferenceFieldUpdater.newUpdater(AbstractC1834iX.class, Object.class, "_prev");

    public AbstractC1834iX(AbstractC1834iX abstractC1834iX) {
        this._prev = abstractC1834iX;
    }

    /* renamed from: P */
    public final void m3384P() {
        boolean z;
        AbstractC1834iX abstractC1834iX;
        boolean z2;
        boolean z3;
        AbstractC1834iX m3385h;
        if (m3385h() == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5733R;
            AbstractC1834iX abstractC1834iX2 = (AbstractC1834iX) atomicReferenceFieldUpdater.get(this);
            while (abstractC1834iX2 != null && abstractC1834iX2.mo3386v()) {
                abstractC1834iX2 = (AbstractC1834iX) atomicReferenceFieldUpdater.get(abstractC1834iX2);
            }
            AbstractC1834iX m3385h2 = m3385h();
            while (m3385h2.mo3386v() && (m3385h = m3385h2.m3385h()) != null) {
                m3385h2 = m3385h;
            }
            do {
                Object obj = atomicReferenceFieldUpdater.get(m3385h2);
                if (((AbstractC1834iX) obj) == null) {
                    abstractC1834iX = null;
                } else {
                    abstractC1834iX = abstractC1834iX2;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(m3385h2, obj, abstractC1834iX)) {
                        z2 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(m3385h2) != obj) {
                        z2 = false;
                        break;
                    }
                }
            } while (!z2);
            if (abstractC1834iX2 != null) {
                f5734S.set(abstractC1834iX2, m3385h2);
            }
            if (m3385h2.mo3386v()) {
                if (m3385h2.m3385h() == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    continue;
                }
            }
            if (abstractC1834iX2 == null || !abstractC1834iX2.mo3386v()) {
                return;
            }
        }
    }

    /* renamed from: h */
    public final AbstractC1834iX m3385h() {
        Object obj = f5734S.get(this);
        if (obj == AbstractC0795Op.f2703P) {
            return null;
        }
        return (AbstractC1834iX) obj;
    }

    /* renamed from: v */
    public abstract boolean mo3386v();

    /* renamed from: z */
    public final void m3387z() {
        f5733R.lazySet(this, null);
    }
}
