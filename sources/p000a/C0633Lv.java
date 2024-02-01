package p000a;

import java.security.GeneralSecurityException;

/* renamed from: a.Lv */
/* loaded from: classes.dex */
public final class C0633Lv extends Exception {

    /* renamed from: R */
    public final Throwable f2048R;

    /* renamed from: S */
    public final /* synthetic */ int f2049S = 0;

    public C0633Lv(String str, Exception exc) {
        super(str);
        this.f2048R = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        int i = this.f2049S;
        Throwable th = this.f2048R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return (Exception) th;
            default:
                return th;
        }
    }

    public C0633Lv(String str, GeneralSecurityException generalSecurityException) {
        super(str);
        this.f2048R = generalSecurityException;
    }
}
