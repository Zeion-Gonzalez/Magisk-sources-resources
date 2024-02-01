package p000a;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: a.yd */
/* loaded from: classes.dex */
public final class C2681yd extends AbstractC2025m7 {

    /* renamed from: q */
    public final AtomicReferenceArray f8363q;

    public C2681yd(long j, C2681yd c2681yd, int i) {
        super(j, c2681yd, i);
        this.f8363q = new AtomicReferenceArray(AbstractC1327Ys.f4208Q);
    }

    @Override // p000a.AbstractC2025m7
    /* renamed from: Q */
    public final int mo1276Q() {
        return AbstractC1327Ys.f4208Q;
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f6289w + ", hashCode=" + hashCode() + ']';
    }

    @Override // p000a.AbstractC2025m7
    /* renamed from: u */
    public final void mo1280u(int i, InterfaceC1255XS interfaceC1255XS) {
        this.f8363q.set(i, AbstractC1327Ys.f4206N);
        m3663o();
    }
}
