package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.iU */
/* loaded from: classes.dex */
public final class C1832iU extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: I */
    public final /* synthetic */ InterfaceC1459bP f5728I;

    /* renamed from: R */
    public final /* synthetic */ int f5729R;

    /* renamed from: w */
    public final /* synthetic */ AbstractC2615xD f5730w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1832iU(AbstractC2615xD abstractC2615xD, InterfaceC1459bP interfaceC1459bP, int i) {
        super(1);
        this.f5729R = i;
        this.f5730w = abstractC2615xD;
        this.f5728I = interfaceC1459bP;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final /* bridge */ /* synthetic */ Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        switch (this.f5729R) {
            case AbstractC0795Op.f2698E /* 0 */:
                m3383h(((Boolean) obj).booleanValue());
                return c0329gj;
            case 1:
                m3383h(((Boolean) obj).booleanValue());
                return c0329gj;
            default:
                m3383h(((Boolean) obj).booleanValue());
                return c0329gj;
        }
    }

    /* renamed from: h */
    public final void m3383h(boolean z) {
        int i = this.f5729R;
        AbstractC2615xD abstractC2615xD = this.f5730w;
        InterfaceC1459bP interfaceC1459bP = this.f5728I;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (!z) {
                    abstractC2615xD.m4500S(new C0805P0((int) R.string.external_rw_permission_denied));
                    return;
                } else {
                    interfaceC1459bP.mo93z();
                    return;
                }
            case 1:
                if (!z) {
                    abstractC2615xD.m4500S(new C0805P0((int) R.string.install_unknown_denied));
                    return;
                } else {
                    interfaceC1459bP.mo93z();
                    return;
                }
            default:
                if (!z) {
                    abstractC2615xD.m4500S(new C0805P0((int) R.string.post_notifications_denied));
                    return;
                } else {
                    interfaceC1459bP.mo93z();
                    return;
                }
        }
    }
}
