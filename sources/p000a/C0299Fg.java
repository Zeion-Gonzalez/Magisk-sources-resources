package p000a;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: a.Fg */
/* loaded from: classes.dex */
public final class C0299Fg {

    /* renamed from: M */
    public static final String f1029M;

    /* renamed from: V */
    public static final String f1030V;

    /* renamed from: G */
    public final long f1031G;

    /* renamed from: N */
    public final int f1032N;

    /* renamed from: P */
    public final EnumC1854ix f1033P;

    /* renamed from: Q */
    public final String f1034Q;

    /* renamed from: W */
    public final long f1035W;

    /* renamed from: h */
    public final C1494c7 f1036h;

    /* renamed from: o */
    public final C2254qS f1037o;

    /* renamed from: u */
    public final C1494c7 f1038u;

    /* renamed from: v */
    public final String f1039v;

    /* renamed from: z */
    public final C2658y7 f1040z;

    static {
        C0799Ov c0799Ov = C0799Ov.f2726z;
        C0799Ov.f2726z.getClass();
        f1029M = "OkHttp-Sent-Millis";
        C0799Ov.f2726z.getClass();
        f1030V = "OkHttp-Received-Millis";
    }

    public C0299Fg(C1429ap c1429ap) {
        C1494c7 c1494c7;
        C1364ZX c1364zx = c1429ap.f4467S;
        this.f1040z = (C2658y7) c1364zx.f4279h;
        C1494c7 c1494c72 = (C1494c7) c1429ap.f4477y.f4467S.f4277P;
        C1494c7 c1494c73 = c1429ap.f4472k;
        Set m99u = C0054B3.m99u(c1494c73);
        if (m99u.isEmpty()) {
            c1494c7 = AbstractC1181W6.f3857h;
        } else {
            ArrayList arrayList = new ArrayList(20);
            int length = c1494c72.f4637S.length / 2;
            for (int i = 0; i < length; i++) {
                String m2898v = c1494c72.m2898v(i);
                if (m99u.contains(m2898v)) {
                    String m2894N = c1494c72.m2894N(i);
                    C1710g8.m3228W(m2898v);
                    C1710g8.m3221G(m2894N, m2898v);
                    arrayList.add(m2898v);
                    arrayList.add(AbstractC1269Xn.m2580Uf(m2894N).toString());
                }
            }
            c1494c7 = new C1494c7((String[]) arrayList.toArray(new String[0]));
        }
        this.f1036h = c1494c7;
        this.f1039v = (String) c1364zx.f4281v;
        this.f1033P = c1429ap.f4466R;
        this.f1032N = c1429ap.f4465I;
        this.f1034Q = c1429ap.f4476w;
        this.f1038u = c1494c73;
        this.f1037o = c1429ap.f4473q;
        this.f1035W = c1429ap.f4464E;
        this.f1031G = c1429ap.f4470f;
    }

