package p000a;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.Random;

/* renamed from: a.tl */
/* loaded from: classes.dex */
public final class C2429tl extends AbstractC1096UZ implements Serializable {

    /* renamed from: w */
    public final Random f7449w;

    public C2429tl(SecureRandom secureRandom) {
        this.f7449w = secureRandom;
    }

    @Override // p000a.AbstractC1096UZ
    /* renamed from: h */
    public final Random mo2001h() {
        return this.f7449w;
    }
}
