package p000a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: a.zd */
/* loaded from: classes.dex */
public abstract class AbstractC2734zd {
    /* renamed from: h */
    public static Object m4661h(int i, float f, float f2, float f3) {
        return AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3);
    }

    /* renamed from: v */
    public static Bundle m4662v(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtras();
    }

    /* renamed from: z */
    public static C0963S3 m4663z(int i, int i2, int i3, int i4, boolean z) {
        return new C0963S3(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
    }
}
