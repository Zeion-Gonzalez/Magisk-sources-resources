package p000a;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.topjohnwu.magisk.R;

/* renamed from: a.oB */
/* loaded from: classes.dex */
public final class C2130oB extends AbstractC0255Et {

    /* renamed from: T */
    public static final C1174Vy f6563T;

    /* renamed from: t */
    public static final SparseIntArray f6564t;

    /* renamed from: O */
    public final FrameLayout f6565O;

    /* renamed from: d */
    public final ProgressBar f6566d;

    /* renamed from: n */
    public final AbstractC2710zA f6567n;

    /* renamed from: x */
    public long f6568x;

    static {
        C1174Vy c1174Vy = new C1174Vy(6);
        f6563T = c1174Vy;
        c1174Vy.m2398g(3, new int[]{4}, new int[]{R.layout.item_text}, new String[]{"item_text"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6564t = sparseIntArray;
        sparseIntArray.put(R.id.snackbar_container, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2130oB(android.view.View r5) {
        /*
            r4 = this;
            a.Vy r0 = p000a.C2130oB.f6563T
            android.util.SparseIntArray r1 = p000a.C2130oB.f6564t
            r2 = 6
            java.lang.Object[] r0 = androidx.databinding.AbstractC2760z.m4814S(r5, r2, r0, r1)
            r1 = 1
            r1 = r0[r1]
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r2 = 5
            r2 = r0[r2]
            androidx.coordinatorlayout.widget.CoordinatorLayout r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r2
            r3 = 0
            r4.<init>(r3, r5, r1, r2)
            r1 = -1
            r4.f6568x = r1
            androidx.recyclerview.widget.RecyclerView r1 = r4.f911j
            r1.setTag(r3)
            r1 = 0
            r1 = r0[r1]
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r1.setTag(r3)
            r1 = 2
            r1 = r0[r1]
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r4.f6566d = r1
            r1.setTag(r3)
            r1 = 3
            r1 = r0[r1]
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r4.f6565O = r1
            r1.setTag(r3)
            r1 = 4
            r0 = r0[r1]
            a.zA r0 = (p000a.AbstractC2710zA) r0
            r4.f6567n = r0
            if (r0 == 0) goto L47
            r0.f8980f = r4
        L47:
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r5.setTag(r0, r4)
            r4.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2130oB.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            if (this.f6568x != 0) {
                return true;
            }
            return this.f6567n.mo13G();
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f6568x = 4L;
        }
        this.f6567n.mo14M();
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        SparseArray sparseArray;
        C1851ir c1851ir;
        boolean z;
        boolean z2;
        boolean z3;
        synchronized (this) {
            j = this.f6568x;
            this.f6568x = 0L;
        }
        C1688fk c1688fk = this.f910i;
        long j2 = j & 7;
        C1517cb c1517cb = null;
        if (j2 != 0) {
            if (c1688fk != null) {
                z = c1688fk.f5294y;
            } else {
                z = false;
            }
            if (j2 != 0) {
                if (z) {
                    j |= 16;
                } else {
                    j |= 8;
                }
            }
            if ((j & 5) != 0 && c1688fk != null) {
                C1851ir c1851ir2 = c1688fk.f5293s;
                sparseArray = c1688fk.f5290f;
                c1517cb = c1688fk.f5287E;
                c1851ir = c1851ir2;
            } else {
                sparseArray = null;
                c1851ir = null;
            }
        } else {
            sparseArray = null;
            c1851ir = null;
            z = false;
        }
        if ((8 & j) != 0) {
            if (c1688fk != null) {
                c1517cb = c1688fk.f5287E;
            }
            if (c1517cb != null) {
                z3 = c1517cb.isEmpty();
            } else {
                z3 = false;
            }
            z2 = !z3;
        } else {
            z2 = false;
        }
        long j3 = 7 & j;
        if (j3 != 0) {
            if (z) {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if ((j & 5) != 0) {
            AbstractC0795Op.m1846dx(this.f911j, c1517cb, sparseArray);
            this.f6567n.mo2753s(c1851ir);
        }
        if (j3 != 0) {
            AbstractC0795Op.m1814Ha(this.f6566d, z);
            AbstractC0795Op.m1819Lq(this.f6565O, z2);
        }
        this.f6567n.m4819u();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        C1688fk c1688fk = (C1688fk) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.f6568x |= 1;
            }
        } else {
            if (i2 != 22) {
                return false;
            }
            synchronized (this) {
                this.f6568x |= 2;
            }
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (43 != i) {
            return false;
        }
        mo552s((C1688fk) obj);
        return true;
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: q */
    public final void mo2815q(InterfaceC1546d7 interfaceC1546d7) {
        super.mo2815q(interfaceC1546d7);
        this.f6567n.mo2815q(interfaceC1546d7);
    }

    @Override // p000a.AbstractC0255Et
    /* renamed from: s */
    public final void mo552s(C1688fk c1688fk) {
        m4818g(0, c1688fk);
        this.f910i = c1688fk;
        synchronized (this) {
            this.f6568x |= 1;
        }
        m2861Q(43);
        m4816I();
    }
}
