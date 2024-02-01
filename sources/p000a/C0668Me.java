package p000a;

/* renamed from: a.Me */
/* loaded from: classes.dex */
public final class C0668Me {

    /* renamed from: N */
    public static final C1623eY f2175N;

    /* renamed from: P */
    public static final C1623eY f2176P;

    /* renamed from: Q */
    public static final C1623eY f2177Q;

    /* renamed from: W */
    public static final C1623eY f2178W;

    /* renamed from: o */
    public static final C1623eY f2179o;

    /* renamed from: u */
    public static final C1623eY f2180u;

    /* renamed from: h */
    public final C1623eY f2181h;

    /* renamed from: v */
    public final int f2182v;

    /* renamed from: z */
    public final C1623eY f2183z;

    static {
        C1623eY c1623eY = C1623eY.f5009I;
        f2176P = C2252qQ.m3884M(":");
        f2175N = C2252qQ.m3884M(":status");
        f2177Q = C2252qQ.m3884M(":method");
        f2180u = C2252qQ.m3884M(":path");
        f2179o = C2252qQ.m3884M(":scheme");
        f2178W = C2252qQ.m3884M(":authority");
    }

    public C0668Me(C1623eY c1623eY, C1623eY c1623eY2) {
        this.f2183z = c1623eY;
        this.f2181h = c1623eY2;
        this.f2182v = c1623eY2.mo1980P() + c1623eY.mo1980P() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0668Me)) {
            return false;
        }
        C0668Me c0668Me = (C0668Me) obj;
        return AbstractC1292YB.m2695u(this.f2183z, c0668Me.f2183z) && AbstractC1292YB.m2695u(this.f2181h, c0668Me.f2181h);
    }

    public final int hashCode() {
        return this.f2181h.hashCode() + (this.f2183z.hashCode() * 31);
    }

    public final String toString() {
        return this.f2183z.m3077M() + ": " + this.f2181h.m3077M();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0668Me(String str, C1623eY c1623eY) {
        this(c1623eY, C2252qQ.m3884M(str));
        C1623eY c1623eY2 = C1623eY.f5009I;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0668Me(String str, String str2) {
        this(C2252qQ.m3884M(str), C2252qQ.m3884M(str2));
        C1623eY c1623eY = C1623eY.f5009I;
    }
}
