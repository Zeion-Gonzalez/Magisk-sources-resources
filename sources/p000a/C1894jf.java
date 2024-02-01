package p000a;

import java.util.Arrays;

/* renamed from: a.jf */
/* loaded from: classes.dex */
public class C1894jf extends AbstractC0629Lq implements InterfaceC1634ej, InterfaceC2445u2 {

    /* renamed from: E */
    public int f5917E;

    /* renamed from: I */
    public final int f5918I;

    /* renamed from: U */
    public int f5919U;

    /* renamed from: g */
    public Object[] f5920g;

    /* renamed from: k */
    public final int f5921k;

    /* renamed from: q */
    public final int f5922q;

    /* renamed from: s */
    public long f5923s;

    /* renamed from: y */
    public long f5924y;

    public C1894jf(int i, int i2, int i3) {
        this.f5918I = i;
        this.f5922q = i2;
        this.f5921k = i3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(7:(2:3|(10:5|6|7|(2:9|(1:(1:(7:13|14|15|16|17|(2:18|(9:26|(1:28)|29|(1:31)|15|16|17|18|(0)(1:20))(0))|23)(2:33|34))(5:35|36|17|(2:18|(0)(0))|23))(4:37|38|39|40))(1:50)|41|42|16|17|(2:18|(0)(0))|23))|41|42|16|17|(2:18|(0)(0))|23)|53|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x004d, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00a3, code lost:
    
        r2 = r5;
        r7 = r9;
        r9 = r8;
        r8 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x007c A[Catch: all -> 0x004d, TryCatch #2 {all -> 0x004d, blocks: (B:72:0x0031, B:89:0x0074, B:91:0x007c, B:95:0x008f, B:96:0x0092, B:77:0x0049), top: B:108:0x0020 }] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.u2] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v6, types: [a.pw] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x00a0 -> B:73:0x0034). Please submit an issue!!! */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000a.EnumC0464Im m3522W(p000a.C1894jf r8, p000a.InterfaceC2445u2 r9, p000a.InterfaceC1171Vv r10) {
        /*
            boolean r0 = r10 instanceof p000a.C0812P8
            if (r0 == 0) goto L13
            r0 = r10
            a.P8 r0 = (p000a.C0812P8) r0
            int r1 = r0.f2755U
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2755U = r1
            goto L18
        L13:
            a.P8 r0 = new a.P8
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f2760y
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f2755U
            r3 = 2
            r4 = 3
            if (r2 == 0) goto L5d
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r3) goto L41
            if (r2 != r4) goto L39
            a.Xh r8 = r0.f2756g
            a.pw r9 = r0.f2757k
            a.u2 r2 = r0.f2758q
            a.jf r5 = r0.f2754I
            p000a.AbstractC1292YB.m2664UZ(r10)     // Catch: java.lang.Throwable -> L4d
        L34:
            r10 = r9
            r9 = r2
            r2 = r8
            r8 = r5
            goto L70
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            a.Xh r8 = r0.f2756g
            a.pw r9 = r0.f2757k
            a.u2 r2 = r0.f2758q
            a.jf r5 = r0.f2754I
            p000a.AbstractC1292YB.m2664UZ(r10)     // Catch: java.lang.Throwable -> L4d
            goto L74
        L4d:
            r8 = move-exception
            goto La3
        L4f:
            a.pw r8 = r0.f2757k
            a.u2 r9 = r0.f2758q
            a.jf r2 = r0.f2754I
            p000a.AbstractC1292YB.m2664UZ(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L66
        L5b:
            r9 = move-exception
            goto Lab
        L5d:
            p000a.AbstractC1292YB.m2664UZ(r10)
            a.Ha r10 = r8.m1395v()
            a.pw r10 = (p000a.C2224pw) r10
        L66:
            a.XS r2 = r0.f2025R     // Catch: java.lang.Throwable -> La8
            a.g8 r5 = p000a.C1710g8.f5381k     // Catch: java.lang.Throwable -> La8
            a.UM r2 = r2.mo107y(r5)     // Catch: java.lang.Throwable -> La8
            a.Xh r2 = (p000a.InterfaceC1265Xh) r2     // Catch: java.lang.Throwable -> La8
        L70:
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L74:
            java.lang.Object r10 = r5.m3530k(r9)     // Catch: java.lang.Throwable -> L4d
            a.DP r6 = p000a.AbstractC1292YB.f4133G     // Catch: java.lang.Throwable -> L4d
            if (r10 != r6) goto L8d
            r0.f2754I = r5     // Catch: java.lang.Throwable -> L4d
            r0.f2758q = r2     // Catch: java.lang.Throwable -> L4d
            r0.f2757k = r9     // Catch: java.lang.Throwable -> L4d
            r0.f2756g = r8     // Catch: java.lang.Throwable -> L4d
            r0.f2755U = r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r10 = r5.m3533u(r9, r0)     // Catch: java.lang.Throwable -> L4d
            if (r10 != r1) goto L74
            return r1
        L8d:
            if (r8 == 0) goto L92
            p000a.AbstractC1843ih.m3442f(r8)     // Catch: java.lang.Throwable -> L4d
        L92:
            r0.f2754I = r5     // Catch: java.lang.Throwable -> L4d
            r0.f2758q = r2     // Catch: java.lang.Throwable -> L4d
            r0.f2757k = r9     // Catch: java.lang.Throwable -> L4d
            r0.f2756g = r8     // Catch: java.lang.Throwable -> L4d
            r0.f2755U = r4     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r10 = r2.mo237h(r10, r0)     // Catch: java.lang.Throwable -> L4d
            if (r10 != r1) goto L34
            return r1
        La3:
            r2 = r5
            r7 = r9
            r9 = r8
            r8 = r7
            goto Lab
        La8:
            r9 = move-exception
            r2 = r8
            r8 = r10
        Lab:
            r2.m1394Q(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1894jf.m3522W(a.jf, a.u2, a.Vv):a.Im");
    }

    /* renamed from: G */
    public final void m3523G() {
        AbstractC0399Ha[] abstractC0399HaArr;
        this.f5920g[((int) m3527S()) & (r0.length - 1)] = null;
        this.f5919U--;
        long m3527S = m3527S() + 1;
        if (this.f5924y < m3527S) {
            this.f5924y = m3527S;
        }
        if (this.f5923s < m3527S) {
            if (this.f2042R != 0 && (abstractC0399HaArr = this.f2043S) != null) {
                for (AbstractC0399Ha abstractC0399Ha : abstractC0399HaArr) {
                    if (abstractC0399Ha != null) {
                        C2224pw c2224pw = (C2224pw) abstractC0399Ha;
                        long j = c2224pw.f6840z;
                        if (j >= 0 && j < m3527S) {
                            c2224pw.f6840z = m3527S;
                        }
                    }
                }
            }
            this.f5923s = m3527S;
        }
    }

    /* renamed from: I */
    public final boolean m3524I(Object obj) {
        int i = this.f2042R;
        int i2 = this.f5918I;
        if (i == 0) {
            if (i2 != 0) {
                m3525M(obj);
                int i3 = this.f5919U + 1;
                this.f5919U = i3;
                if (i3 > i2) {
                    m3523G();
                }
                this.f5923s = m3527S() + this.f5919U;
            }
            return true;
        }
        int i4 = this.f5919U;
        int i5 = this.f5922q;
        if (i4 >= i5 && this.f5923s <= this.f5924y) {
            int m4204s = AbstractC2441tz.m4204s(this.f5921k);
            if (m4204s != 0) {
                if (m4204s == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        m3525M(obj);
        int i6 = this.f5919U + 1;
        this.f5919U = i6;
        if (i6 > i5) {
            m3523G();
        }
        long m3527S = m3527S() + this.f5919U;
        long j = this.f5924y;
        if (((int) (m3527S - j)) > i2) {
            m3529g(j + 1, this.f5923s, m3527S() + this.f5919U, m3527S() + this.f5919U + this.f5917E);
        }
        return true;
    }

    /* renamed from: M */
    public final void m3525M(Object obj) {
        int i = this.f5919U + this.f5917E;
        Object[] objArr = this.f5920g;
        if (objArr == null) {
            objArr = m3526R(0, 2, null);
        } else if (i >= objArr.length) {
            objArr = m3526R(i, objArr.length * 2, objArr);
        }
        objArr[((int) (m3527S() + i)) & (objArr.length - 1)] = obj;
    }

    @Override // p000a.AbstractC0629Lq
    /* renamed from: N */
    public final AbstractC0399Ha[] mo1392N() {
        return new C2224pw[2];
    }

    @Override // p000a.AbstractC0629Lq
    /* renamed from: P */
    public final AbstractC0399Ha mo1393P() {
        return new C2224pw();
    }

    /* renamed from: R */
    public final Object[] m3526R(int i, int i2, Object[] objArr) {
        boolean z;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] objArr2 = new Object[i2];
            this.f5920g = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long m3527S = m3527S();
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = (int) (i3 + m3527S);
                objArr2[i4 & (i2 - 1)] = objArr[(objArr.length - 1) & i4];
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* renamed from: S */
    public final long m3527S() {
        return Math.min(this.f5923s, this.f5924y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: V */
    public final InterfaceC1171Vv[] m3528V(InterfaceC1171Vv[] interfaceC1171VvArr) {
        AbstractC0399Ha[] abstractC0399HaArr;
        C2224pw c2224pw;
        C1525cm c1525cm;
        int length = interfaceC1171VvArr.length;
        if (this.f2042R != 0 && (abstractC0399HaArr = this.f2043S) != null) {
            int length2 = abstractC0399HaArr.length;
            int i = 0;
            interfaceC1171VvArr = interfaceC1171VvArr;
            while (i < length2) {
                AbstractC0399Ha abstractC0399Ha = abstractC0399HaArr[i];
                if (abstractC0399Ha != null && (c1525cm = (c2224pw = (C2224pw) abstractC0399Ha).f6839h) != null && m3532q(c2224pw) >= 0) {
                    int length3 = interfaceC1171VvArr.length;
                    interfaceC1171VvArr = interfaceC1171VvArr;
                    if (length >= length3) {
                        interfaceC1171VvArr = Arrays.copyOf(interfaceC1171VvArr, Math.max(2, interfaceC1171VvArr.length * 2));
                    }
                    interfaceC1171VvArr[length] = c1525cm;
                    c2224pw.f6839h = null;
                    length++;
                }
                i++;
                interfaceC1171VvArr = interfaceC1171VvArr;
            }
        }
        return interfaceC1171VvArr;
    }

    /* renamed from: g */
    public final void m3529g(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long m3527S = m3527S(); m3527S < min; m3527S++) {
            this.f5920g[((int) m3527S) & (r4.length - 1)] = null;
        }
        this.f5924y = j;
        this.f5923s = j2;
        this.f5919U = (int) (j3 - min);
        this.f5917E = (int) (j4 - j3);
    }

    @Override // p000a.InterfaceC2445u2
    /* renamed from: h */
    public final Object mo237h(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        InterfaceC1171Vv[] interfaceC1171VvArr;
        C1531ct c1531ct;
        if (!m3534w(obj)) {
            C1525cm c1525cm = new C1525cm(1, AbstractC0438II.m1026e(interfaceC1171Vv));
            c1525cm.m2962k();
            InterfaceC1171Vv[] interfaceC1171VvArr2 = AbstractC1292YB.f4136P;
            synchronized (this) {
                if (m3524I(obj)) {
                    c1525cm.mo320u(C0329GJ.f1115z);
                    interfaceC1171VvArr = m3528V(interfaceC1171VvArr2);
                    c1531ct = null;
                } else {
                    C1531ct c1531ct2 = new C1531ct(this, this.f5919U + this.f5917E + m3527S(), obj, c1525cm);
                    m3525M(c1531ct2);
                    this.f5917E++;
                    if (this.f5922q == 0) {
                        interfaceC1171VvArr2 = m3528V(interfaceC1171VvArr2);
                    }
                    interfaceC1171VvArr = interfaceC1171VvArr2;
                    c1531ct = c1531ct2;
                }
            }
            int i = 0;
            if (c1531ct != null) {
                c1525cm.m2968y(new C0570Kh(i, c1531ct));
            }
            int length = interfaceC1171VvArr.length;
            while (i < length) {
                InterfaceC1171Vv interfaceC1171Vv2 = interfaceC1171VvArr[i];
                if (interfaceC1171Vv2 != null) {
                    interfaceC1171Vv2.mo320u(C0329GJ.f1115z);
                }
                i++;
            }
            Object m2963q = c1525cm.m2963q();
            EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
            if (m2963q != enumC0464Im) {
                m2963q = C0329GJ.f1115z;
            }
            if (m2963q == enumC0464Im) {
                return m2963q;
            }
        }
        return C0329GJ.f1115z;
    }

    /* renamed from: k */
    public final Object m3530k(C2224pw c2224pw) {
        Object obj;
        InterfaceC1171Vv[] interfaceC1171VvArr = AbstractC1292YB.f4136P;
        synchronized (this) {
            long m3532q = m3532q(c2224pw);
            if (m3532q < 0) {
                obj = AbstractC1292YB.f4133G;
            } else {
                long j = c2224pw.f6840z;
                Object obj2 = this.f5920g[((int) m3532q) & (r0.length - 1)];
                if (obj2 instanceof C1531ct) {
                    obj2 = ((C1531ct) obj2).f4731w;
                }
                c2224pw.f6840z = m3532q + 1;
                Object obj3 = obj2;
                interfaceC1171VvArr = m3535y(j);
                obj = obj3;
            }
        }
        for (InterfaceC1171Vv interfaceC1171Vv : interfaceC1171VvArr) {
            if (interfaceC1171Vv != null) {
                interfaceC1171Vv.mo320u(C0329GJ.f1115z);
            }
        }
        return obj;
    }

    /* renamed from: o */
    public final void m3531o() {
        if (this.f5922q == 0 && this.f5917E <= 1) {
            return;
        }
        Object[] objArr = this.f5920g;
        while (this.f5917E > 0) {
            long m3527S = m3527S();
            int i = this.f5919U;
            int i2 = this.f5917E;
            if (objArr[((int) ((m3527S + (i + i2)) - 1)) & (objArr.length - 1)] == AbstractC1292YB.f4133G) {
                this.f5917E = i2 - 1;
                objArr[((int) (m3527S() + this.f5919U + this.f5917E)) & (objArr.length - 1)] = null;
            } else {
                return;
            }
        }
    }

    /* renamed from: q */
    public final long m3532q(C2224pw c2224pw) {
        long j = c2224pw.f6840z;
        if (j < m3527S() + this.f5919U) {
            return j;
        }
        if (this.f5922q > 0 || j > m3527S() || this.f5917E == 0) {
            return -1L;
        }
        return j;
    }

    /* renamed from: u */
    public final Object m3533u(C2224pw c2224pw, C0812P8 c0812p8) {
        C1525cm c1525cm = new C1525cm(1, AbstractC0438II.m1026e(c0812p8));
        c1525cm.m2962k();
        synchronized (this) {
            if (m3532q(c2224pw) < 0) {
                c2224pw.f6839h = c1525cm;
            } else {
                c1525cm.mo320u(C0329GJ.f1115z);
            }
        }
        Object m2963q = c1525cm.m2963q();
        if (m2963q == EnumC0464Im.f1557S) {
            return m2963q;
        }
        return C0329GJ.f1115z;
    }

    /* renamed from: w */
    public final boolean m3534w(Object obj) {
        int i;
        boolean z;
        InterfaceC1171Vv[] interfaceC1171VvArr = AbstractC1292YB.f4136P;
        synchronized (this) {
            if (m3524I(obj)) {
                interfaceC1171VvArr = m3528V(interfaceC1171VvArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (InterfaceC1171Vv interfaceC1171Vv : interfaceC1171VvArr) {
            if (interfaceC1171Vv != null) {
                interfaceC1171Vv.mo320u(C0329GJ.f1115z);
            }
        }
        return z;
    }

    /* renamed from: y */
    public final InterfaceC1171Vv[] m3535y(long j) {
        int i;
        long j2;
        long j3;
        long j4;
        boolean z;
        long j5;
        AbstractC0399Ha[] abstractC0399HaArr;
        long j6 = this.f5923s;
        InterfaceC1171Vv[] interfaceC1171VvArr = AbstractC1292YB.f4136P;
        if (j > j6) {
            return interfaceC1171VvArr;
        }
        long m3527S = m3527S();
        long j7 = this.f5919U + m3527S;
        int i2 = this.f5922q;
        if (i2 == 0 && this.f5917E > 0) {
            j7++;
        }
        if (this.f2042R != 0 && (abstractC0399HaArr = this.f2043S) != null) {
            for (AbstractC0399Ha abstractC0399Ha : abstractC0399HaArr) {
                if (abstractC0399Ha != null) {
                    long j8 = ((C2224pw) abstractC0399Ha).f6840z;
                    if (j8 >= 0 && j8 < j7) {
                        j7 = j8;
                    }
                }
            }
        }
        if (j7 <= this.f5923s) {
            return interfaceC1171VvArr;
        }
        long m3527S2 = m3527S() + this.f5919U;
        if (this.f2042R > 0) {
            i = Math.min(this.f5917E, i2 - ((int) (m3527S2 - j7)));
        } else {
            i = this.f5917E;
        }
        long j9 = this.f5917E + m3527S2;
        C0175DP c0175dp = AbstractC1292YB.f4133G;
        if (i > 0) {
            interfaceC1171VvArr = new InterfaceC1171Vv[i];
            Object[] objArr = this.f5920g;
            long j10 = m3527S2;
            int i3 = 0;
            while (true) {
                if (m3527S2 < j9) {
                    j2 = j7;
                    int i4 = (int) m3527S2;
                    Object obj = objArr[(objArr.length - 1) & i4];
                    if (obj != c0175dp) {
                        C1531ct c1531ct = (C1531ct) obj;
                        j3 = j9;
                        int i5 = i3 + 1;
                        interfaceC1171VvArr[i3] = c1531ct.f4728I;
                        objArr[i4 & (objArr.length - 1)] = c0175dp;
                        objArr[((int) j10) & (objArr.length - 1)] = c1531ct.f4731w;
                        j5 = 1;
                        j10++;
                        if (i5 >= i) {
                            break;
                        }
                        i3 = i5;
                    } else {
                        j3 = j9;
                        j5 = 1;
                    }
                    m3527S2 += j5;
                    j7 = j2;
                    j9 = j3;
                } else {
                    j2 = j7;
                    j3 = j9;
                    break;
                }
            }
            m3527S2 = j10;
        } else {
            j2 = j7;
            j3 = j9;
        }
        InterfaceC1171Vv[] interfaceC1171VvArr2 = interfaceC1171VvArr;
        int i6 = (int) (m3527S2 - m3527S);
        if (this.f2042R == 0) {
            j4 = m3527S2;
        } else {
            j4 = j2;
        }
        long max = Math.max(this.f5924y, m3527S2 - Math.min(this.f5918I, i6));
        if (i2 == 0 && max < j3) {
            if (AbstractC1292YB.m2695u(this.f5920g[((int) max) & (r0.length - 1)], c0175dp)) {
                m3527S2++;
                max++;
            }
        }
        m3529g(max, j4, m3527S2, j3);
        m3531o();
        if (interfaceC1171VvArr2.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((!z) != false) {
            return m3528V(interfaceC1171VvArr2);
        }
        return interfaceC1171VvArr2;
    }

    @Override // p000a.InterfaceC1634ej
    /* renamed from: z */
    public final Object mo1459z(InterfaceC2445u2 interfaceC2445u2, InterfaceC1171Vv interfaceC1171Vv) {
        return m3522W(this, interfaceC2445u2, interfaceC1171Vv);
    }
}
