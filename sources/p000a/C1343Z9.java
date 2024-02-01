package p000a;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: a.Z9 */
/* loaded from: classes.dex */
public final class C1343Z9 extends AbstractC1209Wb implements InterfaceC1810i5 {

    /* renamed from: w */
    public final Executor f4237w;

    public C1343Z9(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f4237w = executor;
        Method method2 = AbstractC1444b4.f4519z;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = AbstractC1444b4.f4519z) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // p000a.AbstractC1859j1
    /* renamed from: C */
    public final void mo195C(InterfaceC1255XS interfaceC1255XS, Runnable runnable) {
        try {
            this.f4237w.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            InterfaceC1265Xh interfaceC1265Xh = (InterfaceC1265Xh) interfaceC1255XS.mo107y(C1710g8.f5381k);
            if (interfaceC1265Xh != null) {
                interfaceC1265Xh.mo1719z(cancellationException);
            }
            AbstractC0037Al.f178h.mo195C(interfaceC1255XS, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f4237w;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C1343Z9) && ((C1343Z9) obj).f4237w == this.f4237w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4237w);
    }

    @Override // p000a.AbstractC1859j1
    public final String toString() {
        return this.f4237w.toString();
    }
}
