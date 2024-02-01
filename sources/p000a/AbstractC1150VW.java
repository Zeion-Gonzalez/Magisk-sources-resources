package p000a;

import android.view.ViewGroup;

/* renamed from: a.VW */
/* loaded from: classes.dex */
public abstract class AbstractC1150VW {
    /* renamed from: h */
    public static boolean m2361h(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    /* renamed from: v */
    public static void m2362v(ViewGroup viewGroup, boolean z) {
        viewGroup.setTransitionGroup(z);
    }

    /* renamed from: z */
    public static int m2363z(ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }
}
