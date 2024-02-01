package p000a;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: a.K */
/* loaded from: classes.dex */
public abstract class AbstractC0530K implements Collection, InterfaceC1564dP {
    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (AbstractC1292YB.m2695u(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public abstract int mo26h();

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (mo26h() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return mo26h();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC1843ih.m3399BX(this);
    }

    public final String toString() {
        return AbstractC2486us.m4276EQ(this, ", ", "[", "]", new C2670yQ(12, this), 24);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC1843ih.m3437d2(this, objArr);
    }
}
