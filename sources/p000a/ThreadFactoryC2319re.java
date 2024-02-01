package p000a;

import java.util.concurrent.ThreadFactory;

/* renamed from: a.re */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC2319re implements ThreadFactory {

    /* renamed from: h */
    public final /* synthetic */ boolean f7146h;

    /* renamed from: z */
    public final /* synthetic */ String f7147z;

    public /* synthetic */ ThreadFactoryC2319re(String str, boolean z) {
        this.f7147z = str;
        this.f7146h = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f7147z);
        thread.setDaemon(this.f7146h);
        return thread;
    }
}
