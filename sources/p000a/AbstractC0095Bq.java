package p000a;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;

/* renamed from: a.Bq */
/* loaded from: classes.dex */
public abstract class AbstractC0095Bq {
    /* renamed from: G */
    public static void m196G(View view, int i) {
        view.setLayoutDirection(i);
    }

    /* renamed from: M */
    public static void m197M(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* renamed from: N */
    public static int m198N(View view) {
        return view.getPaddingEnd();
    }

    /* renamed from: P */
    public static int m199P(View view) {
        return view.getLayoutDirection();
    }

    /* renamed from: Q */
    public static int m200Q(View view) {
        return view.getPaddingStart();
    }

    /* renamed from: W */
    public static void m201W(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    /* renamed from: h */
    public static Display m202h(View view) {
        return view.getDisplay();
    }

    /* renamed from: o */
    public static void m203o(View view, int i) {
        view.setLabelFor(i);
    }

    /* renamed from: u */
    public static boolean m204u(View view) {
        return view.isPaddingRelative();
    }

    /* renamed from: v */
    public static int m205v(View view) {
        return view.getLabelFor();
    }

    /* renamed from: z */
    public static int m206z() {
        return View.generateViewId();
    }
}
