package p000a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: a.ET */
/* loaded from: classes.dex */
public abstract class AbstractC0235ET {
    /* renamed from: N */
    public static void m473N(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    /* renamed from: P */
    public static void m474P(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: Q */
    public static void m475Q(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    /* renamed from: W */
    public static void m476W(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* renamed from: h */
    public static boolean m477h(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    /* renamed from: o */
    public static void m478o(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* renamed from: u */
    public static void m479u(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    /* renamed from: v */
    public static ColorFilter m480v(Drawable drawable) {
        return drawable.getColorFilter();
    }

    /* renamed from: z */
    public static void m481z(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }
}
