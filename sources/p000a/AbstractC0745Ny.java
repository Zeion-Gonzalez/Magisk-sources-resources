package p000a;

import android.graphics.drawable.Drawable;

/* renamed from: a.Ny */
/* loaded from: classes.dex */
public abstract class AbstractC0745Ny extends Drawable {

    /* renamed from: z */
    public static final double f2549z = Math.cos(Math.toRadians(45.0d));

    /* renamed from: h */
    public static float m1720h(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (!z) {
            return f3;
        }
        return (float) (((1.0d - f2549z) * f2) + f3);
    }

    /* renamed from: z */
    public static float m1721z(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - f2549z) * f2) + f);
    }
}
