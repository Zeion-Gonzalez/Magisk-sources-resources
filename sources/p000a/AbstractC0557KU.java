package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: a.KU */
/* loaded from: classes.dex */
public abstract class AbstractC0557KU extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: P */
    public final /* synthetic */ AbstractC0251En f1819P;

    /* renamed from: h */
    public float f1820h;

    /* renamed from: v */
    public float f1821v;

    /* renamed from: z */
    public boolean f1822z;

    public AbstractC0557KU(C1410aT c1410aT) {
        this.f1819P = c1410aT;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f = (int) this.f1821v;
        C2281qz c2281qz = this.f1819P.f892h;
        if (c2281qz != null) {
            c2281qz.m3935S(f);
        }
        this.f1822z = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        float f2;
        float f3;
        boolean z = this.f1822z;
        AbstractC0251En abstractC0251En = this.f1819P;
        if (!z) {
            C2281qz c2281qz = abstractC0251En.f892h;
            float f4 = 0.0f;
            if (c2281qz == null) {
                f = 0.0f;
            } else {
                f = c2281qz.f7021S.f4602R;
            }
            this.f1820h = f;
            C0613LX c0613lx = (C0613LX) this;
            int i = c0613lx.f1990N;
            AbstractC0251En abstractC0251En2 = c0613lx.f1991Q;
            switch (i) {
                case AbstractC0795Op.f2698E /* 0 */:
                    break;
                case 1:
                    f2 = abstractC0251En2.f897u;
                    f3 = abstractC0251En2.f894o;
                    f4 = f2 + f3;
                    break;
                case 2:
                    f2 = abstractC0251En2.f897u;
                    f3 = abstractC0251En2.f889W;
                    f4 = f2 + f3;
                    break;
                default:
                    f4 = abstractC0251En2.f897u;
                    break;
            }
            this.f1821v = f4;
            this.f1822z = true;
        }
        float f5 = this.f1820h;
        float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f1821v - f5)) + f5);
        C2281qz c2281qz2 = abstractC0251En.f892h;
        if (c2281qz2 != null) {
            c2281qz2.m3935S(animatedFraction);
        }
    }
}
