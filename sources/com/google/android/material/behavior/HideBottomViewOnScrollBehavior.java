package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.topjohnwu.magisk.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000a.AbstractC0795Op;
import p000a.AbstractC1090US;
import p000a.AbstractC1131VA;
import p000a.AbstractC2441tz;
import p000a.C2558wC;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC1131VA {

    /* renamed from: N */
    public TimeInterpolator f9209N;

    /* renamed from: P */
    public TimeInterpolator f9210P;

    /* renamed from: Q */
    public int f9211Q;

    /* renamed from: h */
    public int f9212h;

    /* renamed from: o */
    public ViewPropertyAnimator f9213o;

    /* renamed from: u */
    public int f9214u;

    /* renamed from: v */
    public int f9215v;

    /* renamed from: z */
    public final LinkedHashSet f9216z;

    public HideBottomViewOnScrollBehavior() {
        this.f9216z = new LinkedHashSet();
        this.f9211Q = 0;
        this.f9214u = 2;
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: I */
    public boolean mo2313I(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: V */
    public final void mo2320V(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        boolean z;
        LinkedHashSet linkedHashSet = this.f9216z;
        boolean z2 = true;
        if (i > 0) {
            if (this.f9214u == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ViewPropertyAnimator viewPropertyAnimator = this.f9213o;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f9214u = 1;
                Iterator it = linkedHashSet.iterator();
                if (!it.hasNext()) {
                    m5001g(view, this.f9211Q + 0, this.f9215v, this.f9209N);
                    return;
                } else {
                    AbstractC2441tz.m4202q(it.next());
                    throw null;
                }
            }
            return;
        }
        if (i < 0) {
            if (this.f9214u != 2) {
                z2 = false;
            }
            if (!z2) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.f9213o;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    view.clearAnimation();
                }
                this.f9214u = 2;
                Iterator it2 = linkedHashSet.iterator();
                if (!it2.hasNext()) {
                    m5001g(view, 0, this.f9212h, this.f9210P);
                } else {
                    AbstractC2441tz.m4202q(it2.next());
                    throw null;
                }
            }
        }
    }

    /* renamed from: g */
    public final void m5001g(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.f9213o = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C2558wC(3, this));
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: o */
    public boolean mo2323o(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f9211Q = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f9212h = AbstractC0795Op.m1831U8(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f9215v = AbstractC0795Op.m1831U8(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f9210P = AbstractC0795Op.m1802BO(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1090US.f3561P);
        this.f9209N = AbstractC0795Op.m1802BO(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1090US.f3563v);
        return false;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f9216z = new LinkedHashSet();
        this.f9211Q = 0;
        this.f9214u = 2;
    }
}
