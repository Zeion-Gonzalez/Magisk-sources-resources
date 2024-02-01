package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: a.W8 */
/* loaded from: classes.dex */
public final class C1183W8 extends AnimatorListenerAdapter {

    /* renamed from: h */
    public final /* synthetic */ View f3862h;

    /* renamed from: z */
    public final /* synthetic */ boolean f3863z;

    public C1183W8(boolean z, View view) {
        this.f3863z = z;
        this.f3862h = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f3863z) {
            return;
        }
        this.f3862h.setVisibility(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f3863z) {
            this.f3862h.setVisibility(0);
        }
    }
}
