package p000a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* renamed from: a.xG */
/* loaded from: classes.dex */
public final class C2618xG implements LeadingMarginSpan {

    /* renamed from: I */
    public int f8094I;

    /* renamed from: R */
    public final String f8095R;

    /* renamed from: S */
    public final C0846Po f8096S;

    /* renamed from: w */
    public final Paint f8097w = AbstractC2461uN.f7544v;

    public C2618xG(C0846Po c0846Po, String str) {
        this.f8096S = c0846Po;
        this.f8095R = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        boolean z2;
        int i8;
        if (z) {
            if ((charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                Paint paint2 = this.f8097w;
                paint2.set(paint);
                C0846Po c0846Po = this.f8096S;
                c0846Po.getClass();
                paint2.setColor(paint2.getColor());
                int i9 = c0846Po.f2862v;
                if (i9 != 0) {
                    paint2.setStrokeWidth(i9);
                }
                String str = this.f8095R;
                int measureText = (int) (paint2.measureText(str) + 0.5f);
                int i10 = c0846Po.f2863z;
                if (measureText > i10) {
                    this.f8094I = measureText;
                    i10 = measureText;
                } else {
                    this.f8094I = 0;
                }
                if (i2 > 0) {
                    i8 = ((i10 * i2) + i) - measureText;
                } else {
                    i8 = (i10 - measureText) + (i2 * i10) + i;
                }
                canvas.drawText(str, i8, i4, paint2);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return Math.max(this.f8094I, this.f8096S.f2863z);
    }
}
