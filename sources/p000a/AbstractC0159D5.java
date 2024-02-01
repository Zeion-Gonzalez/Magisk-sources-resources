package p000a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: a.D5 */
/* loaded from: classes.dex */
public abstract class AbstractC0159D5 {
    /* renamed from: z */
    public static PendingIntent m323z(Context context, int i, Intent[] intentArr, int i2, Bundle bundle) {
        return PendingIntent.getActivities(context, i, intentArr, i2, bundle);
    }
}
