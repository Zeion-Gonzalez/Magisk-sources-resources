package p000a;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: a.Jr */
/* loaded from: classes.dex */
public final class C0523Jr implements InterfaceC2381sm {

    /* renamed from: E */
    public boolean f1744E;

    /* renamed from: H */
    public volatile C0998Si f1745H;

    /* renamed from: I */
    public final C0711NP f1746I;

    /* renamed from: J */
    public boolean f1747J;

    /* renamed from: R */
    public final C1364ZX f1748R;

    /* renamed from: S */
    public final C0234ES f1749S;

    /* renamed from: U */
    public C0770OM f1750U;

    /* renamed from: Y */
    public boolean f1751Y;

    /* renamed from: c */
    public volatile boolean f1752c;

    /* renamed from: e */
    public volatile C0770OM f1753e;

    /* renamed from: f */
    public C0998Si f1754f;

    /* renamed from: g */
    public final AtomicBoolean f1755g;

    /* renamed from: k */
    public final C2321rg f1756k;

    /* renamed from: q */
    public final C1710g8 f1757q;

    /* renamed from: r */
    public boolean f1758r;

    /* renamed from: s */
    public C1179W4 f1759s;

    /* renamed from: w */
    public final boolean f1760w;

    /* renamed from: y */
    public Object f1761y;

    public C0523Jr(C0234ES c0234es, C1364ZX c1364zx, boolean z) {
        this.f1749S = c0234es;
        this.f1748R = c1364zx;
        this.f1760w = z;
        this.f1746I = (C0711NP) c0234es.f768R.f541R;
        C1710g8 c1710g8 = (C1710g8) c0234es.f784q.f141R;
        byte[] bArr = AbstractC1181W6.f3860z;
        this.f1757q = c1710g8;
        C2321rg c2321rg = new C2321rg(this);
        c2321rg.mo378u(c0234es.f780j, TimeUnit.MILLISECONDS);
        this.f1756k = c2321rg;
        this.f1755g = new AtomicBoolean();
        this.f1747J = true;
    }

