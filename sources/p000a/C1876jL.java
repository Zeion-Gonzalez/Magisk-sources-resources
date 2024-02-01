package p000a;

import android.widget.LinearLayout;

/* renamed from: a.jL */
/* loaded from: classes.dex */
public final class C1876jL extends AbstractC2597wv {

    /* renamed from: d */
    public long f5859d;

    /* renamed from: i */
    public final LinearLayout f5860i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1876jL(android.view.View r5) {
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
            r4.f5859d = r2
            r2 = 0
            r2 = r0[r2]
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2.setTag(r1)
            r2 = 2
            r0 = r0[r2]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4.f5860i = r0
            r0.setTag(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r4.f7989j
            r0.setTag(r1)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r5.setTag(r0, r4)
            r4.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1876jL.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f5859d != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f5859d = 8L;
        }
        m4816I();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo15N() {
        /*
            r15 = this;
            monitor-enter(r15)
            long r0 = r15.f5859d     // Catch: java.lang.Throwable -> L54
            r2 = 0
            r15.f5859d = r2     // Catch: java.lang.Throwable -> L54
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L54
            a.ZK r4 = r15.f7988L
            r5 = 15
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 11
            r8 = 13
            r10 = 0
            r11 = 0
            if (r5 == 0) goto L39
            long r12 = r0 & r8
            int r5 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r5 == 0) goto L21
            if (r4 == 0) goto L21
            boolean r11 = r4.f4257r
        L21:
            long r12 = r0 & r6
            int r5 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r5 == 0) goto L39
            if (r4 == 0) goto L31
            android.util.SparseArray r10 = r4.f4255f
            a.fs r4 = r4.f4253E
            r14 = r10
            r10 = r4
            r4 = r14
            goto L32
        L31:
            r4 = r10
        L32:
            a.fK r5 = androidx.databinding.AbstractC2760z.f8969X
            r12 = 1
            r15.m4821y(r12, r10, r5)
            goto L3a
        L39:
            r4 = r10
        L3a:
            long r8 = r8 & r0
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 == 0) goto L49
            android.widget.LinearLayout r5 = r15.f5860i
            p000a.AbstractC0795Op.m1814Ha(r5, r11)
            androidx.recyclerview.widget.RecyclerView r5 = r15.f7989j
            p000a.AbstractC0795Op.m1819Lq(r5, r11)
        L49:
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L53
            androidx.recyclerview.widget.RecyclerView r0 = r15.f7989j
            p000a.AbstractC0795Op.m1846dx(r0, r10, r4)
        L53:
            return
        L54:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L54
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1876jL.mo15N():void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            C1694fs c1694fs = (C1694fs) obj;
            return m3493s(i2);
        }
        C1353ZK c1353zk = (C1353ZK) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.f5859d |= 1;
            }
        } else {
            if (i2 != 22) {
                return false;
            }
            synchronized (this) {
                this.f5859d |= 4;
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
        C1353ZK c1353zk = (C1353ZK) obj;
        m4818g(0, c1353zk);
        this.f7988L = c1353zk;
        synchronized (this) {
            this.f5859d |= 1;
        }
        m2861Q(43);
        m4816I();
        return true;
    }

    /* renamed from: s */
    public final boolean m3493s(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f5859d |= 2;
        }
        return true;
    }
}
