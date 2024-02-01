package p000a;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: a.rU */
/* loaded from: classes.dex */
public abstract class AbstractC2310rU {
    /* renamed from: P */
    public static String m3969P(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    /* renamed from: h */
    public static int m3970h(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* renamed from: v */
    public static int m3971v(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    /* renamed from: z */
    public static <T> T m3972z(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }
}
