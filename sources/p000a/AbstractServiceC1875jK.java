package p000a;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: a.jK */
/* loaded from: classes.dex */
public abstract class AbstractServiceC1875jK extends Service {
    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        AbstractC0756O8.m1729v(context);
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }
}
