package p000a;

import java.io.IOException;

/* renamed from: a.I2 */
/* loaded from: classes.dex */
public final class C0424I2 implements InterfaceC0959S, InterfaceC2200pR {

    /* renamed from: R */
    public final C2382so f1401R;

    /* renamed from: S */
    public final /* synthetic */ int f1402S;

    public /* synthetic */ C0424I2(C2382so c2382so, int i) {
        this.f1402S = i;
        this.f1401R = c2382so;
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        int i = 0;
        switch (this.f1402S) {
            case AbstractC0795Op.f2698E /* 0 */:
                try {
                    return mo953h();
                } catch (IOException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            case 1:
                try {
                    return mo953h();
                } catch (IOException e2) {
                    throw new C0367H(i, e2.getMessage(), e2);
                }
            case 2:
                String str = "unable to get DER object";
                try {
                    return mo953h();
                } catch (IOException e3) {
                    throw new C0367H(i, str, e3);
                } catch (IllegalArgumentException e4) {
                    throw new C0367H(i, str, e4);
                }
            case 3:
                try {
                    return mo953h();
                } catch (IOException e5) {
                    throw new IllegalStateException(e5.getMessage());
                }
            default:
                try {
                    return mo953h();
                } catch (IOException e6) {
                    throw new C0367H(i, e6.getMessage(), e6);
                }
        }
    }

    @Override // p000a.InterfaceC2200pR
    /* renamed from: h */
    public final AbstractC1593e mo953h() {
        int i = 1;
        int i2 = this.f1402S;
        C2382so c2382so = this.f1401R;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new C0622Lh(c2382so.m4107o());
            case 1:
                return new C0448IW(c2382so.m4107o());
            case 2:
                try {
                    return new C0283FN(new C0423I1(c2382so.m4107o()), i);
                } catch (IllegalArgumentException e) {
                    throw new C2228q(0, e.getMessage(), e);
                }
            case 3:
                return AbstractC1768hF.m3296z(c2382so.m4107o());
            default:
                C2551w m4107o = c2382so.m4107o();
                C0423I1 c0423i1 = AbstractC1768hF.f5571z;
                if (m4107o.f7796h < 1) {
                    return AbstractC1768hF.f5570h;
                }
                return new C0152Cy(m4107o);
        }
    }
}
