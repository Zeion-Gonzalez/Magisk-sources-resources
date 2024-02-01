package p000a;

/* renamed from: a.Ht */
/* loaded from: classes.dex */
public final class C0417Ht extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: k */
    public final /* synthetic */ AbstractC2439tx f1389k;

    /* renamed from: q */
    public int f1390q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0417Ht(AbstractC2439tx abstractC2439tx, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f1389k = abstractC2439tx;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C0417Ht(this.f1389k, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f1390q;
        if (i == 0) {
            AbstractC1292YB.m2664UZ(obj);
            this.f1390q = 1;
            if (this.f1389k.mo1139I(this) == enumC0464Im) {
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
        return ((C0417Ht) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
