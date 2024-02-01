package p000a;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.ga */
/* loaded from: classes.dex */
public final class C1730ga {

    /* renamed from: P */
    public int f5452P = -1;

    /* renamed from: Q */
    public boolean f5453Q = false;

    /* renamed from: u */
    public int f5455u = 0;

    /* renamed from: z */
    public int f5457z = 0;

    /* renamed from: h */
    public int f5454h = 0;

    /* renamed from: v */
    public int f5456v = Integer.MIN_VALUE;

    /* renamed from: N */
    public Interpolator f5451N = null;

    /* renamed from: z */
    public final void m3264z(RecyclerView recyclerView) {
        int i = this.f5452P;
        if (i >= 0) {
            this.f5452P = -1;
            recyclerView.m4949x(i);
            this.f5453Q = false;
            return;
        }
        if (this.f5453Q) {
            Interpolator interpolator = this.f5451N;
            if (interpolator != null && this.f5456v < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.f5456v;
            if (i2 >= 1) {
                recyclerView.f9084Pm.m1638v(this.f5457z, this.f5454h, i2, interpolator);
                int i3 = this.f5455u + 1;
                this.f5455u = i3;
                if (i3 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f5453Q = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        this.f5455u = 0;
    }
}
