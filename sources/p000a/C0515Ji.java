package p000a;

import com.topjohnwu.magisk.p001ui.surequest.SuRequestActivity;

/* renamed from: a.Ji */
/* loaded from: classes.dex */
public final class C0515Ji extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: k */
    public final /* synthetic */ String f1710k;

    /* renamed from: q */
    public final /* synthetic */ SuRequestActivity f1711q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0515Ji(SuRequestActivity suRequestActivity, String str, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f1711q = suRequestActivity;
        this.f1710k = str;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C0515Ji(this.f1711q, this.f1710k, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        AbstractC1292YB.m2664UZ(obj);
        SuRequestActivity suRequestActivity = this.f1711q;
        AbstractC1843ih.m3451n0(suRequestActivity, this.f1710k, suRequestActivity.getIntent().getExtras());
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        C0515Ji c0515Ji = (C0515Ji) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2);
        C0329GJ c0329gj = C0329GJ.f1115z;
        c0515Ji.mo50V(c0329gj);
        return c0329gj;
    }
}
