package com.topjohnwu.magisk.core;

import android.app.job.JobParameters;
import p000a.AbstractC0037Al;
import p000a.AbstractC0438II;
import p000a.AbstractC1843ih;
import p000a.AbstractJobServiceC1352ZJ;
import p000a.C1886jW;
import p000a.C2283r0;
import p000a.ExecutorC0094Bp;

/* loaded from: classes.dex */
public final class JobService extends AbstractJobServiceC1352ZJ {

    /* renamed from: R */
    public static final /* synthetic */ int f9564R = 0;

    /* renamed from: S */
    public final C1886jW f9565S = new C1886jW(null);

    /* JADX WARN: Removed duplicated region for block: B:45:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0047  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m5125z(com.topjohnwu.magisk.core.JobService r5, p000a.InterfaceC1171Vv r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof p000a.C2205pX
            if (r0 == 0) goto L16
            r0 = r6
            a.pX r0 = (p000a.C2205pX) r0
            int r1 = r0.f6777k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f6777k = r1
            goto L1b
        L16:
            a.pX r0 = new a.pX
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r5 = r0.f6776I
            a.Im r6 = p000a.EnumC0464Im.f1557S
            int r1 = r0.f6777k
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            p000a.AbstractC1292YB.m2664UZ(r5)
            goto L43
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            p000a.AbstractC1292YB.m2664UZ(r5)
            a.xk r5 = p000a.AbstractC1743gn.m3274v()
            r0.f6777k = r2
            java.lang.Object r5 = r5.m4540P(r0)
            if (r5 != r6) goto L43
            goto Lca
        L43:
            com.topjohnwu.magisk.core.model.UpdateInfo r5 = (com.topjohnwu.magisk.core.model.UpdateInfo) r5
            if (r5 == 0) goto Lc8
            p000a.C1910jw.f5956P = r5
            a.Hm r6 = p000a.C1910jw.m3543z()
            boolean r6 = r6.f1382N
            if (r6 == 0) goto Lc8
            com.topjohnwu.magisk.core.model.MagiskJson r5 = r5.f9587z
            int r5 = r5.f9573R
            r6 = 26400(0x6720, float:3.6994E-41)
            if (r6 >= r5) goto Lc8
            a.VR r5 = p000a.AbstractC0392HR.f1320z
            android.content.Context r5 = p000a.AbstractC1743gn.m3275z()
            int r6 = com.topjohnwu.magisk.core.download.DownloadService.f9570q
            a.xo r6 = new a.xo
            r6.<init>()
            android.content.Intent r6 = p000a.C1219Wm.m2510N(r5, r6)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L75
            android.app.PendingIntent r6 = p000a.AbstractC2494v.m4304P(r5, r6)
            goto L7b
        L75:
            r3 = 1275068416(0x4c000000, float:3.3554432E7)
            android.app.PendingIntent r6 = android.app.PendingIntent.getService(r5, r2, r6, r3)
        L7b:
            r3 = 2131230988(0x7f08010c, float:1.8078044E38)
            android.graphics.Bitmap r4 = p000a.AbstractC0795Op.m1848f(r5, r3)
            if (r0 < r1) goto L91
            android.app.Notification$Builder r0 = p000a.AbstractC2494v.m4299H(r5)
            android.graphics.drawable.Icon r1 = android.graphics.drawable.Icon.createWithBitmap(r4)
            android.app.Notification$Builder r0 = r0.setSmallIcon(r1)
            goto L9a
        L91:
            android.app.Notification$Builder r0 = new android.app.Notification$Builder
            r0.<init>(r5)
            android.app.Notification$Builder r0 = r0.setSmallIcon(r3)
        L9a:
            android.app.Notification$Builder r0 = r0.setLargeIcon(r4)
            r1 = 2131886212(0x7f120084, float:1.9406996E38)
            java.lang.String r1 = r5.getString(r1)
            android.app.Notification$Builder r0 = r0.setContentTitle(r1)
            r1 = 2131886213(0x7f120085, float:1.9406998E38)
            java.lang.String r5 = r5.getString(r1)
            android.app.Notification$Builder r5 = r0.setContentText(r5)
            android.app.Notification$Builder r5 = r5.setAutoCancel(r2)
            android.app.Notification$Builder r5 = r5.setContentIntent(r6)
            android.app.NotificationManager r6 = p000a.AbstractC0392HR.m886z()
            r0 = 5
            android.app.Notification r5 = r5.build()
            r6.notify(r0, r5)
        Lc8:
            a.GJ r6 = p000a.C0329GJ.f1115z
        Lca:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topjohnwu.magisk.core.JobService.m5125z(com.topjohnwu.magisk.core.JobService, a.Vv):java.lang.Object");
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        ExecutorC0094Bp executorC0094Bp = AbstractC0037Al.f178h;
        C1886jW c1886jW = this.f9565S;
        executorC0094Bp.getClass();
        AbstractC0438II.m994F(AbstractC1843ih.m3468z(AbstractC0438II.m1002L(executorC0094Bp, c1886jW)), null, new C2283r0(this, jobParameters, null), 3);
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        this.f9565S.mo1719z(null);
        return false;
    }
}
