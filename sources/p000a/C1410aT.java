package p000a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;

/* renamed from: a.aT */
/* loaded from: classes.dex */
public final class C1410aT extends AbstractC0251En {

    /* renamed from: j */
    public StateListAnimator f4426j;

    @Override // p000a.AbstractC0251En
    /* renamed from: G */
    public final void mo535G(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f893k;
        if (floatingActionButton.getStateListAnimator() == this.f4426j) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(AbstractC0251En.f875e, m2828I(f, f3));
            stateListAnimator.addState(AbstractC0251En.f871X, m2828I(f, f2));
            stateListAnimator.addState(AbstractC0251En.f868F, m2828I(f, f2));
            stateListAnimator.addState(AbstractC0251En.f873Z, m2828I(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            if (i <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(AbstractC0251En.f877r);
            stateListAnimator.addState(AbstractC0251En.f867C, animatorSet);
            stateListAnimator.addState(AbstractC0251En.f876p, m2828I(0.0f, 0.0f));
            this.f4426j = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (mo540S()) {
            m547w();
        }
    }

    /* renamed from: I */
    public final AnimatorSet m2828I(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.f893k;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(AbstractC0251En.f877r);
        return animatorSet;
    }

    @Override // p000a.AbstractC0251En
    /* renamed from: N */
    public final float mo537N() {
        return this.f893k.getElevation();
    }

    @Override // p000a.AbstractC0251En
    /* renamed from: Q */
    public final void mo538Q(Rect rect) {
        boolean z;
        if (((FloatingActionButton) this.f891g.f6755R).f9375y) {
            super.mo538Q(rect);
            return;
        }
        boolean z2 = this.f884Q;
        int i = 0;
        FloatingActionButton floatingActionButton = this.f893k;
        if (z2 && floatingActionButton.m5060Q(floatingActionButton.f9365I) < this.f879G) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            i = (this.f879G - floatingActionButton.m5060Q(floatingActionButton.f9365I)) / 2;
        }
        rect.set(i, i, i, i);
    }

    @Override // p000a.AbstractC0251En
    /* renamed from: R */
    public final void mo539R() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // p000a.AbstractC0251En
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo540S() {
        /*
            r4 = this;
            a.pM r0 = r4.f891g
            java.lang.Object r0 = r0.f6755R
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            boolean r0 = r0.f9375y
            r1 = 1
            if (r0 != 0) goto L24
            boolean r0 = r4.f884Q
            r2 = 0
            if (r0 == 0) goto L1f
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r4.f893k
            int r3 = r0.f9365I
            int r0 = r0.m5060Q(r3)
            int r3 = r4.f879G
            if (r0 < r3) goto L1d
            goto L1f
        L1d:
            r0 = r2
            goto L20
        L1f:
            r0 = r1
        L20:
            if (r0 != 0) goto L23
            goto L24
        L23:
            r1 = r2
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1410aT.mo540S():boolean");
    }

    @Override // p000a.AbstractC0251En
    /* renamed from: W */
    public final void mo542W(int[] iArr) {
    }

    @Override // p000a.AbstractC0251En
    /* renamed from: o */
    public final void mo544o() {
    }

    /* renamed from: q */
    public final C2281qz m2829q() {
        C0099Bw c0099Bw = this.f901z;
        c0099Bw.getClass();
        return new C0951Rs(c0099Bw);
    }

    @Override // p000a.AbstractC0251En
    /* renamed from: u */
    public final void mo545u(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        C2281qz m2829q = m2829q();
        this.f892h = m2829q;
        m2829q.setTintList(colorStateList);
        if (mode != null) {
            this.f892h.setTintMode(mode);
        }
        C2281qz c2281qz = this.f892h;
        FloatingActionButton floatingActionButton = this.f893k;
        c2281qz.m3930M(floatingActionButton.getContext());
        if (i > 0) {
            Context context = floatingActionButton.getContext();
            C0099Bw c0099Bw = this.f901z;
            c0099Bw.getClass();
            C2251qP c2251qP = new C2251qP(c0099Bw);
            Object obj = AbstractC0865QC.f2950z;
            int m2772z = AbstractC1375Zj.m2772z(context, R.color.design_fab_stroke_top_outer_color);
            int m2772z2 = AbstractC1375Zj.m2772z(context, R.color.design_fab_stroke_top_inner_color);
            int m2772z3 = AbstractC1375Zj.m2772z(context, R.color.design_fab_stroke_end_inner_color);
            int m2772z4 = AbstractC1375Zj.m2772z(context, R.color.design_fab_stroke_end_outer_color);
            c2251qP.f6929W = m2772z;
            c2251qP.f6920G = m2772z2;
            c2251qP.f6922M = m2772z3;
            c2251qP.f6928V = m2772z4;
            float f = i;
            if (c2251qP.f6931o != f) {
                c2251qP.f6931o = f;
                c2251qP.f6930h.setStrokeWidth(f * 1.3333f);
                c2251qP.f6926R = true;
                c2251qP.invalidateSelf();
            }
            if (colorStateList != null) {
                c2251qP.f6927S = colorStateList.getColorForState(c2251qP.getState(), c2251qP.f6927S);
            }
            c2251qP.f6921I = colorStateList;
            c2251qP.f6926R = true;
            c2251qP.invalidateSelf();
            this.f883P = c2251qP;
            C2251qP c2251qP2 = this.f883P;
            c2251qP2.getClass();
            C2281qz c2281qz2 = this.f892h;
            c2281qz2.getClass();
            drawable = new LayerDrawable(new Drawable[]{c2251qP2, c2281qz2});
        } else {
            this.f883P = null;
            drawable = this.f892h;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC0567Ke.m1282h(colorStateList2), drawable, null);
        this.f898v = rippleDrawable;
        this.f882N = rippleDrawable;
    }
}
