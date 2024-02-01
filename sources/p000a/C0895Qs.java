package p000a;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: a.Qs */
/* loaded from: classes.dex */
public final class C0895Qs {

    /* renamed from: N */
    public PackageInfo f3078N;

    /* renamed from: P */
    public C2531vd f3079P;

    /* renamed from: h */
    public final C0468Ir f3080h;

    /* renamed from: v */
    public File f3081v;

    /* renamed from: z */
    public final PackageManager f3082z;

    public C0895Qs(PackageManager packageManager, C0468Ir c0468Ir) {
        this.f3082z = packageManager;
        this.f3080h = c0468Ir;
    }

    /* renamed from: h */
    public final Object m2046h(int i, int i2, InterfaceC1171Vv interfaceC1171Vv) {
        long j;
        C2531vd c2531vd;
        if (i2 > 0) {
            j = TimeUnit.MINUTES.toSeconds(i2) + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        } else {
            j = i2;
        }
        C2531vd c2531vd2 = this.f3079P;
        if (c2531vd2 == null) {
            c2531vd = null;
        } else {
            c2531vd = c2531vd2;
        }
        c2531vd.f7749h = i;
        if (c2531vd2 == null) {
            c2531vd2 = null;
        }
        c2531vd2.f7750v = j;
        Object m1021ZH = AbstractC0438II.m1021ZH(AbstractC0037Al.f178h, new C2118nx(this, j, null), interfaceC1171Vv);
        if (m1021ZH == EnumC0464Im.f1557S) {
            return m1021ZH;
        }
        return C0329GJ.f1115z;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x005b  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2047v(android.content.Intent r9, p000a.InterfaceC1171Vv r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p000a.C1701fz
            if (r0 == 0) goto L13
            r0 = r10
            a.fz r0 = (p000a.C1701fz) r0
            int r1 = r0.f5327g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5327g = r1
            goto L18
        L13:
            a.fz r0 = new a.fz
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f5329q
            a.Im r1 = p000a.EnumC0464Im.f1557S
            int r2 = r0.f5327g
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            p000a.AbstractC1292YB.m2664UZ(r10)
            goto La5
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            p000a.AbstractC1292YB.m2664UZ(r10)
            goto Lb3
        L3b:
            a.Qs r9 = r0.f5326I
            p000a.AbstractC1292YB.m2664UZ(r10)
            goto L50
        L41:
            p000a.AbstractC1292YB.m2664UZ(r10)
            r0.f5326I = r8
            r0.f5327g = r5
            java.lang.Object r10 = r8.m2048z(r9, r0)
            if (r10 != r1) goto L4f
            return r1
        L4f:
            r9 = r8
        L50:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L5b
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L5b:
            android.content.pm.PackageInfo r10 = r9.f3078N
            r2 = 0
            if (r10 == 0) goto L61
            goto L62
        L61:
            r10 = r2
        L62:
            java.lang.String r10 = r10.packageName
            java.lang.String r6 = "com.topjohnwu.magisk"
            boolean r10 = p000a.AbstractC1292YB.m2695u(r10, r6)
            if (r10 == 0) goto L7c
            java.lang.String r9 = "(pm uninstall com.topjohnwu.magisk >/dev/null 2>&1)&"
            java.lang.String[] r9 = new java.lang.String[]{r9}
            a.Gq r9 = p000a.AbstractC0017AI.m44z(r9)
            r9.mo781dx()
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L7c:
            a.We r10 = p000a.C1212We.f3969z
            r10.getClass()
            a.LP[] r6 = p000a.C1212We.f3959h
            r7 = 5
            r6 = r6[r7]
            a.Vg r7 = p000a.C1212We.f3945M
            java.lang.Object r10 = r7.m2368h(r10, r6)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r6 = 0
            if (r10 == r5) goto La8
            if (r10 == r4) goto L9a
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L9a:
            r0.f5326I = r2
            r0.f5327g = r3
            java.lang.Object r9 = r9.m2046h(r4, r6, r0)
            if (r9 != r1) goto La5
            return r1
        La5:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        La8:
            r0.f5326I = r2
            r0.f5327g = r4
            java.lang.Object r9 = r9.m2046h(r5, r6, r0)
            if (r9 != r1) goto Lb3
            return r1
        Lb3:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0895Qs.m2047v(android.content.Intent, a.Vv):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0032  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2048z(android.content.Intent r9, p000a.InterfaceC1171Vv r10) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0895Qs.m2048z(android.content.Intent, a.Vv):java.lang.Object");
    }
}
