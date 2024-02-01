package p000a;

/* renamed from: a.NI */
/* loaded from: classes.dex */
public final class C0704NI extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: R */
    public final /* synthetic */ int f2364R;

    /* renamed from: w */
    public final /* synthetic */ AbstractC2499v4 f2365w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0704NI(AbstractC2499v4 abstractC2499v4, int i) {
        super(1);
        this.f2364R = i;
        this.f2365w = abstractC2499v4;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final /* bridge */ /* synthetic */ Object mo85W(Object obj) {
        switch (this.f2364R) {
            case AbstractC0795Op.f2698E /* 0 */:
                return m1636h((C1420ag) obj);
            default:
                return m1636h((C1420ag) obj);
        }
    }

    /* renamed from: h */
    public final Boolean m1636h(C1420ag c1420ag) {
        int i = this.f2364R;
        AbstractC2499v4 abstractC2499v4 = this.f2365w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return Boolean.valueOf(!abstractC2499v4.f7649V.containsKey(Integer.valueOf(c1420ag.f4455y)));
            default:
                return Boolean.valueOf(!abstractC2499v4.f7649V.containsKey(Integer.valueOf(c1420ag.f4455y)));
        }
    }
}
