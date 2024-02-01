package p000a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.Fn */
/* loaded from: classes.dex */
public class C0304Fn {

    /* renamed from: z */
    public static final AtomicReferenceFieldUpdater f1048z = AtomicReferenceFieldUpdater.newUpdater(C0304Fn.class, Object.class, "_cur");
    private volatile Object _cur = new C0892Qm(8, false);

    /* renamed from: P */
    public final Object m645P() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1048z;
            C0892Qm c0892Qm = (C0892Qm) atomicReferenceFieldUpdater.get(this);
            Object m2037P = c0892Qm.m2037P();
            if (m2037P != C0892Qm.f3058u) {
                return m2037P;
            }
            C0892Qm m2039v = c0892Qm.m2039v();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0892Qm, m2039v) && atomicReferenceFieldUpdater.get(this) == c0892Qm) {
            }
        }
    }

    /* renamed from: h */
    public final void m646h() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1048z;
            C0892Qm c0892Qm = (C0892Qm) atomicReferenceFieldUpdater.get(this);
            if (c0892Qm.m2038h()) {
                return;
            }
            C0892Qm m2039v = c0892Qm.m2039v();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0892Qm, m2039v) && atomicReferenceFieldUpdater.get(this) == c0892Qm) {
            }
        }
    }

    /* renamed from: v */
    public final int m647v() {
        C0892Qm c0892Qm = (C0892Qm) f1048z.get(this);
        c0892Qm.getClass();
        long j = C0892Qm.f3057Q.get(c0892Qm);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    /* renamed from: z */
    public final boolean m648z(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1048z;
            C0892Qm c0892Qm = (C0892Qm) atomicReferenceFieldUpdater.get(this);
            int m2040z = c0892Qm.m2040z(obj);
            if (m2040z == 0) {
                return true;
            }
            if (m2040z == 1) {
                C0892Qm m2039v = c0892Qm.m2039v();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c0892Qm, m2039v) && atomicReferenceFieldUpdater.get(this) == c0892Qm) {
                }
            } else if (m2040z == 2) {
                return false;
            }
        }
    }
}
