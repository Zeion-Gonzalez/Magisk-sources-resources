package p000a;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: a.pl */
/* loaded from: classes.dex */
public final class C2216pl {

    /* renamed from: v */
    public static final C2216pl f6824v = new C2216pl(AbstractC2486us.m4278KM(new ArrayList()), null);

    /* renamed from: h */
    public final AbstractC0438II f6825h;

    /* renamed from: z */
    public final Set f6826z;

    public C2216pl(Set set, AbstractC0438II abstractC0438II) {
        this.f6826z = set;
        this.f6825h = abstractC0438II;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2216pl) {
            C2216pl c2216pl = (C2216pl) obj;
            if (AbstractC1292YB.m2695u(c2216pl.f6826z, this.f6826z) && AbstractC1292YB.m2695u(c2216pl.f6825h, this.f6825h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f6826z.hashCode() + 1517) * 41;
        AbstractC0438II abstractC0438II = this.f6825h;
        return hashCode + (abstractC0438II != null ? abstractC0438II.hashCode() : 0);
    }

    /* renamed from: z */
    public final C2216pl m3856z(AbstractC0438II abstractC0438II) {
        return AbstractC1292YB.m2695u(this.f6825h, abstractC0438II) ? this : new C2216pl(this.f6826z, abstractC0438II);
    }
}
