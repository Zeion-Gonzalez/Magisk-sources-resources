package p000a;

/* renamed from: a.V8 */
/* loaded from: classes.dex */
public abstract class AbstractC1129V8 {

    /* renamed from: z */
    public static final ThreadLocal f3679z = new ThreadLocal();

    /* renamed from: z */
    public static AbstractC2738zi m2311z() {
        ThreadLocal threadLocal = f3679z;
        AbstractC2738zi abstractC2738zi = (AbstractC2738zi) threadLocal.get();
        if (abstractC2738zi == null) {
            C1567dU c1567dU = new C1567dU(Thread.currentThread());
            threadLocal.set(c1567dU);
            return c1567dU;
        }
        return abstractC2738zi;
    }
}
