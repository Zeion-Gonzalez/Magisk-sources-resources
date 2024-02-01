package p000a;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.topjohnwu.magisk.R;
import java.util.List;

/* renamed from: a.q3 */
/* loaded from: classes.dex */
public final class C2231q3 extends AbstractC1708g6 {

    /* renamed from: N */
    public static final PathInterpolator f6876N = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: Q */
    public static final C1945kc f6877Q = new C1945kc();

    /* renamed from: u */
    public static final DecelerateInterpolator f6878u = new DecelerateInterpolator();

    /* renamed from: G */
    public static C1829iR m3872G(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC2503v8) {
            return ((ViewOnApplyWindowInsetsListenerC2503v8) tag).f7672z;
        }
        return null;
    }

    /* renamed from: N */
    public static void m3873N(View view) {
        C1829iR m3872G = m3872G(view);
        if (m3872G != null) {
            m3872G.f5721h.setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m3873N(viewGroup.getChildAt(i));
            }
        }
    }

    /* renamed from: Q */
    public static void m3874Q(View view, WindowInsets windowInsets, boolean z) {
        C1829iR m3872G = m3872G(view);
        if (m3872G != null) {
            m3872G.f5723z = windowInsets;
            if (!z) {
                View view2 = m3872G.f5721h;
                int[] iArr = m3872G.f5719N;
                view2.getLocationOnScreen(iArr);
                z = true;
                m3872G.f5722v = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m3874Q(viewGroup.getChildAt(i), windowInsets, z);
            }
        }
    }

    /* renamed from: W */
    public static WindowInsets m3875W(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: o */
    public static void m3876o(View view, C1624eZ c1624eZ) {
        C1829iR m3872G = m3872G(view);
        if (m3872G != null) {
            View view2 = m3872G.f5721h;
            int[] iArr = m3872G.f5719N;
            view2.getLocationOnScreen(iArr);
            int i = m3872G.f5722v - iArr[1];
            m3872G.f5720P = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m3876o(viewGroup.getChildAt(i2), c1624eZ);
            }
        }
    }

    /* renamed from: u */
    public static void m3877u(View view, C2621xJ c2621xJ, List list) {
        C1829iR m3872G = m3872G(view);
        if (m3872G != null) {
            m3872G.m3382z(c2621xJ, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m3877u(viewGroup.getChildAt(i), c2621xJ, list);
            }
        }
    }
}
