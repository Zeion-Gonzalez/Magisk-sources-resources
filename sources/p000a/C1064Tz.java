package p000a;

import android.content.DialogInterface;
import android.view.View;

/* renamed from: a.Tz */
/* loaded from: classes.dex */
public final class C1064Tz extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: I */
    public final /* synthetic */ View f3509I;

    /* renamed from: R */
    public final /* synthetic */ int f3510R;

    /* renamed from: q */
    public final /* synthetic */ AbstractC0928RS f3511q;

    /* renamed from: w */
    public final /* synthetic */ C0316G1 f3512w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1064Tz(AbstractC1378Zn abstractC1378Zn, C0316G1 c0316g1, View view) {
        super(1);
        this.f3510R = 2;
        this.f3511q = abstractC1378Zn;
        this.f3512w = c0316g1;
        this.f3509I = view;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        switch (this.f3510R) {
            case AbstractC0795Op.f2698E /* 0 */:
                DialogInterface dialogInterface = (DialogInterface) obj;
                this.f3512w.m692I(this.f3509I, (C1382Zs) this.f3511q);
                return c0329gj;
            case 1:
                m2226h((C0738Nr) obj);
                return c0329gj;
            default:
                m2226h((C0738Nr) obj);
                return c0329gj;
        }
    }

    /* renamed from: h */
    public final void m2226h(C0738Nr c0738Nr) {
        int i = this.f3510R;
        View view = this.f3509I;
        C0316G1 c0316g1 = this.f3512w;
        AbstractC0928RS abstractC0928RS = this.f3511q;
        switch (i) {
            case 1:
                c0738Nr.m1710W(17039370);
                c0738Nr.f2515k = new C1064Tz(c0316g1, view, (C1382Zs) abstractC0928RS, 0);
                return;
            default:
                c0738Nr.m1710W(17039370);
                c0738Nr.f2515k = new C0247Ej((AbstractC1378Zn) abstractC0928RS, c0738Nr, c0316g1, view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1064Tz(C0316G1 c0316g1, View view, C1382Zs c1382Zs, int i) {
        super(1);
        this.f3510R = i;
        this.f3512w = c0316g1;
        this.f3509I = view;
        this.f3511q = c1382Zs;
    }
}
