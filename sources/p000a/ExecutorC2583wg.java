package p000a;

import java.util.concurrent.Executor;

/* renamed from: a.wg */
/* loaded from: classes.dex */
public final class ExecutorC2583wg implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
