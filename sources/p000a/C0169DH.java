package p000a;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: a.DH */
/* loaded from: classes.dex */
public final class C0169DH extends MetricAffectingSpan {

    /* renamed from: S */
    public final /* synthetic */ int f529S;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f529S) {
            case AbstractC0795Op.f2698E /* 0 */:
                textPaint.setTextSkewX(-0.25f);
                return;
            default:
                textPaint.setFakeBoldText(true);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f529S) {
            case AbstractC0795Op.f2698E /* 0 */:
                textPaint.setTextSkewX(-0.25f);
                return;
            default:
                textPaint.setFakeBoldText(true);
                return;
        }
    }
}
