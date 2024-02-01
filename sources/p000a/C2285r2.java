package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C2755N;
import androidx.appcompat.widget.Toolbar;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: a.r2 */
/* loaded from: classes.dex */
public final class C2285r2 extends AbstractC1500cH implements InterfaceC2122o2 {

    /* renamed from: E */
    public final C2094nS f7043E;

    /* renamed from: G */
    public C0996Sg f7044G;

    /* renamed from: I */
    public boolean f7045I;

    /* renamed from: M */
    public C0996Sg f7046M;

    /* renamed from: N */
    public ActionBarContainer f7047N;

    /* renamed from: P */
    public ActionBarOverlayLayout f7048P;

    /* renamed from: Q */
    public C2444u1 f7049Q;

    /* renamed from: R */
    public final ArrayList f7050R;

    /* renamed from: S */
    public boolean f7051S;

    /* renamed from: U */
    public boolean f7052U;

    /* renamed from: V */
    public InterfaceC2662yD f7053V;

    /* renamed from: W */
    public boolean f7054W;

    /* renamed from: f */
    public final C2094nS f7055f;

    /* renamed from: g */
    public boolean f7056g;

    /* renamed from: h */
    public Context f7057h;

    /* renamed from: k */
    public boolean f7058k;

    /* renamed from: o */
    public final View f7059o;

    /* renamed from: q */
    public boolean f7060q;

    /* renamed from: r */
    public final C2196pM f7061r;

    /* renamed from: s */
    public boolean f7062s;

    /* renamed from: u */
    public ActionBarContextView f7063u;

    /* renamed from: v */
    public Context f7064v;

    /* renamed from: w */
    public int f7065w;

    /* renamed from: y */
    public C1583do f7066y;

    /* renamed from: Y */
    public static final AccelerateInterpolator f7042Y = new AccelerateInterpolator();

    /* renamed from: J */
    public static final DecelerateInterpolator f7041J = new DecelerateInterpolator();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2285r2(android.app.Activity r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            r3.<init>(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.f7050R = r1
            r3.f7065w = r0
            r1 = 1
            r3.f7045I = r1
            r3.f7056g = r1
            a.nS r2 = new a.nS
            r2.<init>(r3, r0)
            r3.f7043E = r2
            a.nS r0 = new a.nS
            r0.<init>(r3, r1)
            r3.f7055f = r0
            a.pM r0 = new a.pM
            r0.<init>(r1, r3)
            r3.f7061r = r0
            android.view.Window r4 = r4.getWindow()
            android.view.View r4 = r4.getDecorView()
            r3.m3943C(r4)
            if (r5 != 0) goto L42
            r5 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r5)
            r3.f7059o = r4
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2285r2.<init>(android.app.Activity, boolean):void");
    }

