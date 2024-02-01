package p000a;

/* renamed from: a.QK */
/* loaded from: classes.dex */
public final class C0871QK extends RuntimeException {

    /* renamed from: R */
    public final Throwable f2959R;

    /* renamed from: S */
    public final int f2960S;

    public C0871QK(int i, Throwable th) {
        super(th);
        this.f2960S = i;
        this.f2959R = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f2959R;
    }
}
