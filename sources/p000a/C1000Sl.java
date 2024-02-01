package p000a;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: a.Sl */
/* loaded from: classes.dex */
public final class C1000Sl extends AbstractC2750zx implements Serializable {

    /* renamed from: R */
    public static final C1000Sl f3358R;

    /* renamed from: S */
    public final C0642M4 f3359S;

    static {
        C0642M4 c0642m4 = C0642M4.f2068r;
        f3358R = new C1000Sl(C0642M4.f2068r);
    }

    public C1000Sl() {
        this(new C0642M4());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f3359S.m1442z(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        this.f3359S.m1438h();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f3359S.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f3359S.containsKey(obj);
    }

    @Override // p000a.AbstractC2750zx
    /* renamed from: h */
    public final int mo450h() {
        return this.f3359S.f2080y;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f3359S.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C0642M4 c0642m4 = this.f3359S;
        c0642m4.getClass();
        return new C1532cu(c0642m4, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C0642M4 c0642m4 = this.f3359S;
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

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        this.f3359S.m1438h();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        this.f3359S.m1438h();
        return super.retainAll(collection);
    }

    public C1000Sl(C0642M4 c0642m4) {
        this.f3359S = c0642m4;
    }
}
