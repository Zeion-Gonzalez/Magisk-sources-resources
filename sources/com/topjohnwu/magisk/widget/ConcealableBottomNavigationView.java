package com.topjohnwu.magisk.widget;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.topjohnwu.magisk.R;
import p000a.AbstractC0420Hw;
import p000a.C0427I5;
import p000a.C1945kc;
import p000a.C2576wX;

/* loaded from: classes.dex */
public class ConcealableBottomNavigationView extends AbstractC0420Hw {

    /* renamed from: y */
    public static final int[] f9624y = {R.attr.state_hidden};

    /* renamed from: g */
    public boolean f9625g;

    public ConcealableBottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f9625g) {
            View.mergeDrawableStates(onCreateDrawableState, f9624y);
        }
        return onCreateDrawableState;
    }

    @Override // p000a.AbstractC0420Hw, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", getMeasuredHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(new C1945kc());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "translationY", 0.0f);
        ofFloat2.setDuration(225L);
        ofFloat2.setInterpolator(new C1945kc());
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(f9624y, ofFloat);
        stateListAnimator.addState(new int[0], ofFloat2);
        setStateListAnimator(stateListAnimator);
    }

    @Override // p000a.AbstractC2029mC, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(((C0427I5) parcelable).f8021S);
    }

    @Override // p000a.AbstractC2029mC, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0427I5 c0427i5 = new C0427I5((C2576wX) super.onSaveInstanceState());
        c0427i5.f1405w = this.f9625g;
        return c0427i5;
    }
}
