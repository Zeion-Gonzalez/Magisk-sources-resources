package p000a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: a.pE */
/* loaded from: classes.dex */
public class C2189pE implements InterfaceMenuC1563dO {

    /* renamed from: r */
    public static final int[] f6700r = {1, 4, 5, 3, 2, 0};

    /* renamed from: G */
    public final ArrayList f6702G;

    /* renamed from: M */
    public boolean f6704M;

    /* renamed from: N */
    public InterfaceC1811i6 f6705N;

    /* renamed from: P */
    public boolean f6706P;

    /* renamed from: Q */
    public final ArrayList f6707Q;

    /* renamed from: R */
    public Drawable f6708R;

    /* renamed from: S */
    public CharSequence f6709S;

    /* renamed from: U */
    public C1117Uu f6710U;

    /* renamed from: W */
    public final ArrayList f6712W;

    /* renamed from: f */
    public boolean f6713f;

    /* renamed from: h */
    public final Resources f6715h;

    /* renamed from: o */
    public boolean f6717o;

    /* renamed from: u */
    public final ArrayList f6720u;

    /* renamed from: v */
    public boolean f6721v;

    /* renamed from: w */
    public View f6722w;

    /* renamed from: z */
    public final Context f6724z;

    /* renamed from: V */
    public int f6711V = 0;

    /* renamed from: I */
    public boolean f6703I = false;

    /* renamed from: q */
    public boolean f6718q = false;

    /* renamed from: k */
    public boolean f6716k = false;

    /* renamed from: g */
    public boolean f6714g = false;

    /* renamed from: y */
    public final ArrayList f6723y = new ArrayList();

    /* renamed from: s */
    public final CopyOnWriteArrayList f6719s = new CopyOnWriteArrayList();

    /* renamed from: E */
    public boolean f6701E = false;

