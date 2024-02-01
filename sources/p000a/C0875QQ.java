package p000a;

/* renamed from: a.QQ */
/* loaded from: classes.dex */
public final class C0875QQ {

    /* renamed from: G */
    public int f2964G;

    /* renamed from: M */
    public int f2966M;

    /* renamed from: N */
    public C0287FS f2967N;

    /* renamed from: P */
    public C0287FS f2968P;

    /* renamed from: Q */
    public C0287FS f2969Q;

    /* renamed from: W */
    public int f2973W;

    /* renamed from: k */
    public final /* synthetic */ C2607x4 f2975k;

    /* renamed from: o */
    public int f2976o;

    /* renamed from: q */
    public int f2977q;

    /* renamed from: u */
    public C0287FS f2978u;

    /* renamed from: z */
    public int f2981z;

    /* renamed from: h */
    public C1628ed f2974h = null;

    /* renamed from: v */
    public int f2979v = 0;

    /* renamed from: V */
    public int f2972V = 0;

    /* renamed from: S */
    public int f2971S = 0;

    /* renamed from: R */
    public int f2970R = 0;

    /* renamed from: w */
    public int f2980w = 0;

    /* renamed from: I */
    public int f2965I = 0;

    public C0875QQ(C2607x4 c2607x4, int i, C0287FS c0287fs, C0287FS c0287fs2, C0287FS c0287fs3, C0287FS c0287fs4, int i2) {
        this.f2975k = c2607x4;
        this.f2976o = 0;
        this.f2973W = 0;
        this.f2964G = 0;
        this.f2966M = 0;
        this.f2977q = 0;
        this.f2981z = i;
        this.f2968P = c0287fs;
        this.f2967N = c0287fs2;
        this.f2969Q = c0287fs3;
        this.f2978u = c0287fs4;
        this.f2976o = c2607x4.f8051O4;
        this.f2973W = c2607x4.f8045G5;
        this.f2964G = c2607x4.f8070nB;
        this.f2966M = c2607x4.f8040BX;
        this.f2977q = i2;
    }

