package p000a;

import java.util.List;
import java.util.ListIterator;

/* renamed from: a.Tt */
/* loaded from: classes.dex */
public final class C1060Tt implements ListIterator, InterfaceC1564dP {

    /* renamed from: R */
    public final /* synthetic */ C0006A6 f3483R;

    /* renamed from: S */
    public final ListIterator f3484S;

    public C1060Tt(C0006A6 c0006a6, int i) {
        boolean z;
        this.f3483R = c0006a6;
        List list = c0006a6.f73S;
        C0325GF c0325gf = new C0325GF(0, c0006a6.mo26h());
        if (i >= 0 && i <= c0325gf.f2576R) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f3484S = list.listIterator(c0006a6.mo26h() - i);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new C0325GF(0, c0006a6.mo26h()) + "].");
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f3484S.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3484S.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f3484S.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return AbstractC1292YB.m2642C(this.f3483R) - this.f3484S.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f3484S.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return AbstractC1292YB.m2642C(this.f3483R) - this.f3484S.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
