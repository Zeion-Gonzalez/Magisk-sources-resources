package p000a;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: a.Ud */
/* loaded from: classes.dex */
public final class C1100Ud extends C2593wr {

    /* renamed from: k */
    public final /* synthetic */ Object f3585k;

    /* renamed from: q */
    public final /* synthetic */ int f3586q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1100Ud(Object obj, Context context, int i) {
        super(context);
        this.f3586q = i;
        this.f3585k = obj;
    }

    @Override // p000a.C2593wr
    /* renamed from: N */
    public final int mo2268N(int i) {
        switch (this.f3586q) {
            case AbstractC0795Op.f2698E /* 0 */:
                return Math.min(100, super.mo2268N(i));
            default:
                return super.mo2268N(i);
        }
    }

    @Override // p000a.C2593wr
    /* renamed from: P */
    public final float mo2269P(DisplayMetrics displayMetrics) {
        int i;
        switch (this.f3586q) {
            case AbstractC0795Op.f2698E /* 0 */:
                i = displayMetrics.densityDpi;
                break;
            case 1:
            default:
                return 25.0f / displayMetrics.densityDpi;
            case 2:
                i = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / i;
    }

    @Override // p000a.C2593wr
    /* renamed from: Q */
    public final PointF mo2270Q(int i) {
        switch (this.f3586q) {
            case 1:
                ((CarouselLayoutManager) this.f3585k).getClass();
                return null;
            default:
                return super.mo2270Q(i);
        }
    }

    @Override // p000a.C2593wr
    /* renamed from: h */
    public final int mo2271h(View view, int i) {
        switch (this.f3586q) {
            case 1:
                ((CarouselLayoutManager) this.f3585k).getClass();
                return 0;
            default:
                return super.mo2271h(view, i);
        }
    }

    @Override // p000a.C2593wr
    /* renamed from: o */
    public final void mo2272o(View view, C0496JN c0496jn, C1730ga c1730ga) {
        switch (this.f3586q) {
            case AbstractC0795Op.f2698E /* 0 */:
                C2613xA c2613xA = (C2613xA) this.f3585k;
                int[] mo1408P = c2613xA.mo1408P(((RecyclerView) c2613xA.f2047z).f9077J, view);
                int i = mo1408P[0];
                int i2 = mo1408P[1];
                int ceil = (int) Math.ceil(mo2268N(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f7952G;
                    c1730ga.f5457z = i;
                    c1730ga.f5454h = i2;
                    c1730ga.f5456v = ceil;
                    c1730ga.f5451N = decelerateInterpolator;
                    c1730ga.f5453Q = true;
                    return;
                }
                return;
            default:
                super.mo2272o(view, c0496jn, c1730ga);
                return;
        }
    }

    @Override // p000a.C2593wr
    /* renamed from: v */
    public final int mo2273v(View view, int i) {
        switch (this.f3586q) {
            case 1:
                ((CarouselLayoutManager) this.f3585k).getClass();
                return 0;
            default:
                return super.mo2273v(view, i);
        }
    }
}
