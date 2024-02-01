package p000a;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.view.autofill.AutofillManager;
import java.lang.invoke.MethodHandles;

/* renamed from: a.v */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2494v {
    /* renamed from: H */
    public static /* synthetic */ Notification.Builder m4299H(Context context) {
        return new Notification.Builder(context, "update");
    }

    /* renamed from: J */
    public static /* synthetic */ NotificationChannel m4301J(String str) {
        return new NotificationChannel("progress", str, 2);
    }

    /* renamed from: Q */
    public static /* bridge */ /* synthetic */ AutofillManager m4305Q(Object obj) {
        return (AutofillManager) obj;
    }

    /* renamed from: S */
    public static /* synthetic */ void m4307S() {
    }

    /* renamed from: V */
    public static /* bridge */ /* synthetic */ MethodHandles.Lookup m4309V(Object obj) {
        return (MethodHandles.Lookup) obj;
    }

    /* renamed from: Y */
    public static /* synthetic */ Notification.Builder m4311Y(Context context) {
        return new Notification.Builder(context, "updated");
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ Class m4312c() {
        return MethodHandles.Lookup.class;
    }

    /* renamed from: e */
    public static /* synthetic */ NotificationChannel m4313e(String str) {
        return new NotificationChannel("updated", str, 4);
    }

    /* renamed from: h */
    public static /* synthetic */ Notification.Builder m4316h(Context context) {
        return new Notification.Builder(context, "progress");
    }

    /* renamed from: u */
    public static /* bridge */ /* synthetic */ Class m4322u() {
        return AutofillManager.class;
    }

    /* renamed from: v */
    public static /* synthetic */ NotificationChannel m4323v(String str) {
        return new NotificationChannel("update", str, 3);
    }
}
