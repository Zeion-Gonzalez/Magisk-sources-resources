package p000a;

import java.util.Iterator;

/* renamed from: a.vv */
/* loaded from: classes.dex */
public class C2546vv extends C1472bf {

    /* renamed from: S */
    public int f7789S;

    public C2546vv(AbstractC1790hg abstractC1790hg) {
        super(abstractC1790hg);
        this.f4565N = abstractC1790hg instanceof C1715gF ? 2 : 3;
    }

    @Override // p000a.C1472bf
    /* renamed from: P */
    public final void mo2881P(int i) {
        if (this.f4563G) {
            return;
        }
        this.f4563G = true;
        this.f4572u = i;
        Iterator it = this.f4564M.iterator();
        while (it.hasNext()) {
            InterfaceC1298YI interfaceC1298YI = (InterfaceC1298YI) it.next();
            interfaceC1298YI.mo1916z(interfaceC1298YI);
        }
    }
}
