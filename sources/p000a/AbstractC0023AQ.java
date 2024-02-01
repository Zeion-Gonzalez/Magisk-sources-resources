package p000a;

import android.app.Activity;
import android.content.Intent;

/* renamed from: a.AQ */
/* loaded from: classes.dex */
public abstract class AbstractC0023AQ {
    /* renamed from: h */
    public static boolean m54h(Activity activity, Intent intent) {
        return activity.navigateUpTo(intent);
    }

    /* renamed from: v */
    public static boolean m55v(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }

    /* renamed from: z */
    public static Intent m56z(Activity activity) {
        return activity.getParentActivityIntent();
    }
}
