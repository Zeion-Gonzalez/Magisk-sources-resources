package p000a;

/* renamed from: a.sJ */
/* loaded from: classes.dex */
public final class C2355sJ extends AbstractC1021T9 implements InterfaceC0559KW {

    /* renamed from: R */
    public final /* synthetic */ C2688yk f7247R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2355sJ(C2688yk c2688yk) {
        super(2);
        this.f7247R = c2688yk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r1 == null) goto L18;
     */
    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo51o(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            a.UM r5 = (p000a.InterfaceC1088UM) r5
            a.Ls r0 = r5.getKey()
            a.yk r1 = r3.f7247R
            a.XS r1 = r1.f8378q
            a.UM r1 = r1.mo107y(r0)
            a.g8 r2 = p000a.C1710g8.f5381k
            if (r0 == r2) goto L1d
            if (r5 == r1) goto L32
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L34
        L1d:
            a.Xh r1 = (p000a.InterfaceC1265Xh) r1
            a.Xh r5 = (p000a.InterfaceC1265Xh) r5
        L21:
            r0 = 0
            if (r5 != 0) goto L26
            r5 = r0
            goto L2d
        L26:
            if (r5 != r1) goto L29
            goto L2d
        L29:
            boolean r2 = r5 instanceof p000a.C2485ur
            if (r2 != 0) goto L5e
        L2d:
            if (r5 != r1) goto L39
            if (r1 != 0) goto L32
            goto L34
        L32:
            int r4 = r4 + 1
        L34:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L39:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            r0.<init>(r2)
            r0.append(r5)
            java.lang.String r5 = ", expected child of "
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L5e:
            a.O9 r5 = (p000a.C0757O9) r5
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p000a.C0757O9.f2570R
            java.lang.Object r5 = r2.get(r5)
            a.Hp r5 = (p000a.InterfaceC0413Hp) r5
            if (r5 == 0) goto L6f
            a.Xh r5 = r5.getParent()
            goto L21
        L6f:
            r5 = r0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2355sJ.mo51o(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
