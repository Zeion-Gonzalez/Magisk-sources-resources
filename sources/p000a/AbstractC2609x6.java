package p000a;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: a.x6 */
/* loaded from: classes.dex */
public abstract class AbstractC2609x6 {
    /* renamed from: P */
    public static void m4490P(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    /* renamed from: h */
    public static int m4491h(View view) {
        return view.getScrollIndicators();
    }

    /* renamed from: v */
    public static void m4492v(View view, int i) {
        view.setScrollIndicators(i);
    }

    /* renamed from: z */
    public static C2621xJ m4493z(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C2621xJ m4514o = C2621xJ.m4514o(null, rootWindowInsets);
        C2194pK c2194pK = m4514o.f8107z;
        c2194pK.mo3644I(m4514o);
        c2194pK.mo3645P(view.getRootView());
        return m4514o;
    }
}
