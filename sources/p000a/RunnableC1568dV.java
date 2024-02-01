package p000a;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: a.dV */
/* loaded from: classes.dex */
public final class RunnableC1568dV extends AbstractC0302Fl implements Runnable {

    /* renamed from: E */
    public static final long f4831E;

    /* renamed from: U */
    public static final RunnableC1568dV f4832U;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        RunnableC1568dV runnableC1568dV = new RunnableC1568dV();
        f4832U = runnableC1568dV;
        runnableC1568dV.m4672dx(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f4831E = timeUnit.toNanos(l.longValue());
    }

    /* renamed from: G5 */
    public final synchronized void m3033G5() {
        boolean z;
        int i = debugStatus;
        if (i != 2 && i != 3) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return;
        }
        debugStatus = 3;
        AbstractC0302Fl.f1044g.set(this, null);
        AbstractC0302Fl.f1046y.set(this, null);
        notifyAll();
    }

    @Override // p000a.AbstractC0302Fl
    /* renamed from: Ha */
    public final void mo641Ha(Runnable runnable) {
        boolean z;
        if (debugStatus == 4) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            super.mo641Ha(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p000a.AbstractC2738zi
    /* renamed from: he */
    public final Thread mo3032he() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        AbstractC1129V8.f3679z.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i != 2 && i != 3) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    z2 = false;
                } else {
                    debugStatus = 1;
                    notifyAll();
                    z2 = true;
                }
            }
            if (!z2) {
                _thread = null;
                m3033G5();
                if (!m644oI()) {
                    mo3032he();
                    return;
                }
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long mo643ZH = mo643ZH();
                if (mo643ZH == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = f4831E + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        m3033G5();
                        if (!m644oI()) {
                            mo3032he();
                            return;
                        }
                        return;
                    }
                    if (mo643ZH > j2) {
                        mo643ZH = j2;
                    }
                } else {
                    j = Long.MAX_VALUE;
                }
                if (mo643ZH > 0) {
                    int i2 = debugStatus;
                    if (i2 != 2 && i2 != 3) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        _thread = null;
                        m3033G5();
                        if (!m644oI()) {
                            mo3032he();
                            return;
                        }
                        return;
                    }
                    LockSupport.parkNanos(this, mo643ZH);
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m3033G5();
            if (!m644oI()) {
                mo3032he();
            }
            throw th;
        }
    }

    @Override // p000a.AbstractC0302Fl, p000a.AbstractC2738zi
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
