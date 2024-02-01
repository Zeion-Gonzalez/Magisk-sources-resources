package p000a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* renamed from: a.kU */
/* loaded from: classes.dex */
public final class C1938kU implements LeadingMarginSpan {

    /* renamed from: k */
    public static final boolean f6016k;

    /* renamed from: S */
    public final C0846Po f6019S;

    /* renamed from: q */
    public final int f6020q;

    /* renamed from: R */
    public final Paint f6018R = AbstractC2461uN.f7544v;

    /* renamed from: w */
    public final RectF f6021w = AbstractC2461uN.f7543h;

    /* renamed from: I */
    public final Rect f6017I = AbstractC2461uN.f7545z;

    static {
        int i = Build.VERSION.SDK_INT;
        f6016k = 24 == i || 25 == i;
    }

    public C1938kU(C0846Po c0846Po, int i) {
        this.f6019S = c0846Po;
        this.f6020q = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int i9;
        Rect rect = this.f6017I;
        if (z) {
            if ((charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
                Paint paint2 = this.f6018R;
                paint2.set(paint);
                C0846Po c0846Po = this.f6019S;
                c0846Po.getClass();
                paint2.setColor(paint2.getColor());
                int i10 = c0846Po.f2862v;
                if (i10 != 0) {
                    paint2.setStrokeWidth(i10);
                }
                int i11 = c0846Po.f2863z;
                int save = canvas.save();
                try {
                    int min = Math.min(i11, (int) ((paint2.descent() - paint2.ascent()) + 0.5f)) / 2;
                    int i12 = (i11 - min) / 2;
                    boolean z2 = f6016k;
                    int i13 = this.f6020q;
                    if (z2) {
                        int width = i2 < 0 ? i - (layout.getWidth() - (i11 * i13)) : (i11 * i13) - i;
                        int i14 = (i12 * i2) + i;
                        int i15 = (i2 * min) + i14;
                        int i16 = i2 * width;
                        i8 = Math.min(i14, i15) + i16;
                        i9 = Math.max(i14, i15) + i16;
                    } else {
                        if (i2 <= 0) {
                            i -= i11;
                        }
                        i8 = i + i12;
                        i9 = i8 + min;
                    }
                    int descent = (i4 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (min / 2);
                    int i17 = min + descent;
                    if (i13 != 0 && i13 != 1) {
                        rect.set(i8, descent, i9, i17);
                        paint2.setStyle(Paint.Style.FILL);
                        canvas.drawRect(rect, paint2);
                    }
                    RectF rectF = this.f6021w;
                    rectF.set(i8, descent, i9, i17);
                    paint2.setStyle(i13 == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(rectF, paint2);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.f6019S.f2863z;
    }
}
