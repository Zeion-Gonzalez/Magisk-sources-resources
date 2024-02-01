package p000a;

import java.util.Iterator;

/* renamed from: a.dR */
/* loaded from: classes.dex */
public final class C1566dR extends AbstractC2569wP implements Iterator {

    /* renamed from: R */
    public boolean f4827R = true;

    /* renamed from: S */
    public C0513Jg f4828S;

    /* renamed from: w */
    public final /* synthetic */ C1789hf f4829w;

    public C1566dR(C1789hf c1789hf) {
        this.f4829w = c1789hf;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4827R) {
            return this.f4829w.f5620S != null;
        }
        C0513Jg c0513Jg = this.f4828S;
        return (c0513Jg == null || c0513Jg.f1707w == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0513Jg c0513Jg;
        if (this.f4827R) {
            this.f4827R = false;
            c0513Jg = this.f4829w.f5620S;
        } else {
            C0513Jg c0513Jg2 = this.f4828S;
            if (c0513Jg2 != null) {
                c0513Jg = c0513Jg2.f1707w;
            } else {
                c0513Jg = null;
            }
        }
        this.f4828S = c0513Jg;
        return c0513Jg;
    }

    @Override // p000a.AbstractC2569wP
    /* renamed from: z */
    public final void mo3031z(C0513Jg c0513Jg) {
        C0513Jg c0513Jg2 = this.f4828S;
        if (c0513Jg == c0513Jg2) {
            C0513Jg c0513Jg3 = c0513Jg2.f1704I;
            this.f4828S = c0513Jg3;
            this.f4827R = c0513Jg3 == null;
        }
    }
}
