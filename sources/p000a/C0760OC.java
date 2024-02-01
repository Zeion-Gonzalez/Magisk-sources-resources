package p000a;

/* renamed from: a.OC */
/* loaded from: classes.dex */
public class C0760OC implements Iterable, InterfaceC1564dP {

    /* renamed from: R */
    public final int f2576R;

    /* renamed from: S */
    public final int f2577S;

    /* renamed from: w */
    public final int f2578w;

    public C0760OC(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f2577S = i;
        this.f2576R = AbstractC1292YB.m2679j(i, i2, i3);
        this.f2578w = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0760OC) {
            if (!isEmpty() || !((C0760OC) obj).isEmpty()) {
                C0760OC c0760oc = (C0760OC) obj;
                if (this.f2577S != c0760oc.f2577S || this.f2576R != c0760oc.f2576R || this.f2578w != c0760oc.f2578w) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    /* renamed from: h */
    public final C2482un iterator() {
        return new C2482un(this.f2577S, this.f2576R, this.f2578w);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f2577S * 31) + this.f2576R) * 31) + this.f2578w;
    }

    public boolean isEmpty() {
        int i = this.f2578w;
        int i2 = this.f2576R;
        int i3 = this.f2577S;
        if (i > 0) {
            if (i3 > i2) {
                return true;
            }
        } else if (i3 < i2) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f2576R;
        int i2 = this.f2577S;
        int i3 = this.f2578w;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
