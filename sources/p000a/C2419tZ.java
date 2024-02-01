package p000a;

/* renamed from: a.tZ */
/* loaded from: classes.dex */
public final class C2419tZ {

    /* renamed from: P */
    public final Object f7405P;

    /* renamed from: h */
    public final boolean f7406h;

    /* renamed from: v */
    public final boolean f7407v;

    /* renamed from: z */
    public final AbstractC0929RT f7408z;

    public C2419tZ(AbstractC0929RT abstractC0929RT, boolean z, Object obj, boolean z2) {
        if (!(abstractC0929RT.f3195z || !z)) {
            throw new IllegalArgumentException((abstractC0929RT.mo1954h() + " does not allow nullable values").toString());
        }
        if (!((!z && z2 && obj == null) ? false : true)) {
            throw new IllegalArgumentException(("Argument with type " + abstractC0929RT.mo1954h() + " has null value but is not nullable.").toString());
        }
        this.f7408z = abstractC0929RT;
        this.f7406h = z;
        this.f7405P = obj;
        this.f7407v = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC1292YB.m2695u(C2419tZ.class, obj.getClass())) {
            return false;
        }
        C2419tZ c2419tZ = (C2419tZ) obj;
        if (this.f7406h != c2419tZ.f7406h || this.f7407v != c2419tZ.f7407v || !AbstractC1292YB.m2695u(this.f7408z, c2419tZ.f7408z)) {
            return false;
        }
        Object obj2 = c2419tZ.f7405P;
        Object obj3 = this.f7405P;
        return obj3 != null ? AbstractC1292YB.m2695u(obj3, obj2) : obj2 == null;
    }

    public final int hashCode() {
        int hashCode = ((((this.f7408z.hashCode() * 31) + (this.f7406h ? 1 : 0)) * 31) + (this.f7407v ? 1 : 0)) * 31;
        Object obj = this.f7405P;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C2419tZ.class.getSimpleName());
        sb.append(" Type: " + this.f7408z);
        sb.append(" Nullable: " + this.f7406h);
        if (this.f7407v) {
            sb.append(" DefaultValue: " + this.f7405P);
        }
        return sb.toString();
    }
}
