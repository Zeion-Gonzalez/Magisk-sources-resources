package p000a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.topjohnwu.magisk.R;

/* renamed from: a.q1 */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC2229q1 extends AbstractC1153Va implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: E */
    public final ViewOnAttachStateChangeListenerC0173DN f6851E;

    /* renamed from: F */
    public int f6852F = 0;

    /* renamed from: H */
    public boolean f6853H;

    /* renamed from: I */
    public final C2476uh f6854I;

    /* renamed from: J */
    public InterfaceC0656MP f6855J;

    /* renamed from: R */
    public final Context f6856R;

    /* renamed from: U */
    public final ViewTreeObserverOnGlobalLayoutListenerC0520Jn f6857U;

    /* renamed from: X */
    public int f6858X;

    /* renamed from: Y */
    public View f6859Y;

    /* renamed from: Z */
    public boolean f6860Z;

    /* renamed from: c */
    public ViewTreeObserver f6861c;

    /* renamed from: e */
    public boolean f6862e;

    /* renamed from: f */
    public PopupWindow.OnDismissListener f6863f;

    /* renamed from: g */
    public final int f6864g;

    /* renamed from: k */
    public final int f6865k;

    /* renamed from: q */
    public final boolean f6866q;

    /* renamed from: r */
    public View f6867r;

    /* renamed from: s */
    public final C0692N5 f6868s;

    /* renamed from: w */
    public final C2189pE f6869w;

    /* renamed from: y */
    public final int f6870y;

    public ViewOnKeyListenerC2229q1(int i, int i2, Context context, View view, C2189pE c2189pE, boolean z) {
        int i3 = 1;
        this.f6857U = new ViewTreeObserverOnGlobalLayoutListenerC0520Jn(this, i3);
        this.f6851E = new ViewOnAttachStateChangeListenerC0173DN(i3, this);
        this.f6856R = context;
        this.f6869w = c2189pE;
        this.f6866q = z;
        this.f6854I = new C2476uh(c2189pE, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f6864g = i;
        this.f6870y = i2;
        Resources resources = context.getResources();
        this.f6865k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f6867r = view;
        this.f6868s = new C0692N5(context, i, i2);
        c2189pE.m3798h(this, context);
    }

    @Override // p000a.AbstractC1153Va
    /* renamed from: E */
    public final void mo394E(int i) {
        this.f6868s.m1469w(i);
    }

    @Override // p000a.InterfaceC2298rH
    /* renamed from: M */
    public final C2409tO mo395M() {
        return this.f6868s.f2145w;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: N */
    public final boolean mo218N() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0072  */
    @Override // p000a.InterfaceC2687yj
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo219P(p000a.SubMenuC1188WE r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L7a
            a.OI r0 = new a.OI
            android.content.Context r5 = r9.f6856R
            android.view.View r6 = r9.f6859Y
            boolean r8 = r9.f6866q
            int r3 = r9.f6864g
            int r4 = r9.f6870y
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            a.MP r2 = r9.f6855J
            r0.f2611W = r2
            a.Va r3 = r0.f2605G
            if (r3 == 0) goto L23
            r3.mo223W(r2)
        L23:
            boolean r2 = p000a.AbstractC1153Va.m2365f(r10)
            r0.f2613o = r2
            a.Va r3 = r0.f2605G
            if (r3 == 0) goto L30
            r3.mo400k(r2)
        L30:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f6863f
            r0.f2606M = r2
            r2 = 0
            r9.f6863f = r2
            a.pE r2 = r9.f6869w
            r2.m3804v(r1)
            a.N5 r2 = r9.f6868s
            int r3 = r2.f2140k
            int r2 = r2.m1467u()
            int r4 = r9.f6852F
            android.view.View r5 = r9.f6867r
            java.util.WeakHashMap r6 = p000a.AbstractC2446u3.f7488z
            int r5 = p000a.AbstractC0095Bq.m199P(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5e
            android.view.View r4 = r9.f6867r
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5e:
            boolean r4 = r0.m1773h()
            r5 = 1
            if (r4 == 0) goto L66
            goto L6f
        L66:
            android.view.View r4 = r0.f2609Q
            if (r4 != 0) goto L6c
            r0 = r1
            goto L70
        L6c:
            r0.m1772P(r3, r2, r5, r5)
        L6f:
            r0 = r5
        L70:
            if (r0 == 0) goto L7a
            a.MP r0 = r9.f6855J
            if (r0 == 0) goto L79
            r0.mo1242v(r10)
        L79:
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.ViewOnKeyListenerC2229q1.mo219P(a.WE):boolean");
    }

    @Override // p000a.InterfaceC2298rH
    /* renamed from: Q */
    public final void mo396Q() {
        View view;
        boolean z;
        Rect rect;
        boolean z2 = true;
        if (!mo399h()) {
            if (!this.f6853H && (view = this.f6867r) != null) {
                this.f6859Y = view;
                C0692N5 c0692n5 = this.f6868s;
                c0692n5.f2138i.setOnDismissListener(this);
                c0692n5.f2134c = this;
                c0692n5.f2127L = true;
                C1630ef c1630ef = c0692n5.f2138i;
                c1630ef.setFocusable(true);
                View view2 = this.f6859Y;
                if (this.f6861c == null) {
                    z = true;
                } else {
                    z = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f6861c = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f6857U);
                }
                view2.addOnAttachStateChangeListener(this.f6851E);
                c0692n5.f2126J = view2;
                c0692n5.f2136f = this.f6852F;
                boolean z3 = this.f6862e;
                Context context = this.f6856R;
                C2476uh c2476uh = this.f6854I;
                if (!z3) {
                    this.f6858X = AbstractC1153Va.m2364I(c2476uh, context, this.f6865k);
                    this.f6862e = true;
                }
                c0692n5.m1466k(this.f6858X);
                c1630ef.setInputMethodMode(2);
                Rect rect2 = this.f3744S;
                if (rect2 != null) {
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                c0692n5.f2139j = rect;
                c0692n5.mo396Q();
                C2409tO c2409tO = c0692n5.f2145w;
                c2409tO.setOnKeyListener(this);
                if (this.f6860Z) {
                    C2189pE c2189pE = this.f6869w;
                    if (c2189pE.f6709S != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c2409tO, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(c2189pE.f6709S);
                        }
                        frameLayout.setEnabled(false);
                        c2409tO.addHeaderView(frameLayout, null, false);
                    }
                }
                c0692n5.mo1462I(c2476uh);
                c0692n5.mo396Q();
            } else {
                z2 = false;
            }
        }
        if (z2) {
        } else {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: S */
    public final void mo221S(boolean z) {
        this.f6862e = false;
        C2476uh c2476uh = this.f6854I;
        if (c2476uh != null) {
            c2476uh.notifyDataSetChanged();
        }
    }

    @Override // p000a.AbstractC1153Va
    /* renamed from: U */
    public final void mo397U(boolean z) {
        this.f6860Z = z;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: W */
    public final void mo223W(InterfaceC0656MP interfaceC0656MP) {
        this.f6855J = interfaceC0656MP;
    }

    @Override // p000a.InterfaceC2298rH
    public final void dismiss() {
        if (mo399h()) {
            this.f6868s.dismiss();
        }
    }

    @Override // p000a.AbstractC1153Va
    /* renamed from: g */
    public final void mo398g(int i) {
        this.f6852F = i;
    }

    @Override // p000a.InterfaceC2298rH
    /* renamed from: h */
    public final boolean mo399h() {
        return !this.f6853H && this.f6868s.mo399h();
    }

    @Override // p000a.AbstractC1153Va
    /* renamed from: k */
    public final void mo400k(boolean z) {
        this.f6854I.f7585v = z;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: o */
    public final void mo224o(Parcelable parcelable) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f6853H = true;
        this.f6869w.m3804v(true);
        ViewTreeObserver viewTreeObserver = this.f6861c;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f6861c = this.f6859Y.getViewTreeObserver();
            }
            this.f6861c.removeGlobalOnLayoutListener(this.f6857U);
            this.f6861c = null;
        }
        this.f6859Y.removeOnAttachStateChangeListener(this.f6851E);
        PopupWindow.OnDismissListener onDismissListener = this.f6863f;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p000a.AbstractC1153Va
    /* renamed from: q */
    public final void mo401q(View view) {
        this.f6867r = view;
    }

    @Override // p000a.AbstractC1153Va
    /* renamed from: s */
    public final void mo403s(PopupWindow.OnDismissListener onDismissListener) {
        this.f6863f = onDismissListener;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: u */
    public final Parcelable mo225u() {
        return null;
    }

    @Override // p000a.AbstractC1153Va
    /* renamed from: w */
    public final void mo404w(C2189pE c2189pE) {
    }

    @Override // p000a.AbstractC1153Va
    /* renamed from: y */
    public final void mo405y(int i) {
        this.f6868s.f2140k = i;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: z */
    public final void mo227z(C2189pE c2189pE, boolean z) {
        if (c2189pE != this.f6869w) {
            return;
        }
        dismiss();
        InterfaceC0656MP interfaceC0656MP = this.f6855J;
        if (interfaceC0656MP != null) {
            interfaceC0656MP.mo1243z(c2189pE, z);
        }
    }
}
