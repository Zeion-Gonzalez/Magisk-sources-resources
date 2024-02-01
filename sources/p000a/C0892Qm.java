package p000a;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.Qm */
/* loaded from: classes.dex */
public final class C0892Qm {

    /* renamed from: N */
    public static final AtomicReferenceFieldUpdater f3056N = AtomicReferenceFieldUpdater.newUpdater(C0892Qm.class, Object.class, "_next");

    /* renamed from: Q */
    public static final AtomicLongFieldUpdater f3057Q = AtomicLongFieldUpdater.newUpdater(C0892Qm.class, "_state");

    /* renamed from: u */
    public static final C0175DP f3058u = new C0175DP(1, "REMOVE_FROZEN");

    /* renamed from: P */
    public final AtomicReferenceArray f3059P;
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: h */
    public final boolean f3060h;

    /* renamed from: v */
    public final int f3061v;

    /* renamed from: z */
    public final int f3062z;

    public C0892Qm(int i, boolean z) {
        this.f3062z = i;
        this.f3060h = z;
        int i2 = i - 1;
        this.f3061v = i2;
        this.f3059P = new AtomicReferenceArray(i);
        if (!(i2 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i & i2) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: P */
    public final Object m2037P() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3057Q;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return f3058u;
            }
            int i = this.f3061v;
            int i2 = ((int) ((j & 1073741823) >> 0)) & i;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i) == i2) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f3059P;
            Object obj = atomicReferenceArray.get(i2);
            boolean z = this.f3060h;
            if (obj == null) {
                if (z) {
                    return null;
                }
            } else {
                if (obj instanceof C2400tB) {
                    return null;
                }
                long j2 = ((r1 + 1) & 1073741823) << 0;
                if (atomicLongFieldUpdater.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i2, null);
                    return obj;
                }
                if (z) {
                    C0892Qm c0892Qm = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3057Q;
                        long j3 = atomicLongFieldUpdater2.get(c0892Qm);
                        int i3 = (int) ((j3 & 1073741823) >> 0);
                        if ((j3 & 1152921504606846976L) != 0) {
                            c0892Qm = c0892Qm.m2039v();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(c0892Qm, j3, (j3 & (-1073741824)) | j2)) {
                                c0892Qm.f3059P.set(c0892Qm.f3061v & i3, null);
                                c0892Qm = null;
                            } else {
                                continue;
                            }
                        }
                        if (c0892Qm == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final boolean m2038h() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f3057Q;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    /* renamed from: v */
    public final C0892Qm m2039v() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        while (true) {
            atomicLongFieldUpdater = f3057Q;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3056N;
            C0892Qm c0892Qm = (C0892Qm) atomicReferenceFieldUpdater.get(this);
            if (c0892Qm != null) {
                return c0892Qm;
            }
            C0892Qm c0892Qm2 = new C0892Qm(this.f3062z * 2, this.f3060h);
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f3061v;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.f3059P.get(i4);
                if (obj == null) {
                    obj = new C2400tB(i);
                }
                c0892Qm2.f3059P.set(c0892Qm2.f3061v & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(c0892Qm2, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0892Qm2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0056, code lost:
    
        return 1;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m2040z(java.lang.Object r17) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
        L4:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = p000a.C0892Qm.f3057Q
            long r2 = r8.get(r6)
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r9 = 0
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L1d
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 & r4
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L1c
            r1 = 2
        L1c:
            return r1
        L1d:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r11 = 0
            long r4 = r4 >> r11
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r12 = 30
            long r4 = r4 >> r12
            int r13 = (int) r4
            int r4 = r13 + 2
            int r14 = r6.f3061v
            r4 = r4 & r14
            r5 = r0 & r14
            if (r4 != r5) goto L38
            return r1
        L38:
            boolean r4 = r6.f3060h
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r6.f3059P
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L57
            r4 = r13 & r14
            java.lang.Object r4 = r15.get(r4)
            if (r4 == 0) goto L57
            r2 = 1024(0x400, float:1.435E-42)
            int r3 = r6.f3062z
            if (r3 < r2) goto L56
            int r13 = r13 - r0
            r0 = r13 & r5
            int r2 = r3 >> 1
            if (r0 <= r2) goto L4
        L56:
            return r1
        L57:
            int r0 = r13 + 1
            r0 = r0 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p000a.C0892Qm.f3057Q
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r9 = (long) r0
            long r9 = r9 << r12
            long r4 = r4 | r9
            r0 = r1
            r1 = r16
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L4
            r0 = r13 & r14
            r15.set(r0, r7)
            r0 = r6
        L74:
            long r1 = r8.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L9f
            a.Qm r0 = r0.m2039v()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f3059P
            int r2 = r0.f3061v
            r2 = r2 & r13
            java.lang.Object r5 = r1.get(r2)
            boolean r9 = r5 instanceof p000a.C2400tB
            if (r9 == 0) goto L9c
            a.tB r5 = (p000a.C2400tB) r5
            int r5 = r5.f7331z
            if (r5 != r13) goto L9c
            r1.set(r2, r7)
            goto L9d
        L9c:
            r0 = 0
        L9d:
            if (r0 != 0) goto L74
        L9f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0892Qm.m2040z(java.lang.Object):int");
    }
}
