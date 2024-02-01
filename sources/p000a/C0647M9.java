package p000a;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* renamed from: a.M9 */
/* loaded from: classes.dex */
public final class C0647M9 implements InterfaceC0343GZ {
    @Override // p000a.InterfaceC0343GZ
    /* renamed from: h */
    public final InterfaceC2391sz mo326h(SSLSocket sSLSocket) {
        return new C0514Jh();
    }

    @Override // p000a.InterfaceC0343GZ
    /* renamed from: z */
    public final boolean mo327z(SSLSocket sSLSocket) {
        boolean z = C1809i4.f5674P;
        return AbstractC2577wa.m4461h() && Conscrypt.isConscrypt(sSLSocket);
    }
}
