package p000a;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: a.c4 */
/* loaded from: classes.dex */
public final class C1491c4 extends MetricAffectingSpan {

    /* renamed from: S */
    public final C0846Po f4629S;

    public C1491c4(C0846Po c0846Po) {
        this.f4629S = c0846Po;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C0846Po c0846Po = this.f4629S;
        c0846Po.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
        c0846Po.getClass();
        textPaint.bgColor = (textPaint.getColor() & 16777215) | 419430400;
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f4629S.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}
