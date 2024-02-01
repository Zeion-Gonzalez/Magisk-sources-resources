package p000a;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.time.Duration;

/* renamed from: a.W9 */
/* loaded from: classes.dex */
public abstract class AbstractC1184W9 {
    /* renamed from: G */
    public static void m2434G(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z) {
        accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z);
    }

    /* renamed from: M */
    public static void m2435M(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z);
    }

    /* renamed from: N */
    public static boolean m2436N(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    /* renamed from: P */
    public static boolean m2437P(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
    }

    /* renamed from: Q */
    public static void m2438Q(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    /* renamed from: W */
    public static void m2439W(AccessibilityNodeInfo accessibilityNodeInfo, long j) {
        accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j));
    }

    /* renamed from: h */
    public static CharSequence m2440h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    /* renamed from: o */
    public static void m2441o(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setContainerTitle(charSequence);
    }

    /* renamed from: u */
    public static void m2442u(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.setBoundsInWindow(rect);
    }

    /* renamed from: v */
    public static long m2443v(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
    }

    /* renamed from: z */
    public static void m2444z(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }
}
