package p000a;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: a.uM */
/* loaded from: classes.dex */
public final class C2460uM implements Collection {

    /* renamed from: S */
    public final /* synthetic */ AbstractC0632Lt f7542S;

    public C2460uM(AbstractC0632Lt abstractC0632Lt) {
        this.f7542S = abstractC0632Lt;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f7542S.mo1407N();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7542S.mo1405G(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
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
        return this.f7542S.mo1416o() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2202pT(this.f7542S, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        AbstractC0632Lt abstractC0632Lt = this.f7542S;
        int mo1405G = abstractC0632Lt.mo1405G(obj);
        if (mo1405G < 0) {
            return false;
        }
        abstractC0632Lt.mo1412V(mo1405G);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        AbstractC0632Lt abstractC0632Lt = this.f7542S;
        int mo1416o = abstractC0632Lt.mo1416o();
        int i = 0;
        boolean z = false;
        while (i < mo1416o) {
            if (collection.contains(abstractC0632Lt.mo1409Q(i, 1))) {
                abstractC0632Lt.mo1412V(i);
                i--;
                mo1416o--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        AbstractC0632Lt abstractC0632Lt = this.f7542S;
        int mo1416o = abstractC0632Lt.mo1416o();
        int i = 0;
        boolean z = false;
        while (i < mo1416o) {
            if (!collection.contains(abstractC0632Lt.mo1409Q(i, 1))) {
                abstractC0632Lt.mo1412V(i);
                i--;
                mo1416o--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f7542S.mo1416o();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        AbstractC0632Lt abstractC0632Lt = this.f7542S;
        int mo1416o = abstractC0632Lt.mo1416o();
        Object[] objArr = new Object[mo1416o];
        for (int i = 0; i < mo1416o; i++) {
            objArr[i] = abstractC0632Lt.mo1409Q(i, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f7542S.m1404E(1, objArr);
    }
}
