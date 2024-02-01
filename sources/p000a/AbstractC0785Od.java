package p000a;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* renamed from: a.Od */
/* loaded from: classes.dex */
public abstract class AbstractC0785Od {
    /* renamed from: h */
    public static int m1792h(TextView textView) {
        return textView.getMaxLines();
    }

    /* renamed from: z */
    public static StaticLayout m1793z(CharSequence charSequence, Layout.Alignment alignment, int i, TextView textView, TextPaint textPaint) {
        return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
    }
}
