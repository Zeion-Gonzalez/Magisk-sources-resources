package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p000a.AbstractC0095Bq;
import p000a.AbstractC0481J3;
import p000a.AbstractC1131VA;
import p000a.AbstractC1285Y3;
import p000a.AbstractC1489c1;
import p000a.AbstractC1548d9;
import p000a.AbstractC1589dw;
import p000a.AbstractC1963kw;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;
import p000a.C0525Ju;
import p000a.C0759OB;
import p000a.C1168Vr;
import p000a.C2052mg;
import p000a.C2490uw;
import p000a.C2496v1;
import p000a.C2498v3;
import p000a.C2621xJ;
import p000a.C2698yx;
import p000a.InterfaceC0546KH;
import p000a.InterfaceC1594e0;
import p000a.InterfaceC1669fO;
import p000a.InterfaceC2078n6;
import p000a.ViewGroupOnHierarchyChangeListenerC2743zo;
import p000a.ViewTreeObserverOnPreDrawListenerC2587wk;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0546KH, InterfaceC1669fO {

    /* renamed from: L */
    public static final ThreadLocal f8891L;

    /* renamed from: d */
    public static final C0759OB f8892d;

    /* renamed from: i */
    public static final C2496v1 f8893i;

    /* renamed from: j */
    public static final Class[] f8894j;

    /* renamed from: p */
    public static final String f8895p;

    /* renamed from: C */
    public final C2498v3 f8896C;

    /* renamed from: E */
    public View f8897E;

    /* renamed from: F */
    public C2052mg f8898F;

    /* renamed from: H */
    public final Drawable f8899H;

    /* renamed from: I */
    public final ArrayList f8900I;

    /* renamed from: J */
    public C2621xJ f8901J;

    /* renamed from: R */
    public final C0525Ju f8902R;

    /* renamed from: S */
    public final ArrayList f8903S;

    /* renamed from: U */
    public View f8904U;

    /* renamed from: c */
    public boolean f8905c;

    /* renamed from: e */
    public ViewGroup.OnHierarchyChangeListener f8906e;

    /* renamed from: f */
    public ViewTreeObserverOnPreDrawListenerC2587wk f8907f;

    /* renamed from: g */
    public boolean f8908g;

    /* renamed from: k */
    public final int[] f8909k;

    /* renamed from: q */
    public final int[] f8910q;

    /* renamed from: r */
    public boolean f8911r;

    /* renamed from: s */
    public final int[] f8912s;

    /* renamed from: w */
    public final ArrayList f8913w;

    /* renamed from: y */
    public boolean f8914y;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f8895p = r0 != null ? r0.getName() : null;
        f8893i = new C2496v1(0);
        f8894j = new Class[]{Context.class, AttributeSet.class};
        f8891L = new ThreadLocal();
        f8892d = new C0759OB(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f8903S = new ArrayList();
        this.f8902R = new C0525Ju(2);
        this.f8913w = new ArrayList();
        this.f8900I = new ArrayList();
        this.f8910q = new int[2];
        this.f8909k = new int[2];
        this.f8896C = new C2498v3();
        int[] iArr = AbstractC1963kw.f6087z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f8912s = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f8912s[i] = (int) (r1[i] * f);
            }
        }
        this.f8899H = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        m4782f();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC2743zo(this));
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        if (AbstractC2397t8.m4129v(this) == 0) {
            AbstractC2397t8.m4123g(this, 1);
        }
    }

    /* renamed from: E */
    public static void m4771E(View view, int i) {
        C1168Vr c1168Vr = (C1168Vr) view.getLayoutParams();
        int i2 = c1168Vr.f3802G;
        if (i2 != i) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            view.offsetTopAndBottom(i - i2);
            c1168Vr.f3802G = i;
        }
    }

    /* renamed from: S */
    public static void m4772S(int i, Rect rect, Rect rect2, C1168Vr c1168Vr, int i2, int i3) {
        int width;
        int height;
        int i4 = c1168Vr.f3816v;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c1168Vr.f3806P;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            if (i8 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            if (i9 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i6 != 1) {
            if (i6 != 5) {
                width -= i2;
            }
        } else {
            width -= i2 / 2;
        }
        if (i7 != 16) {
            if (i7 != 80) {
                height -= i3;
            }
        } else {
            height -= i3 / 2;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: U */
    public static void m4773U(View view, int i) {
        C1168Vr c1168Vr = (C1168Vr) view.getLayoutParams();
        int i2 = c1168Vr.f3811W;
        if (i2 != i) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            view.offsetLeftAndRight(i - i2);
            c1168Vr.f3811W = i;
        }
    }

    /* renamed from: u */
    public static Rect m4774u() {
        Rect rect = (Rect) f8892d.mo1757z();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: w */
    public static C1168Vr m4775w(View view) {
        C1168Vr c1168Vr = (C1168Vr) view.getLayoutParams();
        if (!c1168Vr.f3812h) {
            if (view instanceof InterfaceC1594e0) {
                AbstractC1131VA mo3069z = ((InterfaceC1594e0) view).mo3069z();
                if (mo3069z == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c1168Vr.m2393h(mo3069z);
            } else {
                InterfaceC2078n6 interfaceC2078n6 = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    interfaceC2078n6 = (InterfaceC2078n6) cls.getAnnotation(InterfaceC2078n6.class);
                    if (interfaceC2078n6 != null) {
                        break;
                    }
                }
                if (interfaceC2078n6 != null) {
                    try {
                        c1168Vr.m2393h((AbstractC1131VA) interfaceC2078n6.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + interfaceC2078n6.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
            }
            c1168Vr.f3812h = true;
        }
        return c1168Vr;
    }

    /* renamed from: G */
    public final void m4776G(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m4780V(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: I */
    public final boolean m4777I(View view, int i, int i2) {
        C0759OB c0759ob = f8892d;
        Rect m4774u = m4774u();
        m4780V(view, m4774u);
        try {
            return m4774u.contains(i, i2);
        } finally {
            m4774u.setEmpty();
            c0759ob.mo1756h(m4774u);
        }
    }

    /* renamed from: M */
    public final ArrayList m4778M(View view) {
        C0525Ju c0525Ju = this.f8902R;
        int i = ((C2698yx) c0525Ju.f1763N).f8517w;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) ((C2698yx) c0525Ju.f1763N).m4620G(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((C2698yx) c0525Ju.f1763N).m4626o(i2));
            }
        }
        ArrayList arrayList3 = this.f8900I;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    @Override // p000a.InterfaceC0546KH
    /* renamed from: N */
    public final void mo1256N(View view, int i, int i2, int i3, int i4, int i5) {
        mo3165P(view, i, i2, i3, i4, 0, this.f8909k);
    }

    @Override // p000a.InterfaceC1669fO
    /* renamed from: P */
    public final void mo3165P(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC1131VA abstractC1131VA;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C1168Vr c1168Vr = (C1168Vr) childAt.getLayoutParams();
                if (c1168Vr.m2394z(i5) && (abstractC1131VA = c1168Vr.f3818z) != null) {
                    int[] iArr2 = this.f8910q;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC1131VA.mo2320V(this, childAt, i2, i3, i4, iArr2);
                    if (i3 > 0) {
                        min = Math.max(i6, iArr2[0]);
                    } else {
                        min = Math.min(i6, iArr2[0]);
                    }
                    i6 = min;
                    if (i4 > 0) {
                        min2 = Math.max(i7, iArr2[1]);
                    } else {
                        min2 = Math.min(i7, iArr2[1]);
                    }
                    i7 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            m4786q(1);
        }
    }

    @Override // p000a.InterfaceC0546KH
    /* renamed from: Q */
    public final boolean mo1257Q(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C1168Vr c1168Vr = (C1168Vr) childAt.getLayoutParams();
                AbstractC1131VA abstractC1131VA = c1168Vr.f3818z;
                if (abstractC1131VA != null) {
                    boolean mo2313I = abstractC1131VA.mo2313I(this, childAt, view, i, i2);
                    z |= mo2313I;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            c1168Vr.f3817w = mo2313I;
                        }
                    } else {
                        c1168Vr.f3808R = mo2313I;
                    }
                } else if (i2 != 0) {
                    if (i2 == 1) {
                        c1168Vr.f3817w = false;
                    }
                } else {
                    c1168Vr.f3808R = false;
                }
            }
        }
        return z;
    }

    /* renamed from: R */
    public final int m4779R(int i) {
        StringBuilder sb;
        int[] iArr = this.f8912s;
        if (iArr == null) {
            sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else {
            if (i >= 0 && i < iArr.length) {
                return iArr[i];
            }
            sb = new StringBuilder("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    /* renamed from: V */
    public final void m4780V(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC1489c1.f4627z;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC1489c1.f4627z;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC1489c1.m2891z(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC1489c1.f4626h;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: W */
    public final void m4781W(View view) {
        List list = (List) ((C2698yx) this.f8902R.f1763N).getOrDefault(view, null);
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                AbstractC1131VA abstractC1131VA = ((C1168Vr) view2.getLayoutParams()).f3818z;
                if (abstractC1131VA != null) {
                    abstractC1131VA.mo2316P(this, view2, view);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1168Vr) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC1131VA abstractC1131VA = ((C1168Vr) view.getLayoutParams()).f3818z;
        if (abstractC1131VA != null) {
            abstractC1131VA.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        boolean z = false;
        Drawable drawable = this.f8899H;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: f */
    public final void m4782f() {
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        if (AbstractC2397t8.m4124h(this)) {
            if (this.f8898F == null) {
                this.f8898F = new C2052mg(1, this);
            }
            AbstractC1548d9.m3014s(this, this.f8898F);
            setSystemUiVisibility(1280);
            return;
        }
        AbstractC1548d9.m3014s(this, null);
    }

    /* renamed from: g */
    public final void m4783g(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1168Vr();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1168Vr(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        C2498v3 c2498v3 = this.f8896C;
        return c2498v3.f7635h | c2498v3.f7636z;
    }

    @Override // android.view.View
    public final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // p000a.InterfaceC0546KH
    /* renamed from: h */
    public final void mo1258h(View view, int i) {
        C2498v3 c2498v3 = this.f8896C;
        if (i == 1) {
            c2498v3.f7635h = 0;
        } else {
            c2498v3.f7636z = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C1168Vr c1168Vr = (C1168Vr) childAt.getLayoutParams();
            if (c1168Vr.m2394z(i)) {
                AbstractC1131VA abstractC1131VA = c1168Vr.f3818z;
                if (abstractC1131VA != null) {
                    abstractC1131VA.mo2324q(this, childAt, view, i);
                }
                if (i != 0) {
                    if (i == 1) {
                        c1168Vr.f3817w = false;
                    }
                } else {
                    c1168Vr.f3808R = false;
                }
                c1168Vr.f3803I = false;
            }
        }
        this.f8897E = null;
    }

    /* renamed from: k */
    public final void m4784k(View view, int i) {
        boolean z;
        Rect m4774u;
        Rect m4774u2;
        C1168Vr c1168Vr = (C1168Vr) view.getLayoutParams();
        View view2 = c1168Vr.f3804M;
        int i2 = 0;
        if (view2 == null && c1168Vr.f3807Q != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C0759OB c0759ob = f8892d;
            if (view2 != null) {
                m4774u = m4774u();
                m4774u2 = m4774u();
                try {
                    m4780V(view2, m4774u);
                    C1168Vr c1168Vr2 = (C1168Vr) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    m4772S(i, m4774u, m4774u2, c1168Vr2, measuredWidth, measuredHeight);
                    m4785o(c1168Vr2, m4774u2, measuredWidth, measuredHeight);
                    view.layout(m4774u2.left, m4774u2.top, m4774u2.right, m4774u2.bottom);
                    return;
                } finally {
                    m4774u.setEmpty();
                    c0759ob.mo1756h(m4774u);
                    m4774u2.setEmpty();
                    c0759ob.mo1756h(m4774u2);
                }
            }
            int i3 = c1168Vr.f3805N;
            if (i3 >= 0) {
                C1168Vr c1168Vr3 = (C1168Vr) view.getLayoutParams();
                int i4 = c1168Vr3.f3816v;
                if (i4 == 0) {
                    i4 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
                int i5 = absoluteGravity & 7;
                int i6 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i3 = width - i3;
                }
                int m4779R = m4779R(i3) - measuredWidth2;
                if (i5 != 1) {
                    if (i5 == 5) {
                        m4779R += measuredWidth2;
                    }
                } else {
                    m4779R += measuredWidth2 / 2;
                }
                if (i6 != 16) {
                    if (i6 == 80) {
                        i2 = measuredHeight2 + 0;
                    }
                } else {
                    i2 = 0 + (measuredHeight2 / 2);
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1168Vr3).leftMargin, Math.min(m4779R, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c1168Vr3).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1168Vr3).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c1168Vr3).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            C1168Vr c1168Vr4 = (C1168Vr) view.getLayoutParams();
            m4774u = m4774u();
            m4774u.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1168Vr4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1168Vr4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1168Vr4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c1168Vr4).bottomMargin);
            if (this.f8901J != null) {
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                if (AbstractC2397t8.m4124h(this) && !AbstractC2397t8.m4124h(view)) {
                    m4774u.left = this.f8901J.m4519v() + m4774u.left;
                    m4774u.top = this.f8901J.m4515N() + m4774u.top;
                    m4774u.right -= this.f8901J.m4516P();
                    m4774u.bottom -= this.f8901J.m4517h();
                }
            }
            m4774u2 = m4774u();
            int i7 = c1168Vr4.f3816v;
            if ((i7 & 7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            AbstractC0481J3.m1162h(i7, view.getMeasuredWidth(), view.getMeasuredHeight(), m4774u, m4774u2, i);
            view.layout(m4774u2.left, m4774u2.top, m4774u2.right, m4774u2.bottom);
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    /* renamed from: o */
    public final void m4785o(C1168Vr c1168Vr, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1168Vr).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c1168Vr).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1168Vr).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c1168Vr).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = 0;
        m4787s(false);
        if (this.f8911r) {
            if (this.f8907f == null) {
                this.f8907f = new ViewTreeObserverOnPreDrawListenerC2587wk(i, this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f8907f);
        }
        if (this.f8901J == null) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            if (AbstractC2397t8.m4124h(this)) {
                AbstractC1589dw.m3064v(this);
            }
        }
        this.f8914y = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4787s(false);
        if (this.f8911r && this.f8907f != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f8907f);
        }
        View view = this.f8897E;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f8914y = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        super.onDraw(canvas);
        if (!this.f8905c || (drawable = this.f8899H) == null) {
            return;
        }
        C2621xJ c2621xJ = this.f8901J;
        int m4515N = c2621xJ != null ? c2621xJ.m4515N() : 0;
        if (m4515N > 0) {
            drawable.setBounds(0, 0, getWidth(), m4515N);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m4787s(true);
        }
        boolean m4788y = m4788y(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m4787s(true);
        }
        return m4788y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC1131VA abstractC1131VA;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        int m199P = AbstractC0095Bq.m199P(this);
        ArrayList arrayList = this.f8903S;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC1131VA = ((C1168Vr) view.getLayoutParams()).f3818z) == null || !abstractC1131VA.mo2323o(this, view, m199P))) {
                m4784k(view, m199P);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:254:0x007c, code lost:
    
        if (r10 != false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0360, code lost:
    
        if (r0.mo248W(r31, r20, r25, r21, r26) == false) goto L408;
     */
    /* JADX WARN: Removed duplicated region for block: B:304:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x017a A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r32, int r33) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1168Vr c1168Vr = (C1168Vr) childAt.getLayoutParams();
                if (c1168Vr.m2394z(0)) {
                    AbstractC1131VA abstractC1131VA = c1168Vr.f3818z;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC1131VA abstractC1131VA;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1168Vr c1168Vr = (C1168Vr) childAt.getLayoutParams();
                if (c1168Vr.m2394z(0) && (abstractC1131VA = c1168Vr.f3818z) != null) {
                    z |= abstractC1131VA.mo2312G(view);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1259v(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1256N(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo1260z(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C2490uw)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2490uw c2490uw = (C2490uw) parcelable;
        super.onRestoreInstanceState(c2490uw.f8021S);
        SparseArray sparseArray = c2490uw.f7624w;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC1131VA abstractC1131VA = m4775w(childAt).f3818z;
            if (id != -1 && abstractC1131VA != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC1131VA.mo2318R(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable mo2327w;
        C2490uw c2490uw = new C2490uw(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC1131VA abstractC1131VA = ((C1168Vr) childAt.getLayoutParams()).f3818z;
            if (id != -1 && abstractC1131VA != null && (mo2327w = abstractC1131VA.mo2327w(childAt)) != null) {
                sparseArray.append(id, mo2327w);
            }
        }
        c2490uw.f7624w = sparseArray;
        return c2490uw;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1257Q(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo1258h(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0012, code lost:
    
        if (r3 != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f8904U
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.m4788y(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.f8904U
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            a.Vr r6 = (p000a.C1168Vr) r6
            a.VA r6 = r6.f3818z
            if (r6 == 0) goto L29
            android.view.View r7 = r0.f8904U
            boolean r6 = r6.mo2322k(r0, r7, r1)
            goto L2a
        L29:
            r6 = r5
        L2a:
            android.view.View r7 = r0.f8904U
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.m4787s(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    public final void m4786q(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        int i10;
        C1168Vr c1168Vr;
        ArrayList arrayList2;
        int i11;
        Rect rect2;
        int i12;
        View view;
        C0759OB c0759ob;
        C1168Vr c1168Vr2;
        int i13;
        boolean z5;
        AbstractC1131VA abstractC1131VA;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        int m199P = AbstractC0095Bq.m199P(this);
        ArrayList arrayList3 = this.f8903S;
        int size = arrayList3.size();
        Rect m4774u = m4774u();
        Rect m4774u2 = m4774u();
        Rect m4774u3 = m4774u();
        int i14 = i;
        int i15 = 0;
        while (true) {
            C0759OB c0759ob2 = f8892d;
            if (i15 < size) {
                View view2 = (View) arrayList3.get(i15);
                C1168Vr c1168Vr3 = (C1168Vr) view2.getLayoutParams();
                if (i14 == 0 && view2.getVisibility() == 8) {
                    arrayList = arrayList3;
                    i3 = size;
                    rect = m4774u3;
                    i2 = i15;
                } else {
                    int i16 = 0;
                    while (i16 < i15) {
                        if (c1168Vr3.f3810V == ((View) arrayList3.get(i16))) {
                            C1168Vr c1168Vr4 = (C1168Vr) view2.getLayoutParams();
                            if (c1168Vr4.f3804M != null) {
                                Rect m4774u4 = m4774u();
                                Rect m4774u5 = m4774u();
                                arrayList2 = arrayList3;
                                Rect m4774u6 = m4774u();
                                i10 = i16;
                                m4780V(c1168Vr4.f3804M, m4774u4);
                                m4776G(view2, m4774u5, false);
                                int measuredWidth = view2.getMeasuredWidth();
                                i11 = size;
                                int measuredHeight = view2.getMeasuredHeight();
                                i12 = i15;
                                c1168Vr = c1168Vr3;
                                view = view2;
                                rect2 = m4774u3;
                                c0759ob = c0759ob2;
                                m4772S(m199P, m4774u4, m4774u6, c1168Vr4, measuredWidth, measuredHeight);
                                if (m4774u6.left == m4774u5.left && m4774u6.top == m4774u5.top) {
                                    c1168Vr2 = c1168Vr4;
                                    i13 = measuredWidth;
                                    z5 = false;
                                } else {
                                    c1168Vr2 = c1168Vr4;
                                    i13 = measuredWidth;
                                    z5 = true;
                                }
                                m4785o(c1168Vr2, m4774u6, i13, measuredHeight);
                                int i17 = m4774u6.left - m4774u5.left;
                                int i18 = m4774u6.top - m4774u5.top;
                                if (i17 != 0) {
                                    WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                                    view.offsetLeftAndRight(i17);
                                }
                                if (i18 != 0) {
                                    WeakHashMap weakHashMap3 = AbstractC2446u3.f7488z;
                                    view.offsetTopAndBottom(i18);
                                }
                                if (z5 && (abstractC1131VA = c1168Vr2.f3818z) != null) {
                                    abstractC1131VA.mo2316P(this, view, c1168Vr2.f3804M);
                                }
                                m4774u4.setEmpty();
                                c0759ob.mo1756h(m4774u4);
                                m4774u5.setEmpty();
                                c0759ob.mo1756h(m4774u5);
                                m4774u6.setEmpty();
                                c0759ob.mo1756h(m4774u6);
                                i16 = i10 + 1;
                                c0759ob2 = c0759ob;
                                view2 = view;
                                arrayList3 = arrayList2;
                                size = i11;
                                i15 = i12;
                                c1168Vr3 = c1168Vr;
                                m4774u3 = rect2;
                            }
                        }
                        i10 = i16;
                        c1168Vr = c1168Vr3;
                        arrayList2 = arrayList3;
                        i11 = size;
                        rect2 = m4774u3;
                        i12 = i15;
                        view = view2;
                        c0759ob = c0759ob2;
                        i16 = i10 + 1;
                        c0759ob2 = c0759ob;
                        view2 = view;
                        arrayList3 = arrayList2;
                        size = i11;
                        i15 = i12;
                        c1168Vr3 = c1168Vr;
                        m4774u3 = rect2;
                    }
                    C1168Vr c1168Vr5 = c1168Vr3;
                    ArrayList arrayList4 = arrayList3;
                    int i19 = size;
                    Rect rect3 = m4774u3;
                    i2 = i15;
                    View view3 = view2;
                    C0759OB c0759ob3 = c0759ob2;
                    m4776G(view3, m4774u2, true);
                    if (c1168Vr5.f3815u != 0 && !m4774u2.isEmpty()) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(c1168Vr5.f3815u, m199P);
                        int i20 = absoluteGravity & 112;
                        if (i20 != 48) {
                            if (i20 == 80) {
                                m4774u.bottom = Math.max(m4774u.bottom, getHeight() - m4774u2.top);
                            }
                        } else {
                            m4774u.top = Math.max(m4774u.top, m4774u2.bottom);
                        }
                        int i21 = absoluteGravity & 7;
                        if (i21 != 3) {
                            if (i21 == 5) {
                                m4774u.right = Math.max(m4774u.right, getWidth() - m4774u2.left);
                            }
                        } else {
                            m4774u.left = Math.max(m4774u.left, m4774u2.right);
                        }
                    }
                    if (c1168Vr5.f3813o != 0 && view3.getVisibility() == 0) {
                        WeakHashMap weakHashMap4 = AbstractC2446u3.f7488z;
                        if (AbstractC1285Y3.m2635v(view3) && view3.getWidth() > 0 && view3.getHeight() > 0) {
                            C1168Vr c1168Vr6 = (C1168Vr) view3.getLayoutParams();
                            AbstractC1131VA abstractC1131VA2 = c1168Vr6.f3818z;
                            Rect m4774u7 = m4774u();
                            Rect m4774u8 = m4774u();
                            m4774u8.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                            if (abstractC1131VA2 != null && abstractC1131VA2.mo2328z(view3, m4774u7)) {
                                if (!m4774u8.contains(m4774u7)) {
                                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + m4774u7.toShortString() + " | Bounds:" + m4774u8.toShortString());
                                }
                            } else {
                                m4774u7.set(m4774u8);
                            }
                            m4774u8.setEmpty();
                            c0759ob3.mo1756h(m4774u8);
                            if (!m4774u7.isEmpty()) {
                                int absoluteGravity2 = Gravity.getAbsoluteGravity(c1168Vr6.f3813o, m199P);
                                if ((absoluteGravity2 & 48) == 48 && (i8 = (m4774u7.top - ((ViewGroup.MarginLayoutParams) c1168Vr6).topMargin) - c1168Vr6.f3802G) < (i9 = m4774u.top)) {
                                    m4771E(view3, i9 - i8);
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - m4774u7.bottom) - ((ViewGroup.MarginLayoutParams) c1168Vr6).bottomMargin) + c1168Vr6.f3802G) < (i7 = m4774u.bottom)) {
                                    m4771E(view3, height - i7);
                                    z2 = true;
                                }
                                if (!z2) {
                                    m4771E(view3, 0);
                                }
                                if ((absoluteGravity2 & 3) == 3 && (i5 = (m4774u7.left - ((ViewGroup.MarginLayoutParams) c1168Vr6).leftMargin) - c1168Vr6.f3811W) < (i6 = m4774u.left)) {
                                    m4773U(view3, i6 - i5);
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - m4774u7.right) - ((ViewGroup.MarginLayoutParams) c1168Vr6).rightMargin) + c1168Vr6.f3811W) < (i4 = m4774u.right)) {
                                    m4773U(view3, width - i4);
                                    z4 = true;
                                } else {
                                    z4 = z3;
                                }
                                if (!z4) {
                                    m4773U(view3, 0);
                                }
                            }
                            m4774u7.setEmpty();
                            c0759ob3.mo1756h(m4774u7);
                        }
                    }
                    if (i != 2) {
                        rect = rect3;
                        rect.set(((C1168Vr) view3.getLayoutParams()).f3814q);
                        if (rect.equals(m4774u2)) {
                            arrayList = arrayList4;
                            i3 = i19;
                            i14 = i;
                        } else {
                            ((C1168Vr) view3.getLayoutParams()).f3814q.set(m4774u2);
                        }
                    } else {
                        rect = rect3;
                    }
                    int i22 = i2 + 1;
                    i3 = i19;
                    while (true) {
                        arrayList = arrayList4;
                        if (i22 >= i3) {
                            break;
                        }
                        View view4 = (View) arrayList.get(i22);
                        C1168Vr c1168Vr7 = (C1168Vr) view4.getLayoutParams();
                        AbstractC1131VA abstractC1131VA3 = c1168Vr7.f3818z;
                        if (abstractC1131VA3 != null && abstractC1131VA3.mo2321h(view4, view3)) {
                            if (i == 0 && c1168Vr7.f3803I) {
                                c1168Vr7.f3803I = false;
                            } else {
                                if (i != 2) {
                                    z = abstractC1131VA3.mo2316P(this, view4, view3);
                                } else {
                                    abstractC1131VA3.mo2315N(this, view3);
                                    z = true;
                                }
                                if (i == 1) {
                                    c1168Vr7.f3803I = z;
                                }
                            }
                        }
                        i22++;
                        arrayList4 = arrayList;
                    }
                    i14 = i;
                }
                i15 = i2 + 1;
                m4774u3 = rect;
                size = i3;
                arrayList3 = arrayList;
            } else {
                Rect rect4 = m4774u3;
                m4774u.setEmpty();
                c0759ob2.mo1756h(m4774u);
                m4774u2.setEmpty();
                c0759ob2.mo1756h(m4774u2);
                rect4.setEmpty();
                c0759ob2.mo1756h(rect4);
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC1131VA abstractC1131VA = ((C1168Vr) view.getLayoutParams()).f3818z;
        if (abstractC1131VA != null && abstractC1131VA.mo2319S(this, view, rect, z)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f8908g) {
            return;
        }
        m4787s(false);
        this.f8908g = true;
    }

    /* renamed from: s */
    public final void m4787s(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC1131VA abstractC1131VA = ((C1168Vr) childAt.getLayoutParams()).f3818z;
            if (abstractC1131VA != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC1131VA.mo2325u(this, childAt, obtain);
                } else {
                    abstractC1131VA.mo2322k(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C1168Vr) getChildAt(i2).getLayoutParams()).f3809S = false;
        }
        this.f8904U = null;
        this.f8908g = false;
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m4782f();
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f8906e = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f8899H;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        drawable.setVisible(z, false);
    }

    @Override // p000a.InterfaceC0546KH
    /* renamed from: v */
    public final void mo1259v(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC1131VA abstractC1131VA;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C1168Vr c1168Vr = (C1168Vr) childAt.getLayoutParams();
                if (c1168Vr.m2394z(i3) && (abstractC1131VA = c1168Vr.f3818z) != null) {
                    int[] iArr2 = this.f8910q;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC1131VA.mo2314M(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f8910q;
                    if (i > 0) {
                        min = Math.max(i4, iArr3[0]);
                    } else {
                        min = Math.min(i4, iArr3[0]);
                    }
                    i4 = min;
                    if (i2 > 0) {
                        min2 = Math.max(i5, iArr3[1]);
                    } else {
                        min2 = Math.min(i5, iArr3[1]);
                    }
                    i5 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            m4786q(1);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8899H;
    }

    /* renamed from: y */
    public final boolean m4788y(MotionEvent motionEvent, int i) {
        boolean z;
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f8913w;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i3);
            } else {
                i2 = i3;
            }
            arrayList.add(getChildAt(i2));
        }
        C2496v1 c2496v1 = f8893i;
        if (c2496v1 != null) {
            Collections.sort(arrayList, c2496v1);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            C1168Vr c1168Vr = (C1168Vr) view.getLayoutParams();
            AbstractC1131VA abstractC1131VA = c1168Vr.f3818z;
            if ((z2 || z3) && actionMasked != 0) {
                if (abstractC1131VA != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i != 0) {
                        if (i == 1) {
                            abstractC1131VA.mo2322k(this, view, motionEvent2);
                        }
                    } else {
                        abstractC1131VA.mo2325u(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z2 && abstractC1131VA != null) {
                    if (i != 0) {
                        if (i == 1) {
                            z2 = abstractC1131VA.mo2322k(this, view, motionEvent);
                        }
                    } else {
                        z2 = abstractC1131VA.mo2325u(this, view, motionEvent);
                    }
                    if (z2) {
                        this.f8904U = view;
                    }
                }
                if (c1168Vr.f3818z == null) {
                    c1168Vr.f3809S = false;
                }
                boolean z4 = c1168Vr.f3809S;
                if (z4) {
                    z = true;
                } else {
                    z = z4 | false;
                    c1168Vr.f3809S = z;
                }
                if (z && !z4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z && !z3) {
                    break;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    @Override // p000a.InterfaceC0546KH
    /* renamed from: z */
    public final void mo1260z(View view, View view2, int i, int i2) {
        C2498v3 c2498v3 = this.f8896C;
        if (i2 == 1) {
            c2498v3.f7635h = i;
        } else {
            c2498v3.f7636z = i;
        }
        this.f8897E = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C1168Vr) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1168Vr ? new C1168Vr((C1168Vr) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1168Vr((ViewGroup.MarginLayoutParams) layoutParams) : new C1168Vr(layoutParams);
    }
}
