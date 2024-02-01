package p000a;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: a.ds */
/* loaded from: classes.dex */
public abstract class AbstractC1586ds {

    /* renamed from: h */
    public static final boolean f4874h;

    /* renamed from: z */
    public static final Method f4875z;

    static {
        f4874h = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f4875z = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* renamed from: z */
    public static boolean m3062z(View view) {
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        if (AbstractC0095Bq.m199P(view) == 1) {
            return true;
        }
        return false;
    }
}
