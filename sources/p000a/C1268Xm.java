package p000a;

/* renamed from: a.Xm */
/* loaded from: classes.dex */
public final class C1268Xm extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: q */
    public final /* synthetic */ Runnable f4087q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1268Xm(Runnable runnable, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f4087q = runnable;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1268Xm(this.f4087q, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        AbstractC1292YB.m2664UZ(obj);
        this.f4087q.run();
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        C1268Xm c1268Xm = (C1268Xm) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2);
        C0329GJ c0329gj = C0329GJ.f1115z;
        c1268Xm.mo50V(c0329gj);
        return c0329gj;
    }
}
