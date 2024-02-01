package p000a;

/* renamed from: a.gm */
/* loaded from: classes.dex */
public final class C1742gm extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: k */
    public /* synthetic */ Object f5488k;

    /* renamed from: q */
    public int f5489q;

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        C1742gm c1742gm = new C1742gm(interfaceC1171Vv);
        c1742gm.f5488k = obj;
        return c1742gm;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f5489q;
        C0329GJ c0329gj = C0329GJ.f1115z;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            InterfaceC1725gU interfaceC1725gU = (InterfaceC1725gU) this.f5488k;
            C0677Mo c0677Mo = C0677Mo.f2230I;
            this.f5489q = 1;
            c0677Mo.getClass();
            AbstractC0438II.m994F(interfaceC1725gU, null, new C2332rt(null), 3);
            if (c0329gj == enumC0464Im) {
                return enumC0464Im;
            }
        }
        return c0329gj;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1742gm) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
