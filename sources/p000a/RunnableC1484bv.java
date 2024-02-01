package p000a;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: a.bv */
/* loaded from: classes.dex */
public final class RunnableC1484bv implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ Object f4623R;

    /* renamed from: S */
    public final /* synthetic */ int f4624S;

    public /* synthetic */ RunnableC1484bv(int i, Object obj) {
        this.f4624S = i;
        this.f4623R = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4624S;
        Object obj = this.f4623R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C0602LH c0602lh = (C0602LH) obj;
                int i2 = c0602lh.f1935J;
                ValueAnimator valueAnimator = c0602lh.f1945Y;
                if (i2 != 1) {
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    valueAnimator.cancel();
                }
                c0602lh.f1935J = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            default:
                ((StaggeredGridLayoutManager) obj).m4964Ry();
                return;
        }
    }
}
