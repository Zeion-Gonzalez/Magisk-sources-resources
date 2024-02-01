package p000a;

import java.util.Iterator;

/* renamed from: a.W3 */
/* loaded from: classes.dex */
public final class C1178W3 extends AbstractC1693fp {

    /* renamed from: h */
    public final InterfaceC2625xN f3841h;

    /* renamed from: v */
    public final /* synthetic */ C2024m6 f3842v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1178W3(C2024m6 c2024m6, InterfaceC2625xN interfaceC2625xN) {
        super(interfaceC2625xN.asBinder());
        this.f3842v = c2024m6;
        this.f3841h = interfaceC2625xN;
    }

    @Override // p000a.AbstractC1693fp
    /* renamed from: z */
    public final void mo2408z() {
        C2024m6 c2024m6 = this.f3842v;
        if (c2024m6.f6287z == this) {
            c2024m6.f6287z = null;
        }
        if (c2024m6.f6285h == this) {
            c2024m6.f6285h = null;
        }
        Iterator it = c2024m6.f6282N.values().iterator();
        while (it.hasNext()) {
            if (((C0803Oz) it.next()).f2741v == this) {
                it.remove();
            }
        }
        c2024m6.m3659h(new C0024AR(7, this));
    }
}
