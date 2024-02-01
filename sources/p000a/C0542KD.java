package p000a;

import android.view.ViewGroup;

/* renamed from: a.KD */
/* loaded from: classes.dex */
public final class C0542KD extends AbstractC2262qa {

    /* renamed from: h */
    public final /* synthetic */ ViewGroup f1793h;

    /* renamed from: z */
    public boolean f1794z = false;

    public C0542KD(ViewGroup viewGroup) {
        this.f1793h = viewGroup;
    }

    @Override // p000a.AbstractC2262qa, p000a.InterfaceC2728zV
    /* renamed from: N */
    public final void mo1083N() {
        AbstractC0795Op.m1877yF(this.f1793h, true);
    }

    @Override // p000a.InterfaceC2728zV
    /* renamed from: P */
    public final void mo231P(AbstractC0614LY abstractC0614LY) {
        if (!this.f1794z) {
            AbstractC0795Op.m1877yF(this.f1793h, false);
        }
        abstractC0614LY.mo1364J(this);
    }

    @Override // p000a.AbstractC2262qa, p000a.InterfaceC2728zV
    /* renamed from: v */
    public final void mo1085v() {
        AbstractC0795Op.m1877yF(this.f1793h, false);
    }

    @Override // p000a.AbstractC2262qa, p000a.InterfaceC2728zV
    /* renamed from: z */
    public final void mo1086z() {
        AbstractC0795Op.m1877yF(this.f1793h, false);
        this.f1794z = true;
    }
}
