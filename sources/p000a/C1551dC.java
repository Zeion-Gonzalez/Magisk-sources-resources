package p000a;

/* renamed from: a.dC */
/* loaded from: classes.dex */
public final class C1551dC extends AbstractRunnableC2453uD {

    /* renamed from: w */
    public final Runnable f4785w;

    public C1551dC(Runnable runnable, long j, C2252qQ c2252qQ) {
        super(j, c2252qQ);
        this.f4785w = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4785w.run();
        } finally {
            this.f7529R.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f4785w;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC2575wW.m4418Y(runnable));
        sb.append(", ");
        sb.append(this.f7530S);
        sb.append(", ");
        sb.append(this.f7529R);
        sb.append(']');
        return sb.toString();
    }
}
