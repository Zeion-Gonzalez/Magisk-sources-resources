package p000a;

/* renamed from: a.O3 */
/* loaded from: classes.dex */
public final class C0751O3 extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: k */
    public final /* synthetic */ AbstractC0438II f2556k;

    /* renamed from: q */
    public int f2557q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0751O3(AbstractC0438II abstractC0438II, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f2556k = abstractC0438II;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C0751O3(this.f2556k, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f2557q;
        if (i == 0) {
            AbstractC1292YB.m2664UZ(obj);
            this.f2557q = 1;
            obj = this.f2556k.mo362f(this);
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
        return ((C0751O3) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
