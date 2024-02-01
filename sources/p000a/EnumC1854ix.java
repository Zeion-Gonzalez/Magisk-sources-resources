package p000a;

/* renamed from: a.ix */
/* loaded from: classes.dex */
public final class EnumC1854ix {

    /* renamed from: S */
    public final String f5785S;

    /* renamed from: R */
    public static final EnumC1854ix f5780R = new EnumC1854ix(0, "HTTP_1_0", "http/1.0");

    /* renamed from: w */
    public static final EnumC1854ix f5784w = new EnumC1854ix(1, "HTTP_1_1", "http/1.1");

    /* renamed from: I */
    public static final EnumC1854ix f5779I = new EnumC1854ix(2, "SPDY_3", "spdy/3.1");

    /* renamed from: q */
    public static final EnumC1854ix f5783q = new EnumC1854ix(3, "HTTP_2", "h2");

    /* renamed from: k */
    public static final EnumC1854ix f5782k = new EnumC1854ix(4, "H2_PRIOR_KNOWLEDGE", "h2_prior_knowledge");

    /* renamed from: g */
    public static final EnumC1854ix f5781g = new EnumC1854ix(5, "QUIC", "quic");

    public EnumC1854ix(int i, String str, String str2) {
        super(str, i);
        this.f5785S = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5785S;
    }
}
