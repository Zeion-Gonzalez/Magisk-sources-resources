package p000a;

/* renamed from: a.Kh */
/* loaded from: classes.dex */
public final class C0570Kh extends AbstractC1264Xg {

    /* renamed from: R */
    public final Object f1846R;

    /* renamed from: S */
    public final /* synthetic */ int f1847S;

    public /* synthetic */ C0570Kh(int i, Object obj) {
        this.f1847S = i;
        this.f1846R = obj;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final /* bridge */ /* synthetic */ Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        switch (this.f1847S) {
            case AbstractC0795Op.f2698E /* 0 */:
                mo1291h((Throwable) obj);
                return c0329gj;
            default:
                mo1291h((Throwable) obj);
                return c0329gj;
        }
    }

    @Override // p000a.AbstractC1264Xg
    /* renamed from: h */
    public final void mo1291h(Throwable th) {
        int i = this.f1847S;
        Object obj = this.f1846R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((InterfaceC1279Xy) obj).mo1430v();
                return;
            default:
                ((InterfaceC2364sT) obj).mo85W(th);
                return;
        }
    }

    public final String toString() {
        int i = this.f1847S;
        Object obj = this.f1846R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return "DisposeOnCancel[" + ((InterfaceC1279Xy) obj) + ']';
            default:
                return "InvokeOnCancel[" + ((InterfaceC2364sT) obj).getClass().getSimpleName() + '@' + AbstractC2575wW.m4418Y(this) + ']';
        }
    }
}
