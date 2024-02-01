package p000a;

/* renamed from: a.Ba */
/* loaded from: classes.dex */
public final class C0082Ba implements InterfaceC0984SS {

    /* renamed from: R */
    public boolean f321R;

    /* renamed from: S */
    public final long f322S;

    /* renamed from: k */
    public final /* synthetic */ C0573Kk f323k;

    /* renamed from: q */
    public boolean f324q;

    /* renamed from: w */
    public final C2361sQ f325w = new C2361sQ();

    /* renamed from: I */
    public final C2361sQ f320I = new C2361sQ();

    public C0082Ba(C0573Kk c0573Kk, long j, boolean z) {
        this.f323k = c0573Kk;
        this.f322S = j;
        this.f321R = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x009a, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    @Override // p000a.InterfaceC0984SS
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo188M(p000a.C2361sQ r17, long r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r18
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto La5
        Lf:
            a.Kk r6 = r1.f323k
            monitor-enter(r6)
            a.lt r0 = r6.f1856M     // Catch: java.lang.Throwable -> La2
            r0.m3687o()     // Catch: java.lang.Throwable -> La2
            a.O6 r0 = r6.m1299Q()     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L2f
            boolean r0 = r1.f321R     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L2f
            java.io.IOException r0 = r6.f1860R     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L30
            a.Z5 r0 = new a.Z5     // Catch: java.lang.Throwable -> L9b
            a.O6 r7 = r6.m1299Q()     // Catch: java.lang.Throwable -> L9b
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L9b
            goto L30
        L2f:
            r0 = 0
        L30:
            boolean r7 = r1.f324q     // Catch: java.lang.Throwable -> L9b
            if (r7 != 0) goto L93
            a.sQ r7 = r1.f320I     // Catch: java.lang.Throwable -> L9b
            long r8 = r7.f7260R     // Catch: java.lang.Throwable -> L9b
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            r10 = -1
            if (r4 <= 0) goto L6d
            long r4 = java.lang.Math.min(r2, r8)     // Catch: java.lang.Throwable -> L9b
            r8 = r17
            long r4 = r7.mo188M(r8, r4)     // Catch: java.lang.Throwable -> L9b
            long r12 = r6.f1867v     // Catch: java.lang.Throwable -> L9b
            long r12 = r12 + r4
            r6.f1867v = r12     // Catch: java.lang.Throwable -> L9b
            long r14 = r6.f1858P     // Catch: java.lang.Throwable -> L9b
            long r12 = r12 - r14
            if (r0 != 0) goto L7c
            a.Mf r7 = r6.f1864h     // Catch: java.lang.Throwable -> L9b
            a.VU r7 = r7.f2200e     // Catch: java.lang.Throwable -> L9b
            int r7 = r7.m2360z()     // Catch: java.lang.Throwable -> L9b
            int r7 = r7 / 2
            long r14 = (long) r7     // Catch: java.lang.Throwable -> L9b
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 < 0) goto L7c
            a.Mf r7 = r6.f1864h     // Catch: java.lang.Throwable -> L9b
            int r9 = r6.f1868z     // Catch: java.lang.Throwable -> L9b
            r7.m1565he(r9, r12)     // Catch: java.lang.Throwable -> L9b
            long r12 = r6.f1867v     // Catch: java.lang.Throwable -> L9b
            r6.f1858P = r12     // Catch: java.lang.Throwable -> L9b
            goto L7c
        L6d:
            r8 = r17
            boolean r4 = r1.f321R     // Catch: java.lang.Throwable -> L9b
            if (r4 != 0) goto L7b
            if (r0 != 0) goto L7b
            r6.m1300V()     // Catch: java.lang.Throwable -> L9b
            r4 = 1
            r12 = r10
            goto L7f
        L7b:
            r4 = r10
        L7c:
            r7 = 0
            r12 = r4
            r4 = r7
        L7f:
            a.lt r5 = r6.f1856M     // Catch: java.lang.Throwable -> La2
            r5.m3654V()     // Catch: java.lang.Throwable -> La2
            monitor-exit(r6)
            if (r4 == 0) goto L8a
            r4 = 0
            goto Lf
        L8a:
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 == 0) goto L8f
            return r12
        L8f:
            if (r0 != 0) goto L92
            return r10
        L92:
            throw r0
        L93:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "stream closed"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L9b
            throw r0     // Catch: java.lang.Throwable -> L9b
        L9b:
            r0 = move-exception
            a.lt r2 = r6.f1856M     // Catch: java.lang.Throwable -> La2
            r2.m3654V()     // Catch: java.lang.Throwable -> La2
            throw r0     // Catch: java.lang.Throwable -> La2
        La2:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        La5:
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r0 = p000a.AbstractC2441tz.m4205u(r0, r2)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0082Ba.mo188M(a.sQ, long):long");
    }

    @Override // p000a.InterfaceC0984SS
    /* renamed from: P */
    public final C1819iG mo189P() {
        return this.f323k.f1856M;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        C0573Kk c0573Kk = this.f323k;
        synchronized (c0573Kk) {
            this.f324q = true;
            C2361sQ c2361sQ = this.f320I;
            j = c2361sQ.f7260R;
            c2361sQ.m4091z();
            c0573Kk.notifyAll();
        }
        if (j > 0) {
            m190z(j);
        }
        this.f323k.m1306z();
    }

    /* renamed from: z */
    public final void m190z(long j) {
        byte[] bArr = AbstractC1181W6.f3860z;
        this.f323k.f1864h.m1566x(j);
    }
}
