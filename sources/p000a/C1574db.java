package p000a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: a.db */
/* loaded from: classes.dex */
public final class C1574db implements Application.ActivityLifecycleCallbacks {

    /* renamed from: h */
    public Activity f4846h;

    /* renamed from: v */
    public final int f4847v;

    /* renamed from: z */
    public Object f4848z;

    /* renamed from: P */
    public boolean f4844P = false;

    /* renamed from: N */
    public boolean f4843N = false;

    /* renamed from: Q */
    public boolean f4845Q = false;

    public C1574db(Activity activity) {
        this.f4846h = activity;
        this.f4847v = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4846h == activity) {
            this.f4846h = null;
            this.f4843N = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityPaused(android.app.Activity r6) {
        /*
            r5 = this;
            boolean r0 = r5.f4843N
            if (r0 == 0) goto L43
            boolean r0 = r5.f4845Q
            if (r0 != 0) goto L43
            boolean r0 = r5.f4844P
            if (r0 != 0) goto L43
            java.lang.Object r0 = r5.f4848z
            r1 = 1
            java.lang.reflect.Field r2 = p000a.AbstractC0091Bl.f346v     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.Throwable -> L33
            if (r2 != r0) goto L3b
            int r0 = r6.hashCode()     // Catch: java.lang.Throwable -> L33
            int r3 = r5.f4847v
            if (r0 == r3) goto L20
            goto L3b
        L20:
            java.lang.reflect.Field r0 = p000a.AbstractC0091Bl.f344h     // Catch: java.lang.Throwable -> L33
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L33
            android.os.Handler r0 = p000a.AbstractC0091Bl.f345u     // Catch: java.lang.Throwable -> L33
            a.Zz r3 = new a.Zz     // Catch: java.lang.Throwable -> L33
            r4 = 3
            r3.<init>(r6, r2, r4)     // Catch: java.lang.Throwable -> L33
            r0.postAtFrontOfQueue(r3)     // Catch: java.lang.Throwable -> L33
            r6 = r1
            goto L3c
        L33:
            r6 = move-exception
            java.lang.String r0 = "ActivityRecreator"
            java.lang.String r2 = "Exception while fetching field values"
            android.util.Log.e(r0, r2, r6)
        L3b:
            r6 = 0
        L3c:
            if (r6 == 0) goto L43
            r5.f4845Q = r1
            r6 = 0
            r5.f4848z = r6
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1574db.onActivityPaused(android.app.Activity):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f4846h == activity) {
            this.f4844P = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
