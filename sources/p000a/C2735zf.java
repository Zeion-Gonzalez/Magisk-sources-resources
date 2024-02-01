package p000a;

import java.util.AbstractList;
import java.util.concurrent.Executor;

/* renamed from: a.zf */
/* loaded from: classes.dex */
public final class C2735zf extends AbstractList {

    /* renamed from: w */
    public static final /* synthetic */ int f8580w = 0;

    /* renamed from: R */
    public final /* synthetic */ C2619xH f8581R;

    /* renamed from: S */
    public final Executor f8582S = AbstractC1110Un.f3613h;

    public C2735zf(C2619xH c2619xH) {
        this.f8581R = c2619xH;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: N */
    public final Object set(int i, Object obj) {
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: P */
    public final Object remove(int i) {
        return null;
    }

    /* renamed from: Q */
    public final int m4666Q() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof String;
        }
        if (!z) {
            return false;
        }
        return super.contains((String) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h */
    public final void add(int i, Object obj) {
        this.f8582S.execute(new RunnableC1547d8(this, 12, obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof String;
        }
        if (!z) {
            return -1;
        }
        return super.indexOf((String) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof String;
        }
        if (!z) {
            return -1;
        }
        return super.lastIndexOf((String) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return m4666Q();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v */
    public final Object get(int i) {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof String) {
            return super.remove((String) obj);
        }
        return false;
    }
}
