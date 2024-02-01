package p000a;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.IBinder;
import java.lang.reflect.Method;

/* renamed from: a.Vp */
/* loaded from: classes.dex */
public abstract class AbstractC1166Vp {

    /* renamed from: P */
    public static final int f3794P;

    /* renamed from: h */
    public static final Method f3795h;

    /* renamed from: v */
    public static final Method f3796v;

    /* renamed from: z */
    public static final Method f3797z;

    static {
        int i = Build.VERSION.SDK_INT;
        f3794P = i >= 26 ? 4194304 : 0;
        try {
            Class<?> cls = Class.forName("android.os.ServiceManager");
            if (i >= 28) {
                try {
                    f3797z = cls.getDeclaredMethod("addService", String.class, IBinder.class, Boolean.TYPE, Integer.TYPE);
                } catch (NoSuchMethodException unused) {
                }
            }
            if (f3797z == null) {
                f3797z = cls.getDeclaredMethod("addService", String.class, IBinder.class);
            }
            Method declaredMethod = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
            f3795h = declaredMethod;
            declaredMethod.setAccessible(true);
            f3796v = Class.forName("android.ddm.DdmHandleAppName").getDeclaredMethod("setAppName", String.class, Integer.TYPE);
        } catch (ReflectiveOperationException e) {
            AbstractC1292YB.m2644E("IPC", e);
        }
    }

    /* renamed from: z */
    public static void m2382z(String str, IBinder iBinder) {
        try {
            Method method = f3797z;
            if (method.getParameterTypes().length == 4) {
                method.invoke(null, str, iBinder, Boolean.FALSE, 0);
            } else {
                method.invoke(null, str, iBinder);
            }
        } catch (ReflectiveOperationException e) {
            AbstractC1292YB.m2644E("IPC", e);
        }
    }
}
