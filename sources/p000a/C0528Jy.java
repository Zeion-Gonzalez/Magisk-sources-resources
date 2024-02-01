package p000a;

import android.view.Window;

/* renamed from: a.Jy */
/* loaded from: classes.dex */
public final class C0528Jy implements InterfaceC0656MP {

    /* renamed from: R */
    public final /* synthetic */ LayoutInflaterFactory2C1392a6 f1772R;

    /* renamed from: S */
    public final /* synthetic */ int f1773S;

    public /* synthetic */ C0528Jy(LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6, int i) {
        this.f1773S = i;
        this.f1772R = layoutInflaterFactory2C1392a6;
    }

    @Override // p000a.InterfaceC0656MP
    /* renamed from: v */
    public final boolean mo1242v(C2189pE c2189pE) {
        Window.Callback m2799e;
        int i = this.f1773S;
        LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = this.f1772R;
        switch (i) {
            case 2:
                Window.Callback m2799e2 = layoutInflaterFactory2C1392a6.m2799e();
                if (m2799e2 != null) {
                    m2799e2.onMenuOpened(108, c2189pE);
                }
                return true;
            default:
                if (c2189pE == c2189pE.mo2451M() && layoutInflaterFactory2C1392a6.f4383t && (m2799e = layoutInflaterFactory2C1392a6.m2799e()) != null && !layoutInflaterFactory2C1392a6.f4379od) {
                    m2799e.onMenuOpened(108, c2189pE);
                }
                return true;
        }
    }

    @Override // p000a.InterfaceC0656MP
    /* renamed from: z */
    public final void mo1243z(C2189pE c2189pE, boolean z) {
        boolean z2;
        int i;
        C1678fX c1678fX;
        int i2 = this.f1773S;
        LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = this.f1772R;
        switch (i2) {
            case 2:
                layoutInflaterFactory2C1392a6.m2813y(c2189pE);
                return;
            default:
                C2189pE mo2451M = c2189pE.mo2451M();
                int i3 = 0;
                if (mo2451M != c2189pE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    c2189pE = mo2451M;
                }
                C1678fX[] c1678fXArr = layoutInflaterFactory2C1392a6.f4363b;
                if (c1678fXArr != null) {
                    i = c1678fXArr.length;
                } else {
                    i = 0;
                }
                while (true) {
                    if (i3 < i) {
                        c1678fX = c1678fXArr[i3];
                        if (c1678fX == null || c1678fX.f5261o != c2189pE) {
                            i3++;
                        }
                    } else {
                        c1678fX = null;
                    }
                }
                if (c1678fX != null) {
                    if (z2) {
                        layoutInflaterFactory2C1392a6.m2801g(c1678fX.f5265z, c1678fX, mo2451M);
                        layoutInflaterFactory2C1392a6.m2809s(c1678fX, true);
                        return;
                    } else {
                        layoutInflaterFactory2C1392a6.m2809s(c1678fX, z);
                        return;
                    }
                }
                return;
        }
    }
}
