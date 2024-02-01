package p000a;

import android.os.Bundle;

/* renamed from: a.Rt */
/* loaded from: classes.dex */
public final class C0952Rt implements Comparable {

    /* renamed from: I */
    public final int f3248I;

    /* renamed from: R */
    public final Bundle f3249R;

    /* renamed from: S */
    public final C1420ag f3250S;

    /* renamed from: k */
    public final int f3251k;

    /* renamed from: q */
    public final boolean f3252q;

    /* renamed from: w */
    public final boolean f3253w;

    public C0952Rt(C1420ag c1420ag, Bundle bundle, boolean z, int i, boolean z2, int i2) {
        this.f3250S = c1420ag;
        this.f3249R = bundle;
        this.f3253w = z;
        this.f3248I = i;
        this.f3252q = z2;
        this.f3251k = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: z */
    public final int compareTo(C0952Rt c0952Rt) {
        boolean z = c0952Rt.f3253w;
        boolean z2 = this.f3253w;
        if (z2 && !z) {
            return 1;
        }
        if (!z2 && z) {
            return -1;
        }
        int i = this.f3248I - c0952Rt.f3248I;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle = c0952Rt.f3249R;
        Bundle bundle2 = this.f3249R;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size() - bundle.size();
            if (size > 0) {
                return 1;
            }
            if (size < 0) {
                return -1;
            }
        }
        boolean z3 = c0952Rt.f3252q;
        boolean z4 = this.f3252q;
        if (z4 && !z3) {
            return 1;
        }
        if (z4 || !z3) {
            return this.f3251k - c0952Rt.f3251k;
        }
        return -1;
    }
}
