package p000a;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.AbstractC2760z;
import com.topjohnwu.magisk.R;

/* renamed from: a.ZP */
/* loaded from: classes.dex */
public final class C1358ZP extends AbstractC2710zA {

    /* renamed from: L */
    public final TextView f4266L;

    /* renamed from: i */
    public long f4267i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358ZP(View view) {
        super(view, null);
        Object[] m4814S = AbstractC2760z.m4814S(view, 1, null, null);
        this.f4267i = -1L;
        TextView textView = (TextView) m4814S[0];
        this.f4266L = textView;
        textView.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo14M();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f4267i != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f4267i = 2L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        Integer num;
        synchronized (this) {
            j = this.f4267i;
            this.f4267i = 0L;
        }
        C1851ir c1851ir = this.f8537j;
        long j2 = j & 3;
        int i = 0;
        if (j2 != 0) {
            if (c1851ir != null) {
                num = Integer.valueOf(c1851ir.f5776S);
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
            }
        }
        if (j2 != 0) {
            TextView textView = this.f4266L;
            if (i == 0) {
                textView.setText((CharSequence) null);
            } else {
                textView.setText(i);
            }
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        return false;
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (20 != i) {
            return false;
        }
        mo2753s((C1851ir) obj);
        return true;
    }

    @Override // p000a.AbstractC2710zA
    /* renamed from: s */
    public final void mo2753s(C1851ir c1851ir) {
        this.f8537j = c1851ir;
        synchronized (this) {
            this.f4267i |= 1;
        }
        m2861Q(20);
        m4816I();
    }
}
