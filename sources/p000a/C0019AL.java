package p000a;

/* renamed from: a.AL */
/* loaded from: classes.dex */
public final class C0019AL extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: q */
    public final /* synthetic */ AbstractC0594L7 f126q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0019AL(AbstractC0594L7 abstractC0594L7, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f126q = abstractC0594L7;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C0019AL(this.f126q, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        AbstractC1292YB.m2664UZ(obj);
        this.f126q.f1916z.mo3191v();
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        C0019AL c0019al = (C0019AL) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2);
        C0329GJ c0329gj = C0329GJ.f1115z;
        c0019al.mo50V(c0329gj);
        return c0329gj;
    }
}
