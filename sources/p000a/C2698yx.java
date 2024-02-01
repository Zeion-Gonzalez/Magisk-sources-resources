package p000a;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: a.yx */
/* loaded from: classes.dex */
public class C2698yx {

    /* renamed from: I */
    public static Object[] f8511I;

    /* renamed from: g */
    public static int f8512g;

    /* renamed from: k */
    public static Object[] f8513k;

    /* renamed from: q */
    public static int f8514q;

    /* renamed from: R */
    public Object[] f8515R;

    /* renamed from: S */
    public int[] f8516S;

    /* renamed from: w */
    public int f8517w;

    public C2698yx() {
        this.f8516S = AbstractC0438II.f1455R;
        this.f8515R = AbstractC0438II.f1466w;
        this.f8517w = 0;
    }

    /* renamed from: v */
    public static void m4618v(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C2698yx.class) {
                if (f8512g < 10) {
                    objArr[0] = f8513k;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f8513k = objArr;
                    f8512g++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C2698yx.class) {
                if (f8514q < 10) {
                    objArr[0] = f8511I;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f8511I = objArr;
                    f8514q++;
                }
            }
        }
    }

    /* renamed from: z */
    private void m4619z(int i) {
        if (i == 8) {
            synchronized (C2698yx.class) {
                Object[] objArr = f8513k;
                if (objArr != null) {
                    this.f8515R = objArr;
                    f8513k = (Object[]) objArr[0];
                    this.f8516S = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f8512g--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C2698yx.class) {
                Object[] objArr2 = f8511I;
                if (objArr2 != null) {
                    this.f8515R = objArr2;
                    f8511I = (Object[]) objArr2[0];
                    this.f8516S = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f8514q--;
                    return;
                }
            }
        }
        this.f8516S = new int[i];
        this.f8515R = new Object[i << 1];
    }

    /* renamed from: G */
    public final Object m4620G(int i) {
        return this.f8515R[(i << 1) + 1];
    }

    /* renamed from: N */
    public final int m4621N(Object obj) {
        return obj == null ? m4623Q() : m4622P(obj.hashCode(), obj);
    }

    /* renamed from: P */
    public final int m4622P(int i, Object obj) {
        int i2 = this.f8517w;
        if (i2 == 0) {
            return -1;
        }
        try {
            int m1004M = AbstractC0438II.m1004M(i2, i, this.f8516S);
            if (m1004M < 0) {
                return m1004M;
            }
            if (obj.equals(this.f8515R[m1004M << 1])) {
                return m1004M;
            }
            int i3 = m1004M + 1;
            while (i3 < i2 && this.f8516S[i3] == i) {
                if (obj.equals(this.f8515R[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m1004M - 1; i4 >= 0 && this.f8516S[i4] == i; i4--) {
                if (obj.equals(this.f8515R[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: Q */
    public final int m4623Q() {
        int i = this.f8517w;
        if (i == 0) {
            return -1;
        }
        try {
            int m1004M = AbstractC0438II.m1004M(i, 0, this.f8516S);
            if (m1004M < 0) {
                return m1004M;
            }
            if (this.f8515R[m1004M << 1] == null) {
                return m1004M;
            }
            int i2 = m1004M + 1;
            while (i2 < i && this.f8516S[i2] == 0) {
                if (this.f8515R[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m1004M - 1; i3 >= 0 && this.f8516S[i3] == 0; i3--) {
                if (this.f8515R[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: W */
    public final Object m4624W(int i) {
        Object[] objArr = this.f8515R;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.f8517w;
        int i4 = 0;
        if (i3 <= 1) {
            m4618v(this.f8516S, objArr, i3);
            this.f8516S = AbstractC0438II.f1455R;
            this.f8515R = AbstractC0438II.f1466w;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f8516S;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f8515R;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f8515R;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                m4619z(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f8517w) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f8516S, 0, i);
                    System.arraycopy(objArr, 0, this.f8515R, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f8516S, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f8515R, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f8517w) {
            throw new ConcurrentModificationException();
        }
        this.f8517w = i4;
        return obj;
    }

    public final void clear() {
        int i = this.f8517w;
        if (i > 0) {
            int[] iArr = this.f8516S;
            Object[] objArr = this.f8515R;
            this.f8516S = AbstractC0438II.f1455R;
            this.f8515R = AbstractC0438II.f1466w;
            this.f8517w = 0;
            m4618v(iArr, objArr, i);
        }
        if (this.f8517w > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return m4621N(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return m4627u(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2698yx) {
            C2698yx c2698yx = (C2698yx) obj;
            if (this.f8517w != c2698yx.f8517w) {
                return false;
            }
            for (int i = 0; i < this.f8517w; i++) {
                try {
                    Object m4626o = m4626o(i);
                    Object m4620G = m4620G(i);
                    Object orDefault = c2698yx.getOrDefault(m4626o, null);
                    if (m4620G == null) {
                        if (orDefault != null || !c2698yx.containsKey(m4626o)) {
                            return false;
                        }
                    } else if (!m4620G.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f8517w != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f8517w; i2++) {
                try {
                    Object m4626o2 = m4626o(i2);
                    Object m4620G2 = m4620G(i2);
                    Object obj2 = map.get(m4626o2);
                    if (m4620G2 == null) {
                        if (obj2 != null || !map.containsKey(m4626o2)) {
                            return false;
                        }
                    } else if (!m4620G2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int m4621N = m4621N(obj);
        return m4621N >= 0 ? this.f8515R[(m4621N << 1) + 1] : obj2;
    }

    /* renamed from: h */
    public final void m4625h(int i) {
        int i2 = this.f8517w;
        int[] iArr = this.f8516S;
        if (iArr.length < i) {
            Object[] objArr = this.f8515R;
            m4619z(i);
            if (this.f8517w > 0) {
                System.arraycopy(iArr, 0, this.f8516S, 0, i2);
                System.arraycopy(objArr, 0, this.f8515R, 0, i2 << 1);
            }
            m4618v(iArr, objArr, i2);
        }
        if (this.f8517w != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final int hashCode() {
        int[] iArr = this.f8516S;
        Object[] objArr = this.f8515R;
        int i = this.f8517w;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final boolean isEmpty() {
        return this.f8517w <= 0;
    }

    /* renamed from: o */
    public final Object m4626o(int i) {
        return this.f8515R[i << 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int m4622P;
        int i2 = this.f8517w;
        if (obj == null) {
            m4622P = m4623Q();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            m4622P = m4622P(hashCode, obj);
        }
        if (m4622P >= 0) {
            int i3 = (m4622P << 1) + 1;
            Object[] objArr = this.f8515R;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~m4622P;
        int[] iArr = this.f8516S;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.f8515R;
            m4619z(i5);
            if (i2 != this.f8517w) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f8516S;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f8515R, 0, objArr2.length);
            }
            m4618v(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f8516S;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f8515R;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f8517w - i4) << 1);
        }
        int i7 = this.f8517w;
        if (i2 == i7) {
            int[] iArr4 = this.f8516S;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f8515R;
                int i8 = i4 << 1;
                objArr4[i8] = obj;
                objArr4[i8 + 1] = obj2;
                this.f8517w = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        if (orDefault == null) {
            return put(obj, obj2);
        }
        return orDefault;
    }

    public final Object remove(Object obj) {
        int m4621N = m4621N(obj);
        if (m4621N >= 0) {
            return m4624W(m4621N);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int m4621N = m4621N(obj);
        if (m4621N < 0) {
            return null;
        }
        int i = (m4621N << 1) + 1;
        Object[] objArr = this.f8515R;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f8517w;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8517w * 28);
        sb.append('{');
        for (int i = 0; i < this.f8517w; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object m4626o = m4626o(i);
            if (m4626o != this) {
                sb.append(m4626o);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m4620G = m4620G(i);
            if (m4620G != this) {
                sb.append(m4620G);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final int m4627u(Object obj) {
        int i = this.f8517w * 2;
        Object[] objArr = this.f8515R;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public C2698yx(int i) {
        if (i == 0) {
            this.f8516S = AbstractC0438II.f1455R;
            this.f8515R = AbstractC0438II.f1466w;
        } else {
            m4619z(i);
        }
        this.f8517w = 0;
    }

    public final boolean remove(Object obj, Object obj2) {
        int m4621N = m4621N(obj);
        if (m4621N < 0) {
            return false;
        }
        Object m4620G = m4620G(m4621N);
        if (obj2 != m4620G && (obj2 == null || !obj2.equals(m4620G))) {
            return false;
        }
        m4624W(m4621N);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int m4621N = m4621N(obj);
        if (m4621N < 0) {
            return false;
        }
        Object m4620G = m4620G(m4621N);
        if (m4620G != obj2 && (obj2 == null || !obj2.equals(m4620G))) {
            return false;
        }
        int i = (m4621N << 1) + 1;
        Object[] objArr = this.f8515R;
        Object obj4 = objArr[i];
        objArr[i] = obj3;
        return true;
    }
}
