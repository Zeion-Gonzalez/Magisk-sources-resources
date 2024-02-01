package p000a;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: a.lV */
/* loaded from: classes.dex */
public final class C1994lV implements InterfaceC1975l8 {

    /* renamed from: z */
    public final C0234ES f6176z;

    public C1994lV(C0234ES c0234es) {
        this.f6176z = c0234es;
    }

    /* renamed from: P */
    public static int m3605P(C1429ap c1429ap, int i) {
        String m2897h = c1429ap.f4472k.m2897h("Retry-After");
        if (m2897h == null) {
            m2897h = null;
        }
        if (m2897h == null) {
            return i;
        }
        if (Pattern.compile("\\d+").matcher(m2897h).matches()) {
            return Integer.valueOf(m2897h).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: h */
    public final C1364ZX m3606h(C1429ap c1429ap, C0998Si c0998Si) {
        C1946ke c1946ke;
        C0349Gf c0349Gf;
        C2658y7 c2658y7;
        InterfaceC1990lR interfaceC1990lR;
        C0770OM c0770om;
        AbstractC1911jx abstractC1911jx = null;
        if (c0998Si != null && (c0770om = c0998Si.f3351u) != null) {
            c1946ke = c0770om.f2627h;
        } else {
            c1946ke = null;
        }
        int i = c1429ap.f4465I;
        String str = (String) c1429ap.f4467S.f4281v;
        boolean z = false;
        if (i != 307 && i != 308) {
            if (i != 401) {
                if (i != 421) {
                    if (i != 503) {
                        if (i != 407) {
                            if (i != 408) {
                                switch (i) {
                                    case 300:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else {
                                if (!this.f6176z.f781k) {
                                    return null;
                                }
                                C1429ap c1429ap2 = c1429ap.f4468U;
                                if ((c1429ap2 != null && c1429ap2.f4465I == 408) || m3605P(c1429ap, 0) > 0) {
                                    return null;
                                }
                                return c1429ap.f4467S;
                            }
                        } else if (c1946ke.f6032h.type() == Proxy.Type.HTTP) {
                            interfaceC1990lR = this.f6176z.f765J;
                        } else {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        C1429ap c1429ap3 = c1429ap.f4468U;
                        if ((c1429ap3 != null && c1429ap3.f4465I == 503) || m3605P(c1429ap, Integer.MAX_VALUE) != 0) {
                            return null;
                        }
                        return c1429ap.f4467S;
                    }
                } else {
                    if (c0998Si == null || (!AbstractC1292YB.m2695u(c0998Si.f3352v.f3848h.f7113W.f8279P, c0998Si.f3351u.f2627h.f6034z.f7113W.f8279P)) == false) {
                        return null;
                    }
                    C0770OM c0770om2 = c0998Si.f3351u;
                    synchronized (c0770om2) {
                        c0770om2.f2619M = true;
                    }
                    return c1429ap.f4467S;
                }
            } else {
                interfaceC1990lR = this.f6176z.f778g;
            }
            interfaceC1990lR.getClass();
            return null;
        }
        C0234ES c0234es = this.f6176z;
        if (!c0234es.f789y) {
            return null;
        }
        String m2897h = c1429ap.f4472k.m2897h("Location");
        if (m2897h == null) {
            m2897h = null;
        }
        if (m2897h == null) {
            return null;
        }
        C1364ZX c1364zx = c1429ap.f4467S;
        C2658y7 c2658y72 = (C2658y7) c1364zx.f4279h;
        c2658y72.getClass();
        try {
            c0349Gf = new C0349Gf();
            c0349Gf.m760N(c2658y72, m2897h);
        } catch (IllegalArgumentException unused) {
            c0349Gf = null;
        }
        if (c0349Gf != null) {
            c2658y7 = c0349Gf.m762h();
        } else {
            c2658y7 = null;
        }
        if (c2658y7 == null) {
            return null;
        }
        if (!AbstractC1292YB.m2695u(c2658y7.f8286z, ((C2658y7) c1364zx.f4279h).f8286z) && !c0234es.f786s) {
            return null;
        }
        C2306rP c2306rP = new C2306rP(c1364zx);
        if (AbstractC2575wW.m4446od(str)) {
            boolean m2695u = AbstractC1292YB.m2695u(str, "PROPFIND");
            int i2 = c1429ap.f4465I;
            if (m2695u || i2 == 308 || i2 == 307) {
                z = true;
            }
            if ((true ^ AbstractC1292YB.m2695u(str, "PROPFIND")) && i2 != 308 && i2 != 307) {
                str = "GET";
            } else if (z) {
                abstractC1911jx = (AbstractC1911jx) c1364zx.f4276N;
            }
            c2306rP.m3964v(str, abstractC1911jx);
            if (!z) {
                c2306rP.m3962P("Transfer-Encoding");
                c2306rP.m3962P("Content-Length");
                c2306rP.m3962P("Content-Type");
            }
        }
        if (!AbstractC1181W6.m2433z((C2658y7) c1364zx.f4279h, c2658y7)) {
            c2306rP.m3962P("Authorization");
        }
        c2306rP.f7123z = c2658y7;
        return c2306rP.m3965z();
    }

    /* renamed from: v */
    public final boolean m3607v(IOException iOException, C0523Jr c0523Jr, C1364ZX c1364zx, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        C0860Q2 c0860q2;
        C0770OM c0770om;
        if (!this.f6176z.f781k) {
            return false;
        }
        if (z && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if ((iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        C1179W4 c1179w4 = c0523Jr.f1759s;
        int i = c1179w4.f3850u;
        if (i == 0 && c1179w4.f3849o == 0 && c1179w4.f3847W == 0) {
            z3 = false;
        } else {
            if (c1179w4.f3843G == null) {
                C1946ke c1946ke = null;
                if (i <= 1 && c1179w4.f3849o <= 1 && c1179w4.f3847W <= 0 && (c0770om = c1179w4.f3851v.f1750U) != null) {
                    synchronized (c0770om) {
                        if (c0770om.f2625V == 0 && AbstractC1181W6.m2433z(c0770om.f2627h.f6034z.f7113W, c1179w4.f3848h.f7113W)) {
                            c1946ke = c0770om.f2627h;
                        }
                    }
                }
                if (c1946ke != null) {
                    c1179w4.f3843G = c1946ke;
                } else {
                    C1077UB c1077ub = c1179w4.f3844N;
                    if (c1077ub != null && c1077ub.m2256z()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4 && (c0860q2 = c1179w4.f3846Q) != null) {
                        z3 = c0860q2.m1995z();
                    }
                }
            }
            z3 = true;
        }
        if (!z3) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c3, code lost:
    
        throw new java.lang.IllegalArgumentException("priorResponse.body != null".toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // p000a.InterfaceC1975l8
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000a.C1429ap mo264z(p000a.C2515vK r33) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1994lV.mo264z(a.vK):a.ap");
    }
}
