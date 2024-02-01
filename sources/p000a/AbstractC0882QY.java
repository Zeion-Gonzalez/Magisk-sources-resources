package p000a;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: a.QY */
/* loaded from: classes.dex */
public abstract class AbstractC0882QY {

    /* renamed from: P */
    public static final boolean f3043P;

    /* renamed from: h */
    public static final Field f3044h;

    /* renamed from: v */
    public static final Field f3045v;

    /* renamed from: z */
    public static final Field f3046z;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f3046z = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f3044h = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f3045v = declaredField3;
            declaredField3.setAccessible(true);
            f3043P = true;
        } catch (ReflectiveOperationException e) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
        }
    }
}
