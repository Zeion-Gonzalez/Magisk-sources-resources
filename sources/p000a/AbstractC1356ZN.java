package p000a;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* renamed from: a.ZN */
/* loaded from: classes.dex */
public abstract class AbstractC1356ZN {
    /* renamed from: P */
    public static void m2748P(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    /* renamed from: h */
    public static String[] m2749h(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* renamed from: v */
    public static PrecomputedText.Params m2750v(TextView textView) {
        return textView.getTextMetricsParams();
    }

    /* renamed from: z */
    public static CharSequence m2751z(PrecomputedText precomputedText) {
        return precomputedText;
    }
}
