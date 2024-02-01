package p000a;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: a.G6 */
/* loaded from: classes.dex */
public final class WindowCallbackC0319G6 implements Window.Callback {

    /* renamed from: I */
    public boolean f1083I;

    /* renamed from: R */
    public C2236q9 f1084R;

    /* renamed from: S */
    public final Window.Callback f1085S;

    /* renamed from: k */
    public final /* synthetic */ LayoutInflaterFactory2C1392a6 f1086k;

    /* renamed from: q */
    public boolean f1087q;

    /* renamed from: w */
    public boolean f1088w;

    public WindowCallbackC0319G6(LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6, Window.Callback callback) {
        this.f1086k = layoutInflaterFactory2C1392a6;
        if (callback != null) {
            this.f1085S = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    @Override // android.view.Window.Callback
    /* renamed from: E  reason: merged with bridge method [inline-methods] */
    public final void onWindowFocusChanged(boolean z) {
        this.f1085S.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    /* renamed from: G  reason: merged with bridge method [inline-methods] */
    public final void onAttachedToWindow() {
        this.f1085S.onAttachedToWindow();
    }

    /* renamed from: I */
    public final void m696I(int i, Menu menu) {
        this.f1085S.onPanelClosed(i, menu);
    }

    /* renamed from: M */
    public final boolean m697M(int i, Menu menu) {
        return this.f1085S.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    /* renamed from: N  reason: merged with bridge method [inline-methods] */
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f1085S.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    /* renamed from: P */
    public final boolean m699P(KeyEvent keyEvent) {
        return this.f1085S.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: Q  reason: merged with bridge method [inline-methods] */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f1085S.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: R  reason: merged with bridge method [inline-methods] */
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f1085S.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    /* renamed from: S  reason: merged with bridge method [inline-methods] */
    public final void onDetachedFromWindow() {
        this.f1085S.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    /* renamed from: U  reason: merged with bridge method [inline-methods] */
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f1085S.onWindowAttributesChanged(layoutParams);
    }

    /* renamed from: V */
    public final View m704V(int i) {
        return this.f1085S.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    /* renamed from: W  reason: merged with bridge method [inline-methods] */
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f1085S.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f1083I ? this.f1085S.dispatchKeyEvent(keyEvent) : this.f1086k.m2784E(keyEvent) || m714v(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r6 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.m699P(r6)
            r1 = 1
            if (r0 != 0) goto L4f
            int r0 = r6.getKeyCode()
            a.a6 r2 = r5.f1086k
            r2.m2795X()
            a.cH r3 = r2.f4348J
            r4 = 0
            if (r3 == 0) goto L1c
            boolean r0 = r3.mo2914k(r0, r6)
            if (r0 == 0) goto L1c
            goto L48
        L1c:
            a.fX r0 = r2.f4377nP
            if (r0 == 0) goto L31
            int r3 = r6.getKeyCode()
            boolean r0 = r2.m2806p(r0, r3, r6)
            if (r0 == 0) goto L31
            a.fX r6 = r2.f4377nP
            if (r6 == 0) goto L48
            r6.f5258V = r1
            goto L48
        L31:
            a.fX r0 = r2.f4377nP
            if (r0 != 0) goto L4a
            a.fX r0 = r2.m2786H(r4)
            r2.m2804j(r0, r6)
            int r3 = r6.getKeyCode()
            boolean r6 = r2.m2806p(r0, r3, r6)
            r0.f5252M = r4
            if (r6 == 0) goto L4a
        L48:
            r6 = r1
            goto L4b
        L4a:
            r6 = r4
        L4b:
            if (r6 == 0) goto L4e
            goto L4f
        L4e:
            r1 = r4
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.WindowCallbackC0319G6.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    /* renamed from: f */
    public final ActionMode m706f(ActionMode.Callback callback, int i) {
        return AbstractC0586Ky.m1313h(this.f1085S, callback, i);
    }

    /* renamed from: g */
    public final void m707g(List list, Menu menu, int i) {
        AbstractC2550vz.m4367z(this.f1085S, list, menu, i);
    }

    @Override // android.view.Window.Callback
    /* renamed from: h  reason: merged with bridge method [inline-methods] */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f1085S.dispatchGenericMotionEvent(motionEvent);
    }

    /* renamed from: k */
    public final boolean m709k(int i, View view, Menu menu) {
        return this.f1085S.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    /* renamed from: o  reason: merged with bridge method [inline-methods] */
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f1085S.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f1088w) {
            this.f1085S.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof C2189pE)) {
            return m697M(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        View view;
        C2236q9 c2236q9 = this.f1084R;
        if (c2236q9 != null) {
            if (i == 0) {
                view = new View(c2236q9.f6893S.f6224h.f7482z.getContext());
            } else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return m704V(i);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        m715w(i, menu);
        LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = this.f1086k;
        if (i == 108) {
            layoutInflaterFactory2C1392a6.m2795X();
            AbstractC1500cH abstractC1500cH = layoutInflaterFactory2C1392a6.f4348J;
            if (abstractC1500cH != null) {
                abstractC1500cH.mo2900G(true);
            }
        } else {
            layoutInflaterFactory2C1392a6.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f1087q) {
            this.f1085S.onPanelClosed(i, menu);
            return;
        }
        m696I(i, menu);
        LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = this.f1086k;
        if (i == 108) {
            layoutInflaterFactory2C1392a6.m2795X();
            AbstractC1500cH abstractC1500cH = layoutInflaterFactory2C1392a6.f4348J;
            if (abstractC1500cH != null) {
                abstractC1500cH.mo2900G(false);
                return;
            }
            return;
        }
        if (i == 0) {
            C1678fX m2786H = layoutInflaterFactory2C1392a6.m2786H(i);
            if (m2786H.f5257S) {
                layoutInflaterFactory2C1392a6.m2809s(m2786H, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C1392a6.getClass();
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        C2189pE c2189pE;
        if (menu instanceof C2189pE) {
            c2189pE = (C2189pE) menu;
        } else {
            c2189pE = null;
        }
        if (i == 0 && c2189pE == null) {
            return false;
        }
        if (c2189pE != null) {
            c2189pE.f6713f = true;
        }
        C2236q9 c2236q9 = this.f1084R;
        if (c2236q9 != null) {
            if (i == 0) {
                C2003lg c2003lg = c2236q9.f6893S;
                if (!c2003lg.f6220N) {
                    c2003lg.f6224h.f7475V = true;
                    c2003lg.f6220N = true;
                }
            } else {
                c2236q9.getClass();
            }
        }
        boolean m709k = m709k(i, view, menu);
        if (c2189pE != null) {
            c2189pE.f6713f = false;
        }
        return m709k;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        C2189pE c2189pE = this.f1086k.m2786H(0).f5261o;
        if (c2189pE != null) {
            m707g(list, c2189pE, i);
        } else {
            m707g(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    /* renamed from: q  reason: merged with bridge method [inline-methods] */
    public final void onPointerCaptureChanged(boolean z) {
        AbstractC1549dA.m3020z(this.f1085S, z);
    }

    @Override // android.view.Window.Callback
    /* renamed from: s  reason: merged with bridge method [inline-methods] */
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC0586Ky.m1314z(this.f1085S, searchEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: u  reason: merged with bridge method [inline-methods] */
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f1085S.dispatchTrackballEvent(motionEvent);
    }

    /* renamed from: v */
    public final boolean m714v(KeyEvent keyEvent) {
        return this.f1085S.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: w */
    public final boolean m715w(int i, Menu menu) {
        return this.f1085S.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    /* renamed from: y  reason: merged with bridge method [inline-methods] */
    public final boolean onSearchRequested() {
        return this.f1085S.onSearchRequested();
    }

    /* renamed from: z */
    public final void m717z(Window.Callback callback) {
        try {
            this.f1088w = true;
            callback.onContentChanged();
        } finally {
            this.f1088w = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018a  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r10, int r11) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.WindowCallbackC0319G6.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }
}
