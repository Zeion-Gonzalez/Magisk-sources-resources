package p000a;

/* renamed from: a.n2 */
/* loaded from: classes.dex */
public final class C2074n2 extends AbstractC0209E {

    /* renamed from: R */
    public final InterfaceC0959S f6428R;

    /* renamed from: S */
    public final C1281Y f6429S;

    public C2074n2(C1281Y c1281y) {
        this.f6429S = c1281y;
    }

    /* renamed from: V */
    public static C2074n2 m3693V(Object obj) {
        if (obj instanceof C2074n2) {
            return (C2074n2) obj;
        }
        if (obj != null) {
            return new C2074n2(AbstractC1333Z.m2714U(obj));
        }
        return null;
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        C2551w c2551w = new C2551w(2);
        c2551w.m4371z(this.f6429S);
        InterfaceC0959S interfaceC0959S = this.f6428R;
        if (interfaceC0959S != null) {
            c2551w.m4371z(interfaceC0959S);
        }
        return new C1802hw(c2551w);
    }

    public C2074n2(C1281Y c1281y, InterfaceC0959S interfaceC0959S) {
        this.f6429S = c1281y;
        this.f6428R = interfaceC0959S;
    }

    public C2074n2(AbstractC1333Z abstractC1333Z) {
        if (abstractC1333Z.size() < 1 || abstractC1333Z.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC1333Z.size());
        }
        this.f6429S = C1281Y.m2621U(abstractC1333Z.mo142E(0));
        this.f6428R = abstractC1333Z.size() == 2 ? abstractC1333Z.mo142E(1) : null;
    }
}
