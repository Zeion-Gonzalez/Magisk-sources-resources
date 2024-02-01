package p000a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: a.Fw */
/* loaded from: classes.dex */
public final class C0311Fw extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2364sT f1065g;

    /* renamed from: k */
    public final /* synthetic */ C2412tR f1066k;

    /* renamed from: q */
    public int f1067q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0311Fw(C2412tR c2412tR, InterfaceC2364sT interfaceC2364sT, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f1066k = c2412tR;
        this.f1065g = interfaceC2364sT;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C0311Fw(this.f1066k, this.f1065g, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f1067q;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            C2412tR c2412tR = this.f1066k;
            List list = c2412tR.f7386I;
            List list2 = c2412tR.f4694S;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (((Boolean) this.f1065g.mo85W(obj2)).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
            C0934Ra m2942Q = C1517cb.m2942Q(list, arrayList);
            C1080UE c1080ue = AbstractC0037Al.f179z;
            AbstractC1577de abstractC1577de = AbstractC1342Z8.f4236z;
            C0342GY c0342gy = new C0342GY(c2412tR, arrayList, m2942Q, null);
            this.f1067q = 1;
            if (AbstractC0438II.m1021ZH(abstractC1577de, c0342gy, this) == enumC0464Im) {
                return enumC0464Im;
            }
        }
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C0311Fw) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
