package p000a;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: a.GH */
/* loaded from: classes.dex */
public final class RunnableC0327GH implements Runnable {

    /* renamed from: R */
    public volatile AtomicInteger f1112R = new AtomicInteger(0);

    /* renamed from: S */
    public final InterfaceC1007St f1113S;

    /* renamed from: w */
    public final /* synthetic */ C0523Jr f1114w;

    public RunnableC0327GH(C0523Jr c0523Jr, InterfaceC1007St interfaceC1007St) {
        this.f1114w = c0523Jr;
        this.f1113S = interfaceC1007St;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0234ES c0234es;
        String str = "OkHttp " + ((C2658y7) this.f1114w.f1748R.f4279h).m4566u();
        C0523Jr c0523Jr = this.f1114w;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            c0523Jr.f1756k.m3687o();
            boolean z = false;
            try {
                try {
                } catch (IOException e) {
                    e = e;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    this.f1113S.mo718h(c0523Jr.m1218o());
                    c0234es = c0523Jr.f1749S;
                } catch (IOException e2) {
                    e = e2;
                    z = true;
                    if (z) {
                        C0799Ov c0799Ov = C0799Ov.f2726z;
                        C0799Ov c0799Ov2 = C0799Ov.f2726z;
                        String str2 = "Callback failure for " + C0523Jr.m1211z(c0523Jr);
                        c0799Ov2.getClass();
                        C0799Ov.m1881W(4, str2, e);
                    } else {
                        this.f1113S.mo719z(e);
                    }
                    c0234es = c0523Jr.f1749S;
                    c0234es.f769S.m368v(this);
                } catch (Throwable th2) {
                    th = th2;
                    z = true;
                    c0523Jr.cancel();
                    if (!z) {
                        IOException iOException = new IOException("canceled due to " + th);
                        AbstractC1292YB.m2655N(iOException, th);
                        this.f1113S.mo719z(iOException);
                    }
                    throw th;
                }
                c0234es.f769S.m368v(this);
            } catch (Throwable th3) {
                c0523Jr.f1749S.f769S.m368v(this);
                throw th3;
            }
        } finally {
            currentThread.setName(name);
        }
    }
}
