package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.Jf */
/* loaded from: classes.dex */
public final class C0512Jf extends AnimatorListenerAdapter implements InterfaceC2728zV {

    /* renamed from: N */
    public boolean f1698N;

    /* renamed from: h */
    public final int f1701h;

    /* renamed from: v */
    public final ViewGroup f1702v;

    /* renamed from: z */
    public final View f1703z;

    /* renamed from: Q */
    public boolean f1700Q = false;

    /* renamed from: P */
    public final boolean f1699P = true;

    public C0512Jf(View view, int i) {
        this.f1703z = view;
        this.f1701h = i;
        this.f1702v = (ViewGroup) view.getParent();
        m1204Q(true);
    }

    @Override // p000a.InterfaceC2728zV
    /* renamed from: N */
    public final void mo1083N() {
        m1204Q(true);
    }

    @Override // p000a.InterfaceC2728zV
    /* renamed from: P */
    public final void mo231P(AbstractC0614LY abstractC0614LY) {
        if (!this.f1700Q) {
            AbstractC0043At.f188z.mo2169o(this.f1703z, this.f1701h);
            ViewGroup viewGroup = this.f1702v;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m1204Q(false);
        abstractC0614LY.mo1364J(this);
    }

    /* renamed from: Q */
    public final void m1204Q(boolean z) {
        ViewGroup viewGroup;
        if (!this.f1699P || this.f1698N == z || (viewGroup = this.f1702v) == null) {
            return;
        }
        this.f1698N = z;
        AbstractC0795Op.m1877yF(viewGroup, z);
    }

    @Override // p000a.InterfaceC2728zV
    /* renamed from: h */
    public final void mo1084h(AbstractC0614LY abstractC0614LY) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1700Q = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f1700Q) {
            AbstractC0043At.f188z.mo2169o(this.f1703z, this.f1701h);
            ViewGroup viewGroup = this.f1702v;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m1204Q(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (!this.f1700Q) {
            AbstractC0043At.f188z.mo2169o(this.f1703z, this.f1701h);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (!this.f1700Q) {
            AbstractC0043At.f188z.mo2169o(this.f1703z, 0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // p000a.InterfaceC2728zV
    /* renamed from: v */
    public final void mo1085v() {
        m1204Q(false);
    }

    @Override // p000a.InterfaceC2728zV
    /* renamed from: z */
    public final void mo1086z() {
    }
}
