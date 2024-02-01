package p000a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.Df */
/* loaded from: classes.dex */
public final class C0190Df implements InterfaceC1057Tq {
    private volatile int _availablePermits;
    private volatile long deqIdx;
    private volatile long enqIdx;

    /* renamed from: h */
    public final C2670yQ f589h;
    private volatile Object head;
    private volatile Object tail;

    /* renamed from: z */
    public final int f590z;

    /* renamed from: v */
    public static final AtomicReferenceFieldUpdater f588v = AtomicReferenceFieldUpdater.newUpdater(C0190Df.class, Object.class, "head");

    /* renamed from: P */
    public static final AtomicLongFieldUpdater f585P = AtomicLongFieldUpdater.newUpdater(C0190Df.class, "deqIdx");

    /* renamed from: N */
    public static final AtomicReferenceFieldUpdater f584N = AtomicReferenceFieldUpdater.newUpdater(C0190Df.class, Object.class, "tail");

    /* renamed from: Q */
    public static final AtomicLongFieldUpdater f586Q = AtomicLongFieldUpdater.newUpdater(C0190Df.class, "enqIdx");

    /* renamed from: u */
    public static final AtomicIntegerFieldUpdater f587u = AtomicIntegerFieldUpdater.newUpdater(C0190Df.class, "_availablePermits");

