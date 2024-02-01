package p000a;

import java.util.List;

/* renamed from: a.i2 */
/* loaded from: classes.dex */
public final class C1807i2 implements InterfaceC1634ej {

    /* renamed from: R */
    public final Object f5669R;

    /* renamed from: S */
    public final /* synthetic */ int f5670S = 1;

    public C1807i2(InterfaceC0559KW interfaceC0559KW) {
        this.f5669R = interfaceC0559KW;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x007e  */
    @Override // p000a.InterfaceC1634ej
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo1459z(p000a.InterfaceC2445u2 r10, p000a.InterfaceC1171Vv r11) {
        /*
            r9 = this;
            a.GJ r0 = p000a.C0329GJ.f1115z
            int r1 = r9.f5670S
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.Object r3 = r9.f5669R
            r4 = 1
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            switch(r1) {
                case 0: goto Lf;
                default: goto Le;
            }
        Le:
            goto L60
        Lf:
            boolean r1 = r11 instanceof p000a.C2270qj
            if (r1 == 0) goto L20
            r1 = r11
            a.qj r1 = (p000a.C2270qj) r1
            int r6 = r1.f6980q
            r7 = r6 & r5
            if (r7 == 0) goto L20
            int r6 = r6 - r5
            r1.f6980q = r6
            goto L25
        L20:
            a.qj r1 = new a.qj
            r1.<init>(r9, r11)
        L25:
            java.lang.Object r11 = r1.f6977I
            a.Im r5 = p000a.EnumC0464Im.f1557S
            int r6 = r1.f6980q
            if (r6 == 0) goto L3d
            if (r6 != r4) goto L37
            java.util.Iterator r10 = r1.f6981y
            a.u2 r2 = r1.f6978g
            p000a.AbstractC1292YB.m2664UZ(r11)
            goto L48
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r2)
            throw r10
        L3d:
            p000a.AbstractC1292YB.m2664UZ(r11)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r11 = r3.iterator()
            r2 = r10
            r10 = r11
        L48:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L5f
            java.lang.Object r11 = r10.next()
            r1.f6978g = r2
            r1.f6981y = r10
            r1.f6980q = r4
            java.lang.Object r11 = r2.mo237h(r11, r1)
            if (r11 != r5) goto L48
            r0 = r5
        L5f:
            return r0
        L60:
            boolean r1 = r11 instanceof p000a.C1439b
            if (r1 == 0) goto L71
            r1 = r11
            a.b r1 = (p000a.C1439b) r1
            int r6 = r1.f4509g
            r7 = r6 & r5
            if (r7 == 0) goto L71
            int r6 = r6 - r5
            r1.f4509g = r6
            goto L76
        L71:
            a.b r1 = new a.b
            r1.<init>(r9, r11)
        L76:
            java.lang.Object r11 = r1.f4511q
            a.Im r5 = p000a.EnumC0464Im.f1557S
            int r6 = r1.f4509g
            if (r6 == 0) goto L8e
            if (r6 != r4) goto L88
            a.yk r10 = r1.f4508I
            p000a.AbstractC1292YB.m2664UZ(r11)     // Catch: java.lang.Throwable -> L86
            goto Lab
        L86:
            r11 = move-exception
            goto Lb3
        L88:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r2)
            throw r10
        L8e:
            p000a.AbstractC1292YB.m2664UZ(r11)
            a.yk r11 = new a.yk
            a.XS r2 = r1.f2025R
            r11.<init>(r10, r2)
            r1.f4508I = r11     // Catch: java.lang.Throwable -> Laf
            r1.f4509g = r4     // Catch: java.lang.Throwable -> Laf
            a.KW r3 = (p000a.InterfaceC0559KW) r3     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r10 = r3.mo51o(r11, r1)     // Catch: java.lang.Throwable -> Laf
            if (r10 != r5) goto La5
            goto La6
        La5:
            r10 = r0
        La6:
            if (r10 != r5) goto Laa
            r0 = r5
            goto Lae
        Laa:
            r10 = r11
        Lab:
            r10.mo1387S()
        Lae:
            return r0
        Laf:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        Lb3:
            r10.mo1387S()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1807i2.mo1459z(a.u2, a.Vv):java.lang.Object");
    }

    public C1807i2(List list) {
        this.f5669R = list;
    }
}
