package p000a;

import java.util.Map;

/* renamed from: a.Jg */
/* loaded from: classes.dex */
public final class C0513Jg implements Map.Entry {

    /* renamed from: I */
    public C0513Jg f1704I;

    /* renamed from: R */
    public final Object f1705R;

    /* renamed from: S */
    public final Object f1706S;

    /* renamed from: w */
    public C0513Jg f1707w;

    public C0513Jg(Object obj, Object obj2) {
        this.f1706S = obj;
        this.f1705R = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0513Jg)) {
            return false;
        }
        C0513Jg c0513Jg = (C0513Jg) obj;
        return this.f1706S.equals(c0513Jg.f1706S) && this.f1705R.equals(c0513Jg.f1705R);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1706S;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1705R;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f1706S.hashCode() ^ this.f1705R.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f1706S + "=" + this.f1705R;
    }
}
