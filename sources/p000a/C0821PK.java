package p000a;

import java.util.Map;

/* renamed from: a.PK */
/* loaded from: classes.dex */
public final class C0821PK implements Map.Entry {

    /* renamed from: I */
    public C0821PK f2783I;

    /* renamed from: R */
    public C0821PK f2784R;

    /* renamed from: S */
    public C0821PK f2785S;

    /* renamed from: g */
    public final int f2786g;

    /* renamed from: k */
    public final Object f2787k;

    /* renamed from: q */
    public C0821PK f2788q;

    /* renamed from: s */
    public int f2789s;

    /* renamed from: w */
    public C0821PK f2790w;

    /* renamed from: y */
    public Object f2791y;

    public C0821PK() {
        this.f2787k = null;
        this.f2786g = -1;
        this.f2788q = this;
        this.f2783I = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f2787k;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f2791y;
        Object value = entry.getValue();
        if (obj3 == null) {
            if (value != null) {
                return false;
            }
        } else if (!obj3.equals(value)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2787k;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2791y;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f2787k;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f2791y;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f2791y;
        this.f2791y = obj;
        return obj2;
    }

    public final String toString() {
        return this.f2787k + "=" + this.f2791y;
    }

    public C0821PK(C0821PK c0821pk, Object obj, int i, C0821PK c0821pk2, C0821PK c0821pk3) {
        this.f2785S = c0821pk;
        this.f2787k = obj;
        this.f2786g = i;
        this.f2789s = 1;
        this.f2783I = c0821pk2;
        this.f2788q = c0821pk3;
        c0821pk3.f2783I = this;
        c0821pk2.f2788q = this;
    }
}
