package p000a;

import android.content.BroadcastReceiver;

/* renamed from: a.hB */
/* loaded from: classes.dex */
public final class C1766hB extends BroadcastReceiver {

    /* renamed from: h */
    public final /* synthetic */ Object f5561h;

    /* renamed from: z */
    public final /* synthetic */ int f5562z;

    public /* synthetic */ C1766hB(int i, Object obj) {
        this.f5562z = i;
        this.f5561h = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0046  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            int r9 = r7.f5562z
            java.lang.Object r0 = r7.f5561h
            switch(r9) {
                case 0: goto L14;
                case 1: goto L8;
                default: goto L7;
            }
        L7:
            goto L1a
        L8:
            r1 = r0
            android.content.IntentSender r1 = (android.content.IntentSender) r1     // Catch: android.content.IntentSender.SendIntentException -> L13
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r8
            r1.sendIntent(r2, r3, r4, r5, r6)     // Catch: android.content.IntentSender.SendIntentException -> L13
        L13:
            return
        L14:
            a.EK r0 = (p000a.AbstractC0227EK) r0
            r0.mo437M()
            return
        L1a:
            java.lang.Object r9 = p000a.AbstractC0865QC.f2950z
            java.lang.Class<android.os.PowerManager> r9 = android.os.PowerManager.class
            java.lang.Object r9 = p000a.AbstractC1375Zj.m2770h(r8, r9)
            android.os.PowerManager r9 = (android.os.PowerManager) r9
            r1 = 0
            if (r9 != 0) goto L28
            goto L38
        L28:
            java.lang.String r8 = r8.getPackageName()
            boolean r8 = r9.isIgnoringBatteryOptimizations(r8)
            boolean r9 = r9.isDeviceIdleMode()
            if (r9 == 0) goto L3a
            if (r8 != 0) goto L3a
        L38:
            r8 = 1
            goto L3b
        L3a:
            r8 = r1
        L3b:
            com.topjohnwu.magisk.core.utils.NetworkObserver r0 = (com.topjohnwu.magisk.core.utils.NetworkObserver) r0
            if (r8 == 0) goto L46
            r0.getClass()
            com.topjohnwu.magisk.core.utils.NetworkObserver.m5132W(r1)
            goto L49
        L46:
            r0.m5133o()
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1766hB.onReceive(android.content.Context, android.content.Intent):void");
    }
}
