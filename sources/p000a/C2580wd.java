package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: a.wd */
/* loaded from: classes.dex */
public final class C2580wd extends AnimatorListenerAdapter {

    /* renamed from: h */
    public final /* synthetic */ C1624eZ f7899h = null;

    /* renamed from: v */
    public final /* synthetic */ AbstractC0251En f7900v;

    /* renamed from: z */
    public final /* synthetic */ boolean f7901z;

    public C2580wd(AbstractC0251En abstractC0251En, boolean z) {
        this.f7900v = abstractC0251En;
        this.f7901z = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC0251En abstractC0251En = this.f7900v;
        abstractC0251En.f895q = 0;
        abstractC0251En.f881M = null;
        C1624eZ c1624eZ = this.f7899h;
        if (c1624eZ == null) {
            return;
        }
        AbstractC2441tz.m4202q(c1624eZ.f5013R);
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AbstractC0251En abstractC0251En = this.f7900v;
        abstractC0251En.f893k.m3373v(0, this.f7901z);
        abstractC0251En.f895q = 2;
        abstractC0251En.f881M = animator;
    }
}
