package p000a;

import java.io.IOException;

/* renamed from: a.q */
/* loaded from: classes.dex */
public final class C2228q extends IOException {

    /* renamed from: S */
    public final Throwable f6850S;

    public /* synthetic */ C2228q(int i, String str, RuntimeException runtimeException) {
        super(str);
        this.f6850S = runtimeException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f6850S;
    }

    public C2228q(String str) {
        super(str);
    }
}
