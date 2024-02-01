package androidx.activity;

import p000a.AbstractC0356Gp;
import p000a.AbstractC0783OZ;
import p000a.C1200WR;
import p000a.C1381Zr;
import p000a.C1385Zw;
import p000a.C2541vq;
import p000a.EnumC2241qF;
import p000a.InterfaceC1270Xo;
import p000a.InterfaceC1546d7;
import p000a.InterfaceC2582wf;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC1270Xo, InterfaceC2582wf {

    /* renamed from: I */
    public final /* synthetic */ C2752h f8630I;

    /* renamed from: R */
    public final AbstractC0356Gp f8631R;

    /* renamed from: S */
    public final AbstractC0783OZ f8632S;

    /* renamed from: w */
    public C1381Zr f8633w;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(C2752h c2752h, AbstractC0783OZ abstractC0783OZ, C1385Zw c1385Zw) {
        this.f8630I = c2752h;
        this.f8632S = abstractC0783OZ;
        this.f8631R = c1385Zw;
        abstractC0783OZ.mo728z(this);
    }

    @Override // p000a.InterfaceC1270Xo
    /* renamed from: Q */
    public final void mo2596Q(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
        if (enumC2241qF == EnumC2241qF.ON_START) {
            C2752h c2752h = this.f8630I;
            C1200WR c1200wr = c2752h.f8637h;
            AbstractC0356Gp abstractC0356Gp = this.f8631R;
            c1200wr.m2478N(abstractC0356Gp);
            C1381Zr c1381Zr = new C1381Zr(c2752h, abstractC0356Gp);
            abstractC0356Gp.f1203h.add(c1381Zr);
            c2752h.m4682P();
            abstractC0356Gp.f1204v = new C2541vq(1, c2752h);
            this.f8633w = c1381Zr;
            return;
        }
        if (enumC2241qF == EnumC2241qF.ON_STOP) {
            C1381Zr c1381Zr2 = this.f8633w;
            if (c1381Zr2 != null) {
                c1381Zr2.cancel();
                return;
            }
            return;
        }
        if (enumC2241qF == EnumC2241qF.ON_DESTROY) {
            cancel();
        }
    }

    @Override // p000a.InterfaceC2582wf
    public final void cancel() {
        this.f8632S.mo724h(this);
        this.f8631R.f1203h.remove(this);
        C1381Zr c1381Zr = this.f8633w;
        if (c1381Zr != null) {
            c1381Zr.cancel();
        }
        this.f8633w = null;
    }
}
