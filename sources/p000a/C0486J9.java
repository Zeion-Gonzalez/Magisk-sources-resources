package p000a;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.AbstractC2760z;
import com.topjohnwu.magisk.R;

/* renamed from: a.J9 */
/* loaded from: classes.dex */
public final class C0486J9 extends AbstractC2242qG {

    /* renamed from: L */
    public final TextView f1631L;

    /* renamed from: i */
    public long f1632i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0486J9(View view) {
        super(0, view, null);
        Object[] m4814S = AbstractC2760z.m4814S(view, 1, null, null);
        this.f1632i = -1L;
        TextView textView = (TextView) m4814S[0];
        this.f1631L = textView;
        textView.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo14M();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f1632i != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f1632i = 2L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        String str;
        synchronized (this) {
            j = this.f1632i;
            this.f1632i = 0L;
        }
        C0501JT c0501jt = (C0501JT) this.f6897j;
        long j2 = j & 3;
        if (j2 != 0 && c0501jt != null) {
            str = c0501jt.f1674S;
        } else {
            str = null;
        }
        if (j2 != 0) {
            AbstractC1843ih.m3398BO(this.f1631L, str);
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
        if (20 == i) {
            this.f6897j = (C0501JT) obj;
            synchronized (this) {
                this.f1632i |= 1;
            }
            m2861Q(20);
            m4816I();
            return true;
        }
        return false;
    }
}
