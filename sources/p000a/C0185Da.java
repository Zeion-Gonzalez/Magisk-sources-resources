package p000a;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: a.Da */
/* loaded from: classes.dex */
public final class C0185Da {

    /* renamed from: z */
    public ThreadPoolExecutor f573z;

    /* renamed from: h */
    public final ArrayDeque f571h = new ArrayDeque();

    /* renamed from: v */
    public final ArrayDeque f572v = new ArrayDeque();

    /* renamed from: P */
    public final ArrayDeque f570P = new ArrayDeque();

    /* renamed from: N */
    public final synchronized int m365N() {
        return this.f572v.size() + this.f570P.size();
    }

    /* renamed from: P */
    public final void m366P() {
        byte[] bArr = AbstractC1181W6.f3860z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f571h.iterator();
            while (it.hasNext()) {
                RunnableC0327GH runnableC0327GH = (RunnableC0327GH) it.next();
                if (this.f572v.size() >= 64) {
                    break;
                }
                if (runnableC0327GH.f1112R.get() < 5) {
                    it.remove();
                    runnableC0327GH.f1112R.incrementAndGet();
                    arrayList.add(runnableC0327GH);
                    this.f572v.add(runnableC0327GH);
                }
            }
            m365N();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            RunnableC0327GH runnableC0327GH2 = (RunnableC0327GH) arrayList.get(i);
            ExecutorService m369z = m369z();
            C0523Jr c0523Jr = runnableC0327GH2.f1114w;
            C0185Da c0185Da = c0523Jr.f1749S.f769S;
            byte[] bArr2 = AbstractC1181W6.f3860z;
            try {
                try {
                    ((ThreadPoolExecutor) m369z).execute(runnableC0327GH2);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    c0523Jr.m1212M(interruptedIOException);
                    runnableC0327GH2.f1113S.mo719z(interruptedIOException);
                    c0523Jr.f1749S.f769S.m368v(runnableC0327GH2);
                }
            } catch (Throwable th) {
                c0523Jr.f1749S.f769S.m368v(runnableC0327GH2);
                throw th;
            }
        }
    }

    /* renamed from: h */
    public final void m367h(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        m366P();
    }

    /* renamed from: v */
    public final void m368v(RunnableC0327GH runnableC0327GH) {
        runnableC0327GH.f1112R.decrementAndGet();
        m367h(this.f572v, runnableC0327GH);
    }

    /* renamed from: z */
    public final synchronized ExecutorService m369z() {
        if (this.f573z == null) {
            this.f573z = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC2319re(AbstractC1181W6.f3858u + " Dispatcher", false));
        }
        return this.f573z;
    }
}
