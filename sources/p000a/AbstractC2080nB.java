package p000a;

import android.view.accessibility.AccessibilityManager;

/* renamed from: a.nB */
/* loaded from: classes.dex */
public abstract class AbstractC2080nB {
    /* renamed from: h */
    public static boolean m3696h(AccessibilityManager accessibilityManager, InterfaceC1542d3 interfaceC1542d3) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC2664yF(interfaceC1542d3));
    }

    /* renamed from: z */
    public static boolean m3697z(AccessibilityManager accessibilityManager, InterfaceC1542d3 interfaceC1542d3) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC2664yF(interfaceC1542d3));
    }
}
