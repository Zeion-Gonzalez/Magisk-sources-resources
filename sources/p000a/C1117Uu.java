package p000a;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* renamed from: a.Uu */
/* loaded from: classes.dex */
public final class C1117Uu implements InterfaceMenuItemC1409aS {

    /* renamed from: G */
    public char f3626G;

    /* renamed from: I */
    public MenuItem.OnMenuItemClickListener f3628I;

    /* renamed from: J */
    public AbstractC0219EA f3629J;

    /* renamed from: N */
    public CharSequence f3631N;

    /* renamed from: P */
    public final int f3632P;

    /* renamed from: Q */
    public CharSequence f3633Q;

    /* renamed from: R */
    public final C2189pE f3634R;

    /* renamed from: V */
    public Drawable f3637V;

    /* renamed from: Y */
    public View f3639Y;

    /* renamed from: c */
    public MenuItem.OnActionExpandListener f3640c;

    /* renamed from: h */
    public final int f3643h;

    /* renamed from: k */
    public CharSequence f3644k;

    /* renamed from: o */
    public char f3645o;

    /* renamed from: q */
    public CharSequence f3646q;

    /* renamed from: r */
    public int f3647r;

    /* renamed from: u */
    public Intent f3649u;

    /* renamed from: v */
    public final int f3650v;

    /* renamed from: w */
    public SubMenuC1188WE f3651w;

    /* renamed from: z */
    public final int f3653z;

    /* renamed from: W */
    public int f3638W = 4096;

    /* renamed from: M */
    public int f3630M = 4096;

    /* renamed from: S */
    public int f3635S = 0;

    /* renamed from: g */
    public ColorStateList f3642g = null;

    /* renamed from: y */
    public PorterDuff.Mode f3652y = null;

    /* renamed from: s */
    public boolean f3648s = false;

    /* renamed from: U */
    public boolean f3636U = false;

    /* renamed from: E */
    public boolean f3625E = false;

    /* renamed from: f */
    public int f3641f = 16;

    /* renamed from: H */
    public boolean f3627H = false;

    public C1117Uu(C2189pE c2189pE, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f3634R = c2189pE;
        this.f3653z = i2;
        this.f3643h = i;
        this.f3650v = i3;
        this.f3632P = i4;
        this.f3631N = charSequence;
        this.f3647r = i5;
    }

