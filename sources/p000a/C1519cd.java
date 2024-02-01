package p000a;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: a.cd */
/* loaded from: classes.dex */
public final class C1519cd extends Thread {
    public C1519cd() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C2056mk m3885P;
        while (true) {
            try {
                reentrantLock = C2056mk.f6391o;
                reentrantLock.lock();
                try {
                    m3885P = C2252qQ.m3885P();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (m3885P == C2056mk.f6389V) {
                C2056mk.f6389V = null;
                return;
            } else {
                reentrantLock.unlock();
                if (m3885P != null) {
                    m3885P.mo2219M();
                }
            }
        }
    }
}
