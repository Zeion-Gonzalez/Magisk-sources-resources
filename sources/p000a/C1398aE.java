package p000a;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: a.aE */
/* loaded from: classes.dex */
public final class C1398aE implements Collection, InterfaceC1564dP {

    /* renamed from: R */
    public final boolean f4401R;

    /* renamed from: S */
    public final Object[] f4402S;

    public C1398aE(Object[] objArr, boolean z) {
        this.f4402S = objArr;
        this.f4401R = z;
    }

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
    public final boolean contains(Object obj) {
        int i;
        Object[] objArr = this.f4402S;
        if (obj == null) {
            int length = objArr.length;
            i = 0;
            while (i < length) {
                if (objArr[i] == null) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            int length2 = objArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (AbstractC1292YB.m2695u(obj, objArr[i2])) {
                    i = i2;
                    break;
                }
            }
            i = -1;
        }
        if (i < 0) {
            return false;
        }
        return true;
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

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f4402S.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2098nX(this.f4402S);
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
    public final int size() {
        return this.f4402S.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f4402S;
        return (this.f4401R && AbstractC1292YB.m2695u(objArr.getClass(), Object[].class)) ? objArr : Arrays.copyOf(objArr, objArr.length, Object[].class);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC1843ih.m3437d2(this, objArr);
    }
}
