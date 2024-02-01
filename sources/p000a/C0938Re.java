package p000a;

/* renamed from: a.Re */
/* loaded from: classes.dex */
public final class C0938Re extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2445u2 f3218g;

    /* renamed from: k */
    public /* synthetic */ Object f3219k;

    /* renamed from: q */
    public int f3220q;

    /* renamed from: y */
    public final /* synthetic */ C0653MK f3221y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0938Re(InterfaceC1171Vv interfaceC1171Vv, InterfaceC2445u2 interfaceC2445u2, C0653MK c0653mk) {
        super(interfaceC1171Vv);
        this.f3218g = interfaceC2445u2;
        this.f3221y = c0653mk;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        C0938Re c0938Re = new C0938Re(interfaceC1171Vv, this.f3218g, this.f3221y);
        c0938Re.f3219k = obj;
        return c0938Re;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        C1066U0 c1066u0;
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f3220q;
        C0329GJ c0329gj = C0329GJ.f1115z;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            InterfaceC1725gU interfaceC1725gU = (InterfaceC1725gU) this.f3219k;
            C0653MK c0653mk = this.f3221y;
            c0653mk.getClass();
            InterfaceC0559KW c1697fv = new C1697fv(c0653mk, null);
            int i2 = c0653mk.f2103R;
            if (i2 != -2) {
                if (i2 != -1) {
                    if (i2 != 0) {
                        if (i2 != Integer.MAX_VALUE) {
                            c1066u0 = new C1066U0(i2, null);
                        } else {
                            c1066u0 = new C1066U0(Integer.MAX_VALUE, null);
                        }
                    } else {
                        c1066u0 = new C1066U0(0, null);
                    }
                } else {
                    c1066u0 = new C0405Hh(1, 2, null);
                }
            } else {
                InterfaceC0969SB.f3285o.getClass();
                c1066u0 = new C1066U0(C0508Jb.f1692h, null);
            }
            InterfaceC1255XS m2668Y = AbstractC1292YB.m2668Y(interfaceC1725gU.mo311C(), c0653mk.f2104S, true);
            C1080UE c1080ue = AbstractC0037Al.f179z;
            if (m2668Y != c1080ue && m2668Y.mo107y(C1710g8.f5377R) == null) {
                m2668Y = m2668Y.mo104G(c1080ue);
            }
            C0744Nx c0744Nx = new C0744Nx(m2668Y, c1066u0);
            c0744Nx.m312D(1, c0744Nx, c1697fv);
            this.f3220q = 1;
            Object m3426U = AbstractC1843ih.m3426U(this.f3218g, c0744Nx, true, this);
            if (m3426U != enumC0464Im) {
                m3426U = c0329gj;
            }
            if (m3426U == enumC0464Im) {
                return enumC0464Im;
            }
        }
        return c0329gj;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C0938Re) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
