package p000a;

import java.util.concurrent.ThreadFactory;

/* renamed from: a.ZD */
/* loaded from: classes.dex */
public final class ThreadFactoryC1347ZD implements ThreadFactory {

    /* renamed from: z */
    public final String f4240z = "fonts-androidx";

    /* renamed from: h */
    public final int f4239h = 10;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C1969l2(runnable, this.f4240z, this.f4239h);
    }
}
