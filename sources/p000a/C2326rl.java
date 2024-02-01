package p000a;

import java.io.EOFException;

/* renamed from: a.rl */
/* loaded from: classes.dex */
public final class C2326rl extends AbstractC0932RY {

    /* renamed from: E */
    public static final C1623eY f7156E;

    /* renamed from: J */
    public static final C1623eY f7157J;

    /* renamed from: Y */
    public static final C1623eY f7158Y;

    /* renamed from: f */
    public static final C1623eY f7159f;

    /* renamed from: r */
    public static final C1623eY f7160r;

    /* renamed from: U */
    public String f7161U;

    /* renamed from: g */
    public int f7162g = 0;

    /* renamed from: k */
    public final C2361sQ f7163k;

    /* renamed from: q */
    public final InterfaceC0694N7 f7164q;

    /* renamed from: s */
    public int f7165s;

    /* renamed from: y */
    public long f7166y;

    static {
        C1623eY c1623eY = C1623eY.f5009I;
        f7156E = C2252qQ.m3884M("'\\");
        f7159f = C2252qQ.m3884M("\"\\");
        f7160r = C2252qQ.m3884M("{}[]:, \n\t\r\f/\\;#=");
        f7158Y = C2252qQ.m3884M("\n\r");
        f7157J = C2252qQ.m3884M("*/");
    }

    public C2326rl(InterfaceC0694N7 interfaceC0694N7) {
        this.f7164q = interfaceC0694N7;
        this.f7163k = interfaceC0694N7.mo1634v();
        m2098dx(6);
    }

    @Override // p000a.AbstractC0932RY
    /* renamed from: BO */
    public final String mo2089BO() {
        String m4072G5;
        C1623eY c1623eY;
        int i = this.f7162g;
        if (i == 0) {
            i = m3981G5();
        }
        if (i == 10) {
            m4072G5 = m3990yF();
        } else {
            if (i == 9) {
                c1623eY = f7159f;
            } else if (i == 8) {
                c1623eY = f7156E;
            } else if (i == 11) {
                m4072G5 = this.f7161U;
                this.f7161U = null;
            } else if (i == 16) {
                m4072G5 = Long.toString(this.f7166y);
            } else {
                if (i != 17) {
                    throw new C1237X6("Expected a string but was " + AbstractC2441tz.m4197f(mo2100he()) + " at path " + m2101od());
                }
                m4072G5 = this.f7163k.m4072G5(this.f7165s);
            }
            m4072G5 = m3985d3(c1623eY);
        }
        this.f7162g = 0;
        int[] iArr = this.f3197I;
        int i2 = this.f3199S - 1;
        iArr[i2] = iArr[i2] + 1;
        return m4072G5;
    }

