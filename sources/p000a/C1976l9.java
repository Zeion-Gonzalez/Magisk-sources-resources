package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.l9 */
/* loaded from: classes.dex */
public final class C1976l9 extends AbstractC1081UF {

    /* renamed from: O */
    public static final C1174Vy f6117O;

    /* renamed from: d */
    public long f6118d;

    static {
        C1174Vy c1174Vy = new C1174Vy(3);
        f6117O = c1174Vy;
        c1174Vy.m2398g(1, new int[]{2}, new int[]{R.layout.item_tappable_headline}, new String[]{"item_tappable_headline"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1976l9(android.view.View r6) {
        /*
            r5 = this;
            a.Vy r0 = p000a.C1976l9.f6117O
            r1 = 3
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.AbstractC2760z.m4814S(r6, r1, r0, r2)
            r1 = 2
            r1 = r0[r1]
            a.wp r1 = (p000a.AbstractC2591wp) r1
            r3 = 1
            r3 = r0[r3]
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r5.<init>(r2, r6, r1, r3)
            r3 = -1
            r5.f6118d = r3
            r1 = 0
            r0 = r0[r1]
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r0.setTag(r2)
            a.wp r0 = r5.f3551j
            if (r0 == 0) goto L27
            r0.f8980f = r5
        L27:
            android.widget.LinearLayout r0 = r5.f3549L
            r0.setTag(r2)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r6.setTag(r0, r5)
            r5.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1976l9.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            if (this.f6118d != 0) {
                return true;
            }
            return this.f3551j.mo13G();
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f6118d = 4L;
        }
        this.f3551j.mo14M();
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        C1713gC c1713gC;
        synchronized (this) {
            j = this.f6118d;
            this.f6118d = 0L;
        }
        C1091UT c1091ut = this.f3550i;
        long j2 = j & 6;
        if (j2 != 0 && c1091ut != null) {
            c1713gC = c1091ut.f3565k;
        } else {
            c1713gC = null;
        }
        if (j2 != 0) {
            this.f3551j.mo20s(c1713gC);
            this.f3551j.mo17U(c1091ut);
        }
        this.f3551j.m4819u();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            C1091UT c1091ut = (C1091UT) obj;
            return m3589s(i2);
        }
        AbstractC2591wp abstractC2591wp = (AbstractC2591wp) obj;
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.f6118d |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (43 == i) {
            C1091UT c1091ut = (C1091UT) obj;
            m4818g(1, c1091ut);
            this.f3550i = c1091ut;
            synchronized (this) {
                this.f6118d |= 2;
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
        this.f3551j.mo2815q(interfaceC1546d7);
    }

    /* renamed from: s */
    public final boolean m3589s(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f6118d |= 2;
        }
        return true;
    }
}
