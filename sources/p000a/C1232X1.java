package p000a;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* renamed from: a.X1 */
/* loaded from: classes.dex */
public final class C1232X1 extends AbstractC0438II {

    /* renamed from: X */
    public final X509TrustManagerExtensions f4008X;

    /* renamed from: e */
    public final X509TrustManager f4009e;

    public C1232X1(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f4009e = x509TrustManager;
        this.f4008X = x509TrustManagerExtensions;
    }

    @Override // p000a.AbstractC0438II
    /* renamed from: R */
    public final List mo1054R(String str, List list) {
        try {
            return this.f4008X.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1232X1) && ((C1232X1) obj).f4009e == this.f4009e;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4009e);
    }
}
