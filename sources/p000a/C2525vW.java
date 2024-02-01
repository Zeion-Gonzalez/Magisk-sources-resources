package p000a;

import android.view.WindowInsetsAnimation;

/* renamed from: a.vW */
/* loaded from: classes.dex */
public final class C2525vW extends AbstractC1708g6 {

    /* renamed from: N */
    public final WindowInsetsAnimation f7734N;

    public C2525vW(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f7734N = windowInsetsAnimation;
    }

    @Override // p000a.AbstractC1708g6
    /* renamed from: P */
    public final void mo3216P(float f) {
        this.f7734N.setFraction(f);
    }

    @Override // p000a.AbstractC1708g6
    /* renamed from: h */
    public final float mo3217h() {
        float interpolatedFraction;
        interpolatedFraction = this.f7734N.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // p000a.AbstractC1708g6
    /* renamed from: v */
    public final int mo3218v() {
        int typeMask;
        typeMask = this.f7734N.getTypeMask();
        return typeMask;
    }

    @Override // p000a.AbstractC1708g6
    /* renamed from: z */
    public final long mo3219z() {
        long durationMillis;
        durationMillis = this.f7734N.getDurationMillis();
        return durationMillis;
    }
}
