package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;
import p000a.AbstractC1522cj;
import p000a.AbstractC1548d9;
import p000a.AbstractC1589dw;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;
import p000a.C0528Jy;
import p000a.C1583do;
import p000a.C2189pE;
import p000a.C2192pI;
import p000a.C2194pK;
import p000a.C2196pM;
import p000a.C2285r2;
import p000a.C2444u1;
import p000a.C2498v3;
import p000a.C2558wC;
import p000a.C2621xJ;
import p000a.C2635xe;
import p000a.C2739zj;
import p000a.InterfaceC0546KH;
import p000a.InterfaceC0848Pq;
import p000a.InterfaceC1669fO;
import p000a.InterfaceC2122o2;
import p000a.RunnableC1049Tf;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0848Pq, InterfaceC0546KH, InterfaceC1669fO {

    /* renamed from: T */
    public static final int[] f8729T = {R.attr.actionBarSize, 16842841};

    /* renamed from: C */
    public C2621xJ f8730C;

    /* renamed from: E */
    public boolean f8731E;

    /* renamed from: F */
    public C2621xJ f8732F;

    /* renamed from: H */
    public final Rect f8733H;

    /* renamed from: I */
    public ActionBarContainer f8734I;

    /* renamed from: J */
    public final Rect f8735J;

    /* renamed from: L */
    public OverScroller f8736L;

    /* renamed from: O */
    public final RunnableC1049Tf f8737O;

    /* renamed from: R */
    public int f8738R;

    /* renamed from: S */
    public int f8739S;

    /* renamed from: U */
    public boolean f8740U;

    /* renamed from: c */
    public final Rect f8741c;

    /* renamed from: d */
    public final C2558wC f8742d;

    /* renamed from: e */
    public C2621xJ f8743e;

    /* renamed from: f */
    public int f8744f;

    /* renamed from: g */
    public boolean f8745g;

    /* renamed from: i */
    public ViewPropertyAnimator f8746i;

    /* renamed from: j */
    public InterfaceC2122o2 f8747j;

    /* renamed from: k */
    public Drawable f8748k;

    /* renamed from: n */
    public final RunnableC1049Tf f8749n;

    /* renamed from: p */
    public C2621xJ f8750p;

    /* renamed from: q */
    public C2444u1 f8751q;

    /* renamed from: r */
    public int f8752r;

    /* renamed from: s */
    public boolean f8753s;

    /* renamed from: w */
    public ContentFrameLayout f8754w;

    /* renamed from: x */
    public final C2498v3 f8755x;

    /* renamed from: y */
    public boolean f8756y;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 0;
        this.f8738R = 0;
        this.f8735J = new Rect();
        this.f8741c = new Rect();
        this.f8733H = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C2621xJ c2621xJ = C2621xJ.f8106h;
        this.f8743e = c2621xJ;
        this.f8732F = c2621xJ;
        this.f8730C = c2621xJ;
        this.f8750p = c2621xJ;
        this.f8742d = new C2558wC(i, this);
        this.f8737O = new RunnableC1049Tf(this, i);
        this.f8749n = new RunnableC1049Tf(this, 1);
        m4716W(context);
        this.f8755x = new C2498v3();
    }

    /* renamed from: u */
    public static boolean m4712u(FrameLayout frameLayout, Rect rect, boolean z) {
        boolean z2;
        C2635xe c2635xe = (C2635xe) frameLayout.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c2635xe).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c2635xe).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c2635xe).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c2635xe).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c2635xe).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c2635xe).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c2635xe).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c2635xe).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    /* renamed from: G */
    public final void m4713G(int i) {
        m4714M();
        if (i != 2) {
            if (i != 5) {
                if (i == 109) {
                    boolean z = true;
                    this.f8756y = true;
                    if (getContext().getApplicationInfo().targetSdkVersion >= 19) {
                        z = false;
                    }
                    this.f8745g = z;
                    return;
                }
                return;
            }
            this.f8751q.getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
            return;
        }
        this.f8751q.getClass();
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: M */
    public final void m4714M() {
        C2444u1 c2444u1;
        if (this.f8754w == null) {
            this.f8754w = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f8734I = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof C2444u1) {
                c2444u1 = (C2444u1) findViewById;
            } else if (findViewById instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) findViewById;
                if (toolbar.f8837Yd == null) {
                    toolbar.f8837Yd = new C2444u1(toolbar, true);
                }
                c2444u1 = toolbar.f8837Yd;
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f8751q = c2444u1;
        }
    }

    @Override // p000a.InterfaceC0546KH
    /* renamed from: N */
    public final void mo1256N(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p000a.InterfaceC1669fO
    /* renamed from: P */
    public final void mo3165P(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo1256N(view, i, i2, i3, i4, i5);
    }

    @Override // p000a.InterfaceC0546KH
    /* renamed from: Q */
    public final boolean mo1257Q(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    /* renamed from: V */
    public final void m4715V(C2189pE c2189pE, C0528Jy c0528Jy) {
        m4714M();
        C2444u1 c2444u1 = this.f8751q;
        C2192pI c2192pI = c2444u1.f7474S;
        Toolbar toolbar = c2444u1.f7482z;
        if (c2192pI == null) {
            C2192pI c2192pI2 = new C2192pI(toolbar.getContext());
            c2444u1.f7474S = c2192pI2;
            c2192pI2.f6747s = R.id.action_menu_presenter;
        }
        C2192pI c2192pI3 = c2444u1.f7474S;
        c2192pI3.f6745q = c0528Jy;
        if (c2189pE != null || toolbar.f8832S != null) {
            toolbar.m4755v();
            C2189pE c2189pE2 = toolbar.f8832S.f8759H;
            if (c2189pE2 != c2189pE) {
                if (c2189pE2 != null) {
                    c2189pE2.m3799k(toolbar.f8856qn);
                    c2189pE2.m3799k(toolbar.f8825HL);
                }
                if (toolbar.f8825HL == null) {
                    toolbar.f8825HL = new C2755N(toolbar);
                }
                c2192pI3.f6739c = true;
                if (c2189pE != null) {
                    c2189pE.m3798h(c2192pI3, toolbar.f8834U);
                    c2189pE.m3798h(toolbar.f8825HL, toolbar.f8834U);
                } else {
                    c2192pI3.mo217G(toolbar.f8834U, null);
                    toolbar.f8825HL.mo217G(toolbar.f8834U, null);
                    c2192pI3.mo221S(true);
                    toolbar.f8825HL.mo221S(true);
                }
                ActionMenuView actionMenuView = toolbar.f8832S;
                int i = toolbar.f8821E;
                if (actionMenuView.f8758F != i) {
                    actionMenuView.f8758F = i;
                    if (i == 0) {
                        actionMenuView.f8763e = actionMenuView.getContext();
                    } else {
                        actionMenuView.f8763e = new ContextThemeWrapper(actionMenuView.getContext(), i);
                    }
                }
                ActionMenuView actionMenuView2 = toolbar.f8832S;
                actionMenuView2.f8767p = c2192pI3;
                c2192pI3.f6749y = actionMenuView2;
                actionMenuView2.f8759H = c2192pI3.f6748w;
                toolbar.f8856qn = c2192pI3;
                toolbar.m4745c();
            }
        }
    }

    /* renamed from: W */
    public final void m4716W(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f8729T);
        this.f8739S = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f8748k = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f8745g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f8736L = new OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2635xe;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f8748k == null || this.f8745g) {
            return;
        }
        if (this.f8734I.getVisibility() == 0) {
            i = (int) (this.f8734I.getTranslationY() + this.f8734I.getBottom() + 0.5f);
        } else {
            i = 0;
        }
        this.f8748k.setBounds(0, i, getWidth(), this.f8748k.getIntrinsicHeight() + i);
        this.f8748k.draw(canvas);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2635xe();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2635xe(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        C2498v3 c2498v3 = this.f8755x;
        return c2498v3.f7635h | c2498v3.f7636z;
    }

    @Override // p000a.InterfaceC0546KH
    /* renamed from: h */
    public final void mo1258h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: o */
    public final void m4717o() {
        removeCallbacks(this.f8737O);
        removeCallbacks(this.f8749n);
        ViewPropertyAnimator viewPropertyAnimator = this.f8746i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m4714M();
        C2621xJ m4514o = C2621xJ.m4514o(this, windowInsets);
        boolean m4712u = m4712u(this.f8734I, new Rect(m4514o.m4519v(), m4514o.m4515N(), m4514o.m4516P(), m4514o.m4517h()), false);
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        Rect rect = this.f8735J;
        AbstractC1548d9.m3009h(this, m4514o, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        C2194pK c2194pK = m4514o.f8107z;
        C2621xJ mo3648V = c2194pK.mo3648V(i, i2, i3, i4);
        this.f8743e = mo3648V;
        boolean z = true;
        if (!this.f8732F.equals(mo3648V)) {
            this.f8732F = this.f8743e;
            m4712u = true;
        }
        Rect rect2 = this.f8741c;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z = m4712u;
        }
        if (z) {
            requestLayout();
        }
        return c2194pK.mo3814z().f8107z.mo1091v().f8107z.mo1088h().m4518u();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m4716W(getContext());
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC1589dw.m3064v(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4717o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C2635xe c2635xe = (C2635xe) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c2635xe).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c2635xe).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        C2621xJ m3817R;
        m4714M();
        measureChildWithMargins(this.f8734I, i, 0, i2, 0);
        C2635xe c2635xe = (C2635xe) this.f8734I.getLayoutParams();
        int max = Math.max(0, this.f8734I.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2635xe).leftMargin + ((ViewGroup.MarginLayoutParams) c2635xe).rightMargin);
        int max2 = Math.max(0, this.f8734I.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2635xe).topMargin + ((ViewGroup.MarginLayoutParams) c2635xe).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f8734I.getMeasuredState());
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        if ((AbstractC2397t8.m4128u(this) & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            measuredHeight = this.f8739S;
            if (this.f8753s) {
                this.f8734I.getClass();
            }
        } else {
            measuredHeight = this.f8734I.getVisibility() != 8 ? this.f8734I.getMeasuredHeight() : 0;
        }
        Rect rect = this.f8735J;
        Rect rect2 = this.f8733H;
        rect2.set(rect);
        C2621xJ c2621xJ = this.f8743e;
        this.f8730C = c2621xJ;
        if (!this.f8756y && !z) {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
            m3817R = c2621xJ.f8107z.mo3648V(0, measuredHeight, 0, 0);
        } else {
            C2739zj m4673h = C2739zj.m4673h(c2621xJ.m4519v(), this.f8730C.m4515N() + measuredHeight, this.f8730C.m4516P(), this.f8730C.m4517h() + 0);
            C2196pM c2196pM = new C2196pM(this.f8730C);
            ((AbstractC1522cj) c2196pM.f6755R).mo2380u(m4673h);
            m3817R = c2196pM.m3817R();
        }
        this.f8730C = m3817R;
        m4712u(this.f8754w, rect2, true);
        if (!this.f8750p.equals(this.f8730C)) {
            C2621xJ c2621xJ2 = this.f8730C;
            this.f8750p = c2621xJ2;
            ContentFrameLayout contentFrameLayout = this.f8754w;
            WindowInsets m4518u = c2621xJ2.m4518u();
            if (m4518u != null) {
                WindowInsets m3065z = AbstractC1589dw.m3065z(contentFrameLayout, m4518u);
                if (!m3065z.equals(m4518u)) {
                    C2621xJ.m4514o(contentFrameLayout, m3065z);
                }
            }
        }
        measureChildWithMargins(this.f8754w, i, 0, i2, 0);
        C2635xe c2635xe2 = (C2635xe) this.f8754w.getLayoutParams();
        int max3 = Math.max(max, this.f8754w.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c2635xe2).leftMargin + ((ViewGroup.MarginLayoutParams) c2635xe2).rightMargin);
        int max4 = Math.max(max2, this.f8754w.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2635xe2).topMargin + ((ViewGroup.MarginLayoutParams) c2635xe2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f8754w.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.f8740U || !z) {
            return false;
        }
        this.f8736L.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f8736L.getFinalY() > this.f8734I.getHeight()) {
            z2 = true;
        }
        if (z2) {
            m4717o();
            this.f8749n.run();
        } else {
            m4717o();
            this.f8737O.run();
        }
        this.f8731E = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f8744f = this.f8744f + i2;
        m4717o();
        this.f8734I.setTranslationY(-Math.max(0, Math.min(r1, this.f8734I.getHeight())));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        int i2;
        C2285r2 c2285r2;
        C1583do c1583do;
        this.f8755x.f7636z = i;
        ActionBarContainer actionBarContainer = this.f8734I;
        if (actionBarContainer != null) {
            i2 = -((int) actionBarContainer.getTranslationY());
        } else {
            i2 = 0;
        }
        this.f8744f = i2;
        m4717o();
        InterfaceC2122o2 interfaceC2122o2 = this.f8747j;
        if (interfaceC2122o2 != null && (c1583do = (c2285r2 = (C2285r2) interfaceC2122o2).f7066y) != null) {
            c1583do.m3061z();
            c2285r2.f7066y = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f8734I.getVisibility() != 0) {
            return false;
        }
        return this.f8740U;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f8740U && !this.f8731E) {
            if (this.f8744f <= this.f8734I.getHeight()) {
                m4717o();
                postDelayed(this.f8737O, 600L);
            } else {
                m4717o();
                postDelayed(this.f8749n, 600L);
            }
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z2;
        super.onWindowSystemUiVisibilityChanged(i);
        m4714M();
        int i2 = this.f8752r ^ i;
        this.f8752r = i;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        InterfaceC2122o2 interfaceC2122o2 = this.f8747j;
        if (interfaceC2122o2 != null) {
            ((C2285r2) interfaceC2122o2).f7045I = !z2;
            if (!z && z2) {
                C2285r2 c2285r2 = (C2285r2) interfaceC2122o2;
                if (!c2285r2.f7060q) {
                    c2285r2.f7060q = true;
                    c2285r2.m3945j(true);
                }
            } else {
                C2285r2 c2285r22 = (C2285r2) interfaceC2122o2;
                if (c2285r22.f7060q) {
                    c2285r22.f7060q = false;
                    c2285r22.m3945j(true);
                }
            }
        }
        if ((i2 & 256) != 0 && this.f8747j != null) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC1589dw.m3064v(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f8738R = i;
        InterfaceC2122o2 interfaceC2122o2 = this.f8747j;
        if (interfaceC2122o2 != null) {
            ((C2285r2) interfaceC2122o2).f7065w = i;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // p000a.InterfaceC0546KH
    /* renamed from: v */
    public final void mo1259v(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // p000a.InterfaceC0546KH
    /* renamed from: z */
    public final void mo1260z(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2635xe(layoutParams);
    }
}
