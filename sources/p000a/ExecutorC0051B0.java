package p000a;

import java.util.concurrent.Executor;

/* renamed from: a.B0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0051B0 implements Executor {

    /* renamed from: S */
    public final /* synthetic */ int f205S;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f205S) {
            case 1:
                C2146oU.m3764nB().m3765O4(runnable);
                return;
            case 2:
                runnable.run();
                return;
            default:
                AbstractC1110Un.m2289z(runnable);
                return;
        }
    }
}
