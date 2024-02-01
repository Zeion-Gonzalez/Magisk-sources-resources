package p000a;

import java.util.Iterator;

/* renamed from: a.V0 */
/* loaded from: classes.dex */
public final class C1122V0 extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public int f3671g;

    /* renamed from: k */
    public C0374H8 f3672k;

    /* renamed from: q */
    public Iterator f3673q;

    /* renamed from: y */
    public final /* synthetic */ C2744zq f3674y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122V0(C2744zq c2744zq, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f3674y = c2744zq;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1122V0(this.f3674y, interfaceC1171Vv);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0045 -> B:15:0x004b). Please submit an issue!!! */
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
            int r1 = r6.f3671g
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            a.H8 r1 = r6.f3672k
            java.util.Iterator r3 = r6.f3673q
            p000a.AbstractC1292YB.m2664UZ(r7)
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r6
            goto L4b
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            p000a.AbstractC1292YB.m2664UZ(r7)
            a.zq r7 = r6.f3674y
            a.cb r7 = r7.f8604y
            java.util.Iterator r7 = r7.iterator()
            r3 = r7
            r7 = r6
        L2a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r3.next()
            a.H8 r1 = (p000a.C0374H8) r1
            a.WL r4 = r1.f1277R
            r7.f3673q = r3
            r7.f3672k = r1
            r7.f3671g = r2
            java.lang.Object r4 = r4.m2475P(r7)
            if (r4 != r0) goto L45
            return r0
        L45:
            r5 = r0
            r0 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L60
            r3.getClass()
            r7 = 35
            p000a.AbstractC0795Op.m1801B(r3, r7)
            r7 = 42
            p000a.AbstractC0795Op.m1801B(r3, r7)
        L60:
            r7 = r0
            r0 = r1
            r3 = r4
            goto L2a
        L64:
            a.GJ r7 = p000a.C0329GJ.f1115z
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1122V0.mo50V(java.lang.Object):java.lang.Object");
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1122V0) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
