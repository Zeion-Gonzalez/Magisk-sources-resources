package p000a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.X3 */
/* loaded from: classes.dex */
public abstract class AbstractC1234X3 extends AbstractC1709g7 {

    /* renamed from: z */
    public static final AtomicReferenceFieldUpdater f4011z = AtomicReferenceFieldUpdater.newUpdater(AbstractC1234X3.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC0438II.f1456S;

    /* renamed from: h */
    public abstract void mo1951h(Object obj, Object obj2);

    /* renamed from: v */
    public abstract C0175DP mo1952v(Object obj);

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0012, code lost:
    
        if (r1 != r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0019, code lost:
    
        if (r0.compareAndSet(r4, r2, r3) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x001b, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0021, code lost:
    
        if (r0.get(r4) == r2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0023, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0024, code lost:
    
        if (r1 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0026, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0028, code lost:
    
        r1 = r0.get(r4);
     */
    @Override // p000a.AbstractC1709g7
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2534z(java.lang.Object r5) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000a.AbstractC1234X3.f4011z
            java.lang.Object r1 = r0.get(r4)
            a.DP r2 = p000a.AbstractC0438II.f1456S
            if (r1 != r2) goto L2c
            a.DP r3 = r4.mo1952v(r5)
            java.lang.Object r1 = r0.get(r4)
            if (r1 == r2) goto L15
            goto L2c
        L15:
            boolean r1 = r0.compareAndSet(r4, r2, r3)
            if (r1 == 0) goto L1d
            r1 = 1
            goto L24
        L1d:
            java.lang.Object r1 = r0.get(r4)
            if (r1 == r2) goto L15
            r1 = 0
        L24:
            if (r1 == 0) goto L28
            r1 = r3
            goto L2c
        L28:
            java.lang.Object r1 = r0.get(r4)
        L2c:
            r4.mo1951h(r5, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC1234X3.mo2534z(java.lang.Object):java.lang.Object");
    }
}
