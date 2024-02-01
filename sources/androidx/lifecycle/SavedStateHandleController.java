package androidx.lifecycle;

import p000a.AbstractC0783OZ;
import p000a.C0827PQ;
import p000a.C1934kN;
import p000a.EnumC2241qF;
import p000a.InterfaceC1270Xo;
import p000a.InterfaceC1546d7;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC1270Xo {

    /* renamed from: R */
    public final C0827PQ f9010R;

    /* renamed from: S */
    public final String f9011S;

    /* renamed from: w */
    public boolean f9012w;

    public SavedStateHandleController(String str, C0827PQ c0827pq) {
        this.f9011S = str;
        this.f9010R = c0827pq;
    }

    @Override // p000a.InterfaceC1270Xo
    /* renamed from: Q */
    public final void mo2596Q(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
        if (enumC2241qF == EnumC2241qF.ON_DESTROY) {
            this.f9012w = false;
            interfaceC1546d7.mo1354C().mo724h(this);
        }
    }

    /* renamed from: o */
    public final void m4841o(AbstractC0783OZ abstractC0783OZ, C1934kN c1934kN) {
        if ((!this.f9012w) != false) {
            this.f9012w = true;
            abstractC0783OZ.mo728z(this);
            c1934kN.m3554v(this.f9011S, this.f9010R.f2806N);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }
}
