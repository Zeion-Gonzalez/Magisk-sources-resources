package p000a;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: a.rP */
/* loaded from: classes.dex */
public final class C2306rP {

    /* renamed from: N */
    public LinkedHashMap f7119N;

    /* renamed from: P */
    public AbstractC1911jx f7120P;

    /* renamed from: h */
    public String f7121h;

    /* renamed from: v */
    public C1571dY f7122v;

    /* renamed from: z */
    public C2658y7 f7123z;

    public C2306rP() {
        this.f7119N = new LinkedHashMap();
        this.f7121h = "GET";
        this.f7122v = new C1571dY();
    }

    /* renamed from: N */
    public final void m3961N(Class cls, Object obj) {
        if (obj == null) {
            this.f7119N.remove(cls);
            return;
        }
        if (this.f7119N.isEmpty()) {
            this.f7119N = new LinkedHashMap();
        }
        this.f7119N.put(cls, cls.cast(obj));
    }

    /* renamed from: P */
    public final void m3962P(String str) {
        this.f7122v.m3041Q(str);
    }

    /* renamed from: h */
    public final void m3963h(String str, String str2) {
        this.f7122v.m3043u(str, str2);
    }

    /* renamed from: v */
    public final void m3964v(String str, AbstractC1911jx abstractC1911jx) {
        boolean z;
        boolean z2 = false;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (abstractC1911jx == null) {
                if (AbstractC1292YB.m2695u(str, "POST") || AbstractC1292YB.m2695u(str, "PUT") || AbstractC1292YB.m2695u(str, "PATCH") || AbstractC1292YB.m2695u(str, "PROPPATCH") || AbstractC1292YB.m2695u(str, "REPORT")) {
                    z2 = true;
                }
                if ((!z2) == false) {
                    throw new IllegalArgumentException(AbstractC2441tz.m4184G("method ", str, " must have a request body.").toString());
                }
            } else if (!AbstractC2575wW.m4446od(str)) {
                throw new IllegalArgumentException(AbstractC2441tz.m4184G("method ", str, " must not have a request body.").toString());
            }
            this.f7121h = str;
            this.f7120P = abstractC1911jx;
            return;
        }
        throw new IllegalArgumentException("method.isEmpty() == true".toString());
    }

    /* renamed from: z */
    public final C1364ZX m3965z() {
        Map unmodifiableMap;
        C2658y7 c2658y7 = this.f7123z;
        if (c2658y7 != null) {
            String str = this.f7121h;
            C1494c7 m3040P = this.f7122v.m3040P();
            AbstractC1911jx abstractC1911jx = this.f7120P;
            LinkedHashMap linkedHashMap = this.f7119N;
            byte[] bArr = AbstractC1181W6.f3860z;
            if (linkedHashMap.isEmpty()) {
                unmodifiableMap = C1202WT.f3909S;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            }
            return new C1364ZX(c2658y7, str, m3040P, abstractC1911jx, unmodifiableMap);
        }
        throw new IllegalStateException("url == null".toString());
    }

    public C2306rP(C1364ZX c1364zx) {
        this.f7119N = new LinkedHashMap();
        this.f7123z = (C2658y7) c1364zx.f4279h;
        this.f7121h = (String) c1364zx.f4281v;
        this.f7120P = (AbstractC1911jx) c1364zx.f4276N;
        Map map = (Map) c1364zx.f4278Q;
        this.f7119N = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        this.f7122v = ((C1494c7) c1364zx.f4277P).m2895P();
    }
}
