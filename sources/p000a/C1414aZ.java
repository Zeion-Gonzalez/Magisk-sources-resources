package p000a;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: a.aZ */
/* loaded from: classes.dex */
public final class C1414aZ extends AbstractC2347s8 implements InterfaceC1221Wo {

    /* renamed from: O */
    public final ViewOnClickListenerC0574Kl f4431O;

    /* renamed from: d */
    public final FrameLayout f4432d;

    /* renamed from: n */
    public long f4433n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1414aZ(android.view.View r6) {
        /*
            r5 = this;
            r0 = 2
            r1 = 0
            java.lang.Object[] r0 = androidx.databinding.AbstractC2760z.m4814S(r6, r0, r1, r1)
            r2 = 1
            r3 = r0[r2]
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r5.<init>(r1, r6, r3)
            r3 = -1
            r5.f4433n = r3
            android.widget.ImageView r3 = r5.f7235j
            r3.setTag(r1)
            r3 = 0
            r0 = r0[r3]
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r5.f4432d = r0
            r0.setTag(r1)
            r0 = 2131296421(0x7f0900a5, float:1.8210758E38)
            r6.setTag(r0, r5)
            a.Kl r6 = new a.Kl
            r6.<init>(r2, r2, r5)
            r5.f4431O = r6
            r5.mo14M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1414aZ.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f4433n != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f4433n = 4L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        int i;
        synchronized (this) {
            j = this.f4433n;
            this.f4433n = 0L;
        }
        AbstractC2394t3 abstractC2394t3 = this.f7233L;
        long j2 = 6 & j;
        if (j2 != 0 && abstractC2394t3 != null) {
            i = abstractC2394t3.mo2524M();
        } else {
            i = 0;
        }
        if (j2 != 0) {
            this.f7235j.setImageResource(i);
        }
        if ((j & 4) != 0) {
            this.f4432d.setOnClickListener(this.f4431O);
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
            this.f4433n |= 1;
        }
        return true;
    }

    @Override // p000a.AbstractC2347s8
    /* renamed from: U */
    public final void mo2840U(C0471Iu c0471Iu) {
        m4818g(0, c0471Iu);
        this.f7234i = c0471Iu;
        synchronized (this) {
            this.f4433n |= 1;
        }
        m2861Q(43);
        m4816I();
    }

    @Override // p000a.InterfaceC1221Wo
    /* renamed from: h */
    public final void mo18h(View view, int i) {
        boolean z;
        AbstractC2394t3 abstractC2394t3 = this.f7233L;
        C0471Iu c0471Iu = this.f7234i;
        boolean z2 = true;
        if (c0471Iu != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (abstractC2394t3 == null) {
                z2 = false;
            }
            if (z2) {
                String mo1794V = abstractC2394t3.mo1794V();
                c0471Iu.getClass();
                c0471Iu.m4500S(new C1374Zi(mo1794V));
            }
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (20 == i) {
            mo2841s((AbstractC2394t3) obj);
        } else {
            if (43 != i) {
                return false;
            }
            mo2840U((C0471Iu) obj);
        }
        return true;
    }

    @Override // p000a.AbstractC2347s8
    /* renamed from: s */
    public final void mo2841s(AbstractC2394t3 abstractC2394t3) {
        this.f7233L = abstractC2394t3;
        synchronized (this) {
            this.f4433n |= 2;
        }
        m2861Q(20);
        m4816I();
    }
}
