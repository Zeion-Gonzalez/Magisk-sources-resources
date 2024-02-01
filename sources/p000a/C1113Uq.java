package p000a;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: a.Uq */
/* loaded from: classes.dex */
public final class C1113Uq implements HostnameVerifier {

    /* renamed from: z */
    public static final C1113Uq f3616z = new C1113Uq();

    /* JADX WARN: Removed duplicated region for block: B:91:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[LOOP:1: B:23:0x0064->B:96:?, LOOP_END, SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m2292h(java.lang.String r9, java.security.cert.X509Certificate r10) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1113Uq.m2292h(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    /* renamed from: z */
    public static List m2293z(X509Certificate x509Certificate, int i) {
        Object obj;
        C1239X8 c1239x8 = C1239X8.f4021S;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return c1239x8;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && AbstractC1292YB.m2695u(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return c1239x8;
        }
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        boolean z;
        if (str.length() == ((int) AbstractC1292YB.m2669Yd(str))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
            } catch (SSLException unused) {
                return false;
            }
        }
        return m2292h(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
    }
}