    public C0190Df(int i, int i2) {
        boolean z;
        this.f590z = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= 0 && i2 <= i) {
                C2681yd c2681yd = new C2681yd(0L, null, 2);
                this.head = c2681yd;
                this.tail = c2681yd;
                this._availablePermits = i - i2;
                this.f589h = new C2670yQ(14, this);
                return;
            }
            throw new IllegalArgumentException(AbstractC2441tz.m4188N("The number of acquired permits should be in 0..", i).toString());
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4188N("Semaphore should have at least 1 permit, but had ", i).toString());
    }

    /* renamed from: h */
    public final void m374h() {
        int i;
        Object m1876y;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f587u;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.f590z;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f588v;
            C2681yd c2681yd = (C2681yd) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f585P.getAndIncrement(this);
            long j = andIncrement2 / AbstractC1327Ys.f4208Q;
            C1711gA c1711gA = C1711gA.f5386s;
            do {
                m1876y = AbstractC0795Op.m1876y(c2681yd, j, c1711gA);
                if (AbstractC1843ih.m3397B(m1876y)) {
                    break;
                }
                AbstractC2025m7 m3446i = AbstractC1843ih.m3446i(m1876y);
                while (true) {
                    AbstractC2025m7 abstractC2025m7 = (AbstractC2025m7) atomicReferenceFieldUpdater.get(this);
                    if (abstractC2025m7.f6289w >= m3446i.f6289w) {
                        break;
                    }
                    if (!m3446i.m3662W()) {
                        z4 = false;
                        break;
                    }
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC2025m7, m3446i)) {
                            z5 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(this) != abstractC2025m7) {
                            z5 = false;
                            break;
                        }
                    }
                    if (z5) {
                        if (abstractC2025m7.m3661N()) {
                            abstractC2025m7.m3384P();
                        }
                    } else if (m3446i.m3661N()) {
                        m3446i.m3384P();
                    }
                }
                z4 = true;
            } while (!z4);
            C2681yd c2681yd2 = (C2681yd) AbstractC1843ih.m3446i(m1876y);
            c2681yd2.m3387z();
            if (c2681yd2.f6289w <= j) {
                int i3 = (int) (andIncrement2 % AbstractC1327Ys.f4208Q);
                C0175DP c0175dp = AbstractC1327Ys.f4209h;
                AtomicReferenceArray atomicReferenceArray = c2681yd2.f8363q;
                Object andSet = atomicReferenceArray.getAndSet(i3, c0175dp);
                if (andSet == null) {
                    int i4 = AbstractC1327Ys.f4211z;
                    int i5 = 0;
                    while (true) {
                        if (i5 < i4) {
                            if (atomicReferenceArray.get(i3) == AbstractC1327Ys.f4210v) {
                                z = true;
                                break;
                            }
                            i5++;
                        } else {
                            C0175DP c0175dp2 = AbstractC1327Ys.f4209h;
                            C0175DP c0175dp3 = AbstractC1327Ys.f4207P;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i3, c0175dp2, c0175dp3)) {
                                    z2 = true;
                                    z3 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i3) != c0175dp2) {
                                    z2 = true;
                                    z3 = false;
                                    break;
                                }
                            }
                            z = z3 ^ z2;
                        }
                    }
                } else if (andSet != AbstractC1327Ys.f4206N) {
                    if (andSet instanceof InterfaceC2363sS) {
                        C1525cm c1525cm = (C1525cm) ((InterfaceC2363sS) andSet);
                        if (c1525cm.m2954J(C0329GJ.f1115z, this.f589h) != null) {
                            c1525cm.m2953I(c1525cm.f2384w);
                            z = true;
                        }
                    } else {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                }
            }
            z = false;
        } while (!z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0058, code lost:
    
        r10 = true;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m375z(p000a.C1525cm r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p000a.C0190Df.f584N
            java.lang.Object r3 = r2.get(r0)
            a.yd r3 = (p000a.C2681yd) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p000a.C0190Df.f586Q
            long r4 = r4.getAndIncrement(r0)
            a.Gr r6 = p000a.C0358Gr.f1208s
            int r7 = p000a.AbstractC1327Ys.f4208Q
            long r7 = (long) r7
            long r7 = r4 / r7
        L19:
            java.lang.Object r9 = p000a.AbstractC0795Op.m1876y(r3, r7, r6)
            boolean r10 = p000a.AbstractC1843ih.m3397B(r9)
            if (r10 != 0) goto L66
            a.m7 r10 = p000a.AbstractC1843ih.m3446i(r9)
        L27:
            java.lang.Object r13 = r2.get(r0)
            a.m7 r13 = (p000a.AbstractC2025m7) r13
            long r14 = r13.f6289w
            long r11 = r10.f6289w
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 < 0) goto L36
            goto L58
        L36:
            boolean r11 = r10.m3662W()
            if (r11 != 0) goto L3e
            r10 = 0
            goto L59
        L3e:
            boolean r11 = r2.compareAndSet(r0, r13, r10)
            if (r11 == 0) goto L46
            r11 = 1
            goto L4d
        L46:
            java.lang.Object r11 = r2.get(r0)
            if (r11 == r13) goto L3e
            r11 = 0
        L4d:
            if (r11 == 0) goto L5c
            boolean r10 = r13.m3661N()
            if (r10 == 0) goto L58
            r13.m3384P()
        L58:
            r10 = 1
        L59:
            if (r10 == 0) goto L19
            goto L66
        L5c:
            boolean r11 = r10.m3661N()
            if (r11 == 0) goto L27
            r10.m3384P()
            goto L27
        L66:
            a.m7 r2 = p000a.AbstractC1843ih.m3446i(r9)
            a.yd r2 = (p000a.C2681yd) r2
            int r3 = p000a.AbstractC1327Ys.f4208Q
            long r6 = (long) r3
            long r4 = r4 % r6
            int r3 = (int) r4
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r2.f8363q
        L73:
            r5 = 0
            boolean r5 = r4.compareAndSet(r3, r5, r1)
            if (r5 == 0) goto L7c
            r4 = 1
            goto L83
        L7c:
            java.lang.Object r5 = r4.get(r3)
            if (r5 == 0) goto L73
            r4 = 0
        L83:
            if (r4 == 0) goto L8a
            r1.mo2969z(r2, r3)
            r1 = 1
            return r1
        L8a:
            a.DP r5 = p000a.AbstractC1327Ys.f4209h
            a.DP r6 = p000a.AbstractC1327Ys.f4210v
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r2.f8363q
        L90:
            boolean r2 = r7.compareAndSet(r3, r5, r6)
            if (r2 == 0) goto L98
            r2 = 1
            goto L9f
        L98:
            java.lang.Object r2 = r7.get(r3)
            if (r2 == r5) goto L90
            r2 = 0
        L9f:
            if (r2 == 0) goto Lac
            a.GJ r2 = p000a.C0329GJ.f1115z
            int r3 = r1.f2384w
            a.yQ r4 = r0.f589h
            r1.m2964r(r2, r3, r4)
            r8 = 1
            return r8
        Lac:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0190Df.m375z(a.cm):boolean");
    }
}
