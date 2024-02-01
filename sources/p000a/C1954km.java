package p000a;

/* renamed from: a.km */
/* loaded from: classes.dex */
public final class C1954km extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ C2106ng f6051g;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC0806P1 f6052k;

    /* renamed from: q */
    public int f6053q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1954km(InterfaceC0806P1 interfaceC0806P1, C2106ng c2106ng, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f6052k = interfaceC0806P1;
        this.f6051g = c2106ng;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1954km(this.f6052k, this.f6051g, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f6053q;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            ((C1212We) this.f6052k).getClass();
            C2119nz c2119nz = AbstractC1743gn.f5492N;
            C2106ng c2106ng = this.f6051g;
            String str = c2106ng.f6504S;
            int i2 = c2106ng.f6503R;
            this.f6053q = 1;
            obj = c2119nz.m3740ZH(str, i2, this);
            if (obj == enumC0464Im) {
                return enumC0464Im;
            }
        }
        return obj;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1954km) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
