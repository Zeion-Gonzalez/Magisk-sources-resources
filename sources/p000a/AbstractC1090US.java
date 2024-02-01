package p000a;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: a.US */
/* loaded from: classes.dex */
public abstract class AbstractC1090US {

    /* renamed from: z */
    public static final LinearInterpolator f3564z = new LinearInterpolator();

    /* renamed from: h */
    public static final C2174oz f3562h = new C2174oz();

    /* renamed from: v */
    public static final C1945kc f3563v = new C1945kc();

    /* renamed from: P */
    public static final C2121o1 f3561P = new C2121o1();

    /* renamed from: N */
    public static final DecelerateInterpolator f3560N = new DecelerateInterpolator();

    /* renamed from: h */
    public static int m2262h(int i, int i2, float f) {
        return Math.round(f * (i2 - i)) + i;
    }

    /* renamed from: z */
    public static float m2263z(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        if (f5 >= f4) {
            return f2;
        }
        return ((f2 - f) * ((f5 - f3) / (f4 - f3))) + f;
    }
}
