package p000a;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.topjohnwu.magisk.R;

/* renamed from: a.Dc */
/* loaded from: classes.dex */
public final class C0187Dc extends C1555dG {

    /* renamed from: N */
    public final /* synthetic */ Object f577N;

    /* renamed from: P */
    public final /* synthetic */ int f578P;

    public /* synthetic */ C0187Dc(int i, Object obj) {
        this.f578P = i;
        this.f577N = obj;
    }

    @Override // p000a.C1555dG
    /* renamed from: P */
    public final void mo373P(View view, C1799hs c1799hs) {
        int i;
        AccessibilityNodeInfo accessibilityNodeInfo = c1799hs.f5654z;
        int i2 = this.f578P;
        View.AccessibilityDelegate accessibilityDelegate = this.f4810z;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setScrollable(false);
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                C2292rA c2292rA = (C2292rA) this.f577N;
                if (c2292rA.f7079G5.getVisibility() == 0) {
                    i = R.string.mtrl_picker_toggle_to_year_selection;
                } else {
                    i = R.string.mtrl_picker_toggle_to_day_selection;
                }
                c1799hs.m3346M(c2292rA.m4018w().getString(i));
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                return;
        }
    }
}
