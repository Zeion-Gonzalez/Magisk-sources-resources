package p000a;

import android.os.Environment;
import com.topjohnwu.magisk.R;
import java.io.File;

/* renamed from: a.lp */
/* loaded from: classes.dex */
public final class C2011lp extends AbstractC1479bq {

    /* renamed from: O */
    public final C0130CV f6252O;

    /* renamed from: n */
    public long f6253n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2011lp(android.view.View r6) {
        /*
            r5 = this;
            r0 = 3
            r1 = 0
            java.lang.Object[] r0 = androidx.databinding.AbstractC2760z.m4814S(r6, r0, r1, r1)
            r2 = 2
            r3 = r0[r2]
            com.google.android.material.textfield.TextInputEditText r3 = (com.google.android.material.textfield.TextInputEditText) r3
            r4 = 1
            r4 = r0[r4]
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5.<init>(r1, r6, r3, r4)
            a.CV r3 = new a.CV
            r3.<init>(r5, r2)
            r5.f6252O = r3
            r2 = -1
            r5.f6253n = r2
            com.google.android.material.textfield.TextInputEditText r2 = r5.f4595j
            r2.setTag(r1)
            android.widget.TextView r2 = r5.f4593L
            r2.setTag(r1)
            r2 = 0
            r0 = r0[r2]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r1)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r6.setTag(r0, r5)
            r5.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2011lp.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f6253n != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f6253n = 4L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        String str;
        String str2;
        boolean z;
        String str3;
        synchronized (this) {
            j = this.f6253n;
            this.f6253n = 0L;
        }
        C1676fV c1676fV = this.f4594i;
        long j2 = 7 & j;
        String str4 = null;
        if (j2 != 0) {
            if ((j & 5) != 0 && c1676fV != null) {
                str2 = C1676fV.f5245k;
            } else {
                str2 = null;
            }
            if (c1676fV != null) {
                String str5 = C1676fV.f5245k;
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (str5.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str3 = Environment.DIRECTORY_DOWNLOADS;
                } else {
                    str3 = Environment.DIRECTORY_DOWNLOADS + File.separator + str5;
                }
                str4 = new File(externalStorageDirectory, str3).getCanonicalPath();
            }
            str = this.f4593L.getResources().getString(R.string.settings_download_path_message, str4);
            str4 = str2;
        } else {
            str = null;
        }
        if ((j & 5) != 0) {
            AbstractC1843ih.m3398BO(this.f4595j, str4);
        }
        if ((j & 4) != 0) {
            AbstractC1843ih.m3445he(this.f4595j, this.f6252O);
        }
        if (j2 != 0) {
            AbstractC1843ih.m3398BO(this.f4593L, str);
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        C1676fV c1676fV = (C1676fV) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.f6253n |= 1;
            }
        } else {
            if (i2 != 28) {
                return false;
            }
            synchronized (this) {
                this.f6253n |= 2;
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
        mo2887s((C1676fV) obj);
        return true;
    }

    @Override // p000a.AbstractC1479bq
    /* renamed from: s */
    public final void mo2887s(C1676fV c1676fV) {
        m4818g(0, c1676fV);
        this.f4594i = c1676fV;
        synchronized (this) {
            this.f6253n |= 1;
        }
        m2861Q(6);
        m4816I();
    }
}
