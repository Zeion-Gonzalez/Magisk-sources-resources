package p000a;

import java.util.Iterator;

/* renamed from: a.iT */
/* loaded from: classes.dex */
public final class C1831iT implements InterfaceC2296rE {

    /* renamed from: h */
    public final Object f5725h;

    /* renamed from: v */
    public final InterfaceC2364sT f5726v;

    /* renamed from: z */
    public final /* synthetic */ int f5727z;

    public C1831iT(C1407aQ c1407aQ, C1980lF c1980lF) {
        this.f5727z = 3;
        this.f5725h = c1407aQ;
        this.f5726v = c1980lF;
    }

    @Override // p000a.InterfaceC2296rE
    public final Iterator iterator() {
        switch (this.f5727z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new C1673fS(((InterfaceC2296rE) this.f5725h).iterator(), this.f5726v);
            case 1:
                return new C0923RN(this);
            case 2:
                return new C0126CP(this);
            default:
                return new C0155D0(this);
        }
    }

    public C1831iT(InterfaceC2296rE interfaceC2296rE, InterfaceC2364sT interfaceC2364sT, int i) {
        this.f5727z = i;
        if (i == 1) {
            this.f5725h = interfaceC2296rE;
            this.f5726v = interfaceC2364sT;
        } else if (i != 2) {
            this.f5725h = interfaceC2296rE;
            this.f5726v = interfaceC2364sT;
        } else {
            this.f5725h = interfaceC2296rE;
            this.f5726v = interfaceC2364sT;
        }
    }
}
