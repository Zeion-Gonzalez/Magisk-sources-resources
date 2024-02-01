package p000a;

/* renamed from: a.Sz */
/* loaded from: classes.dex */
public final class C1011Sz implements InterfaceC2312rW {

    /* renamed from: z */
    public final /* synthetic */ int f3389z;

    public /* synthetic */ C1011Sz(int i) {
        this.f3389z = i;
    }

    /* renamed from: z */
    public final Object m2190z(C1774hM c1774hM, C2528vZ c2528vZ) {
        int i = 1;
        int i2 = 0;
        switch (this.f3389z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new C0182DX((C0846Po) c1774hM.f5594z, 0);
            case 1:
                return new C2669yM((C0846Po) c1774hM.f5594z);
            case 2:
                return new C1491c4((C0846Po) c1774hM.f5594z);
            case 3:
                return new C0169DH(i2);
            case 4:
                return new C1695ft((C0846Po) c1774hM.f5594z, ((Integer) AbstractC2575wW.f7888q.m1255z(c2528vZ)).intValue());
            case 5:
                return new C0526Jv((C0846Po) c1774hM.f5594z, (String) AbstractC2575wW.f7884k.m1255z(c2528vZ), (C0054B3) c1774hM.f5589P);
            case 6:
                if (EnumC1556dH.f4812S == AbstractC2575wW.f7868R.m1255z(c2528vZ)) {
                    return new C1938kU((C0846Po) c1774hM.f5594z, ((Integer) AbstractC2575wW.f7893w.m1255z(c2528vZ)).intValue());
                }
                return new C2618xG((C0846Po) c1774hM.f5594z, String.valueOf(AbstractC2575wW.f7860I.m1255z(c2528vZ)).concat(". "));
            case 7:
                return new C0169DH(i);
            default:
                return new C0182DX((C0846Po) c1774hM.f5594z, 1);
        }
    }
}
