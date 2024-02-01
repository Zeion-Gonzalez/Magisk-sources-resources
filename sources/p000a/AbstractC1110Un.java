package p000a;

import android.os.Handler;
import android.os.Looper;

/* renamed from: a.Un */
/* loaded from: classes.dex */
public abstract class AbstractC1110Un {

    /* renamed from: z */
    public static final Handler f3614z = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    public static final ExecutorC0051B0 f3613h = new ExecutorC0051B0(3);

    /* renamed from: z */
    public static void m2289z(Runnable runnable) {
        if (AbstractC1292YB.m2640B()) {
            runnable.run();
        } else {
            f3614z.post(runnable);
        }
    }
}
