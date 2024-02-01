package p000a;

import java.util.concurrent.CancellationException;

/* renamed from: a.AM */
/* loaded from: classes.dex */
public final class C0020AM extends CancellationException {

    /* renamed from: S */
    public final transient InterfaceC1265Xh f127S;

    public C0020AM(String str, Throwable th, InterfaceC1265Xh interfaceC1265Xh) {
        super(str);
        this.f127S = interfaceC1265Xh;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0020AM) {
                C0020AM c0020am = (C0020AM) obj;
                if (!AbstractC1292YB.m2695u(c0020am.getMessage(), getMessage()) || !AbstractC1292YB.m2695u(c0020am.f127S, this.f127S) || !AbstractC1292YB.m2695u(c0020am.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int hashCode = (this.f127S.hashCode() + (getMessage().hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f127S;
    }
}
