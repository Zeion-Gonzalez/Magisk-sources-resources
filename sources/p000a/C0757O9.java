package p000a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a.O9 */
/* loaded from: classes.dex */
public class C0757O9 implements InterfaceC1265Xh, InterfaceC0716NU, InterfaceC0948Rp {
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: S */
    public static final AtomicReferenceFieldUpdater f2571S = AtomicReferenceFieldUpdater.newUpdater(C0757O9.class, Object.class, "_state");

    /* renamed from: R */
    public static final AtomicReferenceFieldUpdater f2570R = AtomicReferenceFieldUpdater.newUpdater(C0757O9.class, Object.class, "_parentHandle");

    public C0757O9(boolean z) {
        this._state = z ? AbstractC0438II.f1460f : AbstractC0438II.f1451E;
    }

    /* renamed from: j */
    public static C1912jy m1731j(C1215Wh c1215Wh) {
        while (c1215Wh.mo2508w()) {
            c1215Wh = c1215Wh.m2505R();
        }
        while (true) {
            c1215Wh = c1215Wh.m2506S();
            if (!c1215Wh.mo2508w()) {
                if (c1215Wh instanceof C1912jy) {
                    return (C1912jy) c1215Wh;
                }
                if (c1215Wh instanceof C2570wR) {
                    return null;
                }
            }
        }
    }

    /* renamed from: n */
    public static String m1732n(Object obj) {
        if (obj instanceof C1002Sn) {
            C1002Sn c1002Sn = (C1002Sn) obj;
            if (c1002Sn.m2174P()) {
                return "Cancelling";
            }
            if (c1002Sn.m2173N()) {
                return "Completing";
            }
        } else {
            if (!(obj instanceof InterfaceC0732Nl)) {
                return obj instanceof C1663fI ? "Cancelled" : "Completed";
            }
            if (!((InterfaceC0732Nl) obj).mo758h()) {
                return "New";
            }
        }
        return "Active";
    }

    /* renamed from: E */
    public boolean mo1733E() {
        return true;
    }

    /* renamed from: F */
    public boolean mo1734F() {
        return this instanceof C2542vr;
    }

