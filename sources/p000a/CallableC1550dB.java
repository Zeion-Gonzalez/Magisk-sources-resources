package p000a;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: a.dB */
/* loaded from: classes.dex */
public final class CallableC1550dB extends AbstractExecutorService implements Callable {

    /* renamed from: S */
    public boolean f4783S = false;

    /* renamed from: R */
    public final ArrayDeque f4782R = new ArrayDeque();

    /* renamed from: w */
    public FutureTask f4784w = null;

    @Override // java.util.concurrent.ExecutorService
    public final synchronized boolean awaitTermination(long j, TimeUnit timeUnit) {
        FutureTask futureTask = this.f4784w;
        if (futureTask == null) {
            return true;
        }
        try {
            futureTask.get(j, timeUnit);
        } catch (ExecutionException unused) {
        } catch (TimeoutException unused2) {
            return false;
        }
        return true;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Runnable runnable;
        while (true) {
            synchronized (this) {
                runnable = (Runnable) this.f4782R.poll();
                if (runnable == null) {
                    this.f4784w = null;
                    return null;
                }
            }
            runnable.run();
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (this.f4783S) {
            throw new RejectedExecutionException("Task " + runnable.toString() + " rejected from " + toString());
        }
        this.f4782R.offer(runnable);
        if (this.f4784w == null) {
            FutureTask futureTask = new FutureTask(this);
            this.f4784w = futureTask;
            AbstractC0017AI.f108S.execute(futureTask);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final synchronized boolean isShutdown() {
        return this.f4783S;
    }

    @Override // java.util.concurrent.ExecutorService
    public final synchronized boolean isTerminated() {
        boolean z;
        if (this.f4783S) {
            z = this.f4784w == null;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final synchronized void shutdown() {
        this.f4783S = true;
        this.f4782R.clear();
    }

    @Override // java.util.concurrent.ExecutorService
    public final synchronized List shutdownNow() {
        this.f4783S = true;
        FutureTask futureTask = this.f4784w;
        if (futureTask != null) {
            futureTask.cancel(true);
        }
        try {
        } finally {
            this.f4782R.clear();
        }
        return new ArrayList(this.f4782R);
    }
}
