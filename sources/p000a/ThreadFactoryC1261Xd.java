package p000a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: a.Xd */
/* loaded from: classes.dex */
public final class ThreadFactoryC1261Xd implements ThreadFactory {

    /* renamed from: z */
    public final AtomicInteger f4083z = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f4083z.getAndIncrement());
        return thread;
    }
}
