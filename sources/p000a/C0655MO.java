package p000a;

import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLSocket;

/* renamed from: a.MO */
/* loaded from: classes.dex */
public final class C0655MO implements InterfaceC0343GZ {
    @Override // p000a.InterfaceC0343GZ
    /* renamed from: h */
    public final InterfaceC2391sz mo326h(SSLSocket sSLSocket) {
        return new C1820iH();
    }

    @Override // p000a.InterfaceC0343GZ
    /* renamed from: z */
    public final boolean mo327z(SSLSocket sSLSocket) {
        return C2168os.f6647P.m3897w() && (sSLSocket instanceof BCSSLSocket);
    }
}
