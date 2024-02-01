package p000a;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: a.d2 */
/* loaded from: classes.dex */
public abstract class AbstractC1541d2 {
    /* renamed from: h */
    public static boolean m2988h(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }

    /* renamed from: z */
    public static AccessibilityNodeProvider m2989z(View.AccessibilityDelegate accessibilityDelegate, View view) {
        return accessibilityDelegate.getAccessibilityNodeProvider(view);
    }
}
