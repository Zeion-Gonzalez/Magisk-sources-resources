package p000a;

/* renamed from: a.lw */
/* loaded from: classes.dex */
public final class C2017lw {

    /* renamed from: P */
    public float f6264P;

    /* renamed from: W */
    public int f6266W;

    /* renamed from: h */
    public int f6267h;

    /* renamed from: o */
    public float f6268o;

    /* renamed from: v */
    public float f6270v;

    /* renamed from: z */
    public int f6271z;

    /* renamed from: N */
    public long f6263N = Long.MIN_VALUE;

    /* renamed from: u */
    public long f6269u = -1;

    /* renamed from: Q */
    public long f6265Q = 0;

    /* renamed from: z */
    public final float m3655z(long j) {
        long j2 = this.f6263N;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f6269u;
        if (j3 < 0 || j < j3) {
            return ViewOnTouchListenerC0220EB.m422h(((float) (j - j2)) / this.f6271z, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f6268o;
        return (ViewOnTouchListenerC0220EB.m422h(((float) (j - j3)) / this.f6266W, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
