package p000a;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;

/* renamed from: a.k1 */
/* loaded from: classes.dex */
public final class C1915k1 extends AbstractC2150oY {

    /* renamed from: O */
    public static final SparseIntArray f5974O;

    /* renamed from: d */
    public long f5975d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5974O = sparseIntArray;
        sparseIntArray.put(R.id.snackbar_container, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1915k1(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = p000a.C1915k1.f5974O
            r1 = 3
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.AbstractC2760z.m4814S(r6, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r3 = 2
            r3 = r0[r3]
            androidx.coordinatorlayout.widget.CoordinatorLayout r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r3
            r5.<init>(r2, r6, r1, r3)
            r3 = -1
            r5.f5975d = r3
            r1 = 0
            r0 = r0[r1]
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0.setTag(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r5.f6614j
            r0.setTag(r2)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r6.setTag(r0, r5)
            r5.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1915k1.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f5975d != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f5975d = 2L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        SparseArray sparseArray;
        ArrayList arrayList;
        synchronized (this) {
            j = this.f5975d;
            this.f5975d = 0L;
        }
        C0316G1 c0316g1 = this.f6613i;
        long j2 = j & 3;
        if (j2 != 0 && c0316g1 != null) {
            sparseArray = c0316g1.f1077g;
            arrayList = c0316g1.f1078k;
        } else {
            sparseArray = null;
            arrayList = null;
        }
        if (j2 != 0) {
            AbstractC0795Op.m1846dx(this.f6614j, arrayList, sparseArray);
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        C0316G1 c0316g1 = (C0316G1) obj;
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.f5975d |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (43 != i) {
            return false;
        }
        C0316G1 c0316g1 = (C0316G1) obj;
        m4818g(0, c0316g1);
        this.f6613i = c0316g1;
        synchronized (this) {
            this.f5975d |= 1;
        }
        m2861Q(43);
        m4816I();
        return true;
    }
}
