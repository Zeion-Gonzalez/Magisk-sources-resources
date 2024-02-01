package p000a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: a.qi */
/* loaded from: classes.dex */
public final class C2269qi implements InterfaceC0314G {

    /* renamed from: R */
    public C2144oR f6975R;

    /* renamed from: S */
    public final C2382so f6976S;

    public C2269qi(C2382so c2382so) {
        this.f6976S = c2382so;
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        try {
            return mo953h();
        } catch (IOException e) {
            throw new C0367H(0, "IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }

    @Override // p000a.InterfaceC2200pR
    /* renamed from: h */
    public final AbstractC1593e mo953h() {
        C2144oR c2144oR = new C2144oR(this.f6976S);
        return new C1400aG(c2144oR.f6594I, AbstractC0438II.m1029i(c2144oR));
    }

    @Override // p000a.InterfaceC0314G
    /* renamed from: o */
    public final int mo690o() {
        return this.f6975R.f6594I;
    }

    @Override // p000a.InterfaceC0314G
    /* renamed from: v */
    public final InputStream mo691v() {
        C2144oR c2144oR = new C2144oR(this.f6976S);
        this.f6975R = c2144oR;
        return c2144oR;
    }
}
