package p000a;

import org.conscrypt.Conscrypt;

/* renamed from: a.wa */
/* loaded from: classes.dex */
public abstract class AbstractC2577wa {
    /* renamed from: h */
    public static boolean m4461h() {
        return C1809i4.f5674P;
    }

    /* renamed from: z */
    public static boolean m4462z() {
        Conscrypt.Version version = Conscrypt.version();
        return version.major() != 2 ? version.major() > 2 : version.minor() != 1 ? version.minor() > 1 : version.patch() >= 0;
    }
}
