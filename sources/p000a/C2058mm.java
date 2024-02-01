package p000a;

import android.content.DialogInterface;
import com.topjohnwu.magisk.R;

/* renamed from: a.mm */
/* loaded from: classes.dex */
public final class C2058mm extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: I */
    public final /* synthetic */ DialogC2727zU f6397I;

    /* renamed from: R */
    public final /* synthetic */ int f6398R;

    /* renamed from: w */
    public final /* synthetic */ C0183DY f6399w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2058mm(C0183DY c0183dy, DialogC2727zU dialogC2727zU, int i) {
        super(1);
        this.f6398R = i;
        this.f6399w = c0183dy;
        this.f6397I = dialogC2727zU;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        DialogC2727zU dialogC2727zU = this.f6397I;
        C0183DY c0183dy = this.f6399w;
        int i = this.f6398R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                DialogInterface dialogInterface = (DialogInterface) obj;
                switch (i) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        C0183DY.m361G5(c0183dy, dialogC2727zU, false);
                        break;
                    default:
                        C0183DY.m361G5(c0183dy, dialogC2727zU, true);
                        break;
                }
                return c0329gj;
            case 1:
                m3688h((C0738Nr) obj);
                return c0329gj;
            case 2:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                switch (i) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        C0183DY.m361G5(c0183dy, dialogC2727zU, false);
                        break;
                    default:
                        C0183DY.m361G5(c0183dy, dialogC2727zU, true);
                        break;
                }
                return c0329gj;
            default:
                m3688h((C0738Nr) obj);
                return c0329gj;
        }
    }

    /* renamed from: h */
    public final void m3688h(C0738Nr c0738Nr) {
        int i = this.f6398R;
        C0183DY c0183dy = this.f6399w;
        DialogC2727zU dialogC2727zU = this.f6397I;
        switch (i) {
            case 1:
                c0738Nr.m1710W(Integer.valueOf((int) R.string.download));
                c0738Nr.f2515k = new C2058mm(c0183dy, dialogC2727zU, 0);
                return;
            default:
                c0738Nr.m1710W(Integer.valueOf((int) R.string.install));
                c0738Nr.f2515k = new C2058mm(c0183dy, dialogC2727zU, 2);
                return;
        }
    }
}
