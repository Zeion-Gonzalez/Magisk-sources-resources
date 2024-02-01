package p000a;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: a.Y3 */
/* loaded from: classes.dex */
public abstract class AbstractC1285Y3 {
    /* renamed from: N */
    public static void m2630N(ViewParent viewParent, View view, View view2, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }

    /* renamed from: P */
    public static boolean m2631P(View view) {
        return view.isLayoutDirectionResolved();
    }

    /* renamed from: Q */
    public static void m2632Q(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    /* renamed from: h */
    public static boolean m2633h(View view) {
        return view.isAttachedToWindow();
    }

    /* renamed from: u */
    public static void m2634u(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    /* renamed from: v */
    public static boolean m2635v(View view) {
        return view.isLaidOut();
    }

    /* renamed from: z */
    public static int m2636z(View view) {
        return view.getAccessibilityLiveRegion();
    }
}
