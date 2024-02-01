package p000a;

import java.io.IOException;
import java.security.cert.CertificateParsingException;

/* renamed from: a.jX */
/* loaded from: classes.dex */
public final class C1887jX extends CertificateParsingException {

    /* renamed from: S */
    public final Throwable f5899S;

    public C1887jX(String str, IOException iOException) {
        super(str);
        this.f5899S = iOException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f5899S;
    }
}
