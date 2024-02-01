package p000a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.topjohnwu.magisk.R;

/* renamed from: a.jZ */
/* loaded from: classes.dex */
public final class C1889jZ extends AbstractC2230q2 implements InterfaceC1221Wo {

    /* renamed from: l */
    public static final SparseIntArray f5903l;

    /* renamed from: B */
    public final ProgressBar f5904B;

    /* renamed from: D */
    public final ViewOnClickListenerC0574Kl f5905D;

    /* renamed from: K */
    public final ViewOnClickListenerC0574Kl f5906K;

    /* renamed from: T */
    public final TextView f5907T;

    /* renamed from: m */
    public long f5908m;

    /* renamed from: n */
    public final Button f5909n;

    /* renamed from: t */
    public final TextView f5910t;

    /* renamed from: x */
    public final Button f5911x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5903l = sparseIntArray;
        sparseIntArray.put(R.id.home_manager_icon, 8);
        sparseIntArray.put(R.id.home_manager_title, 9);
        sparseIntArray.put(R.id.home_manager_button, 10);
        sparseIntArray.put(R.id.home_manager_latest_version, 11);
        sparseIntArray.put(R.id.home_manager_installed_version, 12);
        sparseIntArray.put(R.id.home_manager_internal_connection, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1889jZ(android.view.View r10) {
        /*
            r9 = this;
            r1 = 0
            android.util.SparseIntArray r0 = p000a.C1889jZ.f5903l
            r2 = 14
            r7 = 0
            java.lang.Object[] r8 = androidx.databinding.AbstractC2760z.m4814S(r10, r2, r7, r0)
            r0 = 10
            r0 = r8[r0]
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0 = 6
            r0 = r8[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 8
            r0 = r8[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 12
            r0 = r8[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 13
            r0 = r8[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 11
            r0 = r8[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 9
            r0 = r8[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 3
            r0 = r8[r0]
            r6 = r0
            androidx.constraintlayout.widget.Barrier r6 = (androidx.constraintlayout.widget.Barrier) r6
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r9.f5908m = r0
            android.widget.TextView r0 = r9.f6875j
            r0.setTag(r7)
            androidx.constraintlayout.widget.Barrier r0 = r9.f6873d
            r0.setTag(r7)
            r0 = 0
            r0 = r8[r0]
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            r0.setTag(r7)
            r0 = 1
            r1 = r8[r0]
            android.widget.Button r1 = (android.widget.Button) r1
            r9.f5909n = r1
            r1.setTag(r7)
            r1 = 2
            r2 = r8[r1]
            android.widget.Button r2 = (android.widget.Button) r2
            r9.f5911x = r2
            r2.setTag(r7)
            r2 = 4
            r2 = r8[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r9.f5907T = r2
            r2.setTag(r7)
            r2 = 5
            r2 = r8[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r9.f5910t = r2
            r2.setTag(r7)
            r2 = 7
            r2 = r8[r2]
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            r9.f5904B = r2
            r2.setTag(r7)
            r2 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r10.setTag(r2, r9)
            a.Kl r10 = new a.Kl
            r10.<init>(r1, r0, r9)
            r9.f5906K = r10
            a.Kl r10 = new a.Kl
            r10.<init>(r0, r0, r9)
            r9.f5905D = r10
            r9.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1889jZ.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f5908m != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f5908m = 16L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        String str;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        String str2;
        int[] iArr;
        AbstractC2222pt abstractC2222pt;
        boolean z4;
        boolean z5;
        AbstractC2222pt abstractC2222pt2;
        String str3;
        boolean z6;
        EnumC2302rL enumC2302rL;
        synchronized (this) {
            j = this.f5908m;
            this.f5908m = 0L;
        }
        C0471Iu c0471Iu = this.f6872O;
        if ((j & 16) != 0) {
            str = this.f8982k.getContext().getPackageName();
        } else {
            str = null;
        }
        boolean z7 = true;
        if ((31 & j) != 0) {
            long j2 = j & 25;
            if (j2 != 0) {
                if (c0471Iu != null) {
                    i = c0471Iu.f1571r;
                } else {
                    i = 0;
                }
                if (i == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (j2 != 0) {
                    j = z3 ? j | 64 : j | 32;
                }
            } else {
                i = 0;
                z3 = false;
            }
            if ((j & 21) != 0 && c0471Iu != null) {
                abstractC2222pt2 = c0471Iu.f1569f;
            } else {
                abstractC2222pt2 = null;
            }
            if ((j & 17) != 0 && c0471Iu != null) {
                str3 = "26.4 (26400)";
                iArr = c0471Iu.f1572s;
            } else {
                iArr = null;
                str3 = null;
            }
            if ((j & 19) != 0) {
                if (c0471Iu != null) {
                    enumC2302rL = c0471Iu.f1566E;
                } else {
                    enumC2302rL = null;
                }
                if (enumC2302rL != EnumC2302rL.f7105w) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (enumC2302rL != EnumC2302rL.f7102I) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
                z6 = false;
            }
            z2 = z6;
            abstractC2222pt = abstractC2222pt2;
            str2 = str3;
        } else {
            z = false;
            i = 0;
            z2 = false;
            z3 = false;
            str2 = null;
            iArr = null;
            abstractC2222pt = null;
        }
        if ((j & 32) != 0 && i == 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        long j3 = j & 25;
        if (j3 != 0) {
            if (!z3) {
                z7 = z4;
            }
            z5 = z7;
        } else {
            z5 = false;
        }
        if ((16 & j) != 0) {
            AbstractC1843ih.m3398BO(this.f6875j, str);
            this.f5909n.setOnClickListener(this.f5905D);
            this.f5911x.setOnClickListener(this.f5906K);
        }
        if ((17 & j) != 0) {
            this.f6873d.m1171M(iArr);
            AbstractC1843ih.m3398BO(this.f5910t, str2);
        }
        if ((19 & j) != 0) {
            AbstractC0795Op.m1819Lq(this.f5909n, z2);
            AbstractC0795Op.m1819Lq(this.f5911x, z);
        }
        if ((j & 21) != 0) {
            AbstractC0795Op.m1823O4(this.f5907T, abstractC2222pt);
        }
        if (j3 != 0) {
            AbstractC0795Op.m1819Lq(this.f5904B, z5);
            this.f5904B.setProgress(i);
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        C0471Iu c0471Iu = (C0471Iu) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.f5908m |= 1;
            }
        } else if (i2 == 1) {
            synchronized (this) {
                this.f5908m |= 2;
            }
        } else if (i2 == 23) {
            synchronized (this) {
                this.f5908m |= 4;
            }
        } else {
            if (i2 != 37) {
                return false;
            }
            synchronized (this) {
                this.f5908m |= 8;
            }
        }
        return true;
    }

    @Override // p000a.InterfaceC1221Wo
    /* renamed from: h */
    public final void mo18h(View view, int i) {
        C0471Iu c0471Iu;
        if (i == 1) {
            c0471Iu = this.f6872O;
            if (!(c0471Iu != null)) {
                return;
            }
        } else {
            if (i != 2) {
                return;
            }
            c0471Iu = this.f6872O;
            if (!(c0471Iu != null)) {
                return;
            }
        }
        c0471Iu.m1141s();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (43 != i) {
            return false;
        }
        mo3510s((C0471Iu) obj);
        return true;
    }

    @Override // p000a.AbstractC2230q2
    /* renamed from: s */
    public final void mo3510s(C0471Iu c0471Iu) {
        m4818g(0, c0471Iu);
        this.f6872O = c0471Iu;
        synchronized (this) {
            this.f5908m |= 1;
        }
        m2861Q(43);
        m4816I();
    }
}
