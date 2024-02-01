package p000a;

/* renamed from: a.GP */
/* loaded from: classes.dex */
public final class C0334GP extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ C1509cR f1133g;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC0806P1 f1134k;

    /* renamed from: q */
    public int f1135q;

    /* renamed from: y */
    public final /* synthetic */ String f1136y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0334GP(InterfaceC0806P1 interfaceC0806P1, C1509cR c1509cR, String str, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f1134k = interfaceC0806P1;
        this.f1133g = c1509cR;
        this.f1136y = str;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C0334GP(this.f1134k, this.f1133g, this.f1136y, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f1135q;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            ((C1212We) this.f1134k).getClass();
            C2119nz c2119nz = AbstractC1743gn.f5494Q;
            String str = this.f1133g.f4664S;
            this.f1135q = 1;
            c2119nz.getClass();
            if (C2119nz.m3737Ha(str, this.f1136y, this) == enumC0464Im) {
                return enumC0464Im;
            }
        }
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C0334GP) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
