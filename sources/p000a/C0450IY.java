package p000a;

/* renamed from: a.IY */
/* loaded from: classes.dex */
public final class C0450IY extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: q */
    public /* synthetic */ Object f1519q;

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        C0450IY c0450iy = new C0450IY(interfaceC1171Vv);
        c0450iy.f1519q = obj;
        return c0450iy;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        AbstractC1292YB.m2664UZ(obj);
        return new C1807i2(new C1573da(this.f1519q, null));
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C0450IY) mo49G(obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
