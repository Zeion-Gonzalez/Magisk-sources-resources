package p000a;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.concurrent.Callable;

/* renamed from: a.lI */
/* loaded from: classes.dex */
public abstract class AbstractCallableC1983lI extends ContextWrapper implements Callable {

    /* renamed from: S */
    public static final /* synthetic */ int f6152S = 0;

    static {
        try {
            Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", String.class);
            ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class).setAccessible(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
