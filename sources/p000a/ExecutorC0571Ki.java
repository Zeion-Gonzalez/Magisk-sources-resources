package p000a;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: a.Ki */
/* loaded from: classes.dex */
public final class ExecutorC0571Ki implements Executor {

    /* renamed from: I */
    public final Object f1848I;

    /* renamed from: R */
    public final Executor f1849R;

    /* renamed from: S */
    public final /* synthetic */ int f1850S;

    /* renamed from: q */
    public final ArrayDeque f1851q;

    /* renamed from: w */
    public Runnable f1852w;

    public ExecutorC0571Ki(Executor executor, int i) {
        this.f1850S = i;
        if (i != 1) {
            this.f1848I = new Object();
            this.f1851q = new ArrayDeque();
            this.f1849R = executor;
        } else {
            this.f1849R = executor;
            this.f1851q = new ArrayDeque();
            this.f1848I = new Object();
        }
    }

    /* renamed from: v */
    private final void m1292v() {
        synchronized (this.f1848I) {
            Object poll = this.f1851q.poll();
            Runnable runnable = (Runnable) poll;
            this.f1852w = runnable;
            if (poll != null) {
                this.f1849R.execute(runnable);
            }
        }
    }

    /* renamed from: z */
    private void m1293z(Runnable runnable) {
        synchronized (this.f1848I) {
            this.f1851q.offer(new RunnableC1547d8(this, runnable));
            if (this.f1852w == null) {
                m1294h();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1850S) {
            case AbstractC0795Op.f2698E /* 0 */:
                synchronized (this.f1848I) {
                    this.f1851q.add(new RunnableC1547d8(this, 0, runnable));
                    if (this.f1852w == null) {
                        m1294h();
                    }
                }
                return;
            default:
                m1293z(runnable);
                return;
        }
    }

    /* renamed from: h */
    public final void m1294h() {
        switch (this.f1850S) {
            case AbstractC0795Op.f2698E /* 0 */:
                synchronized (this.f1848I) {
                    Runnable runnable = (Runnable) this.f1851q.poll();
                    this.f1852w = runnable;
                    if (runnable != null) {
                        this.f1849R.execute(runnable);
                    }
                }
                return;
            default:
                m1292v();
                return;
        }
    }
}
