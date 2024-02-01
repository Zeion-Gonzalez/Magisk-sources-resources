package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.google.android.material.appbar.z */
/* loaded from: classes.dex */
public final class C2771z implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: h */
    public final /* synthetic */ AppBarLayout f9206h;

    /* renamed from: v */
    public final /* synthetic */ AppBarLayout.BaseBehavior f9207v;

    /* renamed from: z */
    public final /* synthetic */ CoordinatorLayout f9208z;

    public C2771z(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f9207v = baseBehavior;
        this.f9208z = coordinatorLayout;
        this.f9206h = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f9207v.m4361E(this.f9208z, this.f9206h, intValue);
    }
}
