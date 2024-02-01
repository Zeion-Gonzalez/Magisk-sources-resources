package p000a;

import android.widget.LinearLayout;

/* renamed from: a.P7 */
/* loaded from: classes.dex */
public final class C0811P7 extends AbstractC1431ar {

    /* renamed from: d */
    public long f2752d;

    /* renamed from: i */
    public final LinearLayout f2753i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0811P7(android.view.View r5) {
        /*
            r4 = this;
            r0 = 3
            r1 = 0
            java.lang.Object[] r0 = androidx.databinding.AbstractC2760z.m4814S(r5, r0, r1, r1)
            r2 = 1
            r2 = r0[r2]
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r4.<init>(r1, r5, r2)
            r2 = -1
            r4.f2752d = r2
            androidx.recyclerview.widget.RecyclerView r2 = r4.f4488j
            r2.setTag(r1)
            r2 = 0
            r2 = r0[r2]
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2.setTag(r1)
            r2 = 2
            r0 = r0[r2]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4.f2753i = r0
            r0.setTag(r1)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r5.setTag(r0, r4)
            r4.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0811P7.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f2752d != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f2752d = 4L;
        }
        m4816I();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo15N() {
        /*
            r12 = this;
            monitor-enter(r12)
            long r0 = r12.f2752d     // Catch: java.lang.Throwable -> L44
            r2 = 0
            r12.f2752d = r2     // Catch: java.lang.Throwable -> L44
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L44
            a.Vn r4 = r12.f4487L
            r5 = 7
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 0
            r7 = 5
            if (r5 == 0) goto L27
            if (r4 == 0) goto L19
            boolean r9 = r4.f3789f
            goto L1a
        L19:
            r9 = r6
        L1a:
            long r10 = r0 & r7
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 == 0) goto L28
            if (r4 == 0) goto L28
            android.util.SparseArray r10 = r4.f3787E
            a.tR r4 = r4.f3788U
            goto L2a
        L27:
            r9 = r6
        L28:
            r10 = 0
            r4 = r10
        L2a:
            if (r5 == 0) goto L39
            androidx.recyclerview.widget.RecyclerView r5 = r12.f4488j
            if (r9 == 0) goto L31
            r6 = 4
        L31:
            r5.setVisibility(r6)
            android.widget.LinearLayout r5 = r12.f2753i
            p000a.AbstractC0795Op.m1814Ha(r5, r9)
        L39:
            long r0 = r0 & r7
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L43
            androidx.recyclerview.widget.RecyclerView r0 = r12.f4488j
            p000a.AbstractC0795Op.m1846dx(r0, r4, r10)
        L43:
            return
        L44:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L44
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0811P7.mo15N():void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        C1164Vn c1164Vn = (C1164Vn) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.f2752d |= 1;
            }
        } else {
            if (i2 != 22) {
                return false;
            }
            synchronized (this) {
                this.f2752d |= 2;
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
        C1164Vn c1164Vn = (C1164Vn) obj;
        m4818g(0, c1164Vn);
        this.f4487L = c1164Vn;
        synchronized (this) {
            this.f2752d |= 1;
        }
        m2861Q(43);
        m4816I();
        return true;
    }
}
