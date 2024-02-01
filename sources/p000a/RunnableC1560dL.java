package p000a;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: a.dL */
/* loaded from: classes.dex */
public final class RunnableC1560dL extends AnimationSet implements Runnable {

    /* renamed from: I */
    public boolean f4818I;

    /* renamed from: R */
    public final View f4819R;

    /* renamed from: S */
    public final ViewGroup f4820S;

    /* renamed from: q */
    public boolean f4821q;

    /* renamed from: w */
    public boolean f4822w;

    public RunnableC1560dL(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f4821q = true;
        this.f4820S = viewGroup;
        this.f4819R = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f4821q = true;
        if (this.f4822w) {
            return !this.f4818I;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f4822w = true;
            ViewTreeObserverOnPreDrawListenerC0755O7.m1727z(this.f4820S, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f4822w;
        ViewGroup viewGroup = this.f4820S;
        if (z || !this.f4821q) {
            viewGroup.endViewTransition(this.f4819R);
            this.f4818I = true;
        } else {
            this.f4821q = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f4821q = true;
        if (this.f4822w) {
            return !this.f4818I;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f4822w = true;
            ViewTreeObserverOnPreDrawListenerC0755O7.m1727z(this.f4820S, this);
        }
        return true;
    }
}
