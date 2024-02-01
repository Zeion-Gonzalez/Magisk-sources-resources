package p000a;

/* renamed from: a.rX */
/* loaded from: classes.dex */
public final class C2313rX extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ C1509cR f7128g;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC0806P1 f7129k;

    /* renamed from: q */
    public int f7130q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2313rX(InterfaceC0806P1 interfaceC0806P1, C1509cR c1509cR, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f7129k = interfaceC0806P1;
        this.f7128g = c1509cR;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C2313rX(this.f7129k, this.f7128g, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f7130q;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            ((C1212We) this.f7129k).getClass();
            C2119nz c2119nz = AbstractC1743gn.f5494Q;
            String str = this.f7128g.f4664S;
            this.f7130q = 1;
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
        return ((C2313rX) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
