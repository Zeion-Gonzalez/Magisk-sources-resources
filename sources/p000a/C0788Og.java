package p000a;

/* renamed from: a.Og */
/* loaded from: classes.dex */
public final class C0788Og extends AbstractC0209E {

    /* renamed from: R */
    public final C2661yC f2654R;

    /* renamed from: S */
    public final AbstractC1333Z f2655S;

    public C0788Og(AbstractC1333Z abstractC1333Z) {
        C2661yC c2661yC;
        this.f2655S = abstractC1333Z;
        if (abstractC1333Z.size() == 3) {
            InterfaceC0959S mo142E = abstractC1333Z.mo142E(0);
            if (mo142E instanceof C2661yC) {
                c2661yC = (C2661yC) mo142E;
            } else if (mo142E != null) {
                c2661yC = new C2661yC(AbstractC1333Z.m2714U(mo142E));
            } else {
                c2661yC = null;
            }
            this.f2654R = c2661yC;
            C2074n2.m3693V(abstractC1333Z.mo142E(1));
            AbstractC1176W.m2404s(abstractC1333Z.mo142E(2));
            return;
        }
        throw new IllegalArgumentException("sequence wrong size for a certificate");
    }

    /* renamed from: V */
    public static C0788Og m1795V(Object obj) {
        if (obj instanceof C0788Og) {
            return (C0788Og) obj;
        }
        if (obj != null) {
            return new C0788Og(AbstractC1333Z.m2714U(obj));
        }
        return null;
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        return this.f2655S;
    }
}
