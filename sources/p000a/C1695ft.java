package p000a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: a.ft */
/* loaded from: classes.dex */
public final class C1695ft extends MetricAffectingSpan implements LeadingMarginSpan {

    /* renamed from: I */
    public final int f5310I;

    /* renamed from: S */
    public final C0846Po f5312S;

    /* renamed from: R */
    public final Rect f5311R = AbstractC2461uN.f7545z;

    /* renamed from: w */
    public final Paint f5313w = AbstractC2461uN.f7544v;

    public C1695ft(C0846Po c0846Po, int i) {
        this.f5312S = c0846Po;
        this.f5310I = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int i9 = this.f5310I;
        boolean z2 = true;
        if (i9 == 1 || i9 == 2) {
            if (!(charSequence instanceof Spanned) || ((Spanned) charSequence).getSpanEnd(this) != i7) {
                z2 = false;
            }
            if (z2) {
                Paint paint2 = this.f5313w;
                paint2.set(paint);
                C0846Po c0846Po = this.f5312S;
                c0846Po.getClass();
                paint2.setColor((paint2.getColor() & 16777215) | 1258291200);
                paint2.setStyle(Paint.Style.FILL);
                int i10 = c0846Po.f2858N;
                if (i10 >= 0) {
                    paint2.setStrokeWidth(i10);
                }
                float strokeWidth = paint2.getStrokeWidth();
                if (strokeWidth > 0.0f) {
                    int i11 = (int) ((i5 - strokeWidth) + 0.5f);
                    if (i2 > 0) {
                        i8 = canvas.getWidth();
                    } else {
                        i8 = i;
                        i -= canvas.getWidth();
                    }
                    Rect rect = this.f5311R;
                    rect.set(i, i11, i8, i5);
                    canvas.drawRect(rect, paint2);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        m3200z(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        m3200z(textPaint);
    }

    /* renamed from: z */
    public final void m3200z(TextPaint textPaint) {
        this.f5312S.getClass();
        textPaint.setFakeBoldText(true);
        float[] fArr = C0846Po.f2857u;
        int i = this.f5310I;
        if (6 >= i) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i - 1]);
            return;
        }
        throw new IllegalStateException(String.format(Locale.US, "Supplied heading level: %d is invalid, where configured heading sizes are: `%s`", Integer.valueOf(i), Arrays.toString(fArr)));
    }
}
