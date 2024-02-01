package p000a;

import android.view.animation.Interpolator;

/* renamed from: a.g6 */
/* loaded from: classes.dex */
public abstract class AbstractC1708g6 {

    /* renamed from: P */
    public final long f5372P;

    /* renamed from: h */
    public float f5373h;

    /* renamed from: v */
    public final Interpolator f5374v;

    /* renamed from: z */
    public final int f5375z;

    public AbstractC1708g6(int i, Interpolator interpolator, long j) {
        this.f5375z = i;
        this.f5374v = interpolator;
        this.f5372P = j;
    }

    /* renamed from: P */
    public void mo3216P(float f) {
        this.f5373h = f;
    }

    /* renamed from: h */
    public float mo3217h() {
        Interpolator interpolator = this.f5374v;
        return interpolator != null ? interpolator.getInterpolation(this.f5373h) : this.f5373h;
    }

    /* renamed from: v */
    public int mo3218v() {
        return this.f5375z;
    }

    /* renamed from: z */
    public long mo3219z() {
        return this.f5372P;
    }
}
