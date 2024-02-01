package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p000a.C2558wC;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: h */
    public AnimatorSet f9552h;

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: g */
    public void mo5117g(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f9552h;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet mo5118y = mo5118y(view, view2, z, z3);
        this.f9552h = mo5118y;
        mo5118y.addListener(new C2558wC(8, this));
        this.f9552h.start();
        if (z2) {
            return;
        }
        this.f9552h.end();
    }

    /* renamed from: y */
    public abstract AnimatorSet mo5118y(View view, View view2, boolean z, boolean z2);
}
