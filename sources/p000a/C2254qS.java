package p000a;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: a.qS */
/* loaded from: classes.dex */
public final class C2254qS {

    /* renamed from: P */
    public final C1146VR f6940P;

    /* renamed from: h */
    public final C0280FK f6941h;

    /* renamed from: v */
    public final List f6942v;

    /* renamed from: z */
    public final EnumC1213Wf f6943z;

    public C2254qS(EnumC1213Wf enumC1213Wf, C0280FK c0280fk, List list, InterfaceC1459bP interfaceC1459bP) {
        this.f6943z = enumC1213Wf;
        this.f6941h = c0280fk;
        this.f6942v = list;
        this.f6940P = new C1146VR(new C1407aQ(13, interfaceC1459bP));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2254qS) {
            C2254qS c2254qS = (C2254qS) obj;
            if (c2254qS.f6943z == this.f6943z && AbstractC1292YB.m2695u(c2254qS.f6941h, this.f6941h) && AbstractC1292YB.m2695u(c2254qS.m3898z(), m3898z()) && AbstractC1292YB.m2695u(c2254qS.f6942v, this.f6942v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6942v.hashCode() + ((m3898z().hashCode() + ((this.f6941h.hashCode() + ((this.f6943z.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> m3898z = m3898z();
        ArrayList arrayList = new ArrayList(AbstractC1658fB.m3134dx(m3898z));
        for (Certificate certificate : m3898z) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f6943z);
        sb.append(" cipherSuite=");
        sb.append(this.f6941h);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f6942v;
        ArrayList arrayList2 = new ArrayList(AbstractC1658fB.m3134dx(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: z */
    public final List m3898z() {
        return (List) this.f6940P.getValue();
    }
}
