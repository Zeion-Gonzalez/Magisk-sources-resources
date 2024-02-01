package p000a;

/* renamed from: a.H */
/* loaded from: classes.dex */
public final class C0367H extends IllegalStateException {

    /* renamed from: S */
    public final Throwable f1267S;

    public /* synthetic */ C0367H(int i, String str, Exception exc) {
        super(str);
        this.f1267S = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f1267S;
    }

    public C0367H(String str) {
        super(str);
    }
}
