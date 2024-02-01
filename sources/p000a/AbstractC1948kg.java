package p000a;

import android.widget.TextView;

/* renamed from: a.kg */
/* loaded from: classes.dex */
public abstract class AbstractC1948kg {
    /* renamed from: P */
    public static boolean m3560P(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }

    /* renamed from: h */
    public static void m3561h(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* renamed from: v */
    public static void m3562v(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    /* renamed from: z */
    public static int m3563z(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }
}
