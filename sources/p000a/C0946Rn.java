package p000a;

import android.util.Base64;
import android.util.Base64OutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;
import java.util.Vector;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: a.Rn */
/* loaded from: classes.dex */
public final class C0946Rn {

    /* renamed from: h */
    public final PrivateKey f3243h;

    /* renamed from: z */
    public final X509Certificate f3244z;

    public C0946Rn() {
        boolean z;
        Calendar calendar = Calendar.getInstance();
        calendar.add(2, -3);
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.add(1, 30);
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        InterfaceC0609LP interfaceC0609LP = C1212We.f3959h[25];
        String m2927z = C1212We.f3956e.m2927z(c1212We);
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        if (m2927z.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            keyStore.load(null);
        } else {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(Base64.decode(m2927z, 3)));
            try {
                keyStore.load(gZIPInputStream, "magisk".toCharArray());
                AbstractC1292YB.m2659R(gZIPInputStream, null);
            } finally {
            }
        }
        if (!keyStore.containsAlias("magisk")) {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(4096);
            KeyPair genKeyPair = keyPairGenerator.genKeyPair();
            C2043mV c2043mV = new C2043mV();
            C1624eZ c1624eZ = new C1624eZ(c2043mV, new BigInteger(160, new Random()), calendar.getTime(), calendar2.getTime(), Locale.ROOT, c2043mV, C1133VD.m2331V(genKeyPair.getPublic().getEncoded()));
            C0525Ju m3701z = new C2082nD("SHA1WithRSA").m3701z(genKeyPair.getPrivate());
            C0175DP c0175dp = new C0175DP(6);
            ((C0267F6) c1624eZ.f5013R).f945v = m3701z.m1227R();
            if (!((C1208Wa) c1624eZ.f5015w).f3925h.isEmpty()) {
                C0267F6 c0267f6 = (C0267F6) c1624eZ.f5013R;
                C1208Wa c1208Wa = (C1208Wa) c1624eZ.f5015w;
                Vector vector = c1208Wa.f3925h;
                C1767hE[] c1767hEArr = new C1767hE[vector.size()];
                for (int i = 0; i != vector.size(); i++) {
                    c1767hEArr[i] = (C1767hE) c1208Wa.f3926z.get(vector.elementAt(i));
                }
                C2051me c2051me = new C2051me(c1767hEArr);
                c0267f6.f941W = c2051me;
                C1767hE c1767hE = (C1767hE) c2051me.f6381S.get(C1767hE.f5566q);
                if (c1767hE != null && c1767hE.f5567R) {
                    c0267f6.f937G = true;
                }
            }
            try {
                C2661yC m574z = ((C0267F6) c1624eZ.f5013R).m574z();
                C2074n2 m1227R = m3701z.m1227R();
                OutputStream m1235q = m3701z.m1235q();
                m574z.mo418W(m1235q);
                m1235q.close();
                byte[] m1233k = m3701z.m1233k();
                C2551w c2551w = new C2551w();
                c2551w.m4371z(m574z);
                c2551w.m4371z(m1227R);
                c2551w.m4371z(new C0781OX(m1233k));
                C0788Og m1795V = C0788Og.m1795V(new C1802hw(c2551w));
                m1795V.f2654R.getClass();
                try {
                    ((C1665fK) c0175dp.f541R).getClass();
                    keyStore.setKeyEntry("magisk", genKeyPair.getPrivate(), "magisk".toCharArray(), new X509Certificate[]{(X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(m1795V.m416G()))});
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new Base64OutputStream(byteArrayOutputStream, 3));
                    try {
                        keyStore.store(gZIPOutputStream, "magisk".toCharArray());
                        AbstractC1292YB.m2659R(gZIPOutputStream, null);
                        C1212We c1212We2 = C1212We.f3969z;
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                        c1212We2.getClass();
                        InterfaceC0609LP interfaceC0609LP2 = C1212We.f3959h[25];
                        C1212We.f3956e.m2926h(c1212We2, byteArrayOutputStream2);
                    } finally {
                    }
                } catch (IOException e) {
                    throw new C1887jX("exception parsing certificate: " + e.getMessage(), e);
                } catch (NoSuchProviderException e2) {
                    throw new C2148oW("cannot find required provider:" + e2.getMessage(), e2);
                }
            } catch (IOException e3) {
                throw new IllegalArgumentException("cannot produce certificate signature", e3);
            }
        }
        this.f3244z = (X509Certificate) keyStore.getCertificate("magisk");
        this.f3243h = (PrivateKey) keyStore.getKey("magisk", "magisk".toCharArray());
    }
}
