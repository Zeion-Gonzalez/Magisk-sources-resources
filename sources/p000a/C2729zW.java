package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.circularreveal.cardview.CircularRevealCardView;

/* renamed from: a.zW */
/* loaded from: classes.dex */
public final class C2729zW extends AnimatorListenerAdapter {

    /* renamed from: P */
    public final /* synthetic */ Object f8571P;

    /* renamed from: h */
    public final /* synthetic */ Object f8572h;

    /* renamed from: v */
    public final /* synthetic */ Object f8573v;

    /* renamed from: z */
    public final /* synthetic */ int f8574z;

    public /* synthetic */ C2729zW(int i, Object obj, Object obj2, Object obj3) {
        this.f8574z = i;
        this.f8571P = obj;
        this.f8573v = obj2;
        this.f8572h = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f8574z) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((InterfaceC0579Kq) this.f8573v).mo1309h((View) this.f8572h);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f8574z;
        Object obj = this.f8573v;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((InterfaceC0579Kq) obj).mo1311z();
                return;
            case 1:
                ((C1482bt) obj).f4621z.mo3216P(1.0f);
                C2231q3.m3873N((View) this.f8572h);
                return;
            default:
                C0964S5 c0964s5 = ((CircularRevealCardView) ((InterfaceC1944kb) obj)).f9334f;
                c0964s5.f3275N = null;
                c0964s5.f3277h.invalidate();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f8574z;
        Object obj = this.f8573v;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((InterfaceC0579Kq) obj).mo1310v();
                return;
            case 1:
            default:
                super.onAnimationStart(animator);
                return;
            case 2:
                Drawable drawable = (Drawable) this.f8572h;
                C0964S5 c0964s5 = ((CircularRevealCardView) ((InterfaceC1944kb) obj)).f9334f;
                c0964s5.f3275N = drawable;
                c0964s5.f3277h.invalidate();
                return;
        }
    }
}
