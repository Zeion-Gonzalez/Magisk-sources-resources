package p000a;

import android.animation.ValueAnimator;

/* renamed from: a.Xq */
/* loaded from: classes.dex */
public final class C1272Xq implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: z */
    public final /* synthetic */ C0602LH f4093z;

    public C1272Xq(C0602LH c0602lh) {
        this.f4093z = c0602lh;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0602LH c0602lh = this.f4093z;
        c0602lh.f1956v.setAlpha(floatValue);
        c0602lh.f1938P.setAlpha(floatValue);
        c0602lh.f1948g.invalidate();
    }
}
