package p000a;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: a.S3 */
/* loaded from: classes.dex */
public final class C0963S3 {

    /* renamed from: z */
    public final Object f3274z;

    public C0963S3(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f3274z = collectionItemInfo;
    }

    /* renamed from: z */
    public static C0963S3 m2147z(int i, int i2, int i3, int i4, boolean z) {
        return new C0963S3(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }
}
