package p000a;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: a.vI */
/* loaded from: classes.dex */
public abstract class AbstractC2513vI {
    /* renamed from: h */
    public static String m4352h(Context context) {
        return context.getOpPackageName();
    }

    /* renamed from: v */
    public static AppOpsManager m4353v(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    /* renamed from: z */
    public static int m4354z(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }
}
