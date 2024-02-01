package p000a;

import java.util.Iterator;
import java.util.Map;

/* renamed from: a.Kn */
/* loaded from: classes.dex */
public final class C0576Kn extends C1112Up {

    /* renamed from: V */
    public final C1789hf f1876V = new C1789hf();

    @Override // androidx.lifecycle.AbstractC2764h
    /* renamed from: o */
    public final void mo1307o() {
        Iterator it = this.f1876V.iterator();
        while (true) {
            AbstractC1712gB abstractC1712gB = (AbstractC1712gB) it;
            if (abstractC1712gB.hasNext()) {
                C2401tD c2401tD = (C2401tD) ((Map.Entry) abstractC1712gB.next()).getValue();
                c2401tD.f7333S.m4846W(c2401tD);
            } else {
                return;
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC2764h
    /* renamed from: u */
    public final void mo1308u() {
        Iterator it = this.f1876V.iterator();
        while (true) {
            AbstractC1712gB abstractC1712gB = (AbstractC1712gB) it;
            if (abstractC1712gB.hasNext()) {
                C2401tD c2401tD = (C2401tD) ((Map.Entry) abstractC1712gB.next()).getValue();
                c2401tD.f7333S.m4845Q(c2401tD);
            } else {
                return;
            }
        }
    }
}
