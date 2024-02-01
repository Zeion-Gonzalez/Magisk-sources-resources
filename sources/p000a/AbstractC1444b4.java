package p000a;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: a.b4 */
/* loaded from: classes.dex */
public abstract class AbstractC1444b4 {

    /* renamed from: z */
    public static final Method f4519z;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f4519z = method;
    }
}
