package p000a;

import android.view.View;
import com.topjohnwu.magisk.R;

/* renamed from: a.pZ */
/* loaded from: classes.dex */
public abstract class AbstractC2207pZ extends AbstractC2467uU {

    /* renamed from: R */
    public boolean f6780R = true;

    @Override // p000a.AbstractC0769OL
    /* renamed from: G */
    public int mo553G() {
        return R.layout.item_settings;
    }

    /* renamed from: I */
    public void mo1575I(View view, C0316G1 c0316g1) {
        c0316g1.m693q(this, C0731Nj.f2464H);
    }

    /* renamed from: M */
    public AbstractC2222pt mo234M() {
        return AbstractC2222pt.f6834z;
    }

    /* renamed from: R */
    public abstract AbstractC2222pt mo30R();

    /* renamed from: S */
    public boolean mo2774S() {
        return false;
    }

    /* renamed from: V */
    public int mo1165V() {
        return 0;
    }

    /* renamed from: g */
    public final void m3848g(boolean z) {
        int[] iArr = {9, 8};
        if (this.f6780R != z) {
            this.f6780R = z;
            for (int i = 0; i < 2; i++) {
                AbstractC0795Op.m1801B(this, iArr[i]);
            }
        }
    }

    /* renamed from: k */
    public void mo2844k() {
    }

    /* renamed from: q */
    public void mo2776q(View view, C0316G1 c0316g1, boolean z) {
    }

    /* renamed from: w */
    public boolean mo2777w() {
        return false;
    }
}
