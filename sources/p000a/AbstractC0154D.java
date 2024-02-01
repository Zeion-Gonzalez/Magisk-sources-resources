package p000a;

/* renamed from: a.D */
/* loaded from: classes.dex */
public abstract class AbstractC0154D extends C0757O9 implements InterfaceC1171Vv, InterfaceC1725gU {

    /* renamed from: w */
    public final InterfaceC1255XS f512w;

    public AbstractC0154D(InterfaceC1255XS interfaceC1255XS, boolean z) {
        super(z);
        m1735H((InterfaceC1265Xh) interfaceC1255XS.mo107y(C1710g8.f5381k));
        this.f512w = interfaceC1255XS.mo104G(this);
    }

    /* renamed from: B */
    public void mo310B(Throwable th, boolean z) {
    }

    @Override // p000a.InterfaceC1725gU
    /* renamed from: C */
    public final InterfaceC1255XS mo311C() {
        return this.f512w;
    }

    /* renamed from: D */
    public final void m312D(int i, AbstractC0154D abstractC0154D, InterfaceC0559KW interfaceC0559KW) {
        Object c1019t6;
        if (i != 0) {
            int i2 = i - 1;
            C0329GJ c0329gj = C0329GJ.f1115z;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            try {
                                InterfaceC1255XS interfaceC1255XS = this.f512w;
                                Object m2663U8 = AbstractC1292YB.m2663U8(interfaceC1255XS, null);
                                try {
                                    AbstractC0438II.m995G(2, interfaceC0559KW);
                                    c1019t6 = interfaceC0559KW.mo51o(abstractC0154D, this);
                                    if (c1019t6 == EnumC0464Im.f1557S) {
                                        return;
                                    }
                                } finally {
                                    AbstractC1292YB.m2682m(interfaceC1255XS, m2663U8);
                                }
                            } catch (Throwable th) {
                                c1019t6 = new C1019T6(th);
                            }
                            mo320u(c1019t6);
                            return;
                        }
                        throw new C0993Sd();
                    }
                    AbstractC0438II.m1026e(AbstractC0438II.m1027g(abstractC0154D, this, interfaceC0559KW)).mo320u(c0329gj);
                    return;
                }
                return;
            }
            try {
                AbstractC2575wW.m4428dx(AbstractC0438II.m1026e(AbstractC0438II.m1027g(abstractC0154D, this, interfaceC0559KW)), c0329gj, null);
                return;
            } catch (Throwable th2) {
                mo320u(new C1019T6(th2));
                throw th2;
            }
        }
        throw null;
    }

    @Override // p000a.C0757O9
    /* renamed from: I */
    public final String mo313I() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    /* renamed from: K */
    public void mo314K(Object obj) {
    }

    @Override // p000a.InterfaceC1171Vv
    /* renamed from: N */
    public final InterfaceC1255XS mo315N() {
        return this.f512w;
    }

    @Override // p000a.C0757O9
    /* renamed from: c */
    public final void mo316c(C0993Sd c0993Sd) {
        AbstractC0438II.m1000J(this.f512w, c0993Sd);
    }

    @Override // p000a.C0757O9, p000a.InterfaceC1265Xh
    /* renamed from: h */
    public boolean mo317h() {
        return super.mo317h();
    }

    @Override // p000a.C0757O9
    /* renamed from: i */
    public final void mo318i(Object obj) {
        boolean z;
        if (obj instanceof C1663fI) {
            C1663fI c1663fI = (C1663fI) obj;
            Throwable th = c1663fI.f5199z;
            c1663fI.getClass();
            if (C1663fI.f5198h.get(c1663fI) != 0) {
                z = true;
            } else {
                z = false;
            }
            mo310B(th, z);
            return;
        }
        mo314K(obj);
    }

    @Override // p000a.C0757O9
    /* renamed from: p */
    public final String mo319p() {
        return super.mo319p();
    }

    @Override // p000a.InterfaceC1171Vv
    /* renamed from: u */
    public final void mo320u(Object obj) {
        Throwable m4677z = AbstractC2740zk.m4677z(obj);
        if (m4677z != null) {
            obj = new C1663fI(m4677z, false);
        }
        Object m1744Z = m1744Z(obj);
        if (m1744Z == AbstractC0438II.f1461g) {
            return;
        }
        mo31M(m1744Z);
    }
}
