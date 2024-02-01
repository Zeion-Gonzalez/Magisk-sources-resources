package p000a;

/* renamed from: a.fv */
/* loaded from: classes.dex */
public final class C1697fv extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ C0653MK f5317g;

    /* renamed from: k */
    public /* synthetic */ Object f5318k;

    /* renamed from: q */
    public int f5319q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1697fv(C0653MK c0653mk, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f5317g = c0653mk;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        C1697fv c1697fv = new C1697fv(this.f5317g, interfaceC1171Vv);
        c1697fv.f5318k = obj;
        return c1697fv;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f5319q;
        C0329GJ c0329gj = C0329GJ.f1115z;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            InterfaceC0829PT interfaceC0829PT = (InterfaceC0829PT) this.f5318k;
            this.f5319q = 1;
            C0653MK c0653mk = this.f5317g;
            c0653mk.getClass();
            int i3 = AbstractC1327Ys.f4211z;
            Object mo1459z = c0653mk.f2102I.mo1459z(new C2415tU((InterfaceC1265Xh) this.f2025R.mo107y(C1710g8.f5381k), new C0190Df(c0653mk.f2105q, 0), interfaceC0829PT, new C0113CB(i2, interfaceC0829PT)), this);
            if (mo1459z != enumC0464Im) {
                mo1459z = c0329gj;
            }
            if (mo1459z == enumC0464Im) {
                return enumC0464Im;
            }
        }
        return c0329gj;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1697fv) mo49G((InterfaceC0829PT) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
