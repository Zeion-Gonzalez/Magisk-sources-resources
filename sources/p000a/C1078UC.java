package p000a;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* renamed from: a.UC */
/* loaded from: classes.dex */
public final class C1078UC {

    /* renamed from: h */
    public static final HashMap f3545h;

    /* renamed from: v */
    public static final C1849in f3546v;

    /* renamed from: z */
    public final C1665fK f3547z;

    static {
        HashMap hashMap = new HashMap();
        f3545h = hashMap;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        f3546v = new C1849in();
        hashMap.put(InterfaceC1455bJ.f4537N, "SHA1");
        hashMap.put(InterfaceC1616eP.f4975P, "SHA224");
        hashMap.put(InterfaceC1616eP.f5001z, "SHA256");
        hashMap.put(InterfaceC1616eP.f4989h, "SHA384");
        hashMap.put(InterfaceC1616eP.f4998v, "SHA512");
        hashMap.put(InterfaceC2373se.f7297h, "RIPEMD128");
        hashMap.put(InterfaceC2373se.f7300z, "RIPEMD160");
        hashMap.put(InterfaceC2373se.f7299v, "RIPEMD256");
        hashMap2.put(InterfaceC0237EV.f820z, "RSA/ECB/PKCS1Padding");
        hashMap2.put(InterfaceC1455bJ.f4541o, "Elgamal/ECB/PKCS1Padding");
        hashMap2.put(InterfaceC0237EV.f798Q, "RSA/ECB/OAEPPadding");
        hashMap2.put(InterfaceC0672Mj.f2217v, "ECGOST3410");
        C1281Y c1281y = InterfaceC0237EV.f792H;
        hashMap3.put(c1281y, "DESEDEWrap");
        hashMap3.put(InterfaceC0237EV.f807e, "RC2Wrap");
        C1281Y c1281y2 = InterfaceC1616eP.f4994q;
        hashMap3.put(c1281y2, "AESWrap");
        C1281Y c1281y3 = InterfaceC1616eP.f4988g;
        hashMap3.put(c1281y3, "AESWrap");
        C1281Y c1281y4 = InterfaceC1616eP.f4996s;
        hashMap3.put(c1281y4, "AESWrap");
        C1281Y c1281y5 = InterfaceC1025TD.f3428z;
        hashMap3.put(c1281y5, "CamelliaWrap");
        C1281Y c1281y6 = InterfaceC1025TD.f3426h;
        hashMap3.put(c1281y6, "CamelliaWrap");
        C1281Y c1281y7 = InterfaceC1025TD.f3427v;
        hashMap3.put(c1281y7, "CamelliaWrap");
        C1281Y c1281y8 = InterfaceC1262Xe.f4084z;
        hashMap3.put(c1281y8, "SEEDWrap");
        C1281Y c1281y9 = InterfaceC0237EV.f818w;
        hashMap3.put(c1281y9, "DESede");
        hashMap5.put(c1281y, 192);
        hashMap5.put(c1281y2, 128);
        hashMap5.put(c1281y3, 192);
        hashMap5.put(c1281y4, 256);
        hashMap5.put(c1281y5, 128);
        hashMap5.put(c1281y6, 192);
        hashMap5.put(c1281y7, 256);
        hashMap5.put(c1281y8, 128);
        hashMap5.put(c1281y9, 192);
        hashMap4.put(InterfaceC1616eP.f4999w, "AES");
        hashMap4.put(InterfaceC1616eP.f4970I, "AES");
        hashMap4.put(InterfaceC1616eP.f4991k, "AES");
        hashMap4.put(InterfaceC1616eP.f5000y, "AES");
        hashMap4.put(c1281y9, "DESede");
        hashMap4.put(InterfaceC0237EV.f793I, "RC2");
    }

    public C1078UC(C1665fK c1665fK) {
        this.f3547z = c1665fK;
    }

    /* renamed from: z */
    public final MessageDigest m2257z(C2074n2 c2074n2) {
        String str;
        C1665fK c1665fK = this.f3547z;
        try {
            C1281Y c1281y = c2074n2.f6429S;
            boolean m3068I = c1281y.m3068I(InterfaceC1616eP.f4977R);
            InterfaceC0959S interfaceC0959S = c2074n2.f6428R;
            if (m3068I) {
                StringBuilder sb = new StringBuilder("SHAKE256-");
                C2339s m3996y = C2339s.m3996y(interfaceC0959S);
                m3996y.getClass();
                sb.append(new BigInteger(m3996y.f7179S));
                str = sb.toString();
            } else if (c1281y.m3068I(InterfaceC1616eP.f4978S)) {
                StringBuilder sb2 = new StringBuilder("SHAKE128-");
                C2339s m3996y2 = C2339s.m3996y(interfaceC0959S);
                m3996y2.getClass();
                sb2.append(new BigInteger(m3996y2.f7179S));
                str = sb2.toString();
            } else {
                str = (String) AbstractC1294YD.f4147z.get(c1281y);
                if (str == null) {
                    str = c1281y.f4116S;
                }
            }
            c1665fK.getClass();
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            HashMap hashMap = f3545h;
            if (hashMap.get(c2074n2.f6429S) != null) {
                String str2 = (String) hashMap.get(c2074n2.f6429S);
                c1665fK.getClass();
                return MessageDigest.getInstance(str2);
            }
            throw e;
        }
    }
}
