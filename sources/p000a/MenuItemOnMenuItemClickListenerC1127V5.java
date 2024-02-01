package p000a;

import android.view.MenuItem;

/* renamed from: a.V5 */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC1127V5 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: h */
    public final /* synthetic */ MenuItemC0324GE f3677h;

    /* renamed from: z */
    public final MenuItem.OnMenuItemClickListener f3678z;

    public MenuItemOnMenuItemClickListenerC1127V5(MenuItemC0324GE menuItemC0324GE, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3677h = menuItemC0324GE;
        this.f3678z = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f3678z.onMenuItemClick(this.f3677h.m1414g(menuItem));
    }
}
