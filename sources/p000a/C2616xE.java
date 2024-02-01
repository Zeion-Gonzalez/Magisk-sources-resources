package p000a;

/* renamed from: a.xE */
/* loaded from: classes.dex */
public final class C2616xE implements Cloneable {

    /* renamed from: q */
    public static final Object f8089q = new Object();

    /* renamed from: I */
    public int f8090I;

    /* renamed from: R */
    public int[] f8091R;

    /* renamed from: S */
    public boolean f8092S = false;

    /* renamed from: w */
    public Object[] f8093w;

    public C2616xE() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f8091R = new int[i4];
        this.f8093w = new Object[i4];
    }

    /* renamed from: N */
    public final Object m4502N(int i, Integer num) {
        Object obj;
        int m1004M = AbstractC0438II.m1004M(this.f8090I, i, this.f8091R);
        return (m1004M < 0 || (obj = this.f8093w[m1004M]) == f8089q) ? num : obj;
    }

    /* renamed from: P */
    public final void m4503P() {
        int i = this.f8090I;
        int[] iArr = this.f8091R;
        Object[] objArr = this.f8093w;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f8089q) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f8092S = false;
        this.f8090I = i2;
    }

    /* renamed from: Q */
    public final int m4504Q(int i) {
        if (this.f8092S) {
            m4503P();
        }
        return this.f8091R[i];
    }

    /* renamed from: W */
    public final Object m4505W(int i) {
        if (this.f8092S) {
            m4503P();
        }
        return this.f8093w[i];
    }

    /* renamed from: o */
    public final int m4506o() {
        if (this.f8092S) {
            m4503P();
        }
        return this.f8090I;
    }

    public final String toString() {
        if (m4506o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8090I * 28);
        sb.append('{');
        for (int i = 0; i < this.f8090I; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m4504Q(i));
            sb.append('=');
            Object m4505W = m4505W(i);
            if (m4505W != this) {
                sb.append(m4505W);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final void m4507u(int i, Object obj) {
        int m1004M = AbstractC0438II.m1004M(this.f8090I, i, this.f8091R);
        if (m1004M >= 0) {
            this.f8093w[m1004M] = obj;
            return;
        }
        int i2 = ~m1004M;
        int i3 = this.f8090I;
        if (i2 < i3) {
            Object[] objArr = this.f8093w;
            if (objArr[i2] == f8089q) {
                this.f8091R[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f8092S && i3 >= this.f8091R.length) {
            m4503P();
            i2 = ~AbstractC0438II.m1004M(this.f8090I, i, this.f8091R);
        }
        int i4 = this.f8090I;
        if (i4 >= this.f8091R.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.f8091R;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f8093w;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f8091R = iArr;
            this.f8093w = objArr2;
        }
        int i9 = this.f8090I - i2;
        if (i9 != 0) {
            int[] iArr3 = this.f8091R;
            int i10 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i10, i9);
            Object[] objArr4 = this.f8093w;
            System.arraycopy(objArr4, i2, objArr4, i10, this.f8090I - i2);
        }
        this.f8091R[i2] = i;
        this.f8093w[i2] = obj;
        this.f8090I++;
    }

    /* renamed from: v */
    public final C2616xE clone() {
        try {
            C2616xE c2616xE = (C2616xE) super.clone();
            c2616xE.f8091R = (int[]) this.f8091R.clone();
            c2616xE.f8093w = (Object[]) this.f8093w.clone();
            return c2616xE;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: z */
    public final void m4509z(int i, Object obj) {
        int i2 = this.f8090I;
        if (i2 != 0 && i <= this.f8091R[i2 - 1]) {
            m4507u(i, obj);
            return;
        }
        if (this.f8092S && i2 >= this.f8091R.length) {
            m4503P();
        }
        int i3 = this.f8090I;
        if (i3 >= this.f8091R.length) {
            int i4 = (i3 + 1) * 4;
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
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr = new Object[i7];
            int[] iArr2 = this.f8091R;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f8093w;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f8091R = iArr;
            this.f8093w = objArr;
        }
        this.f8091R[i3] = i;
        this.f8093w[i3] = obj;
        this.f8090I = i3 + 1;
    }
}
