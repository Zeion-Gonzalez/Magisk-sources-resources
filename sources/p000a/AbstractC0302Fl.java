package p000a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.Fl */
/* loaded from: classes.dex */
public abstract class AbstractC0302Fl extends AbstractC2738zi implements InterfaceC1810i5 {
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* renamed from: g */
    public static final AtomicReferenceFieldUpdater f1044g = AtomicReferenceFieldUpdater.newUpdater(AbstractC0302Fl.class, Object.class, "_queue");

    /* renamed from: y */
    public static final AtomicReferenceFieldUpdater f1046y = AtomicReferenceFieldUpdater.newUpdater(AbstractC0302Fl.class, Object.class, "_delayed");

    /* renamed from: s */
    public static final AtomicIntegerFieldUpdater f1045s = AtomicIntegerFieldUpdater.newUpdater(AbstractC0302Fl.class, "_isCompleted");

    @Override // p000a.AbstractC1859j1
    /* renamed from: C */
    public final void mo195C(InterfaceC1255XS interfaceC1255XS, Runnable runnable) {
        mo641Ha(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0015, code lost:
    
        r3 = false;
     */
    /* renamed from: Ha */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo641Ha(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000a.AbstractC0302Fl.f1044g
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = p000a.AbstractC0302Fl.f1045s
            int r2 = r2.get(r6)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L12
            r2 = r3
            goto L13
        L12:
            r2 = r4
        L13:
            if (r2 == 0) goto L18
        L15:
            r3 = r4
            goto L76
        L18:
            if (r1 != 0) goto L2c
        L1a:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L23
            r4 = r3
            goto L29
        L23:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L1a
        L29:
            if (r4 == 0) goto L0
            goto L76
        L2c:
            boolean r2 = r1 instanceof p000a.C0892Qm
            if (r2 == 0) goto L51
            r2 = r1
            a.Qm r2 = (p000a.C0892Qm) r2
            int r5 = r2.m2040z(r7)
            if (r5 == 0) goto L76
            if (r5 == r3) goto L3f
            r0 = 2
            if (r5 == r0) goto L15
            goto L0
        L3f:
            a.Qm r2 = r2.m2039v()
        L43:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L4a
            goto L0
        L4a:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L43
            goto L0
        L51:
            a.DP r2 = p000a.AbstractC1292YB.f4142o
            if (r1 != r2) goto L56
            goto L15
        L56:
            a.Qm r2 = new a.Qm
            r5 = 8
            r2.<init>(r5, r3)
            r5 = r1
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r2.m2040z(r5)
            r2.m2040z(r7)
        L66:
            boolean r5 = r0.compareAndSet(r6, r1, r2)
            if (r5 == 0) goto L6e
            r4 = r3
            goto L74
        L6e:
            java.lang.Object r5 = r0.get(r6)
            if (r5 == r1) goto L66
        L74:
            if (r4 == 0) goto L0
        L76:
            if (r3 == 0) goto L86
            java.lang.Thread r7 = r6.mo3032he()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r7) goto L8b
            java.util.concurrent.locks.LockSupport.unpark(r7)
            goto L8b
        L86:
            a.dV r0 = p000a.RunnableC1568dV.f4832U
            r0.mo641Ha(r7)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0302Fl.mo641Ha(java.lang.Runnable):void");
    }

    /* renamed from: Pm */
    public final long m642Pm() {
        long j;
        C1200WR c1200wr = this.f8588q;
        if (c1200wr == null || c1200wr.isEmpty()) {
            j = Long.MAX_VALUE;
        } else {
            j = 0;
        }
        if (j == 0) {
            return 0L;
        }
        Object obj = f1044g.get(this);
        if (obj != null) {
            if (obj instanceof C0892Qm) {
                long j2 = C0892Qm.f3057Q.get((C0892Qm) obj);
                boolean z = false;
                if (((int) ((1073741823 & j2) >> 0)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
                    z = true;
                }
                if (!z) {
                    return 0L;
                }
            } else {
                if (obj == AbstractC1292YB.f4142o) {
                    return Long.MAX_VALUE;
                }
                return 0L;
            }
        }
        AbstractC0761OD abstractC0761OD = (AbstractC0761OD) f1046y.get(this);
        if (abstractC0761OD != null) {
            synchronized (abstractC0761OD) {
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // p000a.AbstractC2738zi
    /* renamed from: ZH */
    public final long mo643ZH() {
        Runnable runnable;
        boolean z;
        boolean z2;
        if (m4671Lq()) {
            return 0L;
        }
        AbstractC0761OD abstractC0761OD = (AbstractC0761OD) f1046y.get(this);
        if (abstractC0761OD != null) {
            if (abstractC0761OD.m3297z() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                System.nanoTime();
                synchronized (abstractC0761OD) {
                }
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1044g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (obj instanceof C0892Qm) {
                C0892Qm c0892Qm = (C0892Qm) obj;
                Object m2037P = c0892Qm.m2037P();
                if (m2037P != C0892Qm.f3058u) {
                    runnable = (Runnable) m2037P;
                    break;
                }
                C0892Qm m2039v = c0892Qm.m2039v();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m2039v) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else {
                if (obj == AbstractC1292YB.f4142o) {
                    break;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    runnable = (Runnable) obj;
                    break;
                }
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        return m642Pm();
    }

    /* renamed from: oI */
    public final boolean m644oI() {
        boolean z;
        boolean z2;
        C1200WR c1200wr = this.f8588q;
        if (c1200wr != null) {
            z = c1200wr.isEmpty();
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        AbstractC0761OD abstractC0761OD = (AbstractC0761OD) f1046y.get(this);
        if (abstractC0761OD != null) {
            if (abstractC0761OD.m3297z() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
        }
        Object obj = f1044g.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof C0892Qm) {
            long j = C0892Qm.f3057Q.get((C0892Qm) obj);
            if (((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC1292YB.f4142o) {
            return true;
        }
        return false;
    }

    @Override // p000a.AbstractC2738zi
    public void shutdown() {
        AbstractC1129V8.f3679z.set(null);
        f1045s.set(this, 1);
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1044g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C0175DP c0175dp = AbstractC1292YB.f4142o;
            boolean z = false;
            if (obj == null) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, c0175dp)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof C0892Qm) {
                    ((C0892Qm) obj).m2038h();
                    break;
                }
                if (obj == c0175dp) {
                    break;
                }
                C0892Qm c0892Qm = new C0892Qm(8, true);
                c0892Qm.m2040z((Runnable) obj);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0892Qm)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
        }
        do {
        } while (mo643ZH() <= 0);
        System.nanoTime();
        AbstractC0761OD abstractC0761OD = (AbstractC0761OD) f1046y.get(this);
        if (abstractC0761OD != null) {
            synchronized (abstractC0761OD) {
                if (abstractC0761OD.m3297z() > 0) {
                    C1769hG.f5572z.set(abstractC0761OD, abstractC0761OD.m3297z() - 1);
                    int m3297z = abstractC0761OD.m3297z();
                    abstractC0761OD.m3297z();
                    if (m3297z > 0) {
                        throw null;
                    }
                    throw null;
                }
            }
        }
    }
}
