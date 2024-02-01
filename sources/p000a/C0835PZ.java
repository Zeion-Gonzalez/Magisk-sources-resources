package p000a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.PZ */
/* loaded from: classes.dex */
public final class C0835PZ extends AbstractC1234X3 {

    /* renamed from: N */
    public final /* synthetic */ Object f2821N;

    /* renamed from: P */
    public final /* synthetic */ C0757O9 f2822P;

    /* renamed from: h */
    public final C1215Wh f2823h;

    /* renamed from: v */
    public C1215Wh f2824v;

    public C0835PZ(C1215Wh c1215Wh, C0757O9 c0757o9, Object obj) {
        this.f2822P = c0757o9;
        this.f2821N = obj;
        this.f2823h = c1215Wh;
    }

    @Override // p000a.AbstractC1234X3
    /* renamed from: h */
    public final void mo1951h(Object obj, Object obj2) {
        boolean z;
        C1215Wh c1215Wh;
        C1215Wh c1215Wh2 = (C1215Wh) obj;
        boolean z2 = true;
        if (obj2 == null) {
            z = true;
        } else {
            z = false;
        }
        C1215Wh c1215Wh3 = this.f2823h;
        if (z) {
            c1215Wh = c1215Wh3;
        } else {
            c1215Wh = this.f2824v;
        }
        if (c1215Wh != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1215Wh.f3978S;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(c1215Wh2, this, c1215Wh)) {
                    break;
                } else if (atomicReferenceFieldUpdater.get(c1215Wh2) != this) {
                    z2 = false;
                    break;
                }
            }
            if (z2 && z) {
                c1215Wh3.m2504M(this.f2824v);
            }
        }
    }

    @Override // p000a.AbstractC1234X3
    /* renamed from: v */
    public final C0175DP mo1952v(Object obj) {
        boolean z;
        C1215Wh c1215Wh = (C1215Wh) obj;
        if (this.f2822P.m1743Y() == this.f2821N) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return AbstractC0795Op.f2709W;
    }
}
