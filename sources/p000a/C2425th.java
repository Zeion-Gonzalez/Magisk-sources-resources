package p000a;

/* renamed from: a.th */
/* loaded from: classes.dex */
public final class C2425th extends AbstractC0209E {

    /* renamed from: R */
    public final InterfaceC0959S f7426R;

    /* renamed from: S */
    public final C1281Y f7427S;

    public C2425th(C1281Y c1281y, InterfaceC0959S interfaceC0959S) {
        this.f7427S = c1281y;
        this.f7426R = interfaceC0959S;
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        C2551w c2551w = new C2551w(2);
        c2551w.m4371z(this.f7427S);
        c2551w.m4371z(this.f7426R);
        return new C1802hw(c2551w);
    }

    public C2425th(AbstractC1333Z abstractC1333Z) {
        this.f7427S = (C1281Y) abstractC1333Z.mo142E(0);
        this.f7426R = abstractC1333Z.mo142E(1);
    }
}
