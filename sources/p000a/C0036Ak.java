package p000a;

/* renamed from: a.Ak */
/* loaded from: classes.dex */
public final /* synthetic */ class C0036Ak extends AbstractC0447IV implements InterfaceC2364sT {

    /* renamed from: s */
    public final /* synthetic */ int f177s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0036Ak(int i, Object obj) {
        super(1, obj, InterfaceC2068mx.class, "onEventDispatched", "onEventDispatched(Lcom/topjohnwu/magisk/arch/ViewEvent;)V");
        this.f177s = i;
        if (i != 1) {
        } else {
            super(1, obj, AbstractC2615xD.class, "onNetworkChanged", "onNetworkChanged(Z)V");
        }
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        int i = this.f177s;
        Object obj2 = this.f6652R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((InterfaceC2068mx) obj2).mo1922V((AbstractC0231EP) obj);
                return c0329gj;
            default:
                ((Boolean) obj).booleanValue();
                ((AbstractC2615xD) obj2).mo1138G();
                return c0329gj;
        }
    }
}
