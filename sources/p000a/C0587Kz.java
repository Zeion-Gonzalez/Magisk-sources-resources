package p000a;

import androidx.databinding.AbstractC2760z;

/* renamed from: a.Kz */
/* loaded from: classes.dex */
public final class C0587Kz extends AbstractC1500cH {

    /* renamed from: h */
    public final /* synthetic */ int f1903h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0587Kz(int i) {
        super(3);
        this.f1903h = i;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: y */
    public final void mo1315y(int i, Object obj, Object obj2, Object obj3) {
        switch (this.f1903h) {
            case AbstractC0795Op.f2698E /* 0 */:
                AbstractC1193WJ abstractC1193WJ = (AbstractC1193WJ) obj;
                InterfaceC0133Ca interfaceC0133Ca = (InterfaceC0133Ca) obj2;
                C2454uF c2454uF = (C2454uF) obj3;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                abstractC1193WJ.mo2472z(interfaceC0133Ca);
                                return;
                            } else {
                                abstractC1193WJ.mo2470Q(interfaceC0133Ca, c2454uF.f7533z, c2454uF.f7531h);
                                return;
                            }
                        }
                        abstractC1193WJ.mo2468N(interfaceC0133Ca, c2454uF.f7533z, c2454uF.f7532v, c2454uF.f7531h);
                        return;
                    }
                    abstractC1193WJ.mo2469P(interfaceC0133Ca, c2454uF.f7533z, c2454uF.f7531h);
                    return;
                }
                abstractC1193WJ.mo2471h(interfaceC0133Ca, c2454uF.f7533z, c2454uF.f7531h);
                return;
            case 1:
                Void r8 = (Void) obj3;
                ((AbstractC1965ky) obj).mo2925z(i, (InterfaceC0281FL) obj2);
                return;
            default:
                C1197WN c1197wn = (C1197WN) obj;
                AbstractC2760z abstractC2760z = (AbstractC2760z) obj2;
                Void r82 = (Void) obj3;
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        c1197wn.getClass();
                        return;
                    }
                    return;
                }
                c1197wn.f3900z.mo3515Yd(abstractC2760z);
                return;
        }
    }
}
