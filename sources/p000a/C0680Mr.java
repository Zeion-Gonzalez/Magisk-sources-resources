package p000a;

/* renamed from: a.Mr */
/* loaded from: classes.dex */
public final class C0680Mr extends AbstractC2219pq {

    /* renamed from: N */
    public final InterfaceC0792Om f2240N;

    /* renamed from: P */
    public final /* synthetic */ int f2241P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0680Mr(C2559wD c2559wD, InterfaceC0820PJ interfaceC0820PJ, InterfaceC2491ux interfaceC2491ux, InterfaceC0792Om interfaceC0792Om, int i) {
        super(c2559wD, interfaceC0820PJ, interfaceC2491ux);
        this.f2241P = i;
        this.f2240N = interfaceC0792Om;
    }

    @Override // p000a.AbstractC2219pq
    /* renamed from: z */
    public final Object mo1580z(C2139oL c2139oL, Object[] objArr) {
        int i = this.f2241P;
        InterfaceC0792Om interfaceC0792Om = this.f2240N;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return interfaceC0792Om.mo1799P(c2139oL);
            default:
                InterfaceC0987SV interfaceC0987SV = (InterfaceC0987SV) interfaceC0792Om.mo1799P(c2139oL);
                InterfaceC1171Vv interfaceC1171Vv = (InterfaceC1171Vv) objArr[objArr.length - 1];
                try {
                    C1525cm c1525cm = new C1525cm(1, AbstractC0438II.m1026e(interfaceC1171Vv));
                    int i2 = 2;
                    c1525cm.m2968y(new C0920RK(interfaceC0987SV, i2));
                    interfaceC0987SV.mo1686h(new C2745zr(c1525cm, i2));
                    Object m2963q = c1525cm.m2963q();
                    EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
                    return m2963q;
                } catch (Exception e) {
                    return AbstractC0438II.m1035n0(e, interfaceC1171Vv);
                }
        }
    }
}
