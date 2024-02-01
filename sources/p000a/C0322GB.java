package p000a;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: a.GB */
/* loaded from: classes.dex */
public final class C0322GB extends C0799Ov {

    /* renamed from: v */
    public static final boolean f1095v;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0017, code lost:
    
        if (r0.intValue() >= 9) goto L30;
     */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto Ld
            java.lang.Integer r0 = p000a.AbstractC1684fg.m3177O4(r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            r1 = 0
            if (r0 == 0) goto L1a
            int r0 = r0.intValue()
            r2 = 9
            if (r0 < r2) goto L24
            goto L23
        L1a:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r2 = "getApplicationProtocol"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L24
            r0.getMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L24
        L23:
            r1 = 1
        L24:
            p000a.C0322GB.f1095v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0322GB.<clinit>():void");
    }

    @Override // p000a.C0799Ov
    /* renamed from: P */
    public final void mo297P(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) C2252qQ.m3894v(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // p000a.C0799Ov
    /* renamed from: Q */
    public final String mo298Q(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
        } catch (UnsupportedOperationException unused) {
        }
        if (applicationProtocol == null ? true : AbstractC1292YB.m2695u(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }
}
