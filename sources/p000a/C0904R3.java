package p000a;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: a.R3 */
/* loaded from: classes.dex */
public final class C0904R3 {

    /* renamed from: N */
    public final C1323Yo f3091N;

    /* renamed from: P */
    public boolean f3092P;

    /* renamed from: Q */
    public final C1323Yo f3093Q;

    /* renamed from: h */
    public final C1277Xw f3094h;

    /* renamed from: o */
    public final /* synthetic */ AbstractC2499v4 f3095o;

    /* renamed from: u */
    public final AbstractC2719zK f3096u;

    /* renamed from: v */
    public final C1277Xw f3097v;

    /* renamed from: z */
    public final ReentrantLock f3098z = new ReentrantLock(true);

    public C0904R3(AbstractC2499v4 abstractC2499v4, AbstractC2719zK abstractC2719zK) {
        this.f3095o = abstractC2499v4;
        C1277Xw c1277Xw = new C1277Xw(C1239X8.f4021S);
        this.f3094h = c1277Xw;
        C1277Xw c1277Xw2 = new C1277Xw(C1460bR.f4549S);
        this.f3097v = c1277Xw2;
        this.f3091N = new C1323Yo(c1277Xw);
        this.f3093Q = new C1323Yo(c1277Xw2);
        this.f3096u = abstractC2719zK;
    }