    /* renamed from: h */
    public static void m637h(C0418Hu c0418Hu, List list) {
        try {
            c0418Hu.mo944m(list.size());
            c0418Hu.mo945qn(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                C1623eY c1623eY = C1623eY.f5009I;
                c0418Hu.mo938K(AbstractC2701z.m4628z(C2252qQ.m3890k(encoded).f5011S, AbstractC2701z.f8520z));
                c0418Hu.mo945qn(10);
            }
        } catch (CertificateEncodingException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: z */
    public static List m638z(C2323ri c2323ri) {
        int m97Q = C0054B3.m97Q(c2323ri);
        if (m97Q == -1) {
            return C1239X8.f4021S;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(m97Q);
            for (int i = 0; i < m97Q; i++) {
                String mo1633t = c2323ri.mo1633t();
                C2361sQ c2361sQ = new C2361sQ();
                C1623eY c1623eY = C1623eY.f5009I;
                C1623eY m3888W = C2252qQ.m3888W(mo1633t);
                if (m3888W != null) {
                    m3888W.mo1983V(c2361sQ, m3888W.mo1980P());
                    arrayList.add(certificateFactory.generateCertificate(c2361sQ.mo1629n0()));
                } else {
                    throw new IOException("Corrupt certificate in cache entry");
                }
            }
            return arrayList;
        } catch (CertificateException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: v */
    public final void m639v(C1570dX c1570dX) {
        String str;
        C2658y7 c2658y7 = this.f1040z;
        C2254qS c2254qS = this.f1037o;
        C1494c7 c1494c7 = this.f1038u;
        C1494c7 c1494c72 = this.f1036h;
        C0418Hu c0418Hu = new C0418Hu(c1570dX.m3035P(0));
        try {
            c0418Hu.mo938K(c2658y7.f8281W);
            c0418Hu.mo945qn(10);
            c0418Hu.mo938K(this.f1039v);
            c0418Hu.mo945qn(10);
            c0418Hu.mo944m(c1494c72.f4637S.length / 2);
            c0418Hu.mo945qn(10);
            int length = c1494c72.f4637S.length / 2;
            for (int i = 0; i < length; i++) {
                c0418Hu.mo938K(c1494c72.m2898v(i));
                c0418Hu.mo938K(": ");
                c0418Hu.mo938K(c1494c72.m2894N(i));
                c0418Hu.mo945qn(10);
            }
            EnumC1854ix enumC1854ix = this.f1033P;
            int i2 = this.f1032N;
            String str2 = this.f1034Q;
            StringBuilder sb = new StringBuilder();
            if (enumC1854ix == EnumC1854ix.f5780R) {
                str = "HTTP/1.0";
            } else {
                str = "HTTP/1.1";
            }
            sb.append(str);
            sb.append(' ');
            sb.append(i2);
            sb.append(' ');
            sb.append(str2);
            c0418Hu.mo938K(sb.toString());
            c0418Hu.mo945qn(10);
            c0418Hu.mo944m((c1494c7.f4637S.length / 2) + 2);
            c0418Hu.mo945qn(10);
            int length2 = c1494c7.f4637S.length / 2;
            for (int i3 = 0; i3 < length2; i3++) {
                c0418Hu.mo938K(c1494c7.m2898v(i3));
                c0418Hu.mo938K(": ");
                c0418Hu.mo938K(c1494c7.m2894N(i3));
                c0418Hu.mo945qn(10);
            }
            c0418Hu.mo938K(f1029M);
            c0418Hu.mo938K(": ");
            c0418Hu.mo944m(this.f1035W);
            c0418Hu.mo945qn(10);
            c0418Hu.mo938K(f1030V);
            c0418Hu.mo938K(": ");
            c0418Hu.mo944m(this.f1031G);
            c0418Hu.mo945qn(10);
            if (AbstractC1292YB.m2695u(c2658y7.f8286z, "https")) {
                c0418Hu.mo945qn(10);
                c0418Hu.mo938K(c2254qS.f6941h.f981z);
                c0418Hu.mo945qn(10);
                m637h(c0418Hu, c2254qS.m3898z());
                m637h(c0418Hu, c2254qS.f6942v);
                c0418Hu.mo938K(c2254qS.f6943z.f3975S);
                c0418Hu.mo945qn(10);
            }
            AbstractC1292YB.m2659R(c0418Hu, null);
        } finally {
        }
    }

    public C0299Fg(InterfaceC0984SS interfaceC0984SS) {
        C2658y7 c2658y7;
        try {
            C2323ri c2323ri = new C2323ri(interfaceC0984SS);
            String mo1633t = c2323ri.mo1633t();
            try {
                C0349Gf c0349Gf = new C0349Gf();
                c0349Gf.m760N(null, mo1633t);
                c2658y7 = c0349Gf.m762h();
            } catch (IllegalArgumentException unused) {
                c2658y7 = null;
            }
            if (c2658y7 != null) {
                this.f1040z = c2658y7;
                this.f1039v = c2323ri.mo1633t();
                C1571dY c1571dY = new C1571dY();
                int m97Q = C0054B3.m97Q(c2323ri);
                int i = 0;
                for (int i2 = 0; i2 < m97Q; i2++) {
                    c1571dY.m3042h(c2323ri.mo1633t());
                }
                this.f1036h = c1571dY.m3040P();
                C1014T1 m3220E = C1710g8.m3220E(c2323ri.mo1633t());
                this.f1033P = m3220E.f3393z;
                this.f1032N = m3220E.f3391h;
                this.f1034Q = m3220E.f3392v;
                C1571dY c1571dY2 = new C1571dY();
                int m97Q2 = C0054B3.m97Q(c2323ri);
                for (int i3 = 0; i3 < m97Q2; i3++) {
                    c1571dY2.m3042h(c2323ri.mo1633t());
                }
                String str = f1029M;
                String m3039N = c1571dY2.m3039N(str);
                String str2 = f1030V;
                String m3039N2 = c1571dY2.m3039N(str2);
                c1571dY2.m3041Q(str);
                c1571dY2.m3041Q(str2);
                this.f1035W = m3039N != null ? Long.parseLong(m3039N) : 0L;
                this.f1031G = m3039N2 != null ? Long.parseLong(m3039N2) : 0L;
                this.f1038u = c1571dY2.m3040P();
                if (AbstractC1292YB.m2695u(this.f1040z.f8286z, "https")) {
                    String mo1633t2 = c2323ri.mo1633t();
                    if (mo1633t2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + mo1633t2 + '\"');
                    }
                    this.f1037o = new C2254qS(!c2323ri.mo1626b() ? C1710g8.m3225R(c2323ri.mo1633t()) : EnumC1213Wf.f3972k, C0280FK.f973h.m3242S(c2323ri.mo1633t()), AbstractC1181W6.m2428s(m638z(c2323ri)), new C2113np(i, AbstractC1181W6.m2428s(m638z(c2323ri))));
                } else {
                    this.f1037o = null;
                }
                AbstractC1292YB.m2659R(interfaceC0984SS, null);
                return;
            }
            IOException iOException = new IOException("Cache corruption for ".concat(mo1633t));
            C0799Ov c0799Ov = C0799Ov.f2726z;
            C0799Ov.f2726z.getClass();
            C0799Ov.m1881W(5, "cache corruption", iOException);
            throw iOException;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1292YB.m2659R(interfaceC0984SS, th);
                throw th2;
            }
        }
    }
}
