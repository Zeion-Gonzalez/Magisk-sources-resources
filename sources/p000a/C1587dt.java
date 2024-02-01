package p000a;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: a.dt */
/* loaded from: classes.dex */
public final class C1587dt extends ArrayList implements InterfaceC0133Ca {

    /* renamed from: S */
    public transient C0503JV f4876S = new C0503JV();

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        super.add(i, obj);
        C0503JV c0503jv = this.f4876S;
        if (c0503jv != null) {
            c0503jv.m1195M(this, 2, C0503JV.m1194W(i, 0, 1));
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        boolean addAll = super.addAll(i, collection);
        if (addAll) {
            int size = collection.size();
            C0503JV c0503jv = this.f4876S;
            if (c0503jv != null) {
                c0503jv.m1195M(this, 2, C0503JV.m1194W(i, 0, size));
            }
        }
        return addAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        C0503JV c0503jv;
        int size = size();
        super.clear();
        if (size != 0 && (c0503jv = this.f4876S) != null) {
            c0503jv.m1195M(this, 4, C0503JV.m1194W(0, 0, size));
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object remove = super.remove(i);
        C0503JV c0503jv = this.f4876S;
        if (c0503jv != null) {
            c0503jv.m1195M(this, 4, C0503JV.m1194W(i, 0, 1));
        }
        return remove;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public final void removeRange(int i, int i2) {
        super.removeRange(i, i2);
        int i3 = i2 - i;
        C0503JV c0503jv = this.f4876S;
        if (c0503jv != null) {
            c0503jv.m1195M(this, 4, C0503JV.m1194W(i, 0, i3));
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = super.set(i, obj);
        C0503JV c0503jv = this.f4876S;
        if (c0503jv != null) {
            c0503jv.m1195M(this, 1, C0503JV.m1194W(i, 0, 1));
        }
        return obj2;
    }

    @Override // p000a.InterfaceC0133Ca
    /* renamed from: u */
    public final void mo262u(AbstractC1193WJ abstractC1193WJ) {
        if (this.f4876S == null) {
            this.f4876S = new C0503JV();
        }
        this.f4876S.m925z(abstractC1193WJ);
    }

    @Override // p000a.InterfaceC0133Ca
    /* renamed from: z */
    public final void mo263z(AbstractC1193WJ abstractC1193WJ) {
        C0503JV c0503jv = this.f4876S;
        if (c0503jv != null) {
            c0503jv.m923u(abstractC1193WJ);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        super.add(obj);
        int size = size() - 1;
        C0503JV c0503jv = this.f4876S;
        if (c0503jv != null) {
            c0503jv.m1195M(this, 2, C0503JV.m1194W(size, 0, 1));
        }
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        int size = size();
        boolean addAll = super.addAll(collection);
        if (addAll) {
            int size2 = size() - size;
            C0503JV c0503jv = this.f4876S;
            if (c0503jv != null) {
                c0503jv.m1195M(this, 2, C0503JV.m1194W(size, 0, size2));
            }
        }
        return addAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
