package p000a;

import java.util.HashMap;

/* renamed from: a.Ym */
/* loaded from: classes.dex */
public final class C1322Ym {

    /* renamed from: h */
    public final C1987lO f4194h;

    /* renamed from: z */
    public final C2692yp f4195z;

    static {
        HashMap hashMap = AbstractC0444IQ.f1482z;
    }

    public C1322Ym(C2382so c2382so, C1987lO c1987lO) {
        C2692yp c2692yp;
        this.f4194h = c1987lO;
        try {
            InterfaceC0959S interfaceC0959S = c1987lO.f6160R;
            C2339s c2339s = C2692yp.f8414E;
            if (interfaceC0959S instanceof C2692yp) {
                c2692yp = (C2692yp) interfaceC0959S;
            } else if (interfaceC0959S != null) {
                c2692yp = new C2692yp(AbstractC1333Z.m2714U(interfaceC0959S));
            } else {
                c2692yp = null;
            }
            this.f4195z = c2692yp;
        } catch (ClassCastException e) {
            throw new C0633Lv("Malformed content.", e);
        } catch (IllegalArgumentException e2) {
            throw new C0633Lv("Malformed content.", e2);
        }
    }

    /* renamed from: z */
    public final byte[] m2710z() {
        return this.f4194h.m416G();
    }
}
