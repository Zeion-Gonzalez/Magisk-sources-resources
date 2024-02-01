package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: a.cM */
/* loaded from: classes.dex */
public final class C1504cM extends AnimatorListenerAdapter {

    /* renamed from: P */
    public final /* synthetic */ AbstractC0251En f4654P;

    /* renamed from: h */
    public final /* synthetic */ boolean f4655h;

    /* renamed from: v */
    public final /* synthetic */ C1624eZ f4656v = null;

    /* renamed from: z */
    public boolean f4657z;

    public C1504cM(AbstractC0251En abstractC0251En, boolean z) {
        this.f4654P = abstractC0251En;
        this.f4655h = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4657z = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        AbstractC0251En abstractC0251En = this.f4654P;
        abstractC0251En.f895q = 0;
        abstractC0251En.f881M = null;
        if (!this.f4657z) {
            boolean z = this.f4655h;
            if (z) {
                i = 8;
            } else {
                i = 4;
            }
            abstractC0251En.f893k.m3373v(i, z);
            C1624eZ c1624eZ = this.f4656v;
            if (c1624eZ != null) {
                AbstractC2441tz.m4202q(c1624eZ.f5013R);
                throw null;
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AbstractC0251En abstractC0251En = this.f4654P;
        abstractC0251En.f893k.m3373v(0, this.f4655h);
        abstractC0251En.f895q = 1;
        abstractC0251En.f881M = animator;
        this.f4657z = false;
    }
}
