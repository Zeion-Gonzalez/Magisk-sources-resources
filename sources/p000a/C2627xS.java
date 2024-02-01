package p000a;

/* renamed from: a.xS */
/* loaded from: classes.dex */
public final class C2627xS {

    /* renamed from: z */
    public final C2210pd f8148z;

    public C2627xS(C2210pd c2210pd) {
        this.f8148z = c2210pd;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2627xS) {
            return this.f8148z.f6796z.toString().equals(((C2627xS) obj).f8148z.f6796z.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f8148z.f6796z.hashCode();
    }

    /* renamed from: z */
    public final String m4525z() {
        C2210pd c2210pd = this.f8148z;
        String sb = c2210pd.f6796z.toString();
        StringBuilder sb2 = c2210pd.f6790V;
        if (sb2 == null || sb2.toString().equals("")) {
            return sb;
        }
        return c2210pd.f6790V.toString() + "/" + sb;
    }

    public C2627xS(byte[] bArr) {
        C2210pd c2210pd = new C2210pd();
        this.f8148z = c2210pd;
        c2210pd.f6796z = C2210pd.m3851h(bArr, 0, 100);
        c2210pd.f6792h = (int) AbstractC0438II.m1030j(bArr, 100, 8);
        c2210pd.f6795v = (int) AbstractC0438II.m1030j(bArr, 108, 8);
        c2210pd.f6788P = (int) AbstractC0438II.m1030j(bArr, 116, 8);
        c2210pd.f6787N = AbstractC0438II.m1030j(bArr, 124, 12);
        c2210pd.f6789Q = AbstractC0438II.m1030j(bArr, 136, 12);
        AbstractC0438II.m1030j(bArr, 148, 8);
        c2210pd.f6794u = bArr[156];
        c2210pd.f6793o = C2210pd.m3851h(bArr, 157, 100);
        c2210pd.f6791W = C2210pd.m3851h(bArr, 257, 8);
        c2210pd.f6785G = C2210pd.m3851h(bArr, 265, 32);
        c2210pd.f6786M = C2210pd.m3851h(bArr, 297, 32);
        AbstractC0438II.m1030j(bArr, 329, 8);
        AbstractC0438II.m1030j(bArr, 337, 8);
        c2210pd.f6790V = C2210pd.m3851h(bArr, 345, 155);
    }
}
