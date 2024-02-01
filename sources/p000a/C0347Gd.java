package p000a;

/* renamed from: a.Gd */
/* loaded from: classes.dex */
public final class C0347Gd extends AbstractC1500cH {

    /* renamed from: N */
    public final boolean f1168N;

    /* renamed from: P */
    public final InterfaceC2491ux f1169P;

    /* renamed from: h */
    public final /* synthetic */ int f1170h;

    /* renamed from: v */
    public final String f1171v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0347Gd(java.lang.String r4, boolean r5, int r6) {
        /*
            r3 = this;
            a.g8 r0 = p000a.C1710g8.f5378S
            r3.f1170h = r6
            r1 = 1
            r2 = 12
            if (r6 == r1) goto L13
            r3.<init>(r2)
            r3.f1171v = r4
            r3.f1169P = r0
            r3.f1168N = r5
            return
        L13:
            r3.<init>(r2)
            r3.f1171v = r4
            r3.f1169P = r0
            r3.f1168N = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0347Gd.<init>(java.lang.String, boolean, int):void");
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: z */
    public final void mo332z(C1120Uy c1120Uy, Object obj) {
        String str;
        String str2;
        int i = this.f1170h;
        boolean z = this.f1168N;
        String str3 = this.f1171v;
        InterfaceC2491ux interfaceC2491ux = this.f1169P;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (obj != null && (str2 = (String) interfaceC2491ux.mo329P(obj)) != null) {
                    c1120Uy.m2308z(str3, str2, z);
                    return;
                }
                return;
            default:
                if (obj != null && (str = (String) interfaceC2491ux.mo329P(obj)) != null) {
                    c1120Uy.m2305P(str3, str, z);
                    return;
                }
                return;
        }
    }
}
