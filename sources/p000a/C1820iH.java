package p000a;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* renamed from: a.iH */
/* loaded from: classes.dex */
public final class C1820iH implements InterfaceC2391sz {

    /* renamed from: z */
    public static final C2252qQ f5690z = new C2252qQ(19, 0);

    /* renamed from: h */
    public static final C0655MO f5689h = new C0655MO();

    @Override // p000a.InterfaceC2391sz
    /* renamed from: P */
    public final void mo1166P(SSLSocket sSLSocket, String str, List list) {
        if (mo1169z(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C0799Ov c0799Ov = C0799Ov.f2726z;
            parameters.setApplicationProtocols((String[]) C2252qQ.m3894v(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // p000a.InterfaceC2391sz
    /* renamed from: h */
    public final String mo1167h(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : AbstractC1292YB.m2695u(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p000a.InterfaceC2391sz
    /* renamed from: v */
    public final boolean mo1168v() {
        return C2168os.f6647P.m3897w();
    }

    @Override // p000a.InterfaceC2391sz
    /* renamed from: z */
    public final boolean mo1169z(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }
}
