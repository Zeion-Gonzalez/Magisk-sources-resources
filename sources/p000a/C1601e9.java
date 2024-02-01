package p000a;

import android.util.SparseIntArray;
import android.view.View;
import androidx.lifecycle.AbstractC2764h;
import com.topjohnwu.magisk.R;

/* renamed from: a.e9 */
/* loaded from: classes.dex */
public final class C1601e9 extends AbstractC0295Fc implements InterfaceC1221Wo {

    /* renamed from: x */
    public static final SparseIntArray f4914x;

    /* renamed from: O */
    public final ViewOnClickListenerC0574Kl f4915O;

    /* renamed from: n */
    public long f4916n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4914x = sparseIntArray;
        sparseIntArray.put(R.id.snackbar_container, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1601e9(android.view.View r10) {
        /*
            r9 = this;
            r1 = 0
            android.util.SparseIntArray r0 = p000a.C1601e9.f4914x
            r2 = 4
            r6 = 0
            java.lang.Object[] r7 = androidx.databinding.AbstractC2760z.m4814S(r10, r2, r6, r0)
            r8 = 1
            r0 = r7[r8]
            r3 = r0
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r0 = 2
            r0 = r7[r0]
            r4 = r0
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r4 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) r4
            r0 = 3
            r0 = r7[r0]
            r5 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r5
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r9.f4916n = r0
            androidx.recyclerview.widget.RecyclerView r0 = r9.f1028j
            r0.setTag(r6)
            r0 = 0
            r0 = r7[r0]
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            r0.setTag(r6)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r9.f1025L
            r0.setTag(r6)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r10.setTag(r0, r9)
            a.Kl r10 = new a.Kl
            r10.<init>(r8, r8, r9)
            r9.f4915O = r10
            r9.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1601e9.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f4916n != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f4916n = 16L;
        }
        m4816I();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo15N() {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1601e9.mo15N():void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                C1587dt c1587dt = (C1587dt) obj;
                return m3075U(i2);
            }
            C2619xH c2619xH = (C2619xH) obj;
            return m3076s(i2);
        }
        AbstractC2764h abstractC2764h = (AbstractC2764h) obj;
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.f4916n |= 1;
        }
        return true;
    }

    /* renamed from: U */
    public final boolean m3075U(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f4916n |= 4;
        }
        return true;
    }

    @Override // p000a.InterfaceC1221Wo
    /* renamed from: h */
    public final void mo18h(View view, int i) {
        boolean z;
        C2619xH c2619xH = this.f1026d;
        if (c2619xH != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c2619xH.getClass();
            AbstractC0795Op.m1864od(C1212We.f3965u ? "recovery" : "");
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (43 == i) {
            C2619xH c2619xH = (C2619xH) obj;
            m4818g(1, c2619xH);
            this.f1026d = c2619xH;
            synchronized (this) {
                this.f4916n |= 2;
            }
            m2861Q(43);
            m4816I();
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final boolean m3076s(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f4916n |= 2;
            }
            return true;
        }
        if (i != 34) {
            return false;
        }
        synchronized (this) {
            this.f4916n |= 8;
        }
        return true;
    }
}
