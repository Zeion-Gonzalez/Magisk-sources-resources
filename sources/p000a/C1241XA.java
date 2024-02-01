package p000a;

/* renamed from: a.XA */
/* loaded from: classes.dex */
public final class C1241XA extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ C1509cR f4028g;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC0806P1 f4029k;

    /* renamed from: q */
    public int f4030q;

    /* renamed from: y */
    public final /* synthetic */ String f4031y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241XA(InterfaceC0806P1 interfaceC0806P1, C1509cR c1509cR, String str, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f4029k = interfaceC0806P1;
        this.f4028g = c1509cR;
        this.f4031y = str;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1241XA(this.f4029k, this.f4028g, this.f4031y, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f4030q;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            ((C1212We) this.f4029k).getClass();
            C2119nz c2119nz = AbstractC1743gn.f5494Q;
            String str = this.f4028g.f4664S;
            this.f4030q = 1;
            c2119nz.getClass();
            if (C2119nz.m3737Ha(str, this.f4031y, this) == enumC0464Im) {
                return enumC0464Im;
            }
        }
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1241XA) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
