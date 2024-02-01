package p000a;

/* renamed from: a.rx */
/* loaded from: classes.dex */
public final class C2336rx extends AbstractC2004lh {

    /* renamed from: O */
    public long f7174O;

    /* renamed from: d */
    public final C0130CV f7175d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2336rx(android.view.View r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            java.lang.Object[] r0 = androidx.databinding.AbstractC2760z.m4814S(r5, r0, r1, r1)
            r2 = 1
            r2 = r0[r2]
            com.google.android.material.textfield.TextInputEditText r2 = (com.google.android.material.textfield.TextInputEditText) r2
            r4.<init>(r1, r5, r2)
            a.CV r2 = new a.CV
            r3 = 3
            r2.<init>(r4, r3)
            r4.f7175d = r2
            r2 = -1
            r4.f7174O = r2
            com.google.android.material.textfield.TextInputEditText r2 = r4.f6230j
            r2.setTag(r1)
            r2 = 0
            r0 = r0[r2]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r1)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r5.setTag(r0, r4)
            r4.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2336rx.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f7174O != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f7174O = 2L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        String str;
        synchronized (this) {
            j = this.f7174O;
            this.f7174O = 0L;
        }
        C1985lK c1985lK = this.f6229L;
        long j2 = 3 & j;
        if (j2 != 0 && c1985lK != null) {
            str = C1985lK.f6154k;
        } else {
            str = null;
        }
        if (j2 != 0) {
            AbstractC1843ih.m3398BO(this.f6230j, str);
        }
        if ((j & 2) != 0) {
            AbstractC1843ih.m3445he(this.f6230j, this.f7175d);
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        C1985lK c1985lK = (C1985lK) obj;
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.f7174O |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (6 != i) {
            return false;
        }
        C1985lK c1985lK = (C1985lK) obj;
        m4818g(0, c1985lK);
        this.f6229L = c1985lK;
        synchronized (this) {
            this.f7174O |= 1;
        }
        m2861Q(6);
        m4816I();
        return true;
    }
}
