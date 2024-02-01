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
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;

/* renamed from: a.P5 */
/* loaded from: classes.dex */
public final class C0809P5 extends C0799Ov {

    /* renamed from: N */
    public static final boolean f2748N;

    /* renamed from: P */
    public static final C2252qQ f2749P;

    /* renamed from: v */
    public final Provider f2750v = new OpenJSSE();

    static {
        boolean z = false;
        f2749P = new C2252qQ(14, z ? 1 : 0);
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, C2252qQ.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f2748N = z;
    }

    @Override // p000a.C0799Ov
    /* renamed from: P */
    public final void mo297P(SSLSocket sSLSocket, String str, List list) {
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                sSLParameters.setApplicationProtocols((String[]) C2252qQ.m3894v(list).toArray(new String[0]));
                sSLSocket2.setSSLParameters(sSLParameters);
            }
        }
    }

    @Override // p000a.C0799Ov
    /* renamed from: Q */
    public final String mo298Q(SSLSocket sSLSocket) {
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
            if (!(applicationProtocol == null ? true : AbstractC1292YB.m2695u(applicationProtocol, ""))) {
                return applicationProtocol;
            }
        }
        return null;
    }

    @Override // p000a.C0799Ov
    /* renamed from: R */
    public final X509TrustManager mo1884R() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f2750v);
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
        return SSLContext.getInstance("TLSv1.3", this.f2750v);
    }
}
