package p000a;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: a.Iw */
/* loaded from: classes.dex */
public abstract class AbstractC0473Iw {

    /* renamed from: z */
    public static final Method f1578z;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f1578z = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: z */
    public static String m1143z(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AbstractC2668yJ.m4571v(AbstractC2668yJ.m4572z(AbstractC2668yJ.m4570h(locale)));
        }
        try {
            return AbstractC0750O2.m1724z((Locale) f1578z.invoke(null, locale));
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
            return AbstractC0750O2.m1724z(locale);
        }
    }
}
