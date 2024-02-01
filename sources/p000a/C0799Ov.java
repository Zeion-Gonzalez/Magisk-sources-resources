package p000a;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: a.Ov */
/* loaded from: classes.dex */
public class C0799Ov {

    /* renamed from: h */
    public static final Logger f2725h;

    /* renamed from: z */
    public static volatile C0799Ov f2726z;

    /* JADX WARN: Code restructure failed: missing block: B:103:0x00d5, code lost:
    
        if (r0 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x008c, code lost:
    
        if (r0 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00b1, code lost:
    
        if (r0 != null) goto L115;
     */
    static {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0799Ov.<clinit>():void");
    }

    /* renamed from: G */
    public static /* synthetic */ void m1880G(C0799Ov c0799Ov, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        c0799Ov.getClass();
        m1881W(i, str, null);
    }

    /* renamed from: W */
    public static void m1881W(int i, String str, Throwable th) {
        f2725h.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: M */
    public void mo1882M(String str, Object obj) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m1881W(5, str, (Throwable) obj);
    }

    /* renamed from: N */
    public void mo1883N(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: P */
    public void mo297P(SSLSocket sSLSocket, String str, List list) {
    }

    /* renamed from: Q */
    public String mo298Q(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: R */
    public X509TrustManager mo1884R() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            return (X509TrustManager) trustManagers[0];
        }
        throw new IllegalStateException("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)).toString());
    }

    /* renamed from: S */
    public SSLSocketFactory mo1885S(X509TrustManager x509TrustManager) {
        try {
            SSLContext mo1886V = mo1886V();
            mo1886V.init(null, new TrustManager[]{x509TrustManager}, null);
            return mo1886V.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    /* renamed from: V */
    public SSLContext mo1886V() {
        return SSLContext.getInstance("TLS");
    }

    /* renamed from: h */
    public AbstractC0438II mo299h(X509TrustManager x509TrustManager) {
        return new C2341s2(mo1888v(x509TrustManager));
    }

    /* renamed from: o */
    public boolean mo300o(String str) {
        return true;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: u */
    public Object mo1887u() {
        if (f2725h.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* renamed from: v */
    public InterfaceC2288r5 mo1888v(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new C0433ID((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: z */
    public void mo1889z(SSLSocket sSLSocket) {
    }
}
