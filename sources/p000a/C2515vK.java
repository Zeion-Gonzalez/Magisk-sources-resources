package p000a;

import java.util.List;

/* renamed from: a.vK */
/* loaded from: classes.dex */
public final class C2515vK {

    /* renamed from: N */
    public final C1364ZX f7697N;

    /* renamed from: P */
    public final C0998Si f7698P;

    /* renamed from: Q */
    public final int f7699Q;

    /* renamed from: W */
    public int f7700W;

    /* renamed from: h */
    public final List f7701h;

    /* renamed from: o */
    public final int f7702o;

    /* renamed from: u */
    public final int f7703u;

    /* renamed from: v */
    public final int f7704v;

    /* renamed from: z */
    public final C0523Jr f7705z;

    public C2515vK(C0523Jr c0523Jr, List list, int i, C0998Si c0998Si, C1364ZX c1364zx, int i2, int i3, int i4) {
        this.f7705z = c0523Jr;
        this.f7701h = list;
        this.f7704v = i;
        this.f7698P = c0998Si;
        this.f7697N = c1364zx;
        this.f7699Q = i2;
        this.f7703u = i3;
        this.f7702o = i4;
    }

    /* renamed from: z */
    public static C2515vK m4355z(C2515vK c2515vK, int i, C0998Si c0998Si, C1364ZX c1364zx, int i2) {
        int i3;
        int i4;
        int i5;
        if ((i2 & 1) != 0) {
            i = c2515vK.f7704v;
        }
        int i6 = i;
        if ((i2 & 2) != 0) {
            c0998Si = c2515vK.f7698P;
        }
        C0998Si c0998Si2 = c0998Si;
        if ((i2 & 4) != 0) {
            c1364zx = c2515vK.f7697N;
        }
        C1364ZX c1364zx2 = c1364zx;
        if ((i2 & 8) != 0) {
            i3 = c2515vK.f7699Q;
        } else {
            i3 = 0;
        }
        if ((i2 & 16) != 0) {
            i4 = c2515vK.f7703u;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            i5 = c2515vK.f7702o;
        } else {
            i5 = 0;
        }
        return new C2515vK(c2515vK.f7705z, c2515vK.f7701h, i6, c0998Si2, c1364zx2, i3, i4, i5);
    }

    /* renamed from: h */
    public final C1429ap m4356h(C1364ZX c1364zx) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List list = this.f7701h;
        int size = list.size();
        boolean z5 = false;
        int i = this.f7704v;
        if (i < size) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f7700W++;
            C0998Si c0998Si = this.f7698P;
            if (c0998Si != null) {
                C2658y7 c2658y7 = (C2658y7) c1364zx.f4279h;
                C2658y7 c2658y72 = c0998Si.f3352v.f3848h.f7113W;
                if (c2658y7.f8278N == c2658y72.f8278N && AbstractC1292YB.m2695u(c2658y7.f8279P, c2658y72.f8279P)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (this.f7700W == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        throw new IllegalStateException(("network interceptor " + list.get(i - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + list.get(i - 1) + " must retain the same host and port").toString());
                }
            }
            int i2 = i + 1;
            C2515vK m4355z = m4355z(this, i2, null, c1364zx, 58);
            InterfaceC1975l8 interfaceC1975l8 = (InterfaceC1975l8) list.get(i);
            C1429ap mo264z = interfaceC1975l8.mo264z(m4355z);
            if (mo264z != null) {
                if (c0998Si != null) {
                    if (i2 < list.size() && m4355z.f7700W != 1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new IllegalStateException(("network interceptor " + interfaceC1975l8 + " must call proceed() exactly once").toString());
                    }
                }
                if (mo264z.f4471g != null) {
                    z5 = true;
                }
                if (z5) {
                    return mo264z;
                }
                throw new IllegalStateException(("interceptor " + interfaceC1975l8 + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + interfaceC1975l8 + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
