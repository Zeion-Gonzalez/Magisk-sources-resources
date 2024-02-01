package p000a;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: a.ke */
/* loaded from: classes.dex */
public final class C1946ke {

    /* renamed from: h */
    public final Proxy f6032h;

    /* renamed from: v */
    public final InetSocketAddress f6033v;

    /* renamed from: z */
    public final C2305rO f6034z;

    public C1946ke(C2305rO c2305rO, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.f6034z = c2305rO;
        this.f6032h = proxy;
        this.f6033v = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1946ke) {
            C1946ke c1946ke = (C1946ke) obj;
            if (AbstractC1292YB.m2695u(c1946ke.f6034z, this.f6034z) && AbstractC1292YB.m2695u(c1946ke.f6032h, this.f6032h) && AbstractC1292YB.m2695u(c1946ke.f6033v, this.f6033v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6033v.hashCode() + ((this.f6032h.hashCode() + ((this.f6034z.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f6033v + '}';
    }
}
