package p000a;

import java.util.Map;

/* renamed from: a.KE */
/* loaded from: classes.dex */
public final class C0543KE {

    /* renamed from: z */
    public final String f1795z;

    public C0543KE(String str) {
        this.f1795z = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0543KE.class != obj.getClass()) {
            return false;
        }
        return this.f1795z.equals(((C0543KE) obj).f1795z);
    }

    /* renamed from: h */
    public final void m1254h(C2528vZ c2528vZ, Object obj) {
        Map map = c2528vZ.f7742z;
        if (obj == null) {
            map.remove(this);
        } else {
            map.put(this, obj);
        }
    }

    public final int hashCode() {
        return this.f1795z.hashCode();
    }

    public final String toString() {
        return AbstractC2441tz.m4187M(new StringBuilder("Prop{name='"), this.f1795z, "'}");
    }

    /* renamed from: z */
    public final Object m1255z(C2528vZ c2528vZ) {
        Object obj = c2528vZ.f7742z.get(this);
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(this.f1795z);
    }
}
