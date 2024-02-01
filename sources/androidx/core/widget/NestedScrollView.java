package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000a.AbstractC1485bw;
import p000a.AbstractC1548d9;
import p000a.AbstractC1765hA;
import p000a.AbstractC1843ih;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;
import p000a.C0497JO;
import p000a.C0926RQ;
import p000a.C2185pA;
import p000a.C2498v3;
import p000a.InterfaceC1669fO;
import p000a.InterfaceC2218po;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC1669fO, InterfaceC2218po {

    /* renamed from: C */
    public final int[] f8935C;

    /* renamed from: E */
    public boolean f8936E;

    /* renamed from: F */
    public int f8937F;

    /* renamed from: H */
    public int f8938H;

    /* renamed from: I */
    public OverScroller f8939I;

    /* renamed from: J */
    public final boolean f8940J;

    /* renamed from: L */
    public int f8941L;

    /* renamed from: O */
    public final C0926RQ f8942O;

    /* renamed from: R */
    public long f8943R;

    /* renamed from: S */
    public final float f8944S;

    /* renamed from: U */
    public View f8945U;

    /* renamed from: c */
    public int f8946c;

    /* renamed from: d */
    public final C2498v3 f8947d;

    /* renamed from: e */
    public int f8948e;

    /* renamed from: f */
    public VelocityTracker f8949f;

    /* renamed from: g */
    public int f8950g;

    /* renamed from: i */
    public C2185pA f8951i;

    /* renamed from: j */
    public int f8952j;

    /* renamed from: k */
    public final EdgeEffect f8953k;

    /* renamed from: n */
    public float f8954n;

    /* renamed from: p */
    public final int[] f8955p;

    /* renamed from: q */
    public final EdgeEffect f8956q;

    /* renamed from: r */
    public boolean f8957r;

    /* renamed from: s */
    public boolean f8958s;

    /* renamed from: w */
    public final Rect f8959w;

    /* renamed from: y */
    public boolean f8960y;

    /* renamed from: x */
    public static final float f8934x = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: T */
    public static final C0497JO f8932T = new C0497JO();

    /* renamed from: t */
    public static final int[] f8933t = {16843130};

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f8959w = new Rect();
        this.f8960y = true;
        this.f8958s = false;
        this.f8945U = null;
        this.f8936E = false;
        this.f8940J = true;
        this.f8937F = -1;
        this.f8935C = new int[2];
        this.f8955p = new int[2];
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            edgeEffect = AbstractC1765hA.m3295z(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f8956q = edgeEffect;
        if (i >= 31) {
            edgeEffect2 = AbstractC1765hA.m3295z(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f8953k = edgeEffect2;
        this.f8944S = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f8939I = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f8946c = viewConfiguration.getScaledTouchSlop();
        this.f8938H = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f8948e = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8933t, R.attr.nestedScrollViewStyle, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        if (z != this.f8957r) {
            this.f8957r = z;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.f8947d = new C2498v3();
        this.f8942O = new C0926RQ(this);
        setNestedScrollingEnabled(true);
        AbstractC2446u3.m4221V(this, f8932T);
    }

    /* renamed from: R */
    public static boolean m4792R(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m4792R((View) parent, view2);
    }

    /* renamed from: E */
    public final void m4793E(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f8943R > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f8939I.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z) {
                m4802f(2, 1);
            } else {
                m4801Y(1);
            }
            this.f8941L = getScrollY();
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC2397t8.m4115M(this);
        } else {
            if (!this.f8939I.isFinished()) {
                this.f8939I.abortAnimation();
                m4801Y(1);
            }
            scrollBy(i, i2);
        }
        this.f8943R = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0062  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m4794G(android.view.KeyEvent r6) {
        /*
            r5 = this;
            android.graphics.Rect r0 = r5.f8959w
            r0.setEmpty()
            int r0 = r5.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L33
            android.view.View r0 = r5.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L33
            r0 = r1
            goto L34
        L33:
            r0 = r2
        L34:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L62
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto L61
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto L61
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto L4c
            r6 = 0
        L4c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r3)
            if (r6 == 0) goto L5f
            if (r6 == r5) goto L5f
            boolean r6 = r6.requestFocus(r3)
            if (r6 == 0) goto L5f
            goto L60
        L5f:
            r1 = r2
        L60:
            return r1
        L61:
            return r2
        L62:
            int r0 = r6.getAction()
            if (r0 != 0) goto Lb9
            int r0 = r6.getKeyCode()
            r1 = 19
            r4 = 33
            if (r0 == r1) goto Laa
            r1 = 20
            if (r0 == r1) goto L9a
            r1 = 62
            if (r0 == r1) goto L8f
            r6 = 92
            if (r0 == r6) goto Lb0
            r6 = 93
            if (r0 == r6) goto La0
            r6 = 122(0x7a, float:1.71E-43)
            if (r0 == r6) goto L8b
            r6 = 123(0x7b, float:1.72E-43)
            if (r0 == r6) goto L96
            goto Lb9
        L8b:
            r5.m4803g(r4)
            goto Lb9
        L8f:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto L96
            r3 = r4
        L96:
            r5.m4803g(r3)
            goto Lb9
        L9a:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto La5
        La0:
            boolean r2 = r5.m4799V(r3)
            goto Lb9
        La5:
            boolean r2 = r5.m4809u(r3)
            goto Lb9
        Laa:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto Lb5
        Lb0:
            boolean r2 = r5.m4799V(r4)
            goto Lb9
        Lb5:
            boolean r2 = r5.m4809u(r4)
        Lb9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m4794G(android.view.KeyEvent):boolean");
    }

    /* renamed from: I */
    public final void m4795I(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f8942O.m2076P(scrollY2, i - scrollY2, i2, iArr);
    }

    /* renamed from: M */
    public final void m4796M(int i) {
        if (getChildCount() > 0) {
            this.f8939I.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m4802f(2, 1);
            this.f8941L = getScrollY();
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC2397t8.m4115M(this);
        }
    }

    @Override // p000a.InterfaceC0546KH
    /* renamed from: N */
    public final void mo1256N(View view, int i, int i2, int i3, int i4, int i5) {
        m4795I(i4, i5, null);
    }

    @Override // p000a.InterfaceC1669fO
    /* renamed from: P */
    public final void mo3165P(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m4795I(i4, i5, iArr);
    }

    @Override // p000a.InterfaceC0546KH
    /* renamed from: Q */
    public final boolean mo1257Q(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* renamed from: S */
    public final int m4797S() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* renamed from: U */
    public final boolean m4798U(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float m3441e = AbstractC1843ih.m3441e(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f = this.f8944S * 0.015f;
        double log = Math.log(abs / f);
        double d = f8934x;
        if (((float) (Math.exp((d / (d - 1.0d)) * log) * f)) < m3441e) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public final boolean m4799V(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f8959w;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return m4811y(i, rect.top, rect.bottom);
    }

    /* renamed from: W */
    public final void m4800W() {
        this.f8937F = -1;
        this.f8936E = false;
        VelocityTracker velocityTracker = this.f8949f;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8949f = null;
        }
        m4801Y(0);
        this.f8956q.onRelease();
        this.f8953k.onRelease();
    }

    /* renamed from: Y */
    public final void m4801Y(int i) {
        this.f8942O.m2079o(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m4794G(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f8942O.m2082z(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f8942O.m2078h(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f8942O.m2081v(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f8942O.m2075N(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f8956q;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (AbstractC1485bw.m2888z(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft() + 0;
            } else {
                i = 0;
            }
            if (AbstractC1485bw.m2888z(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                AbstractC2397t8.m4115M(this);
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f8953k;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(m4797S(), scrollY) + height2;
            if (AbstractC1485bw.m2888z(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i2 = 0 + getPaddingLeft();
            }
            if (AbstractC1485bw.m2888z(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i2 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                AbstractC2397t8.m4115M(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* renamed from: f */
    public final boolean m4802f(int i, int i2) {
        return this.f8942O.m2080u(i, i2);
    }

    /* renamed from: g */
    public final void m4803g(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f8959w;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        m4811y(i, i2, i3);
    }

    @Override // android.view.View
    public final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        C2498v3 c2498v3 = this.f8947d;
        return c2498v3.f7635h | c2498v3.f7636z;
    }

    @Override // android.view.View
    public final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // p000a.InterfaceC0546KH
    /* renamed from: h */
    public final void mo1258h(View view, int i) {
        C2498v3 c2498v3 = this.f8947d;
        if (i == 1) {
            c2498v3.f7635h = 0;
        } else {
            c2498v3.f7636z = 0;
        }
        m4801Y(i);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        if (this.f8942O.m2077Q(0) == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f8942O.f3181z;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x002a  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m4804k(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.getOverScrollMode()
            r9.computeHorizontalScrollRange()
            r9.computeHorizontalScrollExtent()
            r9.computeVerticalScrollRange()
            r9.computeVerticalScrollExtent()
            r1 = 1
            r0 = 0
            int r11 = r11 + r0
            int r12 = r12 + r10
            int r13 = r13 + r0
            if (r11 <= 0) goto L1a
        L17:
            r11 = r0
            r10 = r1
            goto L1e
        L1a:
            if (r11 >= 0) goto L1d
            goto L17
        L1d:
            r10 = r0
        L1e:
            if (r12 <= r13) goto L23
            r12 = r13
        L21:
            r13 = r1
            goto L28
        L23:
            if (r12 >= 0) goto L27
            r12 = r0
            goto L21
        L27:
            r13 = r0
        L28:
            if (r13 == 0) goto L45
            a.RQ r2 = r9.f8942O
            android.view.ViewParent r2 = r2.m2077Q(r1)
            if (r2 == 0) goto L34
            r2 = r1
            goto L35
        L34:
            r2 = r0
        L35:
            if (r2 != 0) goto L45
            android.widget.OverScroller r2 = r9.f8939I
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r9.m4797S()
            r3 = r11
            r4 = r12
            r2.springBack(r3, r4, r5, r6, r7, r8)
        L45:
            r9.onOverScrolled(r11, r12, r10, r13)
            if (r10 != 0) goto L4e
            if (r13 == 0) goto L4d
            goto L4e
        L4d:
            r1 = r0
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m4804k(int, int, int, int):boolean");
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: o */
    public final int m4805o(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8958s = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int i;
        float f;
        boolean z3 = false;
        if (motionEvent.getAction() == 8 && !this.f8936E) {
            if ((motionEvent.getSource() & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f = motionEvent.getAxisValue(9);
                i = (int) motionEvent.getX();
            } else {
                if ((motionEvent.getSource() & 4194304) == 4194304) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    f = motionEvent.getAxisValue(26);
                    i = getWidth() / 2;
                } else {
                    i = 0;
                    f = 0.0f;
                }
            }
            if (f != 0.0f) {
                if (this.f8954n == 0.0f) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                        this.f8954n = typedValue.getDimension(context.getResources().getDisplayMetrics());
                    } else {
                        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                    }
                }
                int i2 = (int) (f * this.f8954n);
                if ((motionEvent.getSource() & 8194) == 8194) {
                    z3 = true;
                }
                m4808s(-i2, i, 1, z3);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0104  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.f8960y = false;
        View view = this.f8945U;
        if (view != null && m4792R(view, this)) {
            View view2 = this.f8945U;
            Rect rect = this.f8959w;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int m4805o = m4805o(rect);
            if (m4805o != 0) {
                scrollBy(0, m4805o);
            }
        }
        this.f8945U = null;
        if (!this.f8958s) {
            if (this.f8951i != null) {
                scrollTo(getScrollX(), this.f8951i.f6692S);
                this.f8951i = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f8958s = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f8957r && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m4796M((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1259v(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m4795I(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo1260z(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (rect == null) {
            findNextFocusFromRect = focusFinder.findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = focusFinder.findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || (true ^ m4810w(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2185pA)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2185pA c2185pA = (C2185pA) parcelable;
        super.onRestoreInstanceState(c2185pA.getSuperState());
        this.f8951i = c2185pA;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2185pA c2185pA = new C2185pA(super.onSaveInstanceState());
        c2185pA.f6692S = getScrollY();
        return c2185pA;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m4810w(findFocus, 0, i4)) {
            Rect rect = this.f8959w;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int m4805o = m4805o(rect);
            if (m4805o != 0) {
                if (this.f8940J) {
                    m4793E(0, m4805o, false);
                } else {
                    scrollBy(0, m4805o);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1257Q(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo1258h(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0079, code lost:
    
        if (r13.f8939I.springBack(getScrollX(), getScrollY(), 0, 0, 0, m4797S()) != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00ec, code lost:
    
        if (p000a.AbstractC1843ih.m3441e(r6) == 0.0f) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0170, code lost:
    
        if (m4798U(r6, r0) != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01a0, code lost:
    
        if (r13.f8939I.springBack(getScrollX(), getScrollY(), 0, 0, 0, m4797S()) != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x01a2, code lost:
    
        r14 = p000a.AbstractC2446u3.f7488z;
        p000a.AbstractC2397t8.m4115M(r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x017c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    public final void m4806q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f8937F) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f8950g = (int) motionEvent.getY(i);
            this.f8937F = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f8949f;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: r */
    public final boolean m4807r(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f8956q;
        if (AbstractC1843ih.m3441e(edgeEffect) != 0.0f) {
            AbstractC1843ih.m3449l(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f8953k;
        if (AbstractC1843ih.m3441e(edgeEffect2) == 0.0f) {
            return z;
        }
        AbstractC1843ih.m3449l(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f8960y) {
            Rect rect = this.f8959w;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int m4805o = m4805o(rect);
            if (m4805o != 0) {
                scrollBy(0, m4805o);
            }
        } else {
            this.f8945U = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        boolean z2;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int m4805o = m4805o(rect);
        if (m4805o != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                scrollBy(0, m4805o);
            } else {
                m4793E(0, m4805o, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f8949f) != null) {
            velocityTracker.recycle();
            this.f8949f = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f8960y = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00b3  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m4808s(int r21, int r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m4808s(int, int, int, boolean):int");
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        C0926RQ c0926rq = this.f8942O;
        if (c0926rq.f3181z) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC1548d9.m3006Y(c0926rq.f3178P);
        }
        c0926rq.f3181z = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return m4802f(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m4801Y(0);
    }

    /* renamed from: u */
    public final boolean m4809u(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int height = (int) (getHeight() * 0.5f);
        if (findNextFocus != null && m4810w(findNextFocus, height, getHeight())) {
            Rect rect = this.f8959w;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            m4808s(m4805o(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i != 130) {
                height = -height;
            }
            m4808s(height, 0, 1, true);
        }
        if (findFocus != null && findFocus.isFocused() && (!m4810w(findFocus, 0, getHeight())) != false) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // p000a.InterfaceC0546KH
    /* renamed from: v */
    public final void mo1259v(View view, int i, int i2, int[] iArr, int i3) {
        this.f8942O.m2081v(i, i2, iArr, null, i3);
    }

    /* renamed from: w */
    public final boolean m4810w(View view, int i, int i2) {
        Rect rect = this.f8959w;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    /* renamed from: y */
    public final boolean m4811y(int i, int i2, int i3) {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        if (i == 33) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                if (i2 < top && bottom < i3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (view == null) {
                    view = view2;
                    z5 = z3;
                } else {
                    if ((z && top < view.getTop()) || (!z && bottom > view.getBottom())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z5) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z5 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 >= scrollY && i3 <= i5) {
            z2 = false;
        } else {
            if (z) {
                i4 = i2 - scrollY;
            } else {
                i4 = i3 - i5;
            }
            m4808s(i4, 0, 1, true);
            z2 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z2;
    }

    @Override // p000a.InterfaceC0546KH
    /* renamed from: z */
    public final void mo1260z(View view, View view2, int i, int i2) {
        C2498v3 c2498v3 = this.f8947d;
        if (i2 == 1) {
            c2498v3.f7635h = i;
        } else {
            c2498v3.f7636z = i;
        }
        m4802f(2, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }
}
