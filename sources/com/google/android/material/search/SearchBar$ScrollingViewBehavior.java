package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import p000a.AbstractC0438II;

/* loaded from: classes.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* renamed from: u */
    public boolean f9392u;

    public SearchBar$ScrollingViewBehavior() {
        this.f9392u = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, p000a.AbstractC1131VA
    /* renamed from: P */
    public final boolean mo2316P(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.mo2316P(coordinatorLayout, view, view2);
        if (!this.f9392u && (view2 instanceof AppBarLayout)) {
            this.f9392u = true;
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            appBarLayout.setBackgroundColor(0);
            AbstractC0438II.m1043qn(appBarLayout, 0.0f);
        }
        return false;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9392u = false;
    }
}
