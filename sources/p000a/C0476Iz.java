package p000a;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.topjohnwu.magisk.R;

/* renamed from: a.Iz */
/* loaded from: classes.dex */
public final class C0476Iz extends AbstractC0081BY {

    /* renamed from: u */
    public final /* synthetic */ ExtendedFloatingActionButton f1588u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0476Iz(ExtendedFloatingActionButton extendedFloatingActionButton, C2196pM c2196pM) {
        super(extendedFloatingActionButton, c2196pM);
        this.f1588u = extendedFloatingActionButton;
    }

    @Override // p000a.AbstractC0081BY
    /* renamed from: N */
    public final void mo179N() {
        this.f315P.f6755R = null;
        this.f1588u.f9358p = 0;
    }

    @Override // p000a.AbstractC0081BY
    /* renamed from: Q */
    public final void mo181Q(Animator animator) {
        C2196pM c2196pM = this.f315P;
        Animator animator2 = (Animator) c2196pM.f6755R;
        if (animator2 != null) {
            animator2.cancel();
        }
        c2196pM.f6755R = animator;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f1588u;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.f9358p = 2;
    }

    @Override // p000a.AbstractC0081BY
    /* renamed from: W */
    public final boolean mo182W() {
        C0414Hq c0414Hq = ExtendedFloatingActionButton.f9345l;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f1588u;
        int visibility = extendedFloatingActionButton.getVisibility();
        int i = extendedFloatingActionButton.f9358p;
        if (visibility != 0) {
            if (i != 2) {
                return false;
            }
        } else if (i == 1) {
            return false;
        }
        return true;
    }

    @Override // p000a.AbstractC0081BY
    /* renamed from: o */
    public final void mo184o() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f1588u;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.setAlpha(1.0f);
        extendedFloatingActionButton.setScaleY(1.0f);
        extendedFloatingActionButton.setScaleX(1.0f);
    }

    @Override // p000a.AbstractC0081BY
    /* renamed from: u */
    public final void mo185u() {
    }

    @Override // p000a.AbstractC0081BY
    /* renamed from: v */
    public final int mo186v() {
        return R.animator.mtrl_extended_fab_show_motion_spec;
    }
}
