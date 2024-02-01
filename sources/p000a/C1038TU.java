package p000a;

import java.util.concurrent.Callable;

/* renamed from: a.TU */
/* loaded from: classes.dex */
public final class C1038TU extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: q */
    public final /* synthetic */ Callable f3440q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1038TU(Callable callable, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f3440q = callable;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1038TU(this.f3440q, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        AbstractC1292YB.m2664UZ(obj);
        return this.f3440q.call();
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1038TU) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
