package p000a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: a.uK */
/* loaded from: classes.dex */
public abstract class AbstractC2458uK {
    /* renamed from: h */
    public static void m4239h(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    /* renamed from: z */
    public static void m4240z(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
    }
}
