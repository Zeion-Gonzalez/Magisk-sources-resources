package p000a;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.topjohnwu.magisk.p001ui.deny.DenyListFragment;

/* renamed from: a.B5 */
/* loaded from: classes.dex */
public final class C0056B5 extends AbstractC1467ba {

    /* renamed from: h */
    public final /* synthetic */ Object f239h;

    /* renamed from: z */
    public final /* synthetic */ int f240z;

    public /* synthetic */ C0056B5(int i, Object obj) {
        this.f240z = i;
        this.f239h = obj;
    }

    @Override // p000a.AbstractC1467ba
    /* renamed from: h */
    public final void mo102h(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        switch (this.f240z) {
            case AbstractC0795Op.f2698E /* 0 */:
                C0602LH c0602lh = (C0602LH) this.f239h;
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int computeVerticalScrollRange = c0602lh.f1948g.computeVerticalScrollRange();
                int i3 = c0602lh.f1950k;
                int i4 = computeVerticalScrollRange - i3;
                int i5 = c0602lh.f1959z;
                if (i4 > 0 && i3 >= i5) {
                    z = true;
                } else {
                    z = false;
                }
                c0602lh.f1958y = z;
                int computeHorizontalScrollRange = c0602lh.f1948g.computeHorizontalScrollRange();
                int i6 = c0602lh.f1952q;
                if (computeHorizontalScrollRange - i6 > 0 && i6 >= i5) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c0602lh.f1954s = z2;
                boolean z3 = c0602lh.f1958y;
                if (!z3 && !z2) {
                    if (c0602lh.f1942U != 0) {
                        c0602lh.m1329u(0);
                        return;
                    }
                    return;
                }
                if (z3) {
                    float f = i3;
                    c0602lh.f1943V = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
                    c0602lh.f1936M = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                }
                if (c0602lh.f1954s) {
                    float f2 = computeHorizontalScrollOffset;
                    float f3 = i6;
                    c0602lh.f1957w = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
                    c0602lh.f1940R = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
                }
                int i7 = c0602lh.f1942U;
                if (i7 == 0 || i7 == 1) {
                    c0602lh.m1329u(1);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // p000a.AbstractC1467ba
    /* renamed from: z */
    public final void mo103z(RecyclerView recyclerView, int i) {
        AbstractActivityC1957kp m3511B;
        View currentFocus;
        switch (this.f240z) {
            case 1:
                if (i != 0 && (m3511B = ((DenyListFragment) this.f239h).m3511B()) != null && (currentFocus = m3511B.getCurrentFocus()) != null) {
                    Object obj = AbstractC0865QC.f2950z;
                    InputMethodManager inputMethodManager = (InputMethodManager) AbstractC1375Zj.m2770h(m3511B, InputMethodManager.class);
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                    }
                    currentFocus.clearFocus();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
