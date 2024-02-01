package p000a;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.topjohnwu.magisk.R;

/* renamed from: a.Aa */
/* loaded from: classes.dex */
public final class C0029Aa extends AbstractC1441b1 implements InterfaceC1221Wo {

    /* renamed from: m */
    public static final SparseIntArray f158m;

    /* renamed from: B */
    public final ViewOnClickListenerC0574Kl f159B;

    /* renamed from: D */
    public long f160D;

    /* renamed from: K */
    public final ViewOnClickListenerC0574Kl f161K;

    /* renamed from: O */
    public final Button f162O;

    /* renamed from: T */
    public final TextView f163T;

    /* renamed from: n */
    public final Button f164n;

    /* renamed from: t */
    public final TextView f165t;

    /* renamed from: x */
    public final TextView f166x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f158m = sparseIntArray;
        sparseIntArray.put(R.id.home_magisk_icon, 7);
        sparseIntArray.put(R.id.home_magisk_title, 8);
        sparseIntArray.put(R.id.home_magisk_button, 9);
        sparseIntArray.put(R.id.home_magisk_installed_version, 10);
        sparseIntArray.put(R.id.home_device_details_zygisk, 11);
        sparseIntArray.put(R.id.home_device_details_ramdisk, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0029Aa(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            android.util.SparseIntArray r0 = p000a.C0029Aa.f158m
            r2 = 13
            r6 = 0
            java.lang.Object[] r7 = androidx.databinding.AbstractC2760z.m4814S(r9, r2, r6, r0)
            r0 = 12
            r0 = r7[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 11
            r0 = r7[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 9
            r0 = r7[r0]
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0 = 7
            r0 = r7[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 10
            r0 = r7[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 8
            r0 = r7[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 3
            r0 = r7[r0]
            r5 = r0
            androidx.constraintlayout.widget.Barrier r5 = (androidx.constraintlayout.widget.Barrier) r5
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r8.f160D = r0
            androidx.constraintlayout.widget.Barrier r0 = r8.f4516i
            r0.setTag(r6)
            r0 = 0
            r0 = r7[r0]
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            r0.setTag(r6)
            r0 = 1
            r1 = r7[r0]
            android.widget.Button r1 = (android.widget.Button) r1
            r8.f162O = r1
            r1.setTag(r6)
            r1 = 2
            r2 = r7[r1]
            android.widget.Button r2 = (android.widget.Button) r2
            r8.f164n = r2
            r2.setTag(r6)
            r2 = 4
            r2 = r7[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r8.f166x = r2
            r2.setTag(r6)
            r2 = 5
            r2 = r7[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r8.f163T = r2
            r2.setTag(r6)
            r2 = 6
            r2 = r7[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r8.f165t = r2
            r2.setTag(r6)
            r2 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r9.setTag(r2, r8)
            a.Kl r9 = new a.Kl
            r9.<init>(r0, r0, r8)
            r8.f159B = r9
            a.Kl r9 = new a.Kl
            r9.<init>(r1, r0, r8)
            r8.f161K = r9
            r8.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0029Aa.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f160D != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f160D = 2L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        String str;
        AbstractC2222pt abstractC2222pt;
        boolean z;
        boolean z2;
        String string;
        int[] iArr;
        boolean z3;
        boolean z4;
        String str2;
        long j2;
        long j3;
        synchronized (this) {
            j = this.f160D;
            this.f160D = 0L;
        }
        C0471Iu c0471Iu = this.f4515d;
        long j4 = j & 2;
        int[] iArr2 = null;
        EnumC2302rL enumC2302rL = null;
        if (j4 != 0) {
            boolean z5 = C1910jw.f5952G;
            if (j4 != 0) {
                if (z5) {
                    j3 = 32;
                } else {
                    j3 = 16;
                }
                j |= j3;
            }
            if ((j & 2) != 0) {
                if (C1910jw.f5961W) {
                    j2 = 8;
                } else {
                    j2 = 4;
                }
                j |= j2;
            }
            Resources resources = this.f165t.getResources();
            if (z5) {
                str = resources.getString(R.string.yes);
            } else {
                str = resources.getString(R.string.f9662no);
            }
        } else {
            str = null;
        }
        long j5 = 3 & j;
        if (j5 != 0) {
            if (c0471Iu != null) {
                enumC2302rL = C0471Iu.m1137g();
                C0410Hm m3543z = C1910jw.m3543z();
                if (m3543z.f1382N) {
                    if (m3543z.f1384h) {
                        str2 = " (D)";
                    } else {
                        str2 = "";
                    }
                    abstractC2222pt = new C1961ku(m3543z.f1386z + " (" + m3543z.f1385v + ")" + str2);
                } else {
                    abstractC2222pt = new C0639M1(R.string.not_available);
                }
                iArr = c0471Iu.f1573y;
            } else {
                iArr = null;
                abstractC2222pt = null;
            }
            EnumC2302rL enumC2302rL2 = EnumC2302rL.f7105w;
            if (enumC2302rL != enumC2302rL2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (enumC2302rL == enumC2302rL2) {
                z4 = true;
            } else {
                z4 = false;
            }
            iArr2 = iArr;
            z = z4;
            z2 = z3;
        } else {
            abstractC2222pt = null;
            z = false;
            z2 = false;
        }
        if (j5 != 0) {
            this.f4516i.m1171M(iArr2);
            AbstractC0795Op.m1819Lq(this.f162O, z2);
            AbstractC0795Op.m1819Lq(this.f164n, z);
            AbstractC0795Op.m1823O4(this.f166x, abstractC2222pt);
        }
        if ((j & 2) != 0) {
            this.f162O.setOnClickListener(this.f159B);
            this.f164n.setOnClickListener(this.f161K);
            TextView textView = this.f163T;
            if (C1910jw.f5961W) {
                string = textView.getResources().getString(R.string.yes);
            } else {
                string = textView.getResources().getString(R.string.f9662no);
            }
            AbstractC1843ih.m3398BO(textView, string);
            AbstractC1843ih.m3398BO(this.f165t, str);
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        C0471Iu c0471Iu = (C0471Iu) obj;
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.f160D |= 1;
        }
        return true;
    }

    @Override // p000a.InterfaceC1221Wo
    /* renamed from: h */
    public final void mo18h(View view, int i) {
        C0471Iu c0471Iu;
        if (i == 1) {
            c0471Iu = this.f4515d;
            if (!(c0471Iu != null)) {
                return;
            }
        } else {
            if (i != 2) {
                return;
            }
            c0471Iu = this.f4515d;
            if (!(c0471Iu != null)) {
                return;
            }
        }
        c0471Iu.m1142y();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (43 != i) {
            return false;
        }
        mo66s((C0471Iu) obj);
        return true;
    }

    @Override // p000a.AbstractC1441b1
    /* renamed from: s */
    public final void mo66s(C0471Iu c0471Iu) {
        m4818g(0, c0471Iu);
        this.f4515d = c0471Iu;
        synchronized (this) {
            this.f160D |= 1;
        }
        m2861Q(43);
        m4816I();
    }
}
