package p000a;

/* renamed from: a.Te */
/* loaded from: classes.dex */
public final class C1048Te implements Comparable {

    /* renamed from: I */
    public final String f3468I;

    /* renamed from: R */
    public final int f3469R;

    /* renamed from: S */
    public final int f3470S;

    /* renamed from: w */
    public final String f3471w;

    public C1048Te(int i, int i2, String str, String str2) {
        this.f3470S = i;
        this.f3469R = i2;
        this.f3471w = str;
        this.f3468I = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1048Te c1048Te = (C1048Te) obj;
        int i = this.f3470S - c1048Te.f3470S;
        if (i == 0) {
            return this.f3469R - c1048Te.f3469R;
        }
        return i;
    }
}
