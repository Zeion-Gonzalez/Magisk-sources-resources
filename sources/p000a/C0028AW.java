package p000a;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.topjohnwu.widget.IndeterminateCheckBox;
import java.util.ArrayList;

/* renamed from: a.AW */
/* loaded from: classes.dex */
public final class C0028AW extends AbstractC2234q6 {

    /* renamed from: B */
    public ViewOnClickListenerC2660yB f153B;

    /* renamed from: D */
    public long f154D;

    /* renamed from: K */
    public final C0130CV f155K;

    /* renamed from: T */
    public final RecyclerView f156T;

    /* renamed from: t */
    public final ProgressBar f157t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0028AW(android.view.View r12) {
        /*
            r11 = this;
            r1 = 0
            r0 = 8
            r8 = 0
            java.lang.Object[] r9 = androidx.databinding.AbstractC2760z.m4814S(r12, r0, r8, r8)
            r0 = 1
            r0 = r9[r0]
            r3 = r0
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r0 = 5
            r0 = r9[r0]
            r4 = r0
            com.topjohnwu.widget.IndeterminateCheckBox r4 = (com.topjohnwu.widget.IndeterminateCheckBox) r4
            r0 = 2
            r0 = r9[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 3
            r0 = r9[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r10 = 4
            r0 = r9[r10]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            a.CV r0 = new a.CV
            r0.<init>(r11, r10)
            r11.f155K = r0
            r0 = -1
            r11.f154D = r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r11.f6886j
            r0.setTag(r8)
            com.topjohnwu.widget.IndeterminateCheckBox r0 = r11.f6882L
            r0.setTag(r8)
            android.widget.ImageView r0 = r11.f6885i
            r0.setTag(r8)
            android.widget.TextView r0 = r11.f6884d
            r0.setTag(r8)
            android.widget.TextView r0 = r11.f6883O
            r0.setTag(r8)
            r0 = 0
            r0 = r9[r0]
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            r0.setTag(r8)
            r0 = 6
            r0 = r9[r0]
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r11.f156T = r0
            r0.setTag(r8)
            r0 = 7
            r0 = r9[r0]
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r11.f157t = r0
            r0.setTag(r8)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r12.setTag(r0, r11)
            r11.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0028AW.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f154D != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f154D = 32L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        boolean z;
        int i;
        boolean z2;
        ArrayList arrayList;
        String str;
        String str2;
        Boolean bool;
        ViewOnClickListenerC2660yB viewOnClickListenerC2660yB;
        Drawable drawable;
        SparseArray sparseArray;
        int i2;
        C0826PP c0826pp;
        synchronized (this) {
            j = this.f154D;
            this.f154D = 0L;
        }
        C0256Eu c0256Eu = this.f6887n;
        C1164Vn c1164Vn = this.f6888x;
        boolean z3 = false;
        if ((63 & j) != 0) {
            if ((j & 35) != 0 && c0256Eu != null) {
                arrayList = c0256Eu.f917w;
            } else {
                arrayList = null;
            }
            if ((j & 33) != 0) {
                if (c0256Eu != null) {
                    c0826pp = c0256Eu.f914R;
                    viewOnClickListenerC2660yB = this.f153B;
                    if (viewOnClickListenerC2660yB == null) {
                        viewOnClickListenerC2660yB = new ViewOnClickListenerC2660yB();
                        this.f153B = viewOnClickListenerC2660yB;
                    }
                    viewOnClickListenerC2660yB.f8288R = c0256Eu;
                } else {
                    c0826pp = null;
                    viewOnClickListenerC2660yB = null;
                }
                if (c0826pp != null) {
                    drawable = c0826pp.f2800I;
                    str = c0826pp.f2804w;
                    str2 = c0826pp.f2802S.packageName;
                } else {
                    str = null;
                    str2 = null;
                    drawable = null;
                }
            } else {
                str = null;
                str2 = null;
                viewOnClickListenerC2660yB = null;
                drawable = null;
            }
            if ((j & 37) != 0 && c0256Eu != null) {
                bool = c0256Eu.f915k;
            } else {
                bool = null;
            }
            if ((j & 41) != 0 && c0256Eu != null) {
                z2 = c0256Eu.f913I;
            } else {
                z2 = false;
            }
            if ((j & 49) != 0) {
                if (c0256Eu != null) {
                    float size = (c0256Eu.f916q / c0256Eu.f917w.size()) * 100;
                    if (!Float.isNaN(size)) {
                        i2 = Math.round(size);
                    } else {
                        throw new IllegalArgumentException("Cannot round NaN value.");
                    }
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    z3 = true;
                }
                i = i2;
                z = z3;
            } else {
                z = false;
                i = 0;
            }
        } else {
            z = false;
            i = 0;
            z2 = false;
            arrayList = null;
            str = null;
            str2 = null;
            bool = null;
            viewOnClickListenerC2660yB = null;
            drawable = null;
        }
        long j2 = j & 35;
        if (j2 != 0 && c1164Vn != null) {
            sparseArray = c1164Vn.f3787E;
        } else {
            sparseArray = null;
        }
        if ((j & 33) != 0) {
            this.f6886j.setOnClickListener(viewOnClickListenerC2660yB);
            this.f6885i.setImageDrawable(drawable);
            AbstractC1843ih.m3398BO(this.f6884d, str);
            AbstractC1843ih.m3398BO(this.f6883O, str2);
        }
        if ((37 & j) != 0) {
            IndeterminateCheckBox indeterminateCheckBox = this.f6882L;
            if (!AbstractC1292YB.m2695u(indeterminateCheckBox.m5141u(), bool)) {
                if (bool != null) {
                    indeterminateCheckBox.setChecked(bool.booleanValue());
                } else {
                    indeterminateCheckBox.m5139W(true, true);
                }
            }
        }
        if ((32 & j) != 0) {
            this.f6882L.f9627B = new C0024AR(4, this.f155K);
        }
        if ((41 & j) != 0) {
            AbstractC0795Op.m1814Ha(this.f156T, z2);
        }
        if (j2 != 0) {
            AbstractC0795Op.m1846dx(this.f156T, arrayList, sparseArray);
        }
        if ((j & 49) != 0) {
            AbstractC0795Op.m1819Lq(this.f157t, z);
            this.f157t.setProgress(i);
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
            return m65s(i2);
        }
        C0256Eu c0256Eu = (C0256Eu) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.f154D |= 1;
            }
        } else if (i2 == 36) {
            synchronized (this) {
                this.f154D |= 4;
            }
        } else if (i2 == 11) {
            synchronized (this) {
                this.f154D |= 8;
            }
        } else {
            if (i2 != 5) {
                return false;
            }
            synchronized (this) {
                this.f154D |= 16;
            }
        }
        return true;
    }

    /* renamed from: U */
    public final void m64U(C1164Vn c1164Vn) {
        m4818g(1, c1164Vn);
        this.f6888x = c1164Vn;
        synchronized (this) {
            this.f154D |= 2;
        }
        m2861Q(43);
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (20 == i) {
            C0256Eu c0256Eu = (C0256Eu) obj;
            m4818g(0, c0256Eu);
            this.f6887n = c0256Eu;
            synchronized (this) {
                this.f154D |= 1;
            }
            m2861Q(20);
            m4816I();
        } else {
            if (43 != i) {
                return false;
            }
            m64U((C1164Vn) obj);
        }
        return true;
    }

    /* renamed from: s */
    public final boolean m65s(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f154D |= 2;
        }
        return true;
    }
}
