package p000a;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: a.Qq */
/* loaded from: classes.dex */
public final class C0894Qq implements Collection, Set {

    /* renamed from: U */
    public static int f3068U;

    /* renamed from: g */
    public static Object[] f3069g;

    /* renamed from: s */
    public static Object[] f3072s;

    /* renamed from: y */
    public static int f3073y;

    /* renamed from: I */
    public C1833iV f3074I;

    /* renamed from: q */
    public static final int[] f3071q = new int[0];

    /* renamed from: k */
    public static final Object[] f3070k = new Object[0];

    /* renamed from: S */
    public int[] f3076S = f3071q;

    /* renamed from: R */
    public Object[] f3075R = f3070k;

    /* renamed from: w */
    public int f3077w = 0;

    /* renamed from: v */
    public static void m2041v(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0894Qq.class) {
                if (f3068U < 10) {
                    objArr[0] = f3072s;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f3072s = objArr;
                    f3068U++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0894Qq.class) {
                if (f3073y < 10) {
                    objArr[0] = f3069g;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f3069g = objArr;
                    f3073y++;
                }
            }
        }
    }

    /* renamed from: N */
    public final int m2042N() {
        int i = this.f3077w;
        if (i == 0) {
            return -1;
        }
        int m1004M = AbstractC0438II.m1004M(i, 0, this.f3076S);
        if (m1004M < 0 || this.f3075R[m1004M] == null) {
            return m1004M;
        }
        int i2 = m1004M + 1;
        while (i2 < i && this.f3076S[i2] == 0) {
            if (this.f3075R[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = m1004M - 1; i3 >= 0 && this.f3076S[i3] == 0; i3--) {
            if (this.f3075R[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* renamed from: P */
    public final int m2043P(int i, Object obj) {
        int i2 = this.f3077w;
        if (i2 == 0) {
            return -1;
        }
        int m1004M = AbstractC0438II.m1004M(i2, i, this.f3076S);
        if (m1004M < 0 || obj.equals(this.f3075R[m1004M])) {
            return m1004M;
        }
        int i3 = m1004M + 1;
        while (i3 < i2 && this.f3076S[i3] == i) {
            if (obj.equals(this.f3075R[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m1004M - 1; i4 >= 0 && this.f3076S[i4] == i; i4--) {
            if (obj.equals(this.f3075R[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* renamed from: Q */
    public final void m2044Q(int i) {
        Object[] objArr = this.f3075R;
        Object obj = objArr[i];
        int i2 = this.f3077w;
        if (i2 <= 1) {
            m2041v(this.f3076S, objArr, i2);
            this.f3076S = f3071q;
            this.f3075R = f3070k;
            this.f3077w = 0;
            return;
        }
        int[] iArr = this.f3076S;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i3 = i2 - 1;
            this.f3077w = i3;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i3 - i);
                Object[] objArr2 = this.f3075R;
                System.arraycopy(objArr2, i4, objArr2, i, this.f3077w - i);
            }
            this.f3075R[this.f3077w] = null;
            return;
        }
        m2045h(i2 > 8 ? i2 + (i2 >> 1) : 8);
        this.f3077w--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.f3076S, 0, i);
            System.arraycopy(objArr, 0, this.f3075R, 0, i);
        }
        int i5 = this.f3077w;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, this.f3076S, i, i5 - i);
            System.arraycopy(objArr, i6, this.f3075R, i, this.f3077w - i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int m2043P;
        if (obj == null) {
            m2043P = m2042N();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            m2043P = m2043P(hashCode, obj);
        }
        if (m2043P >= 0) {
            return false;
        }
        int i2 = ~m2043P;
        int i3 = this.f3077w;
        int[] iArr = this.f3076S;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f3075R;
            m2045h(i4);
            int[] iArr2 = this.f3076S;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3075R, 0, objArr.length);
            }
            m2041v(iArr, objArr, this.f3077w);
        }
        int i5 = this.f3077w;
        if (i2 < i5) {
            int[] iArr3 = this.f3076S;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f3075R;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f3077w - i2);
        }
        this.f3076S[i2] = i;
        this.f3075R[i2] = obj;
        this.f3077w++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f3077w;
        int[] iArr = this.f3076S;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f3075R;
            m2045h(size);
            int i = this.f3077w;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f3076S, 0, i);
                System.arraycopy(objArr, 0, this.f3075R, 0, this.f3077w);
            }
            m2041v(iArr, objArr, this.f3077w);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f3077w;
        if (i != 0) {
            m2041v(this.f3076S, this.f3075R, i);
            this.f3076S = f3071q;
            this.f3075R = f3070k;
            this.f3077w = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f3077w != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f3077w; i++) {
                try {
                    if (!set.contains(this.f3075R[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void m2045h(int i) {
        if (i == 8) {
            synchronized (C0894Qq.class) {
                Object[] objArr = f3072s;
                if (objArr != null) {
                    this.f3075R = objArr;
                    f3072s = (Object[]) objArr[0];
                    this.f3076S = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3068U--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0894Qq.class) {
                Object[] objArr2 = f3069g;
                if (objArr2 != null) {
                    this.f3075R = objArr2;
                    f3069g = (Object[]) objArr2[0];
                    this.f3076S = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3073y--;
                    return;
                }
            }
        }
        this.f3076S = new int[i];
        this.f3075R = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f3076S;
        int i = this.f3077w;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        return obj == null ? m2042N() : m2043P(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f3077w <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = 1;
        if (this.f3074I == null) {
            this.f3074I = new C1833iV(i, this);
        }
        C1833iV c1833iV = this.f3074I;
        if (((C1391a5) c1833iV.f2045h) == null) {
            c1833iV.f2045h = new C1391a5(c1833iV, i);
        }
        return ((C1391a5) c1833iV.f2045h).iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        m2044Q(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f3077w - 1; i >= 0; i--) {
            if (!collection.contains(this.f3075R[i])) {
                m2044Q(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f3077w;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f3077w;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f3075R, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3077w * 14);
        sb.append('{');
        for (int i = 0; i < this.f3077w; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f3075R[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f3077w) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f3077w);
        }
        System.arraycopy(this.f3075R, 0, objArr, 0, this.f3077w);
        int length = objArr.length;
        int i = this.f3077w;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
