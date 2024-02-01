package p000a;

import android.animation.ValueAnimator;

/* renamed from: a.CS */
/* loaded from: classes.dex */
public final class C0127CS implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: z */
    public final /* synthetic */ AbstractC2691yn f438z;

    public C0127CS(AbstractC2691yn abstractC2691yn) {
        this.f438z = abstractC2691yn;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C2174oz c2174oz = AbstractC2691yn.f8386E;
        this.f438z.f8402W.setTranslationY(intValue);
    }
}
