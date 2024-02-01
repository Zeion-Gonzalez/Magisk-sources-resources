package p000a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* renamed from: a.ls */
/* loaded from: classes.dex */
public abstract class AbstractC2013ls {
    private static volatile Choreographer choreographer;

    static {
        Object c1019t6;
        try {
            c1019t6 = new C1557dI(m3653z(Looper.getMainLooper()));
        } catch (Throwable th) {
            c1019t6 = new C1019T6(th);
        }
        if (c1019t6 instanceof C1019T6) {
            c1019t6 = null;
        }
        C1557dI c1557dI = (C1557dI) c1019t6;
    }

    /* renamed from: z */
    public static final Handler m3653z(Looper looper) {
        Object newInstance;
        if (Build.VERSION.SDK_INT >= 28) {
            newInstance = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        } else {
            try {
                newInstance = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return (Handler) newInstance;
    }
}
