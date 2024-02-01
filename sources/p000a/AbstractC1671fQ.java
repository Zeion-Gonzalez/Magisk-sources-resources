package p000a;

/* renamed from: a.fQ */
/* loaded from: classes.dex */
public abstract class AbstractC1671fQ {

    /* renamed from: G */
    public static final C0175DP f5210G;

    /* renamed from: I */
    public static final C0175DP f5211I;

    /* renamed from: M */
    public static final C0175DP f5212M;

    /* renamed from: N */
    public static final C0175DP f5213N;

    /* renamed from: P */
    public static final C0175DP f5214P;

    /* renamed from: Q */
    public static final C0175DP f5215Q;

    /* renamed from: R */
    public static final C0175DP f5216R;

    /* renamed from: S */
    public static final C0175DP f5217S;

    /* renamed from: V */
    public static final C0175DP f5218V;

    /* renamed from: W */
    public static final C0175DP f5219W;

    /* renamed from: g */
    public static final C0175DP f5220g;

    /* renamed from: k */
    public static final C0175DP f5222k;

    /* renamed from: o */
    public static final C0175DP f5223o;

    /* renamed from: q */
    public static final C0175DP f5224q;

    /* renamed from: u */
    public static final C0175DP f5225u;

    /* renamed from: w */
    public static final C0175DP f5227w;

    /* renamed from: z */
    public static final C0566Kd f5228z = new C0566Kd(-1, null, null, 0);

    /* renamed from: h */
    public static final int f5221h = AbstractC1292YB.m2685nF("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: v */
    public static final int f5226v = AbstractC1292YB.m2685nF("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    static {
        int i = 1;
        f5214P = new C0175DP(i, "BUFFERED");
        f5213N = new C0175DP(i, "SHOULD_BUFFER");
        f5215Q = new C0175DP(i, "S_RESUMING_BY_RCV");
        f5225u = new C0175DP(i, "RESUMING_BY_EB");
        f5223o = new C0175DP(i, "POISONED");
        f5219W = new C0175DP(i, "DONE_RCV");
        f5210G = new C0175DP(i, "INTERRUPTED_SEND");
        f5212M = new C0175DP(i, "INTERRUPTED_RCV");
        f5218V = new C0175DP(i, "CHANNEL_CLOSED");
        f5217S = new C0175DP(i, "SUSPEND");
        f5216R = new C0175DP(i, "SUSPEND_NO_WAITER");
        f5227w = new C0175DP(i, "FAILED");
        f5211I = new C0175DP(i, "NO_RECEIVE_RESULT");
        f5224q = new C0175DP(i, "CLOSE_HANDLER_CLOSED");
        f5222k = new C0175DP(i, "CLOSE_HANDLER_INVOKED");
        f5220g = new C0175DP(i, "NO_CLOSE_CAUSE");
    }

    /* renamed from: z */
    public static final boolean m3166z(InterfaceC2363sS interfaceC2363sS, Object obj, InterfaceC2364sT interfaceC2364sT) {
        C1525cm c1525cm = (C1525cm) interfaceC2363sS;
        if (c1525cm.m2954J(obj, interfaceC2364sT) != null) {
            c1525cm.m2953I(c1525cm.f2384w);
            return true;
        }
        return false;
    }
}
