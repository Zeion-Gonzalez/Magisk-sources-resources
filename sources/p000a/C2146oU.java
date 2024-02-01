package p000a;

/* renamed from: a.oU */
/* loaded from: classes.dex */
public final class C2146oU extends AbstractC2703z2 {

    /* renamed from: I */
    public static final ExecutorC0051B0 f6601I = new ExecutorC0051B0(1);

    /* renamed from: w */
    public static volatile C2146oU f6602w;

    /* renamed from: R */
    public final C2199pQ f6603R;

    public C2146oU() {
        super(1);
        this.f6603R = new C2199pQ();
    }

    /* renamed from: nB */
    public static C2146oU m3764nB() {
        if (f6602w != null) {
            return f6602w;
        }
        synchronized (C2146oU.class) {
            if (f6602w == null) {
                f6602w = new C2146oU();
            }
        }
        return f6602w;
    }

    /* renamed from: O4 */
    public final void m3765O4(Runnable runnable) {
        this.f6603R.m3829nB(runnable);
    }

    /* renamed from: d3 */
    public final boolean m3766d3() {
        return this.f6603R.m3828d3();
    }

    /* renamed from: yF */
    public final void m3767yF(Runnable runnable) {
        this.f6603R.m3830yF(runnable);
    }
}
