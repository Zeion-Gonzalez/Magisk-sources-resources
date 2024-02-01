package p000a;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: a.v8 */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC2503v8 implements View.OnApplyWindowInsetsListener {

    /* renamed from: h */
    public C2621xJ f7671h;

    /* renamed from: z */
    public final C1829iR f7672z;

    public ViewOnApplyWindowInsetsListenerC2503v8(View view, C1829iR c1829iR) {
        C2621xJ c2621xJ;
        this.f7672z = c1829iR;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        C2621xJ m4493z = AbstractC2609x6.m4493z(view);
        if (m4493z != null) {
            c2621xJ = new C2196pM(m4493z).m3817R();
        } else {
            c2621xJ = null;
        }
        this.f7671h = c2621xJ;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f7671h = C2621xJ.m4514o(view, windowInsets);
        } else {
            C2621xJ m4514o = C2621xJ.m4514o(view, windowInsets);
            if (this.f7671h == null) {
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                this.f7671h = AbstractC2609x6.m4493z(view);
            }
            if (this.f7671h == null) {
                this.f7671h = m4514o;
            } else {
                C1829iR m3872G = C2231q3.m3872G(view);
                if (m3872G != null && Objects.equals(m3872G.f5723z, windowInsets)) {
                    return C2231q3.m3875W(view, windowInsets);
                }
                C2621xJ c2621xJ = this.f7671h;
                int i = 0;
                for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                    if (!m4514o.m4520z(i2).equals(c2621xJ.m4520z(i2))) {
                        i |= i2;
                    }
                }
                if (i == 0) {
                    return C2231q3.m3875W(view, windowInsets);
                }
                C2621xJ c2621xJ2 = this.f7671h;
                if ((i & 8) != 0) {
                    if (m4514o.m4520z(8).f8591P > c2621xJ2.m4520z(8).f8591P) {
                        interpolator = C2231q3.f6876N;
                    } else {
                        interpolator = C2231q3.f6877Q;
                    }
                } else {
                    interpolator = C2231q3.f6878u;
                }
                C1482bt c1482bt = new C1482bt(i, interpolator, 160L);
                AbstractC1708g6 abstractC1708g6 = c1482bt.f4621z;
                abstractC1708g6.mo3216P(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(abstractC1708g6.mo3219z());
                C2739zj m4520z = m4514o.m4520z(i);
                C2739zj m4520z2 = c2621xJ2.m4520z(i);
                int min = Math.min(m4520z.f8594z, m4520z2.f8594z);
                int i3 = m4520z.f8592h;
                int i4 = m4520z2.f8592h;
                int min2 = Math.min(i3, i4);
                int i5 = m4520z.f8593v;
                int i6 = m4520z2.f8593v;
                int min3 = Math.min(i5, i6);
                int i7 = m4520z.f8591P;
                int i8 = i;
                int i9 = m4520z2.f8591P;
                C1624eZ c1624eZ = new C1624eZ(C2739zj.m4673h(min, min2, min3, Math.min(i7, i9)), 6, C2739zj.m4673h(Math.max(m4520z.f8594z, m4520z2.f8594z), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
                C2231q3.m3874Q(view, windowInsets, false);
                duration.addUpdateListener(new C1515cZ(c1482bt, m4514o, c2621xJ2, i8, view));
                duration.addListener(new C2729zW(1, this, c1482bt, view));
                ViewTreeObserverOnPreDrawListenerC0755O7.m1727z(view, new RunnableC2250qO(view, c1482bt, c1624eZ, duration));
                this.f7671h = m4514o;
                return C2231q3.m3875W(view, windowInsets);
            }
        }
        return C2231q3.m3875W(view, windowInsets);
    }
}
