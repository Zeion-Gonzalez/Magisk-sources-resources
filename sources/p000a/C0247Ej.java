package p000a;

import android.content.DialogInterface;
import android.view.View;

/* renamed from: a.Ej */
/* loaded from: classes.dex */
public final class C0247Ej extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: I */
    public final /* synthetic */ C0316G1 f841I;

    /* renamed from: R */
    public final /* synthetic */ AbstractC1378Zn f842R;

    /* renamed from: q */
    public final /* synthetic */ View f843q;

    /* renamed from: w */
    public final /* synthetic */ C0738Nr f844w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0247Ej(AbstractC1378Zn abstractC1378Zn, C0738Nr c0738Nr, C0316G1 c0316g1, View view) {
        super(1);
        this.f842R = abstractC1378Zn;
        this.f844w = c0738Nr;
        this.f841I = c0316g1;
        this.f843q = view;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final Object mo85W(Object obj) {
        DialogInterface dialogInterface = (DialogInterface) obj;
        AbstractC1378Zn abstractC1378Zn = this.f842R;
        String mo2775U = abstractC1378Zn.mo2775U();
        C0738Nr c0738Nr = this.f844w;
        if (mo2775U != null) {
            c0738Nr.f2516q = false;
            abstractC1378Zn.mo235s(mo2775U);
            this.f841I.m692I(this.f843q, abstractC1378Zn);
        } else {
            c0738Nr.f2516q = true;
        }
        return C0329GJ.f1115z;
    }
}
