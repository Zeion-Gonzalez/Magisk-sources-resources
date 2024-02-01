package p000a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.U0 */
/* loaded from: classes.dex */
public class C1066U0 implements InterfaceC0969SB {

    /* renamed from: R */
    public final InterfaceC2364sT f3522R;

    /* renamed from: S */
    public final int f3523S;
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* renamed from: w */
    public static final AtomicLongFieldUpdater f3520w = AtomicLongFieldUpdater.newUpdater(C1066U0.class, "sendersAndCloseStatus");

    /* renamed from: I */
    public static final AtomicLongFieldUpdater f3514I = AtomicLongFieldUpdater.newUpdater(C1066U0.class, "receivers");

    /* renamed from: q */
    public static final AtomicLongFieldUpdater f3518q = AtomicLongFieldUpdater.newUpdater(C1066U0.class, "bufferEnd");

    /* renamed from: k */
    public static final AtomicLongFieldUpdater f3517k = AtomicLongFieldUpdater.newUpdater(C1066U0.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: g */
    public static final AtomicReferenceFieldUpdater f3516g = AtomicReferenceFieldUpdater.newUpdater(C1066U0.class, Object.class, "sendSegment");

    /* renamed from: y */
    public static final AtomicReferenceFieldUpdater f3521y = AtomicReferenceFieldUpdater.newUpdater(C1066U0.class, Object.class, "receiveSegment");

    /* renamed from: s */
    public static final AtomicReferenceFieldUpdater f3519s = AtomicReferenceFieldUpdater.newUpdater(C1066U0.class, Object.class, "bufferEndSegment");

    /* renamed from: U */
    public static final AtomicReferenceFieldUpdater f3515U = AtomicReferenceFieldUpdater.newUpdater(C1066U0.class, Object.class, "_closeCause");

    /* renamed from: E */
    public static final AtomicReferenceFieldUpdater f3513E = AtomicReferenceFieldUpdater.newUpdater(C1066U0.class, Object.class, "closeHandler");

    public C1066U0(int i, InterfaceC2364sT interfaceC2364sT) {
        boolean z;
        long j;
        this.f3523S = i;
        this.f3522R = interfaceC2364sT;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0566Kd c0566Kd = AbstractC1671fQ.f5228z;
            if (i != 0) {
                if (i != Integer.MAX_VALUE) {
                    j = i;
                } else {
                    j = Long.MAX_VALUE;
                }
            } else {
                j = 0;
            }
            this.bufferEnd = j;
            this.completedExpandBuffersAndPauseFlag = m2237S();
            C0566Kd c0566Kd2 = new C0566Kd(0L, null, this, 3);
            this.sendSegment = c0566Kd2;
            this.receiveSegment = c0566Kd2;
            this.bufferEndSegment = m2248s() ? AbstractC1671fQ.f5228z : c0566Kd2;
            this._closeCause = AbstractC1671fQ.f5220g;
            return;
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4190Q("Invalid channel capacity: ", i, ", should be >=0").toString());
    }

