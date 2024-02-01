package p000a;

import android.util.SparseIntArray;
import com.topjohnwu.magisk.R;

/* renamed from: a.XZ */
/* loaded from: classes.dex */
public final class C1258XZ extends AbstractC2437tv {

    /* renamed from: d */
    public static final SparseIntArray f4080d;

    /* renamed from: i */
    public long f4081i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4080d = sparseIntArray;
        sparseIntArray.put(R.id.main_nav_host, 1);
        sparseIntArray.put(R.id.main_toolbar_wrapper, 2);
        sparseIntArray.put(R.id.main_toolbar, 3);
        sparseIntArray.put(R.id.main_navigation, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1258XZ(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = p000a.C1258XZ.f4080d
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.AbstractC2760z.m4814S(r6, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            androidx.fragment.app.FragmentContainerView r1 = (androidx.fragment.app.FragmentContainerView) r1
            r1 = 4
            r1 = r0[r1]
            com.topjohnwu.magisk.widget.ConcealableBottomNavigationView r1 = (com.topjohnwu.magisk.widget.ConcealableBottomNavigationView) r1
            r3 = 3
            r3 = r0[r3]
            com.google.android.material.appbar.MaterialToolbar r3 = (com.google.android.material.appbar.MaterialToolbar) r3
            r4 = 2
            r4 = r0[r4]
            com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
            r5.<init>(r2, r6, r1, r3)
            r3 = -1
            r5.f4081i = r3
            r1 = 0
            r0 = r0[r1]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r0.setTag(r2)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r6.setTag(r0, r5)
            r5.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1258XZ.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f4081i != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f4081i = 2L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        synchronized (this) {
            this.f4081i = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        C1016T3 c1016t3 = (C1016T3) obj;
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.f4081i |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (43 != i) {
            return false;
        }
        C1016T3 c1016t3 = (C1016T3) obj;
        return true;
    }
}
