package p000a;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: a.dw */
/* loaded from: classes.dex */
public abstract class AbstractC1589dw {
    /* renamed from: h */
    public static WindowInsets m3063h(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: v */
    public static void m3064v(View view) {
        view.requestApplyInsets();
    }

    /* renamed from: z */
    public static WindowInsets m3065z(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }
}
