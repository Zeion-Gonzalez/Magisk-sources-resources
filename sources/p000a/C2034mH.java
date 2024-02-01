package p000a;

import com.topjohnwu.magisk.core.App;
import java.lang.Thread;

/* renamed from: a.mH */
/* loaded from: classes.dex */
public final /* synthetic */ class C2034mH implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        int i = App.f9563S;
        AbstractC1530cs.f4727z.mo1160v(th);
        System.exit(1);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
