package p000a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.cm */
/* loaded from: classes.dex */
public final class C1525cm extends AbstractC0710NO implements InterfaceC2363sS, InterfaceC2683yf, InterfaceC1816iD {

    /* renamed from: I */
    public final InterfaceC1171Vv f4708I;
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: q */
    public final InterfaceC1255XS f4709q;

    /* renamed from: k */
    public static final AtomicIntegerFieldUpdater f4706k = AtomicIntegerFieldUpdater.newUpdater(C1525cm.class, "_decisionAndIndex");

    /* renamed from: g */
    public static final AtomicReferenceFieldUpdater f4705g = AtomicReferenceFieldUpdater.newUpdater(C1525cm.class, Object.class, "_state");

    /* renamed from: y */
    public static final AtomicReferenceFieldUpdater f4707y = AtomicReferenceFieldUpdater.newUpdater(C1525cm.class, Object.class, "_parentHandle");

    public C1525cm(int i, InterfaceC1171Vv interfaceC1171Vv) {
        super(i);
        this.f4708I = interfaceC1171Vv;
        this.f4709q = interfaceC1171Vv.mo315N();
        this._decisionAndIndex = 536870911;
        this._state = C1111Uo.f3615S;
    }

    /* renamed from: E */
    public static void m2951E(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* renamed from: Y */
    public static Object m2952Y(InterfaceC1085UJ interfaceC1085UJ, Object obj, int i, InterfaceC2364sT interfaceC2364sT) {
        if (obj instanceof C1663fI) {
            return obj;
        }
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (!z) {
            return obj;
        }
        if (interfaceC2364sT != null || (interfaceC1085UJ instanceof AbstractC1264Xg)) {
            return new C0840Pf(obj, interfaceC1085UJ instanceof AbstractC1264Xg ? (AbstractC1264Xg) interfaceC1085UJ : null, interfaceC2364sT, (CancellationException) null, 16);
        }
        return obj;
    }

    @Override // p000a.AbstractC0710NO
    /* renamed from: G */
    public final Object mo1642G() {
        return f4705g.get(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0048, code lost:
    
        if (r5 != 2) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x004b, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x004d, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x004e, code lost:
    
        if (r10 != r2) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0050, code lost:
    
        r10 = ((p000a.C2266qf) r1).f6967I;
        r0 = r1.mo315N();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x005d, code lost:
    
        if (r10.mo3030U8() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x005f, code lost:
    
        r10.mo195C(r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0063, code lost:
    
        r10 = p000a.AbstractC1129V8.m2311z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0070, code lost:
    
        if (r10.f8589w < 4294967296L) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0072, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0073, code lost:
    
        if (r4 == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0075, code lost:
    
        r0 = r10.f8588q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0077, code lost:
    
        if (r0 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0079, code lost:
    
        r0 = new p000a.C1200WR();
        r10.f8588q = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0080, code lost:
    
        r0.m2478N(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0084, code lost:
    
        r10.m4672dx(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0087, code lost:
    
        p000a.AbstractC0438II.m1033m(r9, r1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x008e, code lost:
    
        if (r10.m4671Lq() != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0091, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x009e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x009f, code lost:
    
        p000a.AbstractC0438II.m1033m(r9, r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00a2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x002a, code lost:
    
        if (r0 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x002e, code lost:
    
        if (r10 != 4) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0030, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0032, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0033, code lost:
    
        r1 = r9.f4708I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0035, code lost:
    
        if (r0 != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0039, code lost:
    
        if ((r1 instanceof p000a.C2266qf) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x003c, code lost:
    
        if (r10 == 1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x003e, code lost:
    
        if (r10 != 2) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0041, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0043, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0044, code lost:
    
        r5 = r9.f2384w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0046, code lost:
    
        if (r5 == 1) goto L103;
     */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2953I(int r10) {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000a.C1525cm.f4706k
            int r1 = r0.get(r9)
            int r2 = r1 >> 29
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1c
            if (r2 != r3) goto L10
            r0 = r4
            goto L2a
        L10:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L1c:
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r2 = r2 & r1
            r5 = 1073741824(0x40000000, float:2.0)
            int r2 = r2 + r5
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 == 0) goto L0
            r0 = r3
        L2a:
            if (r0 == 0) goto L2d
            return
        L2d:
            r0 = 4
            if (r10 != r0) goto L32
            r0 = r3
            goto L33
        L32:
            r0 = r4
        L33:
            a.Vv r1 = r9.f4708I
            if (r0 != 0) goto L9f
            boolean r2 = r1 instanceof p000a.C2266qf
            if (r2 == 0) goto L9f
            r2 = 2
            if (r10 == r3) goto L43
            if (r10 != r2) goto L41
            goto L43
        L41:
            r10 = r4
            goto L44
        L43:
            r10 = r3
        L44:
            int r5 = r9.f2384w
            if (r5 == r3) goto L4d
            if (r5 != r2) goto L4b
            goto L4d
        L4b:
            r2 = r4
            goto L4e
        L4d:
            r2 = r3
        L4e:
            if (r10 != r2) goto L9f
            r10 = r1
            a.qf r10 = (p000a.C2266qf) r10
            a.j1 r10 = r10.f6967I
            a.XS r0 = r1.mo315N()
            boolean r2 = r10.mo3030U8()
            if (r2 == 0) goto L63
            r10.mo195C(r0, r9)
            goto La2
        L63:
            a.zi r10 = p000a.AbstractC1129V8.m2311z()
            long r5 = r10.f8589w
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L73
            r4 = r3
        L73:
            if (r4 == 0) goto L84
            a.WR r0 = r10.f8588q
            if (r0 != 0) goto L80
            a.WR r0 = new a.WR
            r0.<init>()
            r10.f8588q = r0
        L80:
            r0.m2478N(r9)
            goto La2
        L84:
            r10.m4672dx(r3)
            p000a.AbstractC0438II.m1033m(r9, r1, r3)     // Catch: java.lang.Throwable -> L91
        L8a:
            boolean r0 = r10.m4671Lq()     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L8a
            goto L96
        L91:
            r0 = move-exception
            r1 = 0
            r9.m1645W(r0, r1)     // Catch: java.lang.Throwable -> L9a
        L96:
            r10.m4670BO(r3)
            goto La2
        L9a:
            r0 = move-exception
            r10.m4670BO(r3)
            throw r0
        L9f:
            p000a.AbstractC0438II.m1033m(r9, r1, r0)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1525cm.m2953I(int):void");
    }

    /* renamed from: J */
    public final C0175DP m2954J(Object obj, InterfaceC2364sT interfaceC2364sT) {
        C0175DP c0175dp;
        boolean z;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4705g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z2 = obj2 instanceof InterfaceC1085UJ;
            c0175dp = AbstractC1843ih.f5751S;
            if (z2) {
                Object m2952Y = m2952Y((InterfaceC1085UJ) obj2, obj, this.f2384w, interfaceC2364sT);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, m2952Y)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z = false;
                        break;
                    }
                }
            } else {
                boolean z3 = obj2 instanceof C0840Pf;
                return null;
            }
        } while (!z);
        if (!m2958U()) {
            m2967w();
            return c0175dp;
        }
        return c0175dp;
    }

    /* renamed from: M */
    public final void m2955M(AbstractC1264Xg abstractC1264Xg, Throwable th) {
        try {
            abstractC1264Xg.mo1291h(th);
        } catch (Throwable th2) {
            AbstractC0438II.m1000J(this.f4709q, new C0993Sd("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // p000a.InterfaceC1171Vv
    /* renamed from: N */
    public final InterfaceC1255XS mo315N() {
        return this.f4709q;
    }

    @Override // p000a.AbstractC0710NO
    /* renamed from: P */
    public final InterfaceC1171Vv mo1643P() {
        return this.f4708I;
    }

    @Override // p000a.AbstractC0710NO
    /* renamed from: Q */
    public final Throwable mo1644Q(Object obj) {
        Throwable mo1644Q = super.mo1644Q(obj);
        if (mo1644Q != null) {
            return mo1644Q;
        }
        return null;
    }

    /* renamed from: R */
    public final void m2956R(Throwable th) {
        Object obj;
        boolean z;
        boolean z2;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4705g;
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC1085UJ)) {
                return;
            }
            z = false;
            if (!(obj instanceof AbstractC1264Xg) && !(obj instanceof AbstractC2025m7)) {
                z2 = false;
            } else {
                z2 = true;
            }
            C1727gX c1727gX = new C1727gX(this, th, z2);
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c1727gX)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        } while (!z);
        InterfaceC1085UJ interfaceC1085UJ = (InterfaceC1085UJ) obj;
        if (interfaceC1085UJ instanceof AbstractC1264Xg) {
            m2955M((AbstractC1264Xg) obj, th);
        } else if (interfaceC1085UJ instanceof AbstractC2025m7) {
            m2957S((AbstractC2025m7) obj, th);
        }
        if (!m2958U()) {
            m2967w();
        }
        m2953I(this.f2384w);
    }

    /* renamed from: S */
    public final void m2957S(AbstractC2025m7 abstractC2025m7, Throwable th) {
        InterfaceC1255XS interfaceC1255XS = this.f4709q;
        int i = f4706k.get(this) & 536870911;
        if (!(i != 536870911)) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            abstractC2025m7.mo1280u(i, interfaceC1255XS);
        } catch (Throwable th2) {
            AbstractC0438II.m1000J(interfaceC1255XS, new C0993Sd("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: U */
    public final boolean m2958U() {
        boolean z;
        boolean z2;
        if (this.f2384w == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2266qf c2266qf = (C2266qf) this.f4708I;
            c2266qf.getClass();
            if (C2266qf.f6966y.get(c2266qf) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: V */
    public final void m2959V(InterfaceC2364sT interfaceC2364sT, Throwable th) {
        try {
            interfaceC2364sT.mo85W(th);
        } catch (Throwable th2) {
            AbstractC0438II.m1000J(this.f4709q, new C0993Sd("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0041, code lost:
    
        if (r2 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0044, code lost:
    
        m2967w();
        m2956R(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x004a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
    
        return;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2960f() {
        /*
            r7 = this;
            a.Vv r0 = r7.f4708I
            boolean r1 = r0 instanceof p000a.C2266qf
            r2 = 0
            if (r1 == 0) goto La
            a.qf r0 = (p000a.C2266qf) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L6f
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000a.C2266qf.f6966y
            java.lang.Object r3 = r1.get(r0)
            a.DP r4 = p000a.AbstractC2575wW.f7870U
            r5 = 0
            r6 = 1
            if (r3 != r4) goto L2a
        L19:
            boolean r3 = r1.compareAndSet(r0, r4, r7)
            if (r3 == 0) goto L21
            r5 = r6
            goto L27
        L21:
            java.lang.Object r3 = r1.get(r0)
            if (r3 == r4) goto L19
        L27:
            if (r5 == 0) goto Ld
            goto L41
        L2a:
            boolean r4 = r3 instanceof java.lang.Throwable
            if (r4 == 0) goto L57
        L2e:
            boolean r4 = r1.compareAndSet(r0, r3, r2)
            if (r4 == 0) goto L36
            r5 = r6
            goto L3c
        L36:
            java.lang.Object r4 = r1.get(r0)
            if (r4 == r3) goto L2e
        L3c:
            if (r5 == 0) goto L4b
            r2 = r3
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L41:
            if (r2 != 0) goto L44
            goto L6f
        L44:
            r7.m2967w()
            r7.m2956R(r2)
            return
        L4b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Inconsistent state "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1525cm.m2960f():void");
    }

    /* renamed from: g */
    public final InterfaceC1279Xy m2961g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC1265Xh interfaceC1265Xh = (InterfaceC1265Xh) this.f4709q.mo107y(C1710g8.f5381k);
        if (interfaceC1265Xh == null) {
            return null;
        }
        InterfaceC1279Xy m2673d = AbstractC1292YB.m2673d(interfaceC1265Xh, true, new C0184DZ(this), 2);
        do {
            atomicReferenceFieldUpdater = f4707y;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, m2673d)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return m2673d;
    }

    @Override // p000a.AbstractC0710NO
    /* renamed from: h */
    public final void mo1646h(Object obj, CancellationException cancellationException) {
        boolean z;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4705g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC1085UJ)) {
                if (obj2 instanceof C1663fI) {
                    return;
                }
                boolean z2 = true;
                if (obj2 instanceof C0840Pf) {
                    C0840Pf c0840Pf = (C0840Pf) obj2;
                    if (c0840Pf.f2835N != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((!z) != false) {
                        C0840Pf m1957z = C0840Pf.m1957z(c0840Pf, null, cancellationException, 15);
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, m1957z)) {
                                break;
                            } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                z2 = false;
                                break;
                            }
                        }
                        if (z2) {
                            AbstractC1264Xg abstractC1264Xg = c0840Pf.f2837h;
                            if (abstractC1264Xg != null) {
                                m2955M(abstractC1264Xg, cancellationException);
                            }
                            InterfaceC2364sT interfaceC2364sT = c0840Pf.f2838v;
                            if (interfaceC2364sT != null) {
                                m2959V(interfaceC2364sT, cancellationException);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    C0840Pf c0840Pf2 = new C0840Pf(obj2, (AbstractC1264Xg) null, (InterfaceC2364sT) null, cancellationException, 14);
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0840Pf2)) {
                            break;
                        } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            z2 = false;
                            break;
                        }
                    }
                    if (z2) {
                        return;
                    }
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    /* renamed from: k */
    public final void m2962k() {
        InterfaceC1279Xy m2961g = m2961g();
        if (m2961g != null && (!(f4705g.get(this) instanceof InterfaceC1085UJ)) != false) {
            m2961g.mo1430v();
            f4707y.set(this, C0638M0.f2063S);
        }
    }

    @Override // p000a.AbstractC0710NO
    /* renamed from: o */
    public final Object mo1647o(Object obj) {
        return obj instanceof C0840Pf ? ((C0840Pf) obj).f2839z : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x002f, code lost:
    
        if (r1 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0039, code lost:
    
        if (((p000a.InterfaceC1279Xy) p000a.C1525cm.f4707y.get(r8)) != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x003b, code lost:
    
        m2961g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x003e, code lost:
    
        if (r0 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0040, code lost:
    
        m2960f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0045, code lost:
    
        return p000a.EnumC0464Im.f1557S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0046, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0048, code lost:
    
        m2960f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x004b, code lost:
    
        r0 = p000a.C1525cm.f4705g.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0053, code lost:
    
        if ((r0 instanceof p000a.C1663fI) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0055, code lost:
    
        r1 = r8.f2384w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0057, code lost:
    
        if (r1 == 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0059, code lost:
    
        if (r1 != 2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x005b, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x005c, code lost:
    
        if (r4 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x005e, code lost:
    
        r1 = (p000a.InterfaceC1265Xh) r8.f4709q.mo107y(p000a.C1710g8.f5381k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0068, code lost:
    
        if (r1 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x006e, code lost:
    
        if (r1.mo317h() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0071, code lost:
    
        r1 = ((p000a.C0757O9) r1).m1741U();
        mo1646h(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x007a, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x007f, code lost:
    
        return mo1647o(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0084, code lost:
    
        throw ((p000a.C1663fI) r0).f5199z;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2963q() {
        /*
            r8 = this;
            boolean r0 = r8.m2958U()
        L4:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000a.C1525cm.f4706k
            int r2 = r1.get(r8)
            int r3 = r2 >> 29
            r4 = 0
            r5 = 1
            r6 = 2
            if (r3 == 0) goto L21
            if (r3 != r6) goto L15
            r1 = r4
            goto L2f
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L21:
            r3 = 536870911(0x1fffffff, float:1.0842021E-19)
            r3 = r3 & r2
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            int r3 = r3 + r7
            boolean r1 = r1.compareAndSet(r8, r2, r3)
            if (r1 == 0) goto L4
            r1 = r5
        L2f:
            if (r1 == 0) goto L46
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000a.C1525cm.f4707y
            java.lang.Object r1 = r1.get(r8)
            a.Xy r1 = (p000a.InterfaceC1279Xy) r1
            if (r1 != 0) goto L3e
            r8.m2961g()
        L3e:
            if (r0 == 0) goto L43
            r8.m2960f()
        L43:
            a.Im r0 = p000a.EnumC0464Im.f1557S
            return r0
        L46:
            if (r0 == 0) goto L4b
            r8.m2960f()
        L4b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000a.C1525cm.f4705g
            java.lang.Object r0 = r0.get(r8)
            boolean r1 = r0 instanceof p000a.C1663fI
            if (r1 != 0) goto L80
            int r1 = r8.f2384w
            if (r1 == r5) goto L5b
            if (r1 != r6) goto L5c
        L5b:
            r4 = r5
        L5c:
            if (r4 == 0) goto L7b
            a.g8 r1 = p000a.C1710g8.f5381k
            a.XS r2 = r8.f4709q
            a.UM r1 = r2.mo107y(r1)
            a.Xh r1 = (p000a.InterfaceC1265Xh) r1
            if (r1 == 0) goto L7b
            boolean r2 = r1.mo317h()
            if (r2 == 0) goto L71
            goto L7b
        L71:
            a.O9 r1 = (p000a.C0757O9) r1
            java.util.concurrent.CancellationException r1 = r1.m1741U()
            r8.mo1646h(r0, r1)
            throw r1
        L7b:
            java.lang.Object r0 = r8.mo1647o(r0)
            return r0
        L80:
            a.fI r0 = (p000a.C1663fI) r0
            java.lang.Throwable r0 = r0.f5199z
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1525cm.m2963q():java.lang.Object");
    }

    /* renamed from: r */
    public final void m2964r(Object obj, int i, InterfaceC2364sT interfaceC2364sT) {
        boolean z;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4705g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            z = false;
            if (obj2 instanceof InterfaceC1085UJ) {
                Object m2952Y = m2952Y((InterfaceC1085UJ) obj2, obj, i, interfaceC2364sT);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, m2952Y)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
            } else {
                if (obj2 instanceof C1727gX) {
                    C1727gX c1727gX = (C1727gX) obj2;
                    c1727gX.getClass();
                    if (C1727gX.f5447v.compareAndSet(c1727gX, 0, 1)) {
                        if (interfaceC2364sT != null) {
                            m2959V(interfaceC2364sT, c1727gX.f5199z);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        } while (!z);
        if (!m2958U()) {
            m2967w();
        }
        m2953I(i);
    }

    /* renamed from: s */
    public final void m2965s(Object obj) {
        boolean z;
        boolean z2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4705g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z3 = true;
            if (obj2 instanceof C1111Uo) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z3 = false;
                        break;
                    }
                }
                if (z3) {
                    return;
                }
            } else {
                if (obj2 instanceof AbstractC1264Xg) {
                    z = true;
                } else {
                    z = obj2 instanceof AbstractC2025m7;
                }
                Throwable th = null;
                if (!z) {
                    boolean z4 = obj2 instanceof C1663fI;
                    if (z4) {
                        C1663fI c1663fI = (C1663fI) obj2;
                        c1663fI.getClass();
                        if (C1663fI.f5198h.compareAndSet(c1663fI, 0, 1)) {
                            if (obj2 instanceof C1727gX) {
                                if (!z4) {
                                    c1663fI = null;
                                }
                                if (c1663fI != null) {
                                    th = c1663fI.f5199z;
                                }
                                if (obj instanceof AbstractC1264Xg) {
                                    m2955M((AbstractC1264Xg) obj, th);
                                    return;
                                } else {
                                    m2957S((AbstractC2025m7) obj, th);
                                    return;
                                }
                            }
                            return;
                        }
                        m2951E(obj, obj2);
                        throw null;
                    }
                    if (obj2 instanceof C0840Pf) {
                        C0840Pf c0840Pf = (C0840Pf) obj2;
                        if (c0840Pf.f2837h == null) {
                            if (obj instanceof AbstractC2025m7) {
                                return;
                            }
                            AbstractC1264Xg abstractC1264Xg = (AbstractC1264Xg) obj;
                            Throwable th2 = c0840Pf.f2835N;
                            if (th2 != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                m2955M(abstractC1264Xg, th2);
                                return;
                            }
                            C0840Pf m1957z = C0840Pf.m1957z(c0840Pf, abstractC1264Xg, null, 29);
                            while (true) {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, m1957z)) {
                                    break;
                                } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    z3 = false;
                                    break;
                                }
                            }
                            if (z3) {
                                return;
                            }
                        } else {
                            m2951E(obj, obj2);
                            throw null;
                        }
                    } else {
                        if (obj instanceof AbstractC2025m7) {
                            return;
                        }
                        C0840Pf c0840Pf2 = new C0840Pf(obj2, (AbstractC1264Xg) obj, (InterfaceC2364sT) null, (CancellationException) null, 28);
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0840Pf2)) {
                                break;
                            } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                z3 = false;
                                break;
                            }
                        }
                        if (z3) {
                            return;
                        }
                    }
                } else {
                    m2951E(obj, obj2);
                    throw null;
                }
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(AbstractC2575wW.m4425d2(this.f4708I));
        sb.append("){");
        Object obj = f4705g.get(this);
        if (obj instanceof InterfaceC1085UJ) {
            str = "Active";
        } else if (obj instanceof C1727gX) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC2575wW.m4418Y(this));
        return sb.toString();
    }

    @Override // p000a.InterfaceC1171Vv
    /* renamed from: u */
    public final void mo320u(Object obj) {
        Throwable m4677z = AbstractC2740zk.m4677z(obj);
        if (m4677z != null) {
            obj = new C1663fI(m4677z, false);
        }
        m2964r(obj, this.f2384w, null);
    }

    @Override // p000a.InterfaceC2683yf
    /* renamed from: v */
    public final InterfaceC2683yf mo2966v() {
        InterfaceC1171Vv interfaceC1171Vv = this.f4708I;
        if (interfaceC1171Vv instanceof InterfaceC2683yf) {
            return (InterfaceC2683yf) interfaceC1171Vv;
        }
        return null;
    }

    /* renamed from: w */
    public final void m2967w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4707y;
        InterfaceC1279Xy interfaceC1279Xy = (InterfaceC1279Xy) atomicReferenceFieldUpdater.get(this);
        if (interfaceC1279Xy == null) {
            return;
        }
        interfaceC1279Xy.mo1430v();
        atomicReferenceFieldUpdater.set(this, C0638M0.f2063S);
    }

    /* renamed from: y */
    public final void m2968y(InterfaceC2364sT interfaceC2364sT) {
        AbstractC1264Xg c0570Kh;
        if (interfaceC2364sT instanceof AbstractC1264Xg) {
            c0570Kh = (AbstractC1264Xg) interfaceC2364sT;
        } else {
            c0570Kh = new C0570Kh(1, interfaceC2364sT);
        }
        m2965s(c0570Kh);
    }

    @Override // p000a.InterfaceC1816iD
    /* renamed from: z */
    public final void mo2969z(AbstractC2025m7 abstractC2025m7, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f4706k;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (!((i2 & 536870911) == 536870911)) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        m2965s(abstractC2025m7);
    }
}
