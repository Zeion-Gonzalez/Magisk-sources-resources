package p000a;

/* renamed from: a.sH */
/* loaded from: classes.dex */
public final class C2353sH {

    /* renamed from: h */
    public C2353sH f7244h;

    /* renamed from: z */
    public long f7245z = 0;

    /* renamed from: N */
    public final void m4056N(int i, boolean z) {
        if (i >= 64) {
            m4062v();
            this.f7244h.m4056N(i - 64, z);
            return;
        }
        long j = this.f7245z;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f7245z = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m4060o(i);
        } else {
            m4063z(i);
        }
        if (z2 || this.f7244h != null) {
            m4062v();
            this.f7244h.m4056N(0, z2);
        }
    }

    /* renamed from: P */
    public final boolean m4057P(int i) {
        if (i < 64) {
            return (this.f7245z & (1 << i)) != 0;
        }
        m4062v();
        return this.f7244h.m4057P(i - 64);
    }

    /* renamed from: Q */
    public final boolean m4058Q(int i) {
        if (i >= 64) {
            m4062v();
            return this.f7244h.m4058Q(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f7245z;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f7245z = j3;
        long j4 = j - 1;
        this.f7245z = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C2353sH c2353sH = this.f7244h;
        if (c2353sH != null) {
            if (c2353sH.m4057P(0)) {
                m4060o(63);
            }
            this.f7244h.m4058Q(0);
        }
        return z;
    }

    /* renamed from: h */
    public final int m4059h(int i) {
        long j;
        C2353sH c2353sH = this.f7244h;
        if (c2353sH == null) {
            if (i >= 64) {
                j = this.f7245z;
                return Long.bitCount(j);
            }
        } else if (i >= 64) {
            return Long.bitCount(this.f7245z) + c2353sH.m4059h(i - 64);
        }
        j = this.f7245z & ((1 << i) - 1);
        return Long.bitCount(j);
    }

    /* renamed from: o */
    public final void m4060o(int i) {
        if (i < 64) {
            this.f7245z |= 1 << i;
        } else {
            m4062v();
            this.f7244h.m4060o(i - 64);
        }
    }

    public final String toString() {
        if (this.f7244h == null) {
            return Long.toBinaryString(this.f7245z);
        }
        return this.f7244h.toString() + "xx" + Long.toBinaryString(this.f7245z);
    }

    /* renamed from: u */
    public final void m4061u() {
        this.f7245z = 0L;
        C2353sH c2353sH = this.f7244h;
        if (c2353sH != null) {
            c2353sH.m4061u();
        }
    }

    /* renamed from: v */
    public final void m4062v() {
        if (this.f7244h == null) {
            this.f7244h = new C2353sH();
        }
    }

    /* renamed from: z */
    public final void m4063z(int i) {
        if (i < 64) {
            this.f7245z &= ~(1 << i);
            return;
        }
        C2353sH c2353sH = this.f7244h;
        if (c2353sH != null) {
            c2353sH.m4063z(i - 64);
        }
    }
}
