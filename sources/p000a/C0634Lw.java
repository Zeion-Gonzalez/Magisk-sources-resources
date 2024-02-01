package p000a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* renamed from: a.Lw */
/* loaded from: classes.dex */
public final class C0634Lw {

    /* renamed from: P */
    public long f2053P;

    /* renamed from: v */
    public boolean f2057v;

    /* renamed from: z */
    public final C0974SH f2058z;

    /* renamed from: o */
    public static final C0634Lw f2051o = new C0634Lw(new C0974SH(new ThreadFactoryC2319re(AbstractC2441tz.m4187M(new StringBuilder(), AbstractC1181W6.f3858u, " TaskRunner"), true)));

    /* renamed from: W */
    public static final Logger f2050W = Logger.getLogger(C0634Lw.class.getName());

    /* renamed from: h */
    public int f2055h = 10000;

    /* renamed from: N */
    public final ArrayList f2052N = new ArrayList();

    /* renamed from: Q */
    public final ArrayList f2054Q = new ArrayList();

    /* renamed from: u */
    public final RunnableC2748zv f2056u = new RunnableC2748zv(this);

    public C0634Lw(C0974SH c0974sh) {
        this.f2058z = c0974sh;
    }

    /* renamed from: z */
    public static final void m1422z(C0634Lw c0634Lw, AbstractC1986lN abstractC1986lN) {
        c0634Lw.getClass();
        byte[] bArr = AbstractC1181W6.f3860z;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(abstractC1986lN.f6159z);
        try {
            long mo256z = abstractC1986lN.mo256z();
            synchronized (c0634Lw) {
                c0634Lw.m1426h(abstractC1986lN, mo256z);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (c0634Lw) {
                c0634Lw.m1426h(abstractC1986lN, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    /* renamed from: N */
    public final void m1423N(C1956ko c1956ko) {
        byte[] bArr = AbstractC1181W6.f3860z;
        if (c1956ko.f6057P == null) {
            boolean z = !c1956ko.f6056N.isEmpty();
            ArrayList arrayList = this.f2054Q;
            if (z) {
                if (!arrayList.contains(c1956ko)) {
                    arrayList.add(c1956ko);
                }
            } else {
                arrayList.remove(c1956ko);
            }
        }
        boolean z2 = this.f2057v;
        C0974SH c0974sh = this.f2058z;
        if (z2) {
            c0974sh.getClass();
            notify();
        } else {
            c0974sh.f3290z.execute(this.f2056u);
        }
    }

    /* renamed from: P */
    public final void m1424P() {
        ArrayList arrayList = this.f2052N;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            ((C1956ko) arrayList.get(size)).m3578h();
        }
        ArrayList arrayList2 = this.f2054Q;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            C1956ko c1956ko = (C1956ko) arrayList2.get(size2);
            c1956ko.m3578h();
            if (c1956ko.f6056N.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
    }

    /* renamed from: Q */
    public final C1956ko m1425Q() {
        int i;
        synchronized (this) {
            i = this.f2055h;
            this.f2055h = i + 1;
        }
        return new C1956ko(this, AbstractC2441tz.m4188N("Q", i));
    }

    /* renamed from: h */
    public final void m1426h(AbstractC1986lN abstractC1986lN, long j) {
        boolean z;
        byte[] bArr = AbstractC1181W6.f3860z;
        C1956ko c1956ko = abstractC1986lN.f6158v;
        if (c1956ko.f6057P == abstractC1986lN) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            boolean z2 = c1956ko.f6058Q;
            c1956ko.f6058Q = false;
            c1956ko.f6057P = null;
            this.f2052N.remove(c1956ko);
            if (j != -1 && !z2 && !c1956ko.f6060v) {
                c1956ko.m3576N(abstractC1986lN, j, true);
            }
            if ((!c1956ko.f6056N.isEmpty()) != false) {
                this.f2054Q.add(c1956ko);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: v */
    public final AbstractC1986lN m1427v() {
        boolean z;
        byte[] bArr = AbstractC1181W6.f3860z;
        while (true) {
            ArrayList arrayList = this.f2054Q;
            if (arrayList.isEmpty()) {
                return null;
            }
            C0974SH c0974sh = this.f2058z;
            c0974sh.getClass();
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j = Long.MAX_VALUE;
            AbstractC1986lN abstractC1986lN = null;
            while (true) {
                if (it.hasNext()) {
                    AbstractC1986lN abstractC1986lN2 = (AbstractC1986lN) ((C1956ko) it.next()).f6056N.get(0);
                    long max = Math.max(0L, abstractC1986lN2.f6156P - nanoTime);
                    if (max > 0) {
                        j = Math.min(max, j);
                    } else {
                        if (abstractC1986lN != null) {
                            z = true;
                            break;
                        }
                        abstractC1986lN = abstractC1986lN2;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (abstractC1986lN != null) {
                byte[] bArr2 = AbstractC1181W6.f3860z;
                abstractC1986lN.f6156P = -1L;
                C1956ko c1956ko = abstractC1986lN.f6158v;
                c1956ko.f6056N.remove(abstractC1986lN);
                arrayList.remove(c1956ko);
                c1956ko.f6057P = abstractC1986lN;
                this.f2052N.add(c1956ko);
                if (z || (!this.f2057v && (!arrayList.isEmpty()) != false)) {
                    c0974sh.f3290z.execute(this.f2056u);
                }
                return abstractC1986lN;
            }
            if (this.f2057v) {
                if (j < this.f2053P - nanoTime) {
                    notify();
                }
                return null;
            }
            this.f2057v = true;
            this.f2053P = nanoTime + j;
            try {
                try {
                    long j2 = j / 1000000;
                    Long.signum(j2);
                    long j3 = j - (1000000 * j2);
                    if (j2 > 0 || j > 0) {
                        wait(j2, (int) j3);
                    }
                } catch (InterruptedException unused) {
                    m1424P();
                }
                this.f2057v = false;
            } catch (Throwable th) {
                this.f2057v = false;
                throw th;
            }
        }
    }
}
