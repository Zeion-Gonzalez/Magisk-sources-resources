package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: a.XR */
/* loaded from: classes.dex */
public final class C1254XR extends AnimatorListenerAdapter {

    /* renamed from: N */
    public final /* synthetic */ ViewPropertyAnimator f4065N;

    /* renamed from: P */
    public final /* synthetic */ int f4066P;

    /* renamed from: Q */
    public final /* synthetic */ C1192WI f4067Q;

    /* renamed from: h */
    public final /* synthetic */ int f4068h;

    /* renamed from: v */
    public final /* synthetic */ View f4069v;

    /* renamed from: z */
    public final /* synthetic */ AbstractC0249El f4070z;

    public C1254XR(C1192WI c1192wi, AbstractC0249El abstractC0249El, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4067Q = c1192wi;
        this.f4070z = abstractC0249El;
        this.f4068h = i;
        this.f4069v = view;
        this.f4066P = i2;
        this.f4065N = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f4068h;
        View view = this.f4069v;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f4066P != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4065N.setListener(null);
        C1192WI c1192wi = this.f4067Q;
        AbstractC0249El abstractC0249El = this.f4070z;
        c1192wi.m4679v(abstractC0249El);
        c1192wi.f3872I.remove(abstractC0249El);
        c1192wi.m2463Q();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4067Q.getClass();
    }
}
