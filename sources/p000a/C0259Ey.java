package p000a;

import android.view.View;

/* renamed from: a.Ey */
/* loaded from: classes.dex */
public final class C0259Ey extends AbstractC0231EP implements InterfaceC2030mD {

    /* renamed from: h */
    public final Object f921h;

    /* renamed from: z */
    public final /* synthetic */ int f922z = 2;

    public C0259Ey(InterfaceC1435aw interfaceC1435aw) {
        this.f921h = interfaceC1435aw;
    }

    @Override // p000a.InterfaceC2030mD
    /* renamed from: h */
    public final void mo557h(AbstractActivityC0819PG abstractActivityC0819PG) {
        int i = this.f922z;
        Object obj = this.f921h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                abstractActivityC0819PG.f1362x = new C2670yQ(7, this);
                abstractActivityC0819PG.f1357T.m3957O4(C0329GJ.f1115z);
                return;
            case 1:
                DialogC2727zU dialogC2727zU = new DialogC2727zU(abstractActivityC0819PG);
                ((InterfaceC1435aw) obj).mo363h(dialogC2727zU);
                dialogC2727zU.show();
                return;
            default:
                abstractActivityC0819PG.m1920E();
                abstractActivityC0819PG.m1924k().f8982k.getRootView().setAccessibilityDelegate((View.AccessibilityDelegate) obj);
                return;
        }
    }

    public C0259Ey(InterfaceC1459bP interfaceC1459bP) {
        this.f921h = interfaceC1459bP;
    }

    public C0259Ey(C0859Q1 c0859q1) {
        this.f921h = c0859q1;
    }
}
