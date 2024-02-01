package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.fD */
/* loaded from: classes.dex */
public final class C1660fD extends AbstractC1288Y7 {

    /* renamed from: x */
    public static final C1174Vy f5196x;

    /* renamed from: n */
    public long f5197n;

    static {
        C1174Vy c1174Vy = new C1174Vy(5);
        f5196x = c1174Vy;
        c1174Vy.m2398g(0, new int[]{3}, new int[]{R.layout.include_log_magisk}, new String[]{"include_log_magisk"});
        c1174Vy.m2398g(2, new int[]{4}, new int[]{R.layout.include_log_superuser}, new String[]{"include_log_superuser"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1660fD(android.view.View r10) {
        /*
            r9 = this;
            r1 = 0
            a.Vy r0 = p000a.C1660fD.f5196x
            r2 = 5
            r7 = 0
            java.lang.Object[] r8 = androidx.databinding.AbstractC2760z.m4814S(r10, r2, r0, r7)
            r0 = 2
            r0 = r8[r0]
            r3 = r0
            com.google.android.material.circularreveal.cardview.CircularRevealCardView r3 = (com.google.android.material.circularreveal.cardview.CircularRevealCardView) r3
            r0 = 3
            r0 = r8[r0]
            r4 = r0
            a.jJ r4 = (p000a.AbstractC1874jJ) r4
            r0 = 4
            r0 = r8[r0]
            r5 = r0
            a.Et r5 = (p000a.AbstractC0255Et) r5
            r0 = 1
            r0 = r8[r0]
            r6 = r0
            com.google.android.material.floatingactionbutton.FloatingActionButton r6 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r6
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r9.f5197n = r0
            com.google.android.material.circularreveal.cardview.CircularRevealCardView r0 = r9.f4128j
            r0.setTag(r7)
            a.jJ r0 = r9.f4124L
            if (r0 == 0) goto L35
            r0.f8980f = r9
        L35:
            a.Et r0 = r9.f4127i
            if (r0 == 0) goto L3b
            r0.f8980f = r9
        L3b:
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r9.f4126d
            r0.setTag(r7)
            r0 = 0
            r0 = r8[r0]
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0.setTag(r7)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r10.setTag(r0, r9)
            r9.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1660fD.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            if (this.f5197n != 0) {
                return true;
            }
            return this.f4124L.mo13G() || this.f4127i.mo13G();
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f5197n = 16L;
        }
        this.f4124L.mo14M();
        this.f4127i.mo14M();
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        boolean z;
        synchronized (this) {
            j = this.f5197n;
            this.f5197n = 0L;
        }
        C1688fk c1688fk = this.f4125O;
        long j2 = 28 & j;
        if (j2 != 0 && c1688fk != null) {
            z = c1688fk.f5294y;
        } else {
            z = false;
        }
        if ((j & 20) != 0) {
            this.f4124L.mo2816s(c1688fk);
            this.f4127i.mo552s(c1688fk);
        }
        if (j2 != 0) {
            AbstractC0795Op.m1819Lq(this.f4126d, z);
        }
        this.f4124L.m4819u();
        this.f4127i.m4819u();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                C1688fk c1688fk = (C1688fk) obj;
                return m3135U(i2);
            }
            AbstractC1874jJ abstractC1874jJ = (AbstractC1874jJ) obj;
            return m3136s(i2);
        }
        AbstractC0255Et abstractC0255Et = (AbstractC0255Et) obj;
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.f5197n |= 1;
        }
        return true;
    }

    /* renamed from: U */
    public final boolean m3135U(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f5197n |= 4;
            }
            return true;
        }
        if (i != 22) {
            return false;
        }
        synchronized (this) {
            this.f5197n |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (43 == i) {
            C1688fk c1688fk = (C1688fk) obj;
            m4818g(2, c1688fk);
            this.f4125O = c1688fk;
            synchronized (this) {
                this.f5197n |= 4;
            }
            m2861Q(43);
            m4816I();
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: q */
    public final void mo2815q(InterfaceC1546d7 interfaceC1546d7) {
        super.mo2815q(interfaceC1546d7);
        this.f4124L.mo2815q(interfaceC1546d7);
        this.f4127i.mo2815q(interfaceC1546d7);
    }

    /* renamed from: s */
    public final boolean m3136s(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f5197n |= 2;
        }
        return true;
    }
}
