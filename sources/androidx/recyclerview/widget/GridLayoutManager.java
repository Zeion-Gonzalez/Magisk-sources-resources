package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.WeakHashMap;
import p000a.AbstractC0667Md;
import p000a.AbstractC2397t8;
import p000a.AbstractC2441tz;
import p000a.AbstractC2446u3;
import p000a.C0419Hv;
import p000a.C0496JN;
import p000a.C0963S3;
import p000a.C1578df;
import p000a.C1675fU;
import p000a.C1799hs;
import p000a.C2093nR;
import p000a.C2380sl;
import p000a.C2600wy;
import p000a.C2749zw;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: C */
    public View[] f9031C;

    /* renamed from: F */
    public int f9032F;

    /* renamed from: L */
    public final C2380sl f9033L;

    /* renamed from: X */
    public boolean f9034X;

    /* renamed from: Z */
    public int[] f9035Z;

    /* renamed from: i */
    public final Rect f9036i;

    /* renamed from: j */
    public final SparseIntArray f9037j;

    /* renamed from: p */
    public final SparseIntArray f9038p;

    public GridLayoutManager(int i) {
        super(1);
        this.f9034X = false;
        this.f9032F = -1;
        this.f9038p = new SparseIntArray();
        this.f9037j = new SparseIntArray();
        this.f9033L = new C2380sl();
        this.f9036i = new Rect();
        m4851FI(i);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: B */
    public final void mo1488B(C1578df c1578df, C0496JN c0496jn, C1799hs c1799hs) {
        super.mo1488B(c1578df, c0496jn, c1799hs);
        c1799hs.m3349W(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: BL */
    public final void mo4850BL(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo4850BL(false);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: C */
    public final int mo1491C(C1578df c1578df, C0496JN c0496jn) {
        if (this.f9041I == 0) {
            return this.f9032F;
        }
        if (c0496jn.m1190h() < 1) {
            return 0;
        }
        return m4858o2(c0496jn.m1190h() - 1, c1578df, c0496jn) + 1;
    }

    /* renamed from: FI */
    public final void m4851FI(int i) {
        if (i == this.f9032F) {
            return;
        }
        this.f9034X = true;
        if (i >= 1) {
            this.f9032F = i;
            this.f9033L.m4097P();
            m1528dx();
            return;
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4188N("Span count should be at least 1. Provided ", i));
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: G5 */
    public final void mo1495G5(Rect rect, int i, int i2) {
        int m1487u;
        int m1487u2;
        if (this.f9035Z == null) {
            super.mo1495G5(rect, i, i2);
        }
        int m1529e = m1529e() + m1496H();
        int m1523c = m1523c() + m1518X();
        if (this.f9041I == 1) {
            int height = rect.height() + m1523c;
            RecyclerView recyclerView = this.f2169h;
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            m1487u2 = AbstractC0667Md.m1487u(i2, height, AbstractC2397t8.m4117P(recyclerView));
            int[] iArr = this.f9035Z;
            m1487u = AbstractC0667Md.m1487u(i, iArr[iArr.length - 1] + m1529e, AbstractC2397t8.m4116N(this.f2169h));
        } else {
            int width = rect.width() + m1529e;
            RecyclerView recyclerView2 = this.f2169h;
            WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
            m1487u = AbstractC0667Md.m1487u(i, width, AbstractC2397t8.m4116N(recyclerView2));
            int[] iArr2 = this.f9035Z;
            m1487u2 = AbstractC0667Md.m1487u(i2, iArr2[iArr2.length - 1] + m1523c, AbstractC2397t8.m4117P(this.f2169h));
        }
        this.f2169h.setMeasuredDimension(m1487u, m1487u2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000a.AbstractC0667Md
    /* renamed from: HL */
    public final void mo1497HL(C0496JN c0496jn) {
        super.mo1497HL(c0496jn);
        this.f9034X = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000a.AbstractC0667Md
    /* renamed from: Ha */
    public final int mo1498Ha(int i, C1578df c1578df, C0496JN c0496jn) {
        m4854U7();
        View[] viewArr = this.f9031C;
        if (viewArr == null || viewArr.length != this.f9032F) {
            this.f9031C = new View[this.f9032F];
        }
        return super.mo1498Ha(i, c1578df, c0496jn);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: K */
    public final void mo1501K(C1578df c1578df, C0496JN c0496jn, View view, C1799hs c1799hs) {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C2749zw)) {
            m1492D(view, c1799hs);
            return;
        }
        C2749zw c2749zw = (C2749zw) layoutParams;
        int m4858o2 = m4858o2(c2749zw.m950z(), c1578df, c0496jn);
        int i3 = 1;
        if (this.f9041I == 0) {
            int i4 = c2749zw.f8615N;
            int i5 = c2749zw.f8616Q;
            i = m4858o2;
            m4858o2 = i4;
            i2 = 1;
            i3 = i5;
        } else {
            i = c2749zw.f8615N;
            i2 = c2749zw.f8616Q;
        }
        c1799hs.m3345G(C0963S3.m2147z(m4858o2, i3, i, i2, false));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000a.AbstractC0667Md
    /* renamed from: M */
    public final int mo1503M(C0496JN c0496jn) {
        return m4872Rh(c0496jn);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: Q */
    public final boolean mo1509Q(C0419Hv c0419Hv) {
        return c0419Hv instanceof C2749zw;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000a.AbstractC0667Md
    /* renamed from: R */
    public final int mo1510R(C0496JN c0496jn) {
        return m4872Rh(c0496jn);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: Ry */
    public final void mo4852Ry(C0496JN c0496jn, C2600wy c2600wy, C2093nR c2093nR) {
        boolean z;
        int i = this.f9032F;
        for (int i2 = 0; i2 < this.f9032F; i2++) {
            int i3 = c2600wy.f8008P;
            if (i3 >= 0 && i3 < c0496jn.m1190h()) {
                z = true;
            } else {
                z = false;
            }
            if (z && i > 0) {
                c2093nR.m3718h(c2600wy.f8008P, Math.max(0, c2600wy.f8014u));
                this.f9033L.getClass();
                i--;
                c2600wy.f8008P += c2600wy.f8007N;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x00df, code lost:
    
        if (r13 == r5) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x010f, code lost:
    
        if (r13 == r5) goto L189;
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x011b  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000a.AbstractC0667Md
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo1512T(android.view.View r23, int r24, p000a.C1578df r25, p000a.C0496JN r26) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo1512T(android.view.View, int, a.df, a.JN):android.view.View");
    }

    /* renamed from: Tf */
    public final int m4853Tf(int i, int i2) {
        if (this.f9041I != 1 || !m4880fi()) {
            int[] iArr = this.f9035Z;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f9035Z;
        int i3 = this.f9032F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: U7 */
    public final void m4854U7() {
        int m1523c;
        int m1518X;
        if (this.f9041I == 1) {
            m1523c = this.f2165R - m1529e();
            m1518X = m1496H();
        } else {
            m1523c = this.f2173w - m1523c();
            m1518X = m1518X();
        }
        m4861wC(m1523c - m1518X);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: Uf */
    public final void mo4855Uf(C1578df c1578df, C0496JN c0496jn, C1675fU c1675fU, int i) {
        boolean z;
        m4854U7();
        if (c0496jn.m1190h() > 0 && !c0496jn.f1663u) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            int m4862xe = m4862xe(c1675fU.f5241h, c1578df, c0496jn);
            if (z) {
                while (m4862xe > 0) {
                    int i2 = c1675fU.f5241h;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c1675fU.f5241h = i3;
                    m4862xe = m4862xe(i3, c1578df, c0496jn);
                }
            } else {
                int m1190h = c0496jn.m1190h() - 1;
                int i4 = c1675fU.f5241h;
                while (i4 < m1190h) {
                    int i5 = i4 + 1;
                    int m4862xe2 = m4862xe(i5, c1578df, c0496jn);
                    if (m4862xe2 <= m4862xe) {
                        break;
                    }
                    i4 = i5;
                    m4862xe = m4862xe2;
                }
                c1675fU.f5241h = i4;
            }
        }
        View[] viewArr = this.f9031C;
        if (viewArr == null || viewArr.length != this.f9032F) {
            this.f9031C = new View[this.f9032F];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000a.AbstractC0667Md
    /* renamed from: V */
    public final int mo1516V(C0496JN c0496jn) {
        return m4871M6(c0496jn);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: Yd */
    public final void mo1520Yd(int i, int i2) {
        C2380sl c2380sl = this.f9033L;
        c2380sl.m4097P();
        ((SparseIntArray) c2380sl.f7310P).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000a.AbstractC0667Md
    /* renamed from: ZH */
    public final int mo1521ZH(int i, C1578df c1578df, C0496JN c0496jn) {
        m4854U7();
        View[] viewArr = this.f9031C;
        if (viewArr == null || viewArr.length != this.f9032F) {
            this.f9031C = new View[this.f9032F];
        }
        return super.mo1521ZH(i, c1578df, c0496jn);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: b */
    public final void mo1522b(int i, int i2) {
        C2380sl c2380sl = this.f9033L;
        c2380sl.m4097P();
        ((SparseIntArray) c2380sl.f7310P).clear();
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: f */
    public final int mo1530f(C1578df c1578df, C0496JN c0496jn) {
        if (this.f9041I == 1) {
            return this.f9032F;
        }
        if (c0496jn.m1190h() < 1) {
            return 0;
        }
        return m4858o2(c0496jn.m1190h() - 1, c1578df, c0496jn) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: fc */
    public final View mo4856fc(C1578df c1578df, C0496JN c0496jn, boolean z, boolean z2) {
        int i;
        int i2;
        int m1513U = m1513U();
        int i3 = 1;
        if (z2) {
            i2 = m1513U() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = m1513U;
            i2 = 0;
        }
        int m1190h = c0496jn.m1190h();
        m4884j5();
        int mo571o = this.f9049k.mo571o();
        int mo567Q = this.f9049k.mo567Q();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View m1550s = m1550s(i2);
            int m1483F = AbstractC0667Md.m1483F(m1550s);
            if (m1483F >= 0 && m1483F < m1190h && m4862xe(m1483F, c1578df, c0496jn) == 0) {
                if (((C0419Hv) m1550s.getLayoutParams()).m949v()) {
                    if (view2 == null) {
                        view2 = m1550s;
                    }
                } else {
                    if (this.f9049k.mo566P(m1550s) < mo567Q && this.f9049k.mo570h(m1550s) >= mo571o) {
                        return m1550s;
                    }
                    if (view == null) {
                        view = m1550s;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: g */
    public final C0419Hv mo1531g(Context context, AttributeSet attributeSet) {
        return new C2749zw(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000a.AbstractC0667Md
    /* renamed from: k */
    public final C0419Hv mo1535k() {
        return this.f9041I == 0 ? new C2749zw(-2, -1) : new C2749zw(-1, -2);
    }

    /* renamed from: kr */
    public final int m4857kr(int i, C1578df c1578df, C0496JN c0496jn) {
        boolean z = c0496jn.f1663u;
        C2380sl c2380sl = this.f9033L;
        if (!z) {
            c2380sl.getClass();
            return 1;
        }
        int i2 = this.f9038p.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c1578df.m3055h(i) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        c2380sl.getClass();
        return 1;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: l */
    public final void mo1536l() {
        C2380sl c2380sl = this.f9033L;
        c2380sl.m4097P();
        ((SparseIntArray) c2380sl.f7310P).clear();
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: m */
    public final void mo1537m(int i, int i2) {
        C2380sl c2380sl = this.f9033L;
        c2380sl.m4097P();
        ((SparseIntArray) c2380sl.f7310P).clear();
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: nP */
    public final void mo1542nP(int i, int i2) {
        C2380sl c2380sl = this.f9033L;
        c2380sl.m4097P();
        ((SparseIntArray) c2380sl.f7310P).clear();
    }

    /* renamed from: o2 */
    public final int m4858o2(int i, C1578df c1578df, C0496JN c0496jn) {
        boolean z = c0496jn.f1663u;
        C2380sl c2380sl = this.f9033L;
        if (!z) {
            return c2380sl.m4100z(i, this.f9032F);
        }
        int m3055h = c1578df.m3055h(i);
        if (m3055h == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        return c2380sl.m4100z(m3055h, this.f9032F);
    }

    /* renamed from: qT */
    public final void m4859qT(View view, int i, boolean z) {
        int i2;
        int i3;
        boolean m1527dG;
        C2749zw c2749zw = (C2749zw) view.getLayoutParams();
        Rect rect = c2749zw.f1395h;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c2749zw).topMargin + ((ViewGroup.MarginLayoutParams) c2749zw).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c2749zw).leftMargin + ((ViewGroup.MarginLayoutParams) c2749zw).rightMargin;
        int m4853Tf = m4853Tf(c2749zw.f8615N, c2749zw.f8616Q);
        if (this.f9041I == 1) {
            i3 = AbstractC0667Md.m1482E(m4853Tf, i, i5, ((ViewGroup.MarginLayoutParams) c2749zw).width, false);
            i2 = AbstractC0667Md.m1482E(this.f9049k.mo569W(), this.f2166S, i4, ((ViewGroup.MarginLayoutParams) c2749zw).height, true);
        } else {
            int m1482E = AbstractC0667Md.m1482E(m4853Tf, i, i4, ((ViewGroup.MarginLayoutParams) c2749zw).height, false);
            int m1482E2 = AbstractC0667Md.m1482E(this.f9049k.mo569W(), this.f2167V, i5, ((ViewGroup.MarginLayoutParams) c2749zw).width, true);
            i2 = m1482E;
            i3 = m1482E2;
        }
        C0419Hv c0419Hv = (C0419Hv) view.getLayoutParams();
        if (z) {
            m1527dG = m1540nB(view, i3, i2, c0419Hv);
        } else {
            m1527dG = m1527dG(view, i3, i2, c0419Hv);
        }
        if (m1527dG) {
            view.measure(i3, i2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000a.AbstractC0667Md
    /* renamed from: qn */
    public final void mo1548qn(C1578df c1578df, C0496JN c0496jn) {
        boolean z = c0496jn.f1663u;
        SparseIntArray sparseIntArray = this.f9037j;
        SparseIntArray sparseIntArray2 = this.f9038p;
        if (z) {
            int m1513U = m1513U();
            for (int i = 0; i < m1513U; i++) {
                C2749zw c2749zw = (C2749zw) m1550s(i).getLayoutParams();
                int m950z = c2749zw.m950z();
                sparseIntArray2.put(m950z, c2749zw.f8616Q);
                sparseIntArray.put(m950z, c2749zw.f8615N);
            }
        }
        super.mo1548qn(c1578df, c0496jn);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000a.AbstractC0667Md
    /* renamed from: tJ */
    public final boolean mo1552tJ() {
        return this.f9044Y == null && !this.f9034X;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00b0  */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v42 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: vk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo4860vk(p000a.C1578df r19, p000a.C0496JN r20, p000a.C2600wy r21, p000a.C1045Tb r22) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo4860vk(a.df, a.JN, a.wy, a.Tb):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000a.AbstractC0667Md
    /* renamed from: w */
    public final int mo1554w(C0496JN c0496jn) {
        return m4871M6(c0496jn);
    }

    /* renamed from: wC */
    public final void m4861wC(int i) {
        int i2;
        int[] iArr = this.f9035Z;
        int i3 = this.f9032F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 > 0 && i3 - i4 < i6) {
                i2 = i5 + 1;
                i4 -= i3;
            } else {
                i2 = i5;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f9035Z = iArr;
    }

    /* renamed from: xe */
    public final int m4862xe(int i, C1578df c1578df, C0496JN c0496jn) {
        boolean z = c0496jn.f1663u;
        C2380sl c2380sl = this.f9033L;
        if (!z) {
            return c2380sl.m4098h(i, this.f9032F);
        }
        int i2 = this.f9037j.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int m3055h = c1578df.m3055h(i);
        if (m3055h == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        return c2380sl.m4098h(m3055h, this.f9032F);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: y */
    public final C0419Hv mo1556y(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2749zw((ViewGroup.MarginLayoutParams) layoutParams) : new C2749zw(layoutParams);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f9034X = false;
        this.f9032F = -1;
        this.f9038p = new SparseIntArray();
        this.f9037j = new SparseIntArray();
        this.f9033L = new C2380sl();
        this.f9036i = new Rect();
        m4851FI(AbstractC0667Md.m1485Z(context, attributeSet, i, i2).f7762h);
    }
}
