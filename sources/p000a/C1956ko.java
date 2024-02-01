package p000a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* renamed from: a.ko */
/* loaded from: classes.dex */
public final class C1956ko {

    /* renamed from: N */
    public final ArrayList f6056N = new ArrayList();

    /* renamed from: P */
    public AbstractC1986lN f6057P;

    /* renamed from: Q */
    public boolean f6058Q;

    /* renamed from: h */
    public final String f6059h;

    /* renamed from: v */
    public boolean f6060v;

    /* renamed from: z */
    public final C0634Lw f6061z;

    public C1956ko(C0634Lw c0634Lw, String str) {
        this.f6061z = c0634Lw;
        this.f6059h = str;
    }

    /* renamed from: N */
    public final boolean m3576N(AbstractC1986lN abstractC1986lN, long j, boolean z) {
        boolean z2;
        String m2651J;
        String str;
        boolean z3;
        C1956ko c1956ko = abstractC1986lN.f6158v;
        if (c1956ko != this) {
            if (c1956ko == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                abstractC1986lN.f6158v = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        this.f6061z.f2058z.getClass();
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.f6056N;
        int indexOf = arrayList.indexOf(abstractC1986lN);
        if (indexOf != -1) {
            if (abstractC1986lN.f6156P <= j2) {
                if (C0634Lw.f2050W.isLoggable(Level.FINE)) {
                    AbstractC1292YB.m2657P(abstractC1986lN, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        abstractC1986lN.f6156P = j2;
        if (C0634Lw.f2050W.isLoggable(Level.FINE)) {
            long j3 = j2 - nanoTime;
            if (z) {
                m2651J = AbstractC1292YB.m2651J(j3);
                str = "run again after ";
            } else {
                m2651J = AbstractC1292YB.m2651J(j3);
                str = "scheduled after ";
            }
            AbstractC1292YB.m2657P(abstractC1986lN, this, str.concat(m2651J));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (((AbstractC1986lN) it.next()).f6156P - nanoTime > j) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, abstractC1986lN);
        if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public final void m3577Q() {
        byte[] bArr = AbstractC1181W6.f3860z;
        synchronized (this.f6061z) {
            this.f6060v = true;
            if (m3578h()) {
                this.f6061z.m1423N(this);
            }
        }
    }

    /* renamed from: h */
    public final boolean m3578h() {
        AbstractC1986lN abstractC1986lN = this.f6057P;
        if (abstractC1986lN != null && abstractC1986lN.f6157h) {
            this.f6058Q = true;
        }
        ArrayList arrayList = this.f6056N;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((AbstractC1986lN) arrayList.get(size)).f6157h) {
                AbstractC1986lN abstractC1986lN2 = (AbstractC1986lN) arrayList.get(size);
                if (C0634Lw.f2050W.isLoggable(Level.FINE)) {
                    AbstractC1292YB.m2657P(abstractC1986lN2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final String toString() {
        return this.f6059h;
    }

    /* renamed from: v */
    public final void m3579v(AbstractC1986lN abstractC1986lN, long j) {
        synchronized (this.f6061z) {
            if (this.f6060v) {
                if (abstractC1986lN.f6157h) {
                    C0634Lw c0634Lw = C0634Lw.f2051o;
                    if (C0634Lw.f2050W.isLoggable(Level.FINE)) {
                        AbstractC1292YB.m2657P(abstractC1986lN, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                } else {
                    C0634Lw c0634Lw2 = C0634Lw.f2051o;
                    if (C0634Lw.f2050W.isLoggable(Level.FINE)) {
                        AbstractC1292YB.m2657P(abstractC1986lN, this, "schedule failed (queue is shutdown)");
                    }
                    throw new RejectedExecutionException();
                }
            }
            if (m3576N(abstractC1986lN, j, false)) {
                this.f6061z.m1423N(this);
            }
        }
    }

    /* renamed from: z */
    public final void m3580z() {
        byte[] bArr = AbstractC1181W6.f3860z;
        synchronized (this.f6061z) {
            if (m3578h()) {
                this.f6061z.m1423N(this);
            }
        }
    }
}
