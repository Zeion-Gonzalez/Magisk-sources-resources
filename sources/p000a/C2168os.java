package p000a;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* renamed from: a.os */
/* loaded from: classes.dex */
public final class C2168os extends C0799Ov {

    /* renamed from: N */
    public static final boolean f6646N;

    /* renamed from: P */
    public static final C2252qQ f6647P;

    /* renamed from: v */
    public final Provider f6648v = new BouncyCastleJsseProvider();

    static {
        boolean z = false;
        f6647P = new C2252qQ(11, z ? 1 : 0);
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, C2252qQ.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f6646N = z;
    }

    @Override // p000a.C0799Ov
    /* renamed from: P */
    public final void mo297P(SSLSocket sSLSocket, String str, List list) {
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) C2252qQ.m3894v(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // p000a.C0799Ov
    /* renamed from: Q */
    public final String mo298Q(SSLSocket sSLSocket) {
        if (sSLSocket instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
            if (!(applicationProtocol == null ? true : AbstractC1292YB.m2695u(applicationProtocol, ""))) {
                return applicationProtocol;
            }
        }
        return null;
    }

    @Override // p000a.C0799Ov
    /* renamed from: R */
    public final X509TrustManager mo1884R() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            return (X509TrustManager) trustManagers[0];
        }
        throw new IllegalStateException("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)).toString());
    }

    @Override // p000a.C0799Ov
    /* renamed from: V */
    public final SSLContext mo1886V() {
        return SSLContext.getInstance("TLS", this.f6648v);
    }
}
