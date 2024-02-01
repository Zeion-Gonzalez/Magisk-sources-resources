package p000a;

/* renamed from: a.lO */
/* loaded from: classes.dex */
public final class C1987lO extends AbstractC0209E implements InterfaceC0141Cj {

    /* renamed from: R */
    public final InterfaceC0959S f6160R;

    /* renamed from: S */
    public final C1281Y f6161S;

    /* renamed from: w */
    public final boolean f6162w;

    public C1987lO(C1281Y c1281y, AbstractC0209E abstractC0209E) {
        boolean z;
        this.f6161S = c1281y;
        this.f6160R = abstractC0209E;
        if (abstractC0209E != null) {
            AbstractC1593e mo302N = abstractC0209E.mo302N();
            if (!(mo302N instanceof C1745gp) && !(mo302N instanceof C0423I1) && !(mo302N instanceof C1802hw)) {
                z = false;
                this.f6162w = z;
            }
        }
        z = true;
        this.f6162w = z;
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        C2551w c2551w = new C2551w(2);
        c2551w.m4371z(this.f6161S);
        boolean z = this.f6162w;
        InterfaceC0959S interfaceC0959S = this.f6160R;
        if (interfaceC0959S != null) {
            c2551w.m4371z(z ? new C1524cl(interfaceC0959S) : new C2645xt(interfaceC0959S));
        }
        return z ? new C0423I1(c2551w) : new C0622Lh(c2551w);
    }

    public C1987lO(AbstractC1333Z abstractC1333Z) {
        InterfaceC0959S interfaceC0959S;
        if (abstractC1333Z.size() < 1 || abstractC1333Z.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC1333Z.size());
        }
        this.f6161S = (C1281Y) abstractC1333Z.mo142E(0);
        if (abstractC1333Z.size() > 1) {
            InterfaceC0959S mo142E = abstractC1333Z.mo142E(1);
            if (mo142E == null) {
                throw new NullPointerException("'obj' cannot be null");
            }
            AbstractC1857j m3472s = AbstractC1857j.m3472s(mo142E);
            int i = m3472s.f5792R;
            int i2 = m3472s.f5794w;
            if (128 == i) {
                if (m3472s.m3474U() && i2 == 0) {
                    if (!m3472s.m3474U()) {
                        throw new IllegalStateException("object implicit - explicit expected.");
                    }
                    InterfaceC0959S interfaceC0959S2 = m3472s.f5791I;
                    interfaceC0959S = interfaceC0959S2 instanceof AbstractC0209E ? (AbstractC0209E) interfaceC0959S2 : interfaceC0959S2.mo302N();
                } else {
                    throw new IllegalArgumentException("Bad tag for 'content'");
                }
            } else {
                throw new IllegalArgumentException("unexpected tag in getInstance: " + AbstractC1843ih.m3436d(m3472s.f5792R, i2));
            }
        } else {
            interfaceC0959S = null;
        }
        this.f6160R = interfaceC0959S;
        this.f6162w = !(abstractC1333Z instanceof C0622Lh);
    }
}
