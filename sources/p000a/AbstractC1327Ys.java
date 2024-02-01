package p000a;

/* renamed from: a.Ys */
/* loaded from: classes.dex */
public abstract class AbstractC1327Ys {

    /* renamed from: N */
    public static final C0175DP f4206N;

    /* renamed from: P */
    public static final C0175DP f4207P;

    /* renamed from: h */
    public static final C0175DP f4209h;

    /* renamed from: v */
    public static final C0175DP f4210v;

    /* renamed from: z */
    public static final int f4211z = AbstractC1292YB.m2685nF("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12);

    /* renamed from: Q */
    public static final int f4208Q = AbstractC1292YB.m2685nF("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12);

    static {
        int i = 1;
        f4209h = new C0175DP(i, "PERMIT");
        f4210v = new C0175DP(i, "TAKEN");
        f4207P = new C0175DP(i, "BROKEN");
        f4206N = new C0175DP(i, "CANCELLED");
    }
}
