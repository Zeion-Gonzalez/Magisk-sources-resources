package p000a;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: a.fc */
/* loaded from: classes.dex */
public class C1681fc extends AbstractC0551KM {
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C1799hs mo87h = this.f1808z.mo87h(i);
        if (mo87h == null) {
            return null;
        }
        return mo87h.f5654z;
    }
}
