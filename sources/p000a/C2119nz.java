package p000a;

import java.util.LinkedHashMap;

/* renamed from: a.nz */
/* loaded from: classes.dex */
public final class C2119nz extends AbstractC1292YB {
    /* renamed from: Ha */
    public static Object m3737Ha(String str, String str2, InterfaceC1171Vv interfaceC1171Vv) {
        C0084Bc c0084Bc = new C0084Bc("key", str);
        C0084Bc[] c0084BcArr = {c0084Bc, new C0084Bc("value", str2)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0438II.m990C(2));
        for (int i = 0; i < 2; i++) {
            C0084Bc c0084Bc2 = c0084BcArr[i];
            linkedHashMap.put(c0084Bc2.f329S, c0084Bc2.f328R);
        }
        Object m2675f = AbstractC1292YB.m2675f(AbstractC2441tz.m4200k("REPLACE INTO strings ", AbstractC1292YB.m2684n0(linkedHashMap)), new C0090Bj(null), interfaceC1171Vv);
        if (m2675f == EnumC0464Im.f1557S) {
            return m2675f;
        }
        return C0329GJ.f1115z;
    }

    /* renamed from: dx */
    public static Object m3738dx(String str, InterfaceC1171Vv interfaceC1171Vv) {
        Object m2675f = AbstractC1292YB.m2675f(AbstractC2441tz.m4184G("DELETE FROM strings WHERE key == \"", str, "\""), new C0090Bj(null), interfaceC1171Vv);
        if (m2675f == EnumC0464Im.f1557S) {
            return m2675f;
        }
        return C0329GJ.f1115z;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: Lq */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m3739Lq(java.lang.String r5, java.lang.String r6, p000a.InterfaceC1171Vv r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p000a.C1582dn
            if (r0 == 0) goto L13
            r0 = r7
            a.dn r0 = (p000a.C1582dn) r0
            int r1 = r0.f4863g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4863g = r1
            goto L18
        L13:
            a.dn r0 = new a.dn
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f4865q
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f4863g
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.f4862I
            p000a.AbstractC1292YB.m2664UZ(r7)
            goto L58
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p000a.AbstractC1292YB.m2664UZ(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "SELECT value FROM strings WHERE key == \""
            r7.<init>(r2)
            r7.append(r5)
            java.lang.String r5 = "\" LIMIT 1"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            a.Tr r7 = new a.Tr
            r2 = 0
            r7.<init>(r2)
            r0.f4862I = r6
            r0.f4863g = r3
            java.lang.Object r7 = p000a.AbstractC1292YB.m2675f(r5, r7, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r5 = p000a.AbstractC2486us.m4293nB(r7)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L63
            goto L64
        L63:
            r6 = r5
        L64:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2119nz.m3739Lq(java.lang.String, java.lang.String, a.Vv):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0062  */
    /* renamed from: ZH */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m3740ZH(java.lang.String r5, int r6, p000a.InterfaceC1171Vv r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p000a.C0575Km
            if (r0 == 0) goto L13
            r0 = r7
            a.Km r0 = (p000a.C0575Km) r0
            int r1 = r0.f1873g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1873g = r1
            goto L18
        L13:
            a.Km r0 = new a.Km
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f1875q
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f1873g
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r6 = r0.f1872I
            p000a.AbstractC1292YB.m2664UZ(r7)
            goto L58
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p000a.AbstractC1292YB.m2664UZ(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "SELECT value FROM settings WHERE key == \""
            r7.<init>(r2)
            r7.append(r5)
            java.lang.String r5 = "\" LIMIT 1"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            a.BR r7 = new a.BR
            r2 = 0
            r7.<init>(r2)
            r0.f1872I = r6
            r0.f1873g = r3
            java.lang.Object r7 = p000a.AbstractC1292YB.m2675f(r5, r7, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r5 = p000a.AbstractC2486us.m4293nB(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L66
            int r6 = r5.intValue()
        L66:
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2119nz.m3740ZH(java.lang.String, int, a.Vv):java.lang.Object");
    }
}
