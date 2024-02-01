package p000a;

import android.view.MenuItem;

/* renamed from: a.PE */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0818PE implements MenuItem.OnActionExpandListener {

    /* renamed from: h */
    public final /* synthetic */ MenuItemC0324GE f2779h;

    /* renamed from: z */
    public final MenuItem.OnActionExpandListener f2780z;

    public MenuItemOnActionExpandListenerC0818PE(MenuItemC0324GE menuItemC0324GE, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2779h = menuItemC0324GE;
        this.f2780z = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2780z.onMenuItemActionCollapse(this.f2779h.m1414g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2780z.onMenuItemActionExpand(this.f2779h.m1414g(menuItem));
    }
}
