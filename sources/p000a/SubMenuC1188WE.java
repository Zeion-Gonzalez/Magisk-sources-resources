package p000a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: a.WE */
/* loaded from: classes.dex */
public final class SubMenuC1188WE extends C2189pE implements SubMenu {

    /* renamed from: J */
    public final C1117Uu f3866J;

    /* renamed from: Y */
    public final C2189pE f3867Y;

    public SubMenuC1188WE(Context context, C2189pE c2189pE, C1117Uu c1117Uu) {
        super(context);
        this.f3867Y = c2189pE;
        this.f3866J = c1117Uu;
    }

    @Override // p000a.C2189pE
    /* renamed from: G */
    public final String mo2450G() {
        int i;
        C1117Uu c1117Uu = this.f3866J;
        if (c1117Uu != null) {
            i = c1117Uu.f3653z;
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return AbstractC2441tz.m4188N("android:menu:actionviewstates:", i);
    }

    @Override // p000a.C2189pE
    /* renamed from: M */
    public final C2189pE mo2451M() {
        return this.f3867Y.mo2451M();
    }

    @Override // p000a.C2189pE
    /* renamed from: N */
    public final boolean mo2452N(C2189pE c2189pE, MenuItem menuItem) {
        return super.mo2452N(c2189pE, menuItem) || this.f3867Y.mo2452N(c2189pE, menuItem);
    }

    @Override // p000a.C2189pE
    /* renamed from: P */
    public final boolean mo2453P(C1117Uu c1117Uu) {
        return this.f3867Y.mo2453P(c1117Uu);
    }

    @Override // p000a.C2189pE
    /* renamed from: Q */
    public final boolean mo2454Q(C1117Uu c1117Uu) {
        return this.f3867Y.mo2454Q(c1117Uu);
    }

    @Override // p000a.C2189pE
    /* renamed from: R */
    public final boolean mo2455R() {
        return this.f3867Y.mo2455R();
    }

    @Override // p000a.C2189pE
    /* renamed from: S */
    public final boolean mo2456S() {
        return this.f3867Y.mo2456S();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f3866J;
    }

    @Override // p000a.C2189pE, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f3867Y.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m3802s(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m3802s(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m3802s(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f3866J.setIcon(i);
        return this;
    }

    @Override // p000a.C2189pE, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f3867Y.setQwertyMode(z);
    }

    @Override // p000a.C2189pE
    /* renamed from: w */
    public final boolean mo2457w() {
        return this.f3867Y.mo2457w();
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m3802s(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m3802s(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f3866J.setIcon(drawable);
        return this;
    }
}
