package p000a;

import java.util.Collection;

/* renamed from: a.CB */
/* loaded from: classes.dex */
public final class C0113CB implements InterfaceC2445u2 {

    /* renamed from: R */
    public final Object f404R;

    /* renamed from: S */
    public final /* synthetic */ int f405S;

    public /* synthetic */ C0113CB(int i, Object obj) {
        this.f405S = i;
        this.f404R = obj;
    }

    @Override // p000a.InterfaceC2445u2
    /* renamed from: h */
    public final Object mo237h(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        int i = this.f405S;
        Object obj2 = this.f404R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((Collection) obj2).add(obj);
                return c0329gj;
            default:
                Object mo907Q = ((InterfaceC1604eC) obj2).mo907Q(obj, interfaceC1171Vv);
                if (mo907Q == EnumC0464Im.f1557S) {
                    return mo907Q;
                }
                return c0329gj;
        }
    }
}