    /* renamed from: v */
    public static void m2298v(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: N */
    public final boolean m2299N() {
        AbstractC0219EA abstractC0219EA;
        if ((this.f3647r & 8) == 0) {
            return false;
        }
        if (this.f3639Y == null && (abstractC0219EA = this.f3629J) != null) {
            this.f3639Y = abstractC0219EA.mo387h(this);
        }
        return this.f3639Y != null;
    }

    /* renamed from: P */
    public final Drawable m2300P(Drawable drawable) {
        if (drawable != null && this.f3625E && (this.f3648s || this.f3636U)) {
            drawable = drawable.mutate();
            if (this.f3648s) {
                AbstractC0235ET.m478o(drawable, this.f3642g);
            }
            if (this.f3636U) {
                AbstractC0235ET.m476W(drawable, this.f3652y);
            }
            this.f3625E = false;
        }
        return drawable;
    }

    /* renamed from: Q */
    public final boolean m2301Q() {
        return (this.f3641f & 32) == 32;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f3647r & 8) == 0) {
            return false;
        }
        if (this.f3639Y == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3640c;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3634R.mo2453P(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m2299N()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3640c;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3634R.mo2454Q(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f3639Y;
        if (view != null) {
            return view;
        }
        AbstractC0219EA abstractC0219EA = this.f3629J;
        if (abstractC0219EA == null) {
            return null;
        }
        View mo387h = abstractC0219EA.mo387h(this);
        this.f3639Y = mo387h;
        return mo387h;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3630M;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3626G;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3646q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f3643h;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f3637V;
        if (drawable != null) {
            return m2300P(drawable);
        }
        int i = this.f3635S;
        if (i != 0) {
            Drawable m3431X = AbstractC1843ih.m3431X(this.f3634R.f6724z, i);
            this.f3635S = 0;
            this.f3637V = m3431X;
            return m2300P(m3431X);
        }
        return null;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3642g;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3652y;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3649u;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f3653z;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f3638W;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3645o;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f3650v;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f3651w;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3631N;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3633Q;
        return charSequence != null ? charSequence : this.f3631N;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3644k;
    }

    @Override // p000a.InterfaceMenuItemC1409aS
    /* renamed from: h */
    public final InterfaceMenuItemC1409aS mo2302h(AbstractC0219EA abstractC0219EA) {
        AbstractC0219EA abstractC0219EA2 = this.f3629J;
        if (abstractC0219EA2 != null) {
            abstractC0219EA2.getClass();
        }
        this.f3639Y = null;
        this.f3629J = abstractC0219EA;
        this.f3634R.m3793I(true);
        AbstractC0219EA abstractC0219EA3 = this.f3629J;
        if (abstractC0219EA3 != null) {
            abstractC0219EA3.mo386P(new C2196pM(4, this));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f3651w != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f3627H;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3641f & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3641f & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3641f & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC0219EA abstractC0219EA = this.f3629J;
        return (abstractC0219EA == null || !abstractC0219EA.mo388v()) ? (this.f3641f & 8) == 0 : (this.f3641f & 8) == 0 && this.f3629J.mo389z();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        C2189pE c2189pE = this.f3634R;
        Context context = c2189pE.f6724z;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f3639Y = inflate;
        this.f3629J = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f3653z) > 0) {
            inflate.setId(i2);
        }
        c2189pE.f6704M = true;
        c2189pE.m3793I(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f3626G == c) {
            return this;
        }
        this.f3626G = Character.toLowerCase(c);
        this.f3634R.m3793I(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f3641f;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f3641f = i2;
        if (i != i2) {
            this.f3634R.m3793I(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        boolean z2;
        int i;
        int i2 = this.f3641f;
        int i3 = i2 & 4;
        C2189pE c2189pE = this.f3634R;
        int i4 = 2;
        if (i3 != 0) {
            c2189pE.getClass();
            ArrayList arrayList = c2189pE.f6707Q;
            int size = arrayList.size();
            c2189pE.m3792E();
            for (int i5 = 0; i5 < size; i5++) {
                C1117Uu c1117Uu = (C1117Uu) arrayList.get(i5);
                if (c1117Uu.f3643h == this.f3643h) {
                    boolean z3 = true;
                    if ((c1117Uu.f3641f & 4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && c1117Uu.isCheckable()) {
                        if (c1117Uu != this) {
                            z3 = false;
                        }
                        int i6 = c1117Uu.f3641f;
                        int i7 = i6 & (-3);
                        if (z3) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        int i8 = i | i7;
                        c1117Uu.f3641f = i8;
                        if (i6 != i8) {
                            c1117Uu.f3634R.m3793I(false);
                        }
                    }
                }
            }
            c2189pE.m3794U();
        } else {
            int i9 = i2 & (-3);
            if (!z) {
                i4 = 0;
            }
            int i10 = i4 | i9;
            this.f3641f = i10;
            if (i2 != i10) {
                c2189pE.m3793I(false);
            }
        }
        return this;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final InterfaceMenuItemC1409aS setContentDescription(CharSequence charSequence) {
        this.f3646q = charSequence;
        this.f3634R.m3793I(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f3641f = z ? this.f3641f | 16 : this.f3641f & (-17);
        this.f3634R.m3793I(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f3637V = null;
        this.f3635S = i;
        this.f3625E = true;
        this.f3634R.m3793I(false);
        return this;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3642g = colorStateList;
        this.f3648s = true;
        this.f3625E = true;
        this.f3634R.m3793I(false);
        return this;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3652y = mode;
        this.f3636U = true;
        this.f3625E = true;
        this.f3634R.m3793I(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3649u = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f3645o == c) {
            return this;
        }
        this.f3645o = c;
        this.f3634R.m3793I(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3640c = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3628I = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f3645o = c;
        this.f3626G = Character.toLowerCase(c2);
        this.f3634R.m3793I(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f3647r = i;
        C2189pE c2189pE = this.f3634R;
        c2189pE.f6704M = true;
        c2189pE.m3793I(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f3634R.f6724z.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3633Q = charSequence;
        this.f3634R.m3793I(false);
        return this;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final InterfaceMenuItemC1409aS setTooltipText(CharSequence charSequence) {
        this.f3644k = charSequence;
        this.f3634R.m3793I(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i;
        int i2 = this.f3641f;
        int i3 = i2 & (-9);
        boolean z2 = false;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.f3641f = i4;
        if (i2 != i4) {
            z2 = true;
        }
        if (z2) {
            C2189pE c2189pE = this.f3634R;
            c2189pE.f6717o = true;
            c2189pE.m3793I(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f3631N;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public final void m2303u(boolean z) {
        this.f3641f = z ? this.f3641f | 32 : this.f3641f & (-33);
    }

    @Override // p000a.InterfaceMenuItemC1409aS
    /* renamed from: z */
    public final AbstractC0219EA mo2304z() {
        return this.f3629J;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f3626G == c && this.f3630M == i) {
            return this;
        }
        this.f3626G = Character.toLowerCase(c);
        this.f3630M = KeyEvent.normalizeMetaState(i);
        this.f3634R.m3793I(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3635S = 0;
        this.f3637V = drawable;
        this.f3625E = true;
        this.f3634R.m3793I(false);
        return this;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f3645o == c && this.f3638W == i) {
            return this;
        }
        this.f3645o = c;
        this.f3638W = KeyEvent.normalizeMetaState(i);
        this.f3634R.m3793I(false);
        return this;
    }

    @Override // p000a.InterfaceMenuItemC1409aS, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f3645o = c;
        this.f3638W = KeyEvent.normalizeMetaState(i);
        this.f3626G = Character.toLowerCase(c2);
        this.f3630M = KeyEvent.normalizeMetaState(i2);
        this.f3634R.m3793I(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3631N = charSequence;
        this.f3634R.m3793I(false);
        SubMenuC1188WE subMenuC1188WE = this.f3651w;
        if (subMenuC1188WE != null) {
            subMenuC1188WE.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f3639Y = view;
        this.f3629J = null;
        if (view != null && view.getId() == -1 && (i = this.f3653z) > 0) {
            view.setId(i);
        }
        C2189pE c2189pE = this.f3634R;
        c2189pE.f6704M = true;
        c2189pE.m3793I(true);
        return this;
    }
}
