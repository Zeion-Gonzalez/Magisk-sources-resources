package p000a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: a.pk */
/* loaded from: classes.dex */
public final class C2215pk {

    /* renamed from: N */
    public final List f6819N;

    /* renamed from: P */
    public final List f6820P;

    /* renamed from: h */
    public final String f6821h;

    /* renamed from: v */
    public final String f6822v;

    /* renamed from: z */
    public final String f6823z;

    public C2215pk(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        this.f6823z = str;
        this.f6821h = str2;
        this.f6822v = str3;
        this.f6820P = arrayList;
        this.f6819N = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2215pk)) {
            return false;
        }
        C2215pk c2215pk = (C2215pk) obj;
        if (AbstractC1292YB.m2695u(this.f6823z, c2215pk.f6823z) && AbstractC1292YB.m2695u(this.f6821h, c2215pk.f6821h) && AbstractC1292YB.m2695u(this.f6822v, c2215pk.f6822v) && AbstractC1292YB.m2695u(this.f6820P, c2215pk.f6820P)) {
            return AbstractC1292YB.m2695u(this.f6819N, c2215pk.f6819N);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6819N.hashCode() + ((this.f6820P.hashCode() + ((this.f6822v.hashCode() + ((this.f6821h.hashCode() + (this.f6823z.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f6823z + "', onDelete='" + this.f6821h + " +', onUpdate='" + this.f6822v + "', columnNames=" + this.f6820P + ", referenceColumnNames=" + this.f6819N + '}';
    }
}
