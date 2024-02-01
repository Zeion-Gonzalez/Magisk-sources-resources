package p000a;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.Space;
import com.google.android.material.card.MaterialCardView;
import com.topjohnwu.magisk.R;

/* renamed from: a.mB */
/* loaded from: classes.dex */
public final class C2028mB extends AbstractC1588du implements InterfaceC1221Wo {

    /* renamed from: nF */
    public static final SparseIntArray f6296nF;

    /* renamed from: od */
    public static final C1174Vy f6297od;

    /* renamed from: B */
    public final AbstractC2347s8 f6298B;

    /* renamed from: D */
    public final AbstractC2012lq f6299D;

    /* renamed from: HL */
    public long f6300HL;

    /* renamed from: K */
    public final AbstractC2012lq f6301K;

    /* renamed from: O */
    public final Button f6302O;

    /* renamed from: T */
    public final Button f6303T;

    /* renamed from: Yd */
    public final ViewOnClickListenerC0574Kl f6304Yd;

    /* renamed from: b */
    public final AbstractC2012lq f6305b;

    /* renamed from: l */
    public final AbstractC2012lq f6306l;

    /* renamed from: m */
    public final AbstractC2012lq f6307m;

    /* renamed from: n */
    public final MaterialCardView f6308n;

    /* renamed from: nP */
    public final ViewOnClickListenerC0574Kl f6309nP;

    /* renamed from: qn */
    public final ViewOnClickListenerC0574Kl f6310qn;

    /* renamed from: t */
    public final AbstractC2347s8 f6311t;

    /* renamed from: x */
    public final Space f6312x;

