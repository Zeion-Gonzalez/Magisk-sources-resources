package p000a;

import java.util.ArrayList;

/* renamed from: a.MK */
/* loaded from: classes.dex */
public final class C0653MK implements InterfaceC1634ej {

    /* renamed from: I */
    public final InterfaceC1634ej f2102I;

    /* renamed from: q */
    public final int f2105q;

    /* renamed from: S */
    public final InterfaceC1255XS f2104S = C0070BN.f302S;

    /* renamed from: R */
    public final int f2103R = -2;

    /* renamed from: w */
    public final int f2106w = 1;

    public C0653MK(C1199WP c1199wp, int i) {
        this.f2102I = c1199wp;
        this.f2105q = i;
    }

    /* renamed from: h */
    public final String toString() {
        ArrayList arrayList = new ArrayList(4);
        String str = "concurrency=" + this.f2105q;
        if (str != null) {
            arrayList.add(str);
        }
        C0070BN c0070bn = C0070BN.f302S;
        InterfaceC1255XS interfaceC1255XS = this.f2104S;
        if (interfaceC1255XS != c0070bn) {
            arrayList.add("context=" + interfaceC1255XS);
        }
        int i = this.f2103R;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        int i2 = this.f2106w;
        if (i2 != 1) {
            arrayList.add("onBufferOverflow=".concat(AbstractC2441tz.m4193U(i2)));
        }
        return C0653MK.class.getSimpleName() + '[' + AbstractC2486us.m4276EQ(arrayList, ", ", null, null, null, 62) + ']';
    }

    @Override // p000a.InterfaceC1634ej
    /* renamed from: z */
    public final Object mo1459z(InterfaceC2445u2 interfaceC2445u2, InterfaceC1171Vv interfaceC1171Vv) {
        C0938Re c0938Re = new C0938Re(null, interfaceC2445u2, this);
        C2485ur c2485ur = new C2485ur(interfaceC1171Vv, interfaceC1171Vv.mo315N());
        Object m2691qn = AbstractC1292YB.m2691qn(c2485ur, c2485ur, c0938Re);
        if (m2691qn != EnumC0464Im.f1557S) {
            return C0329GJ.f1115z;
        }
        return m2691qn;
    }
}
