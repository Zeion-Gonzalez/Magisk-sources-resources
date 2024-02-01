package p000a;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: a.Mf */
/* loaded from: classes.dex */
public final class C0669Mf implements Closeable {

    /* renamed from: O */
    public static final C1148VU f2184O;

    /* renamed from: C */
    public long f2185C;

    /* renamed from: E */
    public final C1956ko f2186E;

    /* renamed from: F */
    public long f2187F;

    /* renamed from: H */
    public long f2188H;

    /* renamed from: I */
    public final String f2189I;

    /* renamed from: J */
    public long f2190J;

    /* renamed from: L */
    public final C2483uo f2191L;

    /* renamed from: R */
    public final AbstractC1906js f2192R;

    /* renamed from: U */
    public final C1956ko f2194U;

    /* renamed from: X */
    public C1148VU f2195X;

    /* renamed from: Y */
    public long f2196Y;

    /* renamed from: Z */
    public long f2197Z;

    /* renamed from: c */
    public long f2198c;

    /* renamed from: d */
    public final LinkedHashSet f2199d;

    /* renamed from: e */
    public final C1148VU f2200e;

    /* renamed from: f */
    public final C1710g8 f2201f;

    /* renamed from: g */
    public boolean f2202g;

    /* renamed from: i */
    public final C0166DE f2203i;

    /* renamed from: j */
    public final Socket f2204j;

    /* renamed from: k */
    public int f2205k;

    /* renamed from: p */
    public long f2206p;

    /* renamed from: q */
    public int f2207q;

    /* renamed from: r */
    public long f2208r;

    /* renamed from: s */
    public final C1956ko f2209s;

    /* renamed from: y */
    public final C0634Lw f2211y;

    /* renamed from: S */
    public final boolean f2193S = true;

    /* renamed from: w */
    public final LinkedHashMap f2210w = new LinkedHashMap();

    static {
        C1148VU c1148vu = new C1148VU();
        c1148vu.m2359h(7, 65535);
        c1148vu.m2359h(5, 16384);
        f2184O = c1148vu;
    }

