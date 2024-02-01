package p000a;

/* renamed from: a.kS */
/* loaded from: classes.dex */
public final class C1937kS implements InterfaceC2578wb {

    /* renamed from: I */
    public final /* synthetic */ C0573Kk f6012I;

    /* renamed from: R */
    public final C2361sQ f6013R = new C2361sQ();

    /* renamed from: S */
    public final boolean f6014S;

    /* renamed from: w */
    public boolean f6015w;

    public C1937kS(C0573Kk c0573Kk, boolean z) {
        this.f6012I = c0573Kk;
        this.f6014S = z;
    }

    @Override // p000a.InterfaceC2578wb
    /* renamed from: P */
    public final C1819iG mo607P() {
        return this.f6012I.f1862V;
    }

    @Override // p000a.InterfaceC2578wb
    /* renamed from: Q */
    public final void mo608Q(C2361sQ c2361sQ, long j) {
        byte[] bArr = AbstractC1181W6.f3860z;
        C2361sQ c2361sQ2 = this.f6013R;
        c2361sQ2.mo608Q(c2361sQ, j);
        while (c2361sQ2.f7260R >= 16384) {
            m3556z(false);
        }
    }

    @Override // p000a.InterfaceC2578wb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        C0573Kk c0573Kk = this.f6012I;
        byte[] bArr = AbstractC1181W6.f3860z;
        synchronized (c0573Kk) {
            if (this.f6015w) {
                return;
            }
            boolean z2 = false;
            if (c0573Kk.m1299Q() == null) {
                z = true;
            } else {
                z = false;
            }
            C0573Kk c0573Kk2 = this.f6012I;
            if (!c0573Kk2.f1855G.f6014S) {
                if (this.f6013R.f7260R > 0) {
                    z2 = true;
                }
                if (z2) {
                    while (this.f6013R.f7260R > 0) {
                        m3556z(true);
                    }
                } else if (z) {
                    c0573Kk2.f1864h.m1562U8(c0573Kk2.f1868z, true, null, 0L);
                }
            }
            synchronized (this.f6012I) {
                this.f6015w = true;
            }
            this.f6012I.f1864h.f2191L.flush();
            this.f6012I.m1306z();
        }
    }

    @Override // p000a.InterfaceC2578wb, java.io.Flushable
    public final void flush() {
        C0573Kk c0573Kk = this.f6012I;
        byte[] bArr = AbstractC1181W6.f3860z;
        synchronized (c0573Kk) {
            c0573Kk.m1302h();
        }
        while (this.f6013R.f7260R > 0) {
            m3556z(false);
            this.f6012I.f1864h.f2191L.flush();
        }
    }

    /* renamed from: z */
    public final void m3556z(boolean z) {
        long min;
        boolean z2;
        boolean z3;
        C0573Kk c0573Kk = this.f6012I;
        synchronized (c0573Kk) {
            c0573Kk.f1862V.m3687o();
            while (c0573Kk.f1857N >= c0573Kk.f1859Q && !this.f6014S && !this.f6015w && c0573Kk.m1299Q() == null) {
                try {
                    c0573Kk.m1300V();
                } finally {
                    c0573Kk.f1862V.m3654V();
                }
            }
            c0573Kk.f1862V.m3654V();
            c0573Kk.m1302h();
            min = Math.min(c0573Kk.f1859Q - c0573Kk.f1857N, this.f6013R.f7260R);
            c0573Kk.f1857N += min;
            if (z && min == this.f6013R.f7260R) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2;
        }
        this.f6012I.f1862V.m3687o();
        try {
            C0573Kk c0573Kk2 = this.f6012I;
            c0573Kk2.f1864h.m1562U8(c0573Kk2.f1868z, z3, this.f6013R, min);
        } finally {
            c0573Kk = this.f6012I;
        }
    }
}
