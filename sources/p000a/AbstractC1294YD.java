package p000a;

import java.util.HashMap;

/* renamed from: a.YD */
/* loaded from: classes.dex */
public abstract class AbstractC1294YD {

    /* renamed from: z */
    public static final HashMap f4147z;

    static {
        HashMap hashMap = new HashMap();
        f4147z = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap.put(InterfaceC0237EV.f813q, "MD2");
        hashMap.put(InterfaceC0237EV.f811k, "MD4");
        hashMap.put(InterfaceC0237EV.f809g, "MD5");
        C1281Y c1281y = InterfaceC1455bJ.f4537N;
        hashMap.put(c1281y, "SHA-1");
        C1281Y c1281y2 = InterfaceC1616eP.f4975P;
        hashMap.put(c1281y2, "SHA-224");
        C1281Y c1281y3 = InterfaceC1616eP.f5001z;
        hashMap.put(c1281y3, "SHA-256");
        C1281Y c1281y4 = InterfaceC1616eP.f4989h;
        hashMap.put(c1281y4, "SHA-384");
        C1281Y c1281y5 = InterfaceC1616eP.f4998v;
        hashMap.put(c1281y5, "SHA-512");
        hashMap.put(InterfaceC1616eP.f4974N, "SHA-512(224)");
        hashMap.put(InterfaceC1616eP.f4976Q, "SHA-512(256)");
        hashMap.put(InterfaceC2373se.f7297h, "RIPEMD-128");
        hashMap.put(InterfaceC2373se.f7300z, "RIPEMD-160");
        hashMap.put(InterfaceC2373se.f7299v, "RIPEMD-128");
        hashMap.put(InterfaceC1981lG.f6146h, "RIPEMD-128");
        hashMap.put(InterfaceC1981lG.f6148z, "RIPEMD-160");
        hashMap.put(InterfaceC0672Mj.f2218z, "GOST3411");
        hashMap.put(InterfaceC1397aD.f4400z, "Tiger");
        hashMap.put(InterfaceC1981lG.f6147v, "Whirlpool");
        C1281Y c1281y6 = InterfaceC1616eP.f4997u;
        hashMap.put(c1281y6, "SHA3-224");
        C1281Y c1281y7 = InterfaceC1616eP.f4992o;
        hashMap.put(c1281y7, "SHA3-256");
        C1281Y c1281y8 = InterfaceC1616eP.f4981W;
        hashMap.put(c1281y8, "SHA3-384");
        C1281Y c1281y9 = InterfaceC1616eP.f4968G;
        hashMap.put(c1281y9, "SHA3-512");
        hashMap.put(InterfaceC1616eP.f4973M, "SHAKE128");
        hashMap.put(InterfaceC1616eP.f4980V, "SHAKE256");
        hashMap.put(InterfaceC1022TA.f3419z, "SM3");
        C1281Y c1281y10 = InterfaceC0537K8.f1786z;
        hashMap.put(c1281y10, "BLAKE3-256");
        hashMap2.put("SHA-1", new C2074n2(c1281y, C1618eR.f5003S));
        hashMap2.put("SHA-224", new C2074n2(c1281y2));
        hashMap2.put("SHA224", new C2074n2(c1281y2));
        hashMap2.put("SHA-256", new C2074n2(c1281y3));
        hashMap2.put("SHA256", new C2074n2(c1281y3));
        hashMap2.put("SHA-384", new C2074n2(c1281y4));
        hashMap2.put("SHA384", new C2074n2(c1281y4));
        hashMap2.put("SHA-512", new C2074n2(c1281y5));
        hashMap2.put("SHA512", new C2074n2(c1281y5));
        hashMap2.put("SHA3-224", new C2074n2(c1281y6));
        hashMap2.put("SHA3-256", new C2074n2(c1281y7));
        hashMap2.put("SHA3-384", new C2074n2(c1281y8));
        hashMap2.put("SHA3-512", new C2074n2(c1281y9));
        hashMap2.put("BLAKE3-256", new C2074n2(c1281y10));
    }
}
