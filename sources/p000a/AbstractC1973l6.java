package p000a;

import android.graphics.Rect;
import android.view.View;

/* renamed from: a.l6 */
/* loaded from: classes.dex */
public abstract class AbstractC1973l6 {
    /* renamed from: h */
    public static boolean m3586h(View view) {
        return view.isInLayout();
    }

    /* renamed from: v */
    public static void m3587v(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    /* renamed from: z */
    public static Rect m3588z(View view) {
        return view.getClipBounds();
    }
}
