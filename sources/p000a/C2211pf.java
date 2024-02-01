package p000a;

import java.util.Iterator;

/* renamed from: a.pf */
/* loaded from: classes.dex */
public final class C2211pf implements InterfaceC2296rE {

    /* renamed from: h */
    public final boolean f6797h;

    /* renamed from: v */
    public final InterfaceC2364sT f6798v;

    /* renamed from: z */
    public final InterfaceC2296rE f6799z;

    public C2211pf(InterfaceC2296rE interfaceC2296rE, boolean z, InterfaceC2364sT interfaceC2364sT) {
        this.f6799z = interfaceC2296rE;
        this.f6797h = z;
        this.f6798v = interfaceC2364sT;
    }

    @Override // p000a.InterfaceC2296rE
    public final Iterator iterator() {
        return new C0923RN(this);
    }
}
