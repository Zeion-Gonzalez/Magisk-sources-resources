package p000a;

import java.io.IOException;

/* renamed from: a.vH */
/* loaded from: classes.dex */
public final class C2512vH implements InterfaceC1975l8 {

    /* renamed from: z */
    public static final C2512vH f7696z = new C2512vH();

    @Override // p000a.InterfaceC1975l8
    /* renamed from: z */
    public final C1429ap mo264z(C2515vK c2515vK) {
        boolean z;
        C0523Jr c0523Jr = c2515vK.f7705z;
        synchronized (c0523Jr) {
            if (c0523Jr.f1747J) {
                if ((!c0523Jr.f1751Y) != false) {
                    if ((!c0523Jr.f1758r) == false) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        C1179W4 c1179w4 = c0523Jr.f1759s;
        C0234ES c0234es = c0523Jr.f1749S;
        c1179w4.getClass();
        try {
            int i = c2515vK.f7699Q;
            int i2 = c2515vK.f7703u;
            int i3 = c2515vK.f7702o;
            int i4 = c0234es.f767O;
            boolean z2 = c0234es.f781k;
            if (!AbstractC1292YB.m2695u((String) c2515vK.f7697N.f4281v, "GET")) {
                z = true;
            } else {
                z = false;
            }
            C0998Si c0998Si = new C0998Si(c0523Jr, c0523Jr.f1757q, c1179w4, c1179w4.m2410z(i, i2, i3, i4, z2, z).m1779M(c0234es, c2515vK));
            c0523Jr.f1754f = c0998Si;
            c0523Jr.f1745H = c0998Si;
            synchronized (c0523Jr) {
                c0523Jr.f1758r = true;
                c0523Jr.f1751Y = true;
            }
            if (!c0523Jr.f1752c) {
                return C2515vK.m4355z(c2515vK, 0, c0998Si, null, 61).m4356h(c2515vK.f7697N);
            }
            throw new IOException("Canceled");
        } catch (C1458bN e) {
            c1179w4.m2409h(e.f4547R);
            throw e;
        } catch (IOException e2) {
            c1179w4.m2409h(e2);
            throw new C1458bN(e2);
        }
    }
}
