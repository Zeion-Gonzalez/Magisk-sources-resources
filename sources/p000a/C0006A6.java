package p000a;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: a.A6 */
/* loaded from: classes.dex */
public final class C0006A6 extends AbstractC0386HL {

    /* renamed from: S */
    public final List f73S;

    public C0006A6(List list) {
        this.f73S = list;
    }

    @Override // java.util.List
    public final Object get(int i) {
        boolean z;
        C0325GF c0325gf = new C0325GF(0, AbstractC1292YB.m2642C(this));
        if (i >= 0 && i <= c0325gf.f2576R) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f73S.get(AbstractC1292YB.m2642C(this) - i);
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new C0325GF(0, AbstractC1292YB.m2642C(this)) + "].");
    }

    @Override // p000a.AbstractC0530K
    /* renamed from: h */
    public final int mo26h() {
        return this.f73S.size();
    }

    @Override // p000a.AbstractC0386HL, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C1060Tt(this, 0);
    }

    @Override // p000a.AbstractC0386HL, java.util.List
    public final ListIterator listIterator() {
        return new C1060Tt(this, 0);
    }

    @Override // p000a.AbstractC0386HL, java.util.List
    public final ListIterator listIterator(int i) {
        return new C1060Tt(this, i);
    }
}
