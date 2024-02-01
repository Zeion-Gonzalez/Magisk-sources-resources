package p000a;

/* renamed from: a.Hm */
/* loaded from: classes.dex */
public final class C0410Hm {

    /* renamed from: N */
    public final boolean f1382N;

    /* renamed from: P */
    public final boolean f1383P;

    /* renamed from: h */
    public final boolean f1384h;

    /* renamed from: v */
    public final int f1385v;

    /* renamed from: z */
    public final String f1386z;

    public C0410Hm(int i, String str, boolean z) {
        boolean z2;
        this.f1386z = str;
        this.f1384h = z;
        int i2 = -1;
        if (i >= 22000) {
            C1910jw c1910jw = C1910jw.f5967z;
            if (C1910jw.f5958R) {
                i2 = i;
            }
        }
        this.f1385v = i2;
        if (i > 0 && i < 22000) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f1383P = z2;
        this.f1382N = i2 > 0;
    }
}
