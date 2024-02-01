package p000a;

/* renamed from: a.Ib */
/* loaded from: classes.dex */
public final class C0453Ib extends AbstractC2099nZ {

    /* renamed from: R */
    public final /* synthetic */ C1284Y2 f1523R;

    /* renamed from: w */
    public final /* synthetic */ C2315ra f1524w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0453Ib(C1284Y2 c1284y2, C2315ra c2315ra, InterfaceC2578wb interfaceC2578wb) {
        super(interfaceC2578wb);
        this.f1523R = c1284y2;
        this.f1524w = c2315ra;
    }

    @Override // p000a.AbstractC2099nZ, p000a.InterfaceC2578wb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1284Y2 c1284y2 = this.f1523R;
        C2315ra c2315ra = this.f1524w;
        synchronized (c1284y2) {
            if (c2315ra.f7134P) {
                return;
            }
            c2315ra.f7134P = true;
            super.close();
            this.f1524w.f7137z.m3036h();
        }
    }
}
