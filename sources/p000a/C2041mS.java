package p000a;

/* renamed from: a.mS */
/* loaded from: classes.dex */
public final class C2041mS extends AbstractC2084nF {

    /* renamed from: S */
    public final StringBuilder f6361S = new StringBuilder();

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        boolean z;
        String str = (String) obj;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sb = this.f6361S;
            sb.append(str);
            sb.append('\n');
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return super.contains((String) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return "";
    }

    @Override // p000a.AbstractC2084nF
    /* renamed from: h */
    public final int mo1150h() {
        return 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.indexOf((String) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.lastIndexOf((String) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return super.remove((String) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        return "";
    }

    @Override // p000a.AbstractC2084nF
    /* renamed from: v */
    public final /* bridge */ /* synthetic */ Object mo1152v(int i) {
        return "";
    }
}
