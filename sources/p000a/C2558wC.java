package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.circularreveal.cardview.CircularRevealCardView;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.util.ArrayList;

/* renamed from: a.wC */
/* loaded from: classes.dex */
public final class C2558wC extends AnimatorListenerAdapter {

    /* renamed from: h */
    public final /* synthetic */ Object f7812h;

    /* renamed from: z */
    public final /* synthetic */ int f7813z;

    public /* synthetic */ C2558wC(int i, Object obj) {
        this.f7813z = i;
        this.f7812h = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f7813z) {
            case AbstractC0795Op.f2698E /* 0 */:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f7812h;
                actionBarOverlayLayout.f8746i = null;
                actionBarOverlayLayout.f8731E = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f7813z;
        Object obj = this.f7812h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f8746i = null;
                actionBarOverlayLayout.f8731E = false;
                return;
            case 1:
                ((AbstractC0614LY) obj).m1363I();
                animator.removeListener(this);
                return;
            case 2:
                C1152VY c1152vy = (C1152VY) obj;
                ArrayList arrayList = new ArrayList(c1152vy.f3742q);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((C0167DF) arrayList.get(i2)).f525h.f6330J;
                    if (colorStateList != null) {
                        AbstractC0235ET.m478o(c1152vy, colorStateList);
                    }
                }
                return;
            case 3:
                ((HideBottomViewOnScrollBehavior) obj).f9213o = null;
                return;
            case 4:
            default:
                super.onAnimationEnd(animator);
                return;
            case 5:
                ((CircularRevealCardView) ((InterfaceC1944kb) obj)).f9334f.getClass();
                return;
            case 6:
                C0525Ju c0525Ju = (C0525Ju) obj;
                if (((ValueAnimator) c0525Ju.f1766v) == animator) {
                    c0525Ju.f1766v = null;
                    return;
                }
                return;
            case 7:
                C1132VC c1132vc = (C1132VC) obj;
                c1132vc.m1477q();
                c1132vc.f3690k.start();
                return;
            case 8:
                ((ExpandableTransformationBehavior) obj).f9552h = null;
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f7813z;
        Object obj = this.f7812h;
        switch (i) {
            case 2:
                C1152VY c1152vy = (C1152VY) obj;
                ArrayList arrayList = new ArrayList(c1152vy.f3742q);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C2032mF c2032mF = ((C0167DF) arrayList.get(i2)).f525h;
                    ColorStateList colorStateList = c2032mF.f6330J;
                    if (colorStateList != null) {
                        AbstractC0235ET.m479u(c1152vy, colorStateList.getColorForState(c2032mF.f6328F, colorStateList.getDefaultColor()));
                    }
                }
                return;
            case 3:
            default:
                super.onAnimationStart(animator);
                return;
            case 4:
                AbstractC2441tz.m4202q(obj);
                throw null;
            case 5:
                ((CircularRevealCardView) ((InterfaceC1944kb) obj)).f9334f.getClass();
                return;
        }
    }
}
