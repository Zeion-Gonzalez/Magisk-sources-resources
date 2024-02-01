package p000a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.Wh */
/* loaded from: classes.dex */
public class C1215Wh {
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* renamed from: S */
    public static final AtomicReferenceFieldUpdater f3978S = AtomicReferenceFieldUpdater.newUpdater(C1215Wh.class, Object.class, "_next");

    /* renamed from: R */
    public static final AtomicReferenceFieldUpdater f3977R = AtomicReferenceFieldUpdater.newUpdater(C1215Wh.class, Object.class, "_prev");

    /* renamed from: w */
    public static final AtomicReferenceFieldUpdater f3979w = AtomicReferenceFieldUpdater.newUpdater(C1215Wh.class, Object.class, "_removedRef");

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0044, code lost:
    
        r6 = ((p000a.C0273FC) r6).f955z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x004c, code lost:
    
        if (r5.compareAndSet(r4, r2, r6) == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x004e, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0054, code lost:
    
        if (r5.get(r4) == r2) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0056, code lost:
    
        if (r7 != false) goto L155;
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000a.C1215Wh m2503G() {
        /*
            r11 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000a.C1215Wh.f3977R
            java.lang.Object r1 = r0.get(r11)
            a.Wh r1 = (p000a.C1215Wh) r1
            r2 = r1
        L9:
            r3 = 0
            r4 = r3
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = p000a.C1215Wh.f3978S
            java.lang.Object r6 = r5.get(r2)
            r7 = 0
            r8 = 1
            if (r6 != r11) goto L2a
            if (r1 != r2) goto L18
            return r2
        L18:
            boolean r3 = r0.compareAndSet(r11, r1, r2)
            if (r3 == 0) goto L20
            r7 = r8
            goto L26
        L20:
            java.lang.Object r3 = r0.get(r11)
            if (r3 == r1) goto L18
        L26:
            if (r7 != 0) goto L29
            goto L0
        L29:
            return r2
        L2a:
            boolean r9 = r11.mo2508w()
            if (r9 == 0) goto L31
            return r3
        L31:
            if (r6 != 0) goto L34
            return r2
        L34:
            boolean r9 = r6 instanceof p000a.AbstractC1709g7
            if (r9 == 0) goto L3e
            a.g7 r6 = (p000a.AbstractC1709g7) r6
            r6.mo2534z(r2)
            goto L0
        L3e:
            boolean r9 = r6 instanceof p000a.C0273FC
            if (r9 == 0) goto L62
            if (r4 == 0) goto L5b
            a.FC r6 = (p000a.C0273FC) r6
            a.Wh r6 = r6.f955z
        L48:
            boolean r3 = r5.compareAndSet(r4, r2, r6)
            if (r3 == 0) goto L50
            r7 = r8
            goto L56
        L50:
            java.lang.Object r3 = r5.get(r4)
            if (r3 == r2) goto L48
        L56:
            if (r7 != 0) goto L59
            goto L0
        L59:
            r2 = r4
            goto L9
        L5b:
            java.lang.Object r2 = r0.get(r2)
            a.Wh r2 = (p000a.C1215Wh) r2
            goto Lb
        L62:
            r4 = r6
            a.Wh r4 = (p000a.C1215Wh) r4
            r10 = r4
            r4 = r2
            r2 = r10
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1215Wh.m2503G():a.Wh");
    }

    /* renamed from: M */
    public final void m2504M(C1215Wh c1215Wh) {
        boolean z;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3977R;
            C1215Wh c1215Wh2 = (C1215Wh) atomicReferenceFieldUpdater.get(c1215Wh);
            if (m2507V() != c1215Wh) {
                return;
            }
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(c1215Wh, c1215Wh2, this)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(c1215Wh) != c1215Wh2) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (mo2508w()) {
            c1215Wh.m2503G();
        }
    }

    /* renamed from: R */
    public final C1215Wh m2505R() {
        C1215Wh m2503G = m2503G();
        if (m2503G == null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3977R;
            Object obj = atomicReferenceFieldUpdater.get(this);
            while (true) {
                m2503G = (C1215Wh) obj;
                if (!m2503G.mo2508w()) {
                    break;
                }
                obj = atomicReferenceFieldUpdater.get(m2503G);
            }
        }
        return m2503G;
    }

    /* renamed from: S */
    public final C1215Wh m2506S() {
        C0273FC c0273fc;
        C1215Wh c1215Wh;
        Object m2507V = m2507V();
        if (m2507V instanceof C0273FC) {
            c0273fc = (C0273FC) m2507V;
        } else {
            c0273fc = null;
        }
        if (c0273fc == null || (c1215Wh = c0273fc.f955z) == null) {
            return (C1215Wh) m2507V;
        }
        return c1215Wh;
    }

    /* renamed from: V */
    public final Object m2507V() {
        while (true) {
            Object obj = f3978S.get(this);
            if (!(obj instanceof AbstractC1709g7)) {
                return obj;
            }
            ((AbstractC1709g7) obj).mo2534z(this);
        }
    }

    public String toString() {
        return new C2330rr(this) + '@' + AbstractC2575wW.m4418Y(this);
    }

    /* renamed from: w */
    public boolean mo2508w() {
        return m2507V() instanceof C0273FC;
    }
}
