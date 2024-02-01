package p000a;

/* renamed from: a.Ir */
/* loaded from: classes.dex */
public final class C0468Ir extends AbstractC1292YB {
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        if (r0 != false) goto L37;
     */
    /* renamed from: Lq */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m1130Lq(p000a.C2531vd r8, p000a.InterfaceC1171Vv r9) {
        /*
            r0 = 5
            a.Bc[] r1 = new p000a.C0084Bc[r0]
            int r2 = r8.f7751z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            a.Bc r3 = new a.Bc
            java.lang.String r4 = "uid"
            r3.<init>(r4, r2)
            r2 = 0
            r1[r2] = r3
            int r3 = r8.f7749h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            a.Bc r4 = new a.Bc
            java.lang.String r5 = "policy"
            r4.<init>(r5, r3)
            r3 = 1
            r1[r3] = r4
            long r4 = r8.f7750v
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            a.Bc r5 = new a.Bc
            java.lang.String r6 = "until"
            r5.<init>(r6, r4)
            r4 = 2
            r1[r4] = r5
            boolean r4 = r8.f7748P
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            a.Bc r5 = new a.Bc
            java.lang.String r6 = "logging"
            r5.<init>(r6, r4)
            r4 = 3
            r1[r4] = r5
            boolean r4 = r8.f7747N
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            a.Bc r5 = new a.Bc
            java.lang.String r6 = "notification"
            r5.<init>(r6, r4)
            r4 = 4
            r1[r4] = r5
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            int r5 = p000a.AbstractC0438II.m990C(r0)
            r4.<init>(r5)
            r5 = r2
        L5d:
            if (r5 >= r0) goto L6b
            r6 = r1[r5]
            java.lang.Object r7 = r6.f329S
            java.lang.Object r6 = r6.f328R
            r4.put(r7, r6)
            int r5 = r5 + 1
            goto L5d
        L6b:
            a.Hm r0 = p000a.C1910jw.m3543z()
            int r0 = r0.f1385v
            r1 = 25000(0x61a8, float:3.5032E-41)
            if (r0 >= r1) goto L86
            a.Hm r0 = p000a.C1910jw.m3543z()
            int r0 = r0.f1385v
            if (r0 <= 0) goto L83
            int r0 = r0 % 100
            if (r0 == 0) goto L83
            r0 = r3
            goto L84
        L83:
            r0 = r2
        L84:
            if (r0 == 0) goto L87
        L86:
            r2 = r3
        L87:
            if (r2 != 0) goto L9c
            android.content.Context r0 = p000a.AbstractC1743gn.m3275z()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r8 = r8.f7751z
            java.lang.String r8 = r0.getNameForUid(r8)
            java.lang.String r0 = "package_name"
            r4.put(r0, r8)
        L9c:
            java.lang.String r8 = p000a.AbstractC1292YB.m2684n0(r4)
            java.lang.String r0 = "REPLACE INTO policies "
            java.lang.String r8 = p000a.AbstractC2441tz.m4200k(r0, r8)
            a.Bj r0 = new a.Bj
            r1 = 0
            r0.<init>(r1)
            java.lang.Object r8 = p000a.AbstractC1292YB.m2675f(r8, r0, r9)
            a.Im r9 = p000a.EnumC0464Im.f1557S
            if (r8 != r9) goto Lb5
            return r8
        Lb5:
            a.GJ r8 = p000a.C0329GJ.f1115z
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0468Ir.m1130Lq(a.vd, a.Vv):java.lang.Object");
    }

    /* renamed from: dx */
    public static Object m1131dx(int i, InterfaceC1171Vv interfaceC1171Vv) {
        Object m2675f = AbstractC1292YB.m2675f(AbstractC2441tz.m4188N("DELETE FROM policies WHERE uid == ", i), new C0090Bj(null), interfaceC1171Vv);
        if (m2675f == EnumC0464Im.f1557S) {
            return m2675f;
        }
        return C0329GJ.f1115z;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0059  */
    /* renamed from: ZH */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable m1132ZH(p000a.InterfaceC1171Vv r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p000a.C0758OA
            if (r0 == 0) goto L13
            r0 = r5
            a.OA r0 = (p000a.C0758OA) r0
            int r1 = r0.f2573k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2573k = r1
            goto L18
        L13:
            a.OA r0 = new a.OA
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f2572I
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f2573k
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p000a.AbstractC1292YB.m2664UZ(r5)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            p000a.AbstractC1292YB.m2664UZ(r5)
            int r5 = p000a.AbstractC0598LC.f1920h
            java.lang.String r2 = "SELECT * FROM policies WHERE uid/100000 == "
            java.lang.String r5 = p000a.AbstractC2441tz.m4188N(r2, r5)
            a.CO r2 = new a.CO
            r2.<init>(r4)
            r0.f2573k = r3
            java.lang.Object r5 = p000a.AbstractC1292YB.m2675f(r5, r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L53:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r5.next()
            if (r1 == 0) goto L53
            r0.add(r1)
            goto L53
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0468Ir.m1132ZH(a.Vv):java.io.Serializable");
    }
}
