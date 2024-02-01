package p000a;

/* renamed from: a.rv */
/* loaded from: classes.dex */
public final class C2334rv extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: k */
    public final /* synthetic */ AbstractC1236X5 f7172k;

    /* renamed from: q */
    public int f7173q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2334rv(AbstractC1236X5 abstractC1236X5, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f7172k = abstractC1236X5;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C2334rv(this.f7172k, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f7173q;
        if (i == 0) {
            AbstractC1292YB.m2664UZ(obj);
            this.f7173q = 1;
            obj = this.f7172k.mo1127W();
            if (obj == enumC0464Im) {
                return enumC0464Im;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1292YB.m2664UZ(obj);
        }
        return obj;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C2334rv) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
