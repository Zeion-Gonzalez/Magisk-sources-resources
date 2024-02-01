package p000a;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* renamed from: a.Kk */
/* loaded from: classes.dex */
public final class C0573Kk {

    /* renamed from: G */
    public final C1937kS f1855G;

    /* renamed from: M */
    public final C2014lt f1856M;

    /* renamed from: N */
    public long f1857N;

    /* renamed from: P */
    public long f1858P;

    /* renamed from: Q */
    public long f1859Q;

    /* renamed from: R */
    public IOException f1860R;

    /* renamed from: S */
    public EnumC0754O6 f1861S;

    /* renamed from: V */
    public final C2014lt f1862V;

    /* renamed from: W */
    public final C0082Ba f1863W;

    /* renamed from: h */
    public final C0669Mf f1864h;

    /* renamed from: o */
    public boolean f1865o;

    /* renamed from: u */
    public final ArrayDeque f1866u;

    /* renamed from: v */
    public long f1867v;

    /* renamed from: z */
    public final int f1868z;

    public C0573Kk(int i, C0669Mf c0669Mf, boolean z, boolean z2, C1494c7 c1494c7) {
        this.f1868z = i;
        this.f1864h = c0669Mf;
        this.f1859Q = c0669Mf.f2195X.m2360z();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f1866u = arrayDeque;
        this.f1863W = new C0082Ba(this, c0669Mf.f2200e.m2360z(), z2);
        this.f1855G = new C1937kS(this, z);
        this.f1856M = new C2014lt(this);
        this.f1862V = new C2014lt(this);
        if (c1494c7 != null) {
            if ((!m1303o()) != false) {
                arrayDeque.add(c1494c7);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        }
        if (m1303o()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x001a A[Catch: all -> 0x0030, TryCatch #0 {, blocks: (B:50:0x0003, B:54:0x000b, B:57:0x001a, B:58:0x001e, B:55:0x0011), top: B:66:0x0003 }] */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1295G(p000a.C1494c7 r3, boolean r4) {
        /*
            r2 = this;
            byte[] r0 = p000a.AbstractC1181W6.f3860z
            monitor-enter(r2)
            boolean r0 = r2.f1865o     // Catch: java.lang.Throwable -> L30
            r1 = 1
            if (r0 == 0) goto L11
            if (r4 != 0) goto Lb
            goto L11
        Lb:
            a.Ba r3 = r2.f1863W     // Catch: java.lang.Throwable -> L30
            r3.getClass()     // Catch: java.lang.Throwable -> L30
            goto L18
        L11:
            r2.f1865o = r1     // Catch: java.lang.Throwable -> L30
            java.util.ArrayDeque r0 = r2.f1866u     // Catch: java.lang.Throwable -> L30
            r0.add(r3)     // Catch: java.lang.Throwable -> L30
        L18:
            if (r4 == 0) goto L1e
            a.Ba r3 = r2.f1863W     // Catch: java.lang.Throwable -> L30
            r3.f321R = r1     // Catch: java.lang.Throwable -> L30
        L1e:
            boolean r3 = r2.m1301W()     // Catch: java.lang.Throwable -> L30
            r2.notifyAll()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r2)
            if (r3 != 0) goto L2f
            a.Mf r3 = r2.f1864h
            int r4 = r2.f1868z
            r3.m1567y(r4)
        L2f:
            return
        L30:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0573Kk.m1295G(a.c7, boolean):void");
    }

    /* renamed from: M */
    public final synchronized void m1296M(EnumC0754O6 enumC0754O6) {
        if (this.f1861S == null) {
            this.f1861S = enumC0754O6;
            notifyAll();
        }
    }

    /* renamed from: N */
    public final void m1297N(EnumC0754O6 enumC0754O6) {
        if (m1298P(enumC0754O6, null)) {
            this.f1864h.m1559BO(this.f1868z, enumC0754O6);
        }
    }

    /* renamed from: P */
    public final boolean m1298P(EnumC0754O6 enumC0754O6, IOException iOException) {
        byte[] bArr = AbstractC1181W6.f3860z;
        synchronized (this) {
            if (this.f1861S != null) {
                return false;
            }
            this.f1861S = enumC0754O6;
            this.f1860R = iOException;
            notifyAll();
            if (this.f1863W.f321R) {
                if (this.f1855G.f6014S) {
                    return false;
                }
            }
            this.f1864h.m1567y(this.f1868z);
            return true;
        }
    }

    /* renamed from: Q */
    public final synchronized EnumC0754O6 m1299Q() {
        return this.f1861S;
    }

    /* renamed from: V */
    public final void m1300V() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: W */
    public final synchronized boolean m1301W() {
        if (this.f1861S != null) {
            return false;
        }
        C0082Ba c0082Ba = this.f1863W;
        if (c0082Ba.f321R || c0082Ba.f324q) {
            C1937kS c1937kS = this.f1855G;
            if (c1937kS.f6014S || c1937kS.f6015w) {
                if (this.f1865o) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: h */
    public final void m1302h() {
        C1937kS c1937kS = this.f1855G;
        if (!c1937kS.f6015w) {
            if (!c1937kS.f6014S) {
                if (this.f1861S != null) {
                    IOException iOException = this.f1860R;
                    if (iOException != null) {
                        throw iOException;
                    }
                    throw new C1339Z5(this.f1861S);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    /* renamed from: o */
    public final boolean m1303o() {
        boolean z;
        if ((this.f1868z & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.f1864h.f2193S == z) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final C1937kS m1304u() {
        synchronized (this) {
            if (!(this.f1865o || m1303o())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f1855G;
    }

    /* renamed from: v */
    public final void m1305v(EnumC0754O6 enumC0754O6, IOException iOException) {
        if (!m1298P(enumC0754O6, iOException)) {
            return;
        }
        this.f1864h.f2191L.m4267x(this.f1868z, enumC0754O6);
    }

    /* renamed from: z */
    public final void m1306z() {
        boolean z;
        boolean m1301W;
        byte[] bArr = AbstractC1181W6.f3860z;
        synchronized (this) {
            C0082Ba c0082Ba = this.f1863W;
            if (!c0082Ba.f321R && c0082Ba.f324q) {
                C1937kS c1937kS = this.f1855G;
                if (c1937kS.f6014S || c1937kS.f6015w) {
                    z = true;
                    m1301W = m1301W();
                }
            }
            z = false;
            m1301W = m1301W();
        }
        if (z) {
            m1305v(EnumC0754O6.f2560g, null);
        } else if (!m1301W) {
            this.f1864h.m1567y(this.f1868z);
        }
    }
}
