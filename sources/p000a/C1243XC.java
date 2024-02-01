package p000a;

import android.app.Activity;
import android.view.View;

/* renamed from: a.XC */
/* loaded from: classes.dex */
public final class C1243XC extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ AbstractC2207pZ f4034g;

    /* renamed from: k */
    public final /* synthetic */ View f4035k;

    /* renamed from: q */
    public int f4036q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243XC(View view, AbstractC2207pZ abstractC2207pZ, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f4035k = view;
        this.f4034g = abstractC2207pZ;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1243XC(this.f4035k, this.f4034g, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f4036q;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            C1710g8 c1710g8 = C1710g8.f5382q;
            Activity m1806E = AbstractC0795Op.m1806E(this.f4035k);
            ((C2360sP) this.f4034g).getClass();
            String str = C2360sP.f7256g;
            this.f4036q = 1;
            if (c1710g8.m3243k(m1806E, str, this) == enumC0464Im) {
                return enumC0464Im;
            }
        }
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1243XC) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
