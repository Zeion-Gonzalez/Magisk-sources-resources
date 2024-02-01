package p000a;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: a.O4 */
/* loaded from: classes.dex */
public abstract class AbstractC0752O4 {
    /* renamed from: h */
    public static void m1725h(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    /* renamed from: z */
    public static int m1726z(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }
}
