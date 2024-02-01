package p000a;

import android.widget.ImageView;

/* renamed from: a.VL */
/* loaded from: classes.dex */
public final class C1141VL extends AbstractC0353Gl {

    /* renamed from: T */
    public long f3718T;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1141VL(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            r0 = 4
            r6 = 0
            java.lang.Object[] r7 = androidx.databinding.AbstractC2760z.m4814S(r9, r0, r6, r6)
            r0 = 3
            r0 = r7[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 2
            r0 = r7[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 1
            r0 = r7[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r8.f3718T = r0
            r0 = 0
            r0 = r7[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r6)
            android.widget.ImageView r0 = r8.f1188j
            r0.setTag(r6)
            android.widget.ImageView r0 = r8.f1184L
            r0.setTag(r6)
            android.widget.ImageView r0 = r8.f1187i
            r0.setTag(r6)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r9.setTag(r0, r8)
            r8.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1141VL.<init>(android.view.View):void");
    }

    @Override // p000a.AbstractC0353Gl
    /* renamed from: E */
    public final void mo773E(Boolean bool) {
        this.f1190x = bool;
        synchronized (this) {
            this.f3718T |= 2;
        }
        m2861Q(18);
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f3718T != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f3718T = 16L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        int i2;
        synchronized (this) {
            j = this.f3718T;
            this.f3718T = 0L;
        }
        Boolean bool = this.f1186d;
        Boolean bool2 = this.f1190x;
        Integer num = this.f1189n;
        Boolean bool3 = this.f1185O;
        long j2 = 17 & j;
        int i3 = 0;
        if (j2 != 0 && bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        long j3 = 18 & j;
        if (j3 != 0 && bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        long j4 = 20 & j;
        if (j4 != 0 && num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        long j5 = j & 24;
        if (j5 != 0 && bool3 != null) {
            z3 = bool3.booleanValue();
        } else {
            z3 = false;
        }
        if (j5 != 0) {
            ImageView imageView = this.f1188j;
            if (z3) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            imageView.setVisibility(i2);
        }
        if (j3 != 0) {
            this.f1184L.setSelected(z2);
        }
        if (j4 != 0) {
            this.f1184L.setImageResource(i);
        }
        if (j2 != 0) {
            ImageView imageView2 = this.f1187i;
            if (z) {
                i3 = 4;
            }
            imageView2.setVisibility(i3);
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        return false;
    }

    @Override // p000a.AbstractC0353Gl
    /* renamed from: U */
    public final void mo774U(Boolean bool) {
        this.f1185O = bool;
        synchronized (this) {
            this.f3718T |= 8;
        }
        m2861Q(17);
        m4816I();
    }

    @Override // p000a.AbstractC0353Gl
    /* renamed from: f */
    public final void mo775f(Boolean bool) {
        this.f1186d = bool;
        synchronized (this) {
            this.f3718T |= 1;
        }
        m2861Q(19);
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (19 == i) {
            mo775f((Boolean) obj);
        } else if (18 == i) {
            mo773E((Boolean) obj);
        } else if (3 == i) {
            mo776s((Integer) obj);
        } else {
            if (17 != i) {
                return false;
            }
            mo774U((Boolean) obj);
        }
        return true;
    }

    @Override // p000a.AbstractC0353Gl
    /* renamed from: s */
    public final void mo776s(Integer num) {
        this.f1189n = num;
        synchronized (this) {
            this.f3718T |= 4;
        }
        m2861Q(3);
        m4816I();
    }
}
