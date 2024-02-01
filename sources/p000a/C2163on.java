package p000a;

/* renamed from: a.on */
/* loaded from: classes.dex */
public final class C2163on implements InterfaceC1634ej {

    /* renamed from: R */
    public final /* synthetic */ InterfaceC1634ej f6633R;

    /* renamed from: S */
    public final /* synthetic */ int f6634S;

    public /* synthetic */ C2163on(InterfaceC1634ej interfaceC1634ej, int i) {
        this.f6634S = i;
        this.f6633R = interfaceC1634ej;
    }

    @Override // p000a.InterfaceC1634ej
    /* renamed from: z */
    public final Object mo1459z(InterfaceC2445u2 interfaceC2445u2, InterfaceC1171Vv interfaceC1171Vv) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        int i = this.f6634S;
        InterfaceC1634ej interfaceC1634ej = this.f6633R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                Object mo1459z = interfaceC1634ej.mo1459z(new C2472uZ(interfaceC2445u2, 0), interfaceC1171Vv);
                if (mo1459z == EnumC0464Im.f1557S) {
                    return mo1459z;
                }
                return c0329gj;
            case 1:
                Object mo1459z2 = interfaceC1634ej.mo1459z(new C2472uZ(interfaceC2445u2, 1), interfaceC1171Vv);
                if (mo1459z2 == EnumC0464Im.f1557S) {
                    return mo1459z2;
                }
                return c0329gj;
            default:
                Object mo1459z3 = interfaceC1634ej.mo1459z(new C2472uZ(interfaceC2445u2, 2), interfaceC1171Vv);
                if (mo1459z3 == EnumC0464Im.f1557S) {
                    return mo1459z3;
                }
                return c0329gj;
        }
    }
}
