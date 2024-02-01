package p000a;

import android.view.View;
import android.view.autofill.AutofillId;
import com.topjohnwu.magisk.R;

/* renamed from: a.aX */
/* loaded from: classes.dex */
public abstract class AbstractC1412aX {
    /* renamed from: G */
    public static void m2830G(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    /* renamed from: N */
    public static void m2831N(View view, InterfaceC0524Js interfaceC0524Js) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C2698yx c2698yx = (C2698yx) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c2698yx != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c2698yx.getOrDefault(interfaceC0524Js, null)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    /* renamed from: P */
    public static boolean m2832P(View view) {
        return view.isScreenReaderFocusable();
    }

    /* renamed from: Q */
    public static <T> T m2833Q(View view, int i) {
        return (T) view.requireViewById(i);
    }

    /* renamed from: W */
    public static void m2834W(View view, AutofillId autofillId) {
        view.setAutofillId(autofillId);
    }

    /* renamed from: h */
    public static CharSequence m2835h(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* renamed from: o */
    public static void m2836o(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* renamed from: u */
    public static void m2837u(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    /* renamed from: v */
    public static boolean m2838v(View view) {
        return view.isAccessibilityHeading();
    }

    /* renamed from: z */
    public static void m2839z(View view, InterfaceC0524Js interfaceC0524Js) {
        C2698yx c2698yx = (C2698yx) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c2698yx == null) {
            c2698yx = new C2698yx();
            view.setTag(R.id.tag_unhandled_key_listeners, c2698yx);
        }
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC2248qM = new ViewOnUnhandledKeyEventListenerC2248qM();
        c2698yx.put(interfaceC0524Js, viewOnUnhandledKeyEventListenerC2248qM);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC2248qM);
    }
}
