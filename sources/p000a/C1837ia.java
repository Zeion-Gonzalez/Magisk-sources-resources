package p000a;

import java.io.IOException;

/* renamed from: a.ia */
/* loaded from: classes.dex */
public class C1837ia implements InterfaceC0959S, InterfaceC2200pR {

    /* renamed from: R */
    public final int f5736R;

    /* renamed from: S */
    public final int f5737S;

    /* renamed from: w */
    public final C2382so f5738w;

    public C1837ia(int i, int i2, C2382so c2382so) {
        this.f5737S = i;
        this.f5736R = i2;
        this.f5738w = c2382so;
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        try {
            return mo953h();
        } catch (IOException e) {
            throw new C0367H(e.getMessage());
        }
    }

    /* renamed from: h */
    public AbstractC1593e mo953h() {
        return this.f5738w.m4104Q(this.f5737S, this.f5736R);
    }
}
