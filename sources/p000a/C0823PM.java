package p000a;

import java.util.Comparator;

/* renamed from: a.PM */
/* loaded from: classes.dex */
public final /* synthetic */ class C0823PM implements Comparator {

    /* renamed from: h */
    public final /* synthetic */ Object f2793h;

    /* renamed from: z */
    public final /* synthetic */ int f2794z;

    public /* synthetic */ C0823PM(int i, Object obj) {
        this.f2794z = i;
        this.f2793h = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f2794z;
        Object obj3 = this.f2793h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return ((Number) ((InterfaceC0559KW) obj3).mo51o(obj, obj2)).intValue();
            default:
                for (InterfaceC2364sT interfaceC2364sT : (InterfaceC2364sT[]) obj3) {
                    int m2690q = AbstractC1292YB.m2690q((Comparable) interfaceC2364sT.mo85W(obj), (Comparable) interfaceC2364sT.mo85W(obj2));
                    if (m2690q != 0) {
                        return m2690q;
                    }
                }
                return 0;
        }
    }
}
