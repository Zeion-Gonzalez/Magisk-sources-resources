package p000a;

/* renamed from: a.tU */
/* loaded from: classes.dex */
public final class C2415tU implements InterfaceC2445u2 {

    /* renamed from: I */
    public final /* synthetic */ C0113CB f7395I;

    /* renamed from: R */
    public final /* synthetic */ InterfaceC1057Tq f7396R;

    /* renamed from: S */
    public final /* synthetic */ InterfaceC1265Xh f7397S;

    /* renamed from: w */
    public final /* synthetic */ InterfaceC0829PT f7398w;

    public C2415tU(InterfaceC1265Xh interfaceC1265Xh, C0190Df c0190Df, InterfaceC0829PT interfaceC0829PT, C0113CB c0113cb) {
        this.f7397S = interfaceC1265Xh;
        this.f7396R = c0190Df;
        this.f7398w = interfaceC0829PT;
        this.f7395I = c0113cb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0074, code lost:
    
        r0.m2964r(r3, r0.f2384w, r7.f589h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x008e, code lost:
    
        if (r7 == r0) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0036  */
    @Override // p000a.InterfaceC2445u2
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo237h(p000a.InterfaceC1634ej r6, p000a.InterfaceC1171Vv r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p000a.C2387sv
            if (r0 == 0) goto L13
            r0 = r7
            a.sv r0 = (p000a.C2387sv) r0
            int r1 = r0.f7321y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7321y = r1
            goto L18
        L13:
            a.sv r0 = new a.sv
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f7319k
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f7321y
            a.GJ r3 = p000a.C0329GJ.f1115z
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            a.ej r6 = r0.f7320q
            a.tU r0 = r0.f7317I
            p000a.AbstractC1292YB.m2664UZ(r7)
            goto L96
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            p000a.AbstractC1292YB.m2664UZ(r7)
            a.Xh r7 = r5.f7397S
            if (r7 == 0) goto L40
            p000a.AbstractC1843ih.m3442f(r7)
        L40:
            r0.f7317I = r5
            r0.f7320q = r6
            r0.f7321y = r4
            a.Tq r7 = r5.f7396R
            a.Df r7 = (p000a.C0190Df) r7
            r7.getClass()
        L4d:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = p000a.C0190Df.f587u
            int r2 = r2.getAndDecrement(r7)
            int r4 = r7.f590z
            if (r2 > r4) goto L4d
            if (r2 <= 0) goto L5a
            goto L91
        L5a:
            a.Vv r0 = p000a.AbstractC0438II.m1026e(r0)
            a.cm r0 = p000a.AbstractC1292YB.m2689p(r0)
            boolean r2 = r7.m375z(r0)     // Catch: java.lang.Throwable -> L7c
            if (r2 != 0) goto L84
        L68:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = p000a.C0190Df.f587u     // Catch: java.lang.Throwable -> L7c
            int r2 = r2.getAndDecrement(r7)     // Catch: java.lang.Throwable -> L7c
            int r4 = r7.f590z     // Catch: java.lang.Throwable -> L7c
            if (r2 > r4) goto L68
            if (r2 <= 0) goto L7e
            a.yQ r7 = r7.f589h     // Catch: java.lang.Throwable -> L7c
            int r2 = r0.f2384w     // Catch: java.lang.Throwable -> L7c
            r0.m2964r(r3, r2, r7)     // Catch: java.lang.Throwable -> L7c
            goto L84
        L7c:
            r6 = move-exception
            goto La7
        L7e:
            boolean r2 = r7.m375z(r0)     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L68
        L84:
            java.lang.Object r7 = r0.m2963q()
            a.Im r0 = p000a.EnumC0464Im.f1557S
            if (r7 != r0) goto L8d
            goto L8e
        L8d:
            r7 = r3
        L8e:
            if (r7 != r0) goto L91
            goto L92
        L91:
            r7 = r3
        L92:
            if (r7 != r1) goto L95
            return r1
        L95:
            r0 = r5
        L96:
            a.PT r7 = r0.f7398w
            a.iO r1 = new a.iO
            a.Tq r2 = r0.f7396R
            a.CB r0 = r0.f7395I
            r4 = 0
            r1.<init>(r6, r0, r2, r4)
            r6 = 3
            p000a.AbstractC0438II.m994F(r7, r4, r1, r6)
            return r3
        La7:
            r0.m2960f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2415tU.mo237h(a.ej, a.Vv):java.lang.Object");
    }
}
