package p000a;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: a.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC1806i0 {
    /* renamed from: N */
    public static void m3365N(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: P */
    public static Locale m3366P(TextView textView) {
        return textView.getTextLocale();
    }

    /* renamed from: Q */
    public static void m3367Q(TextView textView, int i, int i2, int i3, int i4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    /* renamed from: h */
    public static int m3368h(View view) {
        return view.getLayoutDirection();
    }

    /* renamed from: o */
    public static void m3369o(View view, int i) {
        view.setTextDirection(i);
    }

    /* renamed from: u */
    public static void m3370u(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: v */
    public static int m3371v(View view) {
        return view.getTextDirection();
    }

    /* renamed from: z */
    public static Drawable[] m3372z(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }
}
