package p000a;

import java.lang.reflect.Method;

/* renamed from: a.OW */
/* loaded from: classes.dex */
public final class C0780OW {

    /* renamed from: h */
    public final Method f2639h;

    /* renamed from: z */
    public final int f2640z;

    public C0780OW(int i, Method method) {
        this.f2640z = i;
        this.f2639h = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0780OW)) {
            return false;
        }
        C0780OW c0780ow = (C0780OW) obj;
        return this.f2640z == c0780ow.f2640z && this.f2639h.getName().equals(c0780ow.f2639h.getName());
    }

    public final int hashCode() {
        return this.f2639h.getName().hashCode() + (this.f2640z * 31);
    }
}
