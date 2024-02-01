package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.cardview.CircularRevealCardView;

/* renamed from: a.ev */
/* loaded from: classes.dex */
public final class C1644ev extends AnimatorListenerAdapter {

    /* renamed from: h */
    public final /* synthetic */ Object f5103h;

    /* renamed from: v */
    public final /* synthetic */ Object f5104v;

    /* renamed from: z */
    public final /* synthetic */ int f5105z;

    public /* synthetic */ C1644ev(Object obj, int i, Object obj2) {
        this.f5105z = i;
        this.f5104v = obj;
        this.f5103h = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f5105z;
        Object obj = this.f5103h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((C1186WB) obj).remove(animator);
                ((AbstractC0614LY) this.f5104v).f2004Y.remove(animator);
                return;
            default:
                CircularRevealCardView circularRevealCardView = (CircularRevealCardView) ((InterfaceC1944kb) obj);
                C2716zG m5050v = circularRevealCardView.m5050v();
                m5050v.f8547v = Float.MAX_VALUE;
                circularRevealCardView.m5049P(m5050v);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f5105z) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((AbstractC0614LY) this.f5104v).f2004Y.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
