package p000a;

import android.content.Context;

/* renamed from: a.Zj */
/* loaded from: classes.dex */
public abstract class AbstractC1375Zj {
    /* renamed from: h */
    public static <T> T m2770h(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* renamed from: v */
    public static String m2771v(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }

    /* renamed from: z */
    public static int m2772z(Context context, int i) {
        return context.getColor(i);
    }
}
