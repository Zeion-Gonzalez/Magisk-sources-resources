package p000a;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: a.Bt */
/* loaded from: classes.dex */
public final class C0096Bt extends AbstractCollection implements Collection, InterfaceC2042mU {

    /* renamed from: S */
    public final C0642M4 f356S;

    public C0096Bt(C0642M4 c0642m4) {
        this.f356S = c0642m4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f356S.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f356S.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f356S.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C0642M4 c0642m4 = this.f356S;
        c0642m4.getClass();
        return new C1532cu(c0642m4, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        C0642M4 c0642m4 = this.f356S;
        c0642m4.m1438h();
        int i2 = c0642m4.f2076k;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (c0642m4.f2079w[i2] >= 0 && AbstractC1292YB.m2695u(c0642m4.f2071R[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        c0642m4.m1439o(i);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.f356S.m1438h();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.f356S.m1438h();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f356S.f2080y;
    }
}
