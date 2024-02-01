package p000a;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* renamed from: a.EU */
/* loaded from: classes.dex */
public abstract class AbstractC0236EU {
    /* renamed from: h */
    public static void m482h(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    /* renamed from: v */
    public static void m483v(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: z */
    public static void m484z(Activity activity) {
        activity.finishAffinity();
    }
}
