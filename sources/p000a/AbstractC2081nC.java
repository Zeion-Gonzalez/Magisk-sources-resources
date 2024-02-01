package p000a;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: a.nC */
/* loaded from: classes.dex */
public abstract class AbstractC2081nC {
    /* JADX WARN: Type inference failed for: r0v0, types: [a.HX, android.window.OnBackInvokedCallback] */
    /* renamed from: h */
    public static OnBackInvokedCallback m3698h(Object obj, final LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6) {
        ?? r0 = new OnBackInvokedCallback() { // from class: a.HX
            public final void onBackInvoked() {
                LayoutInflaterFactory2C1392a6.this.m2797Z();
            }
        };
        AbstractC0644M6.m1443N(obj).registerOnBackInvokedCallback(1000000, r0);
        return r0;
    }

    /* renamed from: v */
    public static void m3699v(Object obj, Object obj2) {
        AbstractC0644M6.m1443N(obj).unregisterOnBackInvokedCallback(AbstractC0644M6.m1446h(obj2));
    }

    /* renamed from: z */
    public static OnBackInvokedDispatcher m3700z(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }
}
