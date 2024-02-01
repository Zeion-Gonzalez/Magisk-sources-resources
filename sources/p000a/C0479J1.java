package p000a;

/* renamed from: a.J1 */
/* loaded from: classes.dex */
public final class C0479J1 extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ C1688fk f1594g;

    /* renamed from: k */
    public int f1595k;

    /* renamed from: q */
    public C1688fk f1596q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0479J1(C1688fk c1688fk, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f1594g = c1688fk;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C0479J1(this.f1594g, interfaceC1171Vv);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c A[LOOP:0: B:27:0x0096->B:29:0x009c, LOOP_END] */
    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo50V(java.lang.Object r8) {
        /*
            r7 = this;
            a.Im r0 = p000a.EnumC0464Im.f1557S
            int r1 = r7.f1595k
            r2 = 3
            r3 = 2
            r4 = 1
            a.fk r5 = r7.f1594g
            if (r1 == 0) goto L28
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            p000a.AbstractC1292YB.m2664UZ(r8)
            goto L87
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            p000a.AbstractC1292YB.m2664UZ(r8)
            goto L7a
        L22:
            a.fk r1 = r7.f1596q
            p000a.AbstractC1292YB.m2664UZ(r8)
            goto L39
        L28:
            p000a.AbstractC1292YB.m2664UZ(r8)
            a.iY r8 = r5.f5291g
            r7.f1596q = r5
            r7.f1595k = r4
            java.lang.Object r8 = r8.m3388z(r7)
            if (r8 != r0) goto L38
            return r0
        L38:
            r1 = r5
        L39:
            java.lang.String r8 = (java.lang.String) r8
            r1.f5289Y = r8
            java.lang.String r8 = r5.f5289Y
            char[] r1 = new char[r4]
            r4 = 0
            r6 = 10
            r1[r4] = r6
            java.util.List r8 = p000a.AbstractC1269Xn.m2571F3(r8, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = p000a.AbstractC1658fB.m3134dx(r8)
            r1.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
        L57:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L6c
            java.lang.Object r4 = r8.next()
            java.lang.String r4 = (java.lang.String) r4
            a.k7 r6 = new a.k7
            r6.<init>(r4)
            r1.add(r6)
            goto L57
        L6c:
            a.cb r8 = r5.f5292r
            r4 = 0
            r7.f1596q = r4
            r7.f1595k = r3
            java.lang.Object r8 = r8.m2943G(r1, r7)
            if (r8 != r0) goto L7a
            return r0
        L7a:
            a.iY r8 = r5.f5291g
            r7.f1595k = r2
            a.L7 r8 = r8.f5735z
            java.lang.Object r8 = r8.m1322z(r7)
            if (r8 != r0) goto L87
            return r0
        L87:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = p000a.AbstractC1658fB.m3134dx(r8)
            r0.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L96:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Lab
            java.lang.Object r1 = r8.next()
            a.Oi r1 = (p000a.C0790Oi) r1
            a.Wl r2 = new a.Wl
            r2.<init>(r1)
            r0.add(r2)
            goto L96
        Lab:
            a.cb r8 = r5.f5287E
            java.util.List r8 = r8.f4694S
            a.Ra r8 = p000a.C1517cb.m2942Q(r8, r0)
            a.Bc r1 = new a.Bc
            r1.<init>(r0, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0479J1.mo50V(java.lang.Object):java.lang.Object");
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C0479J1) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
