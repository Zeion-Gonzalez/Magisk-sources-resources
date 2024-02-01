package p000a;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.C2762z;
import java.util.Iterator;

/* renamed from: a.zF */
/* loaded from: classes.dex */
public final class C2715zF extends AbstractC0204Du {

    /* renamed from: o */
    public final C2762z f8545o;

    public C2715zF(int i, int i2, C2762z c2762z, C1251XO c1251xo) {
        super(i, i2, c2762z.f8996v, c1251xo);
        this.f8545o = c2762z;
    }

    @Override // p000a.AbstractC0204Du
    /* renamed from: P */
    public final void mo390P() {
        boolean z;
        float f;
        int i = this.f618h;
        C2762z c2762z = this.f8545o;
        if (i == 2) {
            AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = c2762z.f8996v;
            View findFocus = abstractComponentCallbacksC2342s3.f7222t.findFocus();
            if (findFocus != null) {
                abstractComponentCallbacksC2342s3.m4014o().f4954S = findFocus;
                if (C0364Gx.m791p(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC2342s3);
                }
            }
            View m4013n = this.f620v.m4013n();
            if (m4013n.getParent() == null) {
                c2762z.m4833h();
                m4013n.setAlpha(0.0f);
            }
            if (m4013n.getAlpha() == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z && m4013n.getVisibility() == 0) {
                m4013n.setVisibility(4);
            }
            C1614eM c1614eM = abstractComponentCallbacksC2342s3.f7184D;
            if (c1614eM == null) {
                f = 1.0f;
            } else {
                f = c1614eM.f4955V;
            }
            m4013n.setAlpha(f);
            return;
        }
        if (i == 3) {
            AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s32 = c2762z.f8996v;
            View m4013n2 = abstractComponentCallbacksC2342s32.m4013n();
            if (C0364Gx.m791p(2)) {
                Log.v("FragmentManager", "Clearing focus " + m4013n2.findFocus() + " on view " + m4013n2 + " for Fragment " + abstractComponentCallbacksC2342s32);
            }
            m4013n2.clearFocus();
        }
    }

    @Override // p000a.AbstractC0204Du
    /* renamed from: h */
    public final void mo391h() {
        if (!this.f619u) {
            if (C0364Gx.m791p(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f619u = true;
            Iterator it = this.f616P.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f8545o.m4825M();
    }
}
