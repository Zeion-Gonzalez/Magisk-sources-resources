package androidx.lifecycle;

import p000a.AbstractC2673yU;
import p000a.EnumC1632eh;
import p000a.EnumC2241qF;
import p000a.InterfaceC0217E7;
import p000a.InterfaceC1270Xo;
import p000a.InterfaceC1546d7;

/* loaded from: classes.dex */
public class LiveData$LifecycleBoundObserver extends AbstractC2673yU implements InterfaceC1270Xo {

    /* renamed from: k */
    public final /* synthetic */ AbstractC2764h f9005k;

    /* renamed from: q */
    public final InterfaceC1546d7 f9006q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(AbstractC2764h abstractC2764h, InterfaceC1546d7 interfaceC1546d7, InterfaceC0217E7 interfaceC0217E7) {
        super(abstractC2764h, interfaceC0217E7);
        this.f9005k = abstractC2764h;
        this.f9006q = interfaceC1546d7;
    }

    @Override // p000a.AbstractC2673yU
    /* renamed from: G */
    public final boolean mo4582G(InterfaceC1546d7 interfaceC1546d7) {
        return this.f9006q == interfaceC1546d7;
    }

    @Override // p000a.AbstractC2673yU
    /* renamed from: M */
    public final boolean mo3546M() {
        return this.f9006q.mo1354C().f1105P.m3117z(EnumC1632eh.f5087I);
    }

    @Override // p000a.InterfaceC1270Xo
    /* renamed from: Q */
    public final void mo2596Q(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
        InterfaceC1546d7 interfaceC1546d72 = this.f9006q;
        EnumC1632eh enumC1632eh = interfaceC1546d72.mo1354C().f1105P;
        if (enumC1632eh == EnumC1632eh.f5089S) {
            this.f9005k.m4846W(this.f8344S);
            return;
        }
        EnumC1632eh enumC1632eh2 = null;
        while (enumC1632eh2 != enumC1632eh) {
            m4584o(mo3546M());
            enumC1632eh2 = enumC1632eh;
            enumC1632eh = interfaceC1546d72.mo1354C().f1105P;
        }
    }

    @Override // p000a.AbstractC2673yU
    /* renamed from: W */
    public final void mo4583W() {
        this.f9006q.mo1354C().mo724h(this);
    }
}
