package androidx.lifecycle;

import p000a.C0842Ph;
import p000a.EnumC2241qF;
import p000a.InterfaceC1270Xo;
import p000a.InterfaceC1546d7;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC1270Xo {

    /* renamed from: S */
    public final C0842Ph f9009S;

    public SavedStateHandleAttacher(C0842Ph c0842Ph) {
        this.f9009S = c0842Ph;
    }

    @Override // p000a.InterfaceC1270Xo
    /* renamed from: Q */
    public final void mo2596Q(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
        if (enumC2241qF == EnumC2241qF.ON_CREATE) {
            interfaceC1546d7.mo1354C().mo724h(this);
            this.f9009S.m1959h();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC2241qF).toString());
        }
    }
}
