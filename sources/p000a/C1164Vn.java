package p000a;

import android.util.SparseArray;

/* renamed from: a.Vn */
/* loaded from: classes.dex */
public final class C1164Vn extends AbstractC2439tx {

    /* renamed from: E */
    public final SparseArray f3787E;

    /* renamed from: f */
    public boolean f3789f;

    /* renamed from: g */
    public boolean f3790g;

    /* renamed from: y */
    public boolean f3792y;

    /* renamed from: s */
    public String f3791s = "";

    /* renamed from: U */
    public final C2412tR f3788U = new C2412tR(AbstractC2575wW.m4424d(this));

    public C1164Vn() {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(43, this);
        this.f3787E = sparseArray;
        this.f3789f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006b  */
    @Override // p000a.AbstractC2439tx
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo1139I(p000a.InterfaceC1171Vv r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p000a.C2037mL
            if (r0 == 0) goto L13
            r0 = r6
            a.mL r0 = (p000a.C2037mL) r0
            int r1 = r0.f6354g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6354g = r1
            goto L18
        L13:
            a.mL r0 = new a.mL
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f6356q
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f6354g
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            a.Vn r0 = r0.f6353I
            p000a.AbstractC1292YB.m2664UZ(r6)
            goto L53
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            p000a.AbstractC1292YB.m2664UZ(r6)
            boolean r6 = r5.f3789f
            if (r6 == r3) goto L3f
            r5.f3789f = r3
            r6 = 22
            r5.mo1709Q(r6)
        L3f:
            a.UE r6 = p000a.AbstractC0037Al.f179z
            a.wN r2 = new a.wN
            r4 = 0
            r2.<init>(r4)
            r0.f6353I = r5
            r0.f6354g = r3
            java.lang.Object r6 = p000a.AbstractC0438II.m1021ZH(r6, r2, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            r0 = r5
        L53:
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            a.tR r1 = r0.f3788U
            java.util.List r2 = r1.f7386I
            int r2 = r2.size()
            r3 = 0
            r1.mo874h(r3, r2)
            r1.f4694S = r6
            a.X8 r6 = p000a.C1239X8.f4021S
            r1.f7386I = r6
            a.sT r6 = r1.f7387k
            if (r6 == 0) goto L6e
            r1.m4168M(r6)
        L6e:
            java.lang.String r6 = r0.f3791s
            r0.m2381k(r6)
            a.GJ r6 = p000a.C0329GJ.f1115z
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1164Vn.mo1139I(a.Vv):java.lang.Object");
    }

    /* renamed from: k */
    public final void m2381k(String str) {
        this.f3788U.m4168M(new C1372Zg(this, 5, str));
        if (this.f3789f) {
            this.f3789f = false;
            mo1709Q(22);
        }
    }
}
