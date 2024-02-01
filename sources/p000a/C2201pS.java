package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: a.pS */
/* loaded from: classes.dex */
public final class C2201pS extends AnimatorListenerAdapter {

    /* renamed from: N */
    public final /* synthetic */ C1192WI f6766N;

    /* renamed from: P */
    public final /* synthetic */ View f6767P;

    /* renamed from: h */
    public final /* synthetic */ C1418ae f6768h;

    /* renamed from: v */
    public final /* synthetic */ ViewPropertyAnimator f6769v;

    /* renamed from: z */
    public final /* synthetic */ int f6770z;

    public /* synthetic */ C2201pS(C1192WI c1192wi, C1418ae c1418ae, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f6770z = i;
        this.f6766N = c1192wi;
        this.f6768h = c1418ae;
        this.f6769v = viewPropertyAnimator;
        this.f6767P = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f6770z;
        C1192WI c1192wi = this.f6766N;
        C1418ae c1418ae = this.f6768h;
        View view = this.f6767P;
        ViewPropertyAnimator viewPropertyAnimator = this.f6769v;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                c1192wi.m4679v(c1418ae.f4442z);
                c1192wi.f3878k.remove(c1418ae.f4442z);
                c1192wi.m2463Q();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                c1192wi.m4679v(c1418ae.f4440h);
                c1192wi.f3878k.remove(c1418ae.f4440h);
                c1192wi.m2463Q();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f6770z;
        C1192WI c1192wi = this.f6766N;
        C1418ae c1418ae = this.f6768h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                AbstractC0249El abstractC0249El = c1418ae.f4442z;
                c1192wi.getClass();
                return;
            default:
                AbstractC0249El abstractC0249El2 = c1418ae.f4440h;
                c1192wi.getClass();
                return;
        }
    }
}
