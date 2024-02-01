package p000a;

import java.util.Arrays;

/* renamed from: a.NR */
/* loaded from: classes.dex */
public final class C0713NR implements InterfaceC0921RL {

    /* renamed from: h */
    public final C1335Z1 f2400h;

    /* renamed from: v */
    public final C0525Ju f2403v;

    /* renamed from: z */
    public int f2404z = 0;

    /* renamed from: P */
    public int f2397P = 8;

    /* renamed from: N */
    public int[] f2396N = new int[8];

    /* renamed from: Q */
    public int[] f2398Q = new int[8];

    /* renamed from: u */
    public float[] f2402u = new float[8];

    /* renamed from: o */
    public int f2401o = -1;

    /* renamed from: W */
    public int f2399W = -1;

    /* renamed from: G */
    public boolean f2395G = false;

    public C0713NR(C1335Z1 c1335z1, C0525Ju c0525Ju) {
        this.f2400h = c1335z1;
        this.f2403v = c0525Ju;
    }

    @Override // p000a.InterfaceC0921RL
    /* renamed from: G */
    public final void mo1661G() {
        int i = this.f2401o;
        for (int i2 = 0; i != -1 && i2 < this.f2404z; i2++) {
            float[] fArr = this.f2402u;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f2398Q[i];
        }
    }

    @Override // p000a.InterfaceC0921RL
    /* renamed from: M */
    public final int mo1662M() {
        return this.f2404z;
    }

    @Override // p000a.InterfaceC0921RL
    /* renamed from: N */
    public final void mo1663N(C2598ww c2598ww, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f2401o;
            C1335Z1 c1335z1 = this.f2400h;
            if (i == -1) {
                this.f2401o = 0;
                this.f2402u[0] = f;
                this.f2396N[0] = c2598ww.f7992R;
                this.f2398Q[0] = -1;
                c2598ww.f7990E++;
                c2598ww.m4480z(c1335z1);
                this.f2404z++;
                if (this.f2395G) {
                    return;
                }
                int i2 = this.f2399W + 1;
                this.f2399W = i2;
                int[] iArr = this.f2396N;
                if (i2 >= iArr.length) {
                    this.f2395G = true;
                    this.f2399W = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f2404z; i4++) {
                int i5 = this.f2396N[i];
                int i6 = c2598ww.f7992R;
                if (i5 == i6) {
                    float[] fArr = this.f2402u;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f2401o) {
                            this.f2401o = this.f2398Q[i];
                        } else {
                            int[] iArr2 = this.f2398Q;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c2598ww.m4478h(c1335z1);
                        }
                        if (this.f2395G) {
                            this.f2399W = i;
                        }
                        c2598ww.f7990E--;
                        this.f2404z--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f2398Q[i];
            }
            int i7 = this.f2399W;
            int i8 = i7 + 1;
            if (this.f2395G) {
                int[] iArr3 = this.f2396N;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f2396N;
            if (i7 >= iArr4.length && this.f2404z < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f2396N;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.f2396N;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.f2397P * 2;
                this.f2397P = i10;
                this.f2395G = false;
                this.f2399W = i7 - 1;
                this.f2402u = Arrays.copyOf(this.f2402u, i10);
                this.f2396N = Arrays.copyOf(this.f2396N, this.f2397P);
                this.f2398Q = Arrays.copyOf(this.f2398Q, this.f2397P);
            }
            this.f2396N[i7] = c2598ww.f7992R;
            this.f2402u[i7] = f;
            int[] iArr7 = this.f2398Q;
            if (i3 != -1) {
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                iArr7[i7] = this.f2401o;
                this.f2401o = i7;
            }
            c2598ww.f7990E++;
            c2598ww.m4480z(c1335z1);
            this.f2404z++;
            if (!this.f2395G) {
                this.f2399W++;
            }
            int i11 = this.f2399W;
            int[] iArr8 = this.f2396N;
            if (i11 >= iArr8.length) {
                this.f2395G = true;
                this.f2399W = iArr8.length - 1;
            }
        }
    }

    @Override // p000a.InterfaceC0921RL
    /* renamed from: P */
    public final boolean mo1664P(C2598ww c2598ww) {
        int i = this.f2401o;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f2404z; i2++) {
            if (this.f2396N[i] == c2598ww.f7992R) {
                return true;
            }
            i = this.f2398Q[i];
        }
        return false;
    }

    @Override // p000a.InterfaceC0921RL
    /* renamed from: Q */
    public final C2598ww mo1665Q(int i) {
        int i2 = this.f2401o;
        for (int i3 = 0; i2 != -1 && i3 < this.f2404z; i3++) {
            if (i3 == i) {
                return ((C2598ww[]) this.f2403v.f1763N)[this.f2396N[i2]];
            }
            i2 = this.f2398Q[i2];
        }
        return null;
    }

    @Override // p000a.InterfaceC0921RL
    /* renamed from: W */
    public final float mo1666W(C2598ww c2598ww) {
        int i = this.f2401o;
        for (int i2 = 0; i != -1 && i2 < this.f2404z; i2++) {
            if (this.f2396N[i] == c2598ww.f7992R) {
                return this.f2402u[i];
            }
            i = this.f2398Q[i];
        }
        return 0.0f;
    }

