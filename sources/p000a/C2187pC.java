package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: a.pC */
/* loaded from: classes.dex */
public final class C2187pC extends AnimatorListenerAdapter {

    /* renamed from: N */
    public final /* synthetic */ C1192WI f6693N;

    /* renamed from: P */
    public final /* synthetic */ ViewPropertyAnimator f6694P;

    /* renamed from: h */
    public final /* synthetic */ AbstractC0249El f6695h;

    /* renamed from: v */
    public final /* synthetic */ View f6696v;

    /* renamed from: z */
    public final /* synthetic */ int f6697z = 1;

    public C2187pC(C1192WI c1192wi, AbstractC0249El abstractC0249El, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f6693N = c1192wi;
        this.f6695h = abstractC0249El;
        this.f6696v = view;
        this.f6694P = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f6697z) {
            case 1:
                this.f6696v.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f6697z;
        AbstractC0249El abstractC0249El = this.f6695h;
        C1192WI c1192wi = this.f6693N;
        ViewPropertyAnimator viewPropertyAnimator = this.f6694P;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                viewPropertyAnimator.setListener(null);
                this.f6696v.setAlpha(1.0f);
                c1192wi.m4679v(abstractC0249El);
                c1192wi.f3880q.remove(abstractC0249El);
                c1192wi.m2463Q();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                c1192wi.m4679v(abstractC0249El);
                c1192wi.f3881w.remove(abstractC0249El);
                c1192wi.m2463Q();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f6697z;
        C1192WI c1192wi = this.f6693N;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                c1192wi.getClass();
                return;
            default:
                c1192wi.getClass();
                return;
        }
    }

    public C2187pC(C1192WI c1192wi, AbstractC0249El abstractC0249El, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f6693N = c1192wi;
        this.f6695h = abstractC0249El;
        this.f6694P = viewPropertyAnimator;
        this.f6696v = view;
    }
}
