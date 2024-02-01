package p000a;

import java.util.Iterator;

/* renamed from: a.wA */
/* loaded from: classes.dex */
public final class C2556wA implements InterfaceC2296rE {

    /* renamed from: P */
    public final InterfaceC0559KW f7805P;

    /* renamed from: h */
    public final int f7806h;

    /* renamed from: v */
    public final int f7807v;

    /* renamed from: z */
    public final CharSequence f7808z;

    public C2556wA(CharSequence charSequence, int i, int i2, C0646M8 c0646m8) {
        this.f7808z = charSequence;
        this.f7806h = i;
        this.f7807v = i2;
        this.f7805P = c0646m8;
    }

    @Override // p000a.InterfaceC2296rE
    public final Iterator iterator() {
        return new C0652MJ(this);
    }
}
