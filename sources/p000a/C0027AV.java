package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: a.AV */
/* loaded from: classes.dex */
public final class C0027AV extends AnimatorListenerAdapter {

    /* renamed from: v */
    public final Object f151v;

    /* renamed from: z */
    public final /* synthetic */ int f152z = 0;

    /* renamed from: h */
    public boolean f150h = false;

    public C0027AV(C0602LH c0602lh) {
        this.f151v = c0602lh;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f152z) {
            case AbstractC0795Op.f2698E /* 0 */:
                this.f150h = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f152z;
        Object obj = this.f151v;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (this.f150h) {
                    this.f150h = false;
                    return;
                }
                C0602LH c0602lh = (C0602LH) obj;
                if (((Float) c0602lh.f1945Y.getAnimatedValue()).floatValue() == 0.0f) {
                    c0602lh.f1935J = 0;
                    c0602lh.m1329u(0);
                    return;
                } else {
                    c0602lh.f1935J = 2;
                    c0602lh.f1948g.invalidate();
                    return;
                }
            default:
                View view = (View) obj;
                AbstractC0043At.f188z.mo2166M(view, 1.0f);
                if (this.f150h) {
                    view.setLayerType(0, null);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f152z) {
            case 1:
                View view = (View) this.f151v;
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                if (AbstractC2397t8.m4126o(view) && view.getLayerType() == 0) {
                    this.f150h = true;
                    view.setLayerType(2, null);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public C0027AV(View view) {
        this.f151v = view;
    }
}
