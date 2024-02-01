package p000a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: a.KM */
/* loaded from: classes.dex */
public abstract class AbstractC0551KM extends AccessibilityNodeProvider {

    /* renamed from: z */
    public final C0042As f1808z;

    public AbstractC0551KM(C0042As c0042As) {
        this.f1808z = c0042As;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C1799hs mo89z = this.f1808z.mo89z(i);
        if (mo89z == null) {
            return null;
        }
        return mo89z.f5654z;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f1808z.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f1808z.mo88v(i, i2, bundle);
    }
}