    @Override // p000a.InterfaceC1255XS
    /* renamed from: G */
    public final InterfaceC1255XS mo104G(InterfaceC1255XS interfaceC1255XS) {
        return AbstractC0438II.m1002L(this, interfaceC1255XS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0030, code lost:
    
        if (r5 == 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x004a, code lost:
    
        if (r5 == 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x004c, code lost:
    
        r5 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x004e, code lost:
    
        r9.mo1745d();
        r5 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0054 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0057 A[EDGE_INSN: B:86:0x0057->B:82:0x0057 BREAK  A[LOOP:0: B:55:0x000c->B:88:?], SYNTHETIC] */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1735H(p000a.InterfaceC1265Xh r9) {
        /*
            r8 = this;
            a.M0 r0 = p000a.C0638M0.f2063S
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000a.C0757O9.f2570R
            if (r9 != 0) goto La
            r1.set(r8, r0)
            return
        La:
            a.O9 r9 = (p000a.C0757O9) r9
        Lc:
            java.lang.Object r2 = r9.m1743Y()
            boolean r3 = r2 instanceof p000a.C0348Ge
            r4 = 1
            r5 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = p000a.C0757O9.f2571S
            if (r3 == 0) goto L33
            r3 = r2
            a.Ge r3 = (p000a.C0348Ge) r3
            boolean r3 = r3.f1172S
            if (r3 == 0) goto L20
            goto L52
        L20:
            a.Ge r3 = p000a.AbstractC0438II.f1460f
        L22:
            boolean r7 = r6.compareAndSet(r9, r2, r3)
            if (r7 == 0) goto L2a
            r5 = r4
            goto L30
        L2a:
            java.lang.Object r7 = r6.get(r9)
            if (r7 == r2) goto L22
        L30:
            if (r5 != 0) goto L4e
            goto L4c
        L33:
            boolean r3 = r2 instanceof p000a.C1627ec
            if (r3 == 0) goto L52
            r3 = r2
            a.ec r3 = (p000a.C1627ec) r3
            a.wR r3 = r3.f5019S
        L3c:
            boolean r7 = r6.compareAndSet(r9, r2, r3)
            if (r7 == 0) goto L44
            r5 = r4
            goto L4a
        L44:
            java.lang.Object r7 = r6.get(r9)
            if (r7 == r2) goto L3c
        L4a:
            if (r5 != 0) goto L4e
        L4c:
            r5 = -1
            goto L52
        L4e:
            r9.mo1745d()
            r5 = r4
        L52:
            if (r5 == 0) goto L57
            if (r5 == r4) goto L57
            goto Lc
        L57:
            a.jy r2 = new a.jy
            r2.<init>(r8)
            r3 = 2
            a.Xy r9 = p000a.AbstractC1292YB.m2673d(r9, r4, r2, r3)
            a.Hp r9 = (p000a.InterfaceC0413Hp) r9
            r1.set(r8, r9)
            java.lang.Object r2 = r8.m1743Y()
            boolean r2 = r2 instanceof p000a.InterfaceC0732Nl
            r2 = r2 ^ r4
            if (r2 == 0) goto L75
            r9.mo1430v()
            r1.set(r8, r0)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0757O9.m1735H(a.Xh):void");
    }

    /* renamed from: I */
    public String mo313I() {
        return "Job was cancelled";
    }

    /* renamed from: J */
    public boolean mo1736J(Throwable th) {
        return false;
    }

    /* renamed from: L */
    public final void m1737L(C2570wR c2570wR, Throwable th) {
        C0993Sd c0993Sd = null;
        for (C1215Wh c1215Wh = (C1215Wh) c2570wR.m2507V(); !AbstractC1292YB.m2695u(c1215Wh, c2570wR); c1215Wh = c1215Wh.m2506S()) {
            if (c1215Wh instanceof AbstractC0250Em) {
                AbstractC1380Zq abstractC1380Zq = (AbstractC1380Zq) c1215Wh;
                try {
                    abstractC1380Zq.mo364q(th);
                } catch (Throwable th2) {
                    if (c0993Sd != null) {
                        AbstractC1292YB.m2655N(c0993Sd, th2);
                    } else {
                        c0993Sd = new C0993Sd("Exception in completion handler " + abstractC1380Zq + " for " + this, th2);
                    }
                }
            }
        }
        if (c0993Sd != null) {
            mo316c(c0993Sd);
        }
        m1755w(th);
    }

    /* renamed from: M */
    public void mo31M(Object obj) {
        mo32W(obj);
    }

    /* renamed from: O */
    public final void m1738O(AbstractC1380Zq abstractC1380Zq) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z;
        C2570wR c2570wR = new C2570wR();
        abstractC1380Zq.getClass();
        C1215Wh.f3977R.lazySet(c2570wR, abstractC1380Zq);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1215Wh.f3978S;
        atomicReferenceFieldUpdater2.lazySet(c2570wR, abstractC1380Zq);
        while (true) {
            if (abstractC1380Zq.m2507V() != abstractC1380Zq) {
                break;
            }
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(abstractC1380Zq, abstractC1380Zq, c2570wR)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater2.get(abstractC1380Zq) != abstractC1380Zq) {
                    z = false;
                    break;
                }
            }
            if (z) {
                c2570wR.m2504M(abstractC1380Zq);
                break;
            }
        }
        C1215Wh m2506S = abstractC1380Zq.m2506S();
        do {
            atomicReferenceFieldUpdater = f2571S;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC1380Zq, m2506S)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC1380Zq);
    }

    /* renamed from: R */
    public void mo1718R(CancellationException cancellationException) {
        m1739S(cancellationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0008, code lost:
    
        if (mo1747f() != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x000a, code lost:
    
        r0 = m1743Y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0010, code lost:
    
        if ((r0 instanceof p000a.InterfaceC0732Nl) == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0014, code lost:
    
        if ((r0 instanceof p000a.C1002Sn) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x001d, code lost:
    
        if (((p000a.C1002Sn) r0).m2173N() == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0020, code lost:
    
        r0 = m1740T(r0, new p000a.C1663fI(m1748g(r10), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x002f, code lost:
    
        if (r0 == p000a.AbstractC0438II.f1467y) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0032, code lost:
    
        r0 = p000a.AbstractC0438II.f1462k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0036, code lost:
    
        if (r0 != p000a.AbstractC0438II.f1461g) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0038, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x003b, code lost:
    
        if (r0 != p000a.AbstractC0438II.f1462k) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x003d, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x003f, code lost:
    
        r4 = m1743Y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0045, code lost:
    
        if ((r4 instanceof p000a.C1002Sn) == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0047, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0053, code lost:
    
        if (p000a.C1002Sn.f3363I.get((p000a.C1002Sn) r4) != p000a.AbstractC0438II.f1457U) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0055, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0057, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0058, code lost:
    
        if (r5 == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x005a, code lost:
    
        r10 = p000a.AbstractC0438II.f1465s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x005c, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x005f, code lost:
    
        r5 = ((p000a.C1002Sn) r4).m2174P();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0066, code lost:
    
        if (r10 != null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0068, code lost:
    
        if (r5 != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x006a, code lost:
    
        if (r1 != null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x006c, code lost:
    
        r1 = m1748g(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0070, code lost:
    
        ((p000a.C1002Sn) r4).m2177z(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0076, code lost:
    
        r10 = ((p000a.C1002Sn) r4).m2176v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x007f, code lost:
    
        if ((!r5) == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0081, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0082, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0083, code lost:
    
        if (r0 == null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0085, code lost:
    
        m1737L(((p000a.C1002Sn) r4).f3366S, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0092, code lost:
    
        if ((r4 instanceof p000a.InterfaceC0732Nl) == false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0094, code lost:
    
        if (r1 != null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0096, code lost:
    
        r1 = m1748g(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x009a, code lost:
    
        r5 = (p000a.InterfaceC0732Nl) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x00a1, code lost:
    
        if (r5.mo758h() == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x00a3, code lost:
    
        r6 = m1752r(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x00a7, code lost:
    
        if (r6 != null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x00aa, code lost:
    
        r7 = new p000a.C1002Sn(r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x00af, code lost:
    
        r4 = p000a.C0757O9.f2571S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00b5, code lost:
    
        if (r4.compareAndSet(r9, r5, r7) == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00b7, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x00bd, code lost:
    
        if (r4.get(r9) == r5) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x00bf, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x00c0, code lost:
    
        if (r4 != false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x00c2, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x00c4, code lost:
    
        m1737L(r6, r1);
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x00c8, code lost:
    
        if (r4 == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x00ca, code lost:
    
        r10 = p000a.AbstractC0438II.f1462k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x00cd, code lost:
    
        r5 = m1740T(r4, new p000a.C1663fI(r1, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x00d8, code lost:
    
        if (r5 == p000a.AbstractC0438II.f1462k) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x00dc, code lost:
    
        if (r5 == p000a.AbstractC0438II.f1467y) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x00de, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x00f7, code lost:
    
        throw new java.lang.IllegalStateException(("Cannot happen in " + r4).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x00f8, code lost:
    
        r10 = p000a.AbstractC0438II.f1465s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x00fa, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x00fd, code lost:
    
        if (r0 != p000a.AbstractC0438II.f1462k) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0102, code lost:
    
        if (r0 != p000a.AbstractC0438II.f1461g) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0107, code lost:
    
        if (r0 != p000a.AbstractC0438II.f1465s) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x010a, code lost:
    
        mo32W(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x010e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:?, code lost:
    
        return false;
     */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1739S(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0757O9.m1739S(java.lang.Object):boolean");
    }

    /* renamed from: T */
    public final Object m1740T(Object obj, Object obj2) {
        C1612eK c1612eK;
        boolean z;
        C1002Sn c1002Sn;
        C1663fI c1663fI;
        C1912jy c1912jy;
        C0175DP c0175dp;
        if (!(obj instanceof InterfaceC0732Nl)) {
            return AbstractC0438II.f1462k;
        }
        boolean z2 = true;
        boolean z3 = false;
        if (((obj instanceof C0348Ge) || (obj instanceof AbstractC1380Zq)) && !(obj instanceof C1912jy) && !(obj2 instanceof C1663fI)) {
            InterfaceC0732Nl interfaceC0732Nl = (InterfaceC0732Nl) obj;
            if (obj2 instanceof InterfaceC0732Nl) {
                c1612eK = new C1612eK((InterfaceC0732Nl) obj2);
            } else {
                c1612eK = obj2;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2571S;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0732Nl, c1612eK)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != interfaceC0732Nl) {
                    z = false;
                    break;
                }
            }
            if (!z) {
                z2 = false;
            } else {
                mo318i(obj2);
                m1749k(interfaceC0732Nl, obj2);
            }
            if (z2) {
                return obj2;
            }
            return AbstractC0438II.f1467y;
        }
        InterfaceC0732Nl interfaceC0732Nl2 = (InterfaceC0732Nl) obj;
        C2570wR m1752r = m1752r(interfaceC0732Nl2);
        if (m1752r == null) {
            return AbstractC0438II.f1467y;
        }
        C1912jy c1912jy2 = null;
        if (interfaceC0732Nl2 instanceof C1002Sn) {
            c1002Sn = (C1002Sn) interfaceC0732Nl2;
        } else {
            c1002Sn = null;
        }
        if (c1002Sn == null) {
            c1002Sn = new C1002Sn(m1752r, null);
        }
        synchronized (c1002Sn) {
            if (c1002Sn.m2173N()) {
                c0175dp = AbstractC0438II.f1462k;
            } else {
                C1002Sn.f3364R.set(c1002Sn, 1);
                if (c1002Sn != interfaceC0732Nl2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2571S;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0732Nl2, c1002Sn)) {
                            z3 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater2.get(this) != interfaceC0732Nl2) {
                            break;
                        }
                    }
                    if (!z3) {
                        c0175dp = AbstractC0438II.f1467y;
                    }
                }
                boolean m2174P = c1002Sn.m2174P();
                if (obj2 instanceof C1663fI) {
                    c1663fI = (C1663fI) obj2;
                } else {
                    c1663fI = null;
                }
                if (c1663fI != null) {
                    c1002Sn.m2177z(c1663fI.f5199z);
                }
                Throwable m2176v = c1002Sn.m2176v();
                if (!Boolean.valueOf(true ^ m2174P).booleanValue()) {
                    m2176v = null;
                }
                if (m2176v != null) {
                    m1737L(m1752r, m2176v);
                }
                if (interfaceC0732Nl2 instanceof C1912jy) {
                    c1912jy = (C1912jy) interfaceC0732Nl2;
                } else {
                    c1912jy = null;
                }
                if (c1912jy == null) {
                    C2570wR mo759u = interfaceC0732Nl2.mo759u();
                    if (mo759u != null) {
                        c1912jy2 = m1731j(mo759u);
                    }
                } else {
                    c1912jy2 = c1912jy;
                }
                if (c1912jy2 != null && m1754t(c1002Sn, c1912jy2, obj2)) {
                    return AbstractC0438II.f1461g;
                }
                return m1753s(c1002Sn, obj2);
            }
            return c0175dp;
        }
    }

    /* renamed from: U */
    public final CancellationException m1741U() {
        Object m1743Y = m1743Y();
        CancellationException cancellationException = null;
        if (m1743Y instanceof C1002Sn) {
            Throwable m2176v = ((C1002Sn) m1743Y).m2176v();
            if (m2176v != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (m2176v instanceof CancellationException) {
                    cancellationException = (CancellationException) m2176v;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = mo313I();
                    }
                    return new C0020AM(concat, m2176v, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(m1743Y instanceof InterfaceC0732Nl)) {
            if (m1743Y instanceof C1663fI) {
                Throwable th = ((C1663fI) m1743Y).f5199z;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new C0020AM(mo313I(), th, this);
                }
                return cancellationException;
            }
            return new C0020AM(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // p000a.InterfaceC1255XS
    /* renamed from: V */
    public final InterfaceC1255XS mo105V(InterfaceC0631Ls interfaceC0631Ls) {
        if (AbstractC1292YB.m2695u(C1710g8.f5381k, interfaceC0631Ls)) {
            return C0070BN.f302S;
        }
        return this;
    }

    /* renamed from: W */
    public void mo32W(Object obj) {
    }

    /* renamed from: X */
    public final boolean m1742X() {
        Object m1743Y = m1743Y();
        return (m1743Y instanceof C1663fI) || ((m1743Y instanceof C1002Sn) && ((C1002Sn) m1743Y).m2174P());
    }

    /* renamed from: Y */
    public final Object m1743Y() {
        while (true) {
            Object obj = f2571S.get(this);
            if (!(obj instanceof AbstractC1709g7)) {
                return obj;
            }
            ((AbstractC1709g7) obj).mo2534z(this);
        }
    }

    /* renamed from: Z */
    public final Object m1744Z(Object obj) {
        Object m1740T;
        C1663fI c1663fI;
        do {
            m1740T = m1740T(m1743Y(), obj);
            if (m1740T == AbstractC0438II.f1462k) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof C1663fI) {
                    c1663fI = (C1663fI) obj;
                } else {
                    c1663fI = null;
                }
                if (c1663fI != null) {
                    th = c1663fI.f5199z;
                }
                throw new IllegalStateException(str, th);
            }
        } while (m1740T == AbstractC0438II.f1467y);
        return m1740T;
    }

    /* renamed from: c */
    public void mo316c(C0993Sd c0993Sd) {
        throw c0993Sd;
    }

    /* renamed from: d */
    public void mo1745d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [a.ec] */
    /* renamed from: e */
    public final InterfaceC1279Xy m1746e(boolean z, boolean z2, InterfaceC2364sT interfaceC2364sT) {
        AbstractC1380Zq abstractC1380Zq;
        boolean z3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1663fI c1663fI;
        Throwable th;
        Throwable th2 = null;
        if (z) {
            if (interfaceC2364sT instanceof AbstractC0250Em) {
                abstractC1380Zq = (AbstractC0250Em) interfaceC2364sT;
            } else {
                abstractC1380Zq = null;
            }
            if (abstractC1380Zq == null) {
                abstractC1380Zq = new C2572wT(interfaceC2364sT);
            }
        } else {
            if (interfaceC2364sT instanceof AbstractC1380Zq) {
                abstractC1380Zq = (AbstractC1380Zq) interfaceC2364sT;
            } else {
                abstractC1380Zq = null;
            }
            if (abstractC1380Zq == null) {
                abstractC1380Zq = new C1010Sw(interfaceC2364sT);
            }
        }
        abstractC1380Zq.f4312I = this;
        while (true) {
            Object m1743Y = m1743Y();
            if (m1743Y instanceof C0348Ge) {
                C0348Ge c0348Ge = (C0348Ge) m1743Y;
                if (c0348Ge.f1172S) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2571S;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, m1743Y, abstractC1380Zq)) {
                            z3 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater2.get(this) != m1743Y) {
                            z3 = false;
                            break;
                        }
                    }
                    if (z3) {
                        return abstractC1380Zq;
                    }
                } else {
                    C2570wR c2570wR = new C2570wR();
                    if (!c0348Ge.f1172S) {
                        c2570wR = new C1627ec(c2570wR);
                    }
                    do {
                        atomicReferenceFieldUpdater = f2571S;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, c0348Ge, c2570wR)) {
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == c0348Ge);
                }
            } else if (m1743Y instanceof InterfaceC0732Nl) {
                C2570wR mo759u = ((InterfaceC0732Nl) m1743Y).mo759u();
                if (mo759u == null) {
                    m1738O((AbstractC1380Zq) m1743Y);
                } else {
                    InterfaceC1279Xy interfaceC1279Xy = C0638M0.f2063S;
                    if (z && (m1743Y instanceof C1002Sn)) {
                        synchronized (m1743Y) {
                            th = ((C1002Sn) m1743Y).m2176v();
                            if (th == null || ((interfaceC2364sT instanceof C1912jy) && !((C1002Sn) m1743Y).m2173N())) {
                                if (m1750o(m1743Y, mo759u, abstractC1380Zq)) {
                                    if (th == null) {
                                        return abstractC1380Zq;
                                    }
                                    interfaceC1279Xy = abstractC1380Zq;
                                }
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z2) {
                            interfaceC2364sT.mo85W(th);
                        }
                        return interfaceC1279Xy;
                    }
                    if (m1750o(m1743Y, mo759u, abstractC1380Zq)) {
                        return abstractC1380Zq;
                    }
                }
            } else {
                if (z2) {
                    if (m1743Y instanceof C1663fI) {
                        c1663fI = (C1663fI) m1743Y;
                    } else {
                        c1663fI = null;
                    }
                    if (c1663fI != null) {
                        th2 = c1663fI.f5199z;
                    }
                    interfaceC2364sT.mo85W(th2);
                }
                return C0638M0.f2063S;
            }
        }
    }

    /* renamed from: f */
    public boolean mo1747f() {
        return false;
    }

    /* renamed from: g */
    public final Throwable m1748g(Object obj) {
        boolean z;
        Throwable th;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof Throwable;
        }
        CancellationException cancellationException = null;
        if (z) {
            Throwable th2 = (Throwable) obj;
            if (th2 == null) {
                return new C0020AM(mo313I(), null, this);
            }
            return th2;
        }
        C0757O9 c0757o9 = (C0757O9) ((InterfaceC0948Rp) obj);
        Object m1743Y = c0757o9.m1743Y();
        if (m1743Y instanceof C1002Sn) {
            th = ((C1002Sn) m1743Y).m2176v();
        } else if (m1743Y instanceof C1663fI) {
            th = ((C1663fI) m1743Y).f5199z;
        } else if (!(m1743Y instanceof InterfaceC0732Nl)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + m1743Y).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        if (cancellationException == null) {
            cancellationException = new C0020AM("Parent job is ".concat(m1732n(m1743Y)), th, c0757o9);
        }
        return cancellationException;
    }

    @Override // p000a.InterfaceC1088UM
    public final InterfaceC0631Ls getKey() {
        return C1710g8.f5381k;
    }

    @Override // p000a.InterfaceC1265Xh
    /* renamed from: h */
    public boolean mo317h() {
        Object m1743Y = m1743Y();
        return (m1743Y instanceof InterfaceC0732Nl) && ((InterfaceC0732Nl) m1743Y).mo758h();
    }

    /* renamed from: i */
    public void mo318i(Object obj) {
    }

    /* renamed from: k */
    public final void m1749k(InterfaceC0732Nl interfaceC0732Nl, Object obj) {
        C1663fI c1663fI;
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2570R;
        InterfaceC0413Hp interfaceC0413Hp = (InterfaceC0413Hp) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0413Hp != null) {
            interfaceC0413Hp.mo1430v();
            atomicReferenceFieldUpdater.set(this, C0638M0.f2063S);
        }
        C0993Sd c0993Sd = null;
        if (obj instanceof C1663fI) {
            c1663fI = (C1663fI) obj;
        } else {
            c1663fI = null;
        }
        if (c1663fI != null) {
            th = c1663fI.f5199z;
        } else {
            th = null;
        }
        if (interfaceC0732Nl instanceof AbstractC1380Zq) {
            try {
                ((AbstractC1380Zq) interfaceC0732Nl).mo364q(th);
                return;
            } catch (Throwable th2) {
                mo316c(new C0993Sd("Exception in completion handler " + interfaceC0732Nl + " for " + this, th2));
                return;
            }
        }
        C2570wR mo759u = interfaceC0732Nl.mo759u();
        if (mo759u != null) {
            for (C1215Wh c1215Wh = (C1215Wh) mo759u.m2507V(); !AbstractC1292YB.m2695u(c1215Wh, mo759u); c1215Wh = c1215Wh.m2506S()) {
                if (c1215Wh instanceof AbstractC1380Zq) {
                    AbstractC1380Zq abstractC1380Zq = (AbstractC1380Zq) c1215Wh;
                    try {
                        abstractC1380Zq.mo364q(th);
                    } catch (Throwable th3) {
                        if (c0993Sd != null) {
                            AbstractC1292YB.m2655N(c0993Sd, th3);
                        } else {
                            c0993Sd = new C0993Sd("Exception in completion handler " + abstractC1380Zq + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0993Sd != null) {
                mo316c(c0993Sd);
            }
        }
    }

    /* renamed from: o */
    public final boolean m1750o(Object obj, C2570wR c2570wR, AbstractC1380Zq abstractC1380Zq) {
        boolean z;
        boolean z2;
        C0835PZ c0835pz = new C0835PZ(abstractC1380Zq, this, obj);
        do {
            C1215Wh m2505R = c2570wR.m2505R();
            C1215Wh.f3977R.lazySet(abstractC1380Zq, m2505R);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1215Wh.f3978S;
            atomicReferenceFieldUpdater.lazySet(abstractC1380Zq, c2570wR);
            c0835pz.f2824v = c2570wR;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(m2505R, c2570wR, c0835pz)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(m2505R) != c2570wR) {
                    z = false;
                    break;
                }
            }
            if (!z) {
                z2 = false;
            } else if (c0835pz.mo2534z(m2505R) == null) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        } while (!z2);
        return false;
    }

    /* renamed from: p */
    public String mo319p() {
        return getClass().getSimpleName();
    }

    /* renamed from: q */
    public boolean mo1751q(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m1739S(th) && mo1733E();
    }

    /* renamed from: r */
    public final C2570wR m1752r(InterfaceC0732Nl interfaceC0732Nl) {
        C2570wR mo759u = interfaceC0732Nl.mo759u();
        if (mo759u != null) {
            return mo759u;
        }
        if (interfaceC0732Nl instanceof C0348Ge) {
            return new C2570wR();
        }
        if (interfaceC0732Nl instanceof AbstractC1380Zq) {
            m1738O((AbstractC1380Zq) interfaceC0732Nl);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0732Nl).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public final Object m1753s(C1002Sn c1002Sn, Object obj) {
        C1663fI c1663fI;
        Throwable th;
        Object obj2;
        boolean z;
        Throwable th2 = null;
        if (obj instanceof C1663fI) {
            c1663fI = (C1663fI) obj;
        } else {
            c1663fI = null;
        }
        if (c1663fI != null) {
            th = c1663fI.f5199z;
        } else {
            th = null;
        }
        synchronized (c1002Sn) {
            c1002Sn.m2174P();
            ArrayList<Throwable> m2175Q = c1002Sn.m2175Q(th);
            if (m2175Q.isEmpty()) {
                if (c1002Sn.m2174P()) {
                    th2 = new C0020AM(mo313I(), null, this);
                }
            } else {
                Iterator it = m2175Q.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if ((!(((Throwable) next) instanceof CancellationException)) != false) {
                        th2 = next;
                        break;
                    }
                }
                th2 = th2;
                if (th2 == null) {
                    th2 = (Throwable) m2175Q.get(0);
                }
            }
            if (th2 != null && m2175Q.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(m2175Q.size()));
                for (Throwable th3 : m2175Q) {
                    if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        AbstractC1292YB.m2655N(th2, th3);
                    }
                }
            }
        }
        if (th2 != null && th2 != th) {
            obj = new C1663fI(th2, false);
        }
        if (th2 != null) {
            if (!m1755w(th2) && !mo1736J(th2)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C1663fI c1663fI2 = (C1663fI) obj;
                c1663fI2.getClass();
                C1663fI.f5198h.compareAndSet(c1663fI2, 0, 1);
            }
        }
        mo318i(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2571S;
        if (obj instanceof InterfaceC0732Nl) {
            obj2 = new C1612eK((InterfaceC0732Nl) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c1002Sn, obj2) && atomicReferenceFieldUpdater.get(this) == c1002Sn) {
        }
        m1749k(c1002Sn, obj);
        return obj;
    }

    /* renamed from: t */
    public final boolean m1754t(C1002Sn c1002Sn, C1912jy c1912jy, Object obj) {
        while (AbstractC1292YB.m2673d(c1912jy.f5968q, false, new C1329Yw(this, c1002Sn, c1912jy, obj), 1) == C0638M0.f2063S) {
            c1912jy = m1731j(c1912jy);
            if (c1912jy == null) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo319p() + '{' + m1732n(m1743Y()) + '}');
        sb.append('@');
        sb.append(AbstractC2575wW.m4418Y(this));
        return sb.toString();
    }

    /* renamed from: w */
    public final boolean m1755w(Throwable th) {
        if (mo1734F()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC0413Hp interfaceC0413Hp = (InterfaceC0413Hp) f2570R.get(this);
        if (interfaceC0413Hp != null && interfaceC0413Hp != C0638M0.f2063S) {
            if (interfaceC0413Hp.mo926N(th) || z) {
                return true;
            }
            return false;
        }
        return z;
    }

    @Override // p000a.InterfaceC1255XS
    /* renamed from: x */
    public final Object mo106x(Object obj, InterfaceC0559KW interfaceC0559KW) {
        return interfaceC0559KW.mo51o(obj, this);
    }

    @Override // p000a.InterfaceC1255XS
    /* renamed from: y */
    public final InterfaceC1088UM mo107y(InterfaceC0631Ls interfaceC0631Ls) {
        if (AbstractC1292YB.m2695u(C1710g8.f5381k, interfaceC0631Ls)) {
            return this;
        }
        return null;
    }

    @Override // p000a.InterfaceC1265Xh, p000a.InterfaceC1869jD
    /* renamed from: z */
    public void mo1719z(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0020AM(mo313I(), null, this);
        }
        mo1718R(cancellationException);
    }
}
