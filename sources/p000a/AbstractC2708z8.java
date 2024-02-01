package p000a;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;

/* renamed from: a.z8 */
/* loaded from: classes.dex */
public abstract class AbstractC2708z8 extends AbstractC0774OQ {
    /* renamed from: BX */
    public static final void m4635BX(ArrayList arrayList, InterfaceC2364sT interfaceC2364sT) {
        int m2642C;
        if (!(arrayList instanceof RandomAccess)) {
            if ((arrayList instanceof InterfaceC1564dP) && !(arrayList instanceof InterfaceC2042mU)) {
                AbstractC0438II.m993EC("kotlin.collections.MutableIterable", arrayList);
                throw null;
            }
            m4636G5(arrayList, interfaceC2364sT, true);
            return;
        }
        int i = 0;
        C2482un it = new C0325GF(0, AbstractC1292YB.m2642C(arrayList)).iterator();
        while (it.f7602w) {
            int m4257h = it.m4257h();
            Object obj = arrayList.get(m4257h);
            if (!((Boolean) interfaceC2364sT.mo85W(obj)).booleanValue()) {
                if (i != m4257h) {
                    arrayList.set(i, obj);
                }
                i++;
            }
        }
        if (i >= arrayList.size() || i > (m2642C = AbstractC1292YB.m2642C(arrayList))) {
            return;
        }
        while (true) {
            arrayList.remove(m2642C);
            if (m2642C != i) {
                m2642C--;
            } else {
                return;
            }
        }
    }

    /* renamed from: G5 */
    public static final boolean m4636G5(Collection collection, InterfaceC2364sT interfaceC2364sT, boolean z) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC2364sT.mo85W(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: oI */
    public static final void m4637oI(Iterable iterable, AbstractCollection abstractCollection) {
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }
}
