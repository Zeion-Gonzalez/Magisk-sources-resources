package p000a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: a.xK */
/* loaded from: classes.dex */
public final class C2622xK {

    /* renamed from: E */
    public int f8108E;

    /* renamed from: G */
    public int f8109G;

    /* renamed from: I */
    public char f8111I;

    /* renamed from: J */
    public CharSequence f8112J;

    /* renamed from: M */
    public CharSequence f8113M;

    /* renamed from: R */
    public char f8117R;

    /* renamed from: S */
    public int f8118S;

    /* renamed from: U */
    public int f8119U;

    /* renamed from: V */
    public CharSequence f8120V;

    /* renamed from: W */
    public int f8121W;

    /* renamed from: X */
    public final /* synthetic */ C0290FV f8122X;

    /* renamed from: Y */
    public AbstractC0219EA f8123Y;

    /* renamed from: c */
    public CharSequence f8124c;

    /* renamed from: f */
    public String f8126f;

    /* renamed from: g */
    public boolean f8127g;

    /* renamed from: k */
    public int f8129k;

    /* renamed from: o */
    public boolean f8130o;

    /* renamed from: q */
    public int f8131q;

    /* renamed from: r */
    public String f8132r;

    /* renamed from: s */
    public boolean f8133s;

    /* renamed from: w */
    public int f8136w;

    /* renamed from: y */
    public boolean f8137y;

    /* renamed from: z */
    public final Menu f8138z;

    /* renamed from: H */
    public ColorStateList f8110H = null;

    /* renamed from: e */
    public PorterDuff.Mode f8125e = null;

    /* renamed from: h */
    public int f8128h = 0;

    /* renamed from: v */
    public int f8135v = 0;

    /* renamed from: P */
    public int f8115P = 0;

    /* renamed from: N */
    public int f8114N = 0;

    /* renamed from: Q */
    public boolean f8116Q = true;

    /* renamed from: u */
    public boolean f8134u = true;

    public C2622xK(C0290FV c0290fv, Menu menu) {
        this.f8122X = c0290fv;
        this.f8138z = menu;
    }

    /* renamed from: h */
    public final void m4521h(MenuItem menuItem) {
        boolean z;
        MenuItem enabled = menuItem.setChecked(this.f8127g).setVisible(this.f8137y).setEnabled(this.f8133s);
        boolean z2 = false;
        if (this.f8129k >= 1) {
            z = true;
        } else {
            z = false;
        }
        enabled.setCheckable(z).setTitleCondensed(this.f8120V).setIcon(this.f8118S);
        int i = this.f8119U;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f8132r;
        C0290FV c0290fv = this.f8122X;
        if (str != null) {
            if (!c0290fv.f1016v.isRestricted()) {
                if (c0290fv.f1014P == null) {
                    c0290fv.f1014P = C0290FV.m603z(c0290fv.f1016v);
                }
                menuItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC2434tr(this.f8132r, c0290fv.f1014P));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f8129k >= 2) {
            if (menuItem instanceof C1117Uu) {
                C1117Uu c1117Uu = (C1117Uu) menuItem;
                c1117Uu.f3641f = (c1117Uu.f3641f & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC0324GE) {
                MenuItemC0324GE menuItemC0324GE = (MenuItemC0324GE) menuItem;
                try {
                    Method method = menuItemC0324GE.f1101N;
                    InterfaceMenuItemC1409aS interfaceMenuItemC1409aS = menuItemC0324GE.f1102P;
                    if (method == null) {
                        menuItemC0324GE.f1101N = interfaceMenuItemC1409aS.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0324GE.f1101N.invoke(interfaceMenuItemC1409aS, Boolean.TRUE);
                } catch (Exception e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        String str2 = this.f8126f;
        if (str2 != null) {
            menuItem.setActionView((View) m4522z(str2, C0290FV.f1012N, c0290fv.f1017z));
            z2 = true;
        }
        int i2 = this.f8108E;
        if (i2 > 0) {
            if (!z2) {
                menuItem.setActionView(i2);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        AbstractC0219EA abstractC0219EA = this.f8123Y;
        if (abstractC0219EA != null) {
            if (menuItem instanceof InterfaceMenuItemC1409aS) {
                ((InterfaceMenuItemC1409aS) menuItem).mo2302h(abstractC0219EA);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f8112J;
        boolean z3 = menuItem instanceof InterfaceMenuItemC1409aS;
        if (z3) {
            ((InterfaceMenuItemC1409aS) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC2083nE.m3711o(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f8124c;
        if (z3) {
            ((InterfaceMenuItemC1409aS) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC2083nE.m3707S(menuItem, charSequence2);
        }
        char c = this.f8117R;
        int i3 = this.f8136w;
        if (z3) {
            ((InterfaceMenuItemC1409aS) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC2083nE.m3712u(menuItem, c, i3);
        }
        char c2 = this.f8111I;
        int i4 = this.f8131q;
        if (z3) {
            ((InterfaceMenuItemC1409aS) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC2083nE.m3703M(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.f8125e;
        if (mode != null) {
            if (z3) {
                ((InterfaceMenuItemC1409aS) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC2083nE.m3702G(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f8110H;
        if (colorStateList != null) {
            if (z3) {
                ((InterfaceMenuItemC1409aS) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC2083nE.m3709W(menuItem, colorStateList);
            }
        }
    }

    /* renamed from: z */
    public final Object m4522z(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f8122X.f1016v.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }
}
