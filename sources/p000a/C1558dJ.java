package p000a;

import android.animation.ValueAnimator;

/* renamed from: a.dJ */
/* loaded from: classes.dex */
public final class C1558dJ implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: z */
    public final /* synthetic */ AbstractC2691yn f4817z;

    public C1558dJ(AbstractC2691yn abstractC2691yn, int i) {
        this.f4817z = abstractC2691yn;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C2174oz c2174oz = AbstractC2691yn.f8386E;
        this.f4817z.f8402W.setTranslationY(intValue);
    }
}
