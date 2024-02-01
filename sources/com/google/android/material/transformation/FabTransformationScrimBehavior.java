package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p000a.AbstractC0795Op;
import p000a.C1183W8;
import p000a.C1493c6;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: P */
    public final C1493c6 f9559P;

    /* renamed from: v */
    public final C1493c6 f9560v;

    public FabTransformationScrimBehavior() {
        this.f9560v = new C1493c6(75L);
        this.f9559P = new C1493c6(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, p000a.AbstractC1131VA
    /* renamed from: h */
    public final boolean mo2321h(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: k */
    public final boolean mo2322k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: y */
    public final AnimatorSet mo5118y(View view, View view2, boolean z, boolean z2) {
        C1493c6 c1493c6;
        ObjectAnimator ofFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        if (z) {
            c1493c6 = this.f9560v;
        } else {
            c1493c6 = this.f9559P;
        }
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, 0.0f);
        }
        c1493c6.m2893z(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC0795Op.m1855l(animatorSet, arrayList);
        animatorSet.addListener(new C1183W8(z, view2));
        return animatorSet;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9560v = new C1493c6(75L);
        this.f9559P = new C1493c6(0L);
    }
}
