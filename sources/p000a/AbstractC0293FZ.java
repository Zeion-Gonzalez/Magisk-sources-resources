package p000a;

import android.view.ViewGroup;

/* renamed from: a.FZ */
/* loaded from: classes.dex */
public abstract class AbstractC0293FZ {
    /* renamed from: N */
    public static void m609N(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.resolveLayoutDirection(i);
    }

    /* renamed from: P */
    public static boolean m610P(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    /* renamed from: Q */
    public static void m611Q(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setLayoutDirection(i);
    }

    /* renamed from: h */
    public static int m612h(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    /* renamed from: o */
    public static void m613o(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginStart(i);
    }

    /* renamed from: u */
    public static void m614u(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginEnd(i);
    }

    /* renamed from: v */
    public static int m615v(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    /* renamed from: z */
    public static int m616z(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getLayoutDirection();
    }
}
