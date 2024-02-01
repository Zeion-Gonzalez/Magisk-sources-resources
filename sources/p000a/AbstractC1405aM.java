package p000a;

import java.io.InputStream;

/* renamed from: a.aM */
/* loaded from: classes.dex */
public abstract class AbstractC1405aM extends InputStream {

    /* renamed from: R */
    public final int f4418R;

    /* renamed from: S */
    public final InputStream f4419S;

    public AbstractC1405aM(InputStream inputStream, int i) {
        this.f4419S = inputStream;
        this.f4418R = i;
    }

    /* renamed from: z */
    public final void m2825z() {
        InputStream inputStream = this.f4419S;
        if (inputStream instanceof C2133oE) {
            C2133oE c2133oE = (C2133oE) inputStream;
            c2133oE.f6574k = true;
            c2133oE.m3757h();
        }
    }
}
