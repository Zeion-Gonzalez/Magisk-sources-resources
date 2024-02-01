package p000a;

import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;

/* renamed from: a.oW */
/* loaded from: classes.dex */
public final class C2148oW extends CertificateException {

    /* renamed from: S */
    public final Throwable f6605S;

    public C2148oW(String str, NoSuchProviderException noSuchProviderException) {
        super(str);
        this.f6605S = noSuchProviderException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f6605S;
    }
}
