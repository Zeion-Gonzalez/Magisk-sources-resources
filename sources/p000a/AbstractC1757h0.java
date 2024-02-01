package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* renamed from: a.h0 */
/* loaded from: classes.dex */
public abstract class AbstractC1757h0 {

    /* renamed from: z */
    public static final ThreadLocal f5552z = new ThreadLocal();

    /* renamed from: h */
    public static final int[] f5549h = {-16842910};

    /* renamed from: v */
    public static final int[] f5551v = {16842908};

    /* renamed from: P */
    public static final int[] f5547P = {16842919};

    /* renamed from: N */
    public static final int[] f5546N = {16842912};

    /* renamed from: Q */
    public static final int[] f5548Q = new int[0];

    /* renamed from: u */
    public static final int[] f5550u = new int[1];

    /* renamed from: P */
    public static ColorStateList m3286P(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f5550u;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC0865QC.m1999h(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: h */
    public static int m3287h(Context context, int i) {
        ColorStateList m3286P = m3286P(context, i);
        if (m3286P != null && m3286P.isStateful()) {
            return m3286P.getColorForState(f5549h, m3286P.getDefaultColor());
        }
        ThreadLocal threadLocal = f5552z;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        return AbstractC0106C4.m229v(m3288v(context, i), Math.round(Color.alpha(r4) * f));
    }

    /* renamed from: v */
    public static int m3288v(Context context, int i) {
        int[] iArr = f5550u;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: z */
    public static void m3289z(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0483J5.f1600G);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
