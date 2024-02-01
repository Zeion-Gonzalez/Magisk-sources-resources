package p000a;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* renamed from: a.yF */
/* loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC2664yF implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: z */
    public final InterfaceC1542d3 f8306z;

    public AccessibilityManagerTouchExplorationStateChangeListenerC2664yF(InterfaceC1542d3 interfaceC1542d3) {
        this.f8306z = interfaceC1542d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC2664yF) {
            return this.f8306z.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC2664yF) obj).f8306z);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8306z.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        boolean z2;
        C1132VC c1132vc = (C1132VC) ((C0024AR) this.f8306z).f141R;
        AutoCompleteTextView autoCompleteTextView = c1132vc.f3691o;
        if (autoCompleteTextView != null) {
            int i = 1;
            if (autoCompleteTextView.getInputType() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (z) {
                    i = 2;
                }
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                AbstractC2397t8.m4123g(c1132vc.f2149P, i);
            }
        }
    }
}
