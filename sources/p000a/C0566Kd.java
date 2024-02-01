package p000a;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: a.Kd */
/* loaded from: classes.dex */
public final class C0566Kd extends AbstractC2025m7 {

    /* renamed from: k */
    public final AtomicReferenceArray f1838k;

    /* renamed from: q */
    public final C1066U0 f1839q;

    public C0566Kd(long j, C0566Kd c0566Kd, C1066U0 c1066u0, int i) {
        super(j, c0566Kd, i);
        this.f1839q = c1066u0;
        this.f1838k = new AtomicReferenceArray(AbstractC1671fQ.f5221h * 2);
    }

    /* renamed from: G */
    public final boolean m1274G(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f1838k;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: M */
    public final Object m1275M(int i) {
        return this.f1838k.get((i * 2) + 1);
    }

    @Override // p000a.AbstractC2025m7
    /* renamed from: Q */
    public final int mo1276Q() {
        return AbstractC1671fQ.f5221h;
    }

    /* renamed from: R */
    public final void m1277R(int i, Object obj) {
        this.f1838k.lazySet(i * 2, obj);
    }

    /* renamed from: S */
    public final Object m1278S(int i) {
        Object obj = this.f1838k.get(i * 2);
        m1277R(i, null);
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0014, code lost:
    
        if (r1.m2248s() != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x001e, code lost:
    
        if (r1.m2237S() <= r3) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0020, code lost:
    
        r2 = p000a.AbstractC1671fQ.f5226v;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0024, code lost:
    
        r12 = p000a.C1066U0.f3517k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x002b, code lost:
    
        if (r3 >= r2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x002d, code lost:
    
        r4 = r1.m2237S();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0038, code lost:
    
        if (r4 != (r12.get(r1) & 4611686018427387903L)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0040, code lost:
    
        if (r4 != r1.m2237S()) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0043, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0046, code lost:
    
        r7 = r12.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0056, code lost:
    
        if (r12.compareAndSet(r1, r7, 4611686018427387904L + (r7 & 4611686018427387903L)) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0058, code lost:
    
        r2 = r1.m2237S();
        r4 = p000a.C1066U0.f3517k;
        r7 = r4.get(r1);
        r5 = r7 & 4611686018427387903L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x006a, code lost:
    
        if ((r7 & 4611686018427387904L) == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x006c, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x006e, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0071, code lost:
    
        if (r2 != r5) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0079, code lost:
    
        if (r2 != r1.m2237S()) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x007b, code lost:
    
        r7 = r4.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0089, code lost:
    
        if (r4.compareAndSet(r1, r7, 0 + (r7 & 4611686018427387903L)) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x008c, code lost:
    
        if (r9 != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x008e, code lost:
    
        r4.compareAndSet(r1, r7, 4611686018427387904L + r5);
     */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1279V(int r22, boolean r23) {
        /*
            r21 = this;
            r0 = r21
            if (r23 == 0) goto L96
            int r1 = p000a.AbstractC1671fQ.f5221h
            long r1 = (long) r1
            long r3 = r0.f6289w
            long r3 = r3 * r1
            r1 = r22
            long r1 = (long) r1
            long r3 = r3 + r1
            a.U0 r1 = r0.f1839q
            boolean r2 = r1.m2248s()
            if (r2 == 0) goto L18
            goto L96
        L18:
            long r5 = r1.m2237S()
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L18
            int r2 = p000a.AbstractC1671fQ.f5226v
            r11 = 0
            r3 = r11
        L24:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r12 = p000a.C1066U0.f3517k
            r13 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            if (r3 >= r2) goto L46
            long r4 = r1.m2237S()
            long r6 = r12.get(r1)
            long r6 = r6 & r13
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 != 0) goto L43
            long r6 = r1.m2237S()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L43
            goto L96
        L43:
            int r3 = r3 + 1
            goto L24
        L46:
            long r7 = r12.get(r1)
            long r2 = r7 & r13
            r15 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r9 = r15 + r2
            r5 = r12
            r6 = r1
            boolean r2 = r5.compareAndSet(r6, r7, r9)
            if (r2 == 0) goto L46
        L58:
            long r2 = r1.m2237S()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p000a.C1066U0.f3517k
            long r7 = r4.get(r1)
            long r5 = r7 & r13
            long r9 = r7 & r15
            r17 = 0
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 == 0) goto L6e
            r9 = 1
            goto L6f
        L6e:
            r9 = r11
        L6f:
            int r10 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r10 != 0) goto L8c
            long r19 = r1.m2237S()
            int r2 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r2 != 0) goto L8c
        L7b:
            long r7 = r4.get(r1)
            long r2 = r7 & r13
            long r9 = r17 + r2
            r5 = r4
            r6 = r1
            boolean r2 = r5.compareAndSet(r6, r7, r9)
            if (r2 == 0) goto L7b
            goto L96
        L8c:
            if (r9 != 0) goto L58
            long r9 = r15 + r5
            r5 = r4
            r6 = r1
            r5.compareAndSet(r6, r7, r9)
            goto L58
        L96:
            r21.m3663o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0566Kd.m1279V(int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x005b, code lost:
    
        m1277R(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x005e, code lost:
    
        if (r1 == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0060, code lost:
    
        r7 = r5.f3522R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0062, code lost:
    
        if (r7 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0064, code lost:
    
        r7 = p000a.AbstractC1292YB.m2654M(r7, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0068, code lost:
    
        if (r7 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x006a, code lost:
    
        p000a.AbstractC0438II.m1000J(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x006d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:?, code lost:
    
        return;
     */
    @Override // p000a.AbstractC2025m7
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1280u(int r7, p000a.InterfaceC1255XS r8) {
        /*
            r6 = this;
            int r0 = p000a.AbstractC1671fQ.f5221h
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f1838k
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.m1275M(r7)
            boolean r3 = r2 instanceof p000a.InterfaceC1816iD
            r4 = 0
            a.U0 r5 = r6.f1839q
            if (r3 != 0) goto L6e
            boolean r3 = r2 instanceof p000a.C0626Lm
            if (r3 == 0) goto L22
            goto L6e
        L22:
            a.DP r3 = p000a.AbstractC1671fQ.f5210G
            if (r2 == r3) goto L5b
            a.DP r3 = p000a.AbstractC1671fQ.f5212M
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            a.DP r3 = p000a.AbstractC1671fQ.f5225u
            if (r2 == r3) goto L12
            a.DP r3 = p000a.AbstractC1671fQ.f5215Q
            if (r2 != r3) goto L34
            goto L12
        L34:
            a.DP r7 = p000a.AbstractC1671fQ.f5219W
            if (r2 == r7) goto L5a
            a.DP r7 = p000a.AbstractC1671fQ.f5214P
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            a.DP r7 = p000a.AbstractC1671fQ.f5218V
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.m1277R(r7, r4)
            if (r1 == 0) goto L6d
            a.sT r7 = r5.f3522R
            if (r7 == 0) goto L6d
            a.Sd r7 = p000a.AbstractC1292YB.m2654M(r7, r0, r4)
            if (r7 == 0) goto L6d
            p000a.AbstractC0438II.m1000J(r8, r7)
        L6d:
            return
        L6e:
            if (r1 == 0) goto L73
            a.DP r3 = p000a.AbstractC1671fQ.f5210G
            goto L75
        L73:
            a.DP r3 = p000a.AbstractC1671fQ.f5212M
        L75:
            boolean r2 = r6.m1274G(r2, r7, r3)
            if (r2 == 0) goto L12
            r6.m1277R(r7, r4)
            r2 = r1 ^ 1
            r6.m1279V(r7, r2)
            if (r1 == 0) goto L92
            a.sT r7 = r5.f3522R
            if (r7 == 0) goto L92
            a.Sd r7 = p000a.AbstractC1292YB.m2654M(r7, r0, r4)
            if (r7 == 0) goto L92
            p000a.AbstractC0438II.m1000J(r8, r7)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0566Kd.mo1280u(int, a.XS):void");
    }

    /* renamed from: w */
    public final void m1281w(int i, C0175DP c0175dp) {
        this.f1838k.set((i * 2) + 1, c0175dp);
    }
}
