package p000a;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.topjohnwu.magisk.R;

/* renamed from: a.X9 */
/* loaded from: classes.dex */
public final class C1240X9 extends AbstractC0765OH implements InterfaceC1221Wo, InterfaceC0684Mx {

    /* renamed from: nP */
    public static final SparseIntArray f4022nP;

    /* renamed from: D */
    public final ViewOnClickListenerC0574Kl f4023D;

    /* renamed from: K */
    public final ViewOnClickListenerC0574Kl f4024K;

    /* renamed from: b */
    public long f4025b;

    /* renamed from: l */
    public final C0130CV f4026l;

    /* renamed from: m */
    public final ViewOnTouchListenerC1863j6 f4027m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4022nP = sparseIntArray;
        sparseIntArray.put(R.id.su_popup, 7);
        sparseIntArray.put(R.id.request_title, 8);
        sparseIntArray.put(R.id.warning, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1240X9(android.view.View r20) {
        /*
            r19 = this;
            r12 = r19
            r13 = r20
            r1 = 0
            android.util.SparseIntArray r0 = p000a.C1240X9.f4022nP
            r2 = 10
            r14 = 0
            java.lang.Object[] r15 = androidx.databinding.AbstractC2760z.m4814S(r13, r2, r14, r0)
            r11 = 1
            r0 = r15[r11]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r10 = 2
            r0 = r15[r10]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 5
            r0 = r15[r0]
            r5 = r0
            android.widget.Button r5 = (android.widget.Button) r5
            r0 = 6
            r0 = r15[r0]
            r6 = r0
            android.widget.Button r6 = (android.widget.Button) r6
            r9 = 3
            r0 = r15[r9]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 8
            r0 = r15[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 7
            r0 = r15[r0]
            r16 = r0
            android.widget.LinearLayout r16 = (android.widget.LinearLayout) r16
            r0 = 4
            r0 = r15[r0]
            r17 = r0
            android.widget.Spinner r17 = (android.widget.Spinner) r17
            r0 = 9
            r0 = r15[r0]
            r18 = r0
            android.widget.TextView r18 = (android.widget.TextView) r18
            r0 = r19
            r2 = r20
            r9 = r16
            r10 = r17
            r11 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            a.CV r0 = new a.CV
            r1 = 0
            r0.<init>(r12, r1)
            r12.f4026l = r0
            r2 = -1
            r12.f4025b = r2
            android.widget.ImageView r0 = r12.f2601j
            r0.setTag(r14)
            android.widget.TextView r0 = r12.f2596L
            r0.setTag(r14)
            android.widget.Button r0 = r12.f2600i
            r0.setTag(r14)
            android.widget.Button r0 = r12.f2597O
            r0.setTag(r14)
            r0 = r15[r1]
            com.google.android.material.card.MaterialCardView r0 = (com.google.android.material.card.MaterialCardView) r0
            r0.setTag(r14)
            android.widget.TextView r0 = r12.f2602n
            r0.setTag(r14)
            android.view.View r0 = r12.f2603t
            android.widget.Spinner r0 = (android.widget.Spinner) r0
            r0.setTag(r14)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r13.setTag(r0, r12)
            a.Kl r0 = new a.Kl
            r1 = 1
            r2 = 2
            r0.<init>(r2, r1, r12)
            r12.f4024K = r0
            a.Kl r0 = new a.Kl
            r2 = 3
            r0.<init>(r2, r1, r12)
            r12.f4023D = r0
            a.j6 r0 = new a.j6
            r0.<init>(r12)
            r12.f4027m = r0
            r19.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1240X9.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f4025b != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f4025b = 16L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        long j2;
        int i;
        String str;
        Drawable drawable;
        boolean z;
        C2521vQ c2521vQ;
        String str2;
        ViewOnTouchListenerC0534K3 viewOnTouchListenerC0534K3;
        C2571wS c2571wS;
        synchronized (this) {
            j = this.f4025b;
            this.f4025b = 0L;
        }
        C1885jV c1885jV = (C1885jV) this.f2595B;
        if ((31 & j) != 0) {
            if ((j & 17) != 0 && c1885jV != null) {
                str = c1885jV.f5896s;
                if (str == null) {
                    str = null;
                }
                str2 = c1885jV.f5897y;
                if (str2 == null) {
                    str2 = null;
                }
                viewOnTouchListenerC0534K3 = c1885jV.f5895r;
                drawable = c1885jV.f5893g;
                if (drawable == null) {
                    drawable = null;
                }
            } else {
                str = null;
                drawable = null;
                str2 = null;
                viewOnTouchListenerC0534K3 = null;
            }
            if ((j & 19) != 0 && c1885jV != null) {
                z = c1885jV.f5892f;
            } else {
                z = false;
            }
            if ((j & 25) != 0 && c1885jV != null) {
                c2521vQ = c1885jV.f5889U;
            } else {
                c2521vQ = null;
            }
            if ((j & 21) != 0 && c1885jV != null) {
                i = c1885jV.f5887E;
            } else {
                i = 0;
            }
            j2 = 17;
        } else {
            j2 = 17;
            i = 0;
            str = null;
            drawable = null;
            z = false;
            c2521vQ = null;
            str2 = null;
            viewOnTouchListenerC0534K3 = null;
        }
        if ((j & j2) != 0) {
            this.f2601j.setImageDrawable(drawable);
            AbstractC1843ih.m3398BO(this.f2596L, str2);
            this.f2597O.setOnTouchListener(viewOnTouchListenerC0534K3);
            AbstractC1843ih.m3398BO(this.f2602n, str);
        }
        if ((16 & j) != 0) {
            this.f2600i.setOnClickListener(this.f4024K);
            this.f2597O.setOnClickListener(this.f4023D);
            ((Spinner) this.f2603t).setOnTouchListener(this.f4027m);
            Spinner spinner = (Spinner) this.f2603t;
            spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(spinner.getContext(), (int) R.layout.item_spinner, spinner.getResources().getStringArray(R.array.allow_timeout)));
            Spinner spinner2 = (Spinner) this.f2603t;
            C0130CV c0130cv = this.f4026l;
            if (c0130cv == null) {
                c2571wS = null;
            } else {
                c2571wS = new C2571wS(c0130cv);
            }
            spinner2.setOnItemSelectedListener(c2571wS);
        }
        if ((j & 25) != 0) {
            AbstractC0795Op.m1823O4(this.f2600i, c2521vQ);
        }
        if ((19 & j) != 0) {
            this.f2597O.setEnabled(z);
            ((Spinner) this.f2603t).setEnabled(z);
        }
        if ((j & 21) != 0) {
            Spinner spinner3 = (Spinner) this.f2603t;
            if (spinner3.getSelectedItemPosition() != i) {
                spinner3.setSelection(i);
            }
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        C1885jV c1885jV = (C1885jV) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.f4025b |= 1;
            }
        } else if (i2 == 13) {
            synchronized (this) {
                this.f4025b |= 2;
            }
        } else if (i2 == 31) {
            synchronized (this) {
                this.f4025b |= 4;
            }
        } else {
            if (i2 != 7) {
                return false;
            }
            synchronized (this) {
                this.f4025b |= 8;
            }
        }
        return true;
    }

    @Override // p000a.InterfaceC1221Wo
    /* renamed from: h */
    public final void mo18h(View view, int i) {
        boolean z = false;
        boolean z2 = true;
        if (i != 2) {
            if (i == 3) {
                C1885jV c1885jV = (C1885jV) this.f2595B;
                if (c1885jV == null) {
                    z2 = false;
                }
                if (z2) {
                    c1885jV.f5888J.cancel();
                    C2521vQ c2521vQ = c1885jV.f5889U;
                    if (c2521vQ.f7720h != 0) {
                        c2521vQ.f7720h = 0;
                        c2521vQ.f7721v.mo1709Q(7);
                    }
                    if (C1212We.f3969z.m2498Q()) {
                        c1885jV.m4500S(new C0259Ey(new C1407aQ(11, c1885jV)));
                        return;
                    } else {
                        c1885jV.m3506I(2);
                        return;
                    }
                }
                return;
            }
            return;
        }
        C1885jV c1885jV2 = (C1885jV) this.f2595B;
        if (c1885jV2 != null) {
            z = true;
        }
        if (z) {
            c1885jV2.m3506I(1);
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (43 != i) {
            return false;
        }
        C1885jV c1885jV = (C1885jV) obj;
        m4818g(0, c1885jV);
        this.f2595B = c1885jV;
        synchronized (this) {
            this.f4025b |= 1;
        }
        m2861Q(43);
        m4816I();
        return true;
    }
}
