package p000a;

import java.util.Map;

/* renamed from: a.Tr */
/* loaded from: classes.dex */
public final class C1058Tr extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: q */
    public /* synthetic */ Object f3481q;

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        C1058Tr c1058Tr = new C1058Tr(interfaceC1171Vv);
        c1058Tr.f3481q = obj;
        return c1058Tr;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        AbstractC1292YB.m2664UZ(obj);
        return ((Map) this.f3481q).get("value");
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1058Tr) mo49G((Map) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
