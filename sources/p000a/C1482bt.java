package p000a;

import android.os.Build;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* renamed from: a.bt */
/* loaded from: classes.dex */
public final class C1482bt {

    /* renamed from: z */
    public final AbstractC1708g6 f4621z;

    public C1482bt(int i, Interpolator interpolator, long j) {
        this.f4621z = Build.VERSION.SDK_INT >= 30 ? new C2525vW(AbstractC0309Fu.m666V(i, interpolator, j)) : new C2231q3(i, interpolator, j);
    }

    public C1482bt(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4621z = new C2525vW(windowInsetsAnimation);
        }
    }
}
