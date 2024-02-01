package p000a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.IJ */
/* loaded from: classes.dex */
public final class C0439IJ {
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    /* renamed from: z */
    public final AtomicReferenceArray f1472z = new AtomicReferenceArray(128);

    /* renamed from: h */
    public static final AtomicReferenceFieldUpdater f1470h = AtomicReferenceFieldUpdater.newUpdater(C0439IJ.class, Object.class, "lastScheduledTask");

    /* renamed from: v */
    public static final AtomicIntegerFieldUpdater f1471v = AtomicIntegerFieldUpdater.newUpdater(C0439IJ.class, "producerIndex");

    /* renamed from: P */
    public static final AtomicIntegerFieldUpdater f1469P = AtomicIntegerFieldUpdater.newUpdater(C0439IJ.class, "consumerIndex");

    /* renamed from: N */
    public static final AtomicIntegerFieldUpdater f1468N = AtomicIntegerFieldUpdater.newUpdater(C0439IJ.class, "blockingTasksInBuffer");

    /* renamed from: h */
    public final AbstractRunnableC2453uD m1055h() {
        AbstractRunnableC2453uD abstractRunnableC2453uD;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1469P;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f1471v.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (abstractRunnableC2453uD = (AbstractRunnableC2453uD) this.f1472z.getAndSet(i2, null)) != null) {
                boolean z = true;
                if (abstractRunnableC2453uD.f7529R.f6936S != 1) {
                    z = false;
                }
                if (z) {
                    f1468N.decrementAndGet(this);
                }
                return abstractRunnableC2453uD;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0018, code lost:
    
        if (r3 == r8) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x001e, code lost:
    
        if (r0.compareAndSet(r7, r1, null) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0020, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0026, code lost:
    
        if (r0.get(r7) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0028, code lost:
    
        if (r4 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002a, code lost:
    
        if (r8 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x002c, code lost:
    
        p000a.C0439IJ.f1468N.decrementAndGet(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0031, code lost:
    
        return r1;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000a.AbstractRunnableC2453uD m1056v(int r7, boolean r8) {
        /*
            r6 = this;
            r7 = r7 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f1472z
            java.lang.Object r1 = r0.get(r7)
            a.uD r1 = (p000a.AbstractRunnableC2453uD) r1
            r2 = 0
            if (r1 == 0) goto L32
            a.qQ r3 = r1.f7529R
            int r3 = r3.f6936S
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L17
            r3 = r5
            goto L18
        L17:
            r3 = r4
        L18:
            if (r3 != r8) goto L32
        L1a:
            boolean r3 = r0.compareAndSet(r7, r1, r2)
            if (r3 == 0) goto L22
            r4 = r5
            goto L28
        L22:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r1) goto L1a
        L28:
            if (r4 == 0) goto L32
            if (r8 == 0) goto L31
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = p000a.C0439IJ.f1468N
            r7.decrementAndGet(r6)
        L31:
            return r1
        L32:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0439IJ.m1056v(int, boolean):a.uD");
    }

    /* renamed from: z */
    public final AbstractRunnableC2453uD m1057z(AbstractRunnableC2453uD abstractRunnableC2453uD) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1471v;
        if (atomicIntegerFieldUpdater.get(this) - f1469P.get(this) == 127) {
            return abstractRunnableC2453uD;
        }
        boolean z = true;
        if (abstractRunnableC2453uD.f7529R.f6936S != 1) {
            z = false;
        }
        if (z) {
            f1468N.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f1472z;
            if (atomicReferenceArray.get(i) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i, abstractRunnableC2453uD);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }
}
