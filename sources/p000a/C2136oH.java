package p000a;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* renamed from: a.oH */
/* loaded from: classes.dex */
public final class C2136oH extends AbstractC1896jh {
    final /* synthetic */ C0612LW this$0;

    public C2136oH(C0612LW c0612lw) {
        this.this$0 = c0612lw;
    }

    @Override // p000a.AbstractC1896jh, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC0177DR.f544R;
            ((FragmentC0177DR) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f545S = this.this$0.f1989y;
        }
    }

    @Override // p000a.AbstractC1896jh, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C0612LW c0612lw = this.this$0;
        int i = c0612lw.f1983R - 1;
        c0612lw.f1983R = i;
        if (i == 0) {
            c0612lw.f1987q.postDelayed(c0612lw.f1985g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC0111C9.m233z(activity, new C1413aY(this.this$0));
    }

    @Override // p000a.AbstractC1896jh, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C0612LW c0612lw = this.this$0;
        int i = c0612lw.f1984S - 1;
        c0612lw.f1984S = i;
        if (i == 0 && c0612lw.f1988w) {
            c0612lw.f1986k.m721N(EnumC2241qF.ON_STOP);
            c0612lw.f1982I = true;
        }
    }
}
