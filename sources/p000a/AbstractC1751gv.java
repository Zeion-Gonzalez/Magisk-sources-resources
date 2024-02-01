package p000a;

import android.view.accessibility.AccessibilityRecord;

/* renamed from: a.gv */
/* loaded from: classes.dex */
public abstract class AbstractC1751gv {
    /* renamed from: P */
    public static void m3279P(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }

    /* renamed from: h */
    public static int m3280h(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    /* renamed from: v */
    public static void m3281v(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    /* renamed from: z */
    public static int m3282z(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }
}
