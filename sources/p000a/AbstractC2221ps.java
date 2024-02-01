package p000a;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: a.ps */
/* loaded from: classes.dex */
public abstract class AbstractC2221ps {
    /* renamed from: P */
    public static void m3858P(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    /* renamed from: h */
    public static OnBackInvokedCallback m3859h(Runnable runnable) {
        return new C0257Ev(1, runnable);
    }

    /* renamed from: v */
    public static void m3860v(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: z */
    public static OnBackInvokedDispatcher m3861z(View view) {
        return view.findOnBackInvokedDispatcher();
    }
}
