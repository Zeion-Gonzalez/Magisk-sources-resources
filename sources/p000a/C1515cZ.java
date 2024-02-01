package p000a;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* renamed from: a.cZ */
/* loaded from: classes.dex */
public final class C1515cZ implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: N */
    public final /* synthetic */ View f4679N;

    /* renamed from: P */
    public final /* synthetic */ int f4680P;

    /* renamed from: h */
    public final /* synthetic */ C2621xJ f4681h;

    /* renamed from: v */
    public final /* synthetic */ C2621xJ f4682v;

    /* renamed from: z */
    public final /* synthetic */ C1482bt f4683z;

    public C1515cZ(C1482bt c1482bt, C2621xJ c2621xJ, C2621xJ c2621xJ2, int i, View view) {
        this.f4683z = c1482bt;
        this.f4681h = c2621xJ;
        this.f4682v = c2621xJ2;
        this.f4680P = i;
        this.f4679N = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C2739zj m4513Q;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C1482bt c1482bt = this.f4683z;
        c1482bt.f4621z.mo3216P(animatedFraction);
        float mo3217h = c1482bt.f4621z.mo3217h();
        PathInterpolator pathInterpolator = C2231q3.f6876N;
        C2621xJ c2621xJ = this.f4681h;
        C2196pM c2196pM = new C2196pM(c2621xJ);
        for (int i = 1; i <= 256; i <<= 1) {
            if ((this.f4680P & i) == 0) {
                m4513Q = c2621xJ.m4520z(i);
            } else {
                C2739zj m4520z = c2621xJ.m4520z(i);
                C2739zj m4520z2 = this.f4682v.m4520z(i);
                float f = 1.0f - mo3217h;
                m4513Q = C2621xJ.m4513Q(m4520z, (int) (((m4520z.f8594z - m4520z2.f8594z) * f) + 0.5d), (int) (((m4520z.f8592h - m4520z2.f8592h) * f) + 0.5d), (int) (((m4520z.f8593v - m4520z2.f8593v) * f) + 0.5d), (int) (((m4520z.f8591P - m4520z2.f8591P) * f) + 0.5d));
            }
            ((AbstractC1522cj) c2196pM.f6755R).mo2049v(i, m4513Q);
        }
        C2231q3.m3877u(this.f4679N, c2196pM.m3817R(), Collections.singletonList(c1482bt));
    }
}
