package p000a;

import java.util.concurrent.TimeUnit;

/* renamed from: a.GL */
/* loaded from: classes.dex */
public abstract class AbstractC0331GL {

    /* renamed from: N */
    public static final long f1124N;

    /* renamed from: P */
    public static final int f1125P;

    /* renamed from: Q */
    public static final C2343s4 f1126Q;

    /* renamed from: h */
    public static final long f1127h;

    /* renamed from: o */
    public static final C2252qQ f1128o;

    /* renamed from: u */
    public static final C2252qQ f1129u;

    /* renamed from: v */
    public static final int f1130v;

    /* renamed from: z */
    public static final String f1131z;

    static {
        String str;
        int i = AbstractC2655y4.f8274z;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f1131z = str;
        f1127h = AbstractC1292YB.m2688od("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = AbstractC2655y4.f8274z;
        if (i2 < 2) {
            i2 = 2;
        }
        f1130v = AbstractC1292YB.m2685nF("kotlinx.coroutines.scheduler.core.pool.size", i2, 1, 0, 8);
        f1125P = AbstractC1292YB.m2685nF("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f1124N = TimeUnit.SECONDS.toNanos(AbstractC1292YB.m2688od("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f1126Q = C2343s4.f7227f;
        f1129u = new C2252qQ(0);
        f1128o = new C2252qQ(1);
    }
}
