package p000a;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: a.Il */
/* loaded from: classes.dex */
public abstract class AbstractC0463Il {
    /* renamed from: h */
    public static Interpolator m1124h(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }

    /* renamed from: v */
    public static Interpolator m1125v(Path path) {
        return new PathInterpolator(path);
    }

    /* renamed from: z */
    public static Interpolator m1126z(float f, float f2) {
        return new PathInterpolator(f, f2);
    }
}
