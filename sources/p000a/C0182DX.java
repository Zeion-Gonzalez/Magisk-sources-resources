package p000a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* renamed from: a.DX */
/* loaded from: classes.dex */
public final class C0182DX implements LeadingMarginSpan {

    /* renamed from: I */
    public final Paint f564I;

    /* renamed from: R */
    public final C0846Po f565R;

    /* renamed from: S */
    public final /* synthetic */ int f566S;

    /* renamed from: w */
    public final Rect f567w;

    public C0182DX(C0846Po c0846Po, int i) {
        this.f566S = i;
        if (i != 1) {
            this.f567w = AbstractC2461uN.f7545z;
            this.f564I = AbstractC2461uN.f7544v;
            this.f565R = c0846Po;
        } else {
            this.f567w = AbstractC2461uN.f7545z;
            this.f564I = AbstractC2461uN.f7544v;
            this.f565R = c0846Po;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        Paint paint2 = this.f564I;
        int i9 = this.f566S;
        Rect rect = this.f567w;
        C0846Po c0846Po = this.f565R;
        switch (i9) {
            case AbstractC0795Op.f2698E /* 0 */:
                int i10 = c0846Po.f2861h;
                if (i10 == 0) {
                    i10 = (int) ((c0846Po.f2863z * 0.25f) + 0.5f);
                }
                paint2.set(paint);
                int color = (paint2.getColor() & 16777215) | 419430400;
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(color);
                int i11 = i2 * i10;
                int i12 = i + i11;
                int i13 = i11 + i12;
                rect.set(Math.min(i12, i13), i3, Math.max(i12, i13), i5);
                canvas.drawRect(rect, paint2);
                return;
            default:
                int i14 = ((i5 - i3) / 2) + i3;
                paint2.set(paint);
                c0846Po.getClass();
                paint2.setColor((paint2.getColor() & 16777215) | 419430400);
                paint2.setStyle(Paint.Style.FILL);
                int i15 = c0846Po.f2860Q;
                if (i15 >= 0) {
                    paint2.setStrokeWidth(i15);
                }
                int strokeWidth = (int) ((((int) (paint2.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
                if (i2 > 0) {
                    i8 = canvas.getWidth();
                } else {
                    i8 = i;
                    i -= canvas.getWidth();
                }
                rect.set(i, i14 - strokeWidth, i8, i14 + strokeWidth);
                canvas.drawRect(rect, paint2);
                return;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        switch (this.f566S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return this.f565R.f2863z;
            default:
                return 0;
        }
    }
}
