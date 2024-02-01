package p000a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: a.dD */
/* loaded from: classes.dex */
public class MenuC1552dD extends AbstractC0632Lt implements Menu {

    /* renamed from: P */
    public final InterfaceMenuC1563dO f4786P;

    public MenuC1552dD(Context context, InterfaceMenuC1563dO interfaceMenuC1563dO) {
        super(context);
        if (interfaceMenuC1563dO == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f4786P = interfaceMenuC1563dO;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m1414g(((C2189pE) this.f4786P).add(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = ((C2189pE) this.f4786P).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m1414g(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return ((C2189pE) this.f4786P).addSubMenu(i);
    }

    @Override // android.view.Menu
    public final void clear() {
        C2698yx c2698yx = (C2698yx) this.f2045h;
        if (c2698yx != null) {
            c2698yx.clear();
        }
        C2698yx c2698yx2 = (C2698yx) this.f2046v;
        if (c2698yx2 != null) {
            c2698yx2.clear();
        }
        ((C2189pE) this.f4786P).clear();
    }

    @Override // android.view.Menu
    public final void close() {
        ((C2189pE) this.f4786P).m3804v(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m1414g(((C2189pE) this.f4786P).findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m1414g(((C2189pE) this.f4786P).getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return ((C2189pE) this.f4786P).hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((C2189pE) this.f4786P).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return ((C2189pE) this.f4786P).performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((C2189pE) this.f4786P).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((C2698yx) this.f2045h) != null) {
            int i2 = 0;
            while (true) {
                C2698yx c2698yx = (C2698yx) this.f2045h;
                if (i2 >= c2698yx.f8517w) {
                    break;
                }
                if (((InterfaceMenuItemC1409aS) c2698yx.m4626o(i2)).getGroupId() == i) {
                    ((C2698yx) this.f2045h).m4624W(i2);
                    i2--;
                }
                i2++;
            }
        }
        ((C2189pE) this.f4786P).removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((C2698yx) this.f2045h) != null) {
            int i2 = 0;
            while (true) {
                C2698yx c2698yx = (C2698yx) this.f2045h;
                if (i2 >= c2698yx.f8517w) {
                    break;
                }
                if (((InterfaceMenuItemC1409aS) c2698yx.m4626o(i2)).getItemId() == i) {
                    ((C2698yx) this.f2045h).m4624W(i2);
                    break;
                }
                i2++;
            }
        }
        ((C2189pE) this.f4786P).removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ((C2189pE) this.f4786P).setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ((C2189pE) this.f4786P).setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ((C2189pE) this.f4786P).setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f4786P.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return ((C2189pE) this.f4786P).size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m1414g(((C2189pE) this.f4786P).add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return ((C2189pE) this.f4786P).addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m1414g(((C2189pE) this.f4786P).mo2002z(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f4786P.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return ((C2189pE) this.f4786P).addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m1414g(((C2189pE) this.f4786P).mo2002z(0, 0, 0, charSequence));
    }
}
