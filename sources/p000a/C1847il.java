package p000a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.topjohnwu.magisk.R;

/* renamed from: a.il */
/* loaded from: classes.dex */
public final class C1847il extends SeekBar {

    /* renamed from: S */
    public final C2077n5 f5769S;

    public C1847il(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC1757h0.m3289z(this, getContext());
        C2077n5 c2077n5 = new C2077n5(this);
        this.f5769S = c2077n5;
        c2077n5.mo1723z(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2077n5 c2077n5 = this.f5769S;
        Drawable drawable = c2077n5.f6436N;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = c2077n5.f6437P;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5769S.f6436N;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f5769S.m3694P(canvas);
    }
}
