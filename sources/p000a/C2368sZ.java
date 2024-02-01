package p000a;

/* renamed from: a.sZ */
/* loaded from: classes.dex */
public final class C2368sZ {

    /* renamed from: G */
    public C1429ap f7274G;

    /* renamed from: M */
    public long f7275M;

    /* renamed from: N */
    public C2254qS f7276N;

    /* renamed from: P */
    public String f7277P;

    /* renamed from: Q */
    public C1571dY f7278Q;

    /* renamed from: S */
    public C0998Si f7279S;

    /* renamed from: V */
    public long f7280V;

    /* renamed from: W */
    public C1429ap f7281W;

    /* renamed from: h */
    public EnumC1854ix f7282h;

    /* renamed from: o */
    public C1429ap f7283o;

    /* renamed from: u */
    public AbstractC1449bB f7284u;

    /* renamed from: v */
    public int f7285v;

    /* renamed from: z */
    public C1364ZX f7286z;

    public C2368sZ() {
        this.f7285v = -1;
        this.f7278Q = new C1571dY();
    }

    /* renamed from: h */
    public static void m4093h(String str, C1429ap c1429ap) {
        if (c1429ap != null) {
            if (!(c1429ap.f4471g == null)) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (!(c1429ap.f4477y == null)) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (!(c1429ap.f4475s == null)) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (!(c1429ap.f4468U == null)) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    /* renamed from: z */
    public final C1429ap m4094z() {
        int i = this.f7285v;
        if (i >= 0) {
            C1364ZX c1364zx = this.f7286z;
            if (c1364zx == null) {
                throw new IllegalStateException("request == null".toString());
            }
            EnumC1854ix enumC1854ix = this.f7282h;
            if (enumC1854ix == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f7277P;
            if (str != null) {
                return new C1429ap(c1364zx, enumC1854ix, str, i, this.f7276N, this.f7278Q.m3040P(), this.f7284u, this.f7283o, this.f7281W, this.f7274G, this.f7275M, this.f7280V, this.f7279S);
            }
            throw new IllegalStateException("message == null".toString());
        }
        throw new IllegalStateException(("code < 0: " + this.f7285v).toString());
    }

    public C2368sZ(C1429ap c1429ap) {
        this.f7286z = c1429ap.f4467S;
        this.f7282h = c1429ap.f4466R;
        this.f7285v = c1429ap.f4465I;
        this.f7277P = c1429ap.f4476w;
        this.f7276N = c1429ap.f4473q;
        this.f7278Q = c1429ap.f4472k.m2895P();
        this.f7284u = c1429ap.f4471g;
        this.f7283o = c1429ap.f4477y;
        this.f7281W = c1429ap.f4475s;
        this.f7274G = c1429ap.f4468U;
        this.f7275M = c1429ap.f4464E;
        this.f7280V = c1429ap.f4470f;
        this.f7279S = c1429ap.f4474r;
    }
}
