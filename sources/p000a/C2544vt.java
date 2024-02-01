package p000a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.AbstractC2760z;
import androidx.recyclerview.widget.RecyclerView;
import com.topjohnwu.magisk.R;
import java.util.List;

/* renamed from: a.vt */
/* loaded from: classes.dex */
public final class C2544vt extends AbstractC2012lq {

    /* renamed from: O */
    public long f7781O;

    /* renamed from: d */
    public final RecyclerView f7782d;

    /* renamed from: i */
    public final TextView f7783i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2544vt(View view) {
        super(view, null);
        Object[] m4814S = AbstractC2760z.m4814S(view, 3, null, null);
        this.f7781O = -1L;
        ((LinearLayout) m4814S[0]).setTag(null);
        TextView textView = (TextView) m4814S[1];
        this.f7783i = textView;
        textView.setTag(null);
        RecyclerView recyclerView = (RecyclerView) m4814S[2];
        this.f7782d = recyclerView;
        recyclerView.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo14M();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f7781O != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f7781O = 4L;
        }
        m4816I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.util.SparseArray] */
    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        List list;
        ?? r5;
        String str;
        synchronized (this) {
            j = this.f7781O;
            this.f7781O = 0L;
        }
        AbstractC1966kz abstractC1966kz = this.f6255j;
        C0471Iu c0471Iu = this.f6254L;
        long j2 = 7 & j;
        String str2 = null;
        if (j2 != 0) {
            if ((j & 6) != 0 && abstractC1966kz != null) {
                str = AbstractC2441tz.m4200k("@", abstractC1966kz.mo330u());
            } else {
                str = null;
            }
            if (abstractC1966kz != null) {
                list = abstractC1966kz.mo331z();
            } else {
                list = null;
            }
            if (c0471Iu != null) {
                str2 = c0471Iu.f1568Y;
            }
            r5 = str2;
            str2 = str;
        } else {
            list = null;
            r5 = 0;
        }
        if ((6 & j) != 0) {
            AbstractC1843ih.m3398BO(this.f7783i, str2);
        }
        if ((j & 4) != 0) {
            this.f7782d.setNestedScrollingEnabled(false);
        }
        if (j2 != 0) {
            AbstractC0795Op.m1846dx(this.f7782d, list, r5);
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
            this.f7781O |= 1;
        }
        return true;
    }

    @Override // p000a.AbstractC2012lq
    /* renamed from: U */
    public final void mo3651U(C0471Iu c0471Iu) {
        m4818g(0, c0471Iu);
        this.f6254L = c0471Iu;
        synchronized (this) {
            this.f7781O |= 1;
        }
        m2861Q(43);
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (20 == i) {
            mo3652s((AbstractC1966kz) obj);
        } else {
            if (43 != i) {
                return false;
            }
            mo3651U((C0471Iu) obj);
        }
        return true;
    }

    @Override // p000a.AbstractC2012lq
    /* renamed from: s */
    public final void mo3652s(AbstractC1966kz abstractC1966kz) {
        this.f6255j = abstractC1966kz;
        synchronized (this) {
            this.f7781O |= 2;
        }
        m2861Q(20);
        m4816I();
    }
}
