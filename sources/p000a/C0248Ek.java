package p000a;

import android.content.DialogInterface;

/* renamed from: a.Ek */
/* loaded from: classes.dex */
public final class C0248Ek extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: R */
    public final /* synthetic */ int f845R;

    /* renamed from: w */
    public final /* synthetic */ C2316rb f846w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0248Ek(C2316rb c2316rb, int i) {
        super(1);
        this.f845R = i;
        this.f846w = c2316rb;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        int i = this.f845R;
        C2316rb c2316rb = this.f846w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                DialogInterface dialogInterface = (DialogInterface) obj;
                c2316rb.f7138R.mo93z();
                return c0329gj;
            default:
                C0738Nr c0738Nr = (C0738Nr) obj;
                c0738Nr.m1710W(17039370);
                c0738Nr.f2515k = new C0248Ek(c2316rb, 0);
                return c0329gj;
        }
    }
}
