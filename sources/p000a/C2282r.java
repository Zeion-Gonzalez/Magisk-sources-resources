package p000a;

import java.util.Arrays;

/* renamed from: a.r */
/* loaded from: classes.dex */
public final class C2282r {

    /* renamed from: h */
    public final byte[] f7036h;

    /* renamed from: z */
    public final int f7037z;

    public C2282r(byte[] bArr) {
        this.f7037z = AbstractC0438II.m1023c(bArr);
        this.f7036h = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2282r) {
            return Arrays.equals(this.f7036h, ((C2282r) obj).f7036h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7037z;
    }
}
