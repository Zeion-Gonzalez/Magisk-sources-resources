package p000a;

/* renamed from: a.xM */
/* loaded from: classes.dex */
public final class C2624xM {

    /* renamed from: h */
    public final Object f8140h;

    /* renamed from: z */
    public final Object f8141z;

    public C2624xM(Object obj, Object obj2) {
        this.f8141z = obj;
        this.f8140h = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2624xM.class != obj.getClass()) {
            return false;
        }
        C2624xM c2624xM = (C2624xM) obj;
        Object obj2 = c2624xM.f8141z;
        Object obj3 = this.f8141z;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
        } else if (!obj3.equals(obj2)) {
            return false;
        }
        Object obj4 = c2624xM.f8140h;
        Object obj5 = this.f8140h;
        return obj5 == null ? obj4 == null : obj5.equals(obj4);
    }

    public final int hashCode() {
        Object obj = this.f8141z;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + 31) * 31;
        Object obj2 = this.f8140h;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
