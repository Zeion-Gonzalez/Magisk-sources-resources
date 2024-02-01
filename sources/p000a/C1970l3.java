package p000a;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.l3 */
/* loaded from: classes.dex */
public final class C1970l3 extends AbstractC2328ro implements InterfaceC0559KW {
    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1970l3(interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        AbstractC1062Tx[] abstractC1062TxArr;
        boolean z;
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        AbstractC1292YB.m2664UZ(obj);
        C0346Gc.f1163P.getClass();
        AbstractC1062Tx mo305z = C0382HH.m871z().mo305z("/data/adb/modules");
        String[] list = mo305z.list();
        if (list == null) {
            abstractC1062TxArr = null;
        } else {
            int length = list.length;
            AbstractC1062Tx[] mo2223h = mo305z.mo2223h(length);
            for (int i = 0; i < length; i++) {
                mo2223h[i] = mo305z.mo2224v(list[i]);
            }
            abstractC1062TxArr = mo2223h;
        }
        if (abstractC1062TxArr == null) {
            abstractC1062TxArr = new AbstractC1062Tx[0];
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC1062Tx abstractC1062Tx : abstractC1062TxArr) {
            if (!abstractC1062Tx.isFile() && !abstractC1062Tx.isHidden()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(abstractC1062Tx);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1658fB.m3134dx(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C1195WL(AbstractC2441tz.m4200k("/data/adb/modules/", ((AbstractC1062Tx) it.next()).getName())));
        }
        return AbstractC2486us.m4296zd(arrayList2, new C2496v1(5));
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        InterfaceC1725gU interfaceC1725gU = (InterfaceC1725gU) obj;
        return new C1970l3((InterfaceC1171Vv) obj2).mo50V(C0329GJ.f1115z);
    }
}
