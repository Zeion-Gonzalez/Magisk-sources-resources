package p000a;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: a.NP */
/* loaded from: classes.dex */
public final class C0711NP {

    /* renamed from: h */
    public final long f2387h;

    /* renamed from: v */
    public final C1956ko f2388v;

    /* renamed from: z */
    public final int f2389z = 5;

    /* renamed from: P */
    public final C2717zI f2386P = new C2717zI(2, this, AbstractC2441tz.m4187M(new StringBuilder(), AbstractC1181W6.f3858u, " ConnectionPool"));

    /* renamed from: N */
    public final ConcurrentLinkedQueue f2385N = new ConcurrentLinkedQueue();

    public C0711NP(C0634Lw c0634Lw, TimeUnit timeUnit) {
        this.f2387h = timeUnit.toNanos(5L);
        this.f2388v = c0634Lw.m1425Q();
    }

    /* renamed from: h */
    public final int m1648h(C0770OM c0770om, long j) {
        byte[] bArr = AbstractC1181W6.f3860z;
        ArrayList arrayList = c0770om.f2618I;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + c0770om.f2627h.f6034z.f7113W + " was leaked. Did you forget to close a response body?";
                C0799Ov c0799Ov = C0799Ov.f2726z;
                C0799Ov.f2726z.mo1882M(str, ((C0640M2) reference).f2065z);
                arrayList.remove(i);
                c0770om.f2617G = true;
                if (arrayList.isEmpty()) {
                    c0770om.f2629q = j - this.f2387h;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* renamed from: z */
    public final boolean m1649z(C2305rO c2305rO, C0523Jr c0523Jr, List list, boolean z) {
        Iterator it = this.f2385N.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                return false;
            }
            C0770OM c0770om = (C0770OM) it.next();
            synchronized (c0770om) {
                if (z) {
                    if (c0770om.f2630u != null) {
                        z2 = true;
                    }
                    if (!z2) {
                        continue;
                    }
                }
                if (c0770om.m1784W(c2305rO, list)) {
                    c0523Jr.m1220v(c0770om);
                    return true;
                }
            }
        }
    }
}
