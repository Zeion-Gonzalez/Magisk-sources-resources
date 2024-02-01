package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.tW */
/* loaded from: classes.dex */
public final class C2416tW extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: k */
    public final /* synthetic */ C1688fk f7399k;

    /* renamed from: q */
    public int f7400q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2416tW(C1688fk c1688fk, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f7399k = c1688fk;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C2416tW(this.f7399k, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        Object obj2 = EnumC0464Im.f1557S;
        int i = this.f7400q;
        Object obj3 = C0329GJ.f1115z;
        C1688fk c1688fk = this.f7399k;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            C1835iY c1835iY = c1688fk.f5291g;
            this.f7400q = 1;
            AbstractC0594L7 abstractC0594L7 = c1835iY.f5735z;
            abstractC0594L7.getClass();
            Object m1021ZH = AbstractC0438II.m1021ZH(AbstractC0037Al.f178h, new C0019AL(abstractC0594L7, null), this);
            Object obj4 = m1021ZH;
            if (m1021ZH != obj2) {
                obj4 = obj3;
            }
            if (obj4 != obj2) {
                obj4 = obj3;
            }
            if (obj4 == obj2) {
                return obj2;
            }
        }
        c1688fk.m4500S(new C0805P0((int) R.string.logs_cleared));
        c1688fk.m4181q();
        return obj3;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C2416tW) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
