package p000a;

import android.content.DialogInterface;
import com.topjohnwu.magisk.R;

/* renamed from: a.i8 */
/* loaded from: classes.dex */
public final class C1812i8 extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: I */
    public final /* synthetic */ DialogC2727zU f5676I;

    /* renamed from: R */
    public final /* synthetic */ int f5677R;

    /* renamed from: w */
    public final /* synthetic */ AbstractActivityC2427tj f5678w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1812i8(AbstractActivityC2427tj abstractActivityC2427tj, DialogC2727zU dialogC2727zU, int i) {
        super(1);
        this.f5677R = i;
        this.f5678w = abstractActivityC2427tj;
        this.f5676I = dialogC2727zU;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        int i = this.f5677R;
        int i2 = 0;
        DialogC2727zU dialogC2727zU = this.f5676I;
        AbstractActivityC2427tj abstractActivityC2427tj = this.f5678w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (!((Boolean) obj).booleanValue()) {
                    AbstractC0795Op.m1871tJ(abstractActivityC2427tj, R.string.install_unknown_denied, 0);
                    boolean z = AbstractActivityC2427tj.f7429nP;
                    abstractActivityC2427tj.runOnUiThread(new RunnableC2586wj(abstractActivityC2427tj, i2));
                } else {
                    AbstractC0438II.m994F(AbstractC2575wW.m4423c(dialogC2727zU), null, new C2046mZ(abstractActivityC2427tj, null), 3);
                }
                return c0329gj;
            case 1:
                DialogInterface dialogInterface = (DialogInterface) obj;
                abstractActivityC2427tj.m899q("android.permission.REQUEST_INSTALL_PACKAGES", new C1812i8(abstractActivityC2427tj, dialogC2727zU, i2));
                return c0329gj;
            default:
                C0738Nr c0738Nr = (C0738Nr) obj;
                c0738Nr.m1710W(Integer.valueOf((int) R.string.install));
                c0738Nr.f2515k = new C1812i8(abstractActivityC2427tj, dialogC2727zU, 1);
                return c0329gj;
        }
    }
}
