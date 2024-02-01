package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: a.Mw */
/* loaded from: classes.dex */
public final class C0683Mw extends AnimatorListenerAdapter {

    /* renamed from: h */
    public final /* synthetic */ View f2259h;

    /* renamed from: v */
    public final /* synthetic */ View f2260v;

    /* renamed from: z */
    public final /* synthetic */ boolean f2261z;

    public C0683Mw(boolean z, View view, View view2) {
        this.f2261z = z;
        this.f2259h = view;
        this.f2260v = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2261z) {
            return;
        }
        this.f2259h.setVisibility(4);
        View view = this.f2260v;
        view.setAlpha(1.0f);
        view.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f2261z) {
            this.f2259h.setVisibility(0);
            View view = this.f2260v;
            view.setAlpha(0.0f);
            view.setVisibility(4);
        }
    }
}
