package p000a;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: a.fB */
/* loaded from: classes.dex */
public abstract class AbstractC1658fB extends AbstractC1292YB {
    /* renamed from: Ha */
    public static final LinkedHashSet m3130Ha(Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0438II.m990C(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    /* renamed from: Lq */
    public static final ArrayList m3131Lq(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: Pm */
    public static final List m3132Pm(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new C1398aE(objArr, false));
            }
            return Collections.singletonList(objArr[0]);
        }
        return C1239X8.f4021S;
    }

    /* renamed from: ZH */
    public static final void m3133ZH(File file) {
        EnumC1784hY enumC1784hY = EnumC1784hY.f5605S;
        C2697yw c2697yw = new C2697yw(new C1651f2(file));
        while (true) {
            boolean z = true;
            while (c2697yw.hasNext()) {
                File file2 = (File) c2697yw.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return;
        }
    }

    /* renamed from: dx */
    public static final int m3134dx(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