    static {
        C1174Vy c1174Vy = new C1174Vy(19);
        f6297od = c1174Vy;
        c1174Vy.m2398g(1, new int[]{9, 10}, new int[]{R.layout.include_home_magisk, R.layout.include_home_manager}, new String[]{"include_home_magisk", "include_home_manager"});
        c1174Vy.m2398g(7, new int[]{11, 12}, new int[]{R.layout.item_icon_link, R.layout.item_icon_link}, new String[]{"item_icon_link", "item_icon_link"});
        c1174Vy.m2398g(8, new int[]{13, 14, 15, 16, 17}, new int[]{R.layout.item_developer, R.layout.item_developer, R.layout.item_developer, R.layout.item_developer, R.layout.item_developer}, new String[]{"item_developer", "item_developer", "item_developer", "item_developer", "item_developer"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6296nF = sparseIntArray;
        sparseIntArray.put(R.id.home_notice_content, 18);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2028mB(android.view.View r8) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2028mB.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            if (this.f6300HL != 0) {
                return true;
            }
            return this.f4880j.mo13G() || this.f4877L.mo13G() || this.f6311t.mo13G() || this.f6298B.mo13G() || this.f6301K.mo13G() || this.f6299D.mo13G() || this.f6307m.mo13G() || this.f6306l.mo13G() || this.f6305b.mo13G();
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f6300HL = 16L;
        }
        this.f4880j.mo14M();
        this.f4877L.mo14M();
        this.f6311t.mo14M();
        this.f6298B.mo14M();
        this.f6301K.mo14M();
        this.f6299D.mo14M();
        this.f6307m.mo14M();
        this.f6306l.mo14M();
        this.f6305b.mo14M();
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        C0410Hm m3543z;
        synchronized (this) {
            j = this.f6300HL;
            this.f6300HL = 0L;
        }
        C0471Iu c0471Iu = this.f4878d;
        long j2 = 16 & j;
        boolean z4 = false;
        if (j2 != 0 && (m3543z = C1910jw.m3543z()) != null) {
            z = m3543z.f1382N;
        } else {
            z = false;
        }
        long j3 = 28 & j;
        if (j3 != 0) {
            if ((j & 20) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c0471Iu != null) {
                z4 = c0471Iu.f1567U;
            }
            boolean z5 = z3;
            z2 = z4;
            z4 = z5;
        } else {
            z2 = false;
        }
        if ((j & 20) != 0) {
            this.f4880j.mo66s(c0471Iu);
            this.f4877L.mo3510s(c0471Iu);
            AbstractC0795Op.m1819Lq(this.f6302O, z4);
            this.f6311t.mo2840U(c0471Iu);
            this.f6298B.mo2840U(c0471Iu);
            this.f6301K.mo3651U(c0471Iu);
            this.f6299D.mo3651U(c0471Iu);
            this.f6307m.mo3651U(c0471Iu);
            this.f6306l.mo3651U(c0471Iu);
            this.f6305b.mo3651U(c0471Iu);
        }
        if (j2 != 0) {
            this.f4879i.setOnClickListener(this.f6309nP);
            this.f6302O.setOnClickListener(this.f6310qn);
            AbstractC0795Op.m1814Ha(this.f6312x, z);
            AbstractC0795Op.m1814Ha(this.f6303T, z);
            this.f6303T.setOnClickListener(this.f6304Yd);
            this.f6311t.mo2841s(C1227Wv.f3995S);
            this.f6298B.mo2841s(C1545d6.f4778R);
            this.f6301K.mo3652s(C1795hm.f5649S);
            this.f6299D.mo3652s(C0168DG.f528S);
            this.f6307m.mo3652s(C2040mP.f6360S);
            this.f6306l.mo3652s(C0174DO.f540S);
            this.f6305b.mo3652s(C2007ll.f6233S);
        }
        if (j3 != 0) {
            AbstractC0795Op.m1814Ha(this.f6308n, z2);
        }
        this.f4880j.m4819u();
        this.f4877L.m4819u();
        this.f6311t.m4819u();
        this.f6298B.m4819u();
        this.f6301K.m4819u();
        this.f6299D.m4819u();
        this.f6307m.m4819u();
        this.f6306l.m4819u();
        this.f6305b.m4819u();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                C0471Iu c0471Iu = (C0471Iu) obj;
                return m3667U(i2);
            }
            AbstractC1441b1 abstractC1441b1 = (AbstractC1441b1) obj;
            return m3668s(i2);
        }
        AbstractC2230q2 abstractC2230q2 = (AbstractC2230q2) obj;
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.f6300HL |= 1;
        }
        return true;
    }

    /* renamed from: U */
    public final boolean m3667U(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f6300HL |= 4;
            }
            return true;
        }
        if (i != 27) {
            return false;
        }
        synchronized (this) {
            this.f6300HL |= 8;
        }
        return true;
    }

    @Override // p000a.InterfaceC1221Wo
    /* renamed from: h */
    public final void mo18h(View view, int i) {
        int i2 = 3;
        boolean z = false;
        boolean z2 = true;
        if (i != 1) {
            int i3 = 2;
            if (i != 2) {
                if (i == 3) {
                    C0471Iu c0471Iu = this.f4878d;
                    if (c0471Iu != null) {
                        z = true;
                    }
                    if (z) {
                        c0471Iu.getClass();
                        c0471Iu.m4499R(new C1665fK(i3));
                        return;
                    }
                    return;
                }
                return;
            }
            C0471Iu c0471Iu2 = this.f4878d;
            if (c0471Iu2 == null) {
                z2 = false;
            }
            if (z2) {
                c0471Iu2.getClass();
                C1212We c1212We = C1212We.f3969z;
                c1212We.getClass();
                C1212We.f3949R.m3359nB(c1212We, C1212We.f3959h[8], false);
                if (c0471Iu2.f1567U) {
                    c0471Iu2.f1567U = false;
                    AbstractC0795Op.m1801B(c0471Iu2, 27);
                    return;
                }
                return;
            }
            return;
        }
        C0471Iu c0471Iu3 = this.f4878d;
        if (c0471Iu3 != null) {
            z = true;
        }
        if (z) {
            c0471Iu3.getClass();
            c0471Iu3.m4500S(new C1366ZZ(i2));
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (43 == i) {
            C0471Iu c0471Iu = (C0471Iu) obj;
            m4818g(2, c0471Iu);
            this.f4878d = c0471Iu;
            synchronized (this) {
                this.f6300HL |= 4;
            }
            m2861Q(43);
            m4816I();
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: q */
    public final void mo2815q(InterfaceC1546d7 interfaceC1546d7) {
        super.mo2815q(interfaceC1546d7);
        this.f4880j.mo2815q(interfaceC1546d7);
        this.f4877L.mo2815q(interfaceC1546d7);
        this.f6311t.mo2815q(interfaceC1546d7);
        this.f6298B.mo2815q(interfaceC1546d7);
        this.f6301K.mo2815q(interfaceC1546d7);
        this.f6299D.mo2815q(interfaceC1546d7);
        this.f6307m.mo2815q(interfaceC1546d7);
        this.f6306l.mo2815q(interfaceC1546d7);
        this.f6305b.mo2815q(interfaceC1546d7);
    }

    /* renamed from: s */
    public final boolean m3668s(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f6300HL |= 2;
        }
        return true;
    }
}
