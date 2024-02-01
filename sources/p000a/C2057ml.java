package p000a;

import android.view.View;
import androidx.databinding.AbstractC2760z;
import com.google.android.material.textview.MaterialTextView;
import com.topjohnwu.magisk.R;

/* renamed from: a.ml */
/* loaded from: classes.dex */
public final class C2057ml extends AbstractC2242qG {

    /* renamed from: L */
    public final MaterialTextView f6395L;

    /* renamed from: i */
    public long f6396i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2057ml(View view) {
        super(1, view, null);
        Object[] m4814S = AbstractC2760z.m4814S(view, 1, null, null);
        this.f6396i = -1L;
        MaterialTextView materialTextView = (MaterialTextView) m4814S[0];
        this.f6395L = materialTextView;
        materialTextView.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo14M();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f6396i != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f6396i = 2L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        String str;
        synchronized (this) {
            j = this.f6396i;
            this.f6396i = 0L;
        }
        C1921k7 c1921k7 = (C1921k7) this.f6897j;
        long j2 = j & 3;
        if (j2 != 0 && c1921k7 != null) {
            str = c1921k7.f5983R;
        } else {
            str = null;
        }
        if (j2 != 0) {
            AbstractC1843ih.m3398BO(this.f6395L, str);
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        C1921k7 c1921k7 = (C1921k7) obj;
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.f6396i |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (20 != i) {
            return false;
        }
        C1921k7 c1921k7 = (C1921k7) obj;
        m4818g(0, c1921k7);
        this.f6897j = c1921k7;
        synchronized (this) {
            this.f6396i |= 1;
        }
        m2861Q(20);
        m4816I();
        return true;
    }
}
