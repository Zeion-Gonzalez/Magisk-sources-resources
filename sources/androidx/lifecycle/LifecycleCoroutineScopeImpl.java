package androidx.lifecycle;

import p000a.AbstractC0783OZ;
import p000a.C0326GG;
import p000a.C1710g8;
import p000a.EnumC1632eh;
import p000a.EnumC2241qF;
import p000a.InterfaceC1255XS;
import p000a.InterfaceC1265Xh;
import p000a.InterfaceC1270Xo;
import p000a.InterfaceC1546d7;
import p000a.InterfaceC1725gU;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl implements InterfaceC1270Xo, InterfaceC1725gU {

    /* renamed from: R */
    public final InterfaceC1255XS f9003R;

    /* renamed from: S */
    public final AbstractC0783OZ f9004S;

    public LifecycleCoroutineScopeImpl(AbstractC0783OZ abstractC0783OZ, InterfaceC1255XS interfaceC1255XS) {
        InterfaceC1265Xh interfaceC1265Xh;
        this.f9004S = abstractC0783OZ;
        this.f9003R = interfaceC1255XS;
        if (((C0326GG) abstractC0783OZ).f1105P == EnumC1632eh.f5089S && (interfaceC1265Xh = (InterfaceC1265Xh) interfaceC1255XS.mo107y(C1710g8.f5381k)) != null) {
            interfaceC1265Xh.mo1719z(null);
        }
    }

    @Override // p000a.InterfaceC1725gU
    /* renamed from: C */
    public final InterfaceC1255XS mo311C() {
        return this.f9003R;
    }

    @Override // p000a.InterfaceC1270Xo
    /* renamed from: Q */
    public final void mo2596Q(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
        AbstractC0783OZ abstractC0783OZ = this.f9004S;
        if (((C0326GG) abstractC0783OZ).f1105P.compareTo(EnumC1632eh.f5089S) <= 0) {
            abstractC0783OZ.mo724h(this);
            InterfaceC1265Xh interfaceC1265Xh = (InterfaceC1265Xh) this.f9003R.mo107y(C1710g8.f5381k);
            if (interfaceC1265Xh != null) {
                interfaceC1265Xh.mo1719z(null);
            }
        }
    }
}
