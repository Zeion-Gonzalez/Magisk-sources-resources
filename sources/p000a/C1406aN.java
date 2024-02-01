package p000a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: a.aN */
/* loaded from: classes.dex */
public final class C1406aN implements Application.ActivityLifecycleCallbacks {
    public static final C1689fl Companion = new C1689fl();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new C1406aN());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        int i = FragmentC0177DR.f544R;
        C1665fK.m3142G(activity, EnumC2241qF.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        int i = FragmentC0177DR.f544R;
        C1665fK.m3142G(activity, EnumC2241qF.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        int i = FragmentC0177DR.f544R;
        C1665fK.m3142G(activity, EnumC2241qF.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        int i = FragmentC0177DR.f544R;
        C1665fK.m3142G(activity, EnumC2241qF.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        int i = FragmentC0177DR.f544R;
        C1665fK.m3142G(activity, EnumC2241qF.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        int i = FragmentC0177DR.f544R;
        C1665fK.m3142G(activity, EnumC2241qF.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
