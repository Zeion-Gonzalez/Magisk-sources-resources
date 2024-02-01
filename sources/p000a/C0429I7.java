package p000a;

import android.content.DialogInterface;

/* renamed from: a.I7 */
/* loaded from: classes.dex */
public final class C0429I7 extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: R */
    public final /* synthetic */ int f1409R;

    /* renamed from: w */
    public final /* synthetic */ C0195Dk f1410w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0429I7(C0195Dk c0195Dk, int i) {
        super(1);
        this.f1409R = i;
        this.f1410w = c0195Dk;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        int i = this.f1409R;
        C0195Dk c0195Dk = this.f1410w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                DialogInterface dialogInterface = (DialogInterface) obj;
                AbstractC2615xD.m4498W(c0195Dk.f596S, new C0499JR(c0195Dk.f595R, "flash"));
                return c0329gj;
            default:
                C0738Nr c0738Nr = (C0738Nr) obj;
                c0738Nr.m1710W(17039370);
                c0738Nr.f2515k = new C0429I7(c0195Dk, 0);
                return c0329gj;
        }
    }
}
