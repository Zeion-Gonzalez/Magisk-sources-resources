package p000a;

import android.content.DialogInterface;
import com.topjohnwu.magisk.R;
import com.topjohnwu.magisk.core.download.DownloadService;

/* renamed from: a.U2 */
/* loaded from: classes.dex */
public final class C1068U2 extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: R */
    public final /* synthetic */ int f3531R;

    /* renamed from: w */
    public final /* synthetic */ DialogC2727zU f3532w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1068U2(DialogC2727zU dialogC2727zU, int i) {
        super(1);
        this.f3531R = i;
        this.f3532w = dialogC2727zU;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final /* bridge */ /* synthetic */ Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        switch (this.f3531R) {
            case AbstractC0795Op.f2698E /* 0 */:
                DialogInterface dialogInterface = (DialogInterface) obj;
                m2252v();
                return c0329gj;
            case 1:
                m2251h((C0738Nr) obj);
                return c0329gj;
            case 2:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                m2252v();
                return c0329gj;
            default:
                m2251h((C0738Nr) obj);
                return c0329gj;
        }
    }

    /* renamed from: h */
    public final void m2251h(C0738Nr c0738Nr) {
        int i = this.f3531R;
        DialogC2727zU dialogC2727zU = this.f3532w;
        switch (i) {
            case 1:
                c0738Nr.m1710W(17039370);
                c0738Nr.f2516q = true;
                c0738Nr.f2515k = new C1068U2(dialogC2727zU, 0);
                return;
            default:
                c0738Nr.m1710W(Integer.valueOf((int) R.string.install));
                c0738Nr.f2515k = new C1068U2(dialogC2727zU, 2);
                return;
        }
    }

    /* renamed from: v */
    public final void m2252v() {
        int i = this.f3531R;
        DialogC2727zU dialogC2727zU = this.f3532w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                dialogC2727zU.setTitle(R.string.setup_title);
                dialogC2727zU.m4656G(R.string.setup_msg, new Object[0]);
                for (EnumC1224Wr enumC1224Wr : (EnumC1224Wr[]) EnumC1224Wr.f3990I.clone()) {
                    dialogC2727zU.m4657W(enumC1224Wr, C2463uP.f7561w);
                }
                dialogC2727zU.setCancelable(false);
                AbstractC0438II.m994F(AbstractC2575wW.m4423c((AbstractActivityC0402He) dialogC2727zU.getOwnerActivity()), null, new C1907jt(dialogC2727zU, null), 3);
                return;
            default:
                int i2 = DownloadService.f9570q;
                C1219Wm.m2513W((AbstractActivityC0402He) dialogC2727zU.getOwnerActivity(), new C2642xo());
                return;
        }
    }
}
