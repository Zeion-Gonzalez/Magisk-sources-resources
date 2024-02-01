package com.google.android.material.appbar;

import android.view.View;
import java.util.WeakHashMap;
import p000a.AbstractC1285Y3;
import p000a.AbstractC2446u3;
import p000a.InterfaceC0491JG;

/* renamed from: com.google.android.material.appbar.P */
/* loaded from: classes.dex */
public final class C2767P implements InterfaceC0491JG {

    /* renamed from: R */
    public final /* synthetic */ boolean f9193R;

    /* renamed from: S */
    public final /* synthetic */ AppBarLayout f9194S;

    public C2767P(AppBarLayout appBarLayout, boolean z) {
        this.f9194S = appBarLayout;
        this.f9193R = z;
    }

    @Override // p000a.InterfaceC0491JG
    /* renamed from: h */
    public final boolean mo155h(View view) {
        AppBarLayout appBarLayout = this.f9194S;
        appBarLayout.getClass();
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        appBarLayout.m4988W(this.f9193R, AbstractC1285Y3.m2635v(appBarLayout), true);
        return true;
    }
}
