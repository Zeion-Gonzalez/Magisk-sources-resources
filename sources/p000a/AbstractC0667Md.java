package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: a.Md */
/* loaded from: classes.dex */
public abstract class AbstractC0667Md {

    /* renamed from: G */
    public int f2160G;

    /* renamed from: M */
    public boolean f2161M;

    /* renamed from: N */
    public C2593wr f2162N;

    /* renamed from: P */
    public final C1105Ui f2163P;

    /* renamed from: Q */
    public boolean f2164Q;

    /* renamed from: R */
    public int f2165R;

    /* renamed from: S */
    public int f2166S;

    /* renamed from: V */
    public int f2167V;

    /* renamed from: W */
    public final boolean f2168W;

    /* renamed from: h */
    public RecyclerView f2169h;

    /* renamed from: o */
    public final boolean f2170o;

    /* renamed from: u */
    public boolean f2171u;

    /* renamed from: v */
    public final C1105Ui f2172v;

    /* renamed from: w */
    public int f2173w;

    /* renamed from: z */
    public C0712NQ f2174z;

    public AbstractC0667Md() {
        C2052mg c2052mg = new C2052mg(0, this);
        C2052mg c2052mg2 = new C2052mg(1, this);
        this.f2172v = new C1105Ui(c2052mg);
        this.f2163P = new C1105Ui(c2052mg2);
        this.f2164Q = false;
        this.f2171u = false;
        this.f2170o = true;
        this.f2168W = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0017, code lost:
    
        if (r5 == 1073741824) goto L38;
     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m1482E(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L1a
            if (r7 < 0) goto L11
            goto L1c
        L11:
            if (r7 != r1) goto L2f
            if (r5 == r2) goto L20
            if (r5 == 0) goto L2f
            if (r5 == r3) goto L20
            goto L2f
        L1a:
            if (r7 < 0) goto L1e
        L1c:
            r5 = r3
            goto L31
        L1e:
            if (r7 != r1) goto L22
        L20:
            r7 = r4
            goto L31
        L22:
            if (r7 != r0) goto L2f
            if (r5 == r2) goto L2c
            if (r5 != r3) goto L29
            goto L2c
        L29:
            r7 = r4
            r5 = r6
            goto L31
        L2c:
            r7 = r4
            r5 = r2
            goto L31
        L2f:
            r5 = r6
            r7 = r5
        L31:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0667Md.m1482E(int, int, int, int, boolean):int");
    }

    /* renamed from: F */
    public static int m1483F(View view) {
        return ((C0419Hv) view.getLayoutParams()).m950z();
    }

    /* renamed from: L */
    public static boolean m1484L(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    /* renamed from: Z */
    public static C2535vh m1485Z(Context context, AttributeSet attributeSet, int i, int i2) {
        C2535vh c2535vh = new C2535vh();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0317G3.f1079z, i, i2);
        c2535vh.f7764z = obtainStyledAttributes.getInt(0, 1);
        c2535vh.f7762h = obtainStyledAttributes.getInt(10, 1);
        c2535vh.f7763v = obtainStyledAttributes.getBoolean(9, false);
        c2535vh.f7761P = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return c2535vh;
    }

    /* renamed from: i */
    public static void m1486i(View view, int i, int i2, int i3, int i4) {
        C0419Hv c0419Hv = (C0419Hv) view.getLayoutParams();
        Rect rect = c0419Hv.f1395h;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0419Hv).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c0419Hv).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c0419Hv).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0419Hv).bottomMargin);
    }

    /* renamed from: u */
    public static int m1487u(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* renamed from: B */
    public void mo1488B(C1578df c1578df, C0496JN c0496jn, C1799hs c1799hs) {
        boolean canScrollVertically = this.f2169h.canScrollVertically(-1);
        AccessibilityNodeInfo accessibilityNodeInfo = c1799hs.f5654z;
        if (canScrollVertically || this.f2169h.canScrollHorizontally(-1)) {
            c1799hs.m3354z(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f2169h.canScrollVertically(1) || this.f2169h.canScrollHorizontally(1)) {
            c1799hs.m3354z(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(mo1491C(c1578df, c0496jn), mo1530f(c1578df, c0496jn), false, 0));
    }

    /* renamed from: BO */
    public final void m1489BO(int i) {
        if (m1550s(i) != null) {
            C0712NQ c0712nq = this.f2174z;
            C0872QL c0872ql = c0712nq.f2394z;
            int i2 = c0712nq.f2391P;
            if (i2 != 1) {
                if (i2 != 2) {
                    try {
                        int m1654Q = c0712nq.m1654Q(i);
                        View childAt = c0872ql.f2961z.getChildAt(m1654Q);
                        if (childAt != null) {
                            c0712nq.f2391P = 1;
                            c0712nq.f2390N = childAt;
                            if (c0712nq.f2392h.m4058Q(m1654Q)) {
                                c0712nq.m1651M(childAt);
                            }
                            c0872ql.m2007u(m1654Q);
                        }
                        return;
                    } finally {
                        c0712nq.f2391P = 0;
                        c0712nq.f2390N = null;
                    }
                }
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
    }

    /* renamed from: BX */
    public final void m1490BX(int i, int i2) {
        int m1513U = m1513U();
        if (m1513U == 0) {
            this.f2169h.m4945q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < m1513U; i7++) {
            View m1550s = m1550s(i7);
            Rect rect = this.f2169h.f9091U;
            mo1549r(m1550s, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.f2169h.f9091U.set(i6, i4, i3, i5);
        mo1495G5(this.f2169h.f9091U, i, i2);
    }

    /* renamed from: C */
    public int mo1491C(C1578df c1578df, C0496JN c0496jn) {
        return -1;
    }

    /* renamed from: D */
    public final void m1492D(View view, C1799hs c1799hs) {
        AbstractC0249El m4894j = RecyclerView.m4894j(view);
        if (m4894j == null || m4894j.m527W() || this.f2174z.m1650G(m4894j.f866z)) {
            return;
        }
        RecyclerView recyclerView = this.f2169h;
        mo1501K(recyclerView.f9128w, recyclerView.f9064BX, view, c1799hs);
    }

    /* renamed from: EC */
    public final void m1493EC(View view, C1578df c1578df) {
        C0712NQ c0712nq = this.f2174z;
        C0872QL c0872ql = c0712nq.f2394z;
        int i = c0712nq.f2391P;
        if (i != 1) {
            if (i != 2) {
                try {
                    c0712nq.f2391P = 1;
                    c0712nq.f2390N = view;
                    int indexOfChild = c0872ql.f2961z.indexOfChild(view);
                    if (indexOfChild >= 0) {
                        if (c0712nq.f2392h.m4058Q(indexOfChild)) {
                            c0712nq.m1651M(view);
                        }
                        c0872ql.m2007u(indexOfChild);
                    }
                    c0712nq.f2391P = 0;
                    c0712nq.f2390N = null;
                    c1578df.m3054W(view);
                    return;
                } catch (Throwable th) {
                    c0712nq.f2391P = 0;
                    c0712nq.f2390N = null;
                    throw th;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    /* renamed from: G */
    public abstract int mo1494G(C0496JN c0496jn);

    /* renamed from: G5 */
    public void mo1495G5(Rect rect, int i, int i2) {
        int m1529e = m1529e() + m1496H() + rect.width();
        int m1523c = m1523c() + m1518X() + rect.height();
        RecyclerView recyclerView = this.f2169h;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        this.f2169h.setMeasuredDimension(m1487u(i, m1529e, AbstractC2397t8.m4116N(recyclerView)), m1487u(i2, m1523c, AbstractC2397t8.m4117P(this.f2169h)));
    }

    /* renamed from: H */
    public final int m1496H() {
        RecyclerView recyclerView = this.f2169h;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* renamed from: HL */
    public abstract void mo1497HL(C0496JN c0496jn);

    /* renamed from: Ha */
    public abstract int mo1498Ha(int i, C1578df c1578df, C0496JN c0496jn);

    /* renamed from: I */
    public final void m1499I(C1578df c1578df) {
        int m1513U = m1513U();
        while (true) {
            m1513U--;
            if (m1513U >= 0) {
                View m1550s = m1550s(m1513U);
                AbstractC0249El m4894j = RecyclerView.m4894j(m1550s);
                if (!m4894j.m532w()) {
                    if (m4894j.m530u() && !m4894j.m527W() && !this.f2169h.f9124r.f1374h) {
                        m1489BO(m1513U);
                        c1578df.m3046G(m4894j);
                    } else {
                        m1550s(m1513U);
                        this.f2174z.m1659v(m1513U);
                        c1578df.m3047M(m1550s);
                        this.f2169h.f9106g.m2281V(m4894j);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: J */
    public final int m1500J() {
        RecyclerView recyclerView = this.f2169h;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        return AbstractC0095Bq.m199P(recyclerView);
    }

    /* renamed from: K */
    public void mo1501K(C1578df c1578df, C0496JN c0496jn, View view, C1799hs c1799hs) {
    }

    /* renamed from: Lq */
    public abstract void mo1502Lq(int i);

    /* renamed from: M */
    public abstract int mo1503M(C0496JN c0496jn);

    /* renamed from: N */
    public abstract boolean mo1504N();

    /* renamed from: O */
    public void mo1505O(int i) {
        RecyclerView recyclerView = this.f2169h;
        if (recyclerView != null) {
            int m1652N = recyclerView.f9111k.m1652N();
            for (int i2 = 0; i2 < m1652N; i2++) {
                recyclerView.f9111k.m1653P(i2).offsetTopAndBottom(i);
            }
        }
    }

    /* renamed from: O4 */
    public boolean mo1506O4() {
        return false;
    }

    /* renamed from: P */
    public abstract boolean mo1507P();

    /* renamed from: Pm */
    public final void m1508Pm(RecyclerView recyclerView) {
        m1544oI(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* renamed from: Q */
    public boolean mo1509Q(C0419Hv c0419Hv) {
        return c0419Hv != null;
    }

    /* renamed from: R */
    public abstract int mo1510R(C0496JN c0496jn);

    /* renamed from: S */
    public abstract int mo1511S(C0496JN c0496jn);

    /* renamed from: T */
    public View mo1512T(View view, int i, C1578df c1578df, C0496JN c0496jn) {
        return null;
    }

    /* renamed from: U */
    public final int m1513U() {
        C0712NQ c0712nq = this.f2174z;
        if (c0712nq != null) {
            return c0712nq.m1652N();
        }
        return 0;
    }

    /* renamed from: U8 */
    public final void m1514U8(int i, C1578df c1578df) {
        View m1550s = m1550s(i);
        m1489BO(i);
        c1578df.m3054W(m1550s);
    }

    /* renamed from: UZ */
    public final void m1515UZ(C1578df c1578df) {
        int m1513U = m1513U();
        while (true) {
            m1513U--;
            if (m1513U < 0) {
                return;
            }
            if (!RecyclerView.m4894j(m1550s(m1513U)).m532w()) {
                m1514U8(m1513U, c1578df);
            }
        }
    }

    /* renamed from: V */
    public abstract int mo1516V(C0496JN c0496jn);

    /* renamed from: W */
    public void mo1517W(int i, C2093nR c2093nR) {
    }

    /* renamed from: X */
    public final int m1518X() {
        RecyclerView recyclerView = this.f2169h;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* renamed from: Y */
    public final int m1519Y() {
        AbstractC0408Hk abstractC0408Hk;
        RecyclerView recyclerView = this.f2169h;
        if (recyclerView != null) {
            abstractC0408Hk = recyclerView.f9124r;
        } else {
            abstractC0408Hk = null;
        }
        if (abstractC0408Hk != null) {
            return abstractC0408Hk.mo918z();
        }
        return 0;
    }

    /* renamed from: Yd */
    public void mo1520Yd(int i, int i2) {
    }

    /* renamed from: ZH */
    public abstract int mo1521ZH(int i, C1578df c1578df, C0496JN c0496jn);

    /* renamed from: b */
    public void mo1522b(int i, int i2) {
    }

    /* renamed from: c */
    public final int m1523c() {
        RecyclerView recyclerView = this.f2169h;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: d */
    public void mo1524d(int i) {
        RecyclerView recyclerView = this.f2169h;
        if (recyclerView != null) {
            int m1652N = recyclerView.f9111k.m1652N();
            for (int i2 = 0; i2 < m1652N; i2++) {
                recyclerView.f9111k.m1653P(i2).offsetLeftAndRight(i);
            }
        }
    }

    /* renamed from: d2 */
    public final void m1525d2(RecyclerView recyclerView) {
        int height;
        if (recyclerView == null) {
            this.f2169h = null;
            this.f2174z = null;
            height = 0;
            this.f2165R = 0;
        } else {
            this.f2169h = recyclerView;
            this.f2174z = recyclerView.f9111k;
            this.f2165R = recyclerView.getWidth();
            height = recyclerView.getHeight();
        }
        this.f2173w = height;
        this.f2167V = 1073741824;
        this.f2166S = 1073741824;
    }

    /* renamed from: d3 */
    public abstract void mo1526d3(RecyclerView recyclerView, int i);

    /* renamed from: dG */
    public final boolean m1527dG(View view, int i, int i2, C0419Hv c0419Hv) {
        return (!view.isLayoutRequested() && this.f2170o && m1484L(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0419Hv).width) && m1484L(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c0419Hv).height)) ? false : true;
    }

    /* renamed from: dx */
    public final void m1528dx() {
        RecyclerView recyclerView = this.f2169h;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* renamed from: e */
    public final int m1529e() {
        RecyclerView recyclerView = this.f2169h;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* renamed from: f */
    public int mo1530f(C1578df c1578df, C0496JN c0496jn) {
        return -1;
    }

    /* renamed from: g */
    public C0419Hv mo1531g(Context context, AttributeSet attributeSet) {
        return new C0419Hv(context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00bb  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1532h(android.view.View r7, int r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0667Md.m1532h(android.view.View, int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a9, code lost:
    
        if (r10 == false) goto L71;
     */
    /* renamed from: he */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo1533he(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.m1496H()
            int r1 = r8.m1518X()
            int r2 = r8.f2165R
            int r3 = r8.m1529e()
            int r2 = r2 - r3
            int r3 = r8.f2173w
            int r4 = r8.m1523c()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.m1500J()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            if (r13 == 0) goto Lab
            android.view.View r10 = r9.getFocusedChild()
            if (r10 != 0) goto L74
            goto La8
        L74:
            int r11 = r8.m1496H()
            int r13 = r8.m1518X()
            int r3 = r8.f2165R
            int r4 = r8.m1529e()
            int r3 = r3 - r4
            int r4 = r8.f2173w
            int r5 = r8.m1523c()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f2169h
            android.graphics.Rect r5 = r5.f9091U
            r8.mo1549r(r10, r5)
            int r10 = r5.left
            int r10 = r10 - r2
            if (r10 >= r3) goto La8
            int r10 = r5.right
            int r10 = r10 - r2
            if (r10 <= r11) goto La8
            int r10 = r5.top
            int r10 = r10 - r1
            if (r10 >= r4) goto La8
            int r10 = r5.bottom
            int r10 = r10 - r1
            if (r10 > r13) goto La6
            goto La8
        La6:
            r10 = r7
            goto La9
        La8:
            r10 = r0
        La9:
            if (r10 == 0) goto Lb0
        Lab:
            if (r2 != 0) goto Lb1
            if (r1 == 0) goto Lb0
            goto Lb1
        Lb0:
            return r0
        Lb1:
            if (r12 == 0) goto Lb7
            r9.scrollBy(r2, r1)
            goto Lba
        Lb7:
            r9.m4934he(r2, r1, r0)
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0667Md.mo1533he(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    /* renamed from: j */
    public boolean mo1534j() {
        return false;
    }

    /* renamed from: k */
    public abstract C0419Hv mo1535k();

    /* renamed from: l */
    public void mo1536l() {
    }

    /* renamed from: m */
    public void mo1537m(int i, int i2) {
    }

    /* renamed from: n */
    public void mo1538n() {
    }

    /* renamed from: n0 */
    public final void m1539n0(C1578df c1578df) {
        Object obj;
        int size = ((ArrayList) c1578df.f4857v).size();
        int i = size - 1;
        while (true) {
            obj = c1578df.f4857v;
            if (i < 0) {
                break;
            }
            View view = ((AbstractC0249El) ((ArrayList) obj).get(i)).f866z;
            AbstractC0249El m4894j = RecyclerView.m4894j(view);
            if (!m4894j.m532w()) {
                m4894j.m524R(false);
                if (m4894j.m520M()) {
                    this.f2169h.removeDetachedView(view, false);
                }
                C1192WI c1192wi = this.f2169h.f9123qn;
                if (c1192wi != null) {
                    c1192wi.m2467u(m4894j);
                }
                m4894j.m524R(true);
                AbstractC0249El m4894j2 = RecyclerView.m4894j(view);
                m4894j2.f854R = null;
                m4894j2.f865w = false;
                m4894j2.f848G &= -33;
                c1578df.m3046G(m4894j2);
            }
            i--;
        }
        ((ArrayList) obj).clear();
        ArrayList arrayList = (ArrayList) c1578df.f4852P;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.f2169h.invalidate();
        }
    }

    /* renamed from: nB */
    public final boolean m1540nB(View view, int i, int i2, C0419Hv c0419Hv) {
        return (this.f2170o && m1484L(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0419Hv).width) && m1484L(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c0419Hv).height)) ? false : true;
    }

    /* renamed from: nF */
    public Parcelable mo1541nF() {
        return null;
    }

    /* renamed from: nP */
    public void mo1542nP(int i, int i2) {
    }

    /* renamed from: o */
    public void mo1543o(int i, int i2, C0496JN c0496jn, C2093nR c2093nR) {
    }

    /* renamed from: oI */
    public final void m1544oI(int i, int i2) {
        this.f2165R = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f2167V = mode;
        if (mode == 0 && !RecyclerView.f9057S3) {
            this.f2165R = 0;
        }
        this.f2173w = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f2166S = mode2;
        if (mode2 != 0 || RecyclerView.f9057S3) {
            return;
        }
        this.f2173w = 0;
    }

    /* renamed from: od */
    public void mo1545od(Parcelable parcelable) {
    }

    /* renamed from: p */
    public final void m1546p(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C0419Hv) view.getLayoutParams()).f1395h;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f2169h != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f2169h.f9104f;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* renamed from: q */
    public View mo1547q(int i) {
        int m1513U = m1513U();
        for (int i2 = 0; i2 < m1513U; i2++) {
            View m1550s = m1550s(i2);
            AbstractC0249El m4894j = RecyclerView.m4894j(m1550s);
            if (m4894j != null && m4894j.m531v() == i && !m4894j.m532w() && (this.f2169h.f9064BX.f1663u || !m4894j.m527W())) {
                return m1550s;
            }
        }
        return null;
    }

    /* renamed from: qn */
    public abstract void mo1548qn(C1578df c1578df, C0496JN c0496jn);

    /* renamed from: r */
    public void mo1549r(View view, Rect rect) {
        int[] iArr = RecyclerView.f9056LN;
        C0419Hv c0419Hv = (C0419Hv) view.getLayoutParams();
        Rect rect2 = c0419Hv.f1395h;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0419Hv).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0419Hv).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0419Hv).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0419Hv).bottomMargin);
    }

    /* renamed from: s */
    public final View m1550s(int i) {
        C0712NQ c0712nq = this.f2174z;
        if (c0712nq != null) {
            return c0712nq.m1653P(i);
        }
        return null;
    }

    /* renamed from: t */
    public void mo1551t(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f2169h;
        C1578df c1578df = recyclerView.f9128w;
        C0496JN c0496jn = recyclerView.f9064BX;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f2169h.canScrollVertically(-1) && !this.f2169h.canScrollHorizontally(-1) && !this.f2169h.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AbstractC0408Hk abstractC0408Hk = this.f2169h.f9124r;
            if (abstractC0408Hk != null) {
                accessibilityEvent.setItemCount(abstractC0408Hk.mo918z());
            }
        }
    }

    /* renamed from: tJ */
    public boolean mo1552tJ() {
        return false;
    }

    /* renamed from: v */
    public void mo1553v(String str) {
        RecyclerView recyclerView = this.f2169h;
        if (recyclerView != null) {
            recyclerView.m4914M(str);
        }
    }

    /* renamed from: w */
    public abstract int mo1554w(C0496JN c0496jn);

    /* renamed from: x */
    public void mo1555x(RecyclerView recyclerView) {
    }

    /* renamed from: y */
    public C0419Hv mo1556y(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0419Hv ? new C0419Hv((C0419Hv) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0419Hv((ViewGroup.MarginLayoutParams) layoutParams) : new C0419Hv(layoutParams);
    }

    /* renamed from: yF */
    public final void m1557yF(C2593wr c2593wr) {
        C2593wr c2593wr2 = this.f2162N;
        if (c2593wr2 != null && c2593wr != c2593wr2 && c2593wr2.f7955N) {
            c2593wr2.m4467W();
        }
        this.f2162N = c2593wr;
        RecyclerView recyclerView = this.f2169h;
        RunnableC0705NJ runnableC0705NJ = recyclerView.f9084Pm;
        runnableC0705NJ.f2369g.removeCallbacks(runnableC0705NJ);
        runnableC0705NJ.f2372w.abortAnimation();
        if (c2593wr.f7963o) {
            Log.w("RecyclerView", "An instance of " + c2593wr.getClass().getSimpleName() + " was started more than once. Each instance of" + c2593wr.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c2593wr.f7962h = recyclerView;
        c2593wr.f7965v = this;
        int i = c2593wr.f7967z;
        if (i != -1) {
            recyclerView.f9064BX.f1665z = i;
            c2593wr.f7955N = true;
            c2593wr.f7956P = true;
            c2593wr.f7957Q = recyclerView.f9077J.mo1547q(i);
            c2593wr.f7962h.f9084Pm.m1637h();
            c2593wr.f7963o = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    /* renamed from: zx */
    public void mo1558zx(int i) {
    }
}
