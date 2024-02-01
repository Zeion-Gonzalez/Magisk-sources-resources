package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: a.bM */
/* loaded from: classes.dex */
public final class C1457bM extends AnimatorListenerAdapter {

    /* renamed from: h */
    public final /* synthetic */ AbstractC2691yn f4545h;

    /* renamed from: z */
    public final /* synthetic */ int f4546z;

    public /* synthetic */ C1457bM(AbstractC2691yn abstractC2691yn, int i, int i2) {
        this.f4546z = i2;
        this.f4545h = abstractC2691yn;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f4546z;
        AbstractC2691yn abstractC2691yn = this.f4545h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                abstractC2691yn.m4597v();
                return;
            default:
                abstractC2691yn.m4597v();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f4546z) {
            case 1:
                AbstractC2691yn abstractC2691yn = this.f4545h;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) abstractC2691yn.f8392G;
                snackbarContentLayout.f9429S.setAlpha(1.0f);
                ViewPropertyAnimator alpha = snackbarContentLayout.f9429S.animate().alpha(0.0f);
                long j = abstractC2691yn.f8404h;
                ViewPropertyAnimator duration = alpha.setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f9430w;
                long j2 = 0;
                duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
                if (snackbarContentLayout.f9428R.getVisibility() == 0) {
                    snackbarContentLayout.f9428R.setAlpha(1.0f);
                    snackbarContentLayout.f9428R.animate().alpha(0.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
