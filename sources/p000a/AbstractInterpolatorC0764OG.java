package p000a;

import android.view.animation.Interpolator;

/* renamed from: a.OG */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC0764OG implements Interpolator {

    /* renamed from: h */
    public final float f2593h;

    /* renamed from: z */
    public final float[] f2594z;

    public AbstractInterpolatorC0764OG(float[] fArr) {
        this.f2594z = fArr;
        this.f2593h = 1.0f / ((float) (fArr.length - 1));
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f2594z;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f2593h;
        float f3 = (f - (min * f2)) / f2;
        float f4 = fArr[min];
        return ((fArr[min + 1] - f4) * f3) + f4;
    }
}
