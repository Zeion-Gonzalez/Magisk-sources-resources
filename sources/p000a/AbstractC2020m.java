package p000a;

/* renamed from: a.m */
/* loaded from: classes.dex */
public abstract class AbstractC2020m implements InterfaceC1088UM {

    /* renamed from: S */
    public final InterfaceC0631Ls f6279S;

    public AbstractC2020m(InterfaceC0631Ls interfaceC0631Ls) {
        this.f6279S = interfaceC0631Ls;
    }

    @Override // p000a.InterfaceC1255XS
    /* renamed from: G */
    public final InterfaceC1255XS mo104G(InterfaceC1255XS interfaceC1255XS) {
        return AbstractC0438II.m1002L(this, interfaceC1255XS);
    }

    @Override // p000a.InterfaceC1255XS
    /* renamed from: V */
    public InterfaceC1255XS mo105V(InterfaceC0631Ls interfaceC0631Ls) {
        if (AbstractC1292YB.m2695u(getKey(), interfaceC0631Ls)) {
            return C0070BN.f302S;
        }
        return this;
    }

    @Override // p000a.InterfaceC1088UM
    public final InterfaceC0631Ls getKey() {
        return this.f6279S;
    }

    @Override // p000a.InterfaceC1255XS
    /* renamed from: x */
    public final Object mo106x(Object obj, InterfaceC0559KW interfaceC0559KW) {
        return interfaceC0559KW.mo51o(obj, this);
    }

    @Override // p000a.InterfaceC1255XS
    /* renamed from: y */
    public InterfaceC1088UM mo107y(InterfaceC0631Ls interfaceC0631Ls) {
        if (AbstractC1292YB.m2695u(getKey(), interfaceC0631Ls)) {
            return this;
        }
        return null;
    }
}
