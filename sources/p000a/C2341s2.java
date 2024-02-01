package p000a;

/* renamed from: a.s2 */
/* loaded from: classes.dex */
public final class C2341s2 extends AbstractC0438II {

    /* renamed from: e */
    public final InterfaceC2288r5 f7180e;

    public C2341s2(InterfaceC2288r5 interfaceC2288r5) {
        this.f7180e = interfaceC2288r5;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[LOOP:1: B:22:0x005d->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // p000a.AbstractC0438II
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List mo1054R(java.lang.String r10, java.util.List r11) {
        /*
            r9 = this;
            java.util.ArrayDeque r10 = new java.util.ArrayDeque
            r10.<init>(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.Object r0 = r10.removeFirst()
            r11.add(r0)
            r0 = 0
            r1 = r0
            r2 = r1
        L14:
            r3 = 9
            if (r1 >= r3) goto La4
            int r3 = r11.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r3 = r11.get(r3)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            a.r5 r5 = r9.f7180e
            java.security.cert.X509Certificate r5 = r5.mo970z(r3)
            if (r5 == 0) goto L59
            int r2 = r11.size()
            if (r2 > r4) goto L38
            boolean r2 = p000a.AbstractC1292YB.m2695u(r3, r5)
            if (r2 != 0) goto L3b
        L38:
            r11.add(r5)
        L3b:
            java.security.Principal r2 = r5.getIssuerDN()
            java.security.Principal r3 = r5.getSubjectDN()
            boolean r2 = p000a.AbstractC1292YB.m2695u(r2, r3)
            if (r2 != 0) goto L4a
            goto L53
        L4a:
            java.security.PublicKey r2 = r5.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L53
            r5.verify(r2)     // Catch: java.security.GeneralSecurityException -> L53
            r2 = r4
            goto L54
        L53:
            r2 = r0
        L54:
            if (r2 == 0) goto L57
            return r11
        L57:
            r2 = r4
            goto L8a
        L59:
            java.util.Iterator r5 = r10.iterator()
        L5d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8d
            java.lang.Object r6 = r5.next()
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.security.Principal r7 = r3.getIssuerDN()
            java.security.Principal r8 = r6.getSubjectDN()
            boolean r7 = p000a.AbstractC1292YB.m2695u(r7, r8)
            if (r7 != 0) goto L78
            goto L81
        L78:
            java.security.PublicKey r7 = r6.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L81
            r3.verify(r7)     // Catch: java.security.GeneralSecurityException -> L81
            r7 = r4
            goto L82
        L81:
            r7 = r0
        L82:
            if (r7 == 0) goto L5d
            r5.remove()
            r11.add(r6)
        L8a:
            int r1 = r1 + 1
            goto L14
        L8d:
            if (r2 == 0) goto L90
            return r11
        L90:
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r11.<init>(r0)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        La4:
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Certificate chain too long: "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2341s2.mo1054R(java.lang.String, java.util.List):java.util.List");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C2341s2) && AbstractC1292YB.m2695u(((C2341s2) obj).f7180e, this.f7180e);
    }

    public final int hashCode() {
        return this.f7180e.hashCode();
    }
}
