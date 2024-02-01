package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;
import p000a.AbstractC0265F4;
import p000a.AbstractC0667Md;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;
import p000a.AbstractC2575wW;
import p000a.C0098Bv;
import p000a.C0419Hv;
import p000a.C0445IS;
import p000a.C0461Ij;
import p000a.C0496JN;
import p000a.C1018T5;
import p000a.C1105Ui;
import p000a.C1526cn;
import p000a.C1578df;
import p000a.C2093nR;
import p000a.C2535vh;
import p000a.C2593wr;
import p000a.InterfaceC1877jM;
import p000a.RunnableC1484bv;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0667Md implements InterfaceC1877jM {

    /* renamed from: C */
    public final C0461Ij f9134C;

    /* renamed from: E */
    public boolean f9135E;

    /* renamed from: F */
    public C0098Bv f9136F;

    /* renamed from: H */
    public final int f9137H;

    /* renamed from: I */
    public int f9138I;

    /* renamed from: L */
    public final RunnableC1484bv f9140L;

    /* renamed from: U */
    public final C1526cn f9141U;

    /* renamed from: X */
    public boolean f9142X;

    /* renamed from: Z */
    public final Rect f9144Z;

    /* renamed from: c */
    public final C1105Ui f9145c;

    /* renamed from: e */
    public boolean f9146e;

    /* renamed from: g */
    public AbstractC0265F4 f9148g;

    /* renamed from: j */
    public int[] f9149j;

    /* renamed from: k */
    public AbstractC0265F4 f9150k;

    /* renamed from: p */
    public final boolean f9151p;

    /* renamed from: q */
    public C0445IS[] f9152q;

    /* renamed from: r */
    public BitSet f9153r;

    /* renamed from: s */
    public int f9154s;

    /* renamed from: y */
    public int f9155y;

    /* renamed from: f */
    public boolean f9147f = false;

    /* renamed from: Y */
    public int f9143Y = -1;

    /* renamed from: J */
    public int f9139J = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f9138I = -1;
        this.f9135E = false;
        C1105Ui c1105Ui = new C1105Ui(1);
        this.f9145c = c1105Ui;
        this.f9137H = 2;
        this.f9144Z = new Rect();
        this.f9134C = new C0461Ij(this);
        this.f9151p = true;
        this.f9140L = new RunnableC1484bv(1, this);
        C2535vh m1485Z = AbstractC0667Md.m1485Z(context, attributeSet, i, i2);
        int i3 = m1485Z.f7764z;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo1553v(null);
        if (i3 != this.f9155y) {
            this.f9155y = i3;
            AbstractC0265F4 abstractC0265F4 = this.f9150k;
            this.f9150k = this.f9148g;
            this.f9148g = abstractC0265F4;
            m1528dx();
        }
        int i4 = m1485Z.f7762h;
        mo1553v(null);
        if (i4 != this.f9138I) {
            c1105Ui.m2278P();
            m1528dx();
            this.f9138I = i4;
            this.f9153r = new BitSet(this.f9138I);
            this.f9152q = new C0445IS[this.f9138I];
            for (int i5 = 0; i5 < this.f9138I; i5++) {
                this.f9152q[i5] = new C0445IS(this, i5);
            }
            m1528dx();
        }
        boolean z = m1485Z.f7763v;
        mo1553v(null);
        C0098Bv c0098Bv = this.f9136F;
        if (c0098Bv != null && c0098Bv.f368y != z) {
            c0098Bv.f368y = z;
        }
        this.f9135E = z;
        m1528dx();
        this.f9141U = new C1526cn();
        this.f9150k = AbstractC0265F4.m562z(this, this.f9155y);
        this.f9148g = AbstractC0265F4.m562z(this, 1 - this.f9155y);
    }

    /* renamed from: cH */
    public static int m4952cH(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: BL */
    public final void m4953BL(C0445IS c0445is, int i, int i2) {
        int i3 = c0445is.f1484P;
        if (i == -1) {
            int i4 = c0445is.f1486h;
            if (i4 == Integer.MIN_VALUE) {
                View view = (View) c0445is.f1488z.get(0);
                C1018T5 m1062o = C0445IS.m1062o(view);
                c0445is.f1486h = c0445is.f1485Q.f9150k.mo566P(view);
                m1062o.getClass();
                i4 = c0445is.f1486h;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = c0445is.f1487v;
            if (i5 == Integer.MIN_VALUE) {
                c0445is.m1070z();
                i5 = c0445is.f1487v;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.f9153r.set(c0445is.f1483N, false);
    }

    /* renamed from: EQ */
    public final int m4954EQ(int i) {
        if (m1513U() == 0) {
            return this.f9147f ? 1 : -1;
        }
        return (i < m4969W9()) != this.f9147f ? -1 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x00cb, code lost:
    
        if (r10 == r11) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00dd, code lost:
    
        if (r10 == r11) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00df, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00e1, code lost:
    
        r10 = false;
     */
    /* renamed from: F3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View m4955F3() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4955F3():android.view.View");
    }

    /* renamed from: FE */
    public final void m4956FE() {
        this.f9147f = (this.f9155y == 1 || !m4973gv()) ? this.f9135E : !this.f9135E;
    }

    /* renamed from: Fu */
    public final int m4957Fu(C0496JN c0496jn) {
        if (m1513U() == 0) {
            return 0;
        }
        AbstractC0265F4 abstractC0265F4 = this.f9150k;
        boolean z = this.f9151p;
        return AbstractC2575wW.m4416W(c0496jn, abstractC0265F4, m4980zd(!z), m4976j5(!z), this, this.f9151p);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: G */
    public final int mo1494G(C0496JN c0496jn) {
        return m4957Fu(c0496jn);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: G5 */
    public final void mo1495G5(Rect rect, int i, int i2) {
        int m1487u;
        int m1487u2;
        int m1529e = m1529e() + m1496H();
        int m1523c = m1523c() + m1518X();
        if (this.f9155y == 1) {
            int height = rect.height() + m1523c;
            RecyclerView recyclerView = this.f2169h;
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            m1487u2 = AbstractC0667Md.m1487u(i2, height, AbstractC2397t8.m4117P(recyclerView));
            m1487u = AbstractC0667Md.m1487u(i, (this.f9154s * this.f9138I) + m1529e, AbstractC2397t8.m4116N(this.f2169h));
        } else {
            int width = rect.width() + m1529e;
            RecyclerView recyclerView2 = this.f2169h;
            WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
            m1487u = AbstractC0667Md.m1487u(i, width, AbstractC2397t8.m4116N(recyclerView2));
            m1487u2 = AbstractC0667Md.m1487u(i2, (this.f9154s * this.f9138I) + m1523c, AbstractC2397t8.m4117P(this.f2169h));
        }
        this.f2169h.setMeasuredDimension(m1487u, m1487u2);
    }

    /* renamed from: GV */
    public final void m4958GV(int i, C0496JN c0496jn) {
        boolean z;
        int i2;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        C1526cn c1526cn = this.f9141U;
        boolean z4 = false;
        c1526cn.f4714h = 0;
        c1526cn.f4717v = i;
        C2593wr c2593wr = this.f2162N;
        if (c2593wr != null && c2593wr.f7955N) {
            z = true;
        } else {
            z = false;
        }
        if (z && (i4 = c0496jn.f1665z) != -1) {
            boolean z5 = this.f9147f;
            if (i4 < i) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z5 == z3) {
                i2 = this.f9150k.mo569W();
                i3 = 0;
            } else {
                i3 = this.f9150k.mo569W();
                i2 = 0;
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        RecyclerView recyclerView = this.f2169h;
        if (recyclerView != null && recyclerView.f9130y) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            c1526cn.f4712Q = this.f9150k.mo571o() - i3;
            c1526cn.f4716u = this.f9150k.mo567Q() + i2;
        } else {
            c1526cn.f4716u = this.f9150k.mo565N() + i2;
            c1526cn.f4712Q = -i3;
        }
        c1526cn.f4715o = false;
        c1526cn.f4718z = true;
        if (this.f9150k.mo572u() == 0 && this.f9150k.mo565N() == 0) {
            z4 = true;
        }
        c1526cn.f4713W = z4;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: HL */
    public final void mo1497HL(C0496JN c0496jn) {
        this.f9143Y = -1;
        this.f9139J = Integer.MIN_VALUE;
        this.f9136F = null;
        this.f9134C.m1120z();
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: Ha */
    public final int mo1498Ha(int i, C1578df c1578df, C0496JN c0496jn) {
        return m4979x3(i, c1578df, c0496jn);
    }

    /* renamed from: JG */
    public final void m4959JG(int i) {
        C1526cn c1526cn = this.f9141U;
        c1526cn.f4710N = i;
        c1526cn.f4711P = this.f9147f != (i == -1) ? -1 : 1;
    }

    /* renamed from: KM */
    public final int m4960KM(int i) {
        int m1066W = this.f9152q[0].m1066W(i);
        for (int i2 = 1; i2 < this.f9138I; i2++) {
            int m1066W2 = this.f9152q[i2].m1066W(i);
            if (m1066W2 < m1066W) {
                m1066W = m1066W2;
            }
        }
        return m1066W;
    }

    /* renamed from: LN */
    public final void m4961LN(C1578df c1578df, C0496JN c0496jn, boolean z) {
        int mo571o;
        int m4960KM = m4960KM(Integer.MAX_VALUE);
        if (m4960KM != Integer.MAX_VALUE && (mo571o = m4960KM - this.f9150k.mo571o()) > 0) {
            int m4979x3 = mo571o - m4979x3(mo571o, c1578df, c0496jn);
            if (!z || m4979x3 <= 0) {
                return;
            }
            this.f9150k.mo568V(-m4979x3);
        }
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: Lq */
    public final void mo1502Lq(int i) {
        C0098Bv c0098Bv = this.f9136F;
        if (c0098Bv != null && c0098Bv.f361S != i) {
            c0098Bv.f359I = null;
            c0098Bv.f367w = 0;
            c0098Bv.f361S = -1;
            c0098Bv.f360R = -1;
        }
        this.f9143Y = i;
        this.f9139J = Integer.MIN_VALUE;
        m1528dx();
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: M */
    public final int mo1503M(C0496JN c0496jn) {
        return m4963Rh(c0496jn);
    }

    /* renamed from: M6 */
    public final int m4962M6(C0496JN c0496jn) {
        if (m1513U() == 0) {
            return 0;
        }
        AbstractC0265F4 abstractC0265F4 = this.f9150k;
        boolean z = this.f9151p;
        return AbstractC2575wW.m4402M(c0496jn, abstractC0265F4, m4980zd(!z), m4976j5(!z), this, this.f9151p);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: N */
    public final boolean mo1504N() {
        return this.f9155y == 1;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: O */
    public final void mo1505O(int i) {
        super.mo1505O(i);
        for (int i2 = 0; i2 < this.f9138I; i2++) {
            C0445IS c0445is = this.f9152q[i2];
            int i3 = c0445is.f1486h;
            if (i3 != Integer.MIN_VALUE) {
                c0445is.f1486h = i3 + i;
            }
            int i4 = c0445is.f1487v;
            if (i4 != Integer.MIN_VALUE) {
                c0445is.f1487v = i4 + i;
            }
        }
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: P */
    public final boolean mo1507P() {
        return this.f9155y == 0;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: Q */
    public final boolean mo1509Q(C0419Hv c0419Hv) {
        return c0419Hv instanceof C1018T5;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: R */
    public final int mo1510R(C0496JN c0496jn) {
        return m4963Rh(c0496jn);
    }

    /* renamed from: Rh */
    public final int m4963Rh(C0496JN c0496jn) {
        if (m1513U() == 0) {
            return 0;
        }
        AbstractC0265F4 abstractC0265F4 = this.f9150k;
        boolean z = this.f9151p;
        return AbstractC2575wW.m4394G(c0496jn, abstractC0265F4, m4980zd(!z), m4976j5(!z), this, this.f9151p, this.f9147f);
    }

    /* renamed from: Ry */
    public final boolean m4964Ry() {
        int m4969W9;
        if (m1513U() != 0 && this.f9137H != 0 && this.f2171u) {
            if (this.f9147f) {
                m4969W9 = m4965S3();
                m4969W9();
            } else {
                m4969W9 = m4969W9();
                m4965S3();
            }
            if (m4969W9 == 0 && m4955F3() != null) {
                this.f9145c.m2278P();
                this.f2164Q = true;
                m1528dx();
                return true;
            }
        }
        return false;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: S */
    public final int mo1511S(C0496JN c0496jn) {
        return m4957Fu(c0496jn);
    }

    /* renamed from: S3 */
    public final int m4965S3() {
        int m1513U = m1513U();
        if (m1513U == 0) {
            return 0;
        }
        return AbstractC0667Md.m1483F(m1550s(m1513U - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x004a, code lost:
    
        if (r8.f9155y == 1) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x004f, code lost:
    
        if (r8.f9155y == 0) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x005d, code lost:
    
        if (m4973gv() == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0069, code lost:
    
        if (m4973gv() == false) goto L195;
     */
    @Override // p000a.AbstractC0667Md
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo1512T(android.view.View r9, int r10, p000a.C1578df r11, p000a.C0496JN r12) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1512T(android.view.View, int, a.df, a.JN):android.view.View");
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* renamed from: T0 */
    public final int m4966T0(C1578df c1578df, C1526cn c1526cn, C0496JN c0496jn) {
        int i;
        int mo571o;
        int i2;
        int m4975hs;
        int i3;
        int i4;
        C0445IS c0445is;
        ?? r8;
        int m1482E;
        int i5;
        int m1482E2;
        int m1066W;
        int mo573v;
        int mo571o2;
        int mo573v2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        int i11 = 1;
        this.f9153r.set(0, this.f9138I, true);
        C1526cn c1526cn2 = this.f9141U;
        if (c1526cn2.f4713W) {
            if (c1526cn.f4710N == 1) {
                i = Integer.MAX_VALUE;
            } else {
                i = Integer.MIN_VALUE;
            }
        } else if (c1526cn.f4710N == 1) {
            i = c1526cn.f4716u + c1526cn.f4714h;
        } else {
            i = c1526cn.f4712Q - c1526cn.f4714h;
        }
        int i12 = c1526cn.f4710N;
        for (int i13 = 0; i13 < this.f9138I; i13++) {
            if (!this.f9152q[i13].f1488z.isEmpty()) {
                m4953BL(this.f9152q[i13], i12, i);
            }
        }
        if (this.f9147f) {
            mo571o = this.f9150k.mo567Q();
        } else {
            mo571o = this.f9150k.mo571o();
        }
        boolean z = false;
        while (true) {
            int i14 = c1526cn.f4717v;
            if (i14 >= 0 && i14 < c0496jn.m1190h()) {
                i2 = i11;
            } else {
                i2 = i10;
            }
            if (i2 == 0 || (!c1526cn2.f4713W && this.f9153r.isEmpty())) {
                break;
            }
            View m3049P = c1578df.m3049P(c1526cn.f4717v);
            c1526cn.f4717v += c1526cn.f4711P;
            C1018T5 c1018t5 = (C1018T5) m3049P.getLayoutParams();
            int m950z = c1018t5.m950z();
            C1105Ui c1105Ui = this.f9145c;
            int[] iArr = (int[]) c1105Ui.f3594h;
            if (iArr != null && m950z < iArr.length) {
                i3 = iArr[m950z];
            } else {
                i3 = -1;
            }
            if (i3 == -1) {
                i4 = i11;
            } else {
                i4 = i10;
            }
            if (i4 != 0) {
                if (m4977lz(c1526cn.f4710N)) {
                    i9 = this.f9138I - i11;
                    i8 = -1;
                    i7 = -1;
                } else {
                    i7 = i11;
                    i8 = this.f9138I;
                    i9 = i10;
                }
                C0445IS c0445is2 = null;
                if (c1526cn.f4710N == i11) {
                    int mo571o3 = this.f9150k.mo571o();
                    int i15 = Integer.MAX_VALUE;
                    while (i9 != i8) {
                        C0445IS c0445is3 = this.f9152q[i9];
                        int m1065Q = c0445is3.m1065Q(mo571o3);
                        if (m1065Q < i15) {
                            i15 = m1065Q;
                            c0445is2 = c0445is3;
                        }
                        i9 += i7;
                    }
                } else {
                    int mo567Q = this.f9150k.mo567Q();
                    int i16 = Integer.MIN_VALUE;
                    while (i9 != i8) {
                        C0445IS c0445is4 = this.f9152q[i9];
                        int m1066W2 = c0445is4.m1066W(mo567Q);
                        if (m1066W2 > i16) {
                            c0445is2 = c0445is4;
                            i16 = m1066W2;
                        }
                        i9 += i7;
                    }
                }
                c0445is = c0445is2;
                c1105Ui.m2277N(m950z);
                ((int[]) c1105Ui.f3594h)[m950z] = c0445is.f1483N;
            } else {
                c0445is = this.f9152q[i3];
            }
            c1018t5.f3411N = c0445is;
            if (c1526cn.f4710N == 1) {
                r8 = 0;
                m1532h(m3049P, -1, false);
            } else {
                r8 = 0;
                m1532h(m3049P, 0, false);
            }
            if (this.f9155y == 1) {
                m1482E = AbstractC0667Md.m1482E(this.f9154s, this.f2167V, r8, ((ViewGroup.MarginLayoutParams) c1018t5).width, r8);
                m1482E2 = AbstractC0667Md.m1482E(this.f2173w, this.f2166S, m1523c() + m1518X(), ((ViewGroup.MarginLayoutParams) c1018t5).height, true);
                i5 = 0;
            } else {
                m1482E = AbstractC0667Md.m1482E(this.f2165R, this.f2167V, m1529e() + m1496H(), ((ViewGroup.MarginLayoutParams) c1018t5).width, true);
                i5 = 0;
                m1482E2 = AbstractC0667Md.m1482E(this.f9154s, this.f2166S, 0, ((ViewGroup.MarginLayoutParams) c1018t5).height, false);
            }
            RecyclerView recyclerView = this.f2169h;
            Rect rect = this.f9144Z;
            if (recyclerView == null) {
                rect.set(i5, i5, i5, i5);
            } else {
                rect.set(recyclerView.m4913L(m3049P));
            }
            C1018T5 c1018t52 = (C1018T5) m3049P.getLayoutParams();
            int m4952cH = m4952cH(m1482E, ((ViewGroup.MarginLayoutParams) c1018t52).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c1018t52).rightMargin + rect.right);
            int m4952cH2 = m4952cH(m1482E2, ((ViewGroup.MarginLayoutParams) c1018t52).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c1018t52).bottomMargin + rect.bottom);
            if (m1527dG(m3049P, m4952cH, m4952cH2, c1018t52)) {
                m3049P.measure(m4952cH, m4952cH2);
            }
            if (c1526cn.f4710N == 1) {
                mo573v = c0445is.m1065Q(mo571o);
                m1066W = this.f9150k.mo573v(m3049P) + mo573v;
            } else {
                m1066W = c0445is.m1066W(mo571o);
                mo573v = m1066W - this.f9150k.mo573v(m3049P);
            }
            int i17 = c1526cn.f4710N;
            C0445IS c0445is5 = c1018t5.f3411N;
            c0445is5.getClass();
            if (i17 == 1) {
                C1018T5 c1018t53 = (C1018T5) m3049P.getLayoutParams();
                c1018t53.f3411N = c0445is5;
                ArrayList arrayList = c0445is5.f1488z;
                arrayList.add(m3049P);
                c0445is5.f1487v = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c0445is5.f1486h = Integer.MIN_VALUE;
                }
                if (c1018t53.m949v() || c1018t53.m948h()) {
                    c0445is5.f1484P = c0445is5.f1485Q.f9150k.mo573v(m3049P) + c0445is5.f1484P;
                }
            } else {
                C1018T5 c1018t54 = (C1018T5) m3049P.getLayoutParams();
                c1018t54.f3411N = c0445is5;
                ArrayList arrayList2 = c0445is5.f1488z;
                arrayList2.add(0, m3049P);
                c0445is5.f1486h = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c0445is5.f1487v = Integer.MIN_VALUE;
                }
                if (c1018t54.m949v() || c1018t54.m948h()) {
                    c0445is5.f1484P = c0445is5.f1485Q.f9150k.mo573v(m3049P) + c0445is5.f1484P;
                }
            }
            if (m4973gv() && this.f9155y == 1) {
                mo573v2 = this.f9148g.mo567Q() - (((this.f9138I - 1) - c0445is.f1483N) * this.f9154s);
                mo571o2 = mo573v2 - this.f9148g.mo573v(m3049P);
            } else {
                mo571o2 = this.f9148g.mo571o() + (c0445is.f1483N * this.f9154s);
                mo573v2 = this.f9148g.mo573v(m3049P) + mo571o2;
            }
            if (this.f9155y == 1) {
                int i18 = mo571o2;
                mo571o2 = mo573v;
                mo573v = i18;
                int i19 = mo573v2;
                mo573v2 = m1066W;
                m1066W = i19;
            }
            AbstractC0667Md.m1486i(m3049P, mo573v, mo571o2, m1066W, mo573v2);
            m4953BL(c0445is, c1526cn2.f4710N, i);
            m4978vk(c1578df, c1526cn2);
            if (c1526cn2.f4715o && m3049P.hasFocusable()) {
                i6 = 0;
                this.f9153r.set(c0445is.f1483N, false);
            } else {
                i6 = 0;
            }
            i10 = i6;
            i11 = 1;
            z = true;
        }
        int i20 = i10;
        if (!z) {
            m4978vk(c1578df, c1526cn2);
        }
        if (c1526cn2.f4710N == -1) {
            m4975hs = this.f9150k.mo571o() - m4960KM(this.f9150k.mo571o());
        } else {
            m4975hs = m4975hs(this.f9150k.mo567Q()) - this.f9150k.mo567Q();
        }
        if (m4975hs > 0) {
            return Math.min(c1526cn.f4714h, m4975hs);
        }
        return i20;
    }

    /* renamed from: Uf */
    public final void m4967Uf(int i, C1578df c1578df) {
        for (int m1513U = m1513U() - 1; m1513U >= 0; m1513U--) {
            View m1550s = m1550s(m1513U);
            if (this.f9150k.mo566P(m1550s) >= i && this.f9150k.mo564M(m1550s) >= i) {
                C1018T5 c1018t5 = (C1018T5) m1550s.getLayoutParams();
                c1018t5.getClass();
                if (c1018t5.f3411N.f1488z.size() == 1) {
                    return;
                }
                C0445IS c0445is = c1018t5.f3411N;
                ArrayList arrayList = c0445is.f1488z;
                int size = arrayList.size();
                View view = (View) arrayList.remove(size - 1);
                C1018T5 m1062o = C0445IS.m1062o(view);
                m1062o.f3411N = null;
                if (m1062o.m949v() || m1062o.m948h()) {
                    c0445is.f1484P -= c0445is.f1485Q.f9150k.mo573v(view);
                }
                if (size == 1) {
                    c0445is.f1486h = Integer.MIN_VALUE;
                }
                c0445is.f1487v = Integer.MIN_VALUE;
                m1493EC(m1550s, c1578df);
            } else {
                return;
            }
        }
    }

    /* renamed from: Ux */
    public final void m4968Ux(int i, C1578df c1578df) {
        while (m1513U() > 0) {
            View m1550s = m1550s(0);
            if (this.f9150k.mo570h(m1550s) <= i && this.f9150k.mo563G(m1550s) <= i) {
                C1018T5 c1018t5 = (C1018T5) m1550s.getLayoutParams();
                c1018t5.getClass();
                if (c1018t5.f3411N.f1488z.size() == 1) {
                    return;
                }
                C0445IS c0445is = c1018t5.f3411N;
                ArrayList arrayList = c0445is.f1488z;
                View view = (View) arrayList.remove(0);
                C1018T5 m1062o = C0445IS.m1062o(view);
                m1062o.f3411N = null;
                if (arrayList.size() == 0) {
                    c0445is.f1487v = Integer.MIN_VALUE;
                }
                if (m1062o.m949v() || m1062o.m948h()) {
                    c0445is.f1484P -= c0445is.f1485Q.f9150k.mo573v(view);
                }
                c0445is.f1486h = Integer.MIN_VALUE;
                m1493EC(m1550s, c1578df);
            } else {
                return;
            }
        }
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: V */
    public final int mo1516V(C0496JN c0496jn) {
        return m4962M6(c0496jn);
    }

    /* renamed from: W9 */
    public final int m4969W9() {
        if (m1513U() == 0) {
            return 0;
        }
        return AbstractC0667Md.m1483F(m1550s(0));
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: Yd */
    public final void mo1520Yd(int i, int i2) {
        m4971fc(i, i2, 4);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: ZH */
    public final int mo1521ZH(int i, C1578df c1578df, C0496JN c0496jn) {
        return m4979x3(i, c1578df, c0496jn);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: b */
    public final void mo1522b(int i, int i2) {
        m4971fc(i, i2, 8);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: d */
    public final void mo1524d(int i) {
        super.mo1524d(i);
        for (int i2 = 0; i2 < this.f9138I; i2++) {
            C0445IS c0445is = this.f9152q[i2];
            int i3 = c0445is.f1486h;
            if (i3 != Integer.MIN_VALUE) {
                c0445is.f1486h = i3 + i;
            }
            int i4 = c0445is.f1487v;
            if (i4 != Integer.MIN_VALUE) {
                c0445is.f1487v = i4 + i;
            }
        }
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: d3 */
    public final void mo1526d3(RecyclerView recyclerView, int i) {
        C2593wr c2593wr = new C2593wr(recyclerView.getContext());
        c2593wr.f7967z = i;
        m1557yF(c2593wr);
    }

    /* renamed from: fH */
    public final void m4970fH(C1578df c1578df, C0496JN c0496jn, boolean z) {
        int mo567Q;
        int m4975hs = m4975hs(Integer.MIN_VALUE);
        if (m4975hs != Integer.MIN_VALUE && (mo567Q = this.f9150k.mo567Q() - m4975hs) > 0) {
            int i = mo567Q - (-m4979x3(-mo567Q, c1578df, c0496jn));
            if (!z || i <= 0) {
                return;
            }
            this.f9150k.mo568V(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003c  */
    /* renamed from: fc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4971fc(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f9147f
            if (r0 == 0) goto L9
            int r0 = r7.m4965S3()
            goto Ld
        L9:
            int r0 = r7.m4969W9()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1a
            if (r8 >= r9) goto L16
            int r2 = r9 + 1
            goto L1c
        L16:
            int r2 = r8 + 1
            r3 = r9
            goto L1d
        L1a:
            int r2 = r8 + r9
        L1c:
            r3 = r8
        L1d:
            a.Ui r4 = r7.f9145c
            r4.m2285u(r3)
            r5 = 1
            if (r10 == r5) goto L36
            r6 = 2
            if (r10 == r6) goto L32
            if (r10 == r1) goto L2b
            goto L39
        L2b:
            r4.m2275G(r8, r5)
            r4.m2282W(r9, r5)
            goto L39
        L32:
            r4.m2275G(r8, r9)
            goto L39
        L36:
            r4.m2282W(r8, r9)
        L39:
            if (r2 > r0) goto L3c
            return
        L3c:
            boolean r8 = r7.f9147f
            if (r8 == 0) goto L45
            int r8 = r7.m4969W9()
            goto L49
        L45:
            int r8 = r7.m4965S3()
        L49:
            if (r3 > r8) goto L4e
            r7.m1528dx()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4971fc(int, int, int):void");
    }

    /* renamed from: fi */
    public final void m4972fi(int i, C0496JN c0496jn) {
        int m4969W9;
        int i2;
        if (i > 0) {
            m4969W9 = m4965S3();
            i2 = 1;
        } else {
            m4969W9 = m4969W9();
            i2 = -1;
        }
        C1526cn c1526cn = this.f9141U;
        c1526cn.f4718z = true;
        m4958GV(m4969W9, c0496jn);
        m4959JG(i2);
        c1526cn.f4717v = m4969W9 + c1526cn.f4711P;
        c1526cn.f4714h = Math.abs(i);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: g */
    public final C0419Hv mo1531g(Context context, AttributeSet attributeSet) {
        return new C1018T5(context, attributeSet);
    }

    /* renamed from: gv */
    public final boolean m4973gv() {
        return m1500J() == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:547:0x03eb, code lost:
    
        if (m4964Ry() != false) goto L550;
     */
    /* JADX WARN: Removed duplicated region for block: B:412:0x01be  */
    /* renamed from: hW */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4974hW(p000a.C1578df r17, p000a.C0496JN r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4974hW(a.df, a.JN, boolean):void");
    }

    /* renamed from: hs */
    public final int m4975hs(int i) {
        int m1065Q = this.f9152q[0].m1065Q(i);
        for (int i2 = 1; i2 < this.f9138I; i2++) {
            int m1065Q2 = this.f9152q[i2].m1065Q(i);
            if (m1065Q2 > m1065Q) {
                m1065Q = m1065Q2;
            }
        }
        return m1065Q;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: j */
    public final boolean mo1534j() {
        return this.f9137H != 0;
    }

    /* renamed from: j5 */
    public final View m4976j5(boolean z) {
        int mo571o = this.f9150k.mo571o();
        int mo567Q = this.f9150k.mo567Q();
        View view = null;
        for (int m1513U = m1513U() - 1; m1513U >= 0; m1513U--) {
            View m1550s = m1550s(m1513U);
            int mo566P = this.f9150k.mo566P(m1550s);
            int mo570h = this.f9150k.mo570h(m1550s);
            if (mo570h > mo571o && mo566P < mo567Q) {
                if (mo570h <= mo567Q || !z) {
                    return m1550s;
                }
                if (view == null) {
                    view = m1550s;
                }
            }
        }
        return view;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: k */
    public final C0419Hv mo1535k() {
        return this.f9155y == 0 ? new C1018T5(-2, -1) : new C1018T5(-1, -2);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: l */
    public final void mo1536l() {
        this.f9145c.m2278P();
        m1528dx();
    }

    /* renamed from: lz */
    public final boolean m4977lz(int i) {
        if (this.f9155y == 0) {
            return (i == -1) != this.f9147f;
        }
        return ((i == -1) == this.f9147f) == m4973gv();
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: m */
    public final void mo1537m(int i, int i2) {
        m4971fc(i, i2, 1);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: n */
    public final void mo1538n() {
        this.f9145c.m2278P();
        for (int i = 0; i < this.f9138I; i++) {
            this.f9152q[i].m1067h();
        }
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: nF */
    public final Parcelable mo1541nF() {
        int m4969W9;
        View m4980zd;
        int m1066W;
        int mo571o;
        int[] iArr;
        C0098Bv c0098Bv = this.f9136F;
        if (c0098Bv != null) {
            return new C0098Bv(c0098Bv);
        }
        C0098Bv c0098Bv2 = new C0098Bv();
        c0098Bv2.f368y = this.f9135E;
        c0098Bv2.f366s = this.f9146e;
        c0098Bv2.f362U = this.f9142X;
        C1105Ui c1105Ui = this.f9145c;
        if (c1105Ui != null && (iArr = (int[]) c1105Ui.f3594h) != null) {
            c0098Bv2.f364k = iArr;
            c0098Bv2.f365q = iArr.length;
            c0098Bv2.f363g = (List) c1105Ui.f3595v;
        } else {
            c0098Bv2.f365q = 0;
        }
        int i = -1;
        if (m1513U() > 0) {
            if (this.f9146e) {
                m4969W9 = m4965S3();
            } else {
                m4969W9 = m4969W9();
            }
            c0098Bv2.f361S = m4969W9;
            if (this.f9147f) {
                m4980zd = m4976j5(true);
            } else {
                m4980zd = m4980zd(true);
            }
            if (m4980zd != null) {
                i = AbstractC0667Md.m1483F(m4980zd);
            }
            c0098Bv2.f360R = i;
            int i2 = this.f9138I;
            c0098Bv2.f367w = i2;
            c0098Bv2.f359I = new int[i2];
            for (int i3 = 0; i3 < this.f9138I; i3++) {
                if (this.f9146e) {
                    m1066W = this.f9152q[i3].m1065Q(Integer.MIN_VALUE);
                    if (m1066W != Integer.MIN_VALUE) {
                        mo571o = this.f9150k.mo567Q();
                        m1066W -= mo571o;
                        c0098Bv2.f359I[i3] = m1066W;
                    } else {
                        c0098Bv2.f359I[i3] = m1066W;
                    }
                } else {
                    m1066W = this.f9152q[i3].m1066W(Integer.MIN_VALUE);
                    if (m1066W != Integer.MIN_VALUE) {
                        mo571o = this.f9150k.mo571o();
                        m1066W -= mo571o;
                        c0098Bv2.f359I[i3] = m1066W;
                    } else {
                        c0098Bv2.f359I[i3] = m1066W;
                    }
                }
            }
        } else {
            c0098Bv2.f361S = -1;
            c0098Bv2.f360R = -1;
            c0098Bv2.f367w = 0;
        }
        return c0098Bv2;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: nP */
    public final void mo1542nP(int i, int i2) {
        m4971fc(i, i2, 2);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: o */
    public final void mo1543o(int i, int i2, C0496JN c0496jn, C2093nR c2093nR) {
        C1526cn c1526cn;
        boolean z;
        int m1065Q;
        int i3;
        if (this.f9155y != 0) {
            i = i2;
        }
        if (m1513U() != 0 && i != 0) {
            m4972fi(i, c0496jn);
            int[] iArr = this.f9149j;
            if (iArr == null || iArr.length < this.f9138I) {
                this.f9149j = new int[this.f9138I];
            }
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = this.f9138I;
                c1526cn = this.f9141U;
                if (i4 >= i6) {
                    break;
                }
                if (c1526cn.f4711P == -1) {
                    m1065Q = c1526cn.f4712Q;
                    i3 = this.f9152q[i4].m1066W(m1065Q);
                } else {
                    m1065Q = this.f9152q[i4].m1065Q(c1526cn.f4716u);
                    i3 = c1526cn.f4716u;
                }
                int i7 = m1065Q - i3;
                if (i7 >= 0) {
                    this.f9149j[i5] = i7;
                    i5++;
                }
                i4++;
            }
            Arrays.sort(this.f9149j, 0, i5);
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = c1526cn.f4717v;
                if (i9 >= 0 && i9 < c0496jn.m1190h()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c2093nR.m3718h(c1526cn.f4717v, this.f9149j[i8]);
                    c1526cn.f4717v += c1526cn.f4711P;
                } else {
                    return;
                }
            }
        }
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: od */
    public final void mo1545od(Parcelable parcelable) {
        if (parcelable instanceof C0098Bv) {
            C0098Bv c0098Bv = (C0098Bv) parcelable;
            this.f9136F = c0098Bv;
            if (this.f9143Y != -1) {
                c0098Bv.f359I = null;
                c0098Bv.f367w = 0;
                c0098Bv.f361S = -1;
                c0098Bv.f360R = -1;
                c0098Bv.f359I = null;
                c0098Bv.f367w = 0;
                c0098Bv.f365q = 0;
                c0098Bv.f364k = null;
                c0098Bv.f363g = null;
            }
            m1528dx();
        }
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: qn */
    public final void mo1548qn(C1578df c1578df, C0496JN c0496jn) {
        m4974hW(c1578df, c0496jn, true);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: t */
    public final void mo1551t(AccessibilityEvent accessibilityEvent) {
        super.mo1551t(accessibilityEvent);
        if (m1513U() > 0) {
            View m4980zd = m4980zd(false);
            View m4976j5 = m4976j5(false);
            if (m4980zd == null || m4976j5 == null) {
                return;
            }
            int m1483F = AbstractC0667Md.m1483F(m4980zd);
            int m1483F2 = AbstractC0667Md.m1483F(m4976j5);
            if (m1483F < m1483F2) {
                accessibilityEvent.setFromIndex(m1483F);
                accessibilityEvent.setToIndex(m1483F2);
            } else {
                accessibilityEvent.setFromIndex(m1483F2);
                accessibilityEvent.setToIndex(m1483F);
            }
        }
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: tJ */
    public final boolean mo1552tJ() {
        return this.f9136F == null;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: v */
    public final void mo1553v(String str) {
        if (this.f9136F == null) {
            super.mo1553v(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0011, code lost:
    
        if (r6.f4710N == (-1)) goto L60;
     */
    /* renamed from: vk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4978vk(p000a.C1578df r5, p000a.C1526cn r6) {
        /*
            r4 = this;
            boolean r0 = r6.f4718z
            if (r0 == 0) goto L7c
            boolean r0 = r6.f4713W
            if (r0 == 0) goto La
            goto L7c
        La:
            int r0 = r6.f4714h
            r1 = -1
            if (r0 != 0) goto L1f
            int r0 = r6.f4710N
            if (r0 != r1) goto L19
        L13:
            int r6 = r6.f4716u
        L15:
            r4.m4967Uf(r6, r5)
            goto L7c
        L19:
            int r6 = r6.f4712Q
        L1b:
            r4.m4968Ux(r6, r5)
            goto L7c
        L1f:
            int r0 = r6.f4710N
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L50
            int r0 = r6.f4712Q
            a.IS[] r1 = r4.f9152q
            r1 = r1[r2]
            int r1 = r1.m1066W(r0)
        L2f:
            int r2 = r4.f9138I
            if (r3 >= r2) goto L41
            a.IS[] r2 = r4.f9152q
            r2 = r2[r3]
            int r2 = r2.m1066W(r0)
            if (r2 <= r1) goto L3e
            r1 = r2
        L3e:
            int r3 = r3 + 1
            goto L2f
        L41:
            int r0 = r0 - r1
            if (r0 >= 0) goto L45
            goto L13
        L45:
            int r1 = r6.f4716u
            int r6 = r6.f4714h
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L15
        L50:
            int r0 = r6.f4716u
            a.IS[] r1 = r4.f9152q
            r1 = r1[r2]
            int r1 = r1.m1065Q(r0)
        L5a:
            int r2 = r4.f9138I
            if (r3 >= r2) goto L6c
            a.IS[] r2 = r4.f9152q
            r2 = r2[r3]
            int r2 = r2.m1065Q(r0)
            if (r2 >= r1) goto L69
            r1 = r2
        L69:
            int r3 = r3 + 1
            goto L5a
        L6c:
            int r0 = r6.f4716u
            int r1 = r1 - r0
            if (r1 >= 0) goto L72
            goto L19
        L72:
            int r0 = r6.f4712Q
            int r6 = r6.f4714h
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L1b
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4978vk(a.df, a.cn):void");
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: w */
    public final int mo1554w(C0496JN c0496jn) {
        return m4962M6(c0496jn);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: x */
    public final void mo1555x(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2169h;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f9140L);
        }
        for (int i = 0; i < this.f9138I; i++) {
            this.f9152q[i].m1067h();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: x3 */
    public final int m4979x3(int i, C1578df c1578df, C0496JN c0496jn) {
        if (m1513U() == 0 || i == 0) {
            return 0;
        }
        m4972fi(i, c0496jn);
        C1526cn c1526cn = this.f9141U;
        int m4966T0 = m4966T0(c1578df, c1526cn, c0496jn);
        if (c1526cn.f4714h >= m4966T0) {
            i = i < 0 ? -m4966T0 : m4966T0;
        }
        this.f9150k.mo568V(-i);
        this.f9146e = this.f9147f;
        c1526cn.f4714h = 0;
        m4978vk(c1578df, c1526cn);
        return i;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: y */
    public final C0419Hv mo1556y(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1018T5((ViewGroup.MarginLayoutParams) layoutParams) : new C1018T5(layoutParams);
    }

    @Override // p000a.InterfaceC1877jM
    /* renamed from: z */
    public final PointF mo3494z(int i) {
        int m4954EQ = m4954EQ(i);
        PointF pointF = new PointF();
        if (m4954EQ == 0) {
            return null;
        }
        if (this.f9155y == 0) {
            pointF.x = m4954EQ;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m4954EQ;
        }
        return pointF;
    }

    /* renamed from: zd */
    public final View m4980zd(boolean z) {
        int mo571o = this.f9150k.mo571o();
        int mo567Q = this.f9150k.mo567Q();
        int m1513U = m1513U();
        View view = null;
        for (int i = 0; i < m1513U; i++) {
            View m1550s = m1550s(i);
            int mo566P = this.f9150k.mo566P(m1550s);
            if (this.f9150k.mo570h(m1550s) > mo571o && mo566P < mo567Q) {
                if (mo566P >= mo571o || !z) {
                    return m1550s;
                }
                if (view == null) {
                    view = m1550s;
                }
            }
        }
        return view;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: zx */
    public final void mo1558zx(int i) {
        if (i == 0) {
            m4964Ry();
        }
    }
}
