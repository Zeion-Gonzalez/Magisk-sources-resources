package p000a;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: a.TP */
/* loaded from: classes.dex */
public final class C1035TP implements InterfaceC1975l8 {
    @Override // p000a.InterfaceC1975l8
    /* renamed from: z */
    public final C1429ap mo264z(C2515vK c2515vK) {
        LinkedHashMap linkedHashMap;
        Map unmodifiableMap;
        C1364ZX c1364zx = c2515vK.f7697N;
        c1364zx.getClass();
        new LinkedHashMap();
        C2658y7 c2658y7 = (C2658y7) c1364zx.f4279h;
        String str = (String) c1364zx.f4281v;
        AbstractC1911jx abstractC1911jx = (AbstractC1911jx) c1364zx.f4276N;
        Map map = (Map) c1364zx.f4278Q;
        if (map.isEmpty()) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = new LinkedHashMap(map);
        }
        C1571dY m2895P = ((C1494c7) c1364zx.f4277P).m2895P();
        m2895P.m3043u("User-Agent", "Magisk/26400");
        m2895P.m3043u("Accept-Language", AbstractC1685fh.f5274z.toLanguageTag());
        if (c2658y7 != null) {
            C1494c7 m3040P = m2895P.m3040P();
            byte[] bArr = AbstractC1181W6.f3860z;
            if (linkedHashMap.isEmpty()) {
                unmodifiableMap = C1202WT.f3909S;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            }
            return c2515vK.m4356h(new C1364ZX(c2658y7, str, m3040P, abstractC1911jx, unmodifiableMap));
        }
        throw new IllegalStateException("url == null".toString());
    }
}
