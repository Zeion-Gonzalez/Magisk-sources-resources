package p000a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.topjohnwu.magisk.p001ui.surequest.SuRequestActivity;
import java.lang.ref.WeakReference;

/* renamed from: a.is */
/* loaded from: classes.dex */
public final class C1852is implements Application.ActivityLifecycleCallbacks {

    /* renamed from: z */
    public static final C1852is f5778z = new C1852is();

    /* renamed from: h */
    public static volatile WeakReference f5777h = new WeakReference(null);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity instanceof SuRequestActivity) {
            return;
        }
        f5777h.clear();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity instanceof SuRequestActivity) {
            return;
        }
        f5777h = new WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
