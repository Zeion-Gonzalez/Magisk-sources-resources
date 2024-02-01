package p000a;

import java.util.logging.Level;

/* renamed from: a.zv */
/* loaded from: classes.dex */
public final class RunnableC2748zv implements Runnable {

    /* renamed from: S */
    public final /* synthetic */ C0634Lw f8614S;

    public RunnableC2748zv(C0634Lw c0634Lw) {
        this.f8614S = c0634Lw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1986lN m1427v;
        long j;
        while (true) {
            C0634Lw c0634Lw = this.f8614S;
            synchronized (c0634Lw) {
                m1427v = c0634Lw.m1427v();
            }
            if (m1427v == null) {
                return;
            }
            C1956ko c1956ko = m1427v.f6158v;
            C0634Lw c0634Lw2 = this.f8614S;
            boolean isLoggable = C0634Lw.f2050W.isLoggable(Level.FINE);
            if (isLoggable) {
                c1956ko.f6061z.f2058z.getClass();
                j = System.nanoTime();
                AbstractC1292YB.m2657P(m1427v, c1956ko, "starting");
            } else {
                j = -1;
            }
            try {
                C0634Lw.m1422z(c0634Lw2, m1427v);
                if (isLoggable) {
                    c1956ko.f6061z.f2058z.getClass();
                    AbstractC1292YB.m2657P(m1427v, c1956ko, "finished run in ".concat(AbstractC1292YB.m2651J(System.nanoTime() - j)));
                }
            } finally {
            }
        }
    }
}
