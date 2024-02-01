package p000a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* renamed from: a.nE */
/* loaded from: classes.dex */
public abstract class AbstractC2083nE {
    /* renamed from: G */
    public static MenuItem m3702G(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    /* renamed from: M */
    public static MenuItem m3703M(MenuItem menuItem, char c, int i) {
        return menuItem.setNumericShortcut(c, i);
    }

    /* renamed from: N */
    public static int m3704N(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    /* renamed from: P */
    public static PorterDuff.Mode m3705P(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    /* renamed from: Q */
    public static CharSequence m3706Q(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    /* renamed from: S */
    public static MenuItem m3707S(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }

    /* renamed from: V */
    public static MenuItem m3708V(MenuItem menuItem, char c, char c2, int i, int i2) {
        return menuItem.setShortcut(c, c2, i, i2);
    }

    /* renamed from: W */
    public static MenuItem m3709W(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    /* renamed from: h */
    public static CharSequence m3710h(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    /* renamed from: o */
    public static MenuItem m3711o(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    /* renamed from: u */
    public static MenuItem m3712u(MenuItem menuItem, char c, int i) {
        return menuItem.setAlphabeticShortcut(c, i);
    }

    /* renamed from: v */
    public static ColorStateList m3713v(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    /* renamed from: z */
    public static int m3714z(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }
}
