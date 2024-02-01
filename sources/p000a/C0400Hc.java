package p000a;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC2760z;
import com.google.android.material.switchmaterial.SwitchMaterial;

/* renamed from: a.Hc */
/* loaded from: classes.dex */
public final class C0400Hc extends AbstractC0627Ln {

    /* renamed from: O */
    public final TextView f1348O;

    /* renamed from: d */
    public final ConstraintLayout f1349d;

    /* renamed from: n */
    public final C0130CV f1350n;

    /* renamed from: x */
    public long f1351x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0400Hc(android.view.View r5) {
        /*
            r4 = this;
            r0 = 3
            r1 = 0
            java.lang.Object[] r0 = androidx.databinding.AbstractC2760z.m4814S(r5, r0, r1, r1)
            r2 = 2
            r3 = r0[r2]
            com.google.android.material.switchmaterial.SwitchMaterial r3 = (com.google.android.material.switchmaterial.SwitchMaterial) r3
            r4.<init>(r1, r5, r2, r3)
            a.CV r2 = new a.CV
            r3 = 5
            r2.<init>(r4, r3)
            r4.f1350n = r2
            r2 = -1
            r4.f1351x = r2
            android.widget.TextView r2 = r4.f2039j
            com.google.android.material.switchmaterial.SwitchMaterial r2 = (com.google.android.material.switchmaterial.SwitchMaterial) r2
            r2.setTag(r1)
            r2 = 0
            r2 = r0[r2]
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r4.f1349d = r2
            r2.setTag(r1)
            r2 = 1
            r0 = r0[r2]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.f1348O = r0
            r0.setTag(r1)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r5.setTag(r0, r4)
            r4.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0400Hc.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f1351x != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f1351x = 8L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        float f;
        String str;
        long j2;
        synchronized (this) {
            j = this.f1351x;
            this.f1351x = 0L;
        }
        C2318rd c2318rd = (C2318rd) this.f2037L;
        long j3 = j & 13;
        boolean z = false;
        if (j3 != 0) {
            if ((j & 9) != 0 && c2318rd != null) {
                str = c2318rd.f7145w;
            } else {
                str = null;
            }
            if (c2318rd != null) {
                z = c2318rd.f7144R.f3538v;
            }
            if (j3 != 0) {
                if (z) {
                    j2 = 32;
                } else {
                    j2 = 16;
                }
                j |= j2;
            }
            if (z) {
                f = 1.0f;
            } else {
                f = 0.7f;
            }
        } else {
            f = 0.0f;
            str = null;
        }
        if ((13 & j) != 0) {
            AbstractC2575wW.m4401Lq((SwitchMaterial) this.f2039j, z);
            if (AbstractC2760z.f8971c >= 11) {
                this.f1349d.setAlpha(f);
            }
        }
        if ((8 & j) != 0) {
            AbstractC2575wW.m4397Ha((SwitchMaterial) this.f2039j, null, this.f1350n);
        }
        if ((j & 9) != 0) {
            AbstractC1843ih.m3398BO(this.f1348O, str);
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            C1164Vn c1164Vn = (C1164Vn) obj;
            return m897s(i2);
        }
        C2318rd c2318rd = (C2318rd) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.f1351x |= 1;
            }
        } else {
            if (i2 != 9) {
                return false;
            }
            synchronized (this) {
                this.f1351x |= 4;
            }
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (20 == i) {
            C2318rd c2318rd = (C2318rd) obj;
            m4818g(0, c2318rd);
            this.f2037L = c2318rd;
            synchronized (this) {
                this.f1351x |= 1;
            }
            m2861Q(20);
            m4816I();
        } else {
            if (43 != i) {
                return false;
            }
            this.f2038i = (C1164Vn) obj;
        }
        return true;
    }

    /* renamed from: s */
    public final boolean m897s(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f1351x |= 2;
        }
        return true;
    }
}
