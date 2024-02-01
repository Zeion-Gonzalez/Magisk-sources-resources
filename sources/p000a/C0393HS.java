package p000a;

import android.app.Activity;
import android.view.View;

/* renamed from: a.HS */
/* loaded from: classes.dex */
public final class C0393HS extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: k */
    public final /* synthetic */ View f1321k;

    /* renamed from: q */
    public int f1322q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0393HS(View view, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f1321k = view;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C0393HS(this.f1321k, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f1322q;
        if (i == 0) {
            AbstractC1292YB.m2664UZ(obj);
            C1710g8 c1710g8 = C1710g8.f5382q;
            Activity m1806E = AbstractC0795Op.m1806E(this.f1321k);
            this.f1322q = 1;
            if (c1710g8.m3240J(m1806E, this) == enumC0464Im) {
                return enumC0464Im;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1292YB.m2664UZ(obj);
        }
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C0393HS) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
