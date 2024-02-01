package p000a;

/* renamed from: a.H6 */
/* loaded from: classes.dex */
public final class C0372H6 {

    /* renamed from: h */
    public final InterfaceC2364sT f1274h;

    /* renamed from: z */
    public final Object f1275z;

    public C0372H6(Object obj, InterfaceC2364sT interfaceC2364sT) {
        this.f1275z = obj;
        this.f1274h = interfaceC2364sT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0372H6)) {
            return false;
        }
        C0372H6 c0372h6 = (C0372H6) obj;
        return AbstractC1292YB.m2695u(this.f1275z, c0372h6.f1275z) && AbstractC1292YB.m2695u(this.f1274h, c0372h6.f1274h);
    }

    public final int hashCode() {
        Object obj = this.f1275z;
        return this.f1274h.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f1275z + ", onCancellation=" + this.f1274h + ')';
    }
}
