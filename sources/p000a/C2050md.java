package p000a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: a.md */
/* loaded from: classes.dex */
public final class C2050md extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ C0934Ra f6377g;

    /* renamed from: k */
    public final /* synthetic */ List f6378k;

    /* renamed from: q */
    public final /* synthetic */ C1517cb f6379q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2050md(C1517cb c1517cb, List list, C0934Ra c0934Ra, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f6379q = c1517cb;
        this.f6378k = list;
        this.f6377g = c0934Ra;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C2050md(this.f6379q, this.f6378k, this.f6377g, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        AbstractC1292YB.m2664UZ(obj);
        C1517cb c1517cb = this.f6379q;
        c1517cb.getClass();
        c1517cb.f4694S = new ArrayList(this.f6378k);
        this.f6377g.m2106z(c1517cb);
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        C2050md c2050md = (C2050md) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2);
        C0329GJ c0329gj = C0329GJ.f1115z;
        c2050md.mo50V(c0329gj);
        return c0329gj;
    }
}
