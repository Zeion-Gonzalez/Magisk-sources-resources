package p000a;

/* renamed from: a.ur */
/* loaded from: classes.dex */
public class C2485ur extends AbstractC0154D implements InterfaceC2683yf {

    /* renamed from: I */
    public final InterfaceC1171Vv f7618I;

    public C2485ur(InterfaceC1171Vv interfaceC1171Vv, InterfaceC1255XS interfaceC1255XS) {
        super(interfaceC1255XS, true);
        this.f7618I = interfaceC1171Vv;
    }

    @Override // p000a.C0757O9
    /* renamed from: F */
    public final boolean mo1734F() {
        return true;
    }

    @Override // p000a.C0757O9
    /* renamed from: M */
    public void mo31M(Object obj) {
        this.f7618I.mo320u(AbstractC0438II.m1001K(obj));
    }

    @Override // p000a.C0757O9
    /* renamed from: W */
    public void mo32W(Object obj) {
        AbstractC2575wW.m4428dx(AbstractC0438II.m1026e(this.f7618I), AbstractC0438II.m1001K(obj), null);
    }

    @Override // p000a.InterfaceC2683yf
    /* renamed from: v */
    public final InterfaceC2683yf mo2966v() {
        InterfaceC1171Vv interfaceC1171Vv = this.f7618I;
        if (interfaceC1171Vv instanceof InterfaceC2683yf) {
            return (InterfaceC2683yf) interfaceC1171Vv;
        }
        return null;
    }
}
