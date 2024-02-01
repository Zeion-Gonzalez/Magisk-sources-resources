package p000a;

import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: a.AI */
/* loaded from: classes.dex */
public abstract class AbstractC0017AI implements Closeable {

    /* renamed from: S */
    public static ExecutorService f108S = Executors.newCachedThreadPool();

    /* renamed from: z */
    public static C0357Gq m44z(String... strArr) {
        C0357Gq c0357Gq = new C0357Gq();
        c0357Gq.m971O4(strArr);
        return c0357Gq;
    }

    /* renamed from: G */
    public final boolean m45G() {
        if (((C1996lX) this).f6179R >= 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public abstract void mo46h(InterfaceC1798hr interfaceC1798hr);
}
