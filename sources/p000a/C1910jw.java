package p000a;

import com.topjohnwu.magisk.core.model.UpdateInfo;

/* renamed from: a.jw */
/* loaded from: classes.dex */
public final class C1910jw {

    /* renamed from: G */
    public static boolean f5952G;

    /* renamed from: I */
    public static final C1112Up f5953I;

    /* renamed from: M */
    public static boolean f5954M;

    /* renamed from: N */
    public static final C1146VR f5955N;

    /* renamed from: P */
    public static UpdateInfo f5956P;

    /* renamed from: Q */
    public static boolean f5957Q;

    /* renamed from: R */
    public static boolean f5958R;

    /* renamed from: S */
    public static boolean f5959S;

    /* renamed from: V */
    public static String f5960V;

    /* renamed from: W */
    public static final boolean f5961W;

    /* renamed from: h */
    public static C0175DP f5962h;

    /* renamed from: o */
    public static boolean f5963o;

    /* renamed from: u */
    public static boolean f5964u;

    /* renamed from: v */
    public static final UpdateInfo f5965v;

    /* renamed from: w */
    public static final boolean f5966w;

    /* renamed from: z */
    public static final C1910jw f5967z = new C1910jw();

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.DefaultConstructorMarker, com.topjohnwu.magisk.core.model.MagiskJson] */
    static {
        ?? r1 = 0;
        boolean z = true;
        z = true;
        UpdateInfo updateInfo = new UpdateInfo(r1, z ? 1 : 0, r1);
        f5965v = updateInfo;
        f5956P = updateInfo;
        f5955N = new C1146VR(C0731Nj.f2476w);
        f5961W = AbstractC1292YB.m2695u(System.getenv("ZYGISK_ENABLED"), "1");
        f5960V = "";
        if (!AbstractC1292YB.m2695u(AbstractC0795Op.m1865p("ro.kernel.qemu"), "1") && !AbstractC1292YB.m2695u(AbstractC0795Op.m1865p("ro.boot.qemu"), "1")) {
            z = false;
        }
        f5966w = z;
        f5953I = new C1112Up(Boolean.FALSE);
    }

    /* renamed from: v */
    public static boolean m3542v() {
        if (m3543z().f1382N) {
            if (AbstractC0598LC.f1920h != 0) {
                C1212We c1212We = C1212We.f3969z;
                c1212We.getClass();
                InterfaceC0609LP interfaceC0609LP = C1212We.f3959h[20];
                if (C1212We.f3963r.m3734z(c1212We).intValue() == 2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public static final C0410Hm m3543z() {
        return (C0410Hm) f5955N.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0048 A[ORIG_RETURN, RETURN] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m3544h(p000a.C2640xk r5, p000a.InterfaceC1171Vv r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p000a.C0651MI
            if (r0 == 0) goto L13
            r0 = r6
            a.MI r0 = (p000a.C0651MI) r0
            int r1 = r0.f2094k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2094k = r1
            goto L18
        L13:
            a.MI r0 = new a.MI
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f2093I
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f2094k
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p000a.AbstractC1292YB.m2664UZ(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            p000a.AbstractC1292YB.m2664UZ(r6)
            com.topjohnwu.magisk.core.model.UpdateInfo r6 = p000a.C1910jw.f5956P
            com.topjohnwu.magisk.core.model.UpdateInfo r2 = p000a.C1910jw.f5965v
            if (r6 != r2) goto L49
            r0.f2094k = r3
            java.lang.Object r6 = r5.m4540P(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            com.topjohnwu.magisk.core.model.UpdateInfo r6 = (com.topjohnwu.magisk.core.model.UpdateInfo) r6
            if (r6 == 0) goto L48
            p000a.C1910jw.f5956P = r6
            goto L49
        L48:
            r6 = 0
        L49:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1910jw.m3544h(a.xk, a.Vv):java.lang.Object");
    }
}
