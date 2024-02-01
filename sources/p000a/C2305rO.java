package p000a;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: a.rO */
/* loaded from: classes.dex */
public final class C2305rO {

    /* renamed from: G */
    public final List f7108G;

    /* renamed from: M */
    public final List f7109M;

    /* renamed from: N */
    public final C2216pl f7110N;

    /* renamed from: P */
    public final HostnameVerifier f7111P;

    /* renamed from: Q */
    public final InterfaceC1990lR f7112Q;

    /* renamed from: W */
    public final C2658y7 f7113W;

    /* renamed from: h */
    public final SocketFactory f7114h;

    /* renamed from: o */
    public final ProxySelector f7115o;

    /* renamed from: u */
    public final Proxy f7116u;

    /* renamed from: v */
    public final SSLSocketFactory f7117v;

    /* renamed from: z */
    public final InterfaceC0733Nm f7118z;

    public C2305rO(String str, int i, InterfaceC0733Nm interfaceC0733Nm, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C2216pl c2216pl, InterfaceC1990lR interfaceC1990lR, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        String str2;
        this.f7118z = interfaceC0733Nm;
        this.f7114h = socketFactory;
        this.f7117v = sSLSocketFactory;
        this.f7111P = hostnameVerifier;
        this.f7110N = c2216pl;
        this.f7112Q = interfaceC1990lR;
        this.f7116u = proxy;
        this.f7115o = proxySelector;
        C0349Gf c0349Gf = new C0349Gf();
        String str3 = "https";
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        if (AbstractC1269Xn.m2594yF(str2, "http")) {
            str3 = "http";
        } else if (!AbstractC1269Xn.m2594yF(str2, "https")) {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
        }
        c0349Gf.f1180z = str3;
        boolean z = false;
        String m3439dG = AbstractC1843ih.m3439dG(C1710g8.m3229Y(str, 0, 0, false, 7));
        if (m3439dG != null) {
            c0349Gf.f1174P = m3439dG;
            if (1 <= i && i < 65536) {
                z = true;
            }
            if (z) {
                c0349Gf.f1173N = i;
                this.f7113W = c0349Gf.m762h();
                this.f7108G = AbstractC1181W6.m2428s(list);
                this.f7109M = AbstractC1181W6.m2428s(list2);
                return;
            }
            throw new IllegalArgumentException(AbstractC2441tz.m4188N("unexpected port: ", i).toString());
        }
        throw new IllegalArgumentException("unexpected host: ".concat(str));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2305rO) {
            C2305rO c2305rO = (C2305rO) obj;
            if (AbstractC1292YB.m2695u(this.f7113W, c2305rO.f7113W) && m3960z(c2305rO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f7110N) + ((Objects.hashCode(this.f7111P) + ((Objects.hashCode(this.f7117v) + ((Objects.hashCode(this.f7116u) + ((this.f7115o.hashCode() + ((this.f7109M.hashCode() + ((this.f7108G.hashCode() + ((this.f7112Q.hashCode() + ((this.f7118z.hashCode() + ((this.f7113W.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        C2658y7 c2658y7 = this.f7113W;
        sb.append(c2658y7.f8279P);
        sb.append(':');
        sb.append(c2658y7.f8278N);
        sb.append(", ");
        Proxy proxy = this.f7116u;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f7115o;
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: z */
    public final boolean m3960z(C2305rO c2305rO) {
        if (AbstractC1292YB.m2695u(this.f7118z, c2305rO.f7118z) && AbstractC1292YB.m2695u(this.f7112Q, c2305rO.f7112Q) && AbstractC1292YB.m2695u(this.f7108G, c2305rO.f7108G) && AbstractC1292YB.m2695u(this.f7109M, c2305rO.f7109M) && AbstractC1292YB.m2695u(this.f7115o, c2305rO.f7115o) && AbstractC1292YB.m2695u(this.f7116u, c2305rO.f7116u) && AbstractC1292YB.m2695u(this.f7117v, c2305rO.f7117v) && AbstractC1292YB.m2695u(this.f7111P, c2305rO.f7111P) && AbstractC1292YB.m2695u(this.f7110N, c2305rO.f7110N) && this.f7113W.f8278N == c2305rO.f7113W.f8278N) {
            return true;
        }
        return false;
    }
}
