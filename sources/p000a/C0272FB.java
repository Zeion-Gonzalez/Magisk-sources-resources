package p000a;

/* renamed from: a.FB */
/* loaded from: classes.dex */
public final class C0272FB extends RuntimeException {

    /* renamed from: S */
    public final transient InterfaceC1255XS f954S;

    public C0272FB(InterfaceC1255XS interfaceC1255XS) {
        this.f954S = interfaceC1255XS;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f954S.toString();
    }
}
