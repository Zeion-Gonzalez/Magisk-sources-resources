package p000a;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;

/* renamed from: a.DN */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0173DN implements View.OnAttachStateChangeListener {

    /* renamed from: R */
    public final /* synthetic */ Object f537R;

    /* renamed from: S */
    public final /* synthetic */ int f538S;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0173DN(int i, Object obj) {
        this.f538S = i;
        this.f537R = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f538S) {
            case AbstractC0795Op.f2698E /* 0 */:
            case 1:
                return;
            default:
                C1997lY c1997lY = (C1997lY) this.f537R;
                int i = C1997lY.f6185j;
                if (c1997lY.f6186C != null && (accessibilityManager = c1997lY.f6188F) != null) {
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    if (AbstractC1285Y3.m2633h(c1997lY)) {
                        AbstractC2080nB.m3697z(accessibilityManager, c1997lY.f6186C);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        int i = this.f538S;
        Object obj = this.f537R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ViewOnKeyListenerC0205Dw viewOnKeyListenerC0205Dw = (ViewOnKeyListenerC0205Dw) obj;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0205Dw.f628L;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0205Dw.f628L = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0205Dw.f628L.removeGlobalOnLayoutListener(viewOnKeyListenerC0205Dw.f630U);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                ViewOnKeyListenerC2229q1 viewOnKeyListenerC2229q1 = (ViewOnKeyListenerC2229q1) obj;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC2229q1.f6861c;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC2229q1.f6861c = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC2229q1.f6861c.removeGlobalOnLayoutListener(viewOnKeyListenerC2229q1.f6857U);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                C1997lY c1997lY = (C1997lY) obj;
                int i2 = C1997lY.f6185j;
                InterfaceC1542d3 interfaceC1542d3 = c1997lY.f6186C;
                if (interfaceC1542d3 != null && (accessibilityManager = c1997lY.f6188F) != null) {
                    AbstractC2080nB.m3696h(accessibilityManager, interfaceC1542d3);
                    return;
                }
                return;
        }
    }
}
