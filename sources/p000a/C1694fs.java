package p000a;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: a.fs */
/* loaded from: classes.dex */
public final class C1694fs extends AbstractList implements InterfaceC0133Ca {

    /* renamed from: S */
    public final ArrayList f5308S = new ArrayList();

    /* renamed from: R */
    public final C0503JV f5307R = new C0503JV();

    /* renamed from: w */
    public final C2059mo f5309w = new C2059mo(this);

    /* renamed from: P */
    public static final int m3195P(C1694fs c1694fs, List list, int i) {
        if (i >= 0) {
            Iterator it = c1694fs.f5308S.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                List list2 = (List) it.next();
                if (list == list2) {
                    return i2 + i;
                }
                i2 += list2.size();
            }
            throw new IllegalArgumentException();
        }
        c1694fs.getClass();
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: N */
    public final void m3198N() {
        C1977lA c1977lA = C1977lA.f6119S;
        int size = size();
        this.f5308S.add(Collections.singletonList(c1977lA));
        ((AbstractList) this).modCount++;
        C0503JV c0503jv = this.f5307R;
        c0503jv.getClass();
        c0503jv.m1195M(this, 2, C0503JV.m1194W(size, 0, 1));
    }

    /* renamed from: Q */
    public final void m3199Q(AbstractList abstractList) {
        InterfaceC0133Ca interfaceC0133Ca;
        int size = size();
        this.f5308S.add(abstractList);
        ((AbstractList) this).modCount++;
        if (abstractList instanceof InterfaceC0133Ca) {
            interfaceC0133Ca = (InterfaceC0133Ca) abstractList;
        } else {
            interfaceC0133Ca = null;
        }
        if (interfaceC0133Ca != null) {
            interfaceC0133Ca.mo262u(this.f5309w);
        }
        if ((!abstractList.isEmpty()) != false) {
            int size2 = abstractList.size();
            C0503JV c0503jv = this.f5307R;
            c0503jv.getClass();
            c0503jv.m1195M(this, 2, C0503JV.m1194W(size, 0, size2));
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        ArrayList arrayList = this.f5308S;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            if (list instanceof InterfaceC0133Ca) {
                ((InterfaceC0133Ca) list).mo263z(this.f5309w);
            }
        }
        ((AbstractList) this).modCount++;
        arrayList.clear();
        if (size > 0) {
            C0503JV c0503jv = this.f5307R;
            c0503jv.getClass();
            c0503jv.m1195M(this, 4, C0503JV.m1194W(0, 0, size));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        Iterator it = this.f5308S.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            int size = list.size();
            if (i < size) {
                return list.get(i);
            }
            i -= size;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        Iterator it = this.f5308S.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((List) it.next()).size();
        }
        return i;
    }

    @Override // p000a.InterfaceC0133Ca
    /* renamed from: u */
    public final void mo262u(AbstractC1193WJ abstractC1193WJ) {
        this.f5307R.m925z(abstractC1193WJ);
    }

    @Override // p000a.InterfaceC0133Ca
    /* renamed from: z */
    public final void mo263z(AbstractC1193WJ abstractC1193WJ) {
        this.f5307R.m923u(abstractC1193WJ);
    }
}
