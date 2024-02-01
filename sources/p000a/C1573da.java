package p000a;

/* renamed from: a.da */
/* loaded from: classes.dex */
public final class C1573da extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ Object f4840g;

    /* renamed from: k */
    public /* synthetic */ Object f4841k;

    /* renamed from: q */
    public int f4842q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1573da(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f4840g = obj;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        C1573da c1573da = new C1573da(this.f4840g, interfaceC1171Vv);
        c1573da.f4841k = obj;
        return c1573da;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f4842q;
        if (i == 0) {
            AbstractC1292YB.m2664UZ(obj);
            InterfaceC2445u2 interfaceC2445u2 = (InterfaceC2445u2) this.f4841k;
            C0256Eu c0256Eu = new C0256Eu((C0826PP) this.f4840g);
            this.f4842q = 1;
            if (interfaceC2445u2.mo237h(c0256Eu, this) == enumC0464Im) {
                return enumC0464Im;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1292YB.m2664UZ(obj);
        }
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1573da) mo49G((InterfaceC2445u2) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
