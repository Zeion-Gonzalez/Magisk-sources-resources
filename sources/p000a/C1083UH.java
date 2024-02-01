package p000a;

import android.text.Spanned;

/* renamed from: a.UH */
/* loaded from: classes.dex */
public final class C1083UH extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: k */
    public final /* synthetic */ Spanned f3552k;

    /* renamed from: q */
    public final /* synthetic */ C1650f1 f3553q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1083UH(C1650f1 c1650f1, Spanned spanned, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f3553q = c1650f1;
        this.f3552k = spanned;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1083UH(this.f3553q, this.f3552k, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        AbstractC1292YB.m2664UZ(obj);
        C1650f1 c1650f1 = this.f3553q;
        Spanned spanned = c1650f1.f5114U;
        Spanned spanned2 = this.f3552k;
        if (!AbstractC1292YB.m2695u(spanned, spanned2)) {
            c1650f1.f5114U = spanned2;
            c1650f1.mo1709Q(26);
        }
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        C1083UH c1083uh = (C1083UH) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2);
        C0329GJ c0329gj = C0329GJ.f1115z;
        c1083uh.mo50V(c0329gj);
        return c0329gj;
    }
}
