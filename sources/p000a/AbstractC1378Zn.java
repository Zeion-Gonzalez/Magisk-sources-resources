package p000a;

import android.content.Context;
import android.view.View;

/* renamed from: a.Zn */
/* loaded from: classes.dex */
public abstract class AbstractC1378Zn extends AbstractC0928RS {

    /* renamed from: w */
    public final /* synthetic */ int f4309w;

    /* renamed from: E */
    public abstract View mo2773E(Context context);

    @Override // p000a.AbstractC2207pZ
    /* renamed from: I */
    public final void mo1575I(View view, C0316G1 c0316g1) {
        switch (this.f4309w) {
            case AbstractC0795Op.f2698E /* 0 */:
                c0316g1.m693q(this, new C2480ul(view, this, c0316g1, 2));
                return;
            default:
                AbstractC0795Op.m1801B(this, 4);
                c0316g1.m693q(this, new C2480ul(this, c0316g1, view));
                return;
        }
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: S */
    public final boolean mo2774S() {
        switch (this.f4309w) {
            case 1:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: U */
    public abstract String mo2775U();

    @Override // p000a.AbstractC2207pZ
    /* renamed from: q */
    public final void mo2776q(View view, C0316G1 c0316g1, boolean z) {
        switch (this.f4309w) {
            case 1:
                Boolean valueOf = Boolean.valueOf(z);
                if (!AbstractC1292YB.m2695u(mo236y(), valueOf)) {
                    valueOf.booleanValue();
                    mo1575I(view, c0316g1);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // p000a.AbstractC2207pZ
    /* renamed from: w */
    public final boolean mo2777w() {
        switch (this.f4309w) {
            case 1:
                return ((Boolean) mo236y()).booleanValue();
            default:
                return false;
        }
    }
}
