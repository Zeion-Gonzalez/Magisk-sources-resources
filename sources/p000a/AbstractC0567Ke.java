package p000a;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* renamed from: a.Ke */
/* loaded from: classes.dex */
public abstract class AbstractC0567Ke {

    /* renamed from: z */
    public static final int[] f1845z = {16842919};

    /* renamed from: h */
    public static final int[] f1843h = {16842908};

    /* renamed from: v */
    public static final int[] f1844v = {16842913, 16842919};

    /* renamed from: P */
    public static final int[] f1841P = {16842913};

    /* renamed from: N */
    public static final int[] f1840N = {16842910, 16842919};

    /* renamed from: Q */
    public static final String f1842Q = AbstractC0567Ke.class.getSimpleName();

    /* renamed from: h */
    public static ColorStateList m1282h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f1840N, 0)) != 0) {
                Log.w(f1842Q, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    /* renamed from: v */
    public static boolean m1283v(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    /* renamed from: z */
    public static int m1284z(ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        return AbstractC0106C4.m229v(i, Math.min(Color.alpha(i) * 2, 255));
    }
}
