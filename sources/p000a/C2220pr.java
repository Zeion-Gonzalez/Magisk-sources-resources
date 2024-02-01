package p000a;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.topjohnwu.magisk.R;

/* renamed from: a.pr */
/* loaded from: classes.dex */
public final class C2220pr extends RatingBar {

    /* renamed from: S */
    public final C0749O1 f6833S;

    public C2220pr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        AbstractC1757h0.m3289z(this, getContext());
        C0749O1 c0749o1 = new C0749O1(this);
        this.f6833S = c0749o1;
        c0749o1.mo1723z(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f6833S.f2554h;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
