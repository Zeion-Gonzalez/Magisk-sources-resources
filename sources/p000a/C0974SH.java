package p000a;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: a.SH */
/* loaded from: classes.dex */
public final class C0974SH {

    /* renamed from: z */
    public final ThreadPoolExecutor f3290z;

    public C0974SH(ThreadFactoryC2319re threadFactoryC2319re) {
        this.f3290z = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC2319re);
    }
}
