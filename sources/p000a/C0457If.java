package p000a;

import java.util.Arrays;

/* renamed from: a.If */
/* loaded from: classes.dex */
public final class C0457If {

    /* renamed from: I */
    public static boolean f1527I = false;

    /* renamed from: q */
    public static int f1528q = 1000;

    /* renamed from: Q */
    public C1335Z1[] f1533Q;

    /* renamed from: V */
    public final C0525Ju f1536V;

    /* renamed from: v */
    public final C1004Sp f1541v;

    /* renamed from: w */
    public C1335Z1 f1542w;

    /* renamed from: z */
    public boolean f1543z = false;

    /* renamed from: h */
    public int f1538h = 0;

    /* renamed from: P */
    public int f1532P = 32;

    /* renamed from: N */
    public int f1531N = 32;

    /* renamed from: u */
    public boolean f1540u = false;

    /* renamed from: o */
    public boolean[] f1539o = new boolean[32];

    /* renamed from: W */
    public int f1537W = 1;

    /* renamed from: G */
    public int f1529G = 0;

    /* renamed from: M */
    public int f1530M = 32;

    /* renamed from: S */
    public C2598ww[] f1535S = new C2598ww[f1528q];

    /* renamed from: R */
    public int f1534R = 0;

    public C0457If() {
        this.f1533Q = null;
        this.f1533Q = new C1335Z1[32];
        m1112y();
        C0525Ju c0525Ju = new C0525Ju(1);
        this.f1536V = c0525Ju;
        this.f1541v = new C1004Sp(c0525Ju);
        this.f1542w = new C1335Z1(c0525Ju);
    }

    /* renamed from: w */
    public static int m1093w(C0287FS c0287fs) {
        C2598ww c2598ww = c0287fs.f995W;
        if (c2598ww != null) {
            return (int) (c2598ww.f7998q + 0.5f);
        }
        return 0;
    }

    /* renamed from: G */
    public final void m1094G() {
        for (int i = 0; i < this.f1529G; i++) {
            C1335Z1 c1335z1 = this.f1533Q[i];
            c1335z1.f4229z.f7998q = c1335z1.f4227h;
        }
    }

    /* renamed from: I */
    public final void m1095I() {
        int i = this.f1532P * 2;
        this.f1532P = i;
        this.f1533Q = (C1335Z1[]) Arrays.copyOf(this.f1533Q, i);
        C0525Ju c0525Ju = this.f1536V;
        c0525Ju.f1763N = (C2598ww[]) Arrays.copyOf((C2598ww[]) c0525Ju.f1763N, this.f1532P);
        int i2 = this.f1532P;
        this.f1539o = new boolean[i2];
        this.f1531N = i2;
        this.f1530M = i2;
    }

    /* renamed from: M */
    public final C2598ww m1096M(int i) {
        if (this.f1537W + 1 >= this.f1531N) {
            m1095I();
        }
        C2598ww m1113z = m1113z(4);
        int i2 = this.f1538h + 1;
        this.f1538h = i2;
        this.f1537W++;
        m1113z.f7992R = i2;
        m1113z.f7991I = i;
        ((C2598ww[]) this.f1536V.f1763N)[i2] = m1113z;
        C1004Sp c1004Sp = this.f1541v;
        c1004Sp.f3371W.f3828R = m1113z;
        float[] fArr = m1113z.f8001y;
        Arrays.fill(fArr, 0.0f);
        fArr[m1113z.f7991I] = 1.0f;
        c1004Sp.m2178G(m1113z);
        return m1113z;
    }

