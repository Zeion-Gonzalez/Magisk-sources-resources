package p000a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: a.d1 */
/* loaded from: classes.dex */
public abstract class AbstractC1540d1 {
    /* renamed from: h */
    public static Drawable m2985h(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0079, code lost:
    
        if (r0 >= 26) goto L147;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x007c  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.drawable.Icon m2986v(androidx.core.graphics.drawable.IconCompat r5, android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC1540d1.m2986v(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
    }

    /* renamed from: z */
    public static Uri m2987z(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0371H5.m856P(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }
}