    @Override // p000a.InterfaceC0921RL
    public final void clear() {
        int i = this.f2401o;
        for (int i2 = 0; i != -1 && i2 < this.f2404z; i2++) {
            C2598ww c2598ww = ((C2598ww[]) this.f2403v.f1763N)[this.f2396N[i]];
            if (c2598ww != null) {
                c2598ww.m4478h(this.f2400h);
            }
            i = this.f2398Q[i];
        }
        this.f2401o = -1;
        this.f2399W = -1;
        this.f2395G = false;
        this.f2404z = 0;
    }

    @Override // p000a.InterfaceC0921RL
    /* renamed from: h */
    public final float mo1667h(C1335Z1 c1335z1, boolean z) {
        float mo1666W = mo1666W(c1335z1.f4229z);
        mo1668o(c1335z1.f4229z, z);
        InterfaceC0921RL interfaceC0921RL = c1335z1.f4226P;
        int mo1662M = interfaceC0921RL.mo1662M();
        for (int i = 0; i < mo1662M; i++) {
            C2598ww mo1665Q = interfaceC0921RL.mo1665Q(i);
            mo1663N(mo1665Q, interfaceC0921RL.mo1666W(mo1665Q) * mo1666W, z);
        }
        return mo1666W;
    }

    @Override // p000a.InterfaceC0921RL
    /* renamed from: o */
    public final float mo1668o(C2598ww c2598ww, boolean z) {
        int i = this.f2401o;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f2404z) {
            if (this.f2396N[i] == c2598ww.f7992R) {
                if (i == this.f2401o) {
                    this.f2401o = this.f2398Q[i];
                } else {
                    int[] iArr = this.f2398Q;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c2598ww.m4478h(this.f2400h);
                }
                c2598ww.f7990E--;
                this.f2404z--;
                this.f2396N[i] = -1;
                if (this.f2395G) {
                    this.f2399W = i;
                }
                return this.f2402u[i];
            }
            i2++;
            i3 = i;
            i = this.f2398Q[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f2401o;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f2404z; i2++) {
            str = (AbstractC2441tz.m4195W(str, " -> ") + this.f2402u[i] + " : ") + ((C2598ww[]) this.f2403v.f1763N)[this.f2396N[i]];
            i = this.f2398Q[i];
        }
        return str;
    }

    @Override // p000a.InterfaceC0921RL
    /* renamed from: u */
    public final void mo1669u(float f) {
        int i = this.f2401o;
        for (int i2 = 0; i != -1 && i2 < this.f2404z; i2++) {
            float[] fArr = this.f2402u;
            fArr[i] = fArr[i] / f;
            i = this.f2398Q[i];
        }
    }

    @Override // p000a.InterfaceC0921RL
    /* renamed from: v */
    public final void mo1670v(C2598ww c2598ww, float f) {
        if (f == 0.0f) {
            mo1668o(c2598ww, true);
            return;
        }
        int i = this.f2401o;
        C1335Z1 c1335z1 = this.f2400h;
        if (i == -1) {
            this.f2401o = 0;
            this.f2402u[0] = f;
            this.f2396N[0] = c2598ww.f7992R;
            this.f2398Q[0] = -1;
            c2598ww.f7990E++;
            c2598ww.m4480z(c1335z1);
            this.f2404z++;
            if (this.f2395G) {
                return;
            }
            int i2 = this.f2399W + 1;
            this.f2399W = i2;
            int[] iArr = this.f2396N;
            if (i2 >= iArr.length) {
                this.f2395G = true;
                this.f2399W = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f2404z; i4++) {
            int i5 = this.f2396N[i];
            int i6 = c2598ww.f7992R;
            if (i5 == i6) {
                this.f2402u[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f2398Q[i];
        }
        int i7 = this.f2399W;
        int i8 = i7 + 1;
        if (this.f2395G) {
            int[] iArr2 = this.f2396N;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f2396N;
        if (i7 >= iArr3.length && this.f2404z < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f2396N;
                if (i9 >= iArr4.length) {
                    break;
                }
                if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr5 = this.f2396N;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.f2397P * 2;
            this.f2397P = i10;
            this.f2395G = false;
            this.f2399W = i7 - 1;
            this.f2402u = Arrays.copyOf(this.f2402u, i10);
            this.f2396N = Arrays.copyOf(this.f2396N, this.f2397P);
            this.f2398Q = Arrays.copyOf(this.f2398Q, this.f2397P);
        }
        this.f2396N[i7] = c2598ww.f7992R;
        this.f2402u[i7] = f;
        int[] iArr6 = this.f2398Q;
        if (i3 != -1) {
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            iArr6[i7] = this.f2401o;
            this.f2401o = i7;
        }
        c2598ww.f7990E++;
        c2598ww.m4480z(c1335z1);
        int i11 = this.f2404z + 1;
        this.f2404z = i11;
        if (!this.f2395G) {
            this.f2399W++;
        }
        int[] iArr7 = this.f2396N;
        if (i11 >= iArr7.length) {
            this.f2395G = true;
        }
        if (this.f2399W >= iArr7.length) {
            this.f2395G = true;
            this.f2399W = iArr7.length - 1;
        }
    }

    @Override // p000a.InterfaceC0921RL
    /* renamed from: z */
    public final float mo1671z(int i) {
        int i2 = this.f2401o;
        for (int i3 = 0; i2 != -1 && i3 < this.f2404z; i3++) {
            if (i3 == i) {
                return this.f2402u[i2];
            }
            i2 = this.f2398Q[i2];
        }
        return 0.0f;
    }
}