    /* renamed from: N */
    public final void m1097N(C2598ww c2598ww, C2598ww c2598ww2, int i, int i2) {
        if (i2 == 8 && c2598ww2.f7997k && c2598ww.f8000w == -1) {
            c2598ww.m4477P(this, c2598ww2.f7998q + i);
            return;
        }
        C1335Z1 m1101S = m1101S();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            m1101S.f4227h = i;
        }
        if (!z) {
            m1101S.f4226P.mo1670v(c2598ww, -1.0f);
            m1101S.f4226P.mo1670v(c2598ww2, 1.0f);
        } else {
            m1101S.f4226P.mo1670v(c2598ww, 1.0f);
            m1101S.f4226P.mo1670v(c2598ww2, -1.0f);
        }
        if (i2 != 8) {
            m1101S.m2728z(this, i2);
        }
        m1111v(m1101S);
    }

    /* renamed from: P */
    public final void m1098P(C2598ww c2598ww, int i) {
        C1335Z1 m1101S;
        InterfaceC0921RL interfaceC0921RL;
        float f;
        int i2 = c2598ww.f8000w;
        if (i2 == -1) {
            c2598ww.m4477P(this, i);
            for (int i3 = 0; i3 < this.f1538h + 1; i3++) {
                C2598ww c2598ww2 = ((C2598ww[]) this.f1536V.f1763N)[i3];
            }
            return;
        }
        if (i2 != -1) {
            C1335Z1 c1335z1 = this.f1533Q[i2];
            if (!c1335z1.f4225N) {
                if (c1335z1.f4226P.mo1662M() == 0) {
                    c1335z1.f4225N = true;
                } else {
                    m1101S = m1101S();
                    if (i < 0) {
                        m1101S.f4227h = i * (-1);
                        interfaceC0921RL = m1101S.f4226P;
                        f = 1.0f;
                    } else {
                        m1101S.f4227h = i;
                        interfaceC0921RL = m1101S.f4226P;
                        f = -1.0f;
                    }
                    interfaceC0921RL.mo1670v(c2598ww, f);
                }
            }
            c1335z1.f4227h = i;
            return;
        }
        m1101S = m1101S();
        m1101S.f4229z = c2598ww;
        float f2 = i;
        c2598ww.f7998q = f2;
        m1101S.f4227h = f2;
        m1101S.f4225N = true;
        m1111v(m1101S);
    }

    /* renamed from: Q */
    public final void m1099Q(C2598ww c2598ww, C2598ww c2598ww2, int i, int i2) {
        C1335Z1 m1101S = m1101S();
        C2598ww m1100R = m1100R();
        m1100R.f7991I = 0;
        m1101S.m2724h(c2598ww, c2598ww2, m1100R, i);
        if (i2 != 8) {
            m1101S.f4226P.mo1670v(m1096M(i2), (int) (m1101S.f4226P.mo1666W(m1100R) * (-1.0f)));
        }
        m1111v(m1101S);
    }

    /* renamed from: R */
    public final C2598ww m1100R() {
        if (this.f1537W + 1 >= this.f1531N) {
            m1095I();
        }
        C2598ww m1113z = m1113z(3);
        int i = this.f1538h + 1;
        this.f1538h = i;
        this.f1537W++;
        m1113z.f7992R = i;
        ((C2598ww[]) this.f1536V.f1763N)[i] = m1113z;
        return m1113z;
    }

    /* renamed from: S */
    public final C1335Z1 m1101S() {
        C0525Ju c0525Ju = this.f1536V;
        C1335Z1 c1335z1 = (C1335Z1) ((C1095UY) c0525Ju.f1766v).mo1757z();
        if (c1335z1 == null) {
            return new C1335Z1(c0525Ju);
        }
        c1335z1.f4229z = null;
        c1335z1.f4226P.clear();
        c1335z1.f4227h = 0.0f;
        c1335z1.f4225N = false;
        return c1335z1;
    }

    /* renamed from: V */
    public final C2598ww m1102V(Object obj) {
        C2598ww c2598ww = null;
        if (obj == null) {
            return null;
        }
        if (this.f1537W + 1 >= this.f1531N) {
            m1095I();
        }
        if (obj instanceof C0287FS) {
            C0287FS c0287fs = (C0287FS) obj;
            c2598ww = c0287fs.f995W;
            if (c2598ww == null) {
                c0287fs.m586M();
                c2598ww = c0287fs.f995W;
            }
            int i = c2598ww.f7992R;
            C0525Ju c0525Ju = this.f1536V;
            if (i == -1 || i > this.f1538h || ((C2598ww[]) c0525Ju.f1763N)[i] == null) {
                if (i != -1) {
                    c2598ww.m4479v();
                }
                int i2 = this.f1538h + 1;
                this.f1538h = i2;
                this.f1537W++;
                c2598ww.f7992R = i2;
                c2598ww.f7995f = 1;
                ((C2598ww[]) c0525Ju.f1763N)[i2] = c2598ww;
            }
        }
        return c2598ww;
    }

    /* renamed from: W */
    public final void m1103W(C1335Z1 c1335z1) {
        int i;
        if (c1335z1.f4225N) {
            c1335z1.f4229z.m4477P(this, c1335z1.f4227h);
        } else {
            C1335Z1[] c1335z1Arr = this.f1533Q;
            int i2 = this.f1529G;
            c1335z1Arr[i2] = c1335z1;
            C2598ww c2598ww = c1335z1.f4229z;
            c2598ww.f8000w = i2;
            this.f1529G = i2 + 1;
            c2598ww.m4476N(this, c1335z1);
        }
        if (this.f1543z) {
            int i3 = 0;
            while (i3 < this.f1529G) {
                if (this.f1533Q[i3] == null) {
                    System.out.println("WTF");
                }
                C1335Z1 c1335z12 = this.f1533Q[i3];
                if (c1335z12 != null && c1335z12.f4225N) {
                    c1335z12.f4229z.m4477P(this, c1335z12.f4227h);
                    ((C1095UY) this.f1536V.f1766v).mo1756h(c1335z12);
                    this.f1533Q[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f1529G;
                        if (i4 >= i) {
                            break;
                        }
                        C1335Z1[] c1335z1Arr2 = this.f1533Q;
                        int i6 = i4 - 1;
                        C1335Z1 c1335z13 = c1335z1Arr2[i4];
                        c1335z1Arr2[i6] = c1335z13;
                        C2598ww c2598ww2 = c1335z13.f4229z;
                        if (c2598ww2.f8000w == i4) {
                            c2598ww2.f8000w = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f1533Q[i5] = null;
                    }
                    this.f1529G = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f1543z = false;
        }
    }

    /* renamed from: g */
    public final void m1104g(C1335Z1 c1335z1) {
        for (int i = 0; i < this.f1537W; i++) {
            this.f1539o[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f1537W * 2) {
                return;
            }
            C2598ww c2598ww = c1335z1.f4229z;
            if (c2598ww != null) {
                this.f1539o[c2598ww.f7992R] = true;
            }
            C2598ww mo2181P = c1335z1.mo2181P(this.f1539o);
            if (mo2181P != null) {
                boolean[] zArr = this.f1539o;
                int i3 = mo2181P.f7992R;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (mo2181P != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f1529G; i5++) {
                    C1335Z1 c1335z12 = this.f1533Q[i5];
                    if (c1335z12.f4229z.f7995f != 1 && !c1335z12.f4225N && c1335z12.f4226P.mo1664P(mo2181P)) {
                        float mo1666W = c1335z12.f4226P.mo1666W(mo2181P);
                        if (mo1666W < 0.0f) {
                            float f2 = (-c1335z12.f4227h) / mo1666W;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C1335Z1 c1335z13 = this.f1533Q[i4];
                    c1335z13.f4229z.f8000w = -1;
                    c1335z13.m2726u(mo2181P);
                    C2598ww c2598ww2 = c1335z13.f4229z;
                    c2598ww2.f8000w = i4;
                    c2598ww2.m4476N(this, c1335z13);
                }
            } else {
                z = true;
            }
        }
    }

    /* renamed from: h */
    public final void m1105h(C2598ww c2598ww, C2598ww c2598ww2, int i, float f, C2598ww c2598ww3, C2598ww c2598ww4, int i2, int i3) {
        int i4;
        float f2;
        C1335Z1 m1101S = m1101S();
        if (c2598ww2 == c2598ww3) {
            m1101S.f4226P.mo1670v(c2598ww, 1.0f);
            m1101S.f4226P.mo1670v(c2598ww4, 1.0f);
            m1101S.f4226P.mo1670v(c2598ww2, -2.0f);
        } else {
            if (f == 0.5f) {
                m1101S.f4226P.mo1670v(c2598ww, 1.0f);
                m1101S.f4226P.mo1670v(c2598ww2, -1.0f);
                m1101S.f4226P.mo1670v(c2598ww3, -1.0f);
                m1101S.f4226P.mo1670v(c2598ww4, 1.0f);
                if (i > 0 || i2 > 0) {
                    i4 = (-i) + i2;
                    f2 = i4;
                }
            } else if (f <= 0.0f) {
                m1101S.f4226P.mo1670v(c2598ww, -1.0f);
                m1101S.f4226P.mo1670v(c2598ww2, 1.0f);
                f2 = i;
            } else if (f >= 1.0f) {
                m1101S.f4226P.mo1670v(c2598ww4, -1.0f);
                m1101S.f4226P.mo1670v(c2598ww3, 1.0f);
                i4 = -i2;
                f2 = i4;
            } else {
                float f3 = 1.0f - f;
                m1101S.f4226P.mo1670v(c2598ww, f3 * 1.0f);
                m1101S.f4226P.mo1670v(c2598ww2, f3 * (-1.0f));
                m1101S.f4226P.mo1670v(c2598ww3, (-1.0f) * f);
                m1101S.f4226P.mo1670v(c2598ww4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    m1101S.f4227h = (i2 * f) + ((-i) * f3);
                }
            }
            m1101S.f4227h = f2;
        }
        if (i3 != 8) {
            m1101S.m2728z(this, i3);
        }
        m1111v(m1101S);
    }

    /* renamed from: k */
    public final void m1106k(C1004Sp c1004Sp) {
        float f;
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            f = 0.0f;
            i = 1;
            if (i2 < this.f1529G) {
                C1335Z1 c1335z1 = this.f1533Q[i2];
                if (c1335z1.f4229z.f7995f != 1 && c1335z1.f4227h < 0.0f) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3 += i;
                float f2 = Float.MAX_VALUE;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                while (i6 < this.f1529G) {
                    C1335Z1 c1335z12 = this.f1533Q[i6];
                    if (c1335z12.f4229z.f7995f != i && !c1335z12.f4225N && c1335z12.f4227h < f) {
                        int mo1662M = c1335z12.f4226P.mo1662M();
                        int i8 = 0;
                        while (i8 < mo1662M) {
                            C2598ww mo1665Q = c1335z12.f4226P.mo1665Q(i8);
                            float mo1666W = c1335z12.f4226P.mo1666W(mo1665Q);
                            if (mo1666W > f) {
                                for (int i9 = 0; i9 < 9; i9++) {
                                    float f3 = mo1665Q.f7996g[i9] / mo1666W;
                                    if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                        i5 = mo1665Q.f7992R;
                                        i7 = i9;
                                        f2 = f3;
                                        i4 = i6;
                                    }
                                }
                            }
                            i8++;
                            f = 0.0f;
                        }
                    }
                    i6++;
                    f = 0.0f;
                    i = 1;
                }
                if (i4 != -1) {
                    C1335Z1 c1335z13 = this.f1533Q[i4];
                    c1335z13.f4229z.f8000w = -1;
                    c1335z13.m2726u(((C2598ww[]) this.f1536V.f1763N)[i5]);
                    C2598ww c2598ww = c1335z13.f4229z;
                    c2598ww.f8000w = i4;
                    c2598ww.m4476N(this, c1335z13);
                } else {
                    z2 = true;
                }
                if (i3 > this.f1537W / 2) {
                    z2 = true;
                }
                f = 0.0f;
                i = 1;
            }
        }
        m1104g(c1004Sp);
        m1094G();
    }

    /* renamed from: o */
    public final void m1107o(C2598ww c2598ww, C2598ww c2598ww2, C2598ww c2598ww3, C2598ww c2598ww4, float f) {
        C1335Z1 m1101S = m1101S();
        m1101S.f4226P.mo1670v(c2598ww, -1.0f);
        m1101S.f4226P.mo1670v(c2598ww2, 1.0f);
        m1101S.f4226P.mo1670v(c2598ww3, f);
        m1101S.f4226P.mo1670v(c2598ww4, -f);
        m1111v(m1101S);
    }

    /* renamed from: q */
    public final void m1108q() {
        C1004Sp c1004Sp = this.f1541v;
        if (c1004Sp.mo2180N()) {
            m1094G();
            return;
        }
        if (this.f1540u) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f1529G) {
                    z = true;
                    break;
                } else if (!this.f1533Q[i].f4225N) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                m1094G();
                return;
            }
        }
        m1106k(c1004Sp);
    }

    /* renamed from: s */
    public final void m1109s() {
        C0525Ju c0525Ju;
        int i = 0;
        while (true) {
            c0525Ju = this.f1536V;
            C2598ww[] c2598wwArr = (C2598ww[]) c0525Ju.f1763N;
            if (i >= c2598wwArr.length) {
                break;
            }
            C2598ww c2598ww = c2598wwArr[i];
            if (c2598ww != null) {
                c2598ww.m4479v();
            }
            i++;
        }
        C1095UY c1095uy = (C1095UY) c0525Ju.f1764P;
        C2598ww[] c2598wwArr2 = this.f1535S;
        int i2 = this.f1534R;
        c1095uy.getClass();
        if (i2 > c2598wwArr2.length) {
            i2 = c2598wwArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C2598ww c2598ww2 = c2598wwArr2[i3];
            int i4 = c1095uy.f3581v;
            Object[] objArr = c1095uy.f3580h;
            if (i4 < objArr.length) {
                objArr[i4] = c2598ww2;
                c1095uy.f3581v = i4 + 1;
            }
        }
        this.f1534R = 0;
        Arrays.fill((C2598ww[]) c0525Ju.f1763N, (Object) null);
        this.f1538h = 0;
        C1004Sp c1004Sp = this.f1541v;
        c1004Sp.f3372o = 0;
        c1004Sp.f4227h = 0.0f;
        this.f1537W = 1;
        for (int i5 = 0; i5 < this.f1529G; i5++) {
            C1335Z1 c1335z1 = this.f1533Q[i5];
        }
        m1112y();
        this.f1529G = 0;
        this.f1542w = new C1335Z1(c0525Ju);
    }

    /* renamed from: u */
    public final void m1110u(C2598ww c2598ww, C2598ww c2598ww2, int i, int i2) {
        C1335Z1 m1101S = m1101S();
        C2598ww m1100R = m1100R();
        m1100R.f7991I = 0;
        m1101S.m2727v(c2598ww, c2598ww2, m1100R, i);
        if (i2 != 8) {
            m1101S.f4226P.mo1670v(m1096M(i2), (int) (m1101S.f4226P.mo1666W(m1100R) * (-1.0f)));
        }
        m1111v(m1101S);
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x00b9, code lost:
    
        if (r4.f7990E <= 1) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x00c2, code lost:
    
        if (r4.f7990E <= 1) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x00c5, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x00e0, code lost:
    
        if (r4.f7990E <= 1) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x00e9, code lost:
    
        if (r4.f7990E <= 1) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x00ec, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:291:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x01b2  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1111v(p000a.C1335Z1 r17) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0457If.m1111v(a.Z1):void");
    }

    /* renamed from: y */
    public final void m1112y() {
        for (int i = 0; i < this.f1529G; i++) {
            C1335Z1 c1335z1 = this.f1533Q[i];
            if (c1335z1 != null) {
                ((C1095UY) this.f1536V.f1766v).mo1756h(c1335z1);
            }
            this.f1533Q[i] = null;
        }
    }

    /* renamed from: z */
    public final C2598ww m1113z(int i) {
        C2598ww c2598ww = (C2598ww) ((C1095UY) this.f1536V.f1764P).mo1757z();
        if (c2598ww == null) {
            c2598ww = new C2598ww(i);
        } else {
            c2598ww.m4479v();
        }
        c2598ww.f7995f = i;
        int i2 = this.f1534R;
        int i3 = f1528q;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f1528q = i4;
            this.f1535S = (C2598ww[]) Arrays.copyOf(this.f1535S, i4);
        }
        C2598ww[] c2598wwArr = this.f1535S;
        int i5 = this.f1534R;
        this.f1534R = i5 + 1;
        c2598wwArr[i5] = c2598ww;
        return c2598ww;
    }
}
