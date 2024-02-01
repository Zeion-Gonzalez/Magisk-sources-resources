package p000a;

/* renamed from: a.Ci */
/* loaded from: classes.dex */
public final class C0140Ci extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: q */
    public int f485q;

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C0140Ci(interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f485q;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            C0468Ir c0468Ir = AbstractC1743gn.f5493P;
            this.f485q = 1;
            c0468Ir.getClass();
            if (C0468Ir.m1131dx(2000, this) == enumC0464Im) {
                return enumC0464Im;
            }
        }
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        C1212We.f3945M.mo2367P(c1212We, C1212We.f3959h[5], 2);
        return Boolean.valueOf(c1212We.m2501v().edit().commit());
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        InterfaceC1725gU interfaceC1725gU = (InterfaceC1725gU) obj;
        return new C0140Ci((InterfaceC1171Vv) obj2).mo50V(C0329GJ.f1115z);
    }
}
