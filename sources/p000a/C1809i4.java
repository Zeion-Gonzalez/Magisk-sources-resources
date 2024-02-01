package p000a;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* renamed from: a.i4 */
/* loaded from: classes.dex */
public final class C1809i4 extends C0799Ov {

    /* renamed from: P */
    public static final boolean f5674P;

    /* renamed from: v */
    public final Provider f5675v = Conscrypt.newProvider();

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC2577wa.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (AbstractC2577wa.m4462z()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f5674P = z;
    }

    @Override // p000a.C0799Ov
    /* renamed from: P */
    public final void mo297P(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C2252qQ.m3894v(list).toArray(new String[0]));
        }
    }

    @Override // p000a.C0799Ov
    /* renamed from: Q */
    public final String mo298Q(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p000a.C0799Ov
    /* renamed from: R */
    public final X509TrustManager mo1884R() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager))) {
            throw new IllegalStateException("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)).toString());
        }
        X509TrustManager x509TrustManager = (X509TrustManager) trustManagers[0];
        Conscrypt.setHostnameVerifier(x509TrustManager, C0016AH.f107z);
        return x509TrustManager;
    }

    @Override // p000a.C0799Ov
    /* renamed from: S */
    public final SSLSocketFactory mo1885S(X509TrustManager x509TrustManager) {
        SSLContext mo1886V = mo1886V();
        mo1886V.init(null, new TrustManager[]{x509TrustManager}, null);
        return mo1886V.getSocketFactory();
    }

    @Override // p000a.C0799Ov
    /* renamed from: V */
    public final SSLContext mo1886V() {
        return SSLContext.getInstance("TLS", this.f5675v);
    }
}
