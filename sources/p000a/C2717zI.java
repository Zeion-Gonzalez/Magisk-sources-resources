package p000a;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: a.zI */
/* loaded from: classes.dex */
public final class C2717zI extends AbstractC1986lN {

    /* renamed from: N */
    public final /* synthetic */ int f8549N;

    /* renamed from: Q */
    public final /* synthetic */ Object f8550Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2717zI(int i, Object obj, String str) {
        super(str, true);
        this.f8549N = i;
        this.f8550Q = obj;
    }

    /* renamed from: h */
    private long m4653h() {
        C0711NP c0711np = (C0711NP) this.f8550Q;
        long nanoTime = System.nanoTime();
        Iterator it = c0711np.f2385N.iterator();
        int i = 0;
        long j = Long.MIN_VALUE;
        C0770OM c0770om = null;
        int i2 = 0;
        while (it.hasNext()) {
            C0770OM c0770om2 = (C0770OM) it.next();
            synchronized (c0770om2) {
                if (c0711np.m1648h(c0770om2, nanoTime) > 0) {
                    i2++;
                } else {
                    i++;
                    long j2 = nanoTime - c0770om2.f2629q;
                    if (j2 > j) {
                        c0770om = c0770om2;
                        j = j2;
                    }
                }
            }
        }
        long j3 = c0711np.f2387h;
        if (j < j3 && i <= c0711np.f2389z) {
            if (i > 0) {
                return j3 - j;
            }
            if (i2 <= 0) {
                return -1L;
            }
            return j3;
        }
        synchronized (c0770om) {
            if ((!c0770om.f2618I.isEmpty()) == false && c0770om.f2629q + j == nanoTime) {
                c0770om.f2617G = true;
                c0711np.f2385N.remove(c0770om);
                AbstractC1181W6.m2416P(c0770om.f2621P);
                if (c0711np.f2385N.isEmpty()) {
                    c0711np.f2388v.m3580z();
                }
            }
        }
        return 0L;
    }

    @Override // p000a.AbstractC1986lN
    /* renamed from: z */
    public final long mo256z() {
        switch (this.f8549N) {
            case AbstractC0795Op.f2698E /* 0 */:
                C0437IH c0437ih = (C0437IH) this.f8550Q;
                synchronized (c0437ih) {
                    if (c0437ih.f1447r && !c0437ih.f1440Y) {
                        try {
                            c0437ih.m978Lq();
                        } catch (IOException unused) {
                            c0437ih.f1435J = true;
                        }
                        try {
                            if (c0437ih.m976C()) {
                                c0437ih.m982dx();
                                c0437ih.f1438U = 0;
                            }
                        } catch (IOException unused2) {
                            c0437ih.f1441c = true;
                            c0437ih.f1450y = new C0418Hu(new C1097Ua());
                        }
                    }
                }
                return -1L;
            case 1:
                ((InterfaceC1459bP) this.f8550Q).mo93z();
                return -1L;
            case 2:
                return m4653h();
            default:
                C0669Mf c0669Mf = (C0669Mf) this.f8550Q;
                c0669Mf.getClass();
                try {
                    c0669Mf.f2191L.m4261C(2, 0, false);
                } catch (IOException e) {
                    c0669Mf.m1564h(e);
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2717zI(int i, Object obj, String str, int i2) {
        super(str, true);
        this.f8549N = i;
        this.f8550Q = obj;
    }
}
