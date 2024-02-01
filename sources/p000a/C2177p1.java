package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: a.p1 */
/* loaded from: classes.dex */
public final class C2177p1 extends AnimatorListenerAdapter {

    /* renamed from: h */
    public final /* synthetic */ AbstractC2691yn f6669h;

    /* renamed from: z */
    public final /* synthetic */ int f6670z;

    public /* synthetic */ C2177p1(AbstractC2691yn abstractC2691yn, int i) {
        this.f6670z = i;
        this.f6669h = abstractC2691yn;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f6670z;
        AbstractC2691yn abstractC2691yn = this.f6669h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                abstractC2691yn.m4594P();
                return;
            default:
                abstractC2691yn.m4594P();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f6670z) {
            case AbstractC0795Op.f2698E /* 0 */:
                AbstractC2691yn abstractC2691yn = this.f6669h;
                InterfaceC1758h1 interfaceC1758h1 = abstractC2691yn.f8392G;
                int i = abstractC2691yn.f8410v;
                int i2 = abstractC2691yn.f8413z;
                int i3 = i - i2;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) interfaceC1758h1;
                snackbarContentLayout.f9429S.setAlpha(0.0f);
                long j = i2;
                ViewPropertyAnimator duration = snackbarContentLayout.f9429S.animate().alpha(1.0f).setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f9430w;
                long j2 = i3;
                duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
                if (snackbarContentLayout.f9428R.getVisibility() == 0) {
                    snackbarContentLayout.f9428R.setAlpha(0.0f);
                    snackbarContentLayout.f9428R.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
