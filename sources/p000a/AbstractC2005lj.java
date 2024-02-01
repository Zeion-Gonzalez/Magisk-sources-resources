package p000a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* renamed from: a.lj */
/* loaded from: classes.dex */
public abstract class AbstractC2005lj {
    /* renamed from: N */
    public static void m3628N(TextView textView, int i) {
        textView.setBreakStrategy(i);
    }

    /* renamed from: P */
    public static int m3629P(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    /* renamed from: Q */
    public static void m3630Q(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    /* renamed from: h */
    public static ColorStateList m3631h(TextView textView) {
        return textView.getCompoundDrawableTintList();
    }

    /* renamed from: o */
    public static void m3632o(TextView textView, int i) {
        textView.setHyphenationFrequency(i);
    }

    /* renamed from: u */
    public static void m3633u(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    /* renamed from: v */
    public static PorterDuff.Mode m3634v(TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    /* renamed from: z */
    public static int m3635z(TextView textView) {
        return textView.getBreakStrategy();
    }
}
