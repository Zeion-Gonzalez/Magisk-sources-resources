package p000a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: a.Ml */
/* loaded from: classes.dex */
public final class C0674Ml implements InterfaceC2288r5 {

    /* renamed from: h */
    public final Method f2225h;

    /* renamed from: z */
    public final X509TrustManager f2226z;

    public C0674Ml(X509TrustManager x509TrustManager, Method method) {
        this.f2226z = x509TrustManager;
        this.f2225h = method;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0674Ml)) {
            return false;
        }
        C0674Ml c0674Ml = (C0674Ml) obj;
        return AbstractC1292YB.m2695u(this.f2226z, c0674Ml.f2226z) && AbstractC1292YB.m2695u(this.f2225h, c0674Ml.f2225h);
    }

    public final int hashCode() {
        return this.f2225h.hashCode() + (this.f2226z.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f2226z + ", findByIssuerAndSignatureMethod=" + this.f2225h + ')';
    }

    @Override // p000a.InterfaceC2288r5
    /* renamed from: z */
    public final X509Certificate mo970z(X509Certificate x509Certificate) {
        try {
            return ((TrustAnchor) this.f2225h.invoke(this.f2226z, x509Certificate)).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }
}
