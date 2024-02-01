package p000a;

/* renamed from: a.KG */
/* loaded from: classes.dex */
public final class C0545KG extends AbstractC0209E {

    /* renamed from: R */
    public final AbstractC0102C f1797R;

    /* renamed from: S */
    public final C1281Y f1798S;

    public C0545KG(C1281Y c1281y, C2420ta c2420ta) {
        this.f1798S = c1281y;
        this.f1797R = c2420ta;
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        C2551w c2551w = new C2551w(2);
        c2551w.m4371z(this.f1798S);
        c2551w.m4371z(this.f1797R);
        return new C1802hw(c2551w);
    }

    public C0545KG(AbstractC1333Z abstractC1333Z) {
        this.f1798S = (C1281Y) abstractC1333Z.mo142E(0);
        this.f1797R = (AbstractC0102C) abstractC1333Z.mo142E(1);
    }
}