    /* renamed from: z */
    public static final String m1211z(C0523Jr c0523Jr) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (c0523Jr.f1752c) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (c0523Jr.f1760w) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(((C2658y7) c0523Jr.f1748R.f4279h).m4566u());
        return sb.toString();
    }

    /* renamed from: M */
    public final IOException m1212M(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f1747J) {
                this.f1747J = false;
                if (!this.f1758r) {
                    if (!this.f1751Y) {
                        z = true;
                    }
                }
            }
        }
        return z ? m1214P(iOException) : iOException;
    }

    /* renamed from: N */
    public final void m1213N(InterfaceC1007St interfaceC1007St) {
        RunnableC0327GH runnableC0327GH;
        if (this.f1755g.compareAndSet(false, true)) {
            C0799Ov c0799Ov = C0799Ov.f2726z;
            this.f1761y = C0799Ov.f2726z.mo1887u();
            this.f1757q.getClass();
            C0185Da c0185Da = this.f1749S.f769S;
            RunnableC0327GH runnableC0327GH2 = new RunnableC0327GH(this, interfaceC1007St);
            synchronized (c0185Da) {
                c0185Da.f571h.add(runnableC0327GH2);
                if (!this.f1760w) {
                    String str = ((C2658y7) this.f1748R.f4279h).f8279P;
                    Iterator it = c0185Da.f572v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            runnableC0327GH = (RunnableC0327GH) it.next();
                            if (AbstractC1292YB.m2695u(((C2658y7) runnableC0327GH.f1114w.f1748R.f4279h).f8279P, str)) {
                                break;
                            }
                        } else {
                            Iterator it2 = c0185Da.f571h.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    runnableC0327GH = (RunnableC0327GH) it2.next();
                                    if (AbstractC1292YB.m2695u(((C2658y7) runnableC0327GH.f1114w.f1748R.f4279h).f8279P, str)) {
                                        break;
                                    }
                                } else {
                                    runnableC0327GH = null;
                                    break;
                                }
                            }
                        }
                    }
                    if (runnableC0327GH != null) {
                        runnableC0327GH2.f1112R = runnableC0327GH.f1112R;
                    }
                }
            }
            c0185Da.m366P();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    /* renamed from: P */
    public final IOException m1214P(IOException iOException) {
        Socket m1216S;
        boolean z;
        byte[] bArr = AbstractC1181W6.f3860z;
        C0770OM c0770om = this.f1750U;
        if (c0770om != null) {
            synchronized (c0770om) {
                m1216S = m1216S();
            }
            if (this.f1750U == null) {
                if (m1216S != null) {
                    AbstractC1181W6.m2416P(m1216S);
                }
                this.f1757q.getClass();
            } else {
                if (m1216S == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f1744E && this.f1756k.m3686W()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
            iOException = interruptedIOException;
        }
        this.f1757q.getClass();
        return iOException;
    }

    /* renamed from: Q */
    public final C1429ap m1215Q() {
        if (this.f1755g.compareAndSet(false, true)) {
            this.f1756k.m3687o();
            C0799Ov c0799Ov = C0799Ov.f2726z;
            this.f1761y = C0799Ov.f2726z.mo1887u();
            this.f1757q.getClass();
            try {
                C0185Da c0185Da = this.f1749S.f769S;
                synchronized (c0185Da) {
                    c0185Da.f570P.add(this);
                }
                return m1218o();
            } finally {
                C0185Da c0185Da2 = this.f1749S.f769S;
                c0185Da2.m367h(c0185Da2.f570P, this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    /* renamed from: S */
    public final Socket m1216S() {
        boolean z;
        C0770OM c0770om = this.f1750U;
        byte[] bArr = AbstractC1181W6.f3860z;
        ArrayList arrayList = c0770om.f2618I;
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (AbstractC1292YB.m2695u(((Reference) it.next()).get(), this)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList.remove(i);
            this.f1750U = null;
            if (arrayList.isEmpty()) {
                c0770om.f2629q = System.nanoTime();
                C0711NP c0711np = this.f1746I;
                c0711np.getClass();
                byte[] bArr2 = AbstractC1181W6.f3860z;
                boolean z3 = c0770om.f2617G;
                C1956ko c1956ko = c0711np.f2388v;
                if (!z3 && c0711np.f2389z != 0) {
                    c1956ko.m3579v(c0711np.f2386P, 0L);
                } else {
                    c0770om.f2617G = true;
                    ConcurrentLinkedQueue concurrentLinkedQueue = c0711np.f2385N;
                    concurrentLinkedQueue.remove(c0770om);
                    if (concurrentLinkedQueue.isEmpty()) {
                        c1956ko.m3580z();
                    }
                    z2 = true;
                }
                if (z2) {
                    return c0770om.f2621P;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x001c A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:55:0x000d, B:64:0x001c, B:66:0x0020, B:67:0x0022, B:69:0x0027, B:74:0x0030, B:76:0x0034, B:61:0x0016), top: B:92:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0020 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:55:0x000d, B:64:0x001c, B:66:0x0020, B:67:0x0022, B:69:0x0027, B:74:0x0030, B:76:0x0034, B:61:0x0016), top: B:92:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0038  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.IOException m1217W(p000a.C0998Si r2, boolean r3, boolean r4, java.io.IOException r5) {
        /*
            r1 = this;
            a.Si r0 = r1.f1745H
            boolean r2 = p000a.AbstractC1292YB.m2695u(r2, r0)
            if (r2 != 0) goto L9
            return r5
        L9:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L14
            boolean r0 = r1.f1758r     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L1a
            goto L14
        L12:
            r2 = move-exception
            goto L3c
        L14:
            if (r4 == 0) goto L3e
            boolean r0 = r1.f1751Y     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L3e
        L1a:
            if (r3 == 0) goto L1e
            r1.f1758r = r2     // Catch: java.lang.Throwable -> L12
        L1e:
            if (r4 == 0) goto L22
            r1.f1751Y = r2     // Catch: java.lang.Throwable -> L12
        L22:
            boolean r3 = r1.f1758r     // Catch: java.lang.Throwable -> L12
            r4 = 1
            if (r3 != 0) goto L2d
            boolean r0 = r1.f1751Y     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L2d
            r0 = r4
            goto L2e
        L2d:
            r0 = r2
        L2e:
            if (r3 != 0) goto L39
            boolean r3 = r1.f1751Y     // Catch: java.lang.Throwable -> L12
            if (r3 != 0) goto L39
            boolean r3 = r1.f1747J     // Catch: java.lang.Throwable -> L12
            if (r3 != 0) goto L39
            r2 = r4
        L39:
            r3 = r2
            r2 = r0
            goto L3f
        L3c:
            monitor-exit(r1)
            throw r2
        L3e:
            r3 = r2
        L3f:
            monitor-exit(r1)
            if (r2 == 0) goto L4c
            r2 = 0
            r1.f1745H = r2
            a.OM r2 = r1.f1750U
            if (r2 == 0) goto L4c
            r2.m1786o()
        L4c:
            if (r3 == 0) goto L53
            java.io.IOException r2 = r1.m1214P(r5)
            return r2
        L53:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0523Jr.m1217W(a.Si, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final void cancel() {
        Socket socket;
        if (this.f1752c) {
            return;
        }
        this.f1752c = true;
        C0998Si c0998Si = this.f1745H;
        if (c0998Si != null) {
            c0998Si.f3348P.cancel();
        }
        C0770OM c0770om = this.f1753e;
        if (c0770om != null && (socket = c0770om.f2631v) != null) {
            AbstractC1181W6.m2416P(socket);
        }
        this.f1757q.getClass();
    }

    public final Object clone() {
        return new C0523Jr(this.f1749S, this.f1748R, this.f1760w);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000a.C1429ap m1218o() {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            a.ES r0 = r11.f1749S
            java.util.List r0 = r0.f787w
            p000a.AbstractC2708z8.m4637oI(r0, r2)
            a.lV r0 = new a.lV
            a.ES r1 = r11.f1749S
            r0.<init>(r1)
            r2.add(r0)
            a.Kb r0 = new a.Kb
            a.ES r1 = r11.f1749S
            a.oe r1 = r1.f770U
            r0.<init>(r1)
            r2.add(r0)
            a.Yz r0 = new a.Yz
            a.ES r1 = r11.f1749S
            a.Y2 r1 = r1.f761E
            r0.<init>(r1)
            r2.add(r0)
            a.vH r0 = p000a.C2512vH.f7696z
            r2.add(r0)
            boolean r0 = r11.f1760w
            if (r0 != 0) goto L3e
            a.ES r0 = r11.f1749S
            java.util.List r0 = r0.f764I
            p000a.AbstractC2708z8.m4637oI(r0, r2)
        L3e:
            a.Cb r0 = new a.Cb
            boolean r1 = r11.f1760w
            r0.<init>(r1)
            r2.add(r0)
            a.vK r9 = new a.vK
            r3 = 0
            r4 = 0
            a.ZX r10 = r11.f1748R
            a.ES r0 = r11.f1749S
            int r6 = r0.f766L
            int r7 = r0.f779i
            int r8 = r0.f775d
            r0 = r9
            r1 = r11
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            a.ap r1 = r9.m4356h(r10)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L77
            boolean r2 = r11.f1752c     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L77
            if (r2 != 0) goto L69
            r11.m1212M(r0)
            return r1
        L69:
            p000a.AbstractC1181W6.m2430v(r1)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L77
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L77
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L77
            throw r1     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L77
        L74:
            r1 = move-exception
            r2 = 0
            goto L7f
        L77:
            r1 = move-exception
            java.io.IOException r1 = r11.m1212M(r1)     // Catch: java.lang.Throwable -> L7d
            throw r1     // Catch: java.lang.Throwable -> L7d
        L7d:
            r1 = move-exception
            r2 = 1
        L7f:
            if (r2 != 0) goto L84
            r11.m1212M(r0)
        L84:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0523Jr.m1218o():a.ap");
    }

    /* renamed from: u */
    public final void m1219u(boolean z) {
        C0998Si c0998Si;
        synchronized (this) {
            if (!this.f1747J) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (c0998Si = this.f1745H) != null) {
            c0998Si.f3348P.cancel();
            c0998Si.f3353z.m1217W(c0998Si, true, true, null);
        }
        this.f1754f = null;
    }

    /* renamed from: v */
    public final void m1220v(C0770OM c0770om) {
        boolean z;
        byte[] bArr = AbstractC1181W6.f3860z;
        if (this.f1750U == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f1750U = c0770om;
            c0770om.f2618I.add(new C0640M2(this, this.f1761y));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
