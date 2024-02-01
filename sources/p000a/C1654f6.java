package p000a;

/* renamed from: a.f6 */
/* loaded from: classes.dex */
public final class C1654f6 extends C2485ur {

    /* renamed from: q */
    public final ThreadLocal f5122q;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1654f6(p000a.InterfaceC1171Vv r3, p000a.InterfaceC1255XS r4) {
        /*
            r2 = this;
            a.B6 r0 = p000a.C0057B6.f241S
            a.UM r1 = r4.mo107y(r0)
            if (r1 != 0) goto Ld
            a.XS r0 = r4.mo104G(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f5122q = r0
            a.XS r3 = r3.mo315N()
            a.g8 r0 = p000a.C1710g8.f5377R
            a.UM r3 = r3.mo107y(r0)
            boolean r3 = r3 instanceof p000a.AbstractC1859j1
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = p000a.AbstractC1292YB.m2663U8(r4, r3)
            p000a.AbstractC1292YB.m2682m(r4, r3)
            r2.m3126l(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1654f6.<init>(a.Vv, a.XS):void");
    }

    @Override // p000a.C2485ur, p000a.C0757O9
    /* renamed from: M */
    public final void mo31M(Object obj) {
        if (this.threadLocalIsSet) {
            C0084Bc c0084Bc = (C0084Bc) this.f5122q.get();
            if (c0084Bc != null) {
                AbstractC1292YB.m2682m((InterfaceC1255XS) c0084Bc.f329S, c0084Bc.f328R);
            }
            this.f5122q.remove();
        }
        Object m1001K = AbstractC0438II.m1001K(obj);
        InterfaceC1171Vv interfaceC1171Vv = this.f7618I;
        InterfaceC1255XS mo315N = interfaceC1171Vv.mo315N();
        C1654f6 c1654f6 = null;
        Object m2663U8 = AbstractC1292YB.m2663U8(mo315N, null);
        if (m2663U8 != AbstractC1292YB.f4138S) {
            c1654f6 = AbstractC1292YB.m2641BO(interfaceC1171Vv, mo315N, m2663U8);
        }
        try {
            this.f7618I.mo320u(m1001K);
        } finally {
            if (c1654f6 == null || c1654f6.m3127m()) {
                AbstractC1292YB.m2682m(mo315N, m2663U8);
            }
        }
    }

    /* renamed from: l */
    public final void m3126l(InterfaceC1255XS interfaceC1255XS, Object obj) {
        this.threadLocalIsSet = true;
        this.f5122q.set(new C0084Bc(interfaceC1255XS, obj));
    }

    /* renamed from: m */
    public final boolean m3127m() {
        boolean z = this.threadLocalIsSet && this.f5122q.get() == null;
        this.f5122q.remove();
        return !z;
    }
}
