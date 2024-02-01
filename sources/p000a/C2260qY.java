package p000a;

/* renamed from: a.qY */
/* loaded from: classes.dex */
public final class C2260qY extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ C1509cR f6952g;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC0806P1 f6953k;

    /* renamed from: q */
    public int f6954q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2260qY(InterfaceC0806P1 interfaceC0806P1, C1509cR c1509cR, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f6953k = interfaceC0806P1;
        this.f6952g = c1509cR;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C2260qY(this.f6953k, this.f6952g, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f6954q;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            ((C1212We) this.f6953k).getClass();
            C2119nz c2119nz = AbstractC1743gn.f5494Q;
            C1509cR c1509cR = this.f6952g;
            String str = c1509cR.f4664S;
            String str2 = c1509cR.f4663R;
            this.f6954q = 1;
            obj = c2119nz.m3739Lq(str, str2, this);
            if (obj == enumC0464Im) {
                return enumC0464Im;
            }
        }
        return obj;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C2260qY) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
