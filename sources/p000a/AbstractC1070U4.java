package p000a;

import java.security.cert.X509Certificate;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: a.U4 */
/* loaded from: classes.dex */
public abstract class AbstractC1070U4 {

    /* renamed from: z */
    public static final Pattern f3534z = Pattern.compile("^(META-INF/((.*)[.](SF|RSA|DSA|EC)|com/android/otacert))|(" + Pattern.quote("META-INF/MANIFEST.MF") + ")$");

    /* renamed from: h */
    public static int m2253h(String str, String str2) {
        if ("SHA-256".equalsIgnoreCase(str2)) {
            if ("RSA".equalsIgnoreCase(str)) {
                return 259;
            }
            if ("EC".equalsIgnoreCase(str)) {
                return 513;
            }
            if ("DSA".equalsIgnoreCase(str)) {
                return 769;
            }
            throw new IllegalArgumentException("Unsupported key algorithm: ".concat(str));
        }
        if ("SHA-512".equalsIgnoreCase(str2)) {
            if ("RSA".equalsIgnoreCase(str)) {
                return 260;
            }
            if ("EC".equalsIgnoreCase(str)) {
                return 514;
            }
            if ("DSA".equalsIgnoreCase(str)) {
                return 770;
            }
            throw new IllegalArgumentException("Unsupported key algorithm: ".concat(str));
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4200k("Unsupported digest algorithm: ", str2));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: ConstInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: -1
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4586)
        	at jadx.core.dex.visitors.ConstInlineVisitor.needExplicitCast(ConstInlineVisitor.java:291)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:272)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:182)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:54)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:46)
        */
    /* renamed from: v */
    public static void m2254v(java.security.cert.X509Certificate r32, java.security.PrivateKey r33, p000a.C2723zO r34, java.io.OutputStream r35) {
        /*
            Method dump skipped, instructions count: 2828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC1070U4.m2254v(java.security.cert.X509Certificate, java.security.PrivateKey, a.zO, java.io.OutputStream):void");
    }

    /* renamed from: z */
    public static int m2255z(X509Certificate x509Certificate) {
        String upperCase = x509Certificate.getSigAlgName().toUpperCase(Locale.US);
        if ("SHA1WITHRSA".equals(upperCase) || "MD5WITHRSA".equals(upperCase)) {
            return 1;
        }
        if (upperCase.startsWith("SHA256WITH")) {
            return 2;
        }
        throw new IllegalArgumentException("unsupported signature algorithm \"" + upperCase + "\" in cert [" + x509Certificate.getSubjectDN());
    }
}