    /* renamed from: C */
    public final void m3943C(View view) {
        String str;
        C2444u1 c2444u1;
        boolean z;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f7048P = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.f8747j = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((C2285r2) actionBarOverlayLayout.f8747j).f7065w = actionBarOverlayLayout.f8738R;
                int i = actionBarOverlayLayout.f8752r;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    AbstractC1589dw.m3064v(actionBarOverlayLayout);
                }
            }
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof C2444u1) {
            c2444u1 = (C2444u1) findViewById;
        } else if (findViewById instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) findViewById;
            if (toolbar.f8837Yd == null) {
                toolbar.f8837Yd = new C2444u1(toolbar, true);
            }
            c2444u1 = toolbar.f8837Yd;
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f7049Q = c2444u1;
        this.f7063u = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f7047N = actionBarContainer;
        C2444u1 c2444u12 = this.f7049Q;
        if (c2444u12 != null && this.f7063u != null && actionBarContainer != null) {
            Context context = c2444u12.f7482z.getContext();
            this.f7057h = context;
            if ((this.f7049Q.f7477h & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f7054W = true;
            }
            C2196pM c2196pM = new C2196pM(2, context);
            int i2 = ((Context) c2196pM.f6755R).getApplicationInfo().targetSdkVersion;
            this.f7049Q.getClass();
            m3946p(((Context) c2196pM.f6755R).getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.f7057h.obtainStyledAttributes(null, AbstractC0483J5.f1626z, R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f7048P;
                if (actionBarOverlayLayout2.f8756y) {
                    this.f7052U = true;
                    if (true != actionBarOverlayLayout2.f8740U) {
                        actionBarOverlayLayout2.f8740U = true;
                    }
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.f7047N;
                WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                AbstractC1548d9.m3008g(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(C2285r2.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: G */
    public final void mo2900G(boolean z) {
        if (z == this.f7051S) {
            return;
        }
        this.f7051S = z;
        ArrayList arrayList = this.f7050R;
        if (arrayList.size() <= 0) {
            return;
        }
        AbstractC2441tz.m4202q(arrayList.get(0));
        throw null;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: H */
    public final void mo2901H(CharSequence charSequence) {
        C2444u1 c2444u1 = this.f7049Q;
        if (!c2444u1.f7479u) {
            c2444u1.f7478o = charSequence;
            if ((c2444u1.f7477h & 8) != 0) {
                Toolbar toolbar = c2444u1.f7482z;
                toolbar.m4744Y(charSequence);
                if (c2444u1.f7479u) {
                    AbstractC2446u3.m4220S(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: I */
    public final void mo2902I() {
        m3946p(((Context) new C2196pM(2, this.f7057h).f6755R).getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: J */
    public final void mo2903J(int i) {
        mo2910c(this.f7057h.getString(i));
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: S */
    public final Context mo2905S() {
        if (this.f7064v == null) {
            TypedValue typedValue = new TypedValue();
            this.f7057h.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f7064v = new ContextThemeWrapper(this.f7057h, i);
            } else {
                this.f7064v = this.f7057h;
            }
        }
        return this.f7064v;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: V */
    public final int mo2906V() {
        return this.f7049Q.f7477h;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: X */
    public final AbstractC0336GR mo2908X(C1394a8 c1394a8) {
        C0996Sg c0996Sg = this.f7044G;
        if (c0996Sg != null) {
            c0996Sg.mo745z();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f7048P;
        if (actionBarOverlayLayout.f8740U) {
            actionBarOverlayLayout.f8740U = false;
            actionBarOverlayLayout.m4717o();
            actionBarOverlayLayout.m4717o();
            actionBarOverlayLayout.f8734I.setTranslationY(-Math.max(0, Math.min(0, actionBarOverlayLayout.f8734I.getHeight())));
        }
        this.f7063u.m4704N();
        C0996Sg c0996Sg2 = new C0996Sg(this, this.f7063u.getContext(), c1394a8);
        C2189pE c2189pE = c0996Sg2.f3342I;
        c2189pE.m3792E();
        try {
            if (c0996Sg2.f3345q.mo1225P(c0996Sg2, c2189pE)) {
                this.f7044G = c0996Sg2;
                c0996Sg2.mo741o();
                this.f7063u.m4711v(c0996Sg2);
                m3944Z(true);
                return c0996Sg2;
            }
            return null;
        } finally {
            c2189pE.m3794U();
        }
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: Y */
    public final void mo2909Y(boolean z) {
        C1583do c1583do;
        this.f7062s = z;
        if (z || (c1583do = this.f7066y) == null) {
            return;
        }
        c1583do.m3061z();
    }

    /* renamed from: Z */
    public final void m3944Z(boolean z) {
        C0831PV m4706S;
        C0831PV c0831pv;
        long j;
        if (z) {
            if (!this.f7058k) {
                this.f7058k = true;
                m3945j(false);
            }
        } else if (this.f7058k) {
            this.f7058k = false;
            m3945j(false);
        }
        ActionBarContainer actionBarContainer = this.f7047N;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        if (AbstractC1285Y3.m2635v(actionBarContainer)) {
            if (z) {
                C2444u1 c2444u1 = this.f7049Q;
                m4706S = AbstractC2446u3.m4227z(c2444u1.f7482z);
                m4706S.m1937z(0.0f);
                m4706S.m1936v(100L);
                m4706S.m1934P(new C1211Wd(c2444u1, 4));
                c0831pv = this.f7063u.m4706S(0, 200L);
            } else {
                C2444u1 c2444u12 = this.f7049Q;
                C0831PV m4227z = AbstractC2446u3.m4227z(c2444u12.f7482z);
                m4227z.m1937z(1.0f);
                m4227z.m1936v(200L);
                m4227z.m1934P(new C1211Wd(c2444u12, 0));
                m4706S = this.f7063u.m4706S(8, 100L);
                c0831pv = m4227z;
            }
            C1583do c1583do = new C1583do();
            ArrayList arrayList = c1583do.f4871z;
            arrayList.add(m4706S);
            View view = (View) m4706S.f2816z.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = (View) c0831pv.f2816z.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            arrayList.add(c0831pv);
            c1583do.m3060h();
            return;
        }
        if (z) {
            this.f7049Q.f7482z.setVisibility(4);
            this.f7063u.setVisibility(0);
        } else {
            this.f7049Q.f7482z.setVisibility(0);
            this.f7063u.setVisibility(8);
        }
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: c */
    public final void mo2910c(CharSequence charSequence) {
        this.f7049Q.m4211h(charSequence);
    }

    /* renamed from: j */
    public final void m3945j(boolean z) {
        boolean z2;
        boolean z3 = this.f7060q;
        if (this.f7058k || !z3) {
            z2 = true;
        } else {
            z2 = false;
        }
        C2196pM c2196pM = this.f7061r;
        int i = 2;
        C0191Dg c0191Dg = null;
        View view = this.f7059o;
        if (z2) {
            if (!this.f7056g) {
                this.f7056g = true;
                C1583do c1583do = this.f7066y;
                if (c1583do != null) {
                    c1583do.m3061z();
                }
                this.f7047N.setVisibility(0);
                int i2 = this.f7065w;
                C2094nS c2094nS = this.f7055f;
                if (i2 == 0 && (this.f7062s || z)) {
                    this.f7047N.setTranslationY(0.0f);
                    float f = -this.f7047N.getHeight();
                    if (z) {
                        this.f7047N.getLocationInWindow(new int[]{0, 0});
                        f -= r13[1];
                    }
                    this.f7047N.setTranslationY(f);
                    C1583do c1583do2 = new C1583do();
                    C0831PV m4227z = AbstractC2446u3.m4227z(this.f7047N);
                    m4227z.m1933N(0.0f);
                    View view2 = (View) m4227z.f2816z.get();
                    if (view2 != null) {
                        if (c2196pM != null) {
                            c0191Dg = new C0191Dg(c2196pM, i, view2);
                        }
                        AbstractC0841Pg.m1958z(view2.animate(), c0191Dg);
                    }
                    boolean z4 = c1583do2.f4866N;
                    ArrayList arrayList = c1583do2.f4871z;
                    if (!z4) {
                        arrayList.add(m4227z);
                    }
                    if (this.f7045I && view != null) {
                        view.setTranslationY(f);
                        C0831PV m4227z2 = AbstractC2446u3.m4227z(view);
                        m4227z2.m1933N(0.0f);
                        if (!c1583do2.f4866N) {
                            arrayList.add(m4227z2);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = f7041J;
                    boolean z5 = c1583do2.f4866N;
                    if (!z5) {
                        c1583do2.f4870v = decelerateInterpolator;
                    }
                    if (!z5) {
                        c1583do2.f4869h = 250L;
                    }
                    if (!z5) {
                        c1583do2.f4867P = c2094nS;
                    }
                    this.f7066y = c1583do2;
                    c1583do2.m3060h();
                } else {
                    this.f7047N.setAlpha(1.0f);
                    this.f7047N.setTranslationY(0.0f);
                    if (this.f7045I && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    c2094nS.mo1311z();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f7048P;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    AbstractC1589dw.m3064v(actionBarOverlayLayout);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f7056g) {
            this.f7056g = false;
            C1583do c1583do3 = this.f7066y;
            if (c1583do3 != null) {
                c1583do3.m3061z();
            }
            int i3 = this.f7065w;
            C2094nS c2094nS2 = this.f7043E;
            if (i3 == 0 && (this.f7062s || z)) {
                this.f7047N.setAlpha(1.0f);
                ActionBarContainer actionBarContainer = this.f7047N;
                actionBarContainer.f8702S = true;
                actionBarContainer.setDescendantFocusability(393216);
                C1583do c1583do4 = new C1583do();
                float f2 = -this.f7047N.getHeight();
                if (z) {
                    this.f7047N.getLocationInWindow(new int[]{0, 0});
                    f2 -= r13[1];
                }
                C0831PV m4227z3 = AbstractC2446u3.m4227z(this.f7047N);
                m4227z3.m1933N(f2);
                View view3 = (View) m4227z3.f2816z.get();
                if (view3 != null) {
                    if (c2196pM != null) {
                        c0191Dg = new C0191Dg(c2196pM, i, view3);
                    }
                    AbstractC0841Pg.m1958z(view3.animate(), c0191Dg);
                }
                boolean z6 = c1583do4.f4866N;
                ArrayList arrayList2 = c1583do4.f4871z;
                if (!z6) {
                    arrayList2.add(m4227z3);
                }
                if (this.f7045I && view != null) {
                    C0831PV m4227z4 = AbstractC2446u3.m4227z(view);
                    m4227z4.m1933N(f2);
                    if (!c1583do4.f4866N) {
                        arrayList2.add(m4227z4);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f7042Y;
                boolean z7 = c1583do4.f4866N;
                if (!z7) {
                    c1583do4.f4870v = accelerateInterpolator;
                }
                if (!z7) {
                    c1583do4.f4869h = 250L;
                }
                if (!z7) {
                    c1583do4.f4867P = c2094nS2;
                }
                this.f7066y = c1583do4;
                c1583do4.m3060h();
                return;
            }
            c2094nS2.mo1311z();
        }
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: k */
    public final boolean mo2914k(int i, KeyEvent keyEvent) {
        C2189pE c2189pE;
        int i2;
        C0996Sg c0996Sg = this.f7044G;
        if (c0996Sg == null || (c2189pE = c0996Sg.f3342I) == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        c2189pE.setQwertyMode(z);
        return c2189pE.performShortcut(i, keyEvent, 0);
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: o */
    public final boolean mo2915o() {
        boolean z;
        C1117Uu c1117Uu;
        C2444u1 c2444u1 = this.f7049Q;
        if (c2444u1 != null) {
            C2755N c2755n = c2444u1.f7482z.f8825HL;
            if (c2755n != null && c2755n.f8781R != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (c2755n == null) {
                    c1117Uu = null;
                } else {
                    c1117Uu = c2755n.f8781R;
                }
                if (c1117Uu != null) {
                    c1117Uu.collapseActionView();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public final void m3946p(boolean z) {
        Object obj;
        if (!z) {
            this.f7049Q.getClass();
            obj = this.f7047N;
        } else {
            this.f7047N.getClass();
            obj = this.f7049Q;
        }
        obj.getClass();
        this.f7049Q.getClass();
        Toolbar toolbar = this.f7049Q.f7482z;
        toolbar.f8863zx = false;
        toolbar.requestLayout();
        this.f7048P.f8753s = false;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: r */
    public final void mo2917r(boolean z) {
        int i;
        if (!this.f7054W) {
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            C2444u1 c2444u1 = this.f7049Q;
            int i2 = c2444u1.f7477h;
            this.f7054W = true;
            c2444u1.m4213z((i & 4) | (i2 & (-5)));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2285r2(android.app.Dialog r4) {
        /*
            r3 = this;
            r0 = 0
            r3.<init>(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.f7050R = r1
            r3.f7065w = r0
            r1 = 1
            r3.f7045I = r1
            r3.f7056g = r1
            a.nS r2 = new a.nS
            r2.<init>(r3, r0)
            r3.f7043E = r2
            a.nS r0 = new a.nS
            r0.<init>(r3, r1)
            r3.f7055f = r0
            a.pM r0 = new a.pM
            r0.<init>(r1, r3)
            r3.f7061r = r0
            android.view.Window r4 = r4.getWindow()
            android.view.View r4 = r4.getDecorView()
            r3.m3943C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2285r2.<init>(android.app.Dialog):void");
    }
}
