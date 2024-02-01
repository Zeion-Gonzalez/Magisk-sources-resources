package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p000a.AbstractC0207Dy;
import p000a.AbstractC1586ds;
import p000a.C0035Aj;
import p000a.C0278FI;
import p000a.C0601LF;
import p000a.C0817PD;
import p000a.C1117Uu;
import p000a.C1665fK;
import p000a.C2189pE;
import p000a.C2192pI;
import p000a.C2384ss;
import p000a.InterfaceC0108C6;
import p000a.InterfaceC0656MP;
import p000a.InterfaceC0949Rq;
import p000a.InterfaceC1653f5;
import p000a.InterfaceC1811i6;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC0207Dy implements InterfaceC0949Rq, InterfaceC0108C6 {

    /* renamed from: C */
    public boolean f8757C;

    /* renamed from: F */
    public int f8758F;

    /* renamed from: H */
    public C2189pE f8759H;

    /* renamed from: L */
    public InterfaceC1811i6 f8760L;

    /* renamed from: O */
    public final int f8761O;

    /* renamed from: d */
    public int f8762d;

    /* renamed from: e */
    public Context f8763e;

    /* renamed from: i */
    public boolean f8764i;

    /* renamed from: j */
    public InterfaceC0656MP f8765j;

    /* renamed from: n */
    public final int f8766n;

    /* renamed from: p */
    public C2192pI f8767p;

    /* renamed from: x */
    public C0817PD f8768x;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f652S = false;
        float f = context.getResources().getDisplayMetrics().density;
        this.f8761O = (int) (56.0f * f);
        this.f8766n = (int) (f * 4.0f);
        this.f8763e = context;
        this.f8758F = 0;
    }

    /* renamed from: S */
    public static C0601LF m4718S(ViewGroup.LayoutParams layoutParams) {
        C0601LF c0601lf;
        if (layoutParams != null) {
            if (layoutParams instanceof C0601LF) {
                c0601lf = new C0601LF((C0601LF) layoutParams);
            } else {
                c0601lf = new C0601LF(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c0601lf).gravity <= 0) {
                ((LinearLayout.LayoutParams) c0601lf).gravity = 16;
            }
            return c0601lf;
        }
        C0601LF c0601lf2 = new C0601LF();
        ((LinearLayout.LayoutParams) c0601lf2).gravity = 16;
        return c0601lf2;
    }

    @Override // p000a.AbstractC0207Dy
    /* renamed from: G */
    public final C2384ss generateLayoutParams(AttributeSet attributeSet) {
        return new C0601LF(getContext(), attributeSet);
    }

    @Override // p000a.AbstractC0207Dy
    /* renamed from: M */
    public final /* bridge */ /* synthetic */ C2384ss generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m4718S(layoutParams);
    }

    @Override // p000a.InterfaceC0108C6
    /* renamed from: N */
    public final void mo232N(C2189pE c2189pE) {
        this.f8759H = c2189pE;
    }

    @Override // p000a.InterfaceC0949Rq
    /* renamed from: Q */
    public final boolean mo2112Q(C1117Uu c1117Uu) {
        return this.f8759H.m3801q(c1117Uu, null, 0);
    }

    /* renamed from: R */
    public final C2189pE m4719R() {
        if (this.f8759H == null) {
            Context context = getContext();
            C2189pE c2189pE = new C2189pE(context);
            this.f8759H = c2189pE;
            c2189pE.f6705N = new C0035Aj(this, 0);
            C2192pI c2192pI = new C2192pI(context);
            this.f8767p = c2192pI;
            c2192pI.f6728E = true;
            c2192pI.f6741f = true;
            InterfaceC0656MP interfaceC0656MP = this.f8765j;
            if (interfaceC0656MP == null) {
                interfaceC0656MP = new C1665fK(6);
            }
            c2192pI.f6745q = interfaceC0656MP;
            this.f8759H.m3798h(c2192pI, this.f8763e);
            C2192pI c2192pI2 = this.f8767p;
            c2192pI2.f6749y = this;
            this.f8759H = c2192pI2.f6748w;
        }
        return this.f8759H;
    }

    @Override // p000a.AbstractC0207Dy
    /* renamed from: W */
    public final C2384ss generateDefaultLayoutParams() {
        C0601LF c0601lf = new C0601LF();
        ((LinearLayout.LayoutParams) c0601lf).gravity = 16;
        return c0601lf;
    }

    @Override // p000a.AbstractC0207Dy, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0601LF;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p000a.AbstractC0207Dy, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0601LF c0601lf = new C0601LF();
        ((LinearLayout.LayoutParams) c0601lf).gravity = 16;
        return c0601lf;
    }

    @Override // p000a.AbstractC0207Dy, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0601LF(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2192pI c2192pI = this.f8767p;
        if (c2192pI != null) {
            c2192pI.mo221S(false);
            if (this.f8767p.m3806M()) {
                this.f8767p.m3807Q();
                this.f8767p.m3809w();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2192pI c2192pI = this.f8767p;
        if (c2192pI != null) {
            c2192pI.m3807Q();
            C0278FI c0278fi = c2192pI.f6736X;
            if (c0278fi != null && c0278fi.m1773h()) {
                c0278fi.f2605G.dismiss();
            }
        }
    }

    @Override // p000a.AbstractC0207Dy, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        if (!this.f8764i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int i8 = this.f655f;
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean m3062z = AbstractC1586ds.m3062z(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0601LF c0601lf = (C0601LF) childAt.getLayoutParams();
                if (c0601lf.f1929z) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m4720w(i12)) {
                        measuredWidth += i8;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m3062z) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0601lf).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0601lf).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i13 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0601lf).leftMargin) + ((LinearLayout.LayoutParams) c0601lf).rightMargin;
                    m4720w(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        if (i16 > 0) {
            i5 = paddingRight / i16;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (m3062z) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                C0601LF c0601lf2 = (C0601LF) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0601lf2.f1929z) {
                    int i18 = width2 - ((LinearLayout.LayoutParams) c0601lf2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0601lf2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            C0601LF c0601lf3 = (C0601LF) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0601lf3.f1929z) {
                int i21 = paddingLeft + ((LinearLayout.LayoutParams) c0601lf3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0601lf3).rightMargin + max + i21;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // p000a.AbstractC0207Dy, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        int i6;
        int i7;
        int i8;
        ?? r4;
        boolean z6;
        int i9;
        int i10;
        int i11;
        ActionMenuItemView actionMenuItemView;
        boolean z7;
        int i12;
        boolean z8;
        C2189pE c2189pE;
        boolean z9 = this.f8764i;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.f8764i = z;
        if (z9 != z) {
            this.f8762d = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f8764i && (c2189pE = this.f8759H) != null && size != this.f8762d) {
            this.f8762d = size;
            c2189pE.m3793I(true);
        }
        int childCount = getChildCount();
        if (this.f8764i && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int size3 = View.MeasureSpec.getSize(i2);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
            int i13 = size2 - paddingRight;
            int i14 = this.f8761O;
            int i15 = i13 / i14;
            int i16 = i13 % i14;
            if (i15 == 0) {
                setMeasuredDimension(i13, 0);
                return;
            }
            int i17 = (i16 / i15) + i14;
            int childCount2 = getChildCount();
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            boolean z10 = false;
            int i22 = 0;
            long j = 0;
            while (true) {
                i3 = this.f8766n;
                if (i21 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i21);
                int i23 = size3;
                int i24 = i13;
                if (childAt.getVisibility() == 8) {
                    i10 = mode;
                    i11 = paddingBottom;
                } else {
                    boolean z11 = childAt instanceof ActionMenuItemView;
                    int i25 = i19 + 1;
                    if (z11) {
                        childAt.setPadding(i3, 0, i3, 0);
                    }
                    C0601LF c0601lf = (C0601LF) childAt.getLayoutParams();
                    c0601lf.f1926Q = false;
                    c0601lf.f1928v = 0;
                    c0601lf.f1927h = 0;
                    c0601lf.f1925P = false;
                    ((LinearLayout.LayoutParams) c0601lf).leftMargin = 0;
                    ((LinearLayout.LayoutParams) c0601lf).rightMargin = 0;
                    if (z11 && ((ActionMenuItemView) childAt).m4697q()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    c0601lf.f1924N = z6;
                    if (c0601lf.f1929z) {
                        i9 = 1;
                    } else {
                        i9 = i15;
                    }
                    C0601LF c0601lf2 = (C0601LF) childAt.getLayoutParams();
                    i10 = mode;
                    i11 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z11) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && actionMenuItemView.m4697q()) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (i9 > 0 && (!z7 || i9 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i9 * i17, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i12 = measuredWidth / i17;
                        if (measuredWidth % i17 != 0) {
                            i12++;
                        }
                        if (z7 && i12 < 2) {
                            i12 = 2;
                        }
                    } else {
                        i12 = 0;
                    }
                    if (!c0601lf2.f1929z && z7) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    c0601lf2.f1925P = z8;
                    c0601lf2.f1927h = i12;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17 * i12, 1073741824), makeMeasureSpec);
                    i20 = Math.max(i20, i12);
                    if (c0601lf.f1925P) {
                        i22++;
                    }
                    if (c0601lf.f1929z) {
                        z10 = true;
                    }
                    i15 -= i12;
                    i18 = Math.max(i18, childAt.getMeasuredHeight());
                    if (i12 == 1) {
                        j |= 1 << i21;
                    }
                    i19 = i25;
                }
                i21++;
                size3 = i23;
                i13 = i24;
                paddingBottom = i11;
                mode = i10;
            }
            int i26 = mode;
            int i27 = i13;
            int i28 = size3;
            if (z10 && i19 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z12 = false;
            while (i22 > 0 && i15 > 0) {
                int i29 = Integer.MAX_VALUE;
                int i30 = 0;
                int i31 = 0;
                long j2 = 0;
                while (i31 < childCount2) {
                    C0601LF c0601lf3 = (C0601LF) getChildAt(i31).getLayoutParams();
                    boolean z13 = z12;
                    if (c0601lf3.f1925P) {
                        int i32 = c0601lf3.f1927h;
                        if (i32 < i29) {
                            j2 = 1 << i31;
                            i29 = i32;
                            i30 = 1;
                        } else if (i32 == i29) {
                            j2 |= 1 << i31;
                            i30++;
                        }
                    }
                    i31++;
                    z12 = z13;
                }
                z3 = z12;
                j |= j2;
                if (i30 > i15) {
                    break;
                }
                int i33 = i29 + 1;
                int i34 = 0;
                while (i34 < childCount2) {
                    View childAt2 = getChildAt(i34);
                    C0601LF c0601lf4 = (C0601LF) childAt2.getLayoutParams();
                    int i35 = i18;
                    int i36 = childMeasureSpec;
                    int i37 = childCount2;
                    long j3 = 1 << i34;
                    if ((j2 & j3) == 0) {
                        if (c0601lf4.f1927h == i33) {
                            j |= j3;
                        }
                    } else {
                        if (z2 && c0601lf4.f1924N) {
                            r4 = 1;
                            r4 = 1;
                            if (i15 == 1) {
                                childAt2.setPadding(i3 + i17, 0, i3, 0);
                            }
                        } else {
                            r4 = 1;
                        }
                        c0601lf4.f1927h += r4;
                        c0601lf4.f1926Q = r4;
                        i15--;
                    }
                    i34++;
                    childMeasureSpec = i36;
                    i18 = i35;
                    childCount2 = i37;
                }
                z12 = true;
            }
            z3 = z12;
            int i38 = i18;
            int i39 = childMeasureSpec;
            int i40 = childCount2;
            if (!z10 && i19 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i15 > 0 && j != 0 && (i15 < i19 - 1 || z4 || i20 > 1)) {
                float bitCount = Long.bitCount(j);
                if (!z4) {
                    if ((j & 1) != 0 && !((C0601LF) getChildAt(0).getLayoutParams()).f1924N) {
                        bitCount -= 0.5f;
                    }
                    int i41 = i40 - 1;
                    if ((j & (1 << i41)) != 0 && !((C0601LF) getChildAt(i41).getLayoutParams()).f1924N) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i8 = (int) ((i15 * i17) / bitCount);
                } else {
                    i8 = 0;
                }
                boolean z14 = z3;
                i4 = i40;
                for (int i42 = 0; i42 < i4; i42++) {
                    if ((j & (1 << i42)) != 0) {
                        View childAt3 = getChildAt(i42);
                        C0601LF c0601lf5 = (C0601LF) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            c0601lf5.f1928v = i8;
                            c0601lf5.f1926Q = true;
                            if (i42 == 0 && !c0601lf5.f1924N) {
                                ((LinearLayout.LayoutParams) c0601lf5).leftMargin = (-i8) / 2;
                            }
                            z14 = true;
                        } else {
                            if (c0601lf5.f1929z) {
                                c0601lf5.f1928v = i8;
                                c0601lf5.f1926Q = true;
                                ((LinearLayout.LayoutParams) c0601lf5).rightMargin = (-i8) / 2;
                                z14 = true;
                            } else {
                                if (i42 != 0) {
                                    ((LinearLayout.LayoutParams) c0601lf5).leftMargin = i8 / 2;
                                }
                                if (i42 != i4 - 1) {
                                    ((LinearLayout.LayoutParams) c0601lf5).rightMargin = i8 / 2;
                                }
                            }
                        }
                    }
                }
                z5 = z14;
            } else {
                i4 = i40;
                z5 = z3;
            }
            if (z5) {
                int i43 = 0;
                while (i43 < i4) {
                    View childAt4 = getChildAt(i43);
                    C0601LF c0601lf6 = (C0601LF) childAt4.getLayoutParams();
                    if (!c0601lf6.f1926Q) {
                        i7 = i39;
                    } else {
                        i7 = i39;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0601lf6.f1927h * i17) + c0601lf6.f1928v, 1073741824), i7);
                    }
                    i43++;
                    i39 = i7;
                }
            }
            if (i26 != 1073741824) {
                i6 = i27;
                i5 = i38;
            } else {
                i5 = i28;
                i6 = i27;
            }
            setMeasuredDimension(i6, i5);
            return;
        }
        for (int i44 = 0; i44 < childCount; i44++) {
            C0601LF c0601lf7 = (C0601LF) getChildAt(i44).getLayoutParams();
            ((LinearLayout.LayoutParams) c0601lf7).rightMargin = 0;
            ((LinearLayout.LayoutParams) c0601lf7).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: w */
    public final boolean m4720w(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC1653f5)) {
            z = false | ((InterfaceC1653f5) childAt).mo3125h();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC1653f5)) ? z : z | ((InterfaceC1653f5) childAt2).mo3124P();
    }

    @Override // p000a.AbstractC0207Dy, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m4718S(layoutParams);
    }
}
