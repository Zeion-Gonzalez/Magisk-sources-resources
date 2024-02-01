package p000a;

import java.util.List;

/* renamed from: a.tR */
/* loaded from: classes.dex */
public final class C2412tR extends C1517cb {

    /* renamed from: I */
    public List f7386I = C1239X8.f4021S;

    /* renamed from: k */
    public InterfaceC2364sT f7387k;

    /* renamed from: q */
    public C0931RV f7388q;

    /* renamed from: w */
    public final InterfaceC1725gU f7389w;

    public C2412tR(InterfaceC1725gU interfaceC1725gU) {
        this.f7389w = interfaceC1725gU;
    }

    /* renamed from: M */
    public final void m4168M(InterfaceC2364sT interfaceC2364sT) {
        this.f7387k = interfaceC2364sT;
        C0931RV c0931rv = this.f7388q;
        if (c0931rv != null) {
            c0931rv.mo1719z(null);
        }
        this.f7388q = AbstractC0438II.m994F(this.f7389w, AbstractC0037Al.f179z, new C0311Fw(this, interfaceC2364sT, null), 2);
    }

    @Override // p000a.C1517cb
    /* renamed from: W */
    public final int mo2944W() {
        return this.f7386I.size();
    }

    @Override // p000a.C1517cb, java.util.AbstractList, java.util.List
    /* renamed from: o */
    public final InterfaceC0645M7 get(int i) {
        return (InterfaceC0645M7) this.f7386I.get(i);
    }
}
