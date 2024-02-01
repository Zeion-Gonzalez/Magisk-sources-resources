package p000a;

import android.os.Process;

/* renamed from: a.l2 */
/* loaded from: classes.dex */
public final class C1969l2 extends Thread {

    /* renamed from: S */
    public final int f6095S;

    public C1969l2(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.f6095S = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f6095S);
        super.run();
    }
}
