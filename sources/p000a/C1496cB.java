package p000a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: a.cB */
/* loaded from: classes.dex */
public final class C1496cB {

    /* renamed from: P */
    public final List f4641P;

    /* renamed from: h */
    public final List f4642h;

    /* renamed from: v */
    public final C0175DP f4643v;

    /* renamed from: z */
    public final ArrayList f4644z;

    public C1496cB(C1203WU c1203wu) {
        List list = (List) c1203wu.f3912P;
        Set set = (Set) c1203wu.f3914v;
        LinkedHashSet linkedHashSet = C1858j0.f5795I;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(C1858j0.f5796q.get((Class) it.next()));
        }
        this.f4644z = arrayList;
        C0175DP c0175dp = (C0175DP) c1203wu.f3911N;
        this.f4643v = c0175dp == null ? new C0175DP(14, c1203wu) : c0175dp;
        this.f4641P = (List) c1203wu.f3913h;
        List list2 = (List) c1203wu.f3915z;
        this.f4642h = list2;
        new C2105nf(new C1624eZ(list2, 18, Collections.emptyMap()));
    }
}
