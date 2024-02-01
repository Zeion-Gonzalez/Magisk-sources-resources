package p000a;

import android.animation.ValueAnimator;

/* renamed from: a.Eg */
/* loaded from: classes.dex */
public final class C0245Eg implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: h */
    public final /* synthetic */ C0065BH f837h;

    /* renamed from: z */
    public final /* synthetic */ float f838z;

    public C0245Eg(C0065BH c0065bh, float f) {
        this.f837h = c0065bh;
        this.f838z = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int[] iArr = C0065BH.f259D;
        this.f837h.m119S(floatValue, this.f838z);
    }
}