    public C2189pE(Context context) {
        boolean z;
        boolean z2 = false;
        this.f6724z = context;
        Resources resources = context.getResources();
        this.f6715h = resources;
        this.f6707Q = new ArrayList();
        this.f6720u = new ArrayList();
        this.f6717o = true;
        this.f6712W = new ArrayList();
        this.f6702G = new ArrayList();
        this.f6704M = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC1995lW.f6177z;
            if (Build.VERSION.SDK_INT >= 28) {
                z = AbstractC1427an.m2856h(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        this.f6706P = z2;
    }

    /* renamed from: E */
    public final void m3792E() {
        if (this.f6703I) {
            return;
        }
        this.f6703I = true;
        this.f6718q = false;
        this.f6716k = false;
    }

    /* renamed from: G */
    public String mo2450G() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: I */
    public final void m3793I(boolean z) {
        if (!this.f6703I) {
            if (z) {
                this.f6717o = true;
                this.f6704M = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f6719s;
            if (!copyOnWriteArrayList.isEmpty()) {
                m3792E();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    InterfaceC2687yj interfaceC2687yj = (InterfaceC2687yj) weakReference.get();
                    if (interfaceC2687yj == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        interfaceC2687yj.mo221S(z);
                    }
                }
                m3794U();
                return;
            }
            return;
        }
        this.f6718q = true;
        if (z) {
            this.f6716k = true;
        }
    }

    /* renamed from: M */
    public C2189pE mo2451M() {
        return this;
    }

    /* renamed from: N */
    public boolean mo2452N(C2189pE c2189pE, MenuItem menuItem) {
        InterfaceC1811i6 interfaceC1811i6 = this.f6705N;
        return interfaceC1811i6 != null && interfaceC1811i6.mo81N(c2189pE, menuItem);
    }

    /* renamed from: P */
    public boolean mo2453P(C1117Uu c1117Uu) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6719s;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f6710U == c1117Uu) {
            m3792E();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC2687yj interfaceC2687yj = (InterfaceC2687yj) weakReference.get();
                if (interfaceC2687yj == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = interfaceC2687yj.mo222V(c1117Uu);
                    if (z) {
                        break;
                    }
                }
            }
            m3794U();
            if (z) {
                this.f6710U = null;
            }
        }
        return z;
    }

    /* renamed from: Q */
    public boolean mo2454Q(C1117Uu c1117Uu) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6719s;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m3792E();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC2687yj interfaceC2687yj = (InterfaceC2687yj) weakReference.get();
            if (interfaceC2687yj == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z = interfaceC2687yj.mo220R(c1117Uu);
                if (z) {
                    break;
                }
            }
        }
        m3794U();
        if (z) {
            this.f6710U = c1117Uu;
        }
        return z;
    }

    /* renamed from: R */
    public boolean mo2455R() {
        return this.f6721v;
    }

    /* renamed from: S */
    public boolean mo2456S() {
        return this.f6701E;
    }

    /* renamed from: U */
    public final void m3794U() {
        this.f6703I = false;
        if (this.f6718q) {
            this.f6718q = false;
            m3793I(this.f6716k);
        }
    }

    /* renamed from: V */
    public final ArrayList m3795V() {
        boolean z = this.f6717o;
        ArrayList arrayList = this.f6720u;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f6707Q;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C1117Uu c1117Uu = (C1117Uu) arrayList2.get(i);
            if (c1117Uu.isVisible()) {
                arrayList.add(c1117Uu);
            }
        }
        this.f6717o = false;
        this.f6704M = true;
        return arrayList;
    }

    /* renamed from: W */
    public final void m3796W() {
        ArrayList m3795V = m3795V();
        if (this.f6704M) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f6719s;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC2687yj interfaceC2687yj = (InterfaceC2687yj) weakReference.get();
                if (interfaceC2687yj == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z |= interfaceC2687yj.mo218N();
                }
            }
            ArrayList arrayList = this.f6712W;
            ArrayList arrayList2 = this.f6702G;
            arrayList.clear();
            arrayList2.clear();
            if (z) {
                int size = m3795V.size();
                for (int i = 0; i < size; i++) {
                    C1117Uu c1117Uu = (C1117Uu) m3795V.get(i);
                    if (c1117Uu.m2301Q()) {
                        arrayList.add(c1117Uu);
                    } else {
                        arrayList2.add(c1117Uu);
                    }
                }
            } else {
                arrayList2.addAll(m3795V());
            }
            this.f6704M = false;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return mo2002z(0, 0, 0, this.f6715h.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f6724z.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C1117Uu mo2002z = mo2002z(i, i2, i3, resolveInfo.loadLabel(packageManager));
            mo2002z.setIcon(resolveInfo.loadIcon(packageManager));
            mo2002z.f3649u = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = mo2002z;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f6715h.getString(i));
    }

    @Override // android.view.Menu
    public final void clear() {
        C1117Uu c1117Uu = this.f6710U;
        if (c1117Uu != null) {
            mo2453P(c1117Uu);
        }
        this.f6707Q.clear();
        m3793I(true);
    }

    public final void clearHeader() {
        this.f6708R = null;
        this.f6709S = null;
        this.f6722w = null;
        m3793I(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m3804v(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C1117Uu c1117Uu = (C1117Uu) this.f6707Q.get(i2);
            if (c1117Uu.f3653z == i) {
                return c1117Uu;
            }
            if (c1117Uu.hasSubMenu() && (findItem = c1117Uu.f3651w.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final void m3797g(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo2450G());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1188WE) item.getSubMenu()).m3797g(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f6707Q.get(i);
    }

    /* renamed from: h */
    public final void m3798h(InterfaceC2687yj interfaceC2687yj, Context context) {
        this.f6719s.add(new WeakReference(interfaceC2687yj));
        interfaceC2687yj.mo217G(context, this);
        this.f6704M = true;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f6713f) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C1117Uu) this.f6707Q.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m3803u(i, keyEvent) != null;
    }

    /* renamed from: k */
    public final void m3799k(InterfaceC2687yj interfaceC2687yj) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6719s;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC2687yj interfaceC2687yj2 = (InterfaceC2687yj) weakReference.get();
            if (interfaceC2687yj2 == null || interfaceC2687yj2 == interfaceC2687yj) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    /* renamed from: o */
    public final void m3800o(ArrayList arrayList, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean z;
        boolean mo2455R = mo2455R();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i != 67) {
            return;
        }
        ArrayList arrayList2 = this.f6707Q;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1117Uu c1117Uu = (C1117Uu) arrayList2.get(i3);
            if (c1117Uu.hasSubMenu()) {
                c1117Uu.f3651w.m3800o(arrayList, i, keyEvent);
            }
            if (mo2455R) {
                c = c1117Uu.f3626G;
            } else {
                c = c1117Uu.f3645o;
            }
            if (mo2455R) {
                i2 = c1117Uu.f3630M;
            } else {
                i2 = c1117Uu.f3638W;
            }
            if ((modifiers & 69647) == (i2 & 69647)) {
                z = true;
            } else {
                z = false;
            }
            if (z && c != 0) {
                char[] cArr = keyData.meta;
                if (c != cArr[0] && c != cArr[2]) {
                    if (mo2455R && c == '\b') {
                        if (i != 67) {
                        }
                    }
                }
                if (c1117Uu.isEnabled()) {
                    arrayList.add(c1117Uu);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m3801q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C1117Uu m3803u = m3803u(i, keyEvent);
        if (m3803u != null) {
            z = m3801q(m3803u, null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            m3804v(true);
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x005d, code lost:
    
        if (r1 != false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x006c, code lost:
    
        if ((r9 & 1) == 0) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x00cb, code lost:
    
        if (r1 == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x00cd, code lost:
    
        m3804v(true);
     */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0061  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m3801q(android.view.MenuItem r7, p000a.InterfaceC2687yj r8, int r9) {
        /*
            r6 = this;
            a.Uu r7 = (p000a.C1117Uu) r7
            r0 = 0
            if (r7 == 0) goto Ld1
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld1
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f3628I
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L40
        L19:
            a.pE r1 = r7.f3634R
            boolean r3 = r1.mo2452N(r1, r7)
            if (r3 == 0) goto L22
            goto L40
        L22:
            android.content.Intent r3 = r7.f3649u
            if (r3 == 0) goto L34
            android.content.Context r1 = r1.f6724z     // Catch: android.content.ActivityNotFoundException -> L2c
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2c
            goto L40
        L2c:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L34:
            a.EA r1 = r7.f3629J
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f692z
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
        L40:
            r1 = r2
            goto L43
        L42:
            r1 = r0
        L43:
            a.EA r3 = r7.f3629J
            if (r3 == 0) goto L51
            android.view.ActionProvider r4 = r3.f692z
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.m2299N()
            if (r5 == 0) goto L61
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld0
            goto Lcd
        L61:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L6f
            if (r4 == 0) goto L6a
            goto L6f
        L6a:
            r7 = r9 & 1
            if (r7 != 0) goto Ld0
            goto Lcd
        L6f:
            r9 = r9 & 4
            if (r9 != 0) goto L76
            r6.m3804v(r0)
        L76:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L8a
            a.WE r9 = new a.WE
            android.content.Context r5 = r6.f6724z
            r9.<init>(r5, r6, r7)
            r7.f3651w = r9
            java.lang.CharSequence r5 = r7.f3631N
            r9.setHeaderTitle(r5)
        L8a:
            a.WE r7 = r7.f3651w
            if (r4 == 0) goto L98
            a.GE r9 = r3.f691h
            r9.getClass()
            android.view.ActionProvider r9 = r3.f692z
            r9.onPrepareSubMenu(r7)
        L98:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f6719s
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto La1
            goto Lca
        La1:
            if (r8 == 0) goto La7
            boolean r0 = r8.mo219P(r7)
        La7:
            java.util.Iterator r8 = r9.iterator()
        Lab:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lca
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            a.yj r4 = (p000a.InterfaceC2687yj) r4
            if (r4 != 0) goto Lc3
            r9.remove(r3)
            goto Lab
        Lc3:
            if (r0 != 0) goto Lab
            boolean r0 = r4.mo219P(r7)
            goto Lab
        Lca:
            r1 = r1 | r0
            if (r1 != 0) goto Ld0
        Lcd:
            r6.m3804v(r2)
        Ld0:
            return r1
        Ld1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2189pE.m3801q(android.view.MenuItem, a.yj, int):boolean");
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList;
        int size = size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            arrayList = this.f6707Q;
            if (i3 < size) {
                if (((C1117Uu) arrayList.get(i3)).f3643h == i) {
                    break;
                } else {
                    i3++;
                }
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C1117Uu) arrayList.get(i3)).f3643h != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            m3793I(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList;
        int size = size();
        int i2 = 0;
        while (true) {
            arrayList = this.f6707Q;
            if (i2 < size) {
                if (((C1117Uu) arrayList.get(i2)).f3653z == i) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0 && i2 < arrayList.size()) {
            arrayList.remove(i2);
            m3793I(true);
        }
    }

    /* renamed from: s */
    public final void m3802s(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f6722w = view;
            this.f6709S = null;
            this.f6708R = null;
        } else {
            if (i > 0) {
                this.f6709S = this.f6715h.getText(i);
            } else if (charSequence != null) {
                this.f6709S = charSequence;
            }
            if (i2 > 0) {
                Object obj = AbstractC0865QC.f2950z;
                this.f6708R = AbstractC1470bd.m2878h(this.f6724z, i2);
            } else if (drawable != null) {
                this.f6708R = drawable;
            }
            this.f6722w = null;
        }
        m3793I(false);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int i2;
        ArrayList arrayList = this.f6707Q;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1117Uu c1117Uu = (C1117Uu) arrayList.get(i3);
            if (c1117Uu.f3643h == i) {
                int i4 = c1117Uu.f3641f & (-5);
                if (z2) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                c1117Uu.f3641f = i4 | i2;
                c1117Uu.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f6701E = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f6707Q;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1117Uu c1117Uu = (C1117Uu) arrayList.get(i2);
            if (c1117Uu.f3643h == i) {
                c1117Uu.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        int i2;
        boolean z2;
        ArrayList arrayList = this.f6707Q;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C1117Uu c1117Uu = (C1117Uu) arrayList.get(i3);
            if (c1117Uu.f3643h == i) {
                int i4 = c1117Uu.f3641f;
                int i5 = i4 & (-9);
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                int i6 = i5 | i2;
                c1117Uu.f3641f = i6;
                if (i4 != i6) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            m3793I(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f6721v = z;
        m3793I(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f6707Q.size();
    }

    /* renamed from: u */
    public final C1117Uu m3803u(int i, KeyEvent keyEvent) {
        char c;
        ArrayList arrayList = this.f6723y;
        arrayList.clear();
        m3800o(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C1117Uu) arrayList.get(0);
        }
        boolean mo2455R = mo2455R();
        for (int i2 = 0; i2 < size; i2++) {
            C1117Uu c1117Uu = (C1117Uu) arrayList.get(i2);
            if (mo2455R) {
                c = c1117Uu.f3626G;
            } else {
                c = c1117Uu.f3645o;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (mo2455R && c == '\b' && i == 67))) {
                return c1117Uu;
            }
        }
        return null;
    }

    /* renamed from: v */
    public final void m3804v(boolean z) {
        if (this.f6714g) {
            return;
        }
        this.f6714g = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6719s;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC2687yj interfaceC2687yj = (InterfaceC2687yj) weakReference.get();
            if (interfaceC2687yj == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC2687yj.mo227z(this, z);
            }
        }
        this.f6714g = false;
    }

    /* renamed from: w */
    public boolean mo2457w() {
        return this.f6706P;
    }

    /* renamed from: y */
    public final void m3805y(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1188WE) item.getSubMenu()).m3805y(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo2450G(), sparseArray);
        }
    }

    /* renamed from: z */
    public C1117Uu mo2002z(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0 && i5 < 6) {
            int i6 = (f6700r[i5] << 16) | (65535 & i3);
            C1117Uu c1117Uu = new C1117Uu(this, i, i2, i3, i6, charSequence, this.f6711V);
            ArrayList arrayList = this.f6707Q;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (((C1117Uu) arrayList.get(size)).f3632P <= i6) {
                        i4 = size + 1;
                        break;
                    }
                } else {
                    i4 = 0;
                    break;
                }
            }
            arrayList.add(i4, c1117Uu);
            m3793I(true);
            return c1117Uu;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return mo2002z(i, i2, i3, this.f6715h.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f6715h.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo2002z(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1117Uu mo2002z = mo2002z(i, i2, i3, charSequence);
        SubMenuC1188WE subMenuC1188WE = new SubMenuC1188WE(this.f6724z, this, mo2002z);
        mo2002z.f3651w = subMenuC1188WE;
        subMenuC1188WE.setHeaderTitle(mo2002z.f3631N);
        return subMenuC1188WE;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return mo2002z(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }
}
