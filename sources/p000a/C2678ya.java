package p000a;

import java.util.RandomAccess;

/* renamed from: a.ya */
/* loaded from: classes.dex */
public final class C2678ya extends AbstractC0386HL implements RandomAccess {

    /* renamed from: R */
    public final int[] f8357R;

    /* renamed from: S */
    public final C1623eY[] f8358S;

    public C2678ya(C1623eY[] c1623eYArr, int[] iArr) {
        this.f8358S = c1623eYArr;
        this.f8357R = iArr;
    }

    @Override // p000a.AbstractC0530K, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C1623eY)) {
            return false;
        }
        return super.contains((C1623eY) obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f8358S[i];
    }

    @Override // p000a.AbstractC0530K
    /* renamed from: h */
    public final int mo26h() {
        return this.f8358S.length;
    }

    @Override // p000a.AbstractC0386HL, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C1623eY)) {
            return -1;
        }
        return super.indexOf((C1623eY) obj);
    }

    @Override // p000a.AbstractC0386HL, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C1623eY)) {
            return -1;
        }
        return super.lastIndexOf((C1623eY) obj);
    }
}
