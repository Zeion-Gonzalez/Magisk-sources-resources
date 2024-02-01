package p000a;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: a.J6 */
/* loaded from: classes.dex */
public final class C0484J6 implements InterfaceC2391sz {

    /* renamed from: h */
    public InterfaceC2391sz f1627h;

    /* renamed from: z */
    public final InterfaceC0343GZ f1628z;

    public C0484J6(InterfaceC0343GZ interfaceC0343GZ) {
        this.f1628z = interfaceC0343GZ;
    }

    @Override // p000a.InterfaceC2391sz
    /* renamed from: P */
    public final void mo1166P(SSLSocket sSLSocket, String str, List list) {
        InterfaceC2391sz interfaceC2391sz;
        synchronized (this) {
            if (this.f1627h == null && this.f1628z.mo327z(sSLSocket)) {
                this.f1627h = this.f1628z.mo326h(sSLSocket);
            }
            interfaceC2391sz = this.f1627h;
        }
        if (interfaceC2391sz != null) {
            interfaceC2391sz.mo1166P(sSLSocket, str, list);
        }
    }

    @Override // p000a.InterfaceC2391sz
    /* renamed from: h */
    public final String mo1167h(SSLSocket sSLSocket) {
        InterfaceC2391sz interfaceC2391sz;
        synchronized (this) {
            if (this.f1627h == null && this.f1628z.mo327z(sSLSocket)) {
                this.f1627h = this.f1628z.mo326h(sSLSocket);
            }
            interfaceC2391sz = this.f1627h;
        }
        if (interfaceC2391sz != null) {
            return interfaceC2391sz.mo1167h(sSLSocket);
        }
        return null;
    }

    @Override // p000a.InterfaceC2391sz
    /* renamed from: v */
    public final boolean mo1168v() {
        return true;
    }

    @Override // p000a.InterfaceC2391sz
    /* renamed from: z */
    public final boolean mo1169z(SSLSocket sSLSocket) {
        return this.f1628z.mo327z(sSLSocket);
    }
}
