package p000a;

/* renamed from: a.xL */
/* loaded from: classes.dex */
public final class RunnableC2623xL implements Runnable {

    /* renamed from: S */
    public Runnable f8139S;

    public RunnableC2623xL(RunnableC0320G8 runnableC0320G8) {
        this.f8139S = runnableC0320G8;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        this.f8139S.run();
        this.f8139S = null;
        notifyAll();
    }
}
