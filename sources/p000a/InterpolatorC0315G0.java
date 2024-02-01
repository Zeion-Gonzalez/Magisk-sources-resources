package p000a;

import android.view.animation.Interpolator;

/* renamed from: a.G0 */
/* loaded from: classes.dex */
public final class InterpolatorC0315G0 implements Interpolator {

    /* renamed from: z */
    public final /* synthetic */ int f1076z;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.f1076z) {
            case AbstractC0795Op.f2698E /* 0 */:
            default:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }
}