    /* renamed from: N */
    public final void m2014N(int i) {
        C2607x4 c2607x4;
        int i2;
        int i3;
        int i4;
        int i5;
        int m3098R;
        int i6 = this.f2965I;
        if (i6 == 0) {
            return;
        }
        int i7 = this.f2980w;
        int i8 = i / i6;
        int i9 = 0;
        while (true) {
            c2607x4 = this.f2975k;
            if (i9 >= i7 || (i2 = this.f2970R + i9) >= c2607x4.f8046GV) {
                break;
            }
            C1628ed c1628ed = c2607x4.f8047JG[i2];
            if (this.f2981z == 0) {
                if (c1628ed != null) {
                    int[] iArr = c1628ed.f5030Ha;
                    if (iArr[0] == 3 && c1628ed.f5075q == 0) {
                        int i10 = iArr[1];
                        i4 = c1628ed.m3101V();
                        i5 = i10;
                        i3 = 1;
                        m3098R = i8;
                        c2607x4.m4487n(c1628ed, i3, m3098R, i5, i4);
                    }
                }
                i9++;
            } else {
                if (c1628ed != null) {
                    int[] iArr2 = c1628ed.f5030Ha;
                    if (iArr2[1] == 3 && c1628ed.f5065k == 0) {
                        i3 = iArr2[0];
                        i4 = i8;
                        i5 = 1;
                        m3098R = c1628ed.m3098R();
                        c2607x4.m4487n(c1628ed, i3, m3098R, i5, i4);
                    }
                }
                i9++;
            }
        }
        this.f2972V = 0;
        this.f2971S = 0;
        this.f2974h = null;
        this.f2979v = 0;
        int i11 = this.f2980w;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.f2970R + i12;
            if (i13 < c2607x4.f8046GV) {
                C1628ed c1628ed2 = c2607x4.f8047JG[i13];
                if (this.f2981z == 0) {
                    int m3098R2 = c1628ed2.m3098R();
                    int i14 = c2607x4.f8063fc;
                    if (c1628ed2.f5046UZ == 8) {
                        i14 = 0;
                    }
                    this.f2972V = m3098R2 + i14 + this.f2972V;
                    int m4486d = c2607x4.m4486d(this.f2977q, c1628ed2);
                    if (this.f2974h == null || this.f2979v < m4486d) {
                        this.f2974h = c1628ed2;
                        this.f2979v = m4486d;
                        this.f2971S = m4486d;
                    }
                } else {
                    int m4485O = c2607x4.m4485O(this.f2977q, c1628ed2);
                    int m4486d2 = c2607x4.m4486d(this.f2977q, c1628ed2);
                    int i15 = c2607x4.f8042F3;
                    if (c1628ed2.f5046UZ == 8) {
                        i15 = 0;
                    }
                    this.f2971S = m4486d2 + i15 + this.f2971S;
                    if (this.f2974h == null || this.f2979v < m4485O) {
                        this.f2974h = c1628ed2;
                        this.f2979v = m4485O;
                        this.f2972V = m4485O;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: P */
    public final int m2015P() {
        if (this.f2981z == 0) {
            return this.f2972V - this.f2975k.f8063fc;
        }
        return this.f2972V;
    }

    /* renamed from: Q */
    public final void m2016Q(int i, C0287FS c0287fs, C0287FS c0287fs2, C0287FS c0287fs3, C0287FS c0287fs4, int i2, int i3, int i4, int i5, int i6) {
        this.f2981z = i;
        this.f2968P = c0287fs;
        this.f2967N = c0287fs2;
        this.f2969Q = c0287fs3;
        this.f2978u = c0287fs4;
        this.f2976o = i2;
        this.f2973W = i3;
        this.f2964G = i4;
        this.f2966M = i5;
        this.f2977q = i6;
    }

    /* renamed from: h */
    public final void m2017h(int i, boolean z, boolean z2) {
        C2607x4 c2607x4;
        boolean z3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C1628ed c1628ed;
        int i7;
        int i8;
        char c;
        int i9;
        int i10;
        float f;
        float f2;
        int i11;
        float f3;
        float f4;
        int i12;
        int i13;
        int i14;
        int i15 = this.f2980w;
        int i16 = 0;
        while (true) {
            c2607x4 = this.f2975k;
            if (i16 >= i15 || (i14 = this.f2970R + i16) >= c2607x4.f8046GV) {
                break;
            }
            C1628ed c1628ed2 = c2607x4.f8047JG[i14];
            if (c1628ed2 != null) {
                c1628ed2.m3093J();
            }
            i16++;
        }
        if (i15 != 0 && this.f2974h != null) {
            if (z2 && i == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i17 = -1;
            int i18 = -1;
            for (int i19 = 0; i19 < i15; i19++) {
                if (z) {
                    i13 = (i15 - 1) - i19;
                } else {
                    i13 = i19;
                }
                int i20 = this.f2970R + i13;
                if (i20 >= c2607x4.f8046GV) {
                    break;
                }
                C1628ed c1628ed3 = c2607x4.f8047JG[i20];
                if (c1628ed3 != null && c1628ed3.f5046UZ == 0) {
                    if (i17 == -1) {
                        i17 = i19;
                    }
                    i18 = i19;
                }
            }
            if (this.f2981z == 0) {
                C1628ed c1628ed4 = this.f2974h;
                c1628ed4.f5045U8 = c2607x4.f8052Rh;
                int i21 = this.f2973W;
                if (i > 0) {
                    i21 += c2607x4.f8042F3;
                }
                C0287FS c0287fs = this.f2967N;
                C0287FS c0287fs2 = c1628ed4.f5074p;
                c0287fs2.m596z(c0287fs, i21);
                C0287FS c0287fs3 = c1628ed4.f5034L;
                if (z2) {
                    c0287fs3.m596z(this.f2978u, this.f2966M);
                }
                if (i > 0) {
                    this.f2967N.f993P.f5034L.m596z(c0287fs2, 0);
                }
                if (c2607x4.f8066hW == 3 && !c1628ed4.f5058e) {
                    for (int i22 = 0; i22 < i15; i22++) {
                        if (z) {
                            i12 = (i15 - 1) - i22;
                        } else {
                            i12 = i22;
                        }
                        int i23 = this.f2970R + i12;
                        if (i23 >= c2607x4.f8046GV) {
                            break;
                        }
                        c1628ed = c2607x4.f8047JG[i23];
                        if (c1628ed.f5058e) {
                            break;
                        }
                    }
                }
                c1628ed = c1628ed4;
                int i24 = 0;
                C1628ed c1628ed5 = null;
                while (i24 < i15) {
                    if (z) {
                        i7 = (i15 - 1) - i24;
                    } else {
                        i7 = i24;
                    }
                    int i25 = this.f2970R + i7;
                    if (i25 < c2607x4.f8046GV) {
                        C1628ed c1628ed6 = c2607x4.f8047JG[i25];
                        if (c1628ed6 == null) {
                            i8 = i15;
                            c = 3;
                        } else {
                            C0287FS c0287fs4 = c1628ed6.f5022C;
                            if (i24 == 0) {
                                c1628ed6.m3114u(c0287fs4, this.f2968P, this.f2976o);
                            }
                            if (i7 == 0) {
                                int i26 = c2607x4.f8044Fu;
                                if (z) {
                                    i10 = i26;
                                    f = 1.0f - c2607x4.f8062fH;
                                } else {
                                    i10 = i26;
                                    f = c2607x4.f8062fH;
                                }
                                if (this.f2970R == 0) {
                                    int i27 = c2607x4.f8050M6;
                                    f2 = f;
                                    if (i27 != -1) {
                                        if (z) {
                                            f4 = 1.0f - c2607x4.f8058W9;
                                        } else {
                                            f4 = c2607x4.f8058W9;
                                        }
                                        f3 = f4;
                                        i11 = i27;
                                        c1628ed6.f5025EC = i11;
                                        c1628ed6.f5073od = f3;
                                    }
                                } else {
                                    f2 = f;
                                }
                                if (z2 && (i11 = c2607x4.f8068j5) != -1) {
                                    if (z) {
                                        f3 = 1.0f - c2607x4.f8067hs;
                                    } else {
                                        f3 = c2607x4.f8067hs;
                                    }
                                } else {
                                    i11 = i10;
                                    f3 = f2;
                                }
                                c1628ed6.f5025EC = i11;
                                c1628ed6.f5073od = f3;
                            }
                            if (i24 == i15 - 1) {
                                i8 = i15;
                                c1628ed6.m3114u(c1628ed6.f5064j, this.f2969Q, this.f2964G);
                            } else {
                                i8 = i15;
                            }
                            if (c1628ed5 != null) {
                                int i28 = c2607x4.f8063fc;
                                C0287FS c0287fs5 = c1628ed5.f5064j;
                                c0287fs4.m596z(c0287fs5, i28);
                                if (i24 == i17) {
                                    int i29 = this.f2976o;
                                    if (c0287fs4.m593o()) {
                                        c0287fs4.f997o = i29;
                                    }
                                }
                                c0287fs5.m596z(c0287fs4, 0);
                                if (i24 == i18 + 1) {
                                    int i30 = this.f2964G;
                                    if (c0287fs5.m593o()) {
                                        c0287fs5.f997o = i30;
                                    }
                                }
                            }
                            if (c1628ed6 != c1628ed4) {
                                int i31 = c2607x4.f8066hW;
                                c = 3;
                                if (i31 == 3 && c1628ed.f5058e && c1628ed6 != c1628ed && c1628ed6.f5058e) {
                                    c1628ed6.f5063i.m596z(c1628ed.f5063i, 0);
                                } else {
                                    C0287FS c0287fs6 = c1628ed6.f5074p;
                                    if (i31 != 0) {
                                        C0287FS c0287fs7 = c1628ed6.f5034L;
                                        if (i31 != 1) {
                                            if (z3) {
                                                c0287fs6.m596z(this.f2967N, this.f2973W);
                                                c0287fs7.m596z(this.f2978u, this.f2966M);
                                            } else {
                                                i9 = 0;
                                                c0287fs6.m596z(c0287fs2, 0);
                                            }
                                        } else {
                                            i9 = 0;
                                        }
                                        c0287fs7.m596z(c0287fs3, i9);
                                    } else {
                                        c0287fs6.m596z(c0287fs2, 0);
                                    }
                                }
                            } else {
                                c = 3;
                            }
                            c1628ed5 = c1628ed6;
                        }
                        i24++;
                        i15 = i8;
                    } else {
                        return;
                    }
                }
                return;
            }
            C1628ed c1628ed7 = this.f2974h;
            c1628ed7.f5025EC = c2607x4.f8044Fu;
            int i32 = this.f2976o;
            if (i > 0) {
                i32 += c2607x4.f8063fc;
            }
            C0287FS c0287fs8 = c1628ed7.f5064j;
            C0287FS c0287fs9 = c1628ed7.f5022C;
            if (z) {
                c0287fs8.m596z(this.f2969Q, i32);
                if (z2) {
                    c0287fs9.m596z(this.f2968P, this.f2964G);
                }
                if (i > 0) {
                    this.f2969Q.f993P.f5022C.m596z(c0287fs8, 0);
                }
            } else {
                c0287fs9.m596z(this.f2968P, i32);
                if (z2) {
                    c0287fs8.m596z(this.f2969Q, this.f2964G);
                }
                if (i > 0) {
                    this.f2968P.f993P.f5064j.m596z(c0287fs9, 0);
                }
            }
            int i33 = 0;
            C1628ed c1628ed8 = null;
            while (i33 < i15) {
                int i34 = this.f2970R + i33;
                if (i34 < c2607x4.f8046GV) {
                    C1628ed c1628ed9 = c2607x4.f8047JG[i34];
                    if (c1628ed9 == null) {
                        c1628ed9 = c1628ed8;
                    } else {
                        C0287FS c0287fs10 = c1628ed9.f5074p;
                        if (i33 == 0) {
                            c1628ed9.m3114u(c0287fs10, this.f2967N, this.f2973W);
                            int i35 = c2607x4.f8052Rh;
                            float f5 = c2607x4.f8049LN;
                            if (this.f2970R == 0) {
                                i6 = c2607x4.f8055T0;
                                i4 = i35;
                                i5 = -1;
                                if (i6 != -1) {
                                    f5 = c2607x4.f8054S3;
                                    c1628ed9.f5045U8 = i6;
                                    c1628ed9.f5070nF = f5;
                                }
                            } else {
                                i4 = i35;
                                i5 = -1;
                            }
                            if (z2 && (i6 = c2607x4.f8075zd) != i5) {
                                f5 = c2607x4.f8048KM;
                            } else {
                                i6 = i4;
                            }
                            c1628ed9.f5045U8 = i6;
                            c1628ed9.f5070nF = f5;
                        }
                        if (i33 == i15 - 1) {
                            c1628ed9.m3114u(c1628ed9.f5034L, this.f2978u, this.f2966M);
                        }
                        if (c1628ed8 != null) {
                            int i36 = c2607x4.f8042F3;
                            C0287FS c0287fs11 = c1628ed8.f5034L;
                            c0287fs10.m596z(c0287fs11, i36);
                            if (i33 == i17) {
                                int i37 = this.f2973W;
                                if (c0287fs10.m593o()) {
                                    c0287fs10.f997o = i37;
                                }
                            }
                            c0287fs11.m596z(c0287fs10, 0);
                            if (i33 == i18 + 1) {
                                int i38 = this.f2966M;
                                if (c0287fs11.m593o()) {
                                    c0287fs11.f997o = i38;
                                }
                            }
                        }
                        if (c1628ed9 != c1628ed7) {
                            C0287FS c0287fs12 = c1628ed9.f5064j;
                            C0287FS c0287fs13 = c1628ed9.f5022C;
                            if (z) {
                                int i39 = c2607x4.f8065gv;
                                if (i39 != 0) {
                                    if (i39 != 1) {
                                        if (i39 == 2) {
                                            i3 = 0;
                                            c0287fs13.m596z(c0287fs9, 0);
                                        }
                                    } else {
                                        c0287fs13.m596z(c0287fs9, 0);
                                        i33++;
                                        c1628ed8 = c1628ed9;
                                    }
                                } else {
                                    i3 = 0;
                                }
                                c0287fs12.m596z(c0287fs8, i3);
                                i33++;
                                c1628ed8 = c1628ed9;
                            } else {
                                int i40 = c2607x4.f8065gv;
                                if (i40 != 0) {
                                    if (i40 != 1) {
                                        if (i40 == 2) {
                                            if (z3) {
                                                c0287fs13.m596z(this.f2968P, this.f2976o);
                                                c0287fs12.m596z(this.f2969Q, this.f2964G);
                                            } else {
                                                i2 = 0;
                                                c0287fs13.m596z(c0287fs9, 0);
                                            }
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    c0287fs12.m596z(c0287fs8, i2);
                                } else {
                                    c0287fs13.m596z(c0287fs9, 0);
                                }
                                i33++;
                                c1628ed8 = c1628ed9;
                            }
                        }
                    }
                    i33++;
                    c1628ed8 = c1628ed9;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: v */
    public final int m2018v() {
        if (this.f2981z == 1) {
            return this.f2971S - this.f2975k.f8042F3;
        }
        return this.f2971S;
    }

    /* renamed from: z */
    public final void m2019z(C1628ed c1628ed) {
        int i = this.f2981z;
        int i2 = 0;
        C2607x4 c2607x4 = this.f2975k;
        if (i == 0) {
            int m4485O = c2607x4.m4485O(this.f2977q, c1628ed);
            if (c1628ed.f5030Ha[0] == 3) {
                this.f2965I++;
                m4485O = 0;
            }
            int i3 = c2607x4.f8063fc;
            if (c1628ed.f5046UZ != 8) {
                i2 = i3;
            }
            this.f2972V = m4485O + i2 + this.f2972V;
            int m4486d = c2607x4.m4486d(this.f2977q, c1628ed);
            if (this.f2974h == null || this.f2979v < m4486d) {
                this.f2974h = c1628ed;
                this.f2979v = m4486d;
                this.f2971S = m4486d;
            }
        } else {
            int m4485O2 = c2607x4.m4485O(this.f2977q, c1628ed);
            int m4486d2 = c2607x4.m4486d(this.f2977q, c1628ed);
            if (c1628ed.f5030Ha[1] == 3) {
                this.f2965I++;
                m4486d2 = 0;
            }
            int i4 = c2607x4.f8042F3;
            if (c1628ed.f5046UZ != 8) {
                i2 = i4;
            }
            this.f2971S = m4486d2 + i2 + this.f2971S;
            if (this.f2974h == null || this.f2979v < m4485O2) {
                this.f2974h = c1628ed;
                this.f2979v = m4485O2;
                this.f2972V = m4485O2;
            }
        }
        this.f2980w++;
    }
}
