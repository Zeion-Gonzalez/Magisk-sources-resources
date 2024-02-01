package p000a;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: a.WY */
/* loaded from: classes.dex */
public final class C1206WY implements InterfaceC1828iQ {

    /* renamed from: h */
    public static final HashMap f3918h;

    /* renamed from: z */
    public static final HashSet f3919z;

    static {
        HashSet hashSet = new HashSet();
        f3919z = hashSet;
        HashMap hashMap = new HashMap();
        f3918h = hashMap;
        hashSet.add(InterfaceC0237EV.f810h);
        hashSet.add(InterfaceC0237EV.f817v);
        hashSet.add(InterfaceC0237EV.f797P);
        hashSet.add(InterfaceC0237EV.f796N);
        hashSet.add(InterfaceC1455bJ.f4543v);
        hashSet.add(InterfaceC1455bJ.f4544z);
        hashSet.add(InterfaceC1455bJ.f4540h);
        hashSet.add(InterfaceC1455bJ.f4542u);
        hashSet.add(InterfaceC2373se.f7296Q);
        hashSet.add(InterfaceC2373se.f7294N);
        hashSet.add(InterfaceC2373se.f7298u);
        C1281Y c1281y = InterfaceC0672Mj.f2213N;
        C1281Y c1281y2 = InterfaceC0672Mj.f2217v;
        C1618eR c1618eR = C1618eR.f5003S;
        hashMap.put(c1281y, new C2074n2(c1281y2, c1618eR));
        hashMap.put(InterfaceC2508vD.f7677N, new C2074n2(InterfaceC2508vD.f7683v, c1618eR));
        hashMap.put(InterfaceC2508vD.f7679Q, new C2074n2(InterfaceC2508vD.f7678P, c1618eR));
    }

    /* renamed from: z */
    public final C2074n2 m2488z(C2074n2 c2074n2) {
        if (f3919z.contains(c2074n2.f6429S)) {
            return new C2074n2(InterfaceC0237EV.f820z, C1618eR.f5003S);
        }
        HashMap hashMap = f3918h;
        C1281Y c1281y = c2074n2.f6429S;
        if (hashMap.containsKey(c1281y)) {
            return (C2074n2) hashMap.get(c1281y);
        }
        return c2074n2;
    }
}
