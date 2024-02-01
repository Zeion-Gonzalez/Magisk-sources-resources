package p000a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;

/* renamed from: a.yM */
/* loaded from: classes.dex */
public final class C2669yM extends MetricAffectingSpan implements LeadingMarginSpan {

    /* renamed from: S */
    public final C0846Po f8314S;

    /* renamed from: R */
    public final Rect f8313R = AbstractC2461uN.f7545z;

    /* renamed from: w */
    public final Paint f8315w = AbstractC2461uN.f7544v;

    public C2669yM(C0846Po c0846Po) {
        this.f8314S = c0846Po;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Paint paint2 = this.f8315w;
        paint2.setStyle(Paint.Style.FILL);
        this.f8314S.getClass();
        paint2.setColor((paint.getColor() & 16777215) | 419430400);
        int width = canvas.getWidth();
        if (i2 <= 0) {
            i -= width;
            width = i;
        }
        Rect rect = this.f8313R;
        rect.set(i, i3, width, i5);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.f8314S.f2859P;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f8314S.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f8314S.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}