    public C0669Mf(C2522vR c2522vR) {
        this.f2192R = c2522vR.f7724Q;
        String str = c2522vR.f7727v;
        str = str == null ? null : str;
        this.f2189I = str;
        this.f2205k = 3;
        C0634Lw c0634Lw = c2522vR.f7728z;
        this.f2211y = c0634Lw;
        C1956ko m1425Q = c0634Lw.m1425Q();
        this.f2209s = m1425Q;
        this.f2194U = c0634Lw.m1425Q();
        this.f2186E = c0634Lw.m1425Q();
        this.f2201f = InterfaceC0643M5.f2081V;
        C1148VU c1148vu = new C1148VU();
        c1148vu.m2359h(7, 16777216);
        this.f2200e = c1148vu;
        this.f2195X = f2184O;
        this.f2206p = r3.m2360z();
        Socket socket = c2522vR.f7725h;
        this.f2204j = socket == null ? null : socket;
        InterfaceC1432as interfaceC1432as = c2522vR.f7722N;
        this.f2191L = new C2483uo(interfaceC1432as == null ? null : interfaceC1432as, true);
        InterfaceC0694N7 interfaceC0694N7 = c2522vR.f7723P;
        this.f2203i = new C0166DE(this, new C2167or(interfaceC0694N7 != null ? interfaceC0694N7 : null, true));
        this.f2199d = new LinkedHashSet();
        int i = c2522vR.f7726u;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            m1425Q.m3579v(new C1764h9(AbstractC2441tz.m4195W(str, " ping"), this, nanos), nanos);
        }
    }

    /* renamed from: BO */
    public final void m1559BO(int i, EnumC0754O6 enumC0754O6) {
        this.f2209s.m3579v(new C0128CT(this.f2189I + '[' + i + "] writeSynReset", this, i, enumC0754O6, 1), 0L);
    }

    /* renamed from: C */
    public final void m1560C(EnumC0754O6 enumC0754O6) {
        synchronized (this.f2191L) {
            synchronized (this) {
                if (this.f2202g) {
                    return;
                }
                this.f2202g = true;
                this.f2191L.m4264V(this.f2207q, enumC0754O6, AbstractC1181W6.f3860z);
            }
        }
    }

    /* renamed from: G */
    public final synchronized C0573Kk m1561G(int i) {
        return (C0573Kk) this.f2210w.get(Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0031, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0033, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f2191L.f7604I);
        r6 = r2;
        r8.f2185C += r6;
     */
    /* renamed from: U8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1562U8(int r9, boolean r10, p000a.C2361sQ r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            a.uo r12 = r8.f2191L
            r12.m4265h(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f2185C     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            long r6 = r8.f2206p     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L32
            java.util.LinkedHashMap r2 = r8.f2210w     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            goto L12
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
        L32:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L57
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L57
            a.uo r4 = r8.f2191L     // Catch: java.lang.Throwable -> L57
            int r4 = r4.f7604I     // Catch: java.lang.Throwable -> L57
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L57
            long r4 = r8.f2185C     // Catch: java.lang.Throwable -> L57
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L57
            long r4 = r4 + r6
            r8.f2185C = r4     // Catch: java.lang.Throwable -> L57
            monitor-exit(r8)
            long r12 = r12 - r6
            a.uo r4 = r8.f2191L
            if (r10 == 0) goto L52
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L52
            r5 = 1
            goto L53
        L52:
            r5 = r3
        L53:
            r4.m4265h(r5, r9, r11, r2)
            goto Ld
        L57:
            r9 = move-exception
            goto L66
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L57
            r9.interrupt()     // Catch: java.lang.Throwable -> L57
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L57
            r9.<init>()     // Catch: java.lang.Throwable -> L57
            throw r9     // Catch: java.lang.Throwable -> L57
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0669Mf.m1562U8(int, boolean, a.sQ, long):void");
    }

    /* renamed from: V */
    public final synchronized boolean m1563V(long j) {
        if (this.f2202g) {
            return false;
        }
        if (this.f2198c < this.f2190J) {
            if (j >= this.f2188H) {
                return false;
            }
        }
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m1568z(EnumC0754O6.f2559R, EnumC0754O6.f2560g, null);
    }

    /* renamed from: h */
    public final void m1564h(IOException iOException) {
        EnumC0754O6 enumC0754O6 = EnumC0754O6.f2563w;
        m1568z(enumC0754O6, enumC0754O6, iOException);
    }

    /* renamed from: he */
    public final void m1565he(int i, long j) {
        this.f2209s.m3579v(new C0198Dn(this.f2189I + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    /* renamed from: x */
    public final synchronized void m1566x(long j) {
        long j2 = this.f2187F + j;
        this.f2187F = j2;
        long j3 = j2 - this.f2197Z;
        if (j3 >= this.f2200e.m2360z() / 2) {
            m1565he(0, j3);
            this.f2197Z += j3;
        }
    }

    /* renamed from: y */
    public final synchronized C0573Kk m1567y(int i) {
        C0573Kk c0573Kk;
        c0573Kk = (C0573Kk) this.f2210w.remove(Integer.valueOf(i));
        notifyAll();
        return c0573Kk;
    }

    /* renamed from: z */
    public final void m1568z(EnumC0754O6 enumC0754O6, EnumC0754O6 enumC0754O62, IOException iOException) {
        int i;
        Object[] objArr;
        byte[] bArr = AbstractC1181W6.f3860z;
        try {
            m1560C(enumC0754O6);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if ((!this.f2210w.isEmpty()) == true) {
                objArr = this.f2210w.values().toArray(new C0573Kk[0]);
                this.f2210w.clear();
            } else {
                objArr = null;
            }
        }
        C0573Kk[] c0573KkArr = (C0573Kk[]) objArr;
        if (c0573KkArr != null) {
            for (C0573Kk c0573Kk : c0573KkArr) {
                try {
                    c0573Kk.m1305v(enumC0754O62, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f2191L.close();
        } catch (IOException unused3) {
        }
        try {
            this.f2204j.close();
        } catch (IOException unused4) {
        }
        this.f2209s.m3577Q();
        this.f2194U.m3577Q();
        this.f2186E.m3577Q();
    }
}
