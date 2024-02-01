package p000a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: a.to */
/* loaded from: classes.dex */
public final class C2431to {

    /* renamed from: P */
    public final List f7450P;

    /* renamed from: h */
    public final boolean f7451h;

    /* renamed from: v */
    public final List f7452v;

    /* renamed from: z */
    public final String f7453z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public C2431to(String str, boolean z, List list, List list2) {
        this.f7453z = str;
        this.f7451h = z;
        this.f7452v = list;
        this.f7450P = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.f7450P = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2431to)) {
            return false;
        }
        C2431to c2431to = (C2431to) obj;
        if (this.f7451h != c2431to.f7451h || !AbstractC1292YB.m2695u(this.f7452v, c2431to.f7452v) || !AbstractC1292YB.m2695u(this.f7450P, c2431to.f7450P)) {
            return false;
        }
        String str = this.f7453z;
        boolean startsWith = str.startsWith("index_");
        String str2 = c2431to.f7453z;
        if (startsWith) {
            return str2.startsWith("index_");
        }
        return AbstractC1292YB.m2695u(str, str2);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f7453z;
        if (str.startsWith("index_")) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return this.f7450P.hashCode() + ((this.f7452v.hashCode() + (((hashCode * 31) + (this.f7451h ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f7453z + "', unique=" + this.f7451h + ", columns=" + this.f7452v + ", orders=" + this.f7450P + "'}";
    }
}