    /* renamed from: N */
    public final void m2054N(C1553dE c1553dE) {
        ReentrantLock reentrantLock = this.f3098z;
        reentrantLock.lock();
        try {
            C1277Xw c1277Xw = this.f3094h;
            Iterable iterable = (Iterable) c1277Xw.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if ((!AbstractC1292YB.m2695u((C1553dE) obj, c1553dE)) != true) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            c1277Xw.m2607u(arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: P */
    public final void m2055P(C1553dE c1553dE, boolean z) {
        AbstractC2499v4 abstractC2499v4 = this.f3095o;
        AbstractC2719zK mo2533h = abstractC2499v4.f7660s.mo2533h(c1553dE.f4790R.f4449S);
        if (AbstractC1292YB.m2695u(mo2533h, this.f3096u)) {
            InterfaceC2364sT interfaceC2364sT = abstractC2499v4.f7653f;
            if (interfaceC2364sT != null) {
                interfaceC2364sT.mo85W(c1553dE);
                m2054N(c1553dE);
                return;
            }
            C1200WR c1200wr = abstractC2499v4.f7661u;
            int indexOf = c1200wr.indexOf(c1553dE);
            if (indexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + c1553dE + " as it was not found on the current back stack");
                return;
            }
            int i = indexOf + 1;
            if (i != c1200wr.f3908w) {
                abstractC2499v4.m4332M(((C1553dE) c1200wr.get(i)).f4790R.f4455y, true, false);
            }
            AbstractC2499v4.m4329w(abstractC2499v4, c1553dE);
            m2054N(c1553dE);
            abstractC2499v4.m4344s();
            abstractC2499v4.m4340h();
            return;
        }
        ((C0904R3) abstractC2499v4.f7648U.get(mo2533h)).m2055P(c1553dE, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0064, code lost:
    
        if (r1 != false) goto L121;
     */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2056Q(p000a.C1553dE r9, boolean r10) {
        /*
            r8 = this;
            a.Xw r0 = r8.f3097v
            java.lang.Object r1 = r0.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L18
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L18
            goto L31
        L18:
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            a.dE r2 = (p000a.C1553dE) r2
            if (r2 != r9) goto L2c
            r2 = r3
            goto L2d
        L2c:
            r2 = r4
        L2d:
            if (r2 == 0) goto L1c
            r1 = r3
            goto L32
        L31:
            r1 = r4
        L32:
            a.Yo r2 = r8.f3091N
            if (r1 == 0) goto L67
            java.lang.Object r1 = r2.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r5 = r1 instanceof java.util.Collection
            if (r5 == 0) goto L4a
            r5 = r1
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L4a
            goto L63
        L4a:
            java.util.Iterator r1 = r1.iterator()
        L4e:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L63
            java.lang.Object r5 = r1.next()
            a.dE r5 = (p000a.C1553dE) r5
            if (r5 != r9) goto L5e
            r5 = r3
            goto L5f
        L5e:
            r5 = r4
        L5f:
            if (r5 == 0) goto L4e
            r1 = r4
            goto L64
        L63:
            r1 = r3
        L64:
            if (r1 == 0) goto L67
            goto Lc6
        L67:
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = p000a.AbstractC1658fB.m3130Ha(r1, r9)
            r0.m2607u(r1)
            java.lang.Object r1 = r2.getValue()
            java.util.List r1 = (java.util.List) r1
            int r5 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r5)
        L82:
            boolean r5 = r1.hasPrevious()
            if (r5 == 0) goto Lb1
            java.lang.Object r5 = r1.previous()
            r6 = r5
            a.dE r6 = (p000a.C1553dE) r6
            boolean r7 = p000a.AbstractC1292YB.m2695u(r6, r9)
            if (r7 != 0) goto Lad
            java.lang.Object r7 = r2.getValue()
            java.util.List r7 = (java.util.List) r7
            int r6 = r7.lastIndexOf(r6)
            java.lang.Object r7 = r2.getValue()
            java.util.List r7 = (java.util.List) r7
            int r7 = r7.lastIndexOf(r9)
            if (r6 >= r7) goto Lad
            r6 = r3
            goto Lae
        Lad:
            r6 = r4
        Lae:
            if (r6 == 0) goto L82
            goto Lb2
        Lb1:
            r5 = 0
        Lb2:
            a.dE r5 = (p000a.C1553dE) r5
            if (r5 == 0) goto Lc3
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = p000a.AbstractC1658fB.m3130Ha(r1, r5)
            r0.m2607u(r1)
        Lc3:
            r8.m2055P(r9, r10)
        Lc6:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            a.v4 r0 = r8.f3095o
            java.util.LinkedHashMap r0 = r0.f7659r
            r0.put(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0904R3.m2056Q(a.dE, boolean):void");
    }

    /* renamed from: h */
    public final void m2057h(C1553dE c1553dE) {
        C0401Hd c0401Hd;
        C2145oS c2145oS;
        AbstractC2499v4 abstractC2499v4 = this.f3095o;
        boolean m2695u = AbstractC1292YB.m2695u(abstractC2499v4.f7659r.get(c1553dE), Boolean.TRUE);
        C1277Xw c1277Xw = this.f3097v;
        Set set = (Set) c1277Xw.getValue();
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0438II.m990C(set.size()));
        Iterator it = set.iterator();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!z2 && AbstractC1292YB.m2695u(next, c1553dE)) {
                z2 = true;
                z3 = false;
            }
            if (z3) {
                linkedHashSet.add(next);
            }
        }
        c1277Xw.m2607u(linkedHashSet);
        abstractC2499v4.f7659r.remove(c1553dE);
        C1200WR c1200wr = abstractC2499v4.f7661u;
        if (!c1200wr.contains(c1553dE)) {
            abstractC2499v4.m4339g(c1553dE);
            if (c1553dE.f4798y.f1105P.m3117z(EnumC1632eh.f5092w)) {
                c1553dE.m3022P(EnumC1632eh.f5089S);
            }
            boolean z4 = c1200wr instanceof Collection;
            String str = c1553dE.f4794k;
            if (!z4 || !c1200wr.isEmpty()) {
                Iterator it2 = c1200wr.iterator();
                while (it2.hasNext()) {
                    if (AbstractC1292YB.m2695u(((C1553dE) it2.next()).f4794k, str)) {
                        break;
                    }
                }
            }
            z = true;
            if (z && !m2695u && (c0401Hd = abstractC2499v4.f7663w) != null && (c2145oS = (C2145oS) c0401Hd.f1353I.remove(str)) != null) {
                c2145oS.m3763z();
            }
            abstractC2499v4.m4347y();
        } else if (!this.f3092P) {
            abstractC2499v4.m4347y();
            abstractC2499v4.f7657o.m2607u(new ArrayList(c1200wr));
        } else {
            return;
        }
        abstractC2499v4.f7650W.m2607u(abstractC2499v4.m4331I());
    }

    /* renamed from: o */
    public final void m2058o(C1553dE c1553dE) {
        boolean z;
        boolean z2;
        boolean z3;
        C1277Xw c1277Xw = this.f3097v;
        Iterable iterable = (Iterable) c1277Xw.getValue();
        boolean z4 = true;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((C1553dE) it.next()) == c1553dE) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        C1323Yo c1323Yo = this.f3091N;
        if (z2) {
            Iterable iterable2 = (Iterable) c1323Yo.getValue();
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    if (((C1553dE) it2.next()) == c1553dE) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        break;
                    }
                }
            }
            z4 = false;
            if (z4) {
                return;
            }
        }
        C1553dE c1553dE2 = (C1553dE) AbstractC2486us.m4277Fu((List) c1323Yo.getValue());
        if (c1553dE2 != null) {
            c1277Xw.m2607u(AbstractC1658fB.m3130Ha((Set) c1277Xw.getValue(), c1553dE2));
        }
        c1277Xw.m2607u(AbstractC1658fB.m3130Ha((Set) c1277Xw.getValue(), c1553dE));
        m2059u(c1553dE);
    }

    /* renamed from: u */
    public final void m2059u(C1553dE c1553dE) {
        AbstractC2499v4 abstractC2499v4 = this.f3095o;
        AbstractC2719zK mo2533h = abstractC2499v4.f7660s.mo2533h(c1553dE.f4790R.f4449S);
        if (AbstractC1292YB.m2695u(mo2533h, this.f3096u)) {
            InterfaceC2364sT interfaceC2364sT = abstractC2499v4.f7637E;
            if (interfaceC2364sT != null) {
                interfaceC2364sT.mo85W(c1553dE);
                m2061z(c1553dE);
                return;
            } else {
                Log.i("NavController", "Ignoring add of destination " + c1553dE.f4790R + " outside of the call to navigate(). ");
                return;
            }
        }
        Object obj = abstractC2499v4.f7648U.get(mo2533h);
        if (obj != null) {
            ((C0904R3) obj).m2059u(c1553dE);
            return;
        }
        throw new IllegalStateException(AbstractC2441tz.m4187M(new StringBuilder("NavigatorBackStack for "), c1553dE.f4790R.f4449S, " should already be created").toString());
    }

    /* renamed from: v */
    public final void m2060v(C1553dE c1553dE) {
        int i;
        ReentrantLock reentrantLock = this.f3098z;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList((Collection) this.f3091N.getValue());
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (AbstractC1292YB.m2695u(((C1553dE) listIterator.previous()).f4794k, c1553dE.f4794k)) {
                        i = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            arrayList.set(i, c1553dE);
            this.f3094h.m2607u(arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: z */
    public final void m2061z(C1553dE c1553dE) {
        ReentrantLock reentrantLock = this.f3098z;
        reentrantLock.lock();
        try {
            C1277Xw c1277Xw = this.f3094h;
            c1277Xw.m2607u(AbstractC2486us.m4285T0((Collection) c1277Xw.getValue(), c1553dE));
        } finally {
            reentrantLock.unlock();
        }
    }
}
