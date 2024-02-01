package p000a;

import android.animation.Animator;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: a.Aw */
/* loaded from: classes.dex */
public final class C0046Aw implements Animator.AnimatorListener {

    /* renamed from: P */
    public final /* synthetic */ View f194P;

    /* renamed from: h */
    public final /* synthetic */ C2716zG f195h;

    /* renamed from: v */
    public final /* synthetic */ View f196v;

    /* renamed from: z */
    public final /* synthetic */ int f197z;

    public /* synthetic */ C0046Aw(C2716zG c2716zG, View view, View view2, int i) {
        this.f197z = i;
        this.f195h = c2716zG;
        this.f196v = view;
        this.f194P = view2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f197z;
        View view = this.f196v;
        boolean z = false;
        C2716zG c2716zG = this.f195h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (c2716zG.f8547v == 0.0f) {
                    z = true;
                }
                if (!z) {
                    ((FloatingActionButton) view).m5063u(true);
                    return;
                }
                return;
            default:
                if (c2716zG.f8547v == 0.0f) {
                    z = true;
                }
                if (z) {
                    view.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f197z;
        View view = this.f194P;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((FloatingActionButton) view).m5058G(true);
                return;
            default:
                view.setVisibility(0);
                return;
        }
    }
}
