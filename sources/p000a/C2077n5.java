package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.topjohnwu.magisk.R;

/* renamed from: a.n5 */
/* loaded from: classes.dex */
public final class C2077n5 extends C0749O1 {

    /* renamed from: N */
    public Drawable f6436N;

    /* renamed from: P */
    public final SeekBar f6437P;

    /* renamed from: Q */
    public ColorStateList f6438Q;

    /* renamed from: W */
    public boolean f6439W;

    /* renamed from: o */
    public boolean f6440o;

    /* renamed from: u */
    public PorterDuff.Mode f6441u;

    public C2077n5(SeekBar seekBar) {
        super(seekBar);
        this.f6438Q = null;
        this.f6441u = null;
        this.f6440o = false;
        this.f6439W = false;
        this.f6437P = seekBar;
    }

    /* renamed from: P */
    public final void m3694P(Canvas canvas) {
        if (this.f6436N != null) {
            int max = this.f6437P.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f6436N.getIntrinsicWidth();
                int intrinsicHeight = this.f6436N.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f6436N.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f6436N.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: v */
    public final void m3695v() {
        Drawable drawable = this.f6436N;
        if (drawable != null) {
            if (this.f6440o || this.f6439W) {
                Drawable mutate = drawable.mutate();
                this.f6436N = mutate;
                if (this.f6440o) {
                    AbstractC0235ET.m478o(mutate, this.f6438Q);
                }
                if (this.f6439W) {
                    AbstractC0235ET.m476W(this.f6436N, this.f6441u);
                }
                if (this.f6436N.isStateful()) {
                    this.f6436N.setState(this.f6437P.getDrawableState());
                }
            }
        }
    }

    @Override // p000a.C0749O1
    /* renamed from: z */
    public final void mo1723z(AttributeSet attributeSet, int i) {
        super.mo1723z(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f6437P;
        Context context = seekBar.getContext();
        int[] iArr = AbstractC0483J5.f1622u;
        C2709z9 m4639S = C2709z9.m4639S(context, attributeSet, iArr, R.attr.seekBarStyle);
        AbstractC2446u3.m4215M(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) m4639S.f8534h, R.attr.seekBarStyle);
        Drawable m4644Q = m4639S.m4644Q(0);
        if (m4644Q != null) {
            seekBar.setThumb(m4644Q);
        }
        Drawable m4642N = m4639S.m4642N(1);
        Drawable drawable = this.f6436N;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f6436N = m4642N;
        if (m4642N != null) {
            m4642N.setCallback(seekBar);
            AbstractC2340s1.m3999h(m4642N, AbstractC0095Bq.m199P(seekBar));
            if (m4642N.isStateful()) {
                m4642N.setState(seekBar.getDrawableState());
            }
            m3695v();
        }
        seekBar.invalidate();
        if (m4639S.m4645V(3)) {
            this.f6441u = AbstractC1888jY.m3508v(m4639S.m4648o(3, -1), this.f6441u);
            this.f6439W = true;
        }
        if (m4639S.m4645V(2)) {
            this.f6438Q = m4639S.m4647h(2);
            this.f6440o = true;
        }
        m4639S.m4651w();
        m3695v();
    }
}
