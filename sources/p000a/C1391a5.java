package p000a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: a.a5 */
/* loaded from: classes.dex */
public final class C1391a5 implements Set {

    /* renamed from: R */
    public final /* synthetic */ AbstractC0632Lt f4332R;

    /* renamed from: S */
    public final /* synthetic */ int f4333S;

    public /* synthetic */ C1391a5(AbstractC0632Lt abstractC0632Lt, int i) {
        this.f4333S = i;
        this.f4332R = abstractC0632Lt;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f4333S) {
            case AbstractC0795Op.f2698E /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f4333S) {
            case AbstractC0795Op.f2698E /* 0 */:
                AbstractC0632Lt abstractC0632Lt = this.f4332R;
                int mo1416o = abstractC0632Lt.mo1416o();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    abstractC0632Lt.mo1406M(entry.getKey(), entry.getValue());
                }
                if (mo1416o != abstractC0632Lt.mo1416o()) {
                    return true;
                }
                return false;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int i = this.f4333S;
        AbstractC0632Lt abstractC0632Lt = this.f4332R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                abstractC0632Lt.mo1407N();
                return;
            default:
                abstractC0632Lt.mo1407N();
                return;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f4333S;
        boolean z = true;
        AbstractC0632Lt abstractC0632Lt = this.f4332R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int mo1413W = abstractC0632Lt.mo1413W(entry.getKey());
                if (mo1413W < 0) {
                    return false;
                }
                Object mo1409Q = abstractC0632Lt.mo1409Q(mo1413W, 1);
                Object value = entry.getValue();
                if (mo1409Q != value && (mo1409Q == null || !mo1409Q.equals(value))) {
                    z = false;
                }
                return z;
            default:
                if (abstractC0632Lt.mo1413W(obj) >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f4333S) {
            case AbstractC0795Op.f2698E /* 0 */:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                C1186WB mo1418u = this.f4332R.mo1418u();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!mo1418u.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f4333S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return AbstractC0632Lt.m1402I(this, obj);
            default:
                return AbstractC0632Lt.m1402I(this, obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = this.f4333S;
        AbstractC0632Lt abstractC0632Lt = this.f4332R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                int i2 = 0;
                for (int mo1416o = abstractC0632Lt.mo1416o() - 1; mo1416o >= 0; mo1416o--) {
                    Object mo1409Q = abstractC0632Lt.mo1409Q(mo1416o, 0);
                    Object mo1409Q2 = abstractC0632Lt.mo1409Q(mo1416o, 1);
                    if (mo1409Q == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = mo1409Q.hashCode();
                    }
                    if (mo1409Q2 == null) {
                        hashCode3 = 0;
                    } else {
                        hashCode3 = mo1409Q2.hashCode();
                    }
                    i2 += hashCode2 ^ hashCode3;
                }
                return i2;
            default:
                int i3 = 0;
                for (int mo1416o2 = abstractC0632Lt.mo1416o() - 1; mo1416o2 >= 0; mo1416o2--) {
                    Object mo1409Q3 = abstractC0632Lt.mo1409Q(mo1416o2, 0);
                    if (mo1409Q3 == null) {
                        hashCode = 0;
                    } else {
                        hashCode = mo1409Q3.hashCode();
                    }
                    i3 += hashCode;
                }
                return i3;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        int i = this.f4333S;
        AbstractC0632Lt abstractC0632Lt = this.f4332R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (abstractC0632Lt.mo1416o() == 0) {
                    return true;
                }
                return false;
            default:
                if (abstractC0632Lt.mo1416o() == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f4333S;
        AbstractC0632Lt abstractC0632Lt = this.f4332R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new C0254Er(abstractC0632Lt);
            default:
                return new C2202pT(abstractC0632Lt, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f4333S) {
            case AbstractC0795Op.f2698E /* 0 */:
                throw new UnsupportedOperationException();
            default:
                AbstractC0632Lt abstractC0632Lt = this.f4332R;
                int mo1413W = abstractC0632Lt.mo1413W(obj);
                if (mo1413W >= 0) {
                    abstractC0632Lt.mo1412V(mo1413W);
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f4333S) {
            case AbstractC0795Op.f2698E /* 0 */:
                throw new UnsupportedOperationException();
            default:
                C1186WB mo1418u = this.f4332R.mo1418u();
                int i = mo1418u.f8517w;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    mo1418u.remove(it.next());
                }
                if (i != mo1418u.f8517w) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f4333S) {
            case AbstractC0795Op.f2698E /* 0 */:
                throw new UnsupportedOperationException();
            default:
                return AbstractC0632Lt.m1403s(this.f4332R.mo1418u(), collection);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        int i = this.f4333S;
        AbstractC0632Lt abstractC0632Lt = this.f4332R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return abstractC0632Lt.mo1416o();
            default:
                return abstractC0632Lt.mo1416o();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f4333S) {
            case AbstractC0795Op.f2698E /* 0 */:
                throw new UnsupportedOperationException();
            default:
                AbstractC0632Lt abstractC0632Lt = this.f4332R;
                int mo1416o = abstractC0632Lt.mo1416o();
                Object[] objArr = new Object[mo1416o];
                for (int i = 0; i < mo1416o; i++) {
                    objArr[i] = abstractC0632Lt.mo1409Q(i, 0);
                }
                return objArr;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f4333S) {
            case AbstractC0795Op.f2698E /* 0 */:
                throw new UnsupportedOperationException();
            default:
                return this.f4332R.m1404E(0, objArr);
        }
    }
}
