package p000a;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: a.kr */
/* loaded from: classes.dex */
public final class C1959kr implements InterfaceMenuItemC1409aS {

    /* renamed from: G */
    public CharSequence f6067G;

    /* renamed from: M */
    public CharSequence f6069M;

    /* renamed from: P */
    public char f6071P;

    /* renamed from: Q */
    public char f6072Q;

    /* renamed from: W */
    public final Context f6076W;

    /* renamed from: h */
    public CharSequence f6077h;

    /* renamed from: o */
    public Drawable f6078o;

    /* renamed from: v */
    public Intent f6080v;

    /* renamed from: z */
    public CharSequence f6082z;

    /* renamed from: N */
    public int f6070N = 4096;

    /* renamed from: u */
    public int f6079u = 4096;

    /* renamed from: V */
    public ColorStateList f6075V = null;

    /* renamed from: S */
    public PorterDuff.Mode f6074S = null;

    /* renamed from: R */
    public boolean f6073R = false;

    /* renamed from: w */
    public boolean f6081w = false;

    /* renamed from: I */
    public int f6068I = 16;

    public C1959kr(Context context, CharSequence charSequence) {
        this.f6076W = context;
        this.f6082z = charSequence;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f6079u;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f6072Q;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f6067G;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f6078o;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f6075V;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f6074S;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f6080v;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f6070N;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f6071P;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f6082z;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f6077h;
        return charSequence != null ? charSequence : this.f6082z;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f6069M;
    }

    @Override // p000a.InterfaceMenuItemC1409aS
    /* renamed from: h */
    public final InterfaceMenuItemC1409aS mo2302h(AbstractC0219EA abstractC0219EA) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f6068I & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f6068I & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f6068I & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f6068I & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f6072Q = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f6068I = (z ? 1 : 0) | (this.f6068I & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f6068I = (z ? 2 : 0) | (this.f6068I & (-3));
        return this;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final InterfaceMenuItemC1409aS setContentDescription(CharSequence charSequence) {
        this.f6067G = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f6068I = (z ? 16 : 0) | (this.f6068I & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        Object obj = AbstractC0865QC.f2950z;
        this.f6078o = AbstractC1470bd.m2878h(this.f6076W, i);
        m3582v();
        return this;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f6075V = colorStateList;
        this.f6073R = true;
        m3582v();
        return this;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f6074S = mode;
        this.f6081w = true;
        m3582v();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f6080v = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f6071P = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f6071P = c;
        this.f6072Q = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f6082z = this.f6076W.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f6077h = charSequence;
        return this;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final InterfaceMenuItemC1409aS setTooltipText(CharSequence charSequence) {
        this.f6069M = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f6068I = (this.f6068I & 8) | (z ? 0 : 8);
        return this;
    }

    /* renamed from: v */
    public final void m3582v() {
        Drawable drawable = this.f6078o;
        if (drawable != null) {
            if (this.f6073R || this.f6081w) {
                this.f6078o = drawable;
                Drawable mutate = drawable.mutate();
                this.f6078o = mutate;
                if (this.f6073R) {
                    AbstractC0235ET.m478o(mutate, this.f6075V);
                }
                if (this.f6081w) {
                    AbstractC0235ET.m476W(this.f6078o, this.f6074S);
                }
            }
        }
    }

    @Override // p000a.InterfaceMenuItemC1409aS
    /* renamed from: z */
    public final AbstractC0219EA mo2304z() {
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f6072Q = Character.toLowerCase(c);
        this.f6079u = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f6067G = charSequence;
        return this;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f6071P = c;
        this.f6070N = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f6071P = c;
        this.f6070N = KeyEvent.normalizeMetaState(i);
        this.f6072Q = Character.toLowerCase(c2);
        this.f6079u = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f6082z = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f6069M = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f6078o = drawable;
        m3582v();
        return this;
    }
}
