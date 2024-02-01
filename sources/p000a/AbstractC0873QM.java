package p000a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: a.QM */
/* loaded from: classes.dex */
public abstract class AbstractC0873QM extends AbstractC0438II {
    /* renamed from: BX */
    public static final InterfaceC2296rE m2010BX(Object obj, C1980lF c1980lF) {
        return obj == null ? C2304rN.f7107z : new C1831iT(new C1407aQ(12, obj), c1980lF);
    }

    /* renamed from: G5 */
    public static final InterfaceC2296rE m2011G5(Iterator it) {
        C1228Wy c1228Wy = new C1228Wy(4, it);
        if (!(c1228Wy instanceof C2333ru)) {
            return new C2333ru(c1228Wy);
        }
        return c1228Wy;
    }

    /* renamed from: d2 */
    public static final Map m2012d2(ArrayList arrayList) {
        C1202WT c1202wt = C1202WT.f3909S;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0438II.m990C(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0084Bc c0084Bc = (C0084Bc) it.next();
                    linkedHashMap.put(c0084Bc.f329S, c0084Bc.f328R);
                }
                return linkedHashMap;
            }
            C0084Bc c0084Bc2 = (C0084Bc) arrayList.get(0);
            return Collections.singletonMap(c0084Bc2.f329S, c0084Bc2.f328R);
        }
        return c1202wt;
    }

    /* renamed from: dG */
    public static final Map m2013dG(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size != 0) {
            if (size != 1) {
                return new LinkedHashMap(linkedHashMap);
            }
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
        return C1202WT.f3909S;
    }
}
