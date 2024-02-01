package p000a;

import java.util.ArrayList;

/* renamed from: a.x4 */
/* loaded from: classes.dex */
public final class C2607x4 extends AbstractC1389a2 {

    /* renamed from: JG */
    public C1628ed[] f8047JG;

    /* renamed from: G5 */
    public int f8045G5 = 0;

    /* renamed from: BX */
    public int f8040BX = 0;

    /* renamed from: d2 */
    public int f8059d2 = 0;

    /* renamed from: dG */
    public int f8061dG = 0;

    /* renamed from: O4 */
    public int f8051O4 = 0;

    /* renamed from: nB */
    public int f8070nB = 0;

    /* renamed from: d3 */
    public boolean f8060d3 = false;

    /* renamed from: yF */
    public int f8074yF = 0;

    /* renamed from: tJ */
    public int f8071tJ = 0;

    /* renamed from: EQ */
    public final C0782OY f8041EQ = new C0782OY();

    /* renamed from: Ry */
    public C0847Pp f8053Ry = null;

    /* renamed from: Fu */
    public int f8044Fu = -1;

    /* renamed from: Rh */
    public int f8052Rh = -1;

    /* renamed from: M6 */
    public int f8050M6 = -1;

    /* renamed from: T0 */
    public int f8055T0 = -1;

    /* renamed from: j5 */
    public int f8068j5 = -1;

    /* renamed from: zd */
    public int f8075zd = -1;

    /* renamed from: fH */
    public float f8062fH = 0.5f;

    /* renamed from: LN */
    public float f8049LN = 0.5f;

    /* renamed from: W9 */
    public float f8058W9 = 0.5f;

    /* renamed from: S3 */
    public float f8054S3 = 0.5f;

    /* renamed from: hs */
    public float f8067hs = 0.5f;

    /* renamed from: KM */
    public float f8048KM = 0.5f;

    /* renamed from: fc */
    public int f8063fc = 0;

    /* renamed from: F3 */
    public int f8042F3 = 0;

    /* renamed from: gv */
    public int f8065gv = 2;

    /* renamed from: hW */
    public int f8066hW = 2;

    /* renamed from: lz */
    public int f8069lz = 0;

    /* renamed from: fi */
    public int f8064fi = -1;

    /* renamed from: vk */
    public int f8072vk = 0;

    /* renamed from: Uf */
    public final ArrayList f8056Uf = new ArrayList();

    /* renamed from: Ux */
    public C1628ed[] f8057Ux = null;

    /* renamed from: FE */
    public C1628ed[] f8043FE = null;

    /* renamed from: x3 */
    public int[] f8073x3 = null;

    /* renamed from: GV */
    public int f8046GV = 0;

