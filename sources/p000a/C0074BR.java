package p000a;

import java.util.Map;

/* renamed from: a.BR */
/* loaded from: classes.dex */
public final class C0074BR extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: q */
    public /* synthetic */ Object f311q;

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        C0074BR c0074br = new C0074BR(interfaceC1171Vv);
        c0074br.f311q = obj;
        return c0074br;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        AbstractC1292YB.m2664UZ(obj);
        String str = (String) ((Map) this.f311q).get("value");
        if (str != null) {
            return new Integer(Integer.parseInt(str));
        }
        return null;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C0074BR) mo49G((Map) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
