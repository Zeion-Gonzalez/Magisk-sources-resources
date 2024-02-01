package p000a;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: a.FU */
/* loaded from: classes.dex */
public final class ExecutorC0289FU implements Executor, Closeable {

    /* renamed from: I */
    public final String f1005I;

    /* renamed from: R */
    public final int f1006R;

    /* renamed from: S */
    public final int f1007S;
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: g */
    public final C0406Hi f1008g;

    /* renamed from: k */
    public final C1749gt f1009k;
    private volatile long parkedWorkersStack;

    /* renamed from: q */
    public final C1749gt f1010q;

    /* renamed from: w */
    public final long f1011w;

    /* renamed from: y */
    public static final AtomicLongFieldUpdater f1004y = AtomicLongFieldUpdater.newUpdater(ExecutorC0289FU.class, "parkedWorkersStack");

    /* renamed from: s */
    public static final AtomicLongFieldUpdater f1003s = AtomicLongFieldUpdater.newUpdater(ExecutorC0289FU.class, "controlState");

    /* renamed from: U */
    public static final AtomicIntegerFieldUpdater f1002U = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0289FU.class, "_isTerminated");

    /* renamed from: E */
    public static final C0175DP f1001E = new C0175DP(1, "NOT_IN_STACK");

    public ExecutorC0289FU(int i, int i2, long j, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f1007S = i;
        this.f1006R = i2;
        this.f1011w = j;
        this.f1005I = str;
        if (i >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= 2097150) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (j > 0) {
                        this.f1010q = new C1749gt();
                        this.f1009k = new C1749gt();
                        this.f1008g = new C0406Hi((i + 1) * 2);
                        this.controlState = i << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(AbstractC2441tz.m4190Q("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4190Q("Core pool size ", i, " should be at least 1").toString());
    }

    /* renamed from: G */
    public final void m598G(C1786ha c1786ha, int i, int i2) {
        while (true) {
            long j = f1004y.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    C1786ha c1786ha2 = c1786ha;
                    while (true) {
                        Object m3322v = c1786ha2.m3322v();
                        if (m3322v == f1001E) {
                            i3 = -1;
                            break;
                        }
                        if (m3322v == null) {
                            i3 = 0;
                            break;
                        }
                        c1786ha2 = (C1786ha) m3322v;
                        int m3319h = c1786ha2.m3319h();
                        if (m3319h != 0) {
                            i3 = m3319h;
                            break;
                        }
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0 && f1004y.compareAndSet(this, j, i3 | j2)) {
                return;
            }
        }
    }

    /* renamed from: V */
    public final boolean m599V(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f1007S;
        if (i < i2) {
            int m602z = m602z();
            if (m602z == 1 && i2 > 1) {
                m602z();
            }
            if (m602z > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
    
        if (r1 == null) goto L40;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000a.ExecutorC0289FU.f1002U
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto Lc
            goto Laf
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r3 = r0 instanceof p000a.C1786ha
            r4 = 0
            if (r3 == 0) goto L18
            a.ha r0 = (p000a.C1786ha) r0
            goto L19
        L18:
            r0 = r4
        L19:
            if (r0 == 0) goto L24
            a.FU r3 = r0.f5615y
            boolean r3 = p000a.AbstractC1292YB.m2695u(r3, r9)
            if (r3 == 0) goto L24
            goto L25
        L24:
            r0 = r4
        L25:
            a.Hi r3 = r9.f1008g
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = p000a.ExecutorC0289FU.f1003s     // Catch: java.lang.Throwable -> Lc1
            long r5 = r5.get(r9)     // Catch: java.lang.Throwable -> Lc1
            r7 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r7
            int r5 = (int) r5
            monitor-exit(r3)
            if (r2 > r5) goto L77
            r3 = r2
        L37:
            a.Hi r6 = r9.f1008g
            java.lang.Object r6 = r6.m909h(r3)
            a.ha r6 = (p000a.C1786ha) r6
            if (r6 == r0) goto L72
        L41:
            boolean r7 = r6.isAlive()
            if (r7 == 0) goto L50
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r7 = 10000(0x2710, double:4.9407E-320)
            r6.join(r7)
            goto L41
        L50:
            a.IJ r6 = r6.f5610S
            a.gt r7 = r9.f1009k
            r6.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = p000a.C0439IJ.f1470h
            java.lang.Object r8 = r8.getAndSet(r6, r4)
            a.uD r8 = (p000a.AbstractRunnableC2453uD) r8
            if (r8 == 0) goto L64
            r7.m648z(r8)
        L64:
            a.uD r8 = r6.m1055h()
            if (r8 != 0) goto L6c
            r8 = r1
            goto L70
        L6c:
            r7.m648z(r8)
            r8 = r2
        L70:
            if (r8 != 0) goto L64
        L72:
            if (r3 == r5) goto L77
            int r3 = r3 + 1
            goto L37
        L77:
            a.gt r1 = r9.f1009k
            r1.m646h()
            a.gt r1 = r9.f1010q
            r1.m646h()
        L81:
            if (r0 == 0) goto L89
            a.uD r1 = r0.m3323z(r2)
            if (r1 != 0) goto Lb0
        L89:
            a.gt r1 = r9.f1010q
            java.lang.Object r1 = r1.m645P()
            a.uD r1 = (p000a.AbstractRunnableC2453uD) r1
            if (r1 != 0) goto Lb0
            a.gt r1 = r9.f1009k
            java.lang.Object r1 = r1.m645P()
            a.uD r1 = (p000a.AbstractRunnableC2453uD) r1
            if (r1 != 0) goto Lb0
            if (r0 == 0) goto La3
            r1 = 5
            r0.m3320o(r1)
        La3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000a.ExecutorC0289FU.f1004y
            r1 = 0
            r0.set(r9, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000a.ExecutorC0289FU.f1003s
            r0.set(r9, r1)
        Laf:
            return
        Lb0:
            r1.run()     // Catch: java.lang.Throwable -> Lb4
            goto L81
        Lb4:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L81
        Lc1:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.ExecutorC0289FU.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m600h(runnable, AbstractC0331GL.f1129u, false);
    }

    /* renamed from: h */
    public final void m600h(Runnable runnable, C2252qQ c2252qQ, boolean z) {
        AbstractRunnableC2453uD c1551dC;
        boolean z2;
        long j;
        C1786ha c1786ha;
        boolean z3;
        C1749gt c1749gt;
        int i;
        AbstractC0331GL.f1126Q.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC2453uD) {
            c1551dC = (AbstractRunnableC2453uD) runnable;
            c1551dC.f7530S = nanoTime;
            c1551dC.f7529R = c2252qQ;
        } else {
            c1551dC = new C1551dC(runnable, nanoTime, c2252qQ);
        }
        boolean z4 = false;
        if (c1551dC.f7529R.f6936S == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1003s;
        if (z2) {
            j = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C1786ha) {
            c1786ha = (C1786ha) currentThread;
        } else {
            c1786ha = null;
        }
        if (c1786ha == null || !AbstractC1292YB.m2695u(c1786ha.f5615y, this)) {
            c1786ha = null;
        }
        if (c1786ha != null && (i = c1786ha.f5614w) != 5 && (c1551dC.f7529R.f6936S != 0 || i != 2)) {
            c1786ha.f5611g = true;
            C0439IJ c0439ij = c1786ha.f5610S;
            if (z) {
                c1551dC = c0439ij.m1057z(c1551dC);
            } else {
                c0439ij.getClass();
                AbstractRunnableC2453uD abstractRunnableC2453uD = (AbstractRunnableC2453uD) C0439IJ.f1470h.getAndSet(c0439ij, c1551dC);
                if (abstractRunnableC2453uD == null) {
                    c1551dC = null;
                } else {
                    c1551dC = c0439ij.m1057z(abstractRunnableC2453uD);
                }
            }
        }
        if (c1551dC != null) {
            if (c1551dC.f7529R.f6936S == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                c1749gt = this.f1009k;
            } else {
                c1749gt = this.f1010q;
            }
            if (!c1749gt.m648z(c1551dC)) {
                throw new RejectedExecutionException(AbstractC2441tz.m4187M(new StringBuilder(), this.f1005I, " was terminated"));
            }
        }
        if (z && c1786ha != null) {
            z4 = true;
        }
        if (z2) {
            if (!z4 && !m601y() && !m599V(j)) {
                m601y();
                return;
            }
            return;
        }
        if (!z4 && !m601y() && !m599V(atomicLongFieldUpdater.get(this))) {
            m601y();
        }
    }

    public final String toString() {
        int i;
        StringBuilder sb;
        char c;
        ArrayList arrayList = new ArrayList();
        C0406Hi c0406Hi = this.f1008g;
        int m911z = c0406Hi.m911z();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < m911z; i7++) {
            C1786ha c1786ha = (C1786ha) c0406Hi.m909h(i7);
            if (c1786ha != null) {
                C0439IJ c0439ij = c1786ha.f5610S;
                c0439ij.getClass();
                if (C0439IJ.f1470h.get(c0439ij) != null) {
                    i = (C0439IJ.f1471v.get(c0439ij) - C0439IJ.f1469P.get(c0439ij)) + 1;
                } else {
                    i = C0439IJ.f1471v.get(c0439ij) - C0439IJ.f1469P.get(c0439ij);
                }
                int m4204s = AbstractC2441tz.m4204s(c1786ha.f5614w);
                if (m4204s != 0) {
                    if (m4204s != 1) {
                        if (m4204s != 2) {
                            if (m4204s != 3) {
                                if (m4204s == 4) {
                                    i6++;
                                }
                            } else {
                                i5++;
                                if (i > 0) {
                                    sb = new StringBuilder();
                                    sb.append(i);
                                    c = 'd';
                                }
                            }
                        } else {
                            i4++;
                        }
                    } else {
                        i3++;
                        sb = new StringBuilder();
                        sb.append(i);
                        c = 'b';
                    }
                } else {
                    i2++;
                    sb = new StringBuilder();
                    sb.append(i);
                    c = 'c';
                }
                sb.append(c);
                arrayList.add(sb.toString());
            }
        }
        long j = f1003s.get(this);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1005I);
        sb2.append('@');
        sb2.append(AbstractC2575wW.m4418Y(this));
        sb2.append("[Pool Size {core = ");
        int i8 = this.f1007S;
        sb2.append(i8);
        sb2.append(", max = ");
        sb2.append(this.f1006R);
        sb2.append("}, Worker States {CPU = ");
        sb2.append(i2);
        sb2.append(", blocking = ");
        sb2.append(i3);
        sb2.append(", parked = ");
        sb2.append(i4);
        sb2.append(", dormant = ");
        sb2.append(i5);
        sb2.append(", terminated = ");
        sb2.append(i6);
        sb2.append("}, running workers queues = ");
        sb2.append(arrayList);
        sb2.append(", global CPU queue size = ");
        sb2.append(this.f1010q.m647v());
        sb2.append(", global blocking queue size = ");
        sb2.append(this.f1009k.m647v());
        sb2.append(", Control State {created workers= ");
        sb2.append((int) (2097151 & j));
        sb2.append(", blocking tasks = ");
        sb2.append((int) ((4398044413952L & j) >> 21));
        sb2.append(", CPUs acquired = ");
        sb2.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb2.append("}]");
        return sb2.toString();
    }

    /* renamed from: y */
    public final boolean m601y() {
        C0175DP c0175dp;
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1004y;
            long j = atomicLongFieldUpdater.get(this);
            C1786ha c1786ha = (C1786ha) this.f1008g.m909h((int) (2097151 & j));
            if (c1786ha == null) {
                c1786ha = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                C1786ha c1786ha2 = c1786ha;
                while (true) {
                    Object m3322v = c1786ha2.m3322v();
                    c0175dp = f1001E;
                    if (m3322v == c0175dp) {
                        i = -1;
                        break;
                    }
                    if (m3322v == null) {
                        i = 0;
                        break;
                    }
                    c1786ha2 = (C1786ha) m3322v;
                    i = c1786ha2.m3319h();
                    if (i != 0) {
                        break;
                    }
                }
                if (i >= 0 && atomicLongFieldUpdater.compareAndSet(this, j, j2 | i)) {
                    c1786ha.m3321u(c0175dp);
                }
            }
            if (c1786ha == null) {
                return false;
            }
            if (C1786ha.f5607s.compareAndSet(c1786ha, -1, 0)) {
                LockSupport.unpark(c1786ha);
                return true;
            }
        }
    }

    /* renamed from: z */
    public final int m602z() {
        boolean z;
        boolean z2;
        synchronized (this.f1008g) {
            boolean z3 = false;
            if (f1002U.get(this) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1003s;
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.f1007S) {
                return 0;
            }
            if (i >= this.f1006R) {
                return 0;
            }
            int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
            if (i3 > 0 && this.f1008g.m909h(i3) == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C1786ha c1786ha = new C1786ha(this, i3);
                this.f1008g.m910v(i3, c1786ha);
                if (i3 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    z3 = true;
                }
                if (z3) {
                    int i4 = i2 + 1;
                    c1786ha.start();
                    return i4;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
