package p000a;

import android.app.Activity;

/* renamed from: a.aY */
/* loaded from: classes.dex */
public final class C1413aY extends AbstractC1896jh {
    final /* synthetic */ C0612LW this$0;

    public C1413aY(C0612LW c0612lw) {
        this.this$0 = c0612lw;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        this.this$0.m1355z();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        C0612LW c0612lw = this.this$0;
        int i = c0612lw.f1984S + 1;
        c0612lw.f1984S = i;
        if (i == 1 && c0612lw.f1982I) {
            c0612lw.f1986k.m721N(EnumC2241qF.ON_START);
            c0612lw.f1982I = false;
        }
    }
}