    /* renamed from: Y */
    public static boolean m2227Y(Object obj) {
        if (obj instanceof InterfaceC2363sS) {
            return AbstractC1671fQ.m3166z((InterfaceC2363sS) obj, C0329GJ.f1115z, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00ac, code lost:
    
        if ((r12.f6289w * p000a.AbstractC1671fQ.f5221h) < r9.m2250w()) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00ae, code lost:
    
        r12.m3387z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x006b, code lost:
    
        if ((r12.f6289w * p000a.AbstractC1671fQ.f5221h) < r9.m2250w()) goto L105;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p000a.C0566Kd m2228h(p000a.C1066U0 r9, long r10, p000a.C0566Kd r12) {
        /*
            r9.getClass()
            a.Kd r0 = p000a.AbstractC1671fQ.f5228z
            a.kX r0 = p000a.C1941kX.f6024s
        L7:
            java.lang.Object r1 = p000a.AbstractC0795Op.m1876y(r12, r10, r0)
            boolean r2 = p000a.AbstractC1843ih.m3397B(r1)
            if (r2 != 0) goto L56
            a.m7 r2 = p000a.AbstractC1843ih.m3446i(r1)
        L15:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p000a.C1066U0.f3516g
            java.lang.Object r4 = r3.get(r9)
            a.m7 r4 = (p000a.AbstractC2025m7) r4
            long r5 = r4.f6289w
            long r7 = r2.f6289w
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r6 = 1
            if (r5 < 0) goto L27
            goto L49
        L27:
            boolean r5 = r2.m3662W()
            r7 = 0
            if (r5 != 0) goto L30
            r6 = r7
            goto L49
        L30:
            boolean r5 = r3.compareAndSet(r9, r4, r2)
            if (r5 == 0) goto L38
            r7 = r6
            goto L3e
        L38:
            java.lang.Object r5 = r3.get(r9)
            if (r5 == r4) goto L30
        L3e:
            if (r7 == 0) goto L4c
            boolean r2 = r4.m3661N()
            if (r2 == 0) goto L49
            r4.m3384P()
        L49:
            if (r6 == 0) goto L7
            goto L56
        L4c:
            boolean r3 = r2.m3661N()
            if (r3 == 0) goto L15
            r2.m3384P()
            goto L15
        L56:
            boolean r0 = p000a.AbstractC1843ih.m3397B(r1)
            if (r0 == 0) goto L6e
            r9.m2240W()
            int r10 = p000a.AbstractC1671fQ.f5221h
            long r10 = (long) r10
            long r0 = r12.f6289w
            long r0 = r0 * r10
            long r9 = r9.m2250w()
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 >= 0) goto Lb1
            goto Lae
        L6e:
            a.m7 r12 = p000a.AbstractC1843ih.m3446i(r1)
            a.Kd r12 = (p000a.C0566Kd) r12
            long r0 = r12.f6289w
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 <= 0) goto Lb2
            int r10 = p000a.AbstractC1671fQ.f5221h
            long r10 = (long) r10
            long r0 = r0 * r10
        L7e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = p000a.C1066U0.f3520w
            long r4 = r2.get(r9)
            r10 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r10 = r10 & r4
            int r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r3 < 0) goto L8f
            goto La0
        L8f:
            r3 = 60
            long r6 = r4 >> r3
            int r6 = (int) r6
            a.Kd r7 = p000a.AbstractC1671fQ.f5228z
            long r6 = (long) r6
            long r6 = r6 << r3
            long r6 = r6 + r10
            r3 = r9
            boolean r10 = r2.compareAndSet(r3, r4, r6)
            if (r10 == 0) goto L7e
        La0:
            int r10 = p000a.AbstractC1671fQ.f5221h
            long r10 = (long) r10
            long r0 = r12.f6289w
            long r0 = r0 * r10
            long r9 = r9.m2250w()
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 >= 0) goto Lb1
        Lae:
            r12.m3387z()
        Lb1:
            r12 = 0
        Lb2:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1066U0.m2228h(a.U0, long, a.Kd):a.Kd");
    }

    /* renamed from: v */
    public static final int m2229v(C1066U0 c1066u0, C0566Kd c0566Kd, int i, Object obj, long j, Object obj2, boolean z) {
        c1066u0.getClass();
        c0566Kd.m1277R(i, obj);
        if (!z) {
            Object m1275M = c0566Kd.m1275M(i);
            if (m1275M == null) {
                if (c1066u0.m2235N(j)) {
                    if (c0566Kd.m1274G(null, i, AbstractC1671fQ.f5214P)) {
                        return 1;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (c0566Kd.m1274G(null, i, obj2)) {
                        return 2;
                    }
                }
            } else if (m1275M instanceof InterfaceC1816iD) {
                c0566Kd.m1277R(i, null);
                if (c1066u0.m2247r(m1275M, obj)) {
                    c0566Kd.m1281w(i, AbstractC1671fQ.f5219W);
                    return 0;
                }
                C0175DP c0175dp = AbstractC1671fQ.f5212M;
                if (c0566Kd.f1838k.getAndSet((i * 2) + 1, c0175dp) != c0175dp) {
                    c0566Kd.m1279V(i, true);
                }
                return 5;
            }
        }
        return c1066u0.m2241c(c0566Kd, i, obj, j, obj2, z);
    }

    /* renamed from: E */
    public final Object m2230E(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        C1019T6 c1019t6;
        C0993Sd m2654M;
        C1525cm c1525cm = new C1525cm(1, AbstractC0438II.m1026e(interfaceC1171Vv));
        c1525cm.m2962k();
        InterfaceC2364sT interfaceC2364sT = this.f3522R;
        if (interfaceC2364sT != null && (m2654M = AbstractC1292YB.m2654M(interfaceC2364sT, obj, null)) != null) {
            AbstractC1292YB.m2655N(m2654M, m2232I());
            c1019t6 = new C1019T6(m2654M);
        } else {
            c1019t6 = new C1019T6(m2232I());
        }
        c1525cm.mo320u(c1019t6);
        Object m2963q = c1525cm.m2963q();
        if (m2963q == EnumC0464Im.f1557S) {
            return m2963q;
        }
        return C0329GJ.f1115z;
    }

    /* renamed from: G */
    public final void m2231G(long j) {
        C0993Sd m2654M;
        C0566Kd c0566Kd = (C0566Kd) f3521y.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3514I;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.f3523S + j2, m2237S())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                long j3 = AbstractC1671fQ.f5221h;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (c0566Kd.f6289w != j4) {
                    C0566Kd m2239V = m2239V(j4, c0566Kd);
                    if (m2239V == null) {
                        continue;
                    } else {
                        c0566Kd = m2239V;
                    }
                }
                Object m2233J = m2233J(c0566Kd, i, j2, null);
                if (m2233J == AbstractC1671fQ.f5227w) {
                    if (j2 < m2246q()) {
                        c0566Kd.m3387z();
                    }
                } else {
                    c0566Kd.m3387z();
                    InterfaceC2364sT interfaceC2364sT = this.f3522R;
                    if (interfaceC2364sT != null && (m2654M = AbstractC1292YB.m2654M(interfaceC2364sT, m2233J, null)) != null) {
                        throw m2654M;
                    }
                }
            }
        }
    }

    /* renamed from: I */
    public final Throwable m2232I() {
        Throwable m2236R = m2236R();
        return m2236R == null ? new C0890Qk() : m2236R;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0081, code lost:
    
        m2234M();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0090, code lost:
    
        if (r9 != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00a4, code lost:
    
        m2234M();
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:?, code lost:
    
        return r7.m1278S(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:?, code lost:
    
        return p000a.AbstractC1671fQ.f5227w;
     */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2233J(p000a.C0566Kd r7, int r8, long r9, p000a.C1844ii r11) {
        /*
            r6 = this;
            java.lang.Object r0 = r7.m1275M(r8)
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = p000a.C1066U0.f3520w
            if (r0 != 0) goto L27
            long r4 = r3.get(r6)
            long r4 = r4 & r1
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 < 0) goto L3b
            if (r11 != 0) goto L1b
            a.DP r7 = p000a.AbstractC1671fQ.f5216R
            return r7
        L1b:
            boolean r0 = r7.m1274G(r0, r8, r11)
            if (r0 == 0) goto L3b
            r6.m2234M()
            a.DP r7 = p000a.AbstractC1671fQ.f5217S
            return r7
        L27:
            a.DP r4 = p000a.AbstractC1671fQ.f5214P
            if (r0 != r4) goto L3b
            a.DP r4 = p000a.AbstractC1671fQ.f5219W
            boolean r0 = r7.m1274G(r0, r8, r4)
            if (r0 == 0) goto L3b
            r6.m2234M()
            java.lang.Object r7 = r7.m1278S(r8)
            return r7
        L3b:
            java.lang.Object r0 = r7.m1275M(r8)
            if (r0 == 0) goto L93
            a.DP r4 = p000a.AbstractC1671fQ.f5213N
            if (r0 != r4) goto L46
            goto L93
        L46:
            a.DP r4 = p000a.AbstractC1671fQ.f5214P
            if (r0 != r4) goto L53
            a.DP r4 = p000a.AbstractC1671fQ.f5219W
            boolean r0 = r7.m1274G(r0, r8, r4)
            if (r0 == 0) goto L3b
            goto L81
        L53:
            a.DP r4 = p000a.AbstractC1671fQ.f5210G
            if (r0 != r4) goto L58
            goto La7
        L58:
            a.DP r5 = p000a.AbstractC1671fQ.f5223o
            if (r0 != r5) goto L5d
            goto La7
        L5d:
            a.DP r5 = p000a.AbstractC1671fQ.f5218V
            if (r0 != r5) goto L62
            goto La4
        L62:
            a.DP r5 = p000a.AbstractC1671fQ.f5225u
            if (r0 == r5) goto L3b
            a.DP r5 = p000a.AbstractC1671fQ.f5215Q
            boolean r5 = r7.m1274G(r0, r8, r5)
            if (r5 == 0) goto L3b
            boolean r9 = r0 instanceof p000a.C0626Lm
            if (r9 == 0) goto L76
            a.Lm r0 = (p000a.C0626Lm) r0
            a.iD r0 = r0.f2036z
        L76:
            boolean r10 = m2227Y(r0)
            if (r10 == 0) goto L89
            a.DP r9 = p000a.AbstractC1671fQ.f5219W
            r7.m1281w(r8, r9)
        L81:
            r6.m2234M()
            java.lang.Object r7 = r7.m1278S(r8)
            goto Lba
        L89:
            r7.m1281w(r8, r4)
            r10 = 0
            r7.m1279V(r8, r10)
            if (r9 == 0) goto La7
            goto La4
        L93:
            long r4 = r3.get(r6)
            long r4 = r4 & r1
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 >= 0) goto Laa
            a.DP r4 = p000a.AbstractC1671fQ.f5223o
            boolean r0 = r7.m1274G(r0, r8, r4)
            if (r0 == 0) goto L3b
        La4:
            r6.m2234M()
        La7:
            a.DP r7 = p000a.AbstractC1671fQ.f5227w
            goto Lba
        Laa:
            if (r11 != 0) goto Laf
            a.DP r7 = p000a.AbstractC1671fQ.f5216R
            goto Lba
        Laf:
            boolean r0 = r7.m1274G(r0, r8, r11)
            if (r0 == 0) goto L3b
            r6.m2234M()
            a.DP r7 = p000a.AbstractC1671fQ.f5217S
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1066U0.m2233J(a.Kd, int, long, a.ii):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x0153, code lost:
    
        r13 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x019c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0012 A[SYNTHETIC] */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2234M() {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1066U0.m2234M():void");
    }

    /* renamed from: N */
    public final boolean m2235N(long j) {
        return j < m2237S() || j < m2250w() + ((long) this.f3523S);
    }

    @Override // p000a.InterfaceC1604eC
    /* renamed from: P */
    public final boolean mo1717P(Throwable th) {
        return m2249u(th, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x0129, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01b8, code lost:
    
        r0 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    @Override // p000a.InterfaceC1604eC
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo907Q(java.lang.Object r25, p000a.InterfaceC1171Vv r26) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1066U0.mo907Q(java.lang.Object, a.Vv):java.lang.Object");
    }

    /* renamed from: R */
    public final Throwable m2236R() {
        return (Throwable) f3515U.get(this);
    }

    /* renamed from: S */
    public final long m2237S() {
        return f3518q.get(this);
    }

    /* renamed from: U */
    public final void m2238U(long j, C0566Kd c0566Kd) {
        boolean z;
        C0566Kd c0566Kd2;
        C0566Kd c0566Kd3;
        while (c0566Kd.f6289w < j && (c0566Kd3 = (C0566Kd) c0566Kd.m3385h()) != null) {
            c0566Kd = c0566Kd3;
        }
        while (true) {
            if (!c0566Kd.mo3386v() || (c0566Kd2 = (C0566Kd) c0566Kd.m3385h()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3519s;
                    AbstractC2025m7 abstractC2025m7 = (AbstractC2025m7) atomicReferenceFieldUpdater.get(this);
                    z = true;
                    if (abstractC2025m7.f6289w >= c0566Kd.f6289w) {
                        break;
                    }
                    boolean z2 = false;
                    if (!c0566Kd.m3662W()) {
                        z = false;
                        break;
                    }
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC2025m7, c0566Kd)) {
                            z2 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(this) != abstractC2025m7) {
                            break;
                        }
                    }
                    if (z2) {
                        if (abstractC2025m7.m3661N()) {
                            abstractC2025m7.m3384P();
                        }
                    } else if (c0566Kd.m3661N()) {
                        c0566Kd.m3384P();
                    }
                }
                if (z) {
                    return;
                }
            } else {
                c0566Kd = c0566Kd2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x006a, code lost:
    
        if ((r14.f6289w * p000a.AbstractC1671fQ.f5221h) < m2246q()) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x00e8, code lost:
    
        if ((r14.f6289w * p000a.AbstractC1671fQ.f5221h) < m2246q()) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x00ea, code lost:
    
        r14.m3387z();
     */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000a.C0566Kd m2239V(long r12, p000a.C0566Kd r14) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1066U0.m2239V(long, a.Kd):a.Kd");
    }

    /* renamed from: W */
    public final void m2240W() {
        m2243g(f3520w.get(this), false);
    }

    /* renamed from: c */
    public final int m2241c(C0566Kd c0566Kd, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object m1275M = c0566Kd.m1275M(i);
            if (m1275M == null) {
                if (m2235N(j) && !z) {
                    if (c0566Kd.m1274G(null, i, AbstractC1671fQ.f5214P)) {
                        return 1;
                    }
                } else if (z) {
                    if (c0566Kd.m1274G(null, i, AbstractC1671fQ.f5210G)) {
                        c0566Kd.m1279V(i, false);
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (c0566Kd.m1274G(null, i, obj2)) {
                        return 2;
                    }
                }
            } else if (m1275M == AbstractC1671fQ.f5213N) {
                if (c0566Kd.m1274G(m1275M, i, AbstractC1671fQ.f5214P)) {
                    return 1;
                }
            } else {
                C0175DP c0175dp = AbstractC1671fQ.f5212M;
                if (m1275M == c0175dp) {
                    c0566Kd.m1277R(i, null);
                    return 5;
                }
                if (m1275M == AbstractC1671fQ.f5223o) {
                    c0566Kd.m1277R(i, null);
                    return 5;
                }
                if (m1275M == AbstractC1671fQ.f5218V) {
                    c0566Kd.m1277R(i, null);
                    m2240W();
                    return 4;
                }
                c0566Kd.m1277R(i, null);
                if (m1275M instanceof C0626Lm) {
                    m1275M = ((C0626Lm) m1275M).f2036z;
                }
                if (m2247r(m1275M, obj)) {
                    c0566Kd.m1281w(i, AbstractC1671fQ.f5219W);
                    return 0;
                }
                if (c0566Kd.f1838k.getAndSet((i * 2) + 1, c0175dp) != c0175dp) {
                    c0566Kd.m1279V(i, true);
                }
                return 5;
            }
        }
    }

    /* renamed from: f */
    public final void m2242f(InterfaceC1816iD interfaceC1816iD, boolean z) {
        Throwable m2232I;
        if (interfaceC1816iD instanceof InterfaceC2363sS) {
            InterfaceC1171Vv interfaceC1171Vv = (InterfaceC1171Vv) interfaceC1816iD;
            if (z) {
                m2232I = m2236R();
                if (m2232I == null) {
                    m2232I = new C2523vS();
                }
            } else {
                m2232I = m2232I();
            }
            interfaceC1171Vv.mo320u(new C1019T6(m2232I));
            return;
        }
        if (interfaceC1816iD instanceof C1844ii) {
            C1844ii c1844ii = (C1844ii) interfaceC1816iD;
            C1525cm c1525cm = c1844ii.f5762R;
            c1844ii.f5762R = null;
            c1844ii.f5763S = AbstractC1671fQ.f5218V;
            Throwable m2236R = c1844ii.f5764w.m2236R();
            if (m2236R == null) {
                c1525cm.mo320u(Boolean.FALSE);
                return;
            } else {
                c1525cm.mo320u(new C1019T6(m2236R));
                return;
            }
        }
        throw new IllegalStateException(("Unexpected waiter: " + interfaceC1816iD).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:216:0x00a5, code lost:
    
        r0.m1277R(r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x00b1, code lost:
    
        r0.m3663o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x00b8, code lost:
    
        r0 = (p000a.C0566Kd) ((p000a.AbstractC1834iX) p000a.AbstractC1834iX.f5733R.get(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0133, code lost:
    
        r0 = false;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2243g(long r18, boolean r20) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1066U0.m2243g(long, boolean):boolean");
    }

    @Override // p000a.InterfaceC1869jD
    public final C1844ii iterator() {
        return new C1844ii(this);
    }

    /* renamed from: k */
    public final void m2244k(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3517k;
        if (!((atomicLongFieldUpdater.addAndGet(this, j) & 4611686018427387904L) != 0)) {
            return;
        }
        do {
        } while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0097, code lost:
    
        r1 = (p000a.C0566Kd) ((p000a.AbstractC1834iX) p000a.AbstractC1834iX.f5733R.get(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x00e7, code lost:
    
        r4 = p000a.AbstractC1292YB.m2652K(r4, r6);
        r1.m1279V(r5, true);
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000a.C0566Kd m2245o(long r13) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1066U0.m2245o(long):a.Kd");
    }

    /* renamed from: q */
    public final long m2246q() {
        return f3520w.get(this) & 1152921504606846975L;
    }

    /* renamed from: r */
    public final boolean m2247r(Object obj, Object obj2) {
        C0903R2 c0903r2 = null;
        if (obj instanceof C1844ii) {
            C1844ii c1844ii = (C1844ii) obj;
            C1525cm c1525cm = c1844ii.f5762R;
            c1844ii.f5762R = null;
            c1844ii.f5763S = obj2;
            Boolean bool = Boolean.TRUE;
            InterfaceC2364sT interfaceC2364sT = c1844ii.f5764w.f3522R;
            if (interfaceC2364sT != null) {
                c0903r2 = AbstractC1292YB.m2666W(interfaceC2364sT, obj2, c1525cm.f4709q);
            }
            return AbstractC1671fQ.m3166z(c1525cm, bool, c0903r2);
        }
        if (obj instanceof InterfaceC2363sS) {
            InterfaceC2363sS interfaceC2363sS = (InterfaceC2363sS) obj;
            InterfaceC2364sT interfaceC2364sT2 = this.f3522R;
            if (interfaceC2364sT2 != null) {
                c0903r2 = AbstractC1292YB.m2666W(interfaceC2364sT2, obj2, ((C1525cm) interfaceC2363sS).f4709q);
            }
            return AbstractC1671fQ.m3166z(interfaceC2363sS, obj2, c0903r2);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    /* renamed from: s */
    public final boolean m2248s() {
        long m2237S = m2237S();
        return m2237S == 0 || m2237S == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x0197, code lost:
    
        r3 = (p000a.C0566Kd) r3.m3385h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x019e, code lost:
    
        if (r3 != null) goto L203;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1066U0.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x008c, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0092, code lost:
    
        if (r0.get(r15) == r1) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0094, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0095, code lost:
    
        if (r0 == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0097, code lost:
    
        if (r1 != null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x009a, code lost:
    
        p000a.AbstractC0438II.m995G(1, r1);
        ((p000a.InterfaceC2364sT) r1).mo85W(m2236R());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00a6, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x000b, code lost:
    
        if (r17 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x000d, code lost:
    
        r2 = r10.get(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0014, code lost:
    
        if (((int) (r2 >> 60)) != 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0016, code lost:
    
        r4 = p000a.AbstractC1671fQ.f5228z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0023, code lost:
    
        if (r10.compareAndSet(r15, r2, (1 << 60) + (r2 & 1152921504606846975L)) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0025, code lost:
    
        r0 = p000a.AbstractC1671fQ.f5220g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0027, code lost:
    
        r1 = p000a.C1066U0.f3515U;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0030, code lost:
    
        if (r1.compareAndSet(r15, r0, r16) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0032, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0038, code lost:
    
        if (r1.get(r15) == r0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x003a, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x003c, code lost:
    
        if (r17 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x003e, code lost:
    
        r2 = r10.get(r15);
        r4 = p000a.AbstractC1671fQ.f5228z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x004f, code lost:
    
        if (r10.compareAndSet(r15, r2, (3 << 60) + (r2 & 1152921504606846975L)) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0052, code lost:
    
        r2 = r10.get(r15);
        r0 = (int) (r2 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0059, code lost:
    
        if (r0 == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x005b, code lost:
    
        if (r0 == 1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x005e, code lost:
    
        r0 = r2 & 1152921504606846975L;
        r4 = p000a.AbstractC1671fQ.f5228z;
        r4 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0064, code lost:
    
        r0 = r2 & 1152921504606846975L;
        r4 = p000a.AbstractC1671fQ.f5228z;
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0072, code lost:
    
        if (r10.compareAndSet(r15, r2, (r4 << 60) + r0) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0074, code lost:
    
        m2240W();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0077, code lost:
    
        if (r13 == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0079, code lost:
    
        r0 = p000a.C1066U0.f3513E;
        r1 = r0.get(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x007f, code lost:
    
        if (r1 != null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0081, code lost:
    
        r2 = p000a.AbstractC1671fQ.f5224q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0084, code lost:
    
        r2 = p000a.AbstractC1671fQ.f5222k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x008a, code lost:
    
        if (r0.compareAndSet(r15, r1, r2) == false) goto L101;
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2249u(java.lang.Throwable r16, boolean r17) {
        /*
            r15 = this;
            r6 = r15
            r7 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            r9 = 60
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = p000a.C1066U0.f3520w
            r11 = 1
            if (r17 == 0) goto L25
        Ld:
            long r2 = r10.get(r15)
            long r0 = r2 >> r9
            int r0 = (int) r0
            if (r0 != 0) goto L25
            long r0 = r2 & r7
            a.Kd r4 = p000a.AbstractC1671fQ.f5228z
            long r4 = (long) r11
            long r4 = r4 << r9
            long r4 = r4 + r0
            r0 = r10
            r1 = r15
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto Ld
        L25:
            a.DP r0 = p000a.AbstractC1671fQ.f5220g
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000a.C1066U0.f3515U
            r2 = r16
            boolean r3 = r1.compareAndSet(r15, r0, r2)
            r12 = 0
            if (r3 == 0) goto L34
            r13 = r11
            goto L3b
        L34:
            java.lang.Object r1 = r1.get(r15)
            if (r1 == r0) goto L27
            r13 = r12
        L3b:
            r14 = 3
            if (r17 == 0) goto L52
        L3e:
            long r2 = r10.get(r15)
            long r0 = r2 & r7
            a.Kd r4 = p000a.AbstractC1671fQ.f5228z
            long r4 = (long) r14
            long r4 = r4 << r9
            long r4 = r4 + r0
            r0 = r10
            r1 = r15
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L3e
            goto L74
        L52:
            long r2 = r10.get(r15)
            long r0 = r2 >> r9
            int r0 = (int) r0
            if (r0 == 0) goto L64
            if (r0 == r11) goto L5e
            goto L74
        L5e:
            long r0 = r2 & r7
            a.Kd r4 = p000a.AbstractC1671fQ.f5228z
            r4 = r14
            goto L69
        L64:
            long r0 = r2 & r7
            a.Kd r4 = p000a.AbstractC1671fQ.f5228z
            r4 = 2
        L69:
            long r4 = (long) r4
            long r4 = r4 << r9
            long r4 = r4 + r0
            r0 = r10
            r1 = r15
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L52
        L74:
            r15.m2240W()
            if (r13 == 0) goto La6
        L79:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000a.C1066U0.f3513E
            java.lang.Object r1 = r0.get(r15)
            if (r1 != 0) goto L84
            a.DP r2 = p000a.AbstractC1671fQ.f5224q
            goto L86
        L84:
            a.DP r2 = p000a.AbstractC1671fQ.f5222k
        L86:
            boolean r3 = r0.compareAndSet(r15, r1, r2)
            if (r3 == 0) goto L8e
            r0 = r11
            goto L95
        L8e:
            java.lang.Object r3 = r0.get(r15)
            if (r3 == r1) goto L86
            r0 = r12
        L95:
            if (r0 == 0) goto L79
            if (r1 != 0) goto L9a
            goto La6
        L9a:
            p000a.AbstractC0438II.m995G(r11, r1)
            a.sT r1 = (p000a.InterfaceC2364sT) r1
            java.lang.Throwable r0 = r15.m2236R()
            r1.mo85W(r0)
        La6:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1066U0.m2249u(java.lang.Throwable, boolean):boolean");
    }

    /* renamed from: w */
    public final long m2250w() {
        return f3514I.get(this);
    }

    /* renamed from: y */
    public boolean mo908y() {
        return false;
    }

    @Override // p000a.InterfaceC1869jD
    /* renamed from: z */
    public final void mo1719z(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m2249u(cancellationException, true);
    }
}
