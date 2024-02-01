package p000a;

/* renamed from: a.ne */
/* loaded from: classes.dex */
public final class C2104ne implements InterfaceC0592L4 {

    /* renamed from: z */
    public final Class f6482z;

    public C2104ne(Class cls) {
        this.f6482z = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2104ne) {
            if (AbstractC1292YB.m2695u(this.f6482z, ((C2104ne) obj).f6482z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6482z.hashCode();
    }

    public final String toString() {
        return this.f6482z.toString() + " (Kotlin reflection is not available)";
    }

    @Override // p000a.InterfaceC0592L4
    /* renamed from: z */
    public final Class mo1318z() {
        return this.f6482z;
    }
}
