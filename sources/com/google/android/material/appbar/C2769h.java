package com.google.android.material.appbar;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import com.google.android.material.appbar.AppBarLayout;
import p000a.C1555dG;
import p000a.C1799hs;

/* renamed from: com.google.android.material.appbar.h */
/* loaded from: classes.dex */
public final class C2769h extends C1555dG {

    /* renamed from: P */
    public final /* synthetic */ AppBarLayout.BaseBehavior f9200P;

    public C2769h(AppBarLayout.BaseBehavior baseBehavior) {
        this.f9200P = baseBehavior;
    }

    @Override // p000a.C1555dG
    /* renamed from: P */
    public final void mo373P(View view, C1799hs c1799hs) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4810z;
        AccessibilityNodeInfo accessibilityNodeInfo = c1799hs.f5654z;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setScrollable(this.f9200P.f9186w);
        c1799hs.m3349W(ScrollView.class.getName());
    }
}
