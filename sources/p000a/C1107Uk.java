package p000a;

import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: a.Uk */
/* loaded from: classes.dex */
public final class C1107Uk extends AbstractC2563wI {

    /* renamed from: O */
    public final TextView f3603O;

    /* renamed from: d */
    public final ProgressBar f3604d;

    /* renamed from: i */
    public final TextView f3605i;

    /* renamed from: n */
    public long f3606n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1107Uk(android.view.View r5) {
        /*
            r4 = this;
            r0 = 5
            r1 = 0
            java.lang.Object[] r0 = androidx.databinding.AbstractC2760z.m4814S(r5, r0, r1, r1)
            r2 = 1
            r2 = r0[r2]
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r4.<init>(r1, r5, r2)
            r2 = -1
            r4.f3606n = r2
            r2 = 0
            r2 = r0[r2]
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2.setTag(r1)
            r2 = 2
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r4.f3605i = r2
            r2.setTag(r1)
            r2 = 3
            r2 = r0[r2]
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            r4.f3604d = r2
            r2.setTag(r1)
            r2 = 4
            r0 = r0[r2]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.f3603O = r0
            r0.setTag(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r4.f7832j
            r0.setTag(r1)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r5.setTag(r0, r4)
            r4.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1107Uk.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f3606n != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f3606n = 8L;
        }
        m4816I();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo15N() {
        /*
            r19 = this;
            r1 = r19
            monitor-enter(r19)
            long r2 = r1.f3606n     // Catch: java.lang.Throwable -> L97
            r4 = 0
            r1.f3606n = r4     // Catch: java.lang.Throwable -> L97
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L97
            a.zq r0 = r1.f7831L
            r6 = 15
            long r8 = r2 & r6
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            r11 = 11
            r13 = 16
            r15 = 1
            if (r8 == 0) goto L45
            if (r0 == 0) goto L1e
            boolean r9 = r0.f8600E
            goto L1f
        L1e:
            r9 = 0
        L1f:
            if (r8 == 0) goto L29
            if (r9 == 0) goto L28
            r17 = 32
            long r2 = r2 | r17
            goto L29
        L28:
            long r2 = r2 | r13
        L29:
            long r17 = r2 & r11
            int r8 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r8 == 0) goto L46
            if (r0 == 0) goto L38
            android.util.SparseArray r8 = r0.f8601U
            a.fs r10 = r0.f8603s
            r16 = r8
            goto L3b
        L38:
            r10 = 0
            r16 = 0
        L3b:
            a.fK r8 = androidx.databinding.AbstractC2760z.f8969X
            r1.m4821y(r15, r10, r8)
            r8 = r9
            r9 = r10
            r10 = r16
            goto L49
        L45:
            r9 = 0
        L46:
            r8 = r9
            r9 = 0
            r10 = 0
        L49:
            long r13 = r13 & r2
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 == 0) goto L63
            if (r0 == 0) goto L52
            a.fs r9 = r0.f8603s
        L52:
            a.fK r0 = androidx.databinding.AbstractC2760z.f8969X
            r1.m4821y(r15, r9, r0)
            if (r9 == 0) goto L5e
            int r0 = r9.size()
            goto L5f
        L5e:
            r0 = 0
        L5f:
            if (r0 == r15) goto L63
            r0 = r15
            goto L64
        L63:
            r0 = 0
        L64:
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L6e
            if (r8 == 0) goto L6c
            goto L6f
        L6c:
            r15 = r0
            goto L6f
        L6e:
            r15 = 0
        L6f:
            r13 = 13
            long r13 = r13 & r2
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 == 0) goto L85
            android.widget.TextView r0 = r1.f3605i
            p000a.AbstractC0795Op.m1814Ha(r0, r8)
            android.widget.ProgressBar r0 = r1.f3604d
            p000a.AbstractC0795Op.m1814Ha(r0, r8)
            androidx.recyclerview.widget.RecyclerView r0 = r1.f7832j
            p000a.AbstractC0795Op.m1819Lq(r0, r8)
        L85:
            if (r6 == 0) goto L8c
            android.widget.TextView r0 = r1.f3603O
            p000a.AbstractC0795Op.m1819Lq(r0, r15)
        L8c:
            long r2 = r2 & r11
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L96
            androidx.recyclerview.widget.RecyclerView r0 = r1.f7832j
            p000a.AbstractC0795Op.m1846dx(r0, r9, r10)
        L96:
            return
        L97:
            r0 = move-exception
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L97
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1107Uk.mo15N():void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            C1694fs c1694fs = (C1694fs) obj;
            return m2288s(i2);
        }
        C2744zq c2744zq = (C2744zq) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.f3606n |= 1;
            }
        } else {
            if (i2 != 22) {
                return false;
            }
            synchronized (this) {
                this.f3606n |= 4;
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
        C2744zq c2744zq = (C2744zq) obj;
        m4818g(0, c2744zq);
        this.f7831L = c2744zq;
        synchronized (this) {
            this.f3606n |= 1;
        }
        m2861Q(43);
        m4816I();
        return true;
    }

    /* renamed from: s */
    public final boolean m2288s(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f3606n |= 2;
        }
        return true;
    }
}