    /* renamed from: BX */
    public final int m3979BX(String str, C1624eZ c1624eZ) {
        int length = ((String[]) c1624eZ.f5013R).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) c1624eZ.f5013R)[i])) {
                this.f7162g = 0;
                this.f3200w[this.f3199S - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // p000a.AbstractC0932RY
    /* renamed from: C */
    public final double mo2090C() {
        String m3990yF;
        C1623eY c1623eY;
        double parseDouble;
        int i = this.f7162g;
        if (i == 0) {
            i = m3981G5();
        }
        if (i == 16) {
            this.f7162g = 0;
            int[] iArr = this.f3197I;
            int i2 = this.f3199S - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f7166y;
        }
        try {
            if (i == 17) {
                m3990yF = this.f7163k.m4072G5(this.f7165s);
            } else {
                if (i == 9) {
                    c1623eY = f7159f;
                } else if (i == 8) {
                    c1623eY = f7156E;
                } else {
                    if (i != 10) {
                        if (i != 11) {
                            throw new C1237X6("Expected a double but was " + AbstractC2441tz.m4197f(mo2100he()) + " at path " + m2101od());
                        }
                        this.f7162g = 11;
                        parseDouble = Double.parseDouble(this.f7161U);
                        if (!Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                            throw new C1904jq("JSON forbids NaN and infinities: " + parseDouble + " at path " + m2101od());
                        }
                        this.f7161U = null;
                        this.f7162g = 0;
                        int[] iArr2 = this.f3197I;
                        int i3 = this.f3199S - 1;
                        iArr2[i3] = iArr2[i3] + 1;
                        return parseDouble;
                    }
                    m3990yF = m3990yF();
                }
                m3990yF = m3985d3(c1623eY);
            }
            parseDouble = Double.parseDouble(this.f7161U);
            if (Double.isNaN(parseDouble)) {
            }
            throw new C1904jq("JSON forbids NaN and infinities: " + parseDouble + " at path " + m2101od());
        } catch (NumberFormatException unused) {
            throw new C1237X6("Expected a double but was " + this.f7161U + " at path " + m2101od());
        }
        this.f7161U = m3990yF;
        this.f7162g = 11;
    }

    /* renamed from: EQ */
    public final void m3980EQ(C1623eY c1623eY) {
        while (true) {
            long mo1621O = this.f7164q.mo1621O(c1623eY);
            if (mo1621O == -1) {
                m2094Pm("Unterminated string");
                throw null;
            }
            C2361sQ c2361sQ = this.f7163k;
            byte m4079U8 = c2361sQ.m4079U8(mo1621O);
            c2361sQ.mo1632r(mo1621O + 1);
            if (m4079U8 != 92) {
                return;
            } else {
                m3989tJ();
            }
        }
    }

    @Override // p000a.AbstractC0932RY
    /* renamed from: G */
    public final void mo2091G() {
        int i = this.f7162g;
        if (i == 0) {
            i = m3981G5();
        }
        if (i != 4) {
            throw new C1237X6("Expected END_ARRAY but was " + AbstractC2441tz.m4197f(mo2100he()) + " at path " + m2101od());
        }
        int i2 = this.f3199S - 1;
        this.f3199S = i2;
        int[] iArr = this.f3197I;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f7162g = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:387:0x01ab, code lost:
    
        if (m3986dG(r13) != false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x01ad, code lost:
    
        if (r8 != 2) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x01af, code lost:
    
        if (r2 == false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x01b5, code lost:
    
        if (r3 != Long.MIN_VALUE) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x01b7, code lost:
    
        if (r5 == false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x01bd, code lost:
    
        if (r3 != 0) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x01bf, code lost:
    
        if (r5 != false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x01c1, code lost:
    
        if (r5 == false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x01c4, code lost:
    
        r3 = -r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x01c5, code lost:
    
        r21.f7166y = r3;
        r10.mo1632r(r1);
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x01ce, code lost:
    
        if (r8 == 2) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x01d1, code lost:
    
        if (r8 == 4) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x01d4, code lost:
    
        if (r8 != 7) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x01d6, code lost:
    
        r21.f7165s = r1;
        r1 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x01da, code lost:
    
        r8 = r1;
        r21.f7162g = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:297:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0202 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x024c  */
    /* renamed from: G5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m3981G5() {
        /*
            Method dump skipped, instructions count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2326rl.m3981G5():int");
    }

    @Override // p000a.AbstractC0932RY
    /* renamed from: Ha */
    public final void mo2092Ha() {
        C1623eY c1623eY;
        int i = 0;
        do {
            int i2 = this.f7162g;
            if (i2 == 0) {
                i2 = m3981G5();
            }
            if (i2 == 3) {
                m2098dx(1);
            } else if (i2 == 1) {
                m2098dx(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        throw new C1237X6("Expected a value but was " + AbstractC2441tz.m4197f(mo2100he()) + " at path " + m2101od());
                    }
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        throw new C1237X6("Expected a value but was " + AbstractC2441tz.m4197f(mo2100he()) + " at path " + m2101od());
                    }
                } else {
                    C2361sQ c2361sQ = this.f7163k;
                    if (i2 != 14 && i2 != 10) {
                        if (i2 != 9 && i2 != 13) {
                            if (i2 != 8 && i2 != 12) {
                                if (i2 == 17) {
                                    c2361sQ.mo1632r(this.f7165s);
                                } else if (i2 == 18) {
                                    throw new C1237X6("Expected a value but was " + AbstractC2441tz.m4197f(mo2100he()) + " at path " + m2101od());
                                }
                            } else {
                                c1623eY = f7156E;
                            }
                        } else {
                            c1623eY = f7159f;
                        }
                        m3980EQ(c1623eY);
                    } else {
                        long mo1621O = this.f7164q.mo1621O(f7160r);
                        if (mo1621O == -1) {
                            mo1621O = c2361sQ.f7260R;
                        }
                        c2361sQ.mo1632r(mo1621O);
                    }
                    this.f7162g = 0;
                }
                this.f3199S--;
                this.f7162g = 0;
            }
            i++;
            this.f7162g = 0;
        } while (i != 0);
        int[] iArr = this.f3197I;
        int i3 = this.f3199S;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f3200w[i3 - 1] = "null";
    }

    @Override // p000a.AbstractC0932RY
    /* renamed from: Lq */
    public final void mo2093Lq() {
        C1623eY c1623eY;
        int i = this.f7162g;
        if (i == 0) {
            i = m3981G5();
        }
        if (i == 14) {
            long mo1621O = this.f7164q.mo1621O(f7160r);
            C2361sQ c2361sQ = this.f7163k;
            if (mo1621O == -1) {
                mo1621O = c2361sQ.f7260R;
            }
            c2361sQ.mo1632r(mo1621O);
        } else {
            if (i == 13) {
                c1623eY = f7159f;
            } else if (i == 12) {
                c1623eY = f7156E;
            } else if (i != 15) {
                throw new C1237X6("Expected a name but was " + AbstractC2441tz.m4197f(mo2100he()) + " at path " + m2101od());
            }
            m3980EQ(c1623eY);
        }
        this.f7162g = 0;
        this.f3200w[this.f3199S - 1] = "null";
    }

    /* renamed from: O4 */
    public final String m3982O4() {
        String str;
        C1623eY c1623eY;
        int i = this.f7162g;
        if (i == 0) {
            i = m3981G5();
        }
        if (i == 14) {
            str = m3990yF();
        } else {
            if (i == 13) {
                c1623eY = f7159f;
            } else if (i == 12) {
                c1623eY = f7156E;
            } else {
                if (i != 15) {
                    throw new C1237X6("Expected a name but was " + AbstractC2441tz.m4197f(mo2100he()) + " at path " + m2101od());
                }
                str = this.f7161U;
                this.f7161U = null;
            }
            str = m3985d3(c1623eY);
        }
        this.f7162g = 0;
        this.f3200w[this.f3199S - 1] = str;
        return str;
    }

    /* renamed from: Ry */
    public final void m3983Ry() {
        long j;
        long mo1621O = this.f7164q.mo1621O(f7158Y);
        C2361sQ c2361sQ = this.f7163k;
        if (mo1621O != -1) {
            j = mo1621O + 1;
        } else {
            j = c2361sQ.f7260R;
        }
        c2361sQ.mo1632r(j);
    }

    @Override // p000a.AbstractC0932RY
    /* renamed from: U8 */
    public final void mo2095U8() {
        int i = this.f7162g;
        if (i == 0) {
            i = m3981G5();
        }
        if (i == 7) {
            this.f7162g = 0;
            int[] iArr = this.f3197I;
            int i2 = this.f3199S - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new C1237X6("Expected null but was " + AbstractC2441tz.m4197f(mo2100he()) + " at path " + m2101od());
    }

    @Override // p000a.AbstractC0932RY
    /* renamed from: V */
    public final void mo2096V() {
        int i = this.f7162g;
        if (i == 0) {
            i = m3981G5();
        }
        if (i != 2) {
            throw new C1237X6("Expected END_OBJECT but was " + AbstractC2441tz.m4197f(mo2100he()) + " at path " + m2101od());
        }
        int i2 = this.f3199S - 1;
        this.f3199S = i2;
        this.f3200w[i2] = null;
        int[] iArr = this.f3197I;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f7162g = 0;
    }

    @Override // p000a.AbstractC0932RY
    /* renamed from: ZH */
    public final int mo2097ZH(C1624eZ c1624eZ) {
        int i = this.f7162g;
        if (i == 0) {
            i = m3981G5();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m3979BX(this.f7161U, c1624eZ);
        }
        int mo1625Z = this.f7164q.mo1625Z((C2678ya) c1624eZ.f5015w);
        if (mo1625Z != -1) {
            this.f7162g = 0;
            this.f3200w[this.f3199S - 1] = ((String[]) c1624eZ.f5013R)[mo1625Z];
            return mo1625Z;
        }
        String str = this.f3200w[this.f3199S - 1];
        String m3982O4 = m3982O4();
        int m3979BX = m3979BX(m3982O4, c1624eZ);
        if (m3979BX == -1) {
            this.f7162g = 15;
            this.f7161U = m3982O4;
            this.f3200w[this.f3199S - 1] = str;
        }
        return m3979BX;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7162g = 0;
        this.f3198R[0] = 8;
        this.f3199S = 1;
        this.f7163k.m4091z();
        this.f7164q.close();
    }

    /* renamed from: d2 */
    public final int m3984d2(String str, C1624eZ c1624eZ) {
        int length = ((String[]) c1624eZ.f5013R).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) c1624eZ.f5013R)[i])) {
                this.f7162g = 0;
                int[] iArr = this.f3197I;
                int i2 = this.f3199S - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d3 */
    public final String m3985d3(C1623eY c1623eY) {
        StringBuilder sb = null;
        while (true) {
            long mo1621O = this.f7164q.mo1621O(c1623eY);
            if (mo1621O == -1) {
                m2094Pm("Unterminated string");
                throw null;
            }
            C2361sQ c2361sQ = this.f7163k;
            if (c2361sQ.m4079U8(mo1621O) != 92) {
                String m4072G5 = c2361sQ.m4072G5(mo1621O);
                if (sb == null) {
                    c2361sQ.mo1616EC();
                    return m4072G5;
                }
                sb.append(m4072G5);
                c2361sQ.mo1616EC();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(c2361sQ.m4072G5(mo1621O));
            c2361sQ.mo1616EC();
            sb.append(m3989tJ());
        }
    }

    /* renamed from: dG */
    public final boolean m3986dG(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m3988oI();
        return false;
    }

    @Override // p000a.AbstractC0932RY
    /* renamed from: h */
    public final void mo2099h() {
        int i = this.f7162g;
        if (i == 0) {
            i = m3981G5();
        }
        if (i == 1) {
            m2098dx(3);
            this.f7162g = 0;
        } else {
            throw new C1237X6("Expected BEGIN_OBJECT but was " + AbstractC2441tz.m4197f(mo2100he()) + " at path " + m2101od());
        }
    }

    @Override // p000a.AbstractC0932RY
    /* renamed from: he */
    public final int mo2100he() {
        int i = this.f7162g;
        if (i == 0) {
            i = m3981G5();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0080, code lost:
    
        m3983Ry();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0085, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0025, code lost:
    
        r1.mo1632r((long) (r2 - 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x002d, code lost:
    
        if (r3 != 47) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0035, code lost:
    
        if (r5.mo1617F(2) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0037, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0038, code lost:
    
        m3988oI();
        r4 = r1.m4079U8(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0043, code lost:
    
        if (r4 == 42) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0045, code lost:
    
        if (r4 == 47) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0047, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0048, code lost:
    
        r1.mo1616EC();
        r1.mo1616EC();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x004f, code lost:
    
        r1.mo1616EC();
        r1.mo1616EC();
        r3 = r5.mo1624X(p000a.C2326rl.f7157J);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x005f, code lost:
    
        if (r3 == (-1)) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0061, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0062, code lost:
    
        if (r0 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0064, code lost:
    
        r3 = r3 + r2.f5011S.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x006a, code lost:
    
        r3 = r1.f7260R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x006c, code lost:
    
        r1.mo1632r(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x006f, code lost:
    
        if (r0 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0072, code lost:
    
        m2094Pm("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0078, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x007b, code lost:
    
        if (r3 != 35) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x007d, code lost:
    
        m3988oI();
     */
    /* renamed from: nB */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m3987nB(boolean r9) {
        /*
            r8 = this;
        L0:
            r0 = 0
            r1 = r0
        L2:
            int r2 = r1 + 1
            long r3 = (long) r2
            a.N7 r5 = r8.f7164q
            boolean r3 = r5.mo1617F(r3)
            if (r3 == 0) goto L89
            long r3 = (long) r1
            a.sQ r1 = r8.f7163k
            byte r3 = r1.m4079U8(r3)
            r4 = 10
            if (r3 == r4) goto L86
            r4 = 32
            if (r3 == r4) goto L86
            r4 = 13
            if (r3 == r4) goto L86
            r4 = 9
            if (r3 != r4) goto L25
            goto L86
        L25:
            int r2 = r2 + (-1)
            long r6 = (long) r2
            r1.mo1632r(r6)
            r2 = 47
            if (r3 != r2) goto L79
            r6 = 2
            boolean r4 = r5.mo1617F(r6)
            if (r4 != 0) goto L38
            return r3
        L38:
            r8.m3988oI()
            r6 = 1
            byte r4 = r1.m4079U8(r6)
            r6 = 42
            if (r4 == r6) goto L4f
            if (r4 == r2) goto L48
            return r3
        L48:
            r1.mo1616EC()
            r1.mo1616EC()
            goto L80
        L4f:
            r1.mo1616EC()
            r1.mo1616EC()
            a.eY r2 = p000a.C2326rl.f7157J
            long r3 = r5.mo1624X(r2)
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L62
            r0 = 1
        L62:
            if (r0 == 0) goto L6a
            byte[] r2 = r2.f5011S
            int r2 = r2.length
            long r5 = (long) r2
            long r3 = r3 + r5
            goto L6c
        L6a:
            long r3 = r1.f7260R
        L6c:
            r1.mo1632r(r3)
            if (r0 == 0) goto L72
            goto L0
        L72:
            java.lang.String r9 = "Unterminated comment"
            r8.m2094Pm(r9)
            r9 = 0
            throw r9
        L79:
            r0 = 35
            if (r3 != r0) goto L85
            r8.m3988oI()
        L80:
            r8.m3983Ry()
            goto L0
        L85:
            return r3
        L86:
            r1 = r2
            goto L2
        L89:
            if (r9 != 0) goto L8d
            r9 = -1
            return r9
        L8d:
            java.io.EOFException r9 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2326rl.m3987nB(boolean):int");
    }

    /* renamed from: oI */
    public final void m3988oI() {
        m2094Pm("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* renamed from: tJ */
    public final char m3989tJ() {
        int i;
        int i2;
        InterfaceC0694N7 interfaceC0694N7 = this.f7164q;
        if (!interfaceC0694N7.mo1617F(1L)) {
            m2094Pm("Unterminated escape sequence");
            throw null;
        }
        C2361sQ c2361sQ = this.f7163k;
        byte mo1616EC = c2361sQ.mo1616EC();
        if (mo1616EC == 10 || mo1616EC == 34 || mo1616EC == 39 || mo1616EC == 47 || mo1616EC == 92) {
            return (char) mo1616EC;
        }
        if (mo1616EC == 98) {
            return '\b';
        }
        if (mo1616EC == 102) {
            return '\f';
        }
        if (mo1616EC == 110) {
            return '\n';
        }
        if (mo1616EC == 114) {
            return '\r';
        }
        if (mo1616EC == 116) {
            return '\t';
        }
        if (mo1616EC != 117) {
            m2094Pm("Invalid escape sequence: \\" + ((char) mo1616EC));
            throw null;
        }
        if (!interfaceC0694N7.mo1617F(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + m2101od());
        }
        char c = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            byte m4079U8 = c2361sQ.m4079U8(i3);
            char c2 = (char) (c << 4);
            if (m4079U8 < 48 || m4079U8 > 57) {
                if (m4079U8 >= 97 && m4079U8 <= 102) {
                    i = m4079U8 - 97;
                } else {
                    if (m4079U8 < 65 || m4079U8 > 70) {
                        m2094Pm("\\u".concat(c2361sQ.m4072G5(4L)));
                        throw null;
                    }
                    i = m4079U8 - 65;
                }
                i2 = i + 10;
            } else {
                i2 = m4079U8 - 48;
            }
            c = (char) (i2 + c2);
        }
        c2361sQ.mo1632r(4L);
        return c;
    }

    public final String toString() {
        return "JsonReader(" + this.f7164q + ")";
    }

    @Override // p000a.AbstractC0932RY
    /* renamed from: x */
    public final int mo2102x() {
        int i = this.f7162g;
        if (i == 0) {
            i = m3981G5();
        }
        if (i == 16) {
            long j = this.f7166y;
            int i2 = (int) j;
            if (j == i2) {
                this.f7162g = 0;
                int[] iArr = this.f3197I;
                int i3 = this.f3199S - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new C1237X6("Expected an int but was " + this.f7166y + " at path " + m2101od());
        }
        if (i == 17) {
            this.f7161U = this.f7163k.m4072G5(this.f7165s);
        } else if (i == 9 || i == 8) {
            String m3985d3 = m3985d3(i == 9 ? f7159f : f7156E);
            this.f7161U = m3985d3;
            try {
                int parseInt = Integer.parseInt(m3985d3);
                this.f7162g = 0;
                int[] iArr2 = this.f3197I;
                int i4 = this.f3199S - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new C1237X6("Expected an int but was " + AbstractC2441tz.m4197f(mo2100he()) + " at path " + m2101od());
        }
        this.f7162g = 11;
        try {
            double parseDouble = Double.parseDouble(this.f7161U);
            int i5 = (int) parseDouble;
            if (i5 != parseDouble) {
                throw new C1237X6("Expected an int but was " + this.f7161U + " at path " + m2101od());
            }
            this.f7161U = null;
            this.f7162g = 0;
            int[] iArr3 = this.f3197I;
            int i6 = this.f3199S - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new C1237X6("Expected an int but was " + this.f7161U + " at path " + m2101od());
        }
    }

    @Override // p000a.AbstractC0932RY
    /* renamed from: y */
    public final boolean mo2103y() {
        int i = this.f7162g;
        if (i == 0) {
            i = m3981G5();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    /* renamed from: yF */
    public final String m3990yF() {
        long mo1621O = this.f7164q.mo1621O(f7160r);
        C2361sQ c2361sQ = this.f7163k;
        return mo1621O != -1 ? c2361sQ.m4072G5(mo1621O) : c2361sQ.m4087oI();
    }

    @Override // p000a.AbstractC0932RY
    /* renamed from: z */
    public final void mo2104z() {
        int i = this.f7162g;
        if (i == 0) {
            i = m3981G5();
        }
        if (i == 3) {
            m2098dx(1);
            this.f3197I[this.f3199S - 1] = 0;
            this.f7162g = 0;
        } else {
            throw new C1237X6("Expected BEGIN_ARRAY but was " + AbstractC2441tz.m4197f(mo2100he()) + " at path " + m2101od());
        }
    }
}
