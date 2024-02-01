package p000a;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* renamed from: a.JO */
/* loaded from: classes.dex */
public final class C0497JO extends C1555dG {
    @Override // p000a.C1555dG
    /* renamed from: P */
    public final void mo373P(View view, C1799hs c1799hs) {
        int m4797S;
        View.AccessibilityDelegate accessibilityDelegate = this.f4810z;
        AccessibilityNodeInfo accessibilityNodeInfo = c1799hs.f5654z;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        c1799hs.m3349W(ScrollView.class.getName());
        if (nestedScrollView.isEnabled() && (m4797S = nestedScrollView.m4797S()) > 0) {
            accessibilityNodeInfo.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                c1799hs.m3350h(C1862j5.f5827u);
                c1799hs.m3350h(C1862j5.f5821M);
            }
            if (nestedScrollView.getScrollY() < m4797S) {
                c1799hs.m3350h(C1862j5.f5823Q);
                c1799hs.m3350h(C1862j5.f5824V);
            }
        }
    }

    @Override // p000a.C1555dG
    /* renamed from: u */
    public final boolean mo1133u(View view, int i, Bundle bundle) {
        if (super.mo1133u(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i != 4096) {
            if (i != 8192 && i != 16908344) {
                if (i != 16908346) {
                    return false;
                }
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m4793E(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                return true;
            }
        }
        int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.m4797S());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.m4793E(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
        return true;
    }

    @Override // p000a.C1555dG
    /* renamed from: v */
    public final void mo1134v(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.mo1134v(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        if (nestedScrollView.m4797S() > 0) {
            z = true;
        } else {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        AbstractC1751gv.m3281v(accessibilityEvent, nestedScrollView.getScrollX());
        AbstractC1751gv.m3279P(accessibilityEvent, nestedScrollView.m4797S());
    }
}
