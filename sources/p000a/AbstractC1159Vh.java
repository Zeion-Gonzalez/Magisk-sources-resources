package p000a;

import android.app.Activity;
import android.app.SharedElementCallback;

/* renamed from: a.Vh */
/* loaded from: classes.dex */
public abstract class AbstractC1159Vh {
    /* renamed from: h */
    public static void m2371h(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }

    /* renamed from: v */
    public static boolean m2372v(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    /* renamed from: z */
    public static void m2373z(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }
}
