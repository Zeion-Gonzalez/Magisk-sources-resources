package p000a;

import android.util.SparseIntArray;
import android.view.View;
import com.topjohnwu.magisk.R;

/* renamed from: a.jr */
/* loaded from: classes.dex */
public final class C1905jr extends AbstractC0362Gv implements InterfaceC1221Wo {

    /* renamed from: l */
    public static final SparseIntArray f5942l;

    /* renamed from: B */
    public final ViewOnClickListenerC0574Kl f5943B;

    /* renamed from: D */
    public final ViewOnClickListenerC0574Kl f5944D;

    /* renamed from: K */
    public final ViewOnClickListenerC0574Kl f5945K;

    /* renamed from: m */
    public long f5946m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5942l = sparseIntArray;
        sparseIntArray.put(R.id.dialog_base_start, 8);
        sparseIntArray.put(R.id.dialog_base_end, 9);
        sparseIntArray.put(R.id.dialog_base_space, 10);
        sparseIntArray.put(R.id.dialog_base_buttons, 11);
        sparseIntArray.put(R.id.spacer, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1905jr(android.view.View r18) {
        /*
            r17 = this;
            r10 = r17
            r11 = r18
            r1 = 0
            android.util.SparseIntArray r0 = p000a.C1905jr.f5942l
            r2 = 13
            r12 = 0
            java.lang.Object[] r13 = androidx.databinding.AbstractC2760z.m4814S(r11, r2, r12, r0)
            r0 = 7
            r0 = r13[r0]
            r3 = r0
            android.widget.Button r3 = (android.widget.Button) r3
            r0 = 5
            r0 = r13[r0]
            r4 = r0
            android.widget.Button r4 = (android.widget.Button) r4
            r0 = 6
            r0 = r13[r0]
            r5 = r0
            android.widget.Button r5 = (android.widget.Button) r5
            r0 = 11
            r0 = r13[r0]
            androidx.appcompat.widget.ButtonBarLayout r0 = (androidx.appcompat.widget.ButtonBarLayout) r0
            r0 = 4
            r0 = r13[r0]
            r6 = r0
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r0 = 9
            r0 = r13[r0]
            androidx.constraintlayout.widget.Guideline r0 = (androidx.constraintlayout.widget.Guideline) r0
            r14 = 1
            r0 = r13[r14]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r15 = 3
            r0 = r13[r15]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 10
            r0 = r13[r0]
            android.widget.Space r0 = (android.widget.Space) r0
            r0 = 8
            r0 = r13[r0]
            androidx.constraintlayout.widget.Guideline r0 = (androidx.constraintlayout.widget.Guideline) r0
            r9 = 2
            r0 = r13[r9]
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = 12
            r0 = r13[r0]
            android.widget.Space r0 = (android.widget.Space) r0
            r0 = r17
            r2 = r18
            r9 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            r10.f5946m = r0
            android.widget.Button r0 = r10.f1223j
            r0.setTag(r12)
            android.widget.Button r0 = r10.f1218L
            r0.setTag(r12)
            android.widget.Button r0 = r10.f1222i
            r0.setTag(r12)
            android.widget.FrameLayout r0 = r10.f1221d
            r0.setTag(r12)
            android.widget.ImageView r0 = r10.f1219O
            r0.setTag(r12)
            android.widget.TextView r0 = r10.f1224n
            r0.setTag(r12)
            android.widget.TextView r0 = r10.f1225x
            r0.setTag(r12)
            r0 = 0
            r0 = r13[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r12)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r11.setTag(r0, r10)
            a.Kl r0 = new a.Kl
            r0.<init>(r15, r14, r10)
            r10.f5943B = r0
            a.Kl r0 = new a.Kl
            r0.<init>(r14, r14, r10)
            r10.f5945K = r0
            a.Kl r0 = new a.Kl
            r1 = 2
            r0.<init>(r1, r14, r10)
            r10.f5944D = r0
            r17.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1905jr.<init>(android.view.View):void");
    }

    /* renamed from: E */
    public final boolean m3539E(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f5946m |= 8;
            }
            return true;
        }
        if (i == 12) {
            synchronized (this) {
                this.f5946m |= 32768;
            }
            return true;
        }
        if (i == 9) {
            synchronized (this) {
                this.f5946m |= 65536;
            }
            return true;
        }
        if (i == 24) {
            synchronized (this) {
                this.f5946m |= 131072;
            }
            return true;
        }
        if (i != 15) {
            return false;
        }
        synchronized (this) {
            this.f5946m |= 262144;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f5946m != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f5946m = 524288L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        boolean z;
        String str;
        int i;
        boolean z2;
        boolean z3;
        String str2;
        boolean z4;
        String str3;
        int i2;
        boolean z5;
        int i3;
        boolean z6;
        boolean z7;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        CharSequence charSequence3;
        int i4;
        boolean z13;
        CharSequence charSequence4;
        boolean z14;
        boolean z15;
        boolean z16;
        int i5;
        boolean z17;
        boolean z18;
        C0738Nr c0738Nr;
        boolean z19;
        int i6;
        boolean z20;
        boolean z21;
        C0738Nr c0738Nr2;
        long j2;
        int i7;
        C0738Nr c0738Nr3;
        int i8;
        synchronized (this) {
            j = this.f5946m;
            this.f5946m = 0L;
        }
        C0978SM c0978sm = this.f1220T;
        if ((1048575 & j) != 0) {
            if ((j & 532484) != 0) {
                if (c0978sm != null) {
                    charSequence3 = c0978sm.f3302R;
                } else {
                    charSequence3 = null;
                }
                if (charSequence3 != null) {
                    i8 = charSequence3.length();
                } else {
                    i8 = 0;
                }
                if (i8 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
                charSequence3 = null;
            }
            if ((j & 524533) != 0) {
                if (c0978sm != null) {
                    c0738Nr3 = c0978sm.f3301I;
                } else {
                    c0738Nr3 = null;
                }
                m4818g(0, c0738Nr3);
                if ((j & 524357) != 0 && c0738Nr3 != null) {
                    str3 = c0738Nr3.f2517w;
                } else {
                    str3 = null;
                }
                if ((j & 524309) != 0 && c0738Nr3 != null) {
                    z13 = c0738Nr3.m1708N();
                } else {
                    z13 = false;
                }
                if ((j & 524421) != 0 && c0738Nr3 != null) {
                    i4 = c0738Nr3.f2512R;
                } else {
                    i4 = 0;
                }
                if ((j & 524325) != 0 && c0738Nr3 != null) {
                    z4 = c0738Nr3.f2511I;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
                str3 = null;
                i4 = 0;
                z13 = false;
            }
            if ((j & 540676) != 0) {
                if (c0978sm != null) {
                    charSequence4 = c0978sm.f3306w;
                } else {
                    charSequence4 = null;
                }
                if (charSequence4 != null) {
                    i7 = charSequence4.length();
                } else {
                    i7 = 0;
                }
                if (i7 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i7 != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                charSequence4 = null;
                z14 = false;
                z15 = false;
            }
            if ((j & 528134) != 0) {
                if (c0978sm != null) {
                    c0738Nr2 = c0978sm.f3304k;
                } else {
                    c0738Nr2 = null;
                }
                m4818g(1, c0738Nr2);
                if ((j & 525318) != 0 && c0738Nr2 != null) {
                    str2 = c0738Nr2.f2517w;
                } else {
                    str2 = null;
                }
                if ((j & 526342) != 0 && c0738Nr2 != null) {
                    i5 = c0738Nr2.f2512R;
                } else {
                    i5 = 0;
                }
                if ((j & 524550) != 0 && c0738Nr2 != null) {
                    z17 = c0738Nr2.m1708N();
                    j2 = 524806;
                } else {
                    j2 = 524806;
                    z17 = false;
                }
                if ((j & j2) != 0 && c0738Nr2 != null) {
                    z16 = c0738Nr2.f2511I;
                } else {
                    z16 = false;
                }
            } else {
                z16 = false;
                str2 = null;
                i5 = 0;
                z17 = false;
            }
            if ((j & 528388) != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            if ((j & 1015820) != 0) {
                if (c0978sm != null) {
                    c0738Nr = c0978sm.f3305q;
                } else {
                    c0738Nr = null;
                }
                m4818g(3, c0738Nr);
                if ((j & 557068) != 0 && c0738Nr != null) {
                    z19 = c0738Nr.m1708N();
                } else {
                    z19 = false;
                }
                if ((j & 786444) != 0 && c0738Nr != null) {
                    i6 = c0738Nr.f2512R;
                } else {
                    i6 = 0;
                }
                if ((j & 655372) != 0 && c0738Nr != null) {
                    z20 = z19;
                    str = c0738Nr.f2517w;
                } else {
                    z20 = z19;
                    str = null;
                }
                if ((j & 589836) != 0 && c0738Nr != null) {
                    z21 = c0738Nr.f2511I;
                } else {
                    z21 = false;
                }
                charSequence2 = charSequence4;
                i2 = i5;
                z10 = z12;
                z8 = z15;
                z9 = z18;
                z6 = z17;
                i3 = i6;
                i = i4;
                z7 = z14;
                z5 = z21;
                z = z13;
                charSequence = charSequence3;
                z2 = z16;
                z3 = z20;
            } else {
                charSequence2 = charSequence4;
                i2 = i5;
                z10 = z12;
                i = i4;
                z = z13;
                z8 = z15;
                z9 = z18;
                z6 = z17;
                str = null;
                i3 = 0;
                charSequence = charSequence3;
                z2 = z16;
                z7 = z14;
                z3 = false;
                z5 = false;
            }
        } else {
            z = false;
            str = null;
            i = 0;
            z2 = false;
            z3 = false;
            str2 = null;
            z4 = false;
            str3 = null;
            i2 = 0;
            z5 = false;
            i3 = 0;
            z6 = false;
            z7 = false;
            charSequence = null;
            charSequence2 = null;
            z8 = false;
            z9 = false;
            z10 = false;
        }
        if ((j & 524309) != 0) {
            z11 = z7;
            AbstractC0795Op.m1819Lq(this.f1223j, z);
        } else {
            z11 = z7;
        }
        if ((j & 524325) != 0) {
            this.f1223j.setEnabled(z4);
            this.f1223j.setFocusable(z4);
            AbstractC2575wW.m4407Pm(this.f1223j, this.f5943B, z4);
        }
        if ((j & 524357) != 0) {
            AbstractC1843ih.m3398BO(this.f1223j, str3);
        }
        if ((j & 524421) != 0) {
            AbstractC0795Op.m1863oI(this.f1223j, i);
        }
        if ((j & 557068) != 0) {
            AbstractC0795Op.m1819Lq(this.f1218L, z3);
        }
        if ((j & 589836) != 0) {
            this.f1218L.setEnabled(z5);
            this.f1218L.setFocusable(z5);
            AbstractC2575wW.m4407Pm(this.f1218L, this.f5945K, z5);
        }
        if ((655372 & j) != 0) {
            AbstractC1843ih.m3398BO(this.f1218L, str);
        }
        if ((786444 & j) != 0) {
            AbstractC0795Op.m1863oI(this.f1218L, i3);
        }
        if ((524550 & j) != 0) {
            AbstractC0795Op.m1819Lq(this.f1222i, z6);
        }
        if ((524806 & j) != 0) {
            this.f1222i.setEnabled(z2);
            this.f1222i.setFocusable(z2);
            AbstractC2575wW.m4407Pm(this.f1222i, this.f5944D, z2);
        }
        if ((j & 525318) != 0) {
            AbstractC1843ih.m3398BO(this.f1222i, str2);
        }
        if ((526342 & j) != 0) {
            AbstractC0795Op.m1863oI(this.f1222i, i2);
        }
        if ((j & 540676) != 0) {
            AbstractC0795Op.m1819Lq(this.f1221d, z11);
            AbstractC0795Op.m1819Lq(this.f1224n, z8);
            AbstractC1843ih.m3398BO(this.f1224n, charSequence2);
        }
        if ((j & 528388) != 0) {
            AbstractC0795Op.m1819Lq(this.f1219O, z9);
            this.f1219O.setImageDrawable(null);
        }
        if ((j & 532484) != 0) {
            AbstractC0795Op.m1819Lq(this.f1225x, z10);
            AbstractC1843ih.m3398BO(this.f1225x, charSequence);
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    C0738Nr c0738Nr = (C0738Nr) obj;
                    return m3539E(i2);
                }
                C0978SM c0978sm = (C0978SM) obj;
                return m3541s(i2);
            }
            C0738Nr c0738Nr2 = (C0738Nr) obj;
            return m3540U(i2);
        }
        C0738Nr c0738Nr3 = (C0738Nr) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.f5946m |= 1;
            }
        } else if (i2 == 12) {
            synchronized (this) {
                this.f5946m |= 16;
            }
        } else if (i2 == 9) {
            synchronized (this) {
                this.f5946m |= 32;
            }
        } else if (i2 == 24) {
            synchronized (this) {
                this.f5946m |= 64;
            }
        } else {
            if (i2 != 15) {
                return false;
            }
            synchronized (this) {
                this.f5946m |= 128;
            }
        }
        return true;
    }

    /* renamed from: U */
    public final boolean m3540U(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f5946m |= 2;
            }
            return true;
        }
        if (i == 12) {
            synchronized (this) {
                this.f5946m |= 256;
            }
            return true;
        }
        if (i == 9) {
            synchronized (this) {
                this.f5946m |= 512;
            }
            return true;
        }
        if (i == 24) {
            synchronized (this) {
                this.f5946m |= 1024;
            }
            return true;
        }
        if (i != 15) {
            return false;
        }
        synchronized (this) {
            this.f5946m |= 2048;
        }
        return true;
    }

    @Override // p000a.InterfaceC1221Wo
    /* renamed from: h */
    public final void mo18h(View view, int i) {
        boolean z;
        C0738Nr c0738Nr;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C0978SM c0978sm = this.f1220T;
                    if (c0978sm != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        c0738Nr = c0978sm.f3301I;
                        if (c0738Nr != null) {
                            z4 = true;
                        }
                        if (!z4) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                C0978SM c0978sm2 = this.f1220T;
                if (c0978sm2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    c0738Nr = c0978sm2.f3304k;
                    if (c0738Nr != null) {
                        z4 = true;
                    }
                    if (!z4) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            C0978SM c0978sm3 = this.f1220T;
            if (c0978sm3 != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c0738Nr = c0978sm3.f3305q;
                if (c0738Nr != null) {
                    z4 = true;
                }
                if (!z4) {
                    return;
                }
            } else {
                return;
            }
        }
        c0738Nr.m1711h();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (6 == i) {
            C0978SM c0978sm = (C0978SM) obj;
            m4818g(2, c0978sm);
            this.f1220T = c0978sm;
            synchronized (this) {
                this.f5946m |= 4;
            }
            m2861Q(6);
            m4816I();
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final boolean m3541s(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f5946m |= 4;
            }
            return true;
        }
        if (i == 15) {
            synchronized (this) {
                this.f5946m |= 4096;
            }
            return true;
        }
        if (i == 40) {
            synchronized (this) {
                this.f5946m |= 8192;
            }
            return true;
        }
        if (i != 24) {
            return false;
        }
        synchronized (this) {
            this.f5946m |= 16384;
        }
        return true;
    }
}
