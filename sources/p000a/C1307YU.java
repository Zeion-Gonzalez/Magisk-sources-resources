package p000a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.AbstractC2760z;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.topjohnwu.magisk.R;

/* renamed from: a.YU */
/* loaded from: classes.dex */
public final class C1307YU extends AbstractC1155Vd implements InterfaceC1221Wo {

    /* renamed from: t */
    public static final SparseIntArray f4161t;

    /* renamed from: O */
    public final TextView f4162O;

    /* renamed from: T */
    public long f4163T;

    /* renamed from: d */
    public final MaterialCardView f4164d;

    /* renamed from: n */
    public final ImageView f4165n;

    /* renamed from: x */
    public final ViewOnClickListenerC0574Kl f4166x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4161t = sparseIntArray;
        sparseIntArray.put(R.id.theme_appbar, 3);
        sparseIntArray.put(R.id.theme_card_bottom, 4);
        sparseIntArray.put(R.id.theme_primary, 5);
        sparseIntArray.put(R.id.theme_navigation, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307YU(View view) {
        super(null, view);
        Object[] m4814S = AbstractC2760z.m4814S(view, 7, null, f4161t);
        AppBarLayout appBarLayout = (AppBarLayout) m4814S[3];
        MaterialCardView materialCardView = (MaterialCardView) m4814S[4];
        MaterialCardView materialCardView2 = (MaterialCardView) m4814S[6];
        LinearLayout linearLayout = (LinearLayout) m4814S[5];
        this.f4163T = -1L;
        MaterialCardView materialCardView3 = (MaterialCardView) m4814S[0];
        this.f4164d = materialCardView3;
        materialCardView3.setTag(null);
        int i = 1;
        TextView textView = (TextView) m4814S[1];
        this.f4162O = textView;
        textView.setTag(null);
        ImageView imageView = (ImageView) m4814S[2];
        this.f4165n = imageView;
        imageView.setTag(null);
        view.setTag(R.id.dataBinding, this);
        this.f4166x = new ViewOnClickListenerC0574Kl(i, i, this);
        mo14M();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f4163T != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f4163T = 4L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        synchronized (this) {
            j = this.f4163T;
            this.f4163T = 0L;
        }
        EnumC2349sC enumC2349sC = this.f3749L;
        long j2 = 6 & j;
        boolean z = false;
        String str = null;
        if (j2 != 0) {
            if (enumC2349sC != null) {
                str = enumC2349sC.f7241S;
                C1212We c1212We = C1212We.f3969z;
                c1212We.getClass();
                if (C1212We.f3943I.m1196O4(c1212We, C1212We.f3959h[10]).intValue() == enumC2349sC.ordinal()) {
                    z = true;
                }
            }
            z = !z;
        }
        if ((j & 4) != 0) {
            this.f4164d.setOnClickListener(this.f4166x);
        }
        if (j2 != 0) {
            AbstractC1843ih.m3398BO(this.f4162O, str);
            AbstractC0795Op.m1819Lq(this.f4165n, z);
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        C1091UT c1091ut = (C1091UT) obj;
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.f4163T |= 1;
        }
        return true;
    }

    @Override // p000a.InterfaceC1221Wo
    /* renamed from: h */
    public final void mo18h(View view, int i) {
        boolean z;
        EnumC2349sC enumC2349sC = this.f3749L;
        C1091UT c1091ut = this.f3750j;
        boolean z2 = true;
        if (c1091ut != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c1091ut.getClass();
            enumC2349sC.getClass();
            C1212We c1212We = C1212We.f3969z;
            c1212We.getClass();
            InterfaceC0609LP[] interfaceC0609LPArr = C1212We.f3959h;
            InterfaceC0609LP interfaceC0609LP = interfaceC0609LPArr[10];
            C0504JX c0504jx = C1212We.f3943I;
            if (c0504jx.m1196O4(c1212We, interfaceC0609LP).intValue() != enumC2349sC.ordinal()) {
                z2 = false;
            }
            if (!z2) {
                int ordinal = enumC2349sC.ordinal();
                c1212We.getClass();
                c0504jx.m1197nB(c1212We, interfaceC0609LPArr[10], ordinal);
                c1091ut.m4500S(new C1366ZZ(2));
            }
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (39 == i) {
            this.f3749L = (EnumC2349sC) obj;
            synchronized (this) {
                this.f4163T |= 2;
            }
            m2861Q(39);
            m4816I();
        } else if (43 == i) {
            m2705s((C1091UT) obj);
        } else {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final void m2705s(C1091UT c1091ut) {
        m4818g(0, c1091ut);
        this.f3750j = c1091ut;
        synchronized (this) {
            this.f4163T |= 1;
        }
        m2861Q(43);
        m4816I();
    }
}
