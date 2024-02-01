package p000a;

/* renamed from: a.RK */
/* loaded from: classes.dex */
public final class C0920RK extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: R */
    public final /* synthetic */ int f3166R;

    /* renamed from: w */
    public final /* synthetic */ InterfaceC0987SV f3167w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0920RK(InterfaceC0987SV interfaceC0987SV, int i) {
        super(1);
        this.f3166R = i;
        this.f3167w = interfaceC0987SV;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final /* bridge */ /* synthetic */ Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        switch (this.f3166R) {
            case AbstractC0795Op.f2698E /* 0 */:
                m2072h((Throwable) obj);
                return c0329gj;
            case 1:
                m2072h((Throwable) obj);
                return c0329gj;
            default:
                m2072h((Throwable) obj);
                return c0329gj;
        }
    }

    /* renamed from: h */
    public final void m2072h(Throwable th) {
        int i = this.f3166R;
        InterfaceC0987SV interfaceC0987SV = this.f3167w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                interfaceC0987SV.cancel();
                return;
            case 1:
                interfaceC0987SV.cancel();
                return;
            default:
                interfaceC0987SV.cancel();
                return;
        }
    }
}
