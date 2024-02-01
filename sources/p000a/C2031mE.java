package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.mE */
/* loaded from: classes.dex */
public final class C2031mE extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: I */
    public final /* synthetic */ C0471Iu f6319I;

    /* renamed from: R */
    public final /* synthetic */ int f6320R;

    /* renamed from: w */
    public final /* synthetic */ AbstractC2615xD f6321w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2031mE(C0471Iu c0471Iu, C0471Iu c0471Iu2, int i) {
        super(1);
        this.f6320R = i;
        this.f6321w = c0471Iu;
        this.f6319I = c0471Iu2;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final /* bridge */ /* synthetic */ Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        switch (this.f6320R) {
            case AbstractC0795Op.f2698E /* 0 */:
                m3669h(((Boolean) obj).booleanValue());
                return c0329gj;
            case 1:
                m3669h(((Boolean) obj).booleanValue());
                return c0329gj;
            default:
                m3669h(((Boolean) obj).booleanValue());
                return c0329gj;
        }
    }

    /* renamed from: h */
    public final void m3669h(boolean z) {
        int i = this.f6320R;
        AbstractC2615xD abstractC2615xD = this.f6321w;
        C0471Iu c0471Iu = this.f6319I;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (!z) {
                    abstractC2615xD.m4500S(new C0805P0((int) R.string.external_rw_permission_denied));
                    return;
                } else {
                    AbstractC2615xD.m4498W(c0471Iu, new C0466Io(R.id.action_homeFragment_to_installFragment));
                    return;
                }
            case 1:
                if (!z) {
                    abstractC2615xD.m4500S(new C0805P0((int) R.string.external_rw_permission_denied));
                    return;
                } else {
                    c0471Iu.m4501w("android.permission.REQUEST_INSTALL_PACKAGES", new C2031mE(c0471Iu, c0471Iu, 2));
                    return;
                }
            default:
                if (!z) {
                    abstractC2615xD.m4500S(new C0805P0((int) R.string.install_unknown_denied));
                    return;
                } else {
                    c0471Iu.m4499R(new C1737gh());
                    return;
                }
        }
    }
}
