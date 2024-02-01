package p000a;

/* renamed from: a.XG */
/* loaded from: classes.dex */
public final class C1246XG extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ C1509cR f4043g;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC0806P1 f4044k;

    /* renamed from: q */
    public int f4045q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1246XG(InterfaceC0806P1 interfaceC0806P1, C1509cR c1509cR, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f4044k = interfaceC0806P1;
        this.f4043g = c1509cR;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1246XG(this.f4044k, this.f4043g, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f4045q;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            ((C1212We) this.f4044k).getClass();
            C2119nz c2119nz = AbstractC1743gn.f5494Q;
            String str = this.f4043g.f4664S;
            this.f4045q = 1;
            c2119nz.getClass();
            if (C2119nz.m3738dx(str, this) == enumC0464Im) {
                return enumC0464Im;
            }
        }
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1246XG) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
