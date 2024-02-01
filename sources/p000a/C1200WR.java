package p000a;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a.WR */
/* loaded from: classes.dex */
public final class C1200WR extends AbstractC2084nF {

    /* renamed from: I */
    public static final Object[] f3905I = new Object[0];

    /* renamed from: R */
    public Object[] f3906R;

    /* renamed from: S */
    public int f3907S;

    /* renamed from: w */
    public int f3908w;

    public C1200WR() {
        this.f3906R = f3905I;
    }

    /* renamed from: G */
    public final Object m2476G() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f3906R[m2483V(AbstractC1292YB.m2642C(this) + this.f3907S)];
    }

    /* renamed from: M */
    public final Object m2477M() {
        if (isEmpty()) {
            return null;
        }
        return this.f3906R[m2483V(AbstractC1292YB.m2642C(this) + this.f3907S)];
    }

    /* renamed from: N */
    public final void m2478N(Object obj) {
        m2485o(mo1150h() + 1);
        this.f3906R[m2483V(mo1150h() + this.f3907S)] = obj;
        this.f3908w = mo1150h() + 1;
    }

    /* renamed from: P */
    public final void m2479P(Object obj) {
        m2485o(this.f3908w + 1);
        int i = this.f3907S;
        if (i == 0) {
            i = this.f3906R.length;
        }
        int i2 = i - 1;
        this.f3907S = i2;
        this.f3906R[i2] = obj;
        this.f3908w++;
    }

    /* renamed from: Q */
    public final void m2480Q(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f3906R.length;
        while (i < length && it.hasNext()) {
            this.f3906R[i] = it.next();
            i++;
        }
        int i2 = this.f3907S;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f3906R[i3] = it.next();
        }
        this.f3908w = collection.size() + mo1150h();
    }

    /* renamed from: R */
    public final Object m2481R() {
        if (!isEmpty()) {
            int m2483V = m2483V(AbstractC1292YB.m2642C(this) + this.f3907S);
            Object[] objArr = this.f3906R;
            Object obj = objArr[m2483V];
            objArr[m2483V] = null;
            this.f3908w = mo1150h() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* renamed from: S */
    public final Object m2482S() {
        int i;
        if (!isEmpty()) {
            Object[] objArr = this.f3906R;
            int i2 = this.f3907S;
            Object obj = objArr[i2];
            objArr[i2] = null;
            if (i2 == objArr.length - 1) {
                i = 0;
            } else {
                i = i2 + 1;
            }
            this.f3907S = i;
            this.f3908w--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* renamed from: V */
    public final int m2483V(int i) {
        Object[] objArr = this.f3906R;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* renamed from: W */
    public final Object m2484W() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f3906R[this.f3907S];
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        C0054B3.m98h(i, this.f3908w);
        int i2 = this.f3908w;
        if (i == i2) {
            m2478N(obj);
            return;
        }
        if (i == 0) {
            m2479P(obj);
            return;
        }
        m2485o(i2 + 1);
        int m2483V = m2483V(this.f3907S + i);
        int i3 = this.f3908w;
        if (i < ((i3 + 1) >> 1)) {
            int length = m2483V == 0 ? this.f3906R.length - 1 : m2483V - 1;
            int i4 = this.f3907S;
            int length2 = i4 == 0 ? this.f3906R.length - 1 : i4 - 1;
            Object[] objArr = this.f3906R;
            if (length >= i4) {
                objArr[length2] = objArr[i4];
                int i5 = i4 + 1;
                System.arraycopy(objArr, i5, objArr, i4, (length + 1) - i5);
            } else {
                System.arraycopy(objArr, i4, objArr, i4 - 1, objArr.length - i4);
                Object[] objArr2 = this.f3906R;
                objArr2[objArr2.length - 1] = objArr2[0];
                System.arraycopy(objArr2, 1, objArr2, 0, (length + 1) - 1);
            }
            this.f3906R[length] = obj;
            this.f3907S = length2;
        } else {
            int m2483V2 = m2483V(i3 + this.f3907S);
            Object[] objArr3 = this.f3906R;
            if (m2483V < m2483V2) {
                System.arraycopy(objArr3, m2483V, objArr3, m2483V + 1, m2483V2 - m2483V);
            } else {
                System.arraycopy(objArr3, 0, objArr3, 1, m2483V2 - 0);
                Object[] objArr4 = this.f3906R;
                objArr4[0] = objArr4[objArr4.length - 1];
                System.arraycopy(objArr4, m2483V, objArr4, m2483V + 1, (objArr4.length - 1) - m2483V);
            }
            this.f3906R[m2483V] = obj;
        }
        this.f3908w++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        C0054B3.m98h(i, this.f3908w);
        if (collection.isEmpty()) {
            return false;
        }
        int i2 = this.f3908w;
        if (i == i2) {
            return addAll(collection);
        }
        m2485o(collection.size() + i2);
        int m2483V = m2483V(this.f3908w + this.f3907S);
        int m2483V2 = m2483V(this.f3907S + i);
        int size = collection.size();
        if (i < ((this.f3908w + 1) >> 1)) {
            int i3 = this.f3907S;
            int i4 = i3 - size;
            if (m2483V2 < i3) {
                Object[] objArr = this.f3906R;
                System.arraycopy(objArr, i3, objArr, i4, objArr.length - i3);
                Object[] objArr2 = this.f3906R;
                int length = objArr2.length - size;
                if (size >= m2483V2) {
                    System.arraycopy(objArr2, 0, objArr2, length, m2483V2 + 0);
                } else {
                    System.arraycopy(objArr2, 0, objArr2, length, size + 0);
                    Object[] objArr3 = this.f3906R;
                    System.arraycopy(objArr3, size, objArr3, 0, m2483V2 - size);
                }
            } else if (i4 >= 0) {
                Object[] objArr4 = this.f3906R;
                System.arraycopy(objArr4, i3, objArr4, i4, m2483V2 - i3);
            } else {
                Object[] objArr5 = this.f3906R;
                i4 += objArr5.length;
                int i5 = m2483V2 - i3;
                int length2 = objArr5.length - i4;
                if (length2 >= i5) {
                    System.arraycopy(objArr5, i3, objArr5, i4, i5);
                } else {
                    System.arraycopy(objArr5, i3, objArr5, i4, (i3 + length2) - i3);
                    Object[] objArr6 = this.f3906R;
                    int i6 = this.f3907S + length2;
                    System.arraycopy(objArr6, i6, objArr6, 0, m2483V2 - i6);
                }
            }
            this.f3907S = i4;
            m2483V2 -= size;
            if (m2483V2 < 0) {
                m2483V2 += this.f3906R.length;
            }
        } else {
            int i7 = m2483V2 + size;
            if (m2483V2 < m2483V) {
                int i8 = size + m2483V;
                Object[] objArr7 = this.f3906R;
                if (i8 > objArr7.length) {
                    if (i7 >= objArr7.length) {
                        i7 -= objArr7.length;
                    } else {
                        int length3 = m2483V - (i8 - objArr7.length);
                        System.arraycopy(objArr7, length3, objArr7, 0, m2483V - length3);
                        Object[] objArr8 = this.f3906R;
                        System.arraycopy(objArr8, m2483V2, objArr8, i7, length3 - m2483V2);
                    }
                }
                System.arraycopy(objArr7, m2483V2, objArr7, i7, m2483V - m2483V2);
            } else {
                Object[] objArr9 = this.f3906R;
                System.arraycopy(objArr9, 0, objArr9, size, m2483V - 0);
                Object[] objArr10 = this.f3906R;
                if (i7 >= objArr10.length) {
                    System.arraycopy(objArr10, m2483V2, objArr10, i7 - objArr10.length, objArr10.length - m2483V2);
                } else {
                    int length4 = objArr10.length - size;
                    System.arraycopy(objArr10, length4, objArr10, 0, objArr10.length - length4);
                    Object[] objArr11 = this.f3906R;
                    System.arraycopy(objArr11, m2483V2, objArr11, i7, (objArr11.length - size) - m2483V2);
                }
            }
        }
        m2480Q(m2483V2, collection);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int m2483V = m2483V(mo1150h() + this.f3907S);
        int i = this.f3907S;
        if (i < m2483V) {
            Arrays.fill(this.f3906R, i, m2483V, (Object) null);
        } else if ((!isEmpty()) != false) {
            Object[] objArr = this.f3906R;
            Arrays.fill(objArr, this.f3907S, objArr.length, (Object) null);
            Arrays.fill(this.f3906R, 0, m2483V, (Object) null);
        }
        this.f3907S = 0;
        this.f3908w = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C0054B3.m101z(i, this.f3908w);
        return this.f3906R[m2483V(this.f3907S + i)];
    }

    @Override // p000a.AbstractC2084nF
    /* renamed from: h */
    public final int mo1150h() {
        return this.f3908w;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int m2483V = m2483V(mo1150h() + this.f3907S);
        int i = this.f3907S;
        if (i < m2483V) {
            while (i < m2483V) {
                if (!AbstractC1292YB.m2695u(obj, this.f3906R[i])) {
                    i++;
                }
            }
            return -1;
        }
        if (i >= m2483V) {
            int length = this.f3906R.length;
            while (true) {
                if (i < length) {
                    if (AbstractC1292YB.m2695u(obj, this.f3906R[i])) {
                        break;
                    }
                    i++;
                } else {
                    for (int i2 = 0; i2 < m2483V; i2++) {
                        if (AbstractC1292YB.m2695u(obj, this.f3906R[i2])) {
                            i = i2 + this.f3906R.length;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i - this.f3907S;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (mo1150h() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int m2483V = m2483V(mo1150h() + this.f3907S);
        int i = this.f3907S;
        if (i < m2483V) {
            length = m2483V - 1;
            if (i <= length) {
                while (!AbstractC1292YB.m2695u(obj, this.f3906R[length])) {
                    if (length != i) {
                        length--;
                    }
                }
                return length - this.f3907S;
            }
            return -1;
        }
        if (i > m2483V) {
            int i2 = m2483V - 1;
            while (true) {
                if (-1 < i2) {
                    if (AbstractC1292YB.m2695u(obj, this.f3906R[i2])) {
                        length = i2 + this.f3906R.length;
                        break;
                    }
                    i2--;
                } else {
                    length = this.f3906R.length - 1;
                    int i3 = this.f3907S;
                    if (i3 <= length) {
                        while (!AbstractC1292YB.m2695u(obj, this.f3906R[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: o */
    public final void m2485o(int i) {
        if (i >= 0) {
            Object[] objArr = this.f3906R;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == f3905I) {
                if (i < 10) {
                    i = 10;
                }
                this.f3906R = new Object[i];
                return;
            }
            int length = objArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if (i2 - 2147483639 > 0) {
                if (i > 2147483639) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i2];
            int i3 = this.f3907S;
            System.arraycopy(objArr, i3, objArr2, 0, objArr.length - i3);
            Object[] objArr3 = this.f3906R;
            int length2 = objArr3.length;
            int i4 = this.f3907S;
            System.arraycopy(objArr3, 0, objArr2, length2 - i4, i4 - 0);
            this.f3907S = 0;
            this.f3906R = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        mo1152v(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        boolean z;
        int m2483V;
        boolean z2 = false;
        if (!isEmpty()) {
            if (this.f3906R.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int m2483V2 = m2483V(this.f3908w + this.f3907S);
                int i = this.f3907S;
                if (i < m2483V2) {
                    m2483V = i;
                    while (i < m2483V2) {
                        Object obj = this.f3906R[i];
                        if ((!collection.contains(obj)) != false) {
                            this.f3906R[m2483V] = obj;
                            m2483V++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    Arrays.fill(this.f3906R, m2483V, m2483V2, (Object) null);
                } else {
                    int length = this.f3906R.length;
                    boolean z3 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr = this.f3906R;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if ((!collection.contains(obj2)) != false) {
                            this.f3906R[i2] = obj2;
                            i2++;
                        } else {
                            z3 = true;
                        }
                        i++;
                    }
                    m2483V = m2483V(i2);
                    for (int i3 = 0; i3 < m2483V2; i3++) {
                        Object[] objArr2 = this.f3906R;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if ((!collection.contains(obj3)) != false) {
                            this.f3906R[m2483V] = obj3;
                            if (m2483V == r6.length - 1) {
                                m2483V = 0;
                            } else {
                                m2483V++;
                            }
                        } else {
                            z3 = true;
                        }
                    }
                    z2 = z3;
                }
                if (z2) {
                    int i4 = m2483V - this.f3907S;
                    if (i4 < 0) {
                        i4 += this.f3906R.length;
                    }
                    this.f3908w = i4;
                }
            }
        }
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        boolean z;
        int m2483V;
        boolean z2 = false;
        if (!isEmpty()) {
            if (this.f3906R.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int m2483V2 = m2483V(this.f3908w + this.f3907S);
                int i = this.f3907S;
                if (i < m2483V2) {
                    m2483V = i;
                    while (i < m2483V2) {
                        Object obj = this.f3906R[i];
                        if (collection.contains(obj)) {
                            this.f3906R[m2483V] = obj;
                            m2483V++;
                        } else {
                            z2 = true;
                        }
                        i++;
                    }
                    Arrays.fill(this.f3906R, m2483V, m2483V2, (Object) null);
                } else {
                    int length = this.f3906R.length;
                    boolean z3 = false;
                    int i2 = i;
                    while (i < length) {
                        Object[] objArr = this.f3906R;
                        Object obj2 = objArr[i];
                        objArr[i] = null;
                        if (collection.contains(obj2)) {
                            this.f3906R[i2] = obj2;
                            i2++;
                        } else {
                            z3 = true;
                        }
                        i++;
                    }
                    m2483V = m2483V(i2);
                    for (int i3 = 0; i3 < m2483V2; i3++) {
                        Object[] objArr2 = this.f3906R;
                        Object obj3 = objArr2[i3];
                        objArr2[i3] = null;
                        if (collection.contains(obj3)) {
                            this.f3906R[m2483V] = obj3;
                            if (m2483V == r6.length - 1) {
                                m2483V = 0;
                            } else {
                                m2483V++;
                            }
                        } else {
                            z3 = true;
                        }
                    }
                    z2 = z3;
                }
                if (z2) {
                    int i4 = m2483V - this.f3907S;
                    if (i4 < 0) {
                        i4 += this.f3906R.length;
                    }
                    this.f3908w = i4;
                }
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        C0054B3.m101z(i, this.f3908w);
        int m2483V = m2483V(this.f3907S + i);
        Object[] objArr = this.f3906R;
        Object obj2 = objArr[m2483V];
        objArr[m2483V] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo1150h()]);
    }

    @Override // p000a.AbstractC2084nF
    /* renamed from: v */
    public final Object mo1152v(int i) {
        C0054B3.m101z(i, this.f3908w);
        if (i == AbstractC1292YB.m2642C(this)) {
            return m2481R();
        }
        if (i == 0) {
            return m2482S();
        }
        int m2483V = m2483V(this.f3907S + i);
        Object[] objArr = this.f3906R;
        Object obj = objArr[m2483V];
        int i2 = 0;
        if (i < (this.f3908w >> 1)) {
            int i3 = this.f3907S;
            if (m2483V >= i3) {
                System.arraycopy(objArr, i3, objArr, i3 + 1, m2483V - i3);
            } else {
                System.arraycopy(objArr, 0, objArr, 1, m2483V - 0);
                Object[] objArr2 = this.f3906R;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f3907S;
                System.arraycopy(objArr2, i4, objArr2, i4 + 1, (objArr2.length - 1) - i4);
            }
            Object[] objArr3 = this.f3906R;
            int i5 = this.f3907S;
            objArr3[i5] = null;
            if (i5 != objArr3.length - 1) {
                i2 = i5 + 1;
            }
            this.f3907S = i2;
        } else {
            int m2483V2 = m2483V(AbstractC1292YB.m2642C(this) + this.f3907S);
            Object[] objArr4 = this.f3906R;
            if (m2483V <= m2483V2) {
                int i6 = m2483V + 1;
                System.arraycopy(objArr4, i6, objArr4, m2483V, (m2483V2 + 1) - i6);
            } else {
                int i7 = m2483V + 1;
                System.arraycopy(objArr4, i7, objArr4, m2483V, objArr4.length - i7);
                Object[] objArr5 = this.f3906R;
                objArr5[objArr5.length - 1] = objArr5[0];
                System.arraycopy(objArr5, 1, objArr5, 0, (m2483V2 + 1) - 1);
            }
            this.f3906R[m2483V2] = null;
        }
        this.f3908w--;
        return obj;
    }

    public C1200WR(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f3905I;
        } else {
            if (i <= 0) {
                throw new IllegalArgumentException(AbstractC2441tz.m4188N("Illegal Capacity: ", i));
            }
            objArr = new Object[i];
        }
        this.f3906R = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < mo1150h()) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), mo1150h());
        }
        int m2483V = m2483V(mo1150h() + this.f3907S);
        int i = this.f3907S;
        if (i < m2483V) {
            System.arraycopy(this.f3906R, i, objArr, 0, m2483V - i);
        } else if ((!isEmpty()) != false) {
            Object[] objArr2 = this.f3906R;
            int i2 = this.f3907S;
            System.arraycopy(objArr2, i2, objArr, 0, objArr2.length - i2);
            Object[] objArr3 = this.f3906R;
            System.arraycopy(objArr3, 0, objArr, objArr3.length - this.f3907S, m2483V - 0);
        }
        if (objArr.length > mo1150h()) {
            objArr[mo1150h()] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m2478N(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        m2485o(collection.size() + mo1150h());
        m2480Q(m2483V(mo1150h() + this.f3907S), collection);
        return true;
    }
}
