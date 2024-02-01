package p000a;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: a.LN */
/* loaded from: classes.dex */
public abstract class AbstractC0607LN {
    /* renamed from: G */
    public static void m1332G(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }

    /* renamed from: N */
    public static AccessibilityNodeInfo.ExtraRenderingInfo m1333N(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    /* renamed from: P */
    public static String m1334P(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    /* renamed from: Q */
    public static C1799hs m1335Q(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i);
        if (parent != null) {
            return new C1799hs(parent, 0);
        }
        return null;
    }

    /* renamed from: W */
    public static void m1336W(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setTextSelectable(z);
    }

    /* renamed from: h */
    public static C1799hs m1337h(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i, i2);
        if (child != null) {
            return new C1799hs(child, 0);
        }
        return null;
    }

    /* renamed from: o */
    public static boolean m1338o(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* renamed from: u */
    public static String m1339u(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* renamed from: v */
    public static String m1340v(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    /* renamed from: z */
    public static C0963S3 m1341z(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
        return new C0963S3(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
    }
}
