package p000a;

import android.util.SparseArray;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.topjohnwu.magisk.R;

/* renamed from: a.a7 */
/* loaded from: classes.dex */
public final class C1393a7 extends AbstractC1874jJ {

    /* renamed from: t */
    public static final C1174Vy f4386t;

    /* renamed from: O */
    public final ProgressBar f4387O;

    /* renamed from: T */
    public long f4388T;

    /* renamed from: d */
    public final TextView f4389d;

    /* renamed from: i */
    public final HorizontalScrollView f4390i;

    /* renamed from: n */
    public final FrameLayout f4391n;

    /* renamed from: x */
    public final AbstractC2710zA f4392x;

    static {
        C1174Vy c1174Vy = new C1174Vy(7);
        f4386t = c1174Vy;
        c1174Vy.m2398g(5, new int[]{6}, new int[]{R.layout.item_text}, new String[]{"item_text"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1393a7(android.view.View r6) {
        /*
            r5 = this;
            a.Vy r0 = p000a.C1393a7.f4386t
            r1 = 7
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.AbstractC2760z.m4814S(r6, r1, r0, r2)
            r1 = 2
            r1 = r0[r1]
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r5.<init>(r2, r6, r1)
            r3 = -1
            r5.f4388T = r3
            androidx.recyclerview.widget.RecyclerView r1 = r5.f5858j
            r1.setTag(r2)
            r1 = 0
            r1 = r0[r1]
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r1.setTag(r2)
            r1 = 1
            r1 = r0[r1]
            android.widget.HorizontalScrollView r1 = (android.widget.HorizontalScrollView) r1
            r5.f4390i = r1
            r1.setTag(r2)
            r1 = 3
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r5.f4389d = r1
            r1.setTag(r2)
            r1 = 4
            r1 = r0[r1]
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r5.f4387O = r1
            r1.setTag(r2)
            r1 = 5
            r1 = r0[r1]
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r5.f4391n = r1
            r1.setTag(r2)
            r1 = 6
            r0 = r0[r1]
            a.zA r0 = (p000a.AbstractC2710zA) r0
            r5.f4392x = r0
            if (r0 == 0) goto L54
            r0.f8980f = r5
        L54:
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r6.setTag(r0, r5)
            r5.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1393a7.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            if (this.f4388T != 0) {
                return true;
            }
            return this.f4392x.mo13G();
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f4388T = 4L;
        }
        this.f4392x.mo14M();
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        C1851ir c1851ir;
        SparseArray sparseArray;
        C1517cb c1517cb;
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        synchronized (this) {
            j = this.f4388T;
            this.f4388T = 0L;
        }
        C1688fk c1688fk = this.f5857L;
        long j2 = j & 7;
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
                c1851ir = c1688fk.f5288U;
                sparseArray = c1688fk.f5290f;
                c1517cb = c1688fk.f5292r;
            } else {
                c1851ir = null;
                sparseArray = null;
                c1517cb = null;
            }
        } else {
            c1851ir = null;
            sparseArray = null;
            c1517cb = null;
            z = false;
        }
        if ((8 & j) != 0) {
            if (c1688fk != null) {
                str = c1688fk.f5289Y;
            } else {
                str = null;
            }
            if (str != null) {
                z3 = str.isEmpty();
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
            AbstractC0795Op.m1846dx(this.f5858j, c1517cb, sparseArray);
            this.f4392x.mo2753s(c1851ir);
        }
        if (j3 != 0) {
            AbstractC0795Op.m1819Lq(this.f4390i, z);
            AbstractC0795Op.m1814Ha(this.f4389d, z);
            AbstractC0795Op.m1814Ha(this.f4387O, z);
            AbstractC0795Op.m1819Lq(this.f4391n, z2);
        }
        this.f4392x.m4819u();
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
                this.f4388T |= 1;
            }
        } else {
            if (i2 != 22) {
                return false;
            }
            synchronized (this) {
                this.f4388T |= 2;
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
        mo2816s((C1688fk) obj);
        return true;
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: q */
    public final void mo2815q(InterfaceC1546d7 interfaceC1546d7) {
        super.mo2815q(interfaceC1546d7);
        this.f4392x.mo2815q(interfaceC1546d7);
    }

    @Override // p000a.AbstractC1874jJ
    /* renamed from: s */
    public final void mo2816s(C1688fk c1688fk) {
        m4818g(0, c1688fk);
        this.f5857L = c1688fk;
        synchronized (this) {
            this.f4388T |= 1;
        }
        m2861Q(43);
        m4816I();
    }
}
