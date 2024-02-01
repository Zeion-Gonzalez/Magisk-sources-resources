package p000a;

/* renamed from: a.T1 */
/* loaded from: classes.dex */
public final class C1014T1 {

    /* renamed from: h */
    public final int f3391h;

    /* renamed from: v */
    public final String f3392v;

    /* renamed from: z */
    public final EnumC1854ix f3393z;

    public C1014T1(EnumC1854ix enumC1854ix, int i, String str) {
        this.f3393z = enumC1854ix;
        this.f3391h = i;
        this.f3392v = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3393z == EnumC1854ix.f5780R ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f3391h);
        sb.append(' ');
        sb.append(this.f3392v);
        return sb.toString();
    }
}
