package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.J0 */
/* loaded from: classes.dex */
public final class C0478J0 implements InterfaceC0432IC {

    /* renamed from: h */
    public final /* synthetic */ C2672yS f1592h;

    /* renamed from: z */
    public final /* synthetic */ int f1593z;

    public /* synthetic */ C0478J0(C2672yS c2672yS, int i) {
        this.f1593z = i;
        this.f1592h = c2672yS;
    }

    @Override // p000a.InterfaceC0432IC
    /* renamed from: z */
    public final void mo258z() {
        boolean z;
        int i = this.f1593z;
        C2672yS c2672yS = this.f1592h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                int checkedRadioButtonId = c2672yS.f8340x.getCheckedRadioButtonId();
                C1650f1 c1650f1 = (C1650f1) c2672yS.f983O;
                int i2 = 1;
                if (c1650f1 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && c1650f1.f5117s != checkedRadioButtonId) {
                    c1650f1.f5117s = checkedRadioButtonId;
                    AbstractC0795Op.m1801B(c1650f1, 25);
                    switch (checkedRadioButtonId) {
                        case R.id.method_inactive_slot /* 2131296623 */:
                            c1650f1.m4499R(new C1665fK(i2));
                            return;
                        case R.id.method_patch /* 2131296624 */:
                            c1650f1.m4500S(new C1003So("*/*", new C1082UG()));
                            return;
                        default:
                            return;
                    }
                }
                return;
            case 1:
                C1212We.f3946N = c2672yS.f8325D.isChecked();
                return;
            case 2:
                C1212We.f3948Q = c2672yS.f8333m.isChecked();
                return;
            default:
                C1212We.f3965u = c2672yS.f8332l.isChecked();
                return;
        }
    }
}
