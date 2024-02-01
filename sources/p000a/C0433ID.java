package p000a;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: a.ID */
/* loaded from: classes.dex */
public final class C0433ID implements InterfaceC2288r5 {

    /* renamed from: z */
    public final LinkedHashMap f1414z;

    public C0433ID(X509Certificate... x509CertificateArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f1414z = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C0433ID) && AbstractC1292YB.m2695u(((C0433ID) obj).f1414z, this.f1414z));
    }

    public final int hashCode() {
        return this.f1414z.hashCode();
    }

    @Override // p000a.InterfaceC2288r5
    /* renamed from: z */
    public final X509Certificate mo970z(X509Certificate x509Certificate) {
        boolean z;
        Set set = (Set) this.f1414z.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        return (X509Certificate) obj;
    }
}
