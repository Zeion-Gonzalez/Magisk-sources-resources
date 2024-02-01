package p000a;

import android.os.SystemClock;
import android.view.ViewTreeObserver;
import androidx.activity.AbstractActivityC2754z;
import java.util.concurrent.Executor;

/* renamed from: a.nm */
/* loaded from: classes.dex */
public final class ExecutorC2110nm implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: R */
    public Runnable f6510R;

    /* renamed from: S */
    public final long f6511S = SystemClock.uptimeMillis() + 10000;

    /* renamed from: w */
    public final /* synthetic */ AbstractActivityC2754z f6512w;

    public ExecutorC2110nm(AbstractActivityC0502JU abstractActivityC0502JU) {
        this.f6512w = abstractActivityC0502JU;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f6510R = runnable;
        this.f6512w.getWindow().getDecorView().postOnAnimation(new RunnableC0308Fs(1, this));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f6510R;
        if (runnable != null) {
            runnable.run();
            this.f6510R = null;
            C0816PC c0816pc = this.f6512w.f8666s;
            synchronized (c0816pc.f2777z) {
                z = c0816pc.f2775h;
            }
            if (!z) {
                return;
            }
        } else if (SystemClock.uptimeMillis() <= this.f6511S) {
            return;
        }
        this.f6512w.getWindow().getDecorView().post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6512w.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
