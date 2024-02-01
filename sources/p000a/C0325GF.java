package p000a;

/* renamed from: a.GF */
/* loaded from: classes.dex */
public final class C0325GF extends C0760OC {

    /* renamed from: I */
    public static final C0325GF f1103I = new C0325GF(1, 0);

    public C0325GF(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // p000a.C0760OC
    public final boolean equals(Object obj) {
        if (obj instanceof C0325GF) {
            if (!isEmpty() || !((C0325GF) obj).isEmpty()) {
                C0325GF c0325gf = (C0325GF) obj;
                if (this.f2577S == c0325gf.f2577S) {
                    if (this.f2576R == c0325gf.f2576R) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p000a.C0760OC
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2577S * 31) + this.f2576R;
    }

    @Override // p000a.C0760OC
    public final boolean isEmpty() {
        return this.f2577S > this.f2576R;
    }

    @Override // p000a.C0760OC
    public final String toString() {
        return this.f2577S + ".." + this.f2576R;
    }
}
