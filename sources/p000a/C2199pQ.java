package p000a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: a.pQ */
/* loaded from: classes.dex */
public final class C2199pQ extends AbstractC2703z2 {

    /* renamed from: I */
    public volatile Handler f6763I;

    /* renamed from: R */
    public final Object f6764R;

    /* renamed from: w */
    public final ExecutorService f6765w;

    public C2199pQ() {
        super(1);
        this.f6764R = new Object();
        this.f6765w = Executors.newFixedThreadPool(4, new ThreadFactoryC1261Xd());
    }

    /* renamed from: O4 */
    public static Handler m3827O4(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC1244XD.m2554z(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    /* renamed from: d3 */
    public final boolean m3828d3() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: nB */
    public final void m3829nB(Runnable runnable) {
        this.f6765w.execute(runnable);
    }

    /* renamed from: yF */
    public final void m3830yF(Runnable runnable) {
        if (this.f6763I == null) {
            synchronized (this.f6764R) {
                if (this.f6763I == null) {
                    this.f6763I = m3827O4(Looper.getMainLooper());
                }
            }
        }
        this.f6763I.post(runnable);
    }
}
