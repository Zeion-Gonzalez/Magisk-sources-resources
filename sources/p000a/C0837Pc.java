package p000a;

/* renamed from: a.Pc */
/* loaded from: classes.dex */
public final class C0837Pc extends AbstractC1804hz {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0837Pc(java.util.ArrayList r4) {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r4.next()
            boolean r2 = r1 instanceof java.security.cert.X509Certificate
            if (r2 == 0) goto L43
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
            a.nn r2 = new a.nn     // Catch: java.io.IOException -> L2a
            byte[] r1 = r1.getEncoded()     // Catch: java.io.IOException -> L2a
            r2.<init>(r1)     // Catch: java.io.IOException -> L2a
            r0.add(r2)     // Catch: java.io.IOException -> L2a
            goto Ld
        L2a:
            r4 = move-exception
            java.security.cert.CertificateEncodingException r0 = new java.security.cert.CertificateEncodingException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unable to read encoding: "
            r1.<init>(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L43:
            a.nn r1 = (p000a.C2111nn) r1
            r0.add(r1)
            goto Ld
        L49:
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0837Pc.<init>(java.util.ArrayList):void");
    }
}
