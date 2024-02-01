package p000a;

import java.io.File;

/* renamed from: a.o3 */
/* loaded from: classes.dex */
public final class C2123o3 extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ C2640xk f6527g;

    /* renamed from: k */
    public int f6528k;

    /* renamed from: q */
    public File f6529q;

    /* renamed from: s */
    public final /* synthetic */ C1650f1 f6530s;

    /* renamed from: y */
    public final /* synthetic */ C2594ws f6531y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2123o3(C2640xk c2640xk, C2594ws c2594ws, C1650f1 c1650f1, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f6527g = c2640xk;
        this.f6531y = c2594ws;
        this.f6530s = c1650f1;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C2123o3(this.f6527g, this.f6531y, this.f6530s, interfaceC1171Vv);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[RETURN] */
    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo50V(java.lang.Object r7) {
        /*
            r6 = this;
            a.Im r0 = p000a.EnumC0464Im.f1557S
            int r1 = r6.f6528k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            p000a.AbstractC1292YB.m2664UZ(r7)     // Catch: java.io.IOException -> L7b
            goto L81
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            java.io.File r1 = r6.f6529q
            p000a.AbstractC1292YB.m2664UZ(r7)     // Catch: java.io.IOException -> L7b
            goto L59
        L1f:
            p000a.AbstractC1292YB.m2664UZ(r7)
            java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> L7b
            android.content.Context r7 = p000a.AbstractC1743gn.m3275z()     // Catch: java.io.IOException -> L7b
            java.io.File r7 = r7.getCacheDir()     // Catch: java.io.IOException -> L7b
            java.lang.String r4 = "26400.md"
            r1.<init>(r7, r4)     // Catch: java.io.IOException -> L7b
            boolean r7 = r1.exists()     // Catch: java.io.IOException -> L7b
            if (r7 == 0) goto L3c
            java.lang.String r7 = p000a.AbstractC1292YB.m2643D(r1)     // Catch: java.io.IOException -> L7b
            goto L5e
        L3c:
            java.lang.String r7 = p000a.AbstractC0064BG.f258z     // Catch: java.io.IOException -> L7b
            int r4 = r7.length()     // Catch: java.io.IOException -> L7b
            if (r4 != 0) goto L46
            r4 = r3
            goto L47
        L46:
            r4 = 0
        L47:
            if (r4 == 0) goto L4c
            java.lang.String r7 = ""
            goto L5e
        L4c:
            a.xk r4 = r6.f6527g     // Catch: java.io.IOException -> L7b
            r6.f6529q = r1     // Catch: java.io.IOException -> L7b
            r6.f6528k = r3     // Catch: java.io.IOException -> L7b
            java.lang.Object r7 = r4.m4542v(r7, r6)     // Catch: java.io.IOException -> L7b
            if (r7 != r0) goto L59
            return r0
        L59:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.io.IOException -> L7b
            p000a.AbstractC1292YB.m2677he(r1, r7)     // Catch: java.io.IOException -> L7b
        L5e:
            a.ws r1 = r6.f6531y     // Catch: java.io.IOException -> L7b
            android.text.SpannableStringBuilder r7 = r1.m4469h(r7)     // Catch: java.io.IOException -> L7b
            a.UE r1 = p000a.AbstractC0037Al.f179z     // Catch: java.io.IOException -> L7b
            a.de r1 = p000a.AbstractC1342Z8.f4236z     // Catch: java.io.IOException -> L7b
            a.UH r3 = new a.UH     // Catch: java.io.IOException -> L7b
            a.f1 r4 = r6.f6530s     // Catch: java.io.IOException -> L7b
            r5 = 0
            r3.<init>(r4, r7, r5)     // Catch: java.io.IOException -> L7b
            r6.f6529q = r5     // Catch: java.io.IOException -> L7b
            r6.f6528k = r2     // Catch: java.io.IOException -> L7b
            java.lang.Object r7 = p000a.AbstractC0438II.m1021ZH(r1, r3, r6)     // Catch: java.io.IOException -> L7b
            if (r7 != r0) goto L81
            return r0
        L7b:
            r7 = move-exception
            a.J2 r0 = p000a.AbstractC1530cs.f4727z
            r0.mo1160v(r7)
        L81:
            a.GJ r7 = p000a.C0329GJ.f1115z
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2123o3.mo50V(java.lang.Object):java.lang.Object");
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C2123o3) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
