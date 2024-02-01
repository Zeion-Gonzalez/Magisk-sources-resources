package p000a;

import java.util.List;

/* renamed from: a.GY */
/* loaded from: classes.dex */
public final class C0342GY extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ C0934Ra f1153g;

    /* renamed from: k */
    public final /* synthetic */ List f1154k;

    /* renamed from: q */
    public final /* synthetic */ C2412tR f1155q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0342GY(C2412tR c2412tR, List list, C0934Ra c0934Ra, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f1155q = c2412tR;
        this.f1154k = list;
        this.f1153g = c0934Ra;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C0342GY(this.f1155q, this.f1154k, this.f1153g, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        AbstractC1292YB.m2664UZ(obj);
        C2412tR c2412tR = this.f1155q;
        c2412tR.f7386I = this.f1154k;
        this.f1153g.m2106z(c2412tR);
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        C0342GY c0342gy = (C0342GY) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2);
        C0329GJ c0329gj = C0329GJ.f1115z;
        c0342gy.mo50V(c0329gj);
        return c0329gj;
    }
}
