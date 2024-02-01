package p000a;

/* renamed from: a.g1 */
/* loaded from: classes.dex */
public final class RunnableC1704g1 implements Runnable {

    /* renamed from: S */
    public final /* synthetic */ int f5335S;

    public /* synthetic */ RunnableC1704g1(int i) {
        this.f5335S = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5335S) {
            case AbstractC0795Op.f2698E /* 0 */:
                try {
                    int i = AbstractC2574wV.f7854z;
                    AbstractC1404aL.m2824z("EmojiCompat.EmojiCompatInitializer.run");
                    Object obj = AbstractC2473ua.f7574z;
                    AbstractC1404aL.m2823h();
                    return;
                } catch (Throwable th) {
                    int i2 = AbstractC2574wV.f7854z;
                    AbstractC1404aL.m2823h();
                    throw th;
                }
            default:
                AbstractC0795Op.m1864od(C1212We.f3965u ? "recovery" : "");
                return;
        }
    }
}