    /* renamed from: O */
    public final int m4485O(int i, C1628ed c1628ed) {
        if (c1628ed == null) {
            return 0;
        }
        int[] iArr = c1628ed.f5030Ha;
        if (iArr[0] == 3) {
            int i2 = c1628ed.f5075q;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c1628ed.f5044U * i);
                if (i3 != c1628ed.m3098R()) {
                    c1628ed.f5080u = true;
                    m4487n(c1628ed, 1, i3, iArr[1], c1628ed.m3101V());
                }
                return i3;
            }
            if (i2 == 1) {
                return c1628ed.m3098R();
            }
            if (i2 == 3) {
                return (int) ((c1628ed.m3101V() * c1628ed.f5067m) + 0.5f);
            }
        }
        return c1628ed.m3098R();
    }

    /* renamed from: d */
    public final int m4486d(int i, C1628ed c1628ed) {
        if (c1628ed == null) {
            return 0;
        }
        int[] iArr = c1628ed.f5030Ha;
        if (iArr[1] == 3) {
            int i2 = c1628ed.f5065k;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c1628ed.f5077r * i);
                if (i3 != c1628ed.m3101V()) {
                    c1628ed.f5080u = true;
                    m4487n(c1628ed, iArr[0], c1628ed.m3098R(), 1, i3);
                }
                return i3;
            }
            if (i2 == 1) {
                return c1628ed.m3101V();
            }
            if (i2 == 3) {
                return (int) ((c1628ed.m3098R() * c1628ed.f5067m) + 0.5f);
            }
        }
        return c1628ed.m3101V();
    }

    /* renamed from: n */
    public final void m4487n(C1628ed c1628ed, int i, int i2, int i3, int i4) {
        C0847Pp c0847Pp;
        boolean z;
        C1628ed c1628ed2;
        while (true) {
            c0847Pp = this.f8053Ry;
            if (c0847Pp != null || (c1628ed2 = this.f5020B) == null) {
                break;
            } else {
                this.f8053Ry = ((C1535cx) c1628ed2).f4748d2;
            }
        }
        C0782OY c0782oy = this.f8041EQ;
        c0782oy.f2651z = i;
        c0782oy.f2647h = i3;
        c0782oy.f2650v = i2;
        c0782oy.f2644P = i4;
        c0847Pp.m1962h(c1628ed, c0782oy);
        c1628ed.m3111p(c0782oy.f2643N);
        c1628ed.m3090F(c0782oy.f2645Q);
        c1628ed.f5058e = c0782oy.f2648o;
        int i5 = c0782oy.f2649u;
        c1628ed.f5051Yd = i5;
        if (i5 > 0) {
            z = true;
        } else {
            z = false;
        }
        c1628ed.f5058e = z;
    }

    @Override // p000a.C1628ed
    /* renamed from: v */
    public final void mo905v(C0457If c0457If, boolean z) {
        boolean z2;
        boolean z3;
        C1628ed c1628ed;
        float f;
        int i;
        boolean z4;
        super.mo905v(c0457If, z);
        C1628ed c1628ed2 = this.f5020B;
        if (c1628ed2 != null && ((C1535cx) c1628ed2).f4750dG) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = this.f8069lz;
        ArrayList arrayList = this.f8056Uf;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            C0875QQ c0875qq = (C0875QQ) arrayList.get(i3);
                            if (i3 == size - 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            c0875qq.m2017h(i3, z2, z4);
                        }
                    }
                } else if (this.f8073x3 != null && this.f8043FE != null && this.f8057Ux != null) {
                    for (int i4 = 0; i4 < this.f8046GV; i4++) {
                        this.f8047JG[i4].m3093J();
                    }
                    int[] iArr = this.f8073x3;
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    float f2 = this.f8062fH;
                    C1628ed c1628ed3 = null;
                    int i7 = 0;
                    while (i7 < i5) {
                        if (z2) {
                            i = (i5 - i7) - 1;
                            f = 1.0f - this.f8062fH;
                        } else {
                            f = f2;
                            i = i7;
                        }
                        C1628ed c1628ed4 = this.f8043FE[i];
                        if (c1628ed4 != null && c1628ed4.f5046UZ != 8) {
                            C0287FS c0287fs = c1628ed4.f5022C;
                            if (i7 == 0) {
                                c1628ed4.m3114u(c0287fs, this.f5022C, this.f8051O4);
                                c1628ed4.f5025EC = this.f8044Fu;
                                c1628ed4.f5073od = f;
                            }
                            if (i7 == i5 - 1) {
                                c1628ed4.m3114u(c1628ed4.f5064j, this.f5064j, this.f8070nB);
                            }
                            if (i7 > 0 && c1628ed3 != null) {
                                int i8 = this.f8063fc;
                                C0287FS c0287fs2 = c1628ed3.f5064j;
                                c1628ed4.m3114u(c0287fs, c0287fs2, i8);
                                c1628ed3.m3114u(c0287fs2, c0287fs, 0);
                            }
                            c1628ed3 = c1628ed4;
                        }
                        i7++;
                        f2 = f;
                    }
                    for (int i9 = 0; i9 < i6; i9++) {
                        C1628ed c1628ed5 = this.f8057Ux[i9];
                        if (c1628ed5 != null && c1628ed5.f5046UZ != 8) {
                            C0287FS c0287fs3 = c1628ed5.f5074p;
                            if (i9 == 0) {
                                c1628ed5.m3114u(c0287fs3, this.f5074p, this.f8045G5);
                                c1628ed5.f5045U8 = this.f8052Rh;
                                c1628ed5.f5070nF = this.f8049LN;
                            }
                            if (i9 == i6 - 1) {
                                c1628ed5.m3114u(c1628ed5.f5034L, this.f5034L, this.f8040BX);
                            }
                            if (i9 > 0 && c1628ed3 != null) {
                                int i10 = this.f8042F3;
                                C0287FS c0287fs4 = c1628ed3.f5034L;
                                c1628ed5.m3114u(c0287fs3, c0287fs4, i10);
                                c1628ed3.m3114u(c0287fs4, c0287fs3, 0);
                            }
                            c1628ed3 = c1628ed5;
                        }
                    }
                    for (int i11 = 0; i11 < i5; i11++) {
                        for (int i12 = 0; i12 < i6; i12++) {
                            int i13 = (i12 * i5) + i11;
                            if (this.f8072vk == 1) {
                                i13 = (i11 * i6) + i12;
                            }
                            C1628ed[] c1628edArr = this.f8047JG;
                            if (i13 < c1628edArr.length && (c1628ed = c1628edArr[i13]) != null && c1628ed.f5046UZ != 8) {
                                C1628ed c1628ed6 = this.f8043FE[i11];
                                C1628ed c1628ed7 = this.f8057Ux[i12];
                                if (c1628ed != c1628ed6) {
                                    c1628ed.m3114u(c1628ed.f5022C, c1628ed6.f5022C, 0);
                                    c1628ed.m3114u(c1628ed.f5064j, c1628ed6.f5064j, 0);
                                }
                                if (c1628ed != c1628ed7) {
                                    c1628ed.m3114u(c1628ed.f5074p, c1628ed7.f5074p, 0);
                                    c1628ed.m3114u(c1628ed.f5034L, c1628ed7.f5034L, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    C0875QQ c0875qq2 = (C0875QQ) arrayList.get(i14);
                    if (i14 == size2 - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c0875qq2.m2017h(i14, z2, z3);
                }
            }
        } else if (arrayList.size() > 0) {
            ((C0875QQ) arrayList.get(0)).m2017h(0, z2, true);
        }
        this.f8060d3 = false;
    }

    @Override // p000a.AbstractC1389a2, p000a.InterfaceC0617Lb
    /* renamed from: z */
    public final void mo1386z() {
        for (int i = 0; i < this.f4326oI; i++) {
            C1628ed c1628ed = this.f4325Pm[i];
            if (c1628ed != null) {
                c1628ed.f5049X = true;
            }
        }
    }
}
