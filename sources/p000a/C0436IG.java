package p000a;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.topjohnwu.magisk.R;

/* renamed from: a.IG */
/* loaded from: classes.dex */
public final class C0436IG extends AbstractC0081BY {

    /* renamed from: o */
    public final /* synthetic */ ExtendedFloatingActionButton f1425o;

    /* renamed from: u */
    public boolean f1426u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0436IG(ExtendedFloatingActionButton extendedFloatingActionButton, C2196pM c2196pM) {
        super(extendedFloatingActionButton, c2196pM);
        this.f1425o = extendedFloatingActionButton;
    }

    @Override // p000a.AbstractC0081BY
    /* renamed from: N */
    public final void mo179N() {
        this.f315P.f6755R = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f1425o;
        extendedFloatingActionButton.f9358p = 0;
        if (!this.f1426u) {
            extendedFloatingActionButton.setVisibility(8);
        }
    }

    @Override // p000a.AbstractC0081BY
    /* renamed from: P */
    public final void mo180P() {
        super.mo180P();
        this.f1426u = true;
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
        this.f1426u = false;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f1425o;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.f9358p = 1;
    }

    @Override // p000a.AbstractC0081BY
    /* renamed from: W */
    public final boolean mo182W() {
        C0414Hq c0414Hq = ExtendedFloatingActionButton.f9345l;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f1425o;
        int visibility = extendedFloatingActionButton.getVisibility();
        int i = extendedFloatingActionButton.f9358p;
        if (visibility == 0) {
            if (i == 1) {
                return true;
            }
        } else if (i != 2) {
            return true;
        }
        return false;
    }

    @Override // p000a.AbstractC0081BY
    /* renamed from: o */
    public final void mo184o() {
        this.f1425o.setVisibility(8);
    }

    @Override // p000a.AbstractC0081BY
    /* renamed from: u */
    public final void mo185u() {
    }

    @Override // p000a.AbstractC0081BY
    /* renamed from: v */
    public final int mo186v() {
        return R.animator.mtrl_extended_fab_hide_motion_spec;
    }
}
