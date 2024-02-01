package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import p000a.InterfaceC0491JG;

/* renamed from: com.google.android.material.appbar.v */
/* loaded from: classes.dex */
public final class C2770v implements InterfaceC0491JG {

    /* renamed from: I */
    public final /* synthetic */ int f9201I;

    /* renamed from: R */
    public final /* synthetic */ AppBarLayout f9202R;

    /* renamed from: S */
    public final /* synthetic */ CoordinatorLayout f9203S;

    /* renamed from: q */
    public final /* synthetic */ AppBarLayout.BaseBehavior f9204q;

    /* renamed from: w */
    public final /* synthetic */ View f9205w;

    public C2770v(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.f9204q = baseBehavior;
        this.f9203S = coordinatorLayout;
        this.f9202R = appBarLayout;
        this.f9205w = view;
        this.f9201I = i;
    }

    @Override // p000a.InterfaceC0491JG
    /* renamed from: h */
    public final boolean mo155h(View view) {
        this.f9204q.m4996Y(this.f9203S, this.f9202R, this.f9205w, this.f9201I, new int[]{0, 0});
        return true;
    }
}
