package p000a;

import java.util.HashMap;

/* renamed from: a.in */
/* loaded from: classes.dex */
public final class C1849in {

    /* renamed from: h */
    public static final HashMap f5773h;

    /* renamed from: z */
    public static final HashMap f5774z;

    static {
        HashMap hashMap = new HashMap();
        f5774z = hashMap;
        HashMap hashMap2 = new HashMap();
        f5773h = hashMap2;
        hashMap.put(InterfaceC0237EV.f812o, "RSASSA-PSS");
        hashMap.put(InterfaceC1308YV.f4168z, "ED25519");
        hashMap.put(InterfaceC1308YV.f4167h, "ED448");
        hashMap.put(new C1281Y("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        hashMap.put(InterfaceC0237EV.f802V, "SHA224WITHRSA");
        hashMap.put(InterfaceC0237EV.f803W, "SHA256WITHRSA");
        hashMap.put(InterfaceC0237EV.f791G, "SHA384WITHRSA");
        hashMap.put(InterfaceC0237EV.f795M, "SHA512WITHRSA");
        hashMap.put(InterfaceC0141Cj.f487P, "SHAKE128WITHRSAPSS");
        hashMap.put(InterfaceC0141Cj.f486N, "SHAKE256WITHRSAPSS");
        hashMap.put(InterfaceC0672Mj.f2214P, "GOST3411WITHGOST3410");
        hashMap.put(InterfaceC0672Mj.f2213N, "GOST3411WITHECGOST3410");
        hashMap.put(InterfaceC2508vD.f7677N, "GOST3411-2012-256WITHECGOST3410-2012-256");
        hashMap.put(InterfaceC2508vD.f7679Q, "GOST3411-2012-512WITHECGOST3410-2012-512");
        hashMap.put(InterfaceC1134VE.f3706z, "SHA1WITHPLAIN-ECDSA");
        hashMap.put(InterfaceC1134VE.f3702h, "SHA224WITHPLAIN-ECDSA");
        hashMap.put(InterfaceC1134VE.f3705v, "SHA256WITHPLAIN-ECDSA");
        hashMap.put(InterfaceC1134VE.f3699P, "SHA384WITHPLAIN-ECDSA");
        hashMap.put(InterfaceC1134VE.f3698N, "SHA512WITHPLAIN-ECDSA");
        hashMap.put(InterfaceC1134VE.f3704u, "SHA3-224WITHPLAIN-ECDSA");
        hashMap.put(InterfaceC1134VE.f3703o, "SHA3-256WITHPLAIN-ECDSA");
        hashMap.put(InterfaceC1134VE.f3701W, "SHA3-384WITHPLAIN-ECDSA");
        hashMap.put(InterfaceC1134VE.f3697G, "SHA3-512WITHPLAIN-ECDSA");
        hashMap.put(InterfaceC1134VE.f3700Q, "RIPEMD160WITHPLAIN-ECDSA");
        hashMap.put(InterfaceC0008A8.f86N, "SHA1WITHCVC-ECDSA");
        hashMap.put(InterfaceC0008A8.f88Q, "SHA224WITHCVC-ECDSA");
        hashMap.put(InterfaceC0008A8.f92u, "SHA256WITHCVC-ECDSA");
        hashMap.put(InterfaceC0008A8.f91o, "SHA384WITHCVC-ECDSA");
        hashMap.put(InterfaceC0008A8.f89W, "SHA512WITHCVC-ECDSA");
        hashMap.put(InterfaceC1778hR.f5601z, "XMSS");
        hashMap.put(InterfaceC1778hR.f5600h, "XMSSMT");
        hashMap.put(InterfaceC2373se.f7296Q, "RIPEMD128WITHRSA");
        hashMap.put(InterfaceC2373se.f7294N, "RIPEMD160WITHRSA");
        hashMap.put(InterfaceC2373se.f7298u, "RIPEMD256WITHRSA");
        hashMap.put(new C1281Y("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        hashMap.put(new C1281Y("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        hashMap.put(new C1281Y("1.2.840.10040.4.3"), "SHA1WITHDSA");
        hashMap.put(InterfaceC0800Ow.f2736z, "SHA1WITHECDSA");
        hashMap.put(InterfaceC0800Ow.f2732h, "SHA224WITHECDSA");
        hashMap.put(InterfaceC0800Ow.f2735v, "SHA256WITHECDSA");
        hashMap.put(InterfaceC0800Ow.f2729P, "SHA384WITHECDSA");
        hashMap.put(InterfaceC0800Ow.f2728N, "SHA512WITHECDSA");
        hashMap.put(InterfaceC0141Cj.f488Q, "SHAKE128WITHECDSA");
        hashMap.put(InterfaceC0141Cj.f490u, "SHAKE256WITHECDSA");
        hashMap.put(InterfaceC1455bJ.f4542u, "SHA1WITHRSA");
        hashMap.put(InterfaceC1455bJ.f4539Q, "SHA1WITHDSA");
        hashMap.put(InterfaceC1616eP.f4979U, "SHA224WITHDSA");
        hashMap.put(InterfaceC1616eP.f4966E, "SHA256WITHDSA");
        hashMap2.put(InterfaceC1455bJ.f4537N, "SHA1");
        hashMap2.put(InterfaceC1616eP.f4975P, "SHA224");
        hashMap2.put(InterfaceC1616eP.f5001z, "SHA256");
        hashMap2.put(InterfaceC1616eP.f4989h, "SHA384");
        hashMap2.put(InterfaceC1616eP.f4998v, "SHA512");
        hashMap2.put(InterfaceC1616eP.f4997u, "SHA3-224");
        hashMap2.put(InterfaceC1616eP.f4992o, "SHA3-256");
        hashMap2.put(InterfaceC1616eP.f4981W, "SHA3-384");
        hashMap2.put(InterfaceC1616eP.f4968G, "SHA3-512");
        hashMap2.put(InterfaceC2373se.f7297h, "RIPEMD128");
        hashMap2.put(InterfaceC2373se.f7300z, "RIPEMD160");
        hashMap2.put(InterfaceC2373se.f7299v, "RIPEMD256");
    }

    /* renamed from: z */
    public static String m3471z(C1281Y c1281y) {
        String str = (String) f5773h.get(c1281y);
        if (str != null) {
            return str;
        }
        return c1281y.f4116S;
    }
}
