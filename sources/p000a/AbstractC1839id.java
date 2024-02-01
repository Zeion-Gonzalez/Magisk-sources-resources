package p000a;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* renamed from: a.id */
/* loaded from: classes.dex */
public abstract class AbstractC1839id {
    /* renamed from: N */
    public static int m3390N(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* renamed from: P */
    public static int m3391P(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* renamed from: Q */
    public static int m3392Q(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    /* renamed from: h */
    public static List<Rect> m3393h(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    /* renamed from: v */
    public static int m3394v(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* renamed from: z */
    public static DisplayCutout m3395z(Rect rect, List<Rect> list) {
        return new DisplayCutout(rect, list);
    }
}
