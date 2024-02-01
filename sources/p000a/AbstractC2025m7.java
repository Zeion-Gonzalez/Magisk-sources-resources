package p000a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: a.m7 */
/* loaded from: classes.dex */
public abstract class AbstractC2025m7 extends AbstractC1834iX implements InterfaceC1085UJ {

    /* renamed from: I */
    public static final AtomicIntegerFieldUpdater f6288I = AtomicIntegerFieldUpdater.newUpdater(AbstractC2025m7.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: w */
    public final long f6289w;

    public AbstractC2025m7(long j, AbstractC2025m7 abstractC2025m7, int i) {
        super(abstractC2025m7);
        this.f6289w = j;
        this.cleanedAndPointers = i << 16;
    }

    /* renamed from: N */
    public final boolean m3661N() {
        boolean z;
        if (f6288I.addAndGet(this, -65536) != mo1276Q()) {
            return false;
        }
        if (m3385h() == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public abstract int mo1276Q();

    /* JADX WARN: Removed duplicated region for block: B:56:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x001f A[SYNTHETIC] */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m3662W() {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000a.AbstractC2025m7.f6288I
            int r1 = r0.get(r5)
            int r2 = r5.mo1276Q()
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L1c
            a.iX r2 = r5.m3385h()
            if (r2 != 0) goto L16
            r2 = r3
            goto L17
        L16:
            r2 = r4
        L17:
            if (r2 == 0) goto L1a
            goto L1c
        L1a:
            r2 = r4
            goto L1d
        L1c:
            r2 = r3
        L1d:
            if (r2 != 0) goto L21
            r3 = r4
            goto L2a
        L21:
            r2 = 65536(0x10000, float:9.18355E-41)
            int r2 = r2 + r1
            boolean r0 = r0.compareAndSet(r5, r1, r2)
            if (r0 == 0) goto L0
        L2a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC2025m7.m3662W():boolean");
    }

    /* renamed from: o */
    public final void m3663o() {
        if (f6288I.incrementAndGet(this) == mo1276Q()) {
            m3384P();
        }
    }

    /* renamed from: u */
    public abstract void mo1280u(int i, InterfaceC1255XS interfaceC1255XS);

    @Override // p000a.AbstractC1834iX
    /* renamed from: v */
    public final boolean mo3386v() {
        boolean z;
        if (f6288I.get(this) != mo1276Q()) {
            return false;
        }
        if (m3385h() == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }
}
