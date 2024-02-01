package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: a.Qg */
/* loaded from: classes.dex */
public final class C0887Qg extends AnimatorListenerAdapter {

    /* renamed from: h */
    public final /* synthetic */ AbstractC0081BY f3050h;

    /* renamed from: z */
    public boolean f3051z;

    public C0887Qg(AbstractC0081BY abstractC0081BY) {
        this.f3050h = abstractC0081BY;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3051z = true;
        this.f3050h.mo180P();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC0081BY abstractC0081BY = this.f3050h;
        abstractC0081BY.mo179N();
        if (this.f3051z) {
            return;
        }
        abstractC0081BY.mo185u();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3050h.mo181Q(animator);
        this.f3051z = false;
    }
}
