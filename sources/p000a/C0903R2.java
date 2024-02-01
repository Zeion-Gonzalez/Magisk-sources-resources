package p000a;

/* renamed from: a.R2 */
/* loaded from: classes.dex */
public final class C0903R2 extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: I */
    public final /* synthetic */ Object f3087I;

    /* renamed from: R */
    public final /* synthetic */ int f3088R;

    /* renamed from: q */
    public final /* synthetic */ Object f3089q;

    /* renamed from: w */
    public final /* synthetic */ Object f3090w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0903R2(int i, Object obj, Object obj2, Object obj3) {
        super(1);
        this.f3088R = i;
        this.f3090w = obj;
        this.f3087I = obj2;
        this.f3089q = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo85W(java.lang.Object r8) {
        /*
            r7 = this;
            a.GJ r0 = p000a.C0329GJ.f1115z
            int r1 = r7.f3088R
            java.lang.Object r2 = r7.f3089q
            java.lang.Object r3 = r7.f3087I
            java.lang.Object r4 = r7.f3090w
            switch(r1) {
                case 0: goto L8d;
                case 1: goto L38;
                case 2: goto L15;
                case 3: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto Ld3
        Lf:
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            r7.m2053h(r8)
            return r0
        L15:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L2b
            a.xD r4 = (p000a.AbstractC2615xD) r4
            a.P0 r8 = new a.P0
            r1 = 2131886151(0x7f120047, float:1.9406873E38)
            r8.<init>(r1)
            r4.m4500S(r8)
            goto L37
        L2b:
            a.zq r3 = (p000a.C2744zq) r3
            a.DY r8 = new a.DY
            a.R6 r2 = (p000a.C0907R6) r2
            r8.<init>(r2)
            r3.m4499R(r8)
        L37:
            return r0
        L38:
            a.d7 r8 = (p000a.InterfaceC1546d7) r8
            a.oA r4 = (p000a.C2129oA) r4
            java.util.ArrayList r1 = r4.f6561u
            a.s3 r3 = (p000a.AbstractComponentCallbacksC2342s3) r3
            boolean r5 = r1 instanceof java.util.Collection
            if (r5 == 0) goto L4b
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L4b
            goto L67
        L4b:
            java.util.Iterator r1 = r1.iterator()
        L4f:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L67
            java.lang.Object r5 = r1.next()
            a.Bc r5 = (p000a.C0084Bc) r5
            java.lang.Object r5 = r5.f329S
            java.lang.String r6 = r3.f7192L
            boolean r5 = p000a.AbstractC1292YB.m2695u(r5, r6)
            if (r5 == 0) goto L4f
            r1 = 1
            goto L68
        L67:
            r1 = 0
        L68:
            if (r8 == 0) goto L8c
            if (r1 != 0) goto L8c
            a.Xp r8 = r3.m4002I()
            r8.m2597P()
            a.GG r8 = r8.f4088I
            a.eh r1 = r8.f1105P
            a.eh r3 = p000a.EnumC1632eh.f5092w
            boolean r1 = r1.m3117z(r3)
            if (r1 == 0) goto L8c
            a.yQ r1 = r4.f6559W
            a.dE r2 = (p000a.C1553dE) r2
            java.lang.Object r1 = r1.mo85W(r2)
            a.xV r1 = (p000a.InterfaceC2630xV) r1
            r8.mo728z(r1)
        L8c:
            return r0
        L8d:
            a.dE r8 = (p000a.C1553dE) r8
            a.ag r0 = r8.f4790R
            boolean r1 = r0 instanceof p000a.C1420ag
            r5 = 0
            if (r1 == 0) goto L97
            goto L98
        L97:
            r0 = r5
        L98:
            if (r0 != 0) goto L9b
            goto Ld2
        L9b:
            a.zK r4 = (p000a.AbstractC2719zK) r4
            android.os.Bundle r1 = r8.m3023v()
            a.PB r3 = (p000a.C0815PB) r3
            p000a.AbstractC2441tz.m4202q(r2)
            a.ag r1 = r4.mo635v(r0, r1, r3)
            if (r1 != 0) goto Lae
            r8 = r5
            goto Ld1
        Lae:
            boolean r0 = p000a.AbstractC1292YB.m2695u(r1, r0)
            if (r0 == 0) goto Lb5
            goto Ld1
        Lb5:
            a.R3 r0 = r4.m4654h()
            android.os.Bundle r8 = r8.m3023v()
            android.os.Bundle r8 = r1.m2852v(r8)
            int r2 = p000a.C1553dE.f4787f
            a.v4 r0 = r0.f3095o
            android.content.Context r2 = r0.f7665z
            a.eh r3 = r0.m4345u()
            a.Hd r0 = r0.f7663w
            a.dE r8 = p000a.C1665fK.m3153u(r2, r1, r8, r3, r0)
        Ld1:
            r5 = r8
        Ld2:
            return r5
        Ld3:
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            r7.m2053h(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0903R2.mo85W(java.lang.Object):java.lang.Object");
    }

    /* renamed from: h */
    public final void m2053h(Throwable th) {
        int i = this.f3088R;
        Object obj = this.f3089q;
        Object obj2 = this.f3087I;
        Object obj3 = this.f3090w;
        switch (i) {
            case 3:
                if (obj3 == AbstractC1671fQ.f5218V) {
                    return;
                }
                InterfaceC2364sT interfaceC2364sT = ((C1066U0) obj2).f3522R;
                AbstractC2441tz.m4202q(obj);
                throw null;
            default:
                InterfaceC1255XS interfaceC1255XS = (InterfaceC1255XS) obj;
                C0993Sd m2654M = AbstractC1292YB.m2654M((InterfaceC2364sT) obj3, obj2, null);
                if (m2654M != null) {
                    AbstractC0438II.m1000J(interfaceC1255XS, m2654M);
                    return;
                }
                return;
        }
    }
}
