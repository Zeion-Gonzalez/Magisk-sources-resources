package p000a;

import android.view.View;

/* renamed from: a.Vf */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC1157Vf implements View.OnFocusChangeListener {

    /* renamed from: h */
    public final /* synthetic */ AbstractC0663MY f3752h;

    /* renamed from: z */
    public final /* synthetic */ int f3753z;

    public /* synthetic */ ViewOnFocusChangeListenerC1157Vf(AbstractC0663MY abstractC0663MY, int i) {
        this.f3753z = i;
        this.f3752h = abstractC0663MY;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.f3753z;
        AbstractC0663MY abstractC0663MY = this.f3752h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C1884jU c1884jU = (C1884jU) abstractC0663MY;
                c1884jU.m3505y(c1884jU.m3504s());
                return;
            default:
                C1132VC c1132vc = (C1132VC) abstractC0663MY;
                c1132vc.f3688V = z;
                c1132vc.m1477q();
                if (!z) {
                    c1132vc.m2330y(false);
                    c1132vc.f3687S = false;
                    return;
                }
                return;
        }
    }
}
