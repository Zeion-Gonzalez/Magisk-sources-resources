package p000a;

/* renamed from: a.gk */
/* loaded from: classes.dex */
public final class C1740gk {

    /* renamed from: N */
    public final boolean f5477N;

    /* renamed from: P */
    public boolean f5478P;

    /* renamed from: Q */
    public C1740gk f5479Q;

    /* renamed from: h */
    public int f5480h;

    /* renamed from: u */
    public C1740gk f5481u;

    /* renamed from: v */
    public int f5482v;

    /* renamed from: z */
    public final byte[] f5483z;

    public C1740gk() {
        this.f5483z = new byte[8192];
        this.f5477N = true;
        this.f5478P = false;
    }

    /* renamed from: P */
    public final void m3269P(C1740gk c1740gk, int i) {
        if (c1740gk.f5477N) {
            int i2 = c1740gk.f5482v;
            int i3 = i2 + i;
            byte[] bArr = c1740gk.f5483z;
            if (i3 > 8192) {
                if (!c1740gk.f5478P) {
                    int i4 = c1740gk.f5480h;
                    if (i3 - i4 <= 8192) {
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        c1740gk.f5482v -= c1740gk.f5480h;
                        c1740gk.f5480h = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i5 = c1740gk.f5482v;
            int i6 = this.f5480h;
            System.arraycopy(this.f5483z, i6, bArr, i5, (i6 + i) - i6);
            c1740gk.f5482v += i;
            this.f5480h += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    /* renamed from: h */
    public final void m3270h(C1740gk c1740gk) {
        c1740gk.f5481u = this;
        c1740gk.f5479Q = this.f5479Q;
        this.f5479Q.f5481u = c1740gk;
        this.f5479Q = c1740gk;
    }

    /* renamed from: v */
    public final C1740gk m3271v() {
        this.f5478P = true;
        return new C1740gk(this.f5483z, this.f5480h, this.f5482v, true);
    }

    /* renamed from: z */
    public final C1740gk m3272z() {
        C1740gk c1740gk = this.f5479Q;
        C1740gk c1740gk2 = c1740gk != this ? c1740gk : null;
        C1740gk c1740gk3 = this.f5481u;
        c1740gk3.f5479Q = c1740gk;
        this.f5479Q.f5481u = c1740gk3;
        this.f5479Q = null;
        this.f5481u = null;
        return c1740gk2;
    }

    public C1740gk(byte[] bArr, int i, int i2, boolean z) {
        this.f5483z = bArr;
        this.f5480h = i;
        this.f5482v = i2;
        this.f5478P = z;
        this.f5477N = false;
    }
}
