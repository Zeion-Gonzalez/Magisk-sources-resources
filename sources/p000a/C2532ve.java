package p000a;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: a.ve */
/* loaded from: classes.dex */
public final class C2532ve {

    /* renamed from: P */
    public boolean f7752P;

    /* renamed from: h */
    public int f7753h;

    /* renamed from: v */
    public boolean f7754v;

    /* renamed from: z */
    public final List f7755z;

    public C2532ve(List list) {
        this.f7755z = list;
    }

    /* renamed from: z */
    public final C0673Mk m4366z(SSLSocket sSLSocket) {
        C0673Mk c0673Mk;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        boolean z2;
        int i = this.f7753h;
        List list = this.f7755z;
        int size = list.size();
        while (true) {
            if (i < size) {
                c0673Mk = (C0673Mk) list.get(i);
                if (c0673Mk.m1570h(sSLSocket)) {
                    this.f7753h = i + 1;
                    break;
                }
                i++;
            } else {
                c0673Mk = null;
                break;
            }
        }
        if (c0673Mk != null) {
            int i2 = this.f7753h;
            int size2 = list.size();
            while (true) {
                if (i2 < size2) {
                    if (((C0673Mk) list.get(i2)).m1570h(sSLSocket)) {
                        z = true;
                        break;
                    }
                    i2++;
                } else {
                    z = false;
                    break;
                }
            }
            this.f7754v = z;
            boolean z3 = this.f7752P;
            String[] strArr = c0673Mk.f2223v;
            if (strArr != null) {
                enabledCipherSuites = AbstractC1181W6.m2418R(sSLSocket.getEnabledCipherSuites(), strArr, C0280FK.f978v);
            } else {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            String[] strArr2 = c0673Mk.f2221P;
            if (strArr2 != null) {
                enabledProtocols = AbstractC1181W6.m2418R(sSLSocket.getEnabledProtocols(), strArr2, C1147VS.f3731z);
            } else {
                enabledProtocols = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            C2496v1 c2496v1 = C0280FK.f978v;
            byte[] bArr = AbstractC1181W6.f3860z;
            int length = supportedCipherSuites.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    if (c2496v1.compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (z3 && i3 != -1) {
                String str = supportedCipherSuites[i3];
                enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
                enabledCipherSuites[enabledCipherSuites.length - 1] = str;
            }
            C1512cU c1512cU = new C1512cU(c0673Mk);
            c1512cU.m2934v((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
            c1512cU.m2932Q((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
            C0673Mk m2935z = c1512cU.m2935z();
            if (m2935z.m1571v() != null) {
                sSLSocket.setEnabledProtocols(m2935z.f2221P);
            }
            if (m2935z.m1572z() != null) {
                sSLSocket.setEnabledCipherSuites(m2935z.f2223v);
            }
            return c0673Mk;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f7752P + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }
}
