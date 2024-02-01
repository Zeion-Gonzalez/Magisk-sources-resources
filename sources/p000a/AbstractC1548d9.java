package p000a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.topjohnwu.magisk.R;

/* renamed from: a.d9 */
/* loaded from: classes.dex */
public abstract class AbstractC1548d9 {
    /* renamed from: E */
    public static void m2994E(View view, float f) {
        view.setTranslationZ(f);
    }

    /* renamed from: G */
    public static C2621xJ m2995G(View view) {
        if (AbstractC0882QY.f3043P && view.isAttachedToWindow()) {
            try {
                Object obj = AbstractC0882QY.f3046z.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) AbstractC0882QY.f3044h.get(obj);
                    Rect rect2 = (Rect) AbstractC0882QY.f3045v.get(obj);
                    if (rect != null && rect2 != null) {
                        C2196pM c2196pM = new C2196pM(11);
                        ((AbstractC1522cj) c2196pM.f6755R).mo2375N(C2739zj.m4673h(rect.left, rect.top, rect.right, rect.bottom));
                        ((AbstractC1522cj) c2196pM.f6755R).mo2380u(C2739zj.m4673h(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        C2621xJ m3817R = c2196pM.m3817R();
                        m3817R.f8107z.mo3644I(m3817R);
                        m3817R.f8107z.mo3645P(view.getRootView());
                        return m3817R;
                    }
                }
            } catch (IllegalAccessException e) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
            }
        }
        return null;
    }

    /* renamed from: I */
    public static boolean m2996I(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* renamed from: M */
    public static String m2997M(View view) {
        return view.getTransitionName();
    }

    /* renamed from: N */
    public static boolean m2998N(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    /* renamed from: P */
    public static boolean m2999P(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    /* renamed from: Q */
    public static boolean m3000Q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    /* renamed from: R */
    public static boolean m3001R(View view) {
        return view.hasNestedScrollingParent();
    }

    /* renamed from: S */
    public static float m3002S(View view) {
        return view.getZ();
    }

    /* renamed from: U */
    public static void m3003U(View view, String str) {
        view.setTransitionName(str);
    }

    /* renamed from: V */
    public static float m3004V(View view) {
        return view.getTranslationZ();
    }

    /* renamed from: W */
    public static float m3005W(View view) {
        return view.getElevation();
    }

    /* renamed from: Y */
    public static void m3006Y(View view) {
        view.stopNestedScroll();
    }

    /* renamed from: f */
    public static void m3007f(View view, float f) {
        view.setZ(f);
    }

    /* renamed from: g */
    public static void m3008g(View view, float f) {
        view.setElevation(f);
    }

    /* renamed from: h */
    public static C2621xJ m3009h(View view, C2621xJ c2621xJ, Rect rect) {
        WindowInsets m4518u = c2621xJ.m4518u();
        if (m4518u != null) {
            return C2621xJ.m4514o(view, view.computeSystemWindowInsets(m4518u, rect));
        }
        rect.setEmpty();
        return c2621xJ;
    }

    /* renamed from: k */
    public static void m3010k(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* renamed from: o */
    public static PorterDuff.Mode m3011o(View view) {
        return view.getBackgroundTintMode();
    }

    /* renamed from: q */
    public static void m3012q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* renamed from: r */
    public static boolean m3013r(View view, int i) {
        return view.startNestedScroll(i);
    }

    /* renamed from: s */
    public static void m3014s(View view, InterfaceC0910R9 interfaceC0910R9) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0910R9);
        }
        if (interfaceC0910R9 == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC2179p3(view, interfaceC0910R9));
        }
    }

    /* renamed from: u */
    public static ColorStateList m3015u(View view) {
        return view.getBackgroundTintList();
    }

    /* renamed from: v */
    public static boolean m3016v(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    /* renamed from: w */
    public static boolean m3017w(View view) {
        return view.isImportantForAccessibility();
    }

    /* renamed from: y */
    public static void m3018y(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    /* renamed from: z */
    public static void m3019z(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }
}
