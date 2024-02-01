package p000a;

import android.content.DialogInterface;
import com.topjohnwu.magisk.p001ui.MainActivity;

/* renamed from: a.Bm */
/* loaded from: classes.dex */
public final class C0092Bm extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: R */
    public final /* synthetic */ int f348R;

    /* renamed from: w */
    public final /* synthetic */ MainActivity f349w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0092Bm(MainActivity mainActivity, int i) {
        super(1);
        this.f348R = i;
        this.f349w = mainActivity;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        int i = this.f348R;
        MainActivity mainActivity = this.f349w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                DialogInterface dialogInterface = (DialogInterface) obj;
                AbstractC2575wW.m4459z(mainActivity);
                return c0329gj;
            case 1:
                C0738Nr c0738Nr = (C0738Nr) obj;
                c0738Nr.m1710W(17039370);
                c0738Nr.f2515k = new C0092Bm(mainActivity, 0);
                return c0329gj;
            default:
                if (((Boolean) obj).booleanValue()) {
                    AbstractC0438II.m994F(AbstractC2575wW.m4423c(mainActivity), AbstractC0037Al.f178h, new C1639eo(mainActivity, null), 2);
                }
                return c0329gj;
        }
    }
}
