package p000a;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;

/* renamed from: a.NE */
/* loaded from: classes.dex */
public final class C0701NE extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: k */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f2358k;

    /* renamed from: q */
    public /* synthetic */ Object f2359q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0701NE(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f2358k = lifecycleCoroutineScopeImpl;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        C0701NE c0701ne = new C0701NE(this.f2358k, interfaceC1171Vv);
        c0701ne.f2359q = obj;
        return c0701ne;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        AbstractC1292YB.m2664UZ(obj);
        InterfaceC1725gU interfaceC1725gU = (InterfaceC1725gU) this.f2359q;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f2358k;
        if (((C0326GG) lifecycleCoroutineScopeImpl.f9004S).f1105P.compareTo(EnumC1632eh.f5088R) >= 0) {
            lifecycleCoroutineScopeImpl.f9004S.mo728z(lifecycleCoroutineScopeImpl);
        } else {
            InterfaceC1265Xh interfaceC1265Xh = (InterfaceC1265Xh) interfaceC1725gU.mo311C().mo107y(C1710g8.f5381k);
            if (interfaceC1265Xh != null) {
                interfaceC1265Xh.mo1719z(null);
            }
        }
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        C0701NE c0701ne = (C0701NE) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2);
        C0329GJ c0329gj = C0329GJ.f1115z;
        c0701ne.mo50V(c0329gj);
        return c0329gj;
    }
}
