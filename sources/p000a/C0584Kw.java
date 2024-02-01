package p000a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.AbstractC2760z;
import com.topjohnwu.magisk.R;

/* renamed from: a.Kw */
/* loaded from: classes.dex */
public final class C0584Kw extends AbstractC2242qG {

    /* renamed from: L */
    public final TextView f1897L;

    /* renamed from: d */
    public long f1898d;

    /* renamed from: i */
    public final TextView f1899i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0584Kw(View view) {
        super(1, view, null);
        Object[] m4814S = AbstractC2760z.m4814S(view, 3, null, null);
        this.f1898d = -1L;
        ((LinearLayout) m4814S[0]).setTag(null);
        TextView textView = (TextView) m4814S[1];
        this.f1897L = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) m4814S[2];
        this.f1899i = textView2;
        textView2.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo14M();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f1898d != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f1898d = 4L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        boolean z;
        AbstractC2222pt abstractC2222pt;
        boolean z2;
        AbstractC2222pt abstractC2222pt2;
        synchronized (this) {
            j = this.f1898d;
            this.f1898d = 0L;
        }
        AbstractC2207pZ abstractC2207pZ = (AbstractC2207pZ) this.f6897j;
        long j2 = 7 & j;
        if (j2 != 0) {
            if ((j & 5) != 0) {
                abstractC2222pt2 = abstractC2207pZ != null ? abstractC2207pZ.mo30R() : null;
                z2 = abstractC2222pt2 != null ? abstractC2222pt2.mo1431h() : false;
            } else {
                z2 = false;
                abstractC2222pt2 = null;
            }
            r9 = abstractC2207pZ != null ? abstractC2207pZ.mo234M() : null;
            z = r9 != null ? r9.mo1431h() : false;
            r8 = z2;
            AbstractC2222pt abstractC2222pt3 = abstractC2222pt2;
            abstractC2222pt = r9;
            r9 = abstractC2222pt3;
        } else {
            z = false;
            abstractC2222pt = null;
        }
        if ((j & 5) != 0) {
            AbstractC0795Op.m1819Lq(this.f1897L, r8);
            AbstractC0795Op.m1823O4(this.f1897L, r9);
        }
        if (j2 != 0) {
            AbstractC0795Op.m1819Lq(this.f1899i, z);
            AbstractC0795Op.m1823O4(this.f1899i, abstractC2222pt);
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
                this.f1898d |= 1;
            }
        } else {
            if (i2 != 8) {
                return false;
            }
            synchronized (this) {
                this.f1898d |= 2;
            }
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (20 != i) {
            return false;
        }
        AbstractC2207pZ abstractC2207pZ = (AbstractC2207pZ) obj;
        m4818g(0, abstractC2207pZ);
        this.f6897j = abstractC2207pZ;
        synchronized (this) {
            this.f1898d |= 1;
        }
        m2861Q(20);
        m4816I();
        return true;
    }
}
