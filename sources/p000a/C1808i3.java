package p000a;

import java.io.IOException;

/* renamed from: a.i3 */
/* loaded from: classes.dex */
public final class C1808i3 extends AbstractC1986lN {

    /* renamed from: N */
    public final /* synthetic */ C0166DE f5671N;

    /* renamed from: Q */
    public final /* synthetic */ boolean f5672Q = false;

    /* renamed from: u */
    public final /* synthetic */ C1148VU f5673u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1808i3(String str, C0166DE c0166de, C1148VU c1148vu) {
        super(str, true);
        this.f5671N = c0166de;
        this.f5673u = c1148vu;
    }

    @Override // p000a.AbstractC1986lN
    /* renamed from: z */
    public final long mo256z() {
        int i;
        boolean z;
        long m2360z;
        C0573Kk[] c0573KkArr;
        C0166DE c0166de = this.f5671N;
        boolean z2 = this.f5672Q;
        C1148VU c1148vu = this.f5673u;
        C1640ep c1640ep = new C1640ep();
        C0669Mf c0669Mf = c0166de.f523R;
        synchronized (c0669Mf.f2191L) {
            synchronized (c0669Mf) {
                try {
                    C1148VU c1148vu2 = c0669Mf.f2195X;
                    i = 0;
                    if (!z2) {
                        C1148VU c1148vu3 = new C1148VU();
                        int i2 = 0;
                        while (true) {
                            boolean z3 = true;
                            if (i2 >= 10) {
                                break;
                            }
                            if (((1 << i2) & c1148vu2.f3733z) == 0) {
                                z3 = false;
                            }
                            if (z3) {
                                c1148vu3.m2359h(i2, c1148vu2.f3732h[i2]);
                            }
                            i2++;
                        }
                        for (int i3 = 0; i3 < 10; i3++) {
                            if (((1 << i3) & c1148vu.f3733z) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                c1148vu3.m2359h(i3, c1148vu.f3732h[i3]);
                            }
                        }
                        c1148vu = c1148vu3;
                    }
                    c1640ep.f5100S = c1148vu;
                    m2360z = c1148vu.m2360z() - c1148vu2.m2360z();
                    if (m2360z != 0 && !c0669Mf.f2210w.isEmpty()) {
                        c0573KkArr = (C0573Kk[]) c0669Mf.f2210w.values().toArray(new C0573Kk[0]);
                        c0669Mf.f2195X = (C1148VU) c1640ep.f5100S;
                        c0669Mf.f2186E.m3579v(new C0961S1(c0669Mf.f2189I + " onSettings", c0669Mf, c1640ep, i), 0L);
                    }
                    c0573KkArr = null;
                    c0669Mf.f2195X = (C1148VU) c1640ep.f5100S;
                    c0669Mf.f2186E.m3579v(new C0961S1(c0669Mf.f2189I + " onSettings", c0669Mf, c1640ep, i), 0L);
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                c0669Mf.f2191L.m4269z((C1148VU) c1640ep.f5100S);
            } catch (IOException e) {
                c0669Mf.m1564h(e);
            }
        }
        if (c0573KkArr != null) {
            int length = c0573KkArr.length;
            while (i < length) {
                C0573Kk c0573Kk = c0573KkArr[i];
                synchronized (c0573Kk) {
                    c0573Kk.f1859Q += m2360z;
                    if (m2360z > 0) {
                        c0573Kk.notifyAll();
                    }
                }
                i++;
            }
            return -1L;
        }
        return -1L;
    }
}
