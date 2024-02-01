package p000a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: a.EO */
/* loaded from: classes.dex */
public final class C0230EO extends AbstractC2750zx {

    /* renamed from: R */
    public final C0642M4 f747R;

    /* renamed from: S */
    public final /* synthetic */ int f748S;

    public C0230EO(C0642M4 c0642m4, int i) {
        this.f748S = i;
        if (i != 1) {
            this.f747R = c0642m4;
        } else {
            this.f747R = c0642m4;
        }
    }

    /* renamed from: P */
    public final boolean m449P(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C0642M4 c0642m4 = this.f747R;
        c0642m4.m1438h();
        int m1435N = c0642m4.m1435N(entry.getKey());
        if (m1435N < 0 || !AbstractC1292YB.m2695u(c0642m4.f2071R[m1435N], entry.getValue())) {
            return false;
        }
        c0642m4.m1439o(m1435N);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f748S) {
            case AbstractC0795Op.f2698E /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f748S) {
            case AbstractC0795Op.f2698E /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f748S;
        C0642M4 c0642m4 = this.f747R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                c0642m4.clear();
                return;
            default:
                c0642m4.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f748S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return m451v(obj);
            default:
                return this.f747R.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        switch (this.f748S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return this.f747R.m1441v(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // p000a.AbstractC2750zx
    /* renamed from: h */
    public final int mo450h() {
        int i = this.f748S;
        C0642M4 c0642m4 = this.f747R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return c0642m4.f2080y;
            default:
                return c0642m4.f2080y;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i = this.f748S;
        C0642M4 c0642m4 = this.f747R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return c0642m4.isEmpty();
            default:
                return c0642m4.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f748S;
        C0642M4 c0642m4 = this.f747R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                c0642m4.getClass();
                return new C1532cu(c0642m4, 0);
            default:
                c0642m4.getClass();
                return new C1532cu(c0642m4, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f748S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return m449P(obj);
            default:
                C0642M4 c0642m4 = this.f747R;
                c0642m4.m1438h();
                int m1435N = c0642m4.m1435N(obj);
                if (m1435N < 0) {
                    m1435N = -1;
                } else {
                    c0642m4.m1439o(m1435N);
                }
                if (m1435N >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.f748S;
        C0642M4 c0642m4 = this.f747R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                c0642m4.m1438h();
                return super.removeAll(collection);
            default:
                c0642m4.m1438h();
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.f748S;
        C0642M4 c0642m4 = this.f747R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                c0642m4.m1438h();
                return super.retainAll(collection);
            default:
                c0642m4.m1438h();
                return super.retainAll(collection);
        }
    }

    /* renamed from: v */
    public final boolean m451v(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C0642M4 c0642m4 = this.f747R;
        c0642m4.getClass();
        int m1435N = c0642m4.m1435N(entry.getKey());
        if (m1435N < 0) {
            return false;
        }
        return AbstractC1292YB.m2695u(c0642m4.f2071R[m1435N], entry.getValue());
    }
}
