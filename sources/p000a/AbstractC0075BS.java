package p000a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: a.BS */
/* loaded from: classes.dex */
public abstract class AbstractC0075BS {
    /* renamed from: z */
    public static PackageInfo m158z(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
