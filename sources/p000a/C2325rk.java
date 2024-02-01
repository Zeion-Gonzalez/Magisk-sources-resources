package p000a;

import java.io.Closeable;

/* renamed from: a.rk */
/* loaded from: classes.dex */
public final class C2325rk implements Closeable, InterfaceC1725gU {

    /* renamed from: S */
    public final InterfaceC1255XS f7155S;

    public C2325rk(InterfaceC1255XS interfaceC1255XS) {
        this.f7155S = interfaceC1255XS;
    }

    @Override // p000a.InterfaceC1725gU
    /* renamed from: C */
    public final InterfaceC1255XS mo311C() {
        return this.f7155S;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC1265Xh interfaceC1265Xh = (InterfaceC1265Xh) this.f7155S.mo107y(C1710g8.f5381k);
        if (interfaceC1265Xh != null) {
            interfaceC1265Xh.mo1719z(null);
        }
    }
}
