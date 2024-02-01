package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: a.uG */
/* loaded from: classes.dex */
public final class C2455uG extends AnimatorListenerAdapter {

    /* renamed from: h */
    public final /* synthetic */ C1884jU f7534h;

    /* renamed from: z */
    public final /* synthetic */ int f7535z;

    public /* synthetic */ C2455uG(C1884jU c1884jU, int i) {
        this.f7535z = i;
        this.f7534h = c1884jU;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7535z) {
            case 1:
                this.f7534h.f2150h.m3619o(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7535z) {
            case AbstractC0795Op.f2698E /* 0 */:
                this.f7534h.f2150h.m3619o(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
