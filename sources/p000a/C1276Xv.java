package p000a;

/* renamed from: a.Xv */
/* loaded from: classes.dex */
public final class C1276Xv implements Cloneable {

    /* renamed from: q */
    public static final Object f4099q = new Object();

    /* renamed from: I */
    public int f4100I;

    /* renamed from: R */
    public long[] f4101R;

    /* renamed from: S */
    public boolean f4102S = false;

    /* renamed from: w */
    public Object[] f4103w;

    public C1276Xv() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.f4101R = new long[i4];
        this.f4103w = new Object[i4];
    }

    /* renamed from: N */
    public final void m2600N() {
        int i = this.f4100I;
        long[] jArr = this.f4101R;
        Object[] objArr = this.f4103w;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f4099q) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f4102S = false;
        this.f4100I = i2;
    }

    /* renamed from: P */
    public final C1276Xv clone() {
        try {
            C1276Xv c1276Xv = (C1276Xv) super.clone();
            c1276Xv.f4101R = (long[]) this.f4101R.clone();
            c1276Xv.f4103w = (Object[]) this.f4103w.clone();
            return c1276Xv;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: Q */
    public final Object m2602Q(long j, Long l) {
        Object obj;
        int m1015V = AbstractC0438II.m1015V(this.f4101R, this.f4100I, j);
        return (m1015V < 0 || (obj = this.f4103w[m1015V]) == f4099q) ? l : obj;
    }

    /* renamed from: o */
    public final Object m2603o(int i) {
        if (this.f4102S) {
            m2600N();
        }
        return this.f4103w[i];
    }

    public final String toString() {
        if (this.f4102S) {
            m2600N();
        }
        int i = this.f4100I;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f4100I; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f4102S) {
                m2600N();
            }
            sb.append(this.f4101R[i2]);
            sb.append('=');
            Object m2603o = m2603o(i2);
            if (m2603o != this) {
                sb.append(m2603o);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final void m2604u(long j, Object obj) {
        int m1015V = AbstractC0438II.m1015V(this.f4101R, this.f4100I, j);
        if (m1015V >= 0) {
            this.f4103w[m1015V] = obj;
            return;
        }
        int i = ~m1015V;
        int i2 = this.f4100I;
        if (i < i2) {
            Object[] objArr = this.f4103w;
            if (objArr[i] == f4099q) {
                this.f4101R[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f4102S && i2 >= this.f4101R.length) {
            m2600N();
            i = ~AbstractC0438II.m1015V(this.f4101R, this.f4100I, j);
        }
        int i3 = this.f4100I;
        if (i3 >= this.f4101R.length) {
            int i4 = (i3 + 1) * 8;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.f4101R;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f4103w;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f4101R = jArr;
            this.f4103w = objArr2;
        }
        int i8 = this.f4100I - i;
        if (i8 != 0) {
            long[] jArr3 = this.f4101R;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f4103w;
            System.arraycopy(objArr4, i, objArr4, i9, this.f4100I - i);
        }
        this.f4101R[i] = j;
        this.f4103w[i] = obj;
        this.f4100I++;
    }

    /* renamed from: v */
    public final void m2605v() {
        int i = this.f4100I;
        Object[] objArr = this.f4103w;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f4100I = 0;
        this.f4102S = false;
    }

    /* renamed from: z */
    public final void m2606z(long j, Long l) {
        int i = this.f4100I;
        if (i != 0 && j <= this.f4101R[i - 1]) {
            m2604u(j, l);
            return;
        }
        if (this.f4102S && i >= this.f4101R.length) {
            m2600N();
        }
        int i2 = this.f4100I;
        if (i2 >= this.f4101R.length) {
            int i3 = (i2 + 1) * 8;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 8;
            long[] jArr = new long[i6];
            Object[] objArr = new Object[i6];
            long[] jArr2 = this.f4101R;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f4103w;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f4101R = jArr;
            this.f4103w = objArr;
        }
        this.f4101R[i2] = j;
        this.f4103w[i2] = l;
        this.f4100I = i2 + 1;
    }
}
