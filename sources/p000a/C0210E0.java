package p000a;

import android.content.res.Resources;
import android.text.Editable;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.topjohnwu.magisk.R;

/* renamed from: a.E0 */
/* loaded from: classes.dex */
public final class C0210E0 extends AbstractC0188Dd {

    /* renamed from: O */
    public final C0130CV f664O;

    /* renamed from: d */
    public final TextInputLayout f665d;

    /* renamed from: n */
    public long f666n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0210E0(android.view.View r7) {
        /*
            r6 = this;
            r0 = 3
            r1 = 0
            java.lang.Object[] r0 = androidx.databinding.AbstractC2760z.m4814S(r7, r0, r1, r1)
            r2 = 2
            r2 = r0[r2]
            com.google.android.material.textfield.TextInputEditText r2 = (com.google.android.material.textfield.TextInputEditText) r2
            r6.<init>(r1, r7, r2)
            a.CV r2 = new a.CV
            r3 = 1
            r2.<init>(r6, r3)
            r6.f664O = r2
            r4 = -1
            r6.f666n = r4
            com.google.android.material.textfield.TextInputEditText r2 = r6.f581j
            r2.setTag(r1)
            r2 = 0
            r2 = r0[r2]
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.setTag(r1)
            r0 = r0[r3]
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            r6.f665d = r0
            r0.setTag(r1)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r7.setTag(r0, r6)
            r6.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0210E0.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f666n != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f666n = 8L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        String str;
        String str2;
        int i;
        boolean z;
        Editable text;
        int i2;
        boolean z2;
        Resources resources;
        int i3;
        long j2;
        synchronized (this) {
            j = this.f666n;
            this.f666n = 0L;
        }
        C2360sP c2360sP = this.f580L;
        CharSequence charSequence = null;
        if ((15 & j) != 0) {
            if ((j & 13) != 0 && c2360sP != null) {
                str2 = C2360sP.f7259y;
            } else {
                str2 = null;
            }
            if ((j & 9) != 0 && c2360sP != null) {
                i2 = 32;
            } else {
                i2 = 0;
            }
            long j3 = j & 11;
            if (j3 != 0) {
                if (c2360sP != null && (C2360sP.f7259y.length() > 32 || AbstractC1269Xn.m2579T0(C2360sP.f7259y))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (j3 != 0) {
                    if (z2) {
                        j2 = 32;
                    } else {
                        j2 = 16;
                    }
                    j |= j2;
                }
                if (z2) {
                    resources = this.f665d.getResources();
                    i3 = R.string.settings_app_name_error;
                } else {
                    resources = this.f665d.getResources();
                    i3 = R.string.empty;
                }
                str = resources.getString(i3);
            } else {
                str = null;
            }
            i = i2;
        } else {
            str = null;
            str2 = null;
            i = 0;
        }
        if ((13 & j) != 0) {
            AbstractC1843ih.m3398BO(this.f581j, str2);
        }
        if ((8 & j) != 0) {
            AbstractC1843ih.m3445he(this.f581j, this.f664O);
        }
        if ((9 & j) != 0) {
            TextInputLayout textInputLayout = this.f665d;
            if (textInputLayout.f9483f != i) {
                if (i <= 0) {
                    i = -1;
                }
                textInputLayout.f9483f = i;
                if (textInputLayout.f9444E && textInputLayout.f9476c != null) {
                    EditText editText = textInputLayout.f9453I;
                    if (editText == null) {
                        text = null;
                    } else {
                        text = editText.getText();
                    }
                    textInputLayout.m5099k(text);
                }
            }
        }
        if ((j & 11) != 0) {
            TextInputLayout textInputLayout2 = this.f665d;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = null;
            }
            C0446IU c0446iu = textInputLayout2.f9469U;
            if (c0446iu.f1508q) {
                charSequence = c0446iu.f1491I;
            }
            if (charSequence != null || str != null) {
                textInputLayout2.m5085M(str);
            }
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        C2360sP c2360sP = (C2360sP) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.f666n |= 1;
            }
        } else if (i2 == 10) {
            synchronized (this) {
                this.f666n |= 2;
            }
        } else {
            if (i2 != 30) {
                return false;
            }
            synchronized (this) {
                this.f666n |= 4;
            }
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (6 != i) {
            return false;
        }
        C2360sP c2360sP = (C2360sP) obj;
        m4818g(0, c2360sP);
        this.f580L = c2360sP;
        synchronized (this) {
            this.f666n |= 1;
        }
        m2861Q(6);
        m4816I();
        return true;
    }
}
