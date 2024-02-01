package p000a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: a.Au */
/* loaded from: classes.dex */
public final class ExecutorC0044Au implements Executor {

    /* renamed from: S */
    public final Handler f189S = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f189S.post(runnable);
    }
}
