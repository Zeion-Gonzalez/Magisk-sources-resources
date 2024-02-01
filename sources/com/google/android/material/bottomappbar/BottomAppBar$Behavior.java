package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import p000a.AbstractC2441tz;
import p000a.ViewOnLayoutChangeListenerC1657fA;

/* loaded from: classes.dex */
public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior<Object> {
    public BottomAppBar$Behavior() {
        new ViewOnLayoutChangeListenerC1657fA(0, this);
        new Rect();
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, p000a.AbstractC1131VA
    /* renamed from: I */
    public final boolean mo2313I(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        AbstractC2441tz.m4208y(view);
        throw null;
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, p000a.AbstractC1131VA
    /* renamed from: o */
    public final boolean mo2323o(CoordinatorLayout coordinatorLayout, View view, int i) {
        AbstractC2441tz.m4208y(view);
        throw null;
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new ViewOnLayoutChangeListenerC1657fA(0, this);
        new Rect();
    }
}
