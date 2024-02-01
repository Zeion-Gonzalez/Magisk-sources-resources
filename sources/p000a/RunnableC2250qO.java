package p000a;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: a.qO */
/* loaded from: classes.dex */
public final class RunnableC2250qO implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ C1624eZ f6917R;

    /* renamed from: S */
    public final /* synthetic */ View f6918S;

    /* renamed from: w */
    public final /* synthetic */ ValueAnimator f6919w;

    public RunnableC2250qO(View view, C1482bt c1482bt, C1624eZ c1624eZ, ValueAnimator valueAnimator) {
        this.f6918S = view;
        this.f6917R = c1624eZ;
        this.f6919w = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2231q3.m3876o(this.f6918S, this.f6917R);
        this.f6919w.start();
    }
}
