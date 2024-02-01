package p000a;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* renamed from: a.x1 */
/* loaded from: classes.dex */
public final class C2604x1 {

    /* renamed from: P */
    public final Set f8023P;

    /* renamed from: h */
    public final Map f8024h;

    /* renamed from: v */
    public final Set f8025v;

    /* renamed from: z */
    public final String f8026z = "logs";

    public C2604x1(Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        this.f8024h = map;
        this.f8025v = abstractSet;
        this.f8023P = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2604x1)) {
            return false;
        }
        C2604x1 c2604x1 = (C2604x1) obj;
        if (!AbstractC1292YB.m2695u(this.f8026z, c2604x1.f8026z) || !AbstractC1292YB.m2695u(this.f8024h, c2604x1.f8024h) || !AbstractC1292YB.m2695u(this.f8025v, c2604x1.f8025v)) {
            return false;
        }
        Set set2 = this.f8023P;
        if (set2 == null || (set = c2604x1.f8023P) == null) {
            return true;
        }
        return AbstractC1292YB.m2695u(set2, set);
    }

    public final int hashCode() {
        return this.f8025v.hashCode() + ((this.f8024h.hashCode() + (this.f8026z.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f8026z + "', columns=" + this.f8024h + ", foreignKeys=" + this.f8025v + ", indices=" + this.f8023P + '}';
    }
}
