package p000a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.AbstractC2760z;
import com.google.android.material.card.MaterialCardView;
import com.topjohnwu.magisk.R;

/* renamed from: a.K4 */
/* loaded from: classes.dex */
public final class C0535K4 extends AbstractC1821iI implements InterfaceC1629ee, InterfaceC1221Wo {

    /* renamed from: B */
    public final ViewOnClickListenerC0574Kl f1776B;

    /* renamed from: K */
    public long f1777K;

    /* renamed from: O */
    public final MaterialCardView f1778O;

    /* renamed from: T */
    public final TextView f1779T;

    /* renamed from: n */
    public final LinearLayout f1780n;

    /* renamed from: t */
    public final C0590L1 f1781t;

    /* renamed from: x */
    public final TextView f1782x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0535K4(android.view.View r5) {
        /*
            r4 = this;
            r0 = 6
            r1 = 0
            java.lang.Object[] r0 = androidx.databinding.AbstractC2760z.m4814S(r5, r0, r1, r1)
            r2 = 2
            r2 = r0[r2]
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r3 = 5
            r3 = r0[r3]
            com.google.android.material.switchmaterial.SwitchMaterial r3 = (com.google.android.material.switchmaterial.SwitchMaterial) r3
            r4.<init>(r1, r5, r2, r3)
            r2 = -1
            r4.f1777K = r2
            android.widget.ImageView r2 = r4.f5694j
            r2.setTag(r1)
            r2 = 0
            r2 = r0[r2]
            com.google.android.material.card.MaterialCardView r2 = (com.google.android.material.card.MaterialCardView) r2
            r4.f1778O = r2
            r2.setTag(r1)
            r2 = 1
            r3 = r0[r2]
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r4.f1780n = r3
            r3.setTag(r1)
            r3 = 3
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4.f1782x = r3
            r3.setTag(r1)
            r3 = 4
            r0 = r0[r3]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.f1779T = r0
            r0.setTag(r1)
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r4.f5691L
            r0.setTag(r1)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r5.setTag(r0, r4)
            a.L1 r5 = new a.L1
            r5.<init>(r4)
            r4.f1781t = r5
            a.Kl r5 = new a.Kl
            r5.<init>(r2, r2, r4)
            r4.f1776B = r5
            r4.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0535K4.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f1777K != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f1777K = 32L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        float f;
        float f2;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        AbstractC2222pt abstractC2222pt;
        AbstractC2222pt abstractC2222pt2;
        boolean z6;
        int i2;
        boolean z7;
        AbstractC2222pt abstractC2222pt3;
        long j2;
        long j3;
        synchronized (this) {
            j = this.f1777K;
            this.f1777K = 0L;
        }
        AbstractC2207pZ abstractC2207pZ = this.f5693i;
        if ((61 & j) != 0) {
            long j4 = j & 37;
            if (j4 != 0) {
                if (abstractC2207pZ != null) {
                    z2 = abstractC2207pZ.f6780R;
                } else {
                    z2 = false;
                }
                if (j4 != 0) {
                    if (z2) {
                        j3 = 512;
                    } else {
                        j3 = 256;
                    }
                    j |= j3;
                }
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
            } else {
                f = 0.0f;
                z2 = false;
            }
            long j5 = j & 33;
            if (j5 != 0) {
                if (abstractC2207pZ != null) {
                    z6 = abstractC2207pZ.mo2774S();
                    abstractC2222pt3 = abstractC2207pZ.mo30R();
                    i2 = abstractC2207pZ.mo1165V();
                } else {
                    z6 = false;
                    i2 = 0;
                    abstractC2222pt3 = null;
                }
                if (i2 == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (j5 != 0) {
                    if (z7) {
                        j2 = 128;
                    } else {
                        j2 = 64;
                    }
                    j |= j2;
                }
                if (z7) {
                    f2 = this.f1780n.getResources().getDimension(R.dimen.f9643l1);
                } else {
                    f2 = 0.0f;
                }
            } else {
                f2 = 0.0f;
                z6 = false;
                i2 = 0;
                z7 = false;
                abstractC2222pt3 = null;
            }
            if ((j & 41) != 0) {
                if (abstractC2207pZ != null) {
                    abstractC2222pt = abstractC2207pZ.mo234M();
                } else {
                    abstractC2222pt = null;
                }
                if (abstractC2222pt != null) {
                    z5 = abstractC2222pt.mo1431h();
                } else {
                    z5 = false;
                }
            } else {
                z5 = false;
                abstractC2222pt = null;
            }
            if ((j & 49) != 0 && abstractC2207pZ != null) {
                z = abstractC2207pZ.mo2777w();
            } else {
                z = false;
            }
            z4 = z6;
            abstractC2222pt2 = abstractC2222pt3;
            i = i2;
            z3 = z7;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            z = false;
            z2 = false;
            i = 0;
            z3 = false;
            z4 = false;
            z5 = false;
            abstractC2222pt = null;
            abstractC2222pt2 = null;
        }
        if ((33 & j) != 0) {
            AbstractC0795Op.m1819Lq(this.f5694j, z3);
            this.f5694j.setImageResource(i);
            LinearLayout linearLayout = this.f1780n;
            int i3 = (int) (0.5f + f2);
            if (i3 == 0) {
                if (f2 == 0.0f) {
                    i3 = 0;
                } else if (f2 > 0.0f) {
                    i3 = 1;
                } else {
                    i3 = -1;
                }
            }
            linearLayout.setPaddingRelative(i3, linearLayout.getPaddingTop(), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
            AbstractC0795Op.m1823O4(this.f1782x, abstractC2222pt2);
            AbstractC0795Op.m1814Ha(this.f5691L, z4);
        }
        if ((37 & j) != 0) {
            this.f1778O.setEnabled(z2);
            this.f1778O.setFocusable(z2);
            AbstractC2575wW.m4407Pm(this.f1778O, this.f1776B, z2);
            this.f5691L.setEnabled(z2);
            this.f5691L.setFocusable(z2);
            if (AbstractC2760z.f8971c >= 11) {
                this.f1778O.setAlpha(f);
            }
        }
        if ((41 & j) != 0) {
            AbstractC0795Op.m1819Lq(this.f1779T, z5);
            AbstractC0795Op.m1823O4(this.f1779T, abstractC2222pt);
        }
        if ((49 & j) != 0) {
            AbstractC2575wW.m4401Lq(this.f5691L, z);
        }
        if ((j & 32) != 0) {
            AbstractC2575wW.m4397Ha(this.f5691L, this.f1781t, null);
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        AbstractC2207pZ abstractC2207pZ = (AbstractC2207pZ) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.f1777K |= 1;
            }
        } else if (i2 == 9) {
            synchronized (this) {
                this.f1777K |= 4;
            }
        } else if (i2 == 8) {
            synchronized (this) {
                this.f1777K |= 8;
            }
        } else {
            if (i2 != 4) {
                return false;
            }
            synchronized (this) {
                this.f1777K |= 16;
            }
        }
        return true;
    }

    @Override // p000a.InterfaceC1221Wo
    /* renamed from: h */
    public final void mo18h(View view, int i) {
        C0316G1 c0316g1 = this.f5692d;
        AbstractC2207pZ abstractC2207pZ = this.f5693i;
        if (abstractC2207pZ != null) {
            abstractC2207pZ.mo1575I(view, c0316g1);
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (14 == i) {
            this.f5692d = (C0316G1) obj;
            synchronized (this) {
                this.f1777K |= 2;
            }
            m2861Q(14);
            m4816I();
        } else if (20 == i) {
            m1249s((AbstractC2207pZ) obj);
        } else {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final void m1249s(AbstractC2207pZ abstractC2207pZ) {
        m4818g(0, abstractC2207pZ);
        this.f5693i = abstractC2207pZ;
        synchronized (this) {
            this.f1777K |= 1;
        }
        m2861Q(20);
        m4816I();
    }
}
