package p000a;

import java.util.concurrent.Callable;

/* renamed from: a.Bu */
/* loaded from: classes.dex */
public final class C0097Bu extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2363sS f357k;

    /* renamed from: q */
    public final /* synthetic */ Callable f358q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0097Bu(Callable callable, InterfaceC2363sS interfaceC2363sS, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f358q = callable;
        this.f357k = interfaceC2363sS;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C0097Bu(this.f358q, this.f357k, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        InterfaceC2363sS interfaceC2363sS = this.f357k;
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        AbstractC1292YB.m2664UZ(obj);
        try {
            interfaceC2363sS.mo320u(this.f358q.call());
        } catch (Throwable th) {
            interfaceC2363sS.mo320u(new C1019T6(th));
        }
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        C0097Bu c0097Bu = (C0097Bu) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2);
        C0329GJ c0329gj = C0329GJ.f1115z;
        c0097Bu.mo50V(c0329gj);
        return c0329gj;
    }
}
