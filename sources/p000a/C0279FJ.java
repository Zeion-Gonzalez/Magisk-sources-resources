package p000a;

import java.io.Serializable;

/* renamed from: a.FJ */
/* loaded from: classes.dex */
public final class C0279FJ implements InterfaceC1255XS, Serializable {

    /* renamed from: R */
    public final InterfaceC1088UM f960R;

    /* renamed from: S */
    public final InterfaceC1255XS f961S;

    public C0279FJ(InterfaceC1088UM interfaceC1088UM, InterfaceC1255XS interfaceC1255XS) {
        this.f961S = interfaceC1255XS;
        this.f960R = interfaceC1088UM;
    }

    @Override // p000a.InterfaceC1255XS
    /* renamed from: G */
    public final InterfaceC1255XS mo104G(InterfaceC1255XS interfaceC1255XS) {
        return AbstractC0438II.m1002L(this, interfaceC1255XS);
    }

    @Override // p000a.InterfaceC1255XS
    /* renamed from: V */
    public final InterfaceC1255XS mo105V(InterfaceC0631Ls interfaceC0631Ls) {
        InterfaceC1088UM interfaceC1088UM = this.f960R;
        InterfaceC1088UM mo107y = interfaceC1088UM.mo107y(interfaceC0631Ls);
        InterfaceC1255XS interfaceC1255XS = this.f961S;
        if (mo107y != null) {
            return interfaceC1255XS;
        }
        InterfaceC1255XS mo105V = interfaceC1255XS.mo105V(interfaceC0631Ls);
        return mo105V == interfaceC1255XS ? this : mo105V == C0070BN.f302S ? interfaceC1088UM : new C0279FJ(interfaceC1088UM, mo105V);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof C0279FJ)) {
                return false;
            }
            C0279FJ c0279fj = (C0279FJ) obj;
            c0279fj.getClass();
            int i = 2;
            C0279FJ c0279fj2 = c0279fj;
            int i2 = 2;
            while (true) {
                InterfaceC1255XS interfaceC1255XS = c0279fj2.f961S;
                if (interfaceC1255XS instanceof C0279FJ) {
                    c0279fj2 = (C0279FJ) interfaceC1255XS;
                } else {
                    c0279fj2 = null;
                }
                if (c0279fj2 == null) {
                    break;
                }
                i2++;
            }
            C0279FJ c0279fj3 = this;
            while (true) {
                InterfaceC1255XS interfaceC1255XS2 = c0279fj3.f961S;
                if (interfaceC1255XS2 instanceof C0279FJ) {
                    c0279fj3 = (C0279FJ) interfaceC1255XS2;
                } else {
                    c0279fj3 = null;
                }
                if (c0279fj3 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            C0279FJ c0279fj4 = this;
            while (true) {
                InterfaceC1088UM interfaceC1088UM = c0279fj4.f960R;
                if (!AbstractC1292YB.m2695u(c0279fj.mo107y(interfaceC1088UM.getKey()), interfaceC1088UM)) {
                    z = false;
                    break;
                }
                InterfaceC1255XS interfaceC1255XS3 = c0279fj4.f961S;
                if (interfaceC1255XS3 instanceof C0279FJ) {
                    c0279fj4 = (C0279FJ) interfaceC1255XS3;
                } else {
                    InterfaceC1088UM interfaceC1088UM2 = (InterfaceC1088UM) interfaceC1255XS3;
                    z = AbstractC1292YB.m2695u(c0279fj.mo107y(interfaceC1088UM2.getKey()), interfaceC1088UM2);
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f960R.hashCode() + this.f961S.hashCode();
    }

    public final String toString() {
        return "[" + ((String) mo106x("", C0582Ku.f1888I)) + ']';
    }

    @Override // p000a.InterfaceC1255XS
    /* renamed from: x */
    public final Object mo106x(Object obj, InterfaceC0559KW interfaceC0559KW) {
        return interfaceC0559KW.mo51o(this.f961S.mo106x(obj, interfaceC0559KW), this.f960R);
    }

    @Override // p000a.InterfaceC1255XS
    /* renamed from: y */
    public final InterfaceC1088UM mo107y(InterfaceC0631Ls interfaceC0631Ls) {
        C0279FJ c0279fj = this;
        while (true) {
            InterfaceC1088UM mo107y = c0279fj.f960R.mo107y(interfaceC0631Ls);
            if (mo107y != null) {
                return mo107y;
            }
            InterfaceC1255XS interfaceC1255XS = c0279fj.f961S;
            if (!(interfaceC1255XS instanceof C0279FJ)) {
                return interfaceC1255XS.mo107y(interfaceC0631Ls);
            }
            c0279fj = (C0279FJ) interfaceC1255XS;
        }
    }
}
