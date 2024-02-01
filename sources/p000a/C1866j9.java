package p000a;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.navigation.fragment.NavHostFragment;
import com.topjohnwu.magisk.R;
import com.topjohnwu.magisk.p001ui.flash.FlashFragment;

/* renamed from: a.j9 */
/* loaded from: classes.dex */
public final class C1866j9 extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: I */
    public final /* synthetic */ DialogC2727zU f5833I;

    /* renamed from: R */
    public final /* synthetic */ int f5834R;

    /* renamed from: w */
    public final /* synthetic */ C1665fK f5835w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1866j9(C1665fK c1665fK, DialogC2727zU dialogC2727zU, int i) {
        super(1);
        this.f5834R = i;
        this.f5835w = c1665fK;
        this.f5833I = dialogC2727zU;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final /* bridge */ /* synthetic */ Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        switch (this.f5834R) {
            case AbstractC0795Op.f2698E /* 0 */:
                DialogInterface dialogInterface = (DialogInterface) obj;
                m3488v();
                return c0329gj;
            case 1:
                m3487h((C0738Nr) obj);
                return c0329gj;
            case 2:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                m3488v();
                return c0329gj;
            default:
                m3487h((C0738Nr) obj);
                return c0329gj;
        }
    }

    /* renamed from: h */
    public final void m3487h(C0738Nr c0738Nr) {
        int i = this.f5834R;
        C1665fK c1665fK = this.f5835w;
        DialogC2727zU dialogC2727zU = this.f5833I;
        switch (i) {
            case 1:
                c0738Nr.m1710W(Integer.valueOf((int) R.string.restore_img));
                c0738Nr.f2515k = new C1866j9(c1665fK, dialogC2727zU, 0);
                return;
            default:
                c0738Nr.m1710W(Integer.valueOf((int) R.string.complete_uninstall));
                c0738Nr.f2515k = new C1866j9(c1665fK, dialogC2727zU, 2);
                return;
        }
    }

    /* renamed from: v */
    public final void m3488v() {
        int i = this.f5834R;
        C1665fK c1665fK = this.f5835w;
        DialogC2727zU dialogC2727zU = this.f5833I;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                Context context = dialogC2727zU.getContext();
                c1665fK.getClass();
                ProgressDialog progressDialog = new ProgressDialog(context);
                progressDialog.setMessage(context.getString(R.string.restore_img_msg));
                progressDialog.show();
                AbstractC0017AI.m44z("restore_imgs").m4631d2(new C0351Gh(progressDialog, context));
                return;
            default:
                c1665fK.getClass();
                C0366Gz c0366Gz = (C0366Gz) ((NavHostFragment) ((AbstractActivityC1957kp) dialogC2727zU.getOwnerActivity()).f6062l.getValue()).f9030n0.getValue();
                int i2 = FlashFragment.f9600he;
                c0366Gz.m4330G(new C0499JR(null, "uninstall"));
                return;
        }
    }
}
