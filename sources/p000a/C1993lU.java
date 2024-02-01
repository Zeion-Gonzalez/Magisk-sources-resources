package p000a;

import android.content.DialogInterface;

/* renamed from: a.lU */
/* loaded from: classes.dex */
public final class C1993lU extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: I */
    public final /* synthetic */ DialogC2727zU f6173I;

    /* renamed from: R */
    public final /* synthetic */ int f6174R;

    /* renamed from: w */
    public final /* synthetic */ C1955kn f6175w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1993lU(C1955kn c1955kn, DialogC2727zU dialogC2727zU, int i) {
        super(1);
        this.f6174R = i;
        this.f6175w = c1955kn;
        this.f6173I = dialogC2727zU;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        int i = this.f6174R;
        DialogC2727zU dialogC2727zU = this.f6173I;
        C1955kn c1955kn = this.f6175w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                DialogInterface dialogInterface = (DialogInterface) obj;
                c1955kn.f6055S.m1142y();
                dialogC2727zU.dismiss();
                return c0329gj;
            default:
                C0738Nr c0738Nr = (C0738Nr) obj;
                c0738Nr.m1710W(17039370);
                c0738Nr.f2515k = new C1993lU(c1955kn, dialogC2727zU, 0);
                return c0329gj;
        }
    }
}
