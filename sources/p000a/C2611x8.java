package p000a;

/* renamed from: a.x8 */
/* loaded from: classes.dex */
public final class C2611x8 extends RuntimeException {

    /* renamed from: S */
    public final Throwable f8077S;

    public C2611x8(String str, Exception exc) {
        super(str);
        this.f8077S = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f8077S;
    }
}
