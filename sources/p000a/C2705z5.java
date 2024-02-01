package p000a;

import com.topjohnwu.magisk.R;

/* renamed from: a.z5 */
/* loaded from: classes.dex */
public final class C2705z5 extends AbstractC0282FM {

    /* renamed from: x */
    public static final C1174Vy f8527x;

    /* renamed from: n */
    public long f8528n;

    static {
        C1174Vy c1174Vy = new C1174Vy(4);
        f8527x = c1174Vy;
        c1174Vy.m2398g(0, new int[]{3}, new int[]{R.layout.item_log_track_md2}, new String[]{"item_log_track_md2"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2705z5(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            a.Vy r0 = p000a.C2705z5.f8527x
            r2 = 4
            r6 = 0
            java.lang.Object[] r7 = androidx.databinding.AbstractC2760z.m4814S(r9, r2, r0, r6)
            r0 = 1
            r0 = r7[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 2
            r0 = r7[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 3
            r0 = r7[r0]
            r5 = r0
            a.Gl r5 = (p000a.AbstractC0353Gl) r5
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r8.f8528n = r0
            android.widget.TextView r0 = r8.f986j
            r0.setTag(r6)
            android.widget.TextView r0 = r8.f982L
            r0.setTag(r6)
            java.lang.Object r0 = r8.f985i
            a.Gl r0 = (p000a.AbstractC0353Gl) r0
            if (r0 == 0) goto L36
            r0.f8980f = r8
        L36:
            r0 = 0
            r0 = r7[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r6)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r9.setTag(r0, r8)
            r8.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2705z5.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            if (this.f8528n != 0) {
                return true;
            }
            return ((AbstractC0353Gl) this.f985i).mo13G();
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f8528n = 32L;
        }
        ((AbstractC0353Gl) this.f985i).mo14M();
        m4816I();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo15N() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2705z5.mo15N():void");
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
                return m4632U(i2);
            }
            AbstractC0353Gl abstractC0353Gl = (AbstractC0353Gl) obj;
            return m4633s(i2);
        }
        C1218Wl c1218Wl = (C1218Wl) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.f8528n |= 1;
            }
        } else if (i2 == 2) {
            synchronized (this) {
                this.f8528n |= 8;
            }
        } else {
            if (i2 != 41) {
                return false;
            }
            synchronized (this) {
                this.f8528n |= 16;
            }
        }
        return true;
    }

    /* renamed from: U */
    public final boolean m4632U(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f8528n |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (20 == i) {
            C1218Wl c1218Wl = (C1218Wl) obj;
            m4818g(0, c1218Wl);
            this.f984d = c1218Wl;
            synchronized (this) {
                this.f8528n |= 1;
            }
            m2861Q(20);
            m4816I();
        } else {
            if (43 != i) {
                return false;
            }
            this.f983O = (C1688fk) obj;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: q */
    public final void mo2815q(InterfaceC1546d7 interfaceC1546d7) {
        super.mo2815q(interfaceC1546d7);
        ((AbstractC0353Gl) this.f985i).mo2815q(interfaceC1546d7);
    }

    /* renamed from: s */
    public final boolean m4633s(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f8528n |= 2;
        }
        return true;
    }
}
