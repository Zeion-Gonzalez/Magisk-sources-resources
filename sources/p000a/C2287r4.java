package p000a;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: a.r4 */
/* loaded from: classes.dex */
public final class C2287r4 implements InterfaceC2391sz {

    /* renamed from: z */
    public static final C2252qQ f7071z = new C2252qQ(16, 0);

    @Override // p000a.InterfaceC2391sz
    /* renamed from: P */
    public final void mo1166P(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C0799Ov c0799Ov = C0799Ov.f2726z;
            sSLParameters.setApplicationProtocols((String[]) C2252qQ.m3894v(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // p000a.InterfaceC2391sz
    /* renamed from: h */
    public final String mo1167h(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : AbstractC1292YB.m2695u(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p000a.InterfaceC2391sz
    /* renamed from: v */
    public final boolean mo1168v() {
        return f7071z.m3897w();
    }

    @Override // p000a.InterfaceC2391sz
    /* renamed from: z */
    public final boolean mo1169z(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }
}
