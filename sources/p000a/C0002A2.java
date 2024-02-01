package p000a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.topjohnwu.magisk.R;

/* renamed from: a.A2 */
/* loaded from: classes.dex */
public final class C0002A2 extends AbstractC2591wp implements InterfaceC1221Wo {

    /* renamed from: T */
    public static final SparseIntArray f58T;

    /* renamed from: O */
    public final TextView f59O;

    /* renamed from: d */
    public final MaterialCardView f60d;

    /* renamed from: n */
    public final ViewOnClickListenerC0574Kl f61n;

    /* renamed from: x */
    public long f62x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f58T = sparseIntArray;
        sparseIntArray.put(R.id.headline_icon_pointer, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0002A2(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = p000a.C0002A2.f58T
            r1 = 4
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.AbstractC2760z.m4814S(r6, r1, r2, r0)
            r1 = 3
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 1
            r3 = r0[r1]
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r5.<init>(r2, r6, r3)
            r3 = -1
            r5.f62x = r3
            r3 = 0
            r3 = r0[r3]
            com.google.android.material.card.MaterialCardView r3 = (com.google.android.material.card.MaterialCardView) r3
            r5.f60d = r3
            r3.setTag(r2)
            r3 = 2
            r0 = r0[r3]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.f59O = r0
            r0.setTag(r2)
            android.widget.ImageView r0 = r5.f7934j
            r0.setTag(r2)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r6.setTag(r0, r5)
            a.Kl r6 = new a.Kl
            r6.<init>(r1, r1, r5)
            r5.f61n = r6
            r5.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0002A2.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f62x != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f62x = 4L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.f62x;
            this.f62x = 0L;
        }
        AbstractC1351ZI abstractC1351ZI = this.f7932L;
        long j2 = 5 & j;
        if (j2 != 0 && abstractC1351ZI != null) {
            i = R.string.settings_dark_mode_title;
            i2 = R.drawable.ic_day_night;
        } else {
            i = 0;
            i2 = 0;
        }
        if ((j & 4) != 0) {
            this.f60d.setOnClickListener(this.f61n);
        }
        if (j2 != 0) {
            TextView textView = this.f59O;
            if (i == 0) {
                textView.setText((CharSequence) null);
            } else {
                textView.setText(i);
            }
            this.f7934j.setImageResource(i2);
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        return false;
    }

    @Override // p000a.AbstractC2591wp
    /* renamed from: U */
    public final void mo17U(C1091UT c1091ut) {
        this.f7933i = c1091ut;
        synchronized (this) {
            this.f62x |= 2;
        }
        m2861Q(21);
        m4816I();
    }

    @Override // p000a.InterfaceC1221Wo
    /* renamed from: h */
    public final void mo18h(View view, int i) {
        boolean z;
        AbstractC1351ZI abstractC1351ZI = this.f7932L;
        C1091UT c1091ut = this.f7933i;
        int i2 = 0;
        if (c1091ut != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c1091ut.getClass();
            if (abstractC1351ZI instanceof C1713gC) {
                c1091ut.m4499R(new C1665fK(i2));
                return;
            }
            throw new C0993Sd();
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (20 == i) {
            mo20s((AbstractC1351ZI) obj);
        } else {
            if (21 != i) {
                return false;
            }
            mo17U((C1091UT) obj);
        }
        return true;
    }

    @Override // p000a.AbstractC2591wp
    /* renamed from: s */
    public final void mo20s(AbstractC1351ZI abstractC1351ZI) {
        this.f7932L = abstractC1351ZI;
        synchronized (this) {
            this.f62x |= 1;
        }
        m2861Q(20);
        m4816I();
    }
}
