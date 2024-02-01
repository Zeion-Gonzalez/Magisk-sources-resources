package p000a;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

/* renamed from: a.pW */
/* loaded from: classes.dex */
public abstract class AbstractC2204pW {
    /* renamed from: G */
    public static boolean m3832G(View view) {
        return view.restoreDefaultFocus();
    }

    /* renamed from: I */
    public static void m3833I(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    /* renamed from: M */
    public static void m3834M(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    /* renamed from: N */
    public static boolean m3835N(View view) {
        return view.hasExplicitFocusable();
    }

    /* renamed from: P */
    public static int m3836P(View view) {
        return view.getNextClusterForwardId();
    }

    /* renamed from: Q */
    public static boolean m3837Q(View view) {
        return view.isFocusedByDefault();
    }

    /* renamed from: R */
    public static void m3838R(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    /* renamed from: S */
    public static void m3839S(View view, int i) {
        view.setImportantForAutofill(i);
    }

    /* renamed from: V */
    public static void m3840V(View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    /* renamed from: W */
    public static View m3841W(View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }

    /* renamed from: h */
    public static AutofillId m3842h(View view) {
        return view.getAutofillId();
    }

    /* renamed from: o */
    public static boolean m3843o(View view) {
        return view.isKeyboardNavigationCluster();
    }

    /* renamed from: u */
    public static boolean m3844u(View view) {
        return view.isImportantForAutofill();
    }

    /* renamed from: v */
    public static int m3845v(View view) {
        return view.getImportantForAutofill();
    }

    /* renamed from: w */
    public static void m3846w(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    /* renamed from: z */
    public static void m3847z(View view, Collection<View> collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }
}
