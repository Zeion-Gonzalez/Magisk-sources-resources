package p000a;

/* renamed from: a.U5 */
/* loaded from: classes.dex */
public final class C1071U5 {

    /* renamed from: N */
    public final boolean f3535N;

    /* renamed from: P */
    public final boolean f3536P;

    /* renamed from: h */
    public final String f3537h;

    /* renamed from: v */
    public boolean f3538v;

    /* renamed from: z */
    public final String f3539z;

    public C1071U5(String str, String str2, boolean z) {
        this.f3539z = str;
        this.f3537h = str2;
        this.f3538v = z;
        this.f3536P = AbstractC1292YB.m2695u(str2, "isolated");
        this.f3535N = str.endsWith("_zygote");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1071U5)) {
            return false;
        }
        C1071U5 c1071u5 = (C1071U5) obj;
        return AbstractC1292YB.m2695u(this.f3539z, c1071u5.f3539z) && AbstractC1292YB.m2695u(this.f3537h, c1071u5.f3537h) && this.f3538v == c1071u5.f3538v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.f3537h.hashCode() + (this.f3539z.hashCode() * 31)) * 31;
        boolean z = this.f3538v;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ProcessInfo(name=" + this.f3539z + ", packageName=" + this.f3537h + ", isEnabled=" + this.f3538v + ")";
    }
}
