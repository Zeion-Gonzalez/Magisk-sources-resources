package p000a;

import android.animation.ValueAnimator;

/* renamed from: a.Eb */
/* loaded from: classes.dex */
public final class C0241Eb implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: h */
    public final /* synthetic */ AbstractC2691yn f827h;

    /* renamed from: z */
    public final /* synthetic */ int f828z;

    public /* synthetic */ C0241Eb(AbstractC2691yn abstractC2691yn, int i) {
        this.f828z = i;
        this.f827h = abstractC2691yn;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f828z;
        AbstractC2691yn abstractC2691yn = this.f827h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                abstractC2691yn.f8402W.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                abstractC2691yn.f8402W.setScaleX(floatValue);
                abstractC2691yn.f8402W.setScaleY(floatValue);
                return;
        }
    }
}
