package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import p000a.AbstractC0265F4;
import p000a.AbstractC0667Md;
import p000a.AbstractC0795Op;
import p000a.AbstractC2441tz;
import p000a.AbstractC2575wW;
import p000a.C0419Hv;
import p000a.C0496JN;
import p000a.C0703NH;
import p000a.C1045Tb;
import p000a.C1578df;
import p000a.C1675fU;
import p000a.C2064mt;
import p000a.C2093nR;
import p000a.C2535vh;
import p000a.C2593wr;
import p000a.C2600wy;
import p000a.InterfaceC1877jM;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0667Md implements InterfaceC1877jM {

    /* renamed from: E */
    public final boolean f9039E;

    /* renamed from: H */
    public final int f9040H;

    /* renamed from: I */
    public int f9041I;

    /* renamed from: J */
    public final C1675fU f9042J;

    /* renamed from: U */
    public boolean f9043U;

    /* renamed from: Y */
    public C0703NH f9044Y;

    /* renamed from: c */
    public final C1045Tb f9045c;

    /* renamed from: e */
    public final int[] f9046e;

    /* renamed from: f */
    public int f9047f;

    /* renamed from: g */
    public boolean f9048g;

    /* renamed from: k */
    public C2064mt f9049k;

    /* renamed from: q */
    public C2600wy f9050q;

    /* renamed from: r */
    public int f9051r;

    /* renamed from: s */
    public boolean f9052s;

    /* renamed from: y */
    public boolean f9053y;

    public LinearLayoutManager(int i) {
        this.f9041I = 1;
        this.f9053y = false;
        this.f9052s = false;
        this.f9043U = false;
        this.f9039E = true;
        this.f9047f = -1;
        this.f9051r = Integer.MIN_VALUE;
        this.f9044Y = null;
        this.f9042J = new C1675fU();
        this.f9045c = new C1045Tb();
        this.f9040H = 2;
        this.f9046e = new int[2];
        m4866GV(i);
        mo1553v(null);
        if (this.f9053y) {
            this.f9053y = false;
            m1528dx();
        }
    }

    /* renamed from: BL */
    public void mo4850BL(boolean z) {
        mo1553v(null);
        if (this.f9043U == z) {
            return;
        }
        this.f9043U = z;
        m1528dx();
    }

    /* renamed from: EQ */
    public void mo3716EQ(C0496JN c0496jn, int[] iArr) {
        boolean z;
        int i;
        int i2;
        if (c0496jn.f1665z != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = this.f9049k.mo569W();
        } else {
            i = 0;
        }
        if (this.f9050q.f8009Q == -1) {
            i2 = 0;
        } else {
            i2 = i;
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: F3 */
    public final int m4863F3(int i, C1578df c1578df, C0496JN c0496jn, boolean z) {
        int mo567Q;
        int mo567Q2 = this.f9049k.mo567Q() - i;
        if (mo567Q2 <= 0) {
            return 0;
        }
        int i2 = -m4867JG(-mo567Q2, c1578df, c0496jn);
        int i3 = i + i2;
        if (!z || (mo567Q = this.f9049k.mo567Q() - i3) <= 0) {
            return i2;
        }
        this.f9049k.mo568V(mo567Q);
        return mo567Q + i2;
    }

    /* renamed from: FE */
    public final void m4864FE(C1578df c1578df, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                m1514U8(i, c1578df);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    m1514U8(i2, c1578df);
                }
            }
        }
    }

    /* renamed from: Fu */
    public final int m4865Fu(C0496JN c0496jn) {
        if (m1513U() == 0) {
            return 0;
        }
        m4884j5();
        C2064mt c2064mt = this.f9049k;
        boolean z = !this.f9039E;
        return AbstractC2575wW.m4416W(c0496jn, c2064mt, m4870LN(z), m4879fH(z), this, this.f9039E);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: G */
    public final int mo1494G(C0496JN c0496jn) {
        return m4865Fu(c0496jn);
    }

    /* renamed from: GV */
    public final void m4866GV(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC2441tz.m4188N("invalid orientation:", i));
        }
        mo1553v(null);
        if (i != this.f9041I || this.f9049k == null) {
            C2064mt m562z = AbstractC0265F4.m562z(this, i);
            this.f9049k = m562z;
            this.f9042J.f5243z = m562z;
            this.f9041I = i;
            m1528dx();
        }
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: HL */
    public void mo1497HL(C0496JN c0496jn) {
        this.f9044Y = null;
        this.f9047f = -1;
        this.f9051r = Integer.MIN_VALUE;
        this.f9042J.m3172v();
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: Ha */
    public int mo1498Ha(int i, C1578df c1578df, C0496JN c0496jn) {
        if (this.f9041I == 0) {
            return 0;
        }
        return m4867JG(i, c1578df, c0496jn);
    }

    /* renamed from: JG */
    public final int m4867JG(int i, C1578df c1578df, C0496JN c0496jn) {
        if (m1513U() == 0 || i == 0) {
            return 0;
        }
        m4884j5();
        this.f9050q.f8016z = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m4878cH(i2, abs, true, c0496jn);
        C2600wy c2600wy = this.f9050q;
        int m4887zd = m4887zd(c1578df, c2600wy, c0496jn, false) + c2600wy.f8014u;
        if (m4887zd < 0) {
            return 0;
        }
        if (abs > m4887zd) {
            i = i2 * m4887zd;
        }
        this.f9049k.mo568V(-i);
        this.f9050q.f8005G = i;
        return i;
    }

    /* renamed from: KM */
    public final View m4868KM(int i, int i2, boolean z, boolean z2) {
        m4884j5();
        return (this.f9041I == 0 ? this.f2172v : this.f2163P).m2279Q(i, i2, z ? 24579 : 320, z2 ? 320 : 0);
    }

    /* renamed from: Ks */
    public final void m4869Ks(int i, int i2) {
        this.f9050q.f8015v = i2 - this.f9049k.mo571o();
        C2600wy c2600wy = this.f9050q;
        c2600wy.f8008P = i;
        c2600wy.f8007N = this.f9052s ? 1 : -1;
        c2600wy.f8009Q = -1;
        c2600wy.f8012h = i2;
        c2600wy.f8014u = Integer.MIN_VALUE;
    }

    /* renamed from: LN */
    public final View m4870LN(boolean z) {
        int m1513U;
        int i;
        if (this.f9052s) {
            m1513U = -1;
            i = m1513U() - 1;
        } else {
            m1513U = m1513U();
            i = 0;
        }
        return m4868KM(i, m1513U, z, true);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: Lq */
    public final void mo1502Lq(int i) {
        this.f9047f = i;
        this.f9051r = Integer.MIN_VALUE;
        C0703NH c0703nh = this.f9044Y;
        if (c0703nh != null) {
            c0703nh.f2362S = -1;
        }
        m1528dx();
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: M */
    public int mo1503M(C0496JN c0496jn) {
        return m4872Rh(c0496jn);
    }

    /* renamed from: M6 */
    public final int m4871M6(C0496JN c0496jn) {
        if (m1513U() == 0) {
            return 0;
        }
        m4884j5();
        C2064mt c2064mt = this.f9049k;
        boolean z = !this.f9039E;
        return AbstractC2575wW.m4402M(c0496jn, c2064mt, m4870LN(z), m4879fH(z), this, this.f9039E);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: N */
    public final boolean mo1504N() {
        return this.f9041I == 1;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: O4 */
    public final boolean mo1506O4() {
        boolean z;
        if (this.f2166S == 1073741824 || this.f2167V == 1073741824) {
            return false;
        }
        int m1513U = m1513U();
        int i = 0;
        while (true) {
            if (i < m1513U) {
                ViewGroup.LayoutParams layoutParams = m1550s(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: P */
    public final boolean mo1507P() {
        return this.f9041I == 0;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: R */
    public int mo1510R(C0496JN c0496jn) {
        return m4872Rh(c0496jn);
    }

    /* renamed from: Rh */
    public final int m4872Rh(C0496JN c0496jn) {
        if (m1513U() == 0) {
            return 0;
        }
        m4884j5();
        C2064mt c2064mt = this.f9049k;
        boolean z = !this.f9039E;
        return AbstractC2575wW.m4394G(c0496jn, c2064mt, m4870LN(z), m4879fH(z), this, this.f9039E, this.f9052s);
    }

    /* renamed from: Ry */
    public void mo4852Ry(C0496JN c0496jn, C2600wy c2600wy, C2093nR c2093nR) {
        int i = c2600wy.f8008P;
        if (i < 0 || i >= c0496jn.m1190h()) {
            return;
        }
        c2093nR.m3718h(i, Math.max(0, c2600wy.f8014u));
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: S */
    public final int mo1511S(C0496JN c0496jn) {
        return m4865Fu(c0496jn);
    }

    /* renamed from: S3 */
    public final int m4873S3() {
        View m4868KM = m4868KM(m1513U() - 1, -1, false, true);
        if (m4868KM == null) {
            return -1;
        }
        return AbstractC0667Md.m1483F(m4868KM);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: T */
    public View mo1512T(View view, int i, C1578df c1578df, C0496JN c0496jn) {
        int m4874T0;
        View m4883hs;
        View m4882hW;
        m4886x3();
        if (m1513U() == 0 || (m4874T0 = m4874T0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m4884j5();
        m4878cH(m4874T0, (int) (this.f9049k.mo569W() * 0.33333334f), false, c0496jn);
        C2600wy c2600wy = this.f9050q;
        c2600wy.f8014u = Integer.MIN_VALUE;
        c2600wy.f8016z = false;
        m4887zd(c1578df, c2600wy, c0496jn, true);
        if (m4874T0 == -1) {
            if (this.f9052s) {
                m4883hs = m4883hs(m1513U() - 1, -1);
            } else {
                m4883hs = m4883hs(0, m1513U());
            }
        } else if (this.f9052s) {
            m4883hs = m4883hs(0, m1513U());
        } else {
            m4883hs = m4883hs(m1513U() - 1, -1);
        }
        if (m4874T0 == -1) {
            m4882hW = m4885lz();
        } else {
            m4882hW = m4882hW();
        }
        if (m4882hW.hasFocusable()) {
            if (m4883hs == null) {
                return null;
            }
            return m4882hW;
        }
        return m4883hs;
    }

    /* renamed from: T0 */
    public final int m4874T0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f9041I == 1) ? 1 : Integer.MIN_VALUE : this.f9041I == 0 ? 1 : Integer.MIN_VALUE : this.f9041I == 1 ? -1 : Integer.MIN_VALUE : this.f9041I == 0 ? -1 : Integer.MIN_VALUE : (this.f9041I != 1 && m4880fi()) ? -1 : 1 : (this.f9041I != 1 && m4880fi()) ? 1 : -1;
    }

    /* renamed from: Uf */
    public void mo4855Uf(C1578df c1578df, C0496JN c0496jn, C1675fU c1675fU, int i) {
    }

    /* renamed from: Ux */
    public final void m4875Ux(C1578df c1578df, C2600wy c2600wy) {
        if (c2600wy.f8016z && !c2600wy.f8010V) {
            int i = c2600wy.f8014u;
            int i2 = c2600wy.f8011W;
            if (c2600wy.f8009Q == -1) {
                int m1513U = m1513U();
                if (i >= 0) {
                    int mo565N = (this.f9049k.mo565N() - i) + i2;
                    if (this.f9052s) {
                        for (int i3 = 0; i3 < m1513U; i3++) {
                            View m1550s = m1550s(i3);
                            if (this.f9049k.mo566P(m1550s) < mo565N || this.f9049k.mo564M(m1550s) < mo565N) {
                                m4864FE(c1578df, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = m1513U - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View m1550s2 = m1550s(i5);
                        if (this.f9049k.mo566P(m1550s2) < mo565N || this.f9049k.mo564M(m1550s2) < mo565N) {
                            m4864FE(c1578df, i4, i5);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i >= 0) {
                int i6 = i - i2;
                int m1513U2 = m1513U();
                if (this.f9052s) {
                    int i7 = m1513U2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View m1550s3 = m1550s(i8);
                        if (this.f9049k.mo570h(m1550s3) > i6 || this.f9049k.mo563G(m1550s3) > i6) {
                            m4864FE(c1578df, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < m1513U2; i9++) {
                    View m1550s4 = m1550s(i9);
                    if (this.f9049k.mo570h(m1550s4) > i6 || this.f9049k.mo563G(m1550s4) > i6) {
                        m4864FE(c1578df, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: V */
    public int mo1516V(C0496JN c0496jn) {
        return m4871M6(c0496jn);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0024  */
    @Override // p000a.AbstractC0667Md
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1517W(int r7, p000a.C2093nR r8) {
        /*
            r6 = this;
            a.NH r0 = r6.f9044Y
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L13
            int r4 = r0.f2362S
            if (r4 < 0) goto Ld
            r5 = r1
            goto Le
        Ld:
            r5 = r3
        Le:
            if (r5 == 0) goto L13
            boolean r0 = r0.f2363w
            goto L22
        L13:
            r6.m4886x3()
            boolean r0 = r6.f9052s
            int r4 = r6.f9047f
            if (r4 != r2) goto L22
            if (r0 == 0) goto L21
            int r4 = r7 + (-1)
            goto L22
        L21:
            r4 = r3
        L22:
            if (r0 == 0) goto L25
            r1 = r2
        L25:
            r0 = r3
        L26:
            int r2 = r6.f9040H
            if (r0 >= r2) goto L35
            if (r4 < 0) goto L35
            if (r4 >= r7) goto L35
            r8.m3718h(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L26
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo1517W(int, a.nR):void");
    }

    /* renamed from: W5 */
    public final void m4876W5(int i, int i2) {
        this.f9050q.f8015v = this.f9049k.mo567Q() - i2;
        C2600wy c2600wy = this.f9050q;
        c2600wy.f8007N = this.f9052s ? -1 : 1;
        c2600wy.f8008P = i;
        c2600wy.f8009Q = 1;
        c2600wy.f8012h = i2;
        c2600wy.f8014u = Integer.MIN_VALUE;
    }

    /* renamed from: W9 */
    public final int m4877W9() {
        View m4868KM = m4868KM(0, m1513U(), false, true);
        if (m4868KM == null) {
            return -1;
        }
        return AbstractC0667Md.m1483F(m4868KM);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: ZH */
    public int mo1521ZH(int i, C1578df c1578df, C0496JN c0496jn) {
        if (this.f9041I == 1) {
            return 0;
        }
        return m4867JG(i, c1578df, c0496jn);
    }

    /* renamed from: cH */
    public final void m4878cH(int i, int i2, boolean z, C0496JN c0496jn) {
        boolean z2;
        int i3;
        int mo571o;
        int m1523c;
        C2600wy c2600wy = this.f9050q;
        int i4 = 1;
        boolean z3 = false;
        if (this.f9049k.mo572u() == 0 && this.f9049k.mo565N() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c2600wy.f8010V = z2;
        this.f9050q.f8009Q = i;
        int[] iArr = this.f9046e;
        iArr[0] = 0;
        iArr[1] = 0;
        mo3716EQ(c0496jn, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i == 1) {
            z3 = true;
        }
        C2600wy c2600wy2 = this.f9050q;
        if (z3) {
            i3 = max2;
        } else {
            i3 = max;
        }
        c2600wy2.f8013o = i3;
        if (!z3) {
            max = max2;
        }
        c2600wy2.f8011W = max;
        if (z3) {
            C2064mt c2064mt = this.f9049k;
            int i5 = c2064mt.f6414P;
            AbstractC0667Md abstractC0667Md = c2064mt.f936z;
            switch (i5) {
                case AbstractC0795Op.f2698E /* 0 */:
                    m1523c = abstractC0667Md.m1529e();
                    break;
                default:
                    m1523c = abstractC0667Md.m1523c();
                    break;
            }
            c2600wy2.f8013o = m1523c + i3;
            View m4882hW = m4882hW();
            C2600wy c2600wy3 = this.f9050q;
            if (this.f9052s) {
                i4 = -1;
            }
            c2600wy3.f8007N = i4;
            int m1483F = AbstractC0667Md.m1483F(m4882hW);
            C2600wy c2600wy4 = this.f9050q;
            c2600wy3.f8008P = m1483F + c2600wy4.f8007N;
            c2600wy4.f8012h = this.f9049k.mo570h(m4882hW);
            mo571o = this.f9049k.mo570h(m4882hW) - this.f9049k.mo567Q();
        } else {
            View m4885lz = m4885lz();
            C2600wy c2600wy5 = this.f9050q;
            c2600wy5.f8013o = this.f9049k.mo571o() + c2600wy5.f8013o;
            C2600wy c2600wy6 = this.f9050q;
            if (!this.f9052s) {
                i4 = -1;
            }
            c2600wy6.f8007N = i4;
            int m1483F2 = AbstractC0667Md.m1483F(m4885lz);
            C2600wy c2600wy7 = this.f9050q;
            c2600wy6.f8008P = m1483F2 + c2600wy7.f8007N;
            c2600wy7.f8012h = this.f9049k.mo566P(m4885lz);
            mo571o = (-this.f9049k.mo566P(m4885lz)) + this.f9049k.mo571o();
        }
        C2600wy c2600wy8 = this.f9050q;
        c2600wy8.f8015v = i2;
        if (z) {
            c2600wy8.f8015v = i2 - mo571o;
        }
        c2600wy8.f8014u = mo571o;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: d3 */
    public void mo1526d3(RecyclerView recyclerView, int i) {
        C2593wr c2593wr = new C2593wr(recyclerView.getContext());
        c2593wr.f7967z = i;
        m1557yF(c2593wr);
    }

    /* renamed from: fH */
    public final View m4879fH(boolean z) {
        int m1513U;
        int i;
        if (this.f9052s) {
            i = m1513U();
            m1513U = 0;
        } else {
            m1513U = m1513U() - 1;
            i = -1;
        }
        return m4868KM(m1513U, i, z, true);
    }

    /* renamed from: fc */
    public View mo4856fc(C1578df c1578df, C0496JN c0496jn, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        m4884j5();
        int m1513U = m1513U();
        if (z2) {
            i2 = m1513U() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = m1513U;
            i2 = 0;
            i3 = 1;
        }
        int m1190h = c0496jn.m1190h();
        int mo571o = this.f9049k.mo571o();
        int mo567Q = this.f9049k.mo567Q();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View m1550s = m1550s(i2);
            int m1483F = AbstractC0667Md.m1483F(m1550s);
            int mo566P = this.f9049k.mo566P(m1550s);
            int mo570h = this.f9049k.mo570h(m1550s);
            if (m1483F >= 0 && m1483F < m1190h) {
                if (!((C0419Hv) m1550s.getLayoutParams()).m949v()) {
                    boolean z3 = mo570h <= mo571o && mo566P < mo571o;
                    boolean z4 = mo566P >= mo567Q && mo570h > mo567Q;
                    if (!z3 && !z4) {
                        return m1550s;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = m1550s;
                        }
                        view2 = m1550s;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = m1550s;
                        }
                        view2 = m1550s;
                    }
                } else if (view3 == null) {
                    view3 = m1550s;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    /* renamed from: fi */
    public final boolean m4880fi() {
        return m1500J() == 1;
    }

    /* renamed from: gv */
    public final int m4881gv(int i, C1578df c1578df, C0496JN c0496jn, boolean z) {
        int mo571o;
        int mo571o2 = i - this.f9049k.mo571o();
        if (mo571o2 <= 0) {
            return 0;
        }
        int i2 = -m4867JG(mo571o2, c1578df, c0496jn);
        int i3 = i + i2;
        if (!z || (mo571o = i3 - this.f9049k.mo571o()) <= 0) {
            return i2;
        }
        this.f9049k.mo568V(-mo571o);
        return i2 - mo571o;
    }

    /* renamed from: hW */
    public final View m4882hW() {
        return m1550s(this.f9052s ? 0 : m1513U() - 1);
    }

    /* renamed from: hs */
    public final View m4883hs(int i, int i2) {
        int i3;
        int i4;
        m4884j5();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return m1550s(i);
        }
        if (this.f9049k.mo566P(m1550s(i)) < this.f9049k.mo571o()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.f9041I == 0 ? this.f2172v : this.f2163P).m2279Q(i, i2, i3, i4);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: j */
    public final boolean mo1534j() {
        return true;
    }

    /* renamed from: j5 */
    public final void m4884j5() {
        if (this.f9050q == null) {
            this.f9050q = new C2600wy();
        }
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: k */
    public C0419Hv mo1535k() {
        return new C0419Hv(-2, -2);
    }

    /* renamed from: lz */
    public final View m4885lz() {
        return m1550s(this.f9052s ? m1513U() - 1 : 0);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: nF */
    public final Parcelable mo1541nF() {
        C0703NH c0703nh = this.f9044Y;
        if (c0703nh != null) {
            return new C0703NH(c0703nh);
        }
        C0703NH c0703nh2 = new C0703NH();
        if (m1513U() > 0) {
            m4884j5();
            boolean z = this.f9048g ^ this.f9052s;
            c0703nh2.f2363w = z;
            if (z) {
                View m4882hW = m4882hW();
                c0703nh2.f2361R = this.f9049k.mo567Q() - this.f9049k.mo570h(m4882hW);
                c0703nh2.f2362S = AbstractC0667Md.m1483F(m4882hW);
            } else {
                View m4885lz = m4885lz();
                c0703nh2.f2362S = AbstractC0667Md.m1483F(m4885lz);
                c0703nh2.f2361R = this.f9049k.mo566P(m4885lz) - this.f9049k.mo571o();
            }
        } else {
            c0703nh2.f2362S = -1;
        }
        return c0703nh2;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: o */
    public final void mo1543o(int i, int i2, C0496JN c0496jn, C2093nR c2093nR) {
        if (this.f9041I != 0) {
            i = i2;
        }
        if (m1513U() == 0 || i == 0) {
            return;
        }
        m4884j5();
        m4878cH(i > 0 ? 1 : -1, Math.abs(i), true, c0496jn);
        mo4852Ry(c0496jn, this.f9050q, c2093nR);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: od */
    public final void mo1545od(Parcelable parcelable) {
        if (parcelable instanceof C0703NH) {
            C0703NH c0703nh = (C0703NH) parcelable;
            this.f9044Y = c0703nh;
            if (this.f9047f != -1) {
                c0703nh.f2362S = -1;
            }
            m1528dx();
        }
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: q */
    public final View mo1547q(int i) {
        int m1513U = m1513U();
        if (m1513U == 0) {
            return null;
        }
        int m1483F = i - AbstractC0667Md.m1483F(m1550s(0));
        if (m1483F >= 0 && m1483F < m1513U) {
            View m1550s = m1550s(m1483F);
            if (AbstractC0667Md.m1483F(m1550s) == i) {
                return m1550s;
            }
        }
        return super.mo1547q(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:385:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0239  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // p000a.AbstractC0667Md
    /* renamed from: qn */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1548qn(p000a.C1578df r18, p000a.C0496JN r19) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo1548qn(a.df, a.JN):void");
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: t */
    public final void mo1551t(AccessibilityEvent accessibilityEvent) {
        super.mo1551t(accessibilityEvent);
        if (m1513U() > 0) {
            accessibilityEvent.setFromIndex(m4877W9());
            accessibilityEvent.setToIndex(m4873S3());
        }
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: tJ */
    public boolean mo1552tJ() {
        return this.f9044Y == null && this.f9048g == this.f9043U;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: v */
    public final void mo1553v(String str) {
        if (this.f9044Y == null) {
            super.mo1553v(str);
        }
    }

    /* renamed from: vk */
    public void mo4860vk(C1578df c1578df, C0496JN c0496jn, C2600wy c2600wy, C1045Tb c1045Tb) {
        boolean z;
        int m3689S;
        int i;
        int i2;
        int i3;
        int m1496H;
        boolean z2;
        View m4482h = c2600wy.m4482h(c1578df);
        if (m4482h == null) {
            c1045Tb.f3454h = true;
            return;
        }
        C0419Hv c0419Hv = (C0419Hv) m4482h.getLayoutParams();
        if (c2600wy.f8006M == null) {
            boolean z3 = this.f9052s;
            if (c2600wy.f8009Q == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                m1532h(m4482h, -1, false);
            } else {
                m1532h(m4482h, 0, false);
            }
        } else {
            boolean z4 = this.f9052s;
            if (c2600wy.f8009Q == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                m1532h(m4482h, -1, true);
            } else {
                m1532h(m4482h, 0, true);
            }
        }
        C0419Hv c0419Hv2 = (C0419Hv) m4482h.getLayoutParams();
        Rect m4913L = this.f2169h.m4913L(m4482h);
        int i4 = m4913L.left + m4913L.right + 0;
        int i5 = m4913L.top + m4913L.bottom + 0;
        int m1482E = AbstractC0667Md.m1482E(this.f2165R, this.f2167V, m1529e() + m1496H() + ((ViewGroup.MarginLayoutParams) c0419Hv2).leftMargin + ((ViewGroup.MarginLayoutParams) c0419Hv2).rightMargin + i4, ((ViewGroup.MarginLayoutParams) c0419Hv2).width, mo1507P());
        int m1482E2 = AbstractC0667Md.m1482E(this.f2173w, this.f2166S, m1523c() + m1518X() + ((ViewGroup.MarginLayoutParams) c0419Hv2).topMargin + ((ViewGroup.MarginLayoutParams) c0419Hv2).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) c0419Hv2).height, mo1504N());
        if (m1527dG(m4482h, m1482E, m1482E2, c0419Hv2)) {
            m4482h.measure(m1482E, m1482E2);
        }
        c1045Tb.f3456z = this.f9049k.mo573v(m4482h);
        if (this.f9041I == 1) {
            if (m4880fi()) {
                i3 = this.f2165R - m1529e();
                m1496H = i3 - this.f9049k.m3689S(m4482h);
            } else {
                m1496H = m1496H();
                i3 = this.f9049k.m3689S(m4482h) + m1496H;
            }
            int i6 = c2600wy.f8009Q;
            i2 = c2600wy.f8012h;
            if (i6 == -1) {
                int i7 = m1496H;
                m3689S = i2;
                i2 -= c1045Tb.f3456z;
                i = i7;
            } else {
                i = m1496H;
                m3689S = c1045Tb.f3456z + i2;
            }
        } else {
            int m1518X = m1518X();
            m3689S = this.f9049k.m3689S(m4482h) + m1518X;
            int i8 = c2600wy.f8009Q;
            int i9 = c2600wy.f8012h;
            if (i8 == -1) {
                i = i9 - c1045Tb.f3456z;
                i3 = i9;
                i2 = m1518X;
            } else {
                int i10 = c1045Tb.f3456z + i9;
                i = i9;
                i2 = m1518X;
                i3 = i10;
            }
        }
        AbstractC0667Md.m1486i(m4482h, i, i2, i3, m3689S);
        if (c0419Hv.m949v() || c0419Hv.m948h()) {
            c1045Tb.f3455v = true;
        }
        c1045Tb.f3453P = m4482h.hasFocusable();
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: w */
    public int mo1554w(C0496JN c0496jn) {
        return m4871M6(c0496jn);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: x */
    public final void mo1555x(RecyclerView recyclerView) {
    }

    /* renamed from: x3 */
    public final void m4886x3() {
        this.f9052s = (this.f9041I == 1 || !m4880fi()) ? this.f9053y : !this.f9053y;
    }

    @Override // p000a.InterfaceC1877jM
    /* renamed from: z */
    public final PointF mo3494z(int i) {
        if (m1513U() == 0) {
            return null;
        }
        int i2 = (i < AbstractC0667Md.m1483F(m1550s(0))) != this.f9052s ? -1 : 1;
        return this.f9041I == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    /* renamed from: zd */
    public final int m4887zd(C1578df c1578df, C2600wy c2600wy, C0496JN c0496jn, boolean z) {
        boolean z2;
        int i = c2600wy.f8015v;
        int i2 = c2600wy.f8014u;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c2600wy.f8014u = i2 + i;
            }
            m4875Ux(c1578df, c2600wy);
        }
        int i3 = c2600wy.f8015v + c2600wy.f8013o;
        while (true) {
            if (!c2600wy.f8010V && i3 <= 0) {
                break;
            }
            int i4 = c2600wy.f8008P;
            if (i4 >= 0 && i4 < c0496jn.m1190h()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                break;
            }
            C1045Tb c1045Tb = this.f9045c;
            c1045Tb.f3456z = 0;
            c1045Tb.f3454h = false;
            c1045Tb.f3455v = false;
            c1045Tb.f3453P = false;
            mo4860vk(c1578df, c0496jn, c2600wy, c1045Tb);
            if (!c1045Tb.f3454h) {
                int i5 = c2600wy.f8012h;
                int i6 = c1045Tb.f3456z;
                c2600wy.f8012h = (c2600wy.f8009Q * i6) + i5;
                if (!c1045Tb.f3455v || c2600wy.f8006M != null || !c0496jn.f1663u) {
                    c2600wy.f8015v -= i6;
                    i3 -= i6;
                }
                int i7 = c2600wy.f8014u;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c2600wy.f8014u = i8;
                    int i9 = c2600wy.f8015v;
                    if (i9 < 0) {
                        c2600wy.f8014u = i8 + i9;
                    }
                    m4875Ux(c1578df, c2600wy);
                }
                if (z && c1045Tb.f3453P) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c2600wy.f8015v;
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f9041I = 1;
        this.f9053y = false;
        this.f9052s = false;
        this.f9043U = false;
        this.f9039E = true;
        this.f9047f = -1;
        this.f9051r = Integer.MIN_VALUE;
        this.f9044Y = null;
        this.f9042J = new C1675fU();
        this.f9045c = new C1045Tb();
        this.f9040H = 2;
        this.f9046e = new int[2];
        C2535vh m1485Z = AbstractC0667Md.m1485Z(context, attributeSet, i, i2);
        m4866GV(m1485Z.f7764z);
        boolean z = m1485Z.f7763v;
        mo1553v(null);
        if (z != this.f9053y) {
            this.f9053y = z;
            m1528dx();
        }
        mo4850BL(m1485Z.f7761P);
    }
}
