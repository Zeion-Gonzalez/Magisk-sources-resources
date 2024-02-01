package p000a;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* renamed from: a.xJ */
/* loaded from: classes.dex */
public final class C2621xJ {

    /* renamed from: h */
    public static final C2621xJ f8106h;

    /* renamed from: z */
    public final C2194pK f8107z;

    static {
        f8106h = Build.VERSION.SDK_INT >= 30 ? C2459uL.f7541q : C2194pK.f6751h;
    }

    public C2621xJ() {
        this.f8107z = new C2194pK(this);
    }

    /* renamed from: Q */
    public static C2739zj m4513Q(C2739zj c2739zj, int i, int i2, int i3, int i4) {
        int max = Math.max(0, c2739zj.f8594z - i);
        int max2 = Math.max(0, c2739zj.f8592h - i2);
        int max3 = Math.max(0, c2739zj.f8593v - i3);
        int max4 = Math.max(0, c2739zj.f8591P - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? c2739zj : C2739zj.m4673h(max, max2, max3, max4);
    }

    /* renamed from: o */
    public static C2621xJ m4514o(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C2621xJ c2621xJ = new C2621xJ(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            if (AbstractC1285Y3.m2633h(view)) {
                C2621xJ m4493z = AbstractC2609x6.m4493z(view);
                C2194pK c2194pK = c2621xJ.f8107z;
                c2194pK.mo3644I(m4493z);
                c2194pK.mo3645P(view.getRootView());
            }
        }
        return c2621xJ;
    }

    /* renamed from: N */
    public final int m4515N() {
        return this.f8107z.mo3643G().f8592h;
    }

    /* renamed from: P */
    public final int m4516P() {
        return this.f8107z.mo3643G().f8593v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2621xJ)) {
            return false;
        }
        return AbstractC1451bD.m2871z(this.f8107z, ((C2621xJ) obj).f8107z);
    }

    /* renamed from: h */
    public final int m4517h() {
        return this.f8107z.mo3643G().f8591P;
    }

    public final int hashCode() {
        C2194pK c2194pK = this.f8107z;
        if (c2194pK == null) {
            return 0;
        }
        return c2194pK.hashCode();
    }

    /* renamed from: u */
    public final WindowInsets m4518u() {
        C2194pK c2194pK = this.f8107z;
        if (c2194pK instanceof AbstractC2010lo) {
            return ((AbstractC2010lo) c2194pK).f6251v;
        }
        return null;
    }

    /* renamed from: v */
    public final int m4519v() {
        return this.f8107z.mo3643G().f8594z;
    }

    /* renamed from: z */
    public final C2739zj m4520z(int i) {
        return this.f8107z.mo3646Q(i);
    }

    public C2621xJ(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        this.f8107z = i >= 30 ? new C2459uL(this, windowInsets) : i >= 29 ? new C2718zJ(this, windowInsets) : i >= 28 ? new C2632xZ(this, windowInsets) : new C0452Ia(this, windowInsets);
    }
}
