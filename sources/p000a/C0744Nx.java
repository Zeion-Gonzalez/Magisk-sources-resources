package p000a;

import java.util.concurrent.CancellationException;

/* renamed from: a.Nx */
/* loaded from: classes.dex */
public final class C0744Nx extends AbstractC0154D implements InterfaceC0829PT, InterfaceC0969SB {

    /* renamed from: I */
    public final InterfaceC0969SB f2548I;

    public C0744Nx(InterfaceC1255XS interfaceC1255XS, C1066U0 c1066u0) {
        super(interfaceC1255XS, true);
        this.f2548I = c1066u0;
    }

    @Override // p000a.AbstractC0154D
    /* renamed from: B */
    public final void mo310B(Throwable th, boolean z) {
        if (this.f2548I.mo1717P(th) || z) {
            return;
        }
        AbstractC0438II.m1000J(this.f512w, th);
    }

    @Override // p000a.AbstractC0154D
    /* renamed from: K */
    public final void mo314K(Object obj) {
        C0329GJ c0329gj = (C0329GJ) obj;
        this.f2548I.mo1717P(null);
    }

    @Override // p000a.InterfaceC1604eC
    /* renamed from: P */
    public final boolean mo1717P(Throwable th) {
        return this.f2548I.mo1717P(th);
    }

    @Override // p000a.InterfaceC1604eC
    /* renamed from: Q */
    public final Object mo907Q(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return this.f2548I.mo907Q(obj, interfaceC1171Vv);
    }

    @Override // p000a.C0757O9
    /* renamed from: R */
    public final void mo1718R(CancellationException cancellationException) {
        this.f2548I.mo1719z(cancellationException);
        m1739S(cancellationException);
    }

    @Override // p000a.AbstractC0154D, p000a.C0757O9, p000a.InterfaceC1265Xh
    /* renamed from: h */
    public final boolean mo317h() {
        return super.mo317h();
    }

    @Override // p000a.InterfaceC1869jD
    public final C1844ii iterator() {
        return this.f2548I.iterator();
    }

    @Override // p000a.C0757O9, p000a.InterfaceC1265Xh, p000a.InterfaceC1869jD
    /* renamed from: z */
    public final void mo1719z(CancellationException cancellationException) {
        if (!m1742X()) {
            if (cancellationException == null) {
                cancellationException = new C0020AM(mo313I(), null, this);
            }
            mo1718R(cancellationException);
        }
    }
}
