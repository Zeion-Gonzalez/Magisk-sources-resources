package p000a;

import android.view.View;

/* renamed from: a.fU */
/* loaded from: classes.dex */
public final class C1675fU {

    /* renamed from: N */
    public boolean f5239N;

    /* renamed from: P */
    public boolean f5240P;

    /* renamed from: h */
    public int f5241h;

    /* renamed from: v */
    public int f5242v;

    /* renamed from: z */
    public C2064mt f5243z;

    public C1675fU() {
        m3172v();
    }

    /* renamed from: h */
    public final void m3171h(View view, int i) {
        int mo569W;
        int min;
        C2064mt c2064mt = this.f5243z;
        if (Integer.MIN_VALUE == c2064mt.f934h) {
            mo569W = 0;
        } else {
            mo569W = c2064mt.mo569W() - c2064mt.f934h;
        }
        if (mo569W >= 0) {
            m3173z(view, i);
            return;
        }
        this.f5241h = i;
        if (this.f5240P) {
            int mo567Q = (this.f5243z.mo567Q() - mo569W) - this.f5243z.mo570h(view);
            this.f5242v = this.f5243z.mo567Q() - mo567Q;
            if (mo567Q > 0) {
                int mo573v = this.f5242v - this.f5243z.mo573v(view);
                int mo571o = this.f5243z.mo571o();
                int min2 = mo573v - (Math.min(this.f5243z.mo566P(view) - mo571o, 0) + mo571o);
                if (min2 < 0) {
                    min = Math.min(mo567Q, -min2) + this.f5242v;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            int mo566P = this.f5243z.mo566P(view);
            int mo571o2 = mo566P - this.f5243z.mo571o();
            this.f5242v = mo566P;
            if (mo571o2 > 0) {
                int mo567Q2 = (this.f5243z.mo567Q() - Math.min(0, (this.f5243z.mo567Q() - mo569W) - this.f5243z.mo570h(view))) - (this.f5243z.mo573v(view) + mo566P);
                if (mo567Q2 < 0) {
                    min = this.f5242v - Math.min(mo571o2, -mo567Q2);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f5242v = min;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f5241h + ", mCoordinate=" + this.f5242v + ", mLayoutFromEnd=" + this.f5240P + ", mValid=" + this.f5239N + '}';
    }

    /* renamed from: v */
    public final void m3172v() {
        this.f5241h = -1;
        this.f5242v = Integer.MIN_VALUE;
        this.f5240P = false;
        this.f5239N = false;
    }

    /* renamed from: z */
    public final void m3173z(View view, int i) {
        int mo569W;
        if (this.f5240P) {
            int mo570h = this.f5243z.mo570h(view);
            C2064mt c2064mt = this.f5243z;
            if (Integer.MIN_VALUE == c2064mt.f934h) {
                mo569W = 0;
            } else {
                mo569W = c2064mt.mo569W() - c2064mt.f934h;
            }
            this.f5242v = mo569W + mo570h;
        } else {
            this.f5242v = this.f5243z.mo566P(view);
        }
        this.f5241h = i;
    }
}
