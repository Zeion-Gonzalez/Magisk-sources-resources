package p000a;

import android.view.View;
import android.view.ViewParent;

/* renamed from: a.sG */
/* loaded from: classes.dex */
public abstract class AbstractC2352sG {
    /* renamed from: N */
    public static void m4049N(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    /* renamed from: P */
    public static void m4050P(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        viewParent.onNestedScroll(view, i, i2, i3, i4);
    }

    /* renamed from: Q */
    public static boolean m4051Q(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    /* renamed from: h */
    public static boolean m4052h(ViewParent viewParent, View view, float f, float f2) {
        return viewParent.onNestedPreFling(view, f, f2);
    }

    /* renamed from: u */
    public static void m4053u(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }

    /* renamed from: v */
    public static void m4054v(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i2, iArr);
    }

    /* renamed from: z */
    public static boolean m4055z(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return viewParent.onNestedFling(view, f, f2, z);
    }
}
