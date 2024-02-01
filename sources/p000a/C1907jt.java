package p000a;

/* renamed from: a.jt */
/* loaded from: classes.dex */
public final class C1907jt extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: k */
    public final /* synthetic */ DialogC2727zU f5948k;

    /* renamed from: q */
    public int f5949q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1907jt(DialogC2727zU dialogC2727zU, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f5948k = dialogC2727zU;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1907jt(this.f5948k, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f5949q;
        if (i == 0) {
            AbstractC1292YB.m2664UZ(obj);
            C0623Li c0623Li = new C0623Li(new C1407aQ(10, this.f5948k));
            this.f5949q = 1;
            if (c0623Li.m1389q(this) == enumC0464Im) {
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
        return ((C1907jt) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
