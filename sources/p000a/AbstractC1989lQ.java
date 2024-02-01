package p000a;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: a.lQ */
/* loaded from: classes.dex */
public abstract class AbstractC1989lQ {
    /* renamed from: h */
    public static void m3599h(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: v */
    public static void m3600v(TextView textView, Locale locale) {
        textView.setTextLocale(locale);
    }

    /* renamed from: z */
    public static Drawable[] m3601z(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }
}
