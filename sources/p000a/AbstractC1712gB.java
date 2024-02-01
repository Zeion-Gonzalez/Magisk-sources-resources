package p000a;

import java.util.Iterator;

/* renamed from: a.gB */
/* loaded from: classes.dex */
public abstract class AbstractC1712gB extends AbstractC2569wP implements Iterator {

    /* renamed from: R */
    public C0513Jg f5387R;

    /* renamed from: S */
    public C0513Jg f5388S;

    public AbstractC1712gB(C0513Jg c0513Jg, C0513Jg c0513Jg2) {
        this.f5388S = c0513Jg2;
        this.f5387R = c0513Jg;
    }

    /* renamed from: h */
    public final C0513Jg m3245h() {
        C0513Jg c0513Jg = this.f5387R;
        C0513Jg c0513Jg2 = this.f5388S;
        if (c0513Jg != c0513Jg2 && c0513Jg2 != null) {
            switch (((C0901R0) this).f3085w) {
                case AbstractC0795Op.f2698E /* 0 */:
                    return c0513Jg.f1707w;
                default:
                    return c0513Jg.f1704I;
            }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5387R != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0513Jg c0513Jg = this.f5387R;
        this.f5387R = m3245h();
        return c0513Jg;
    }

    @Override // p000a.AbstractC2569wP
    /* renamed from: z */
    public final void mo3031z(C0513Jg c0513Jg) {
        C0513Jg c0513Jg2;
        if (this.f5388S == c0513Jg && c0513Jg == this.f5387R) {
            this.f5387R = null;
            this.f5388S = null;
        }
        C0513Jg c0513Jg3 = this.f5388S;
        if (c0513Jg3 == c0513Jg) {
            switch (((C0901R0) this).f3085w) {
                case AbstractC0795Op.f2698E /* 0 */:
                    c0513Jg2 = c0513Jg3.f1704I;
                    break;
                default:
                    c0513Jg2 = c0513Jg3.f1707w;
                    break;
            }
            this.f5388S = c0513Jg2;
        }
        if (this.f5387R == c0513Jg) {
            this.f5387R = m3245h();
        }
    }
}
