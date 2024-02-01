package p000a;

/* renamed from: a.wc */
/* loaded from: classes.dex */
public final class C2579wc extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: k */
    public final /* synthetic */ C0790Oi f7897k;

    /* renamed from: q */
    public int f7898q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2579wc(C0790Oi c0790Oi, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f7897k = c0790Oi;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C2579wc(this.f7897k, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f7898q;
        C0329GJ c0329gj = C0329GJ.f1115z;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            C1835iY c1835iY = (C1835iY) AbstractC1743gn.f5498o.getValue();
            this.f7898q = 1;
            C1999lb c1999lb = (C1999lb) c1835iY.f5735z;
            Object m1849g = AbstractC0795Op.m1849g(c1999lb.f6210v, new CallableC1446b8(c1999lb, this.f7897k, 0), this);
            if (m1849g != enumC0464Im) {
                m1849g = c0329gj;
            }
            if (m1849g == enumC0464Im) {
                return enumC0464Im;
            }
        }
        return c0329gj;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C2579wc) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
