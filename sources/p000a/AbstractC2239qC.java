package p000a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: a.qC */
/* loaded from: classes.dex */
public abstract class AbstractC2239qC extends AbstractC0873QM {
    /* renamed from: O4 */
    public static final InterfaceC2296rE m3878O4(C2211pf c2211pf) {
        return c2211pf instanceof InterfaceC0149Cv ? ((InterfaceC0149Cv) c2211pf).mo22h() : new C2538vl(c2211pf, 30, 1);
    }

    /* renamed from: nB */
    public static final List m3879nB(InterfaceC2296rE interfaceC2296rE) {
        Iterator it = interfaceC2296rE.iterator();
        if (!it.hasNext()) {
            return C1239X8.f4021S;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(next);
            if (it.hasNext()) {
                next = it.next();
            } else {
                return arrayList;
            }
        }
    }
}
