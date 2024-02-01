package p000a;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: a.fH */
/* loaded from: classes.dex */
public abstract class AbstractC1662fH {
    /* renamed from: h */
    public static CharSequence m3138h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* renamed from: v */
    public static void m3139v(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    /* renamed from: z */
    public static Object m3140z(int i, float f, float f2, float f3) {
        return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
    }
}
