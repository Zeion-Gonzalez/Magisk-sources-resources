package p000a;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: a.t8 */
/* loaded from: classes.dex */
public abstract class AbstractC2397t8 {
    /* renamed from: G */
    public static boolean m4113G(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    /* renamed from: I */
    public static void m4114I(View view) {
        view.requestFitSystemWindows();
    }

    /* renamed from: M */
    public static void m4115M(View view) {
        view.postInvalidateOnAnimation();
    }

    /* renamed from: N */
    public static int m4116N(View view) {
        return view.getMinimumWidth();
    }

    /* renamed from: P */
    public static int m4117P(View view) {
        return view.getMinimumHeight();
    }

    /* renamed from: Q */
    public static ViewParent m4118Q(View view) {
        return view.getParentForAccessibility();
    }

    /* renamed from: R */
    public static void m4119R(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    /* renamed from: S */
    public static void m4120S(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* renamed from: V */
    public static void m4121V(View view, int i, int i2, int i3, int i4) {
        view.postInvalidateOnAnimation(i, i2, i3, i4);
    }

    /* renamed from: W */
    public static boolean m4122W(View view) {
        return view.hasTransientState();
    }

    /* renamed from: g */
    public static void m4123g(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    /* renamed from: h */
    public static boolean m4124h(View view) {
        return view.getFitsSystemWindows();
    }

    /* renamed from: k */
    public static void m4125k(View view, boolean z) {
        view.setHasTransientState(z);
    }

    /* renamed from: o */
    public static boolean m4126o(View view) {
        return view.hasOverlappingRendering();
    }

    /* renamed from: q */
    public static void m4127q(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: u */
    public static int m4128u(View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* renamed from: v */
    public static int m4129v(View view) {
        return view.getImportantForAccessibility();
    }

    /* renamed from: w */
    public static void m4130w(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: z */
    public static AccessibilityNodeProvider m4131z(View view) {
        return view.getAccessibilityNodeProvider();
    }
}
