package p000a;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: a.Ix */
/* loaded from: classes.dex */
public final class C0474Ix extends AbstractC2084nF implements RandomAccess, Serializable {

    /* renamed from: g */
    public static final C0474Ix f1579g;

    /* renamed from: I */
    public boolean f1580I;

    /* renamed from: R */
    public final int f1581R;

    /* renamed from: S */
    public Object[] f1582S;

    /* renamed from: k */
    public final C0474Ix f1583k;

    /* renamed from: q */
    public final C0474Ix f1584q;

    /* renamed from: w */
    public int f1585w;

    static {
        C0474Ix c0474Ix = new C0474Ix(0);
        c0474Ix.f1580I = true;
        f1579g = c0474Ix;
    }

    public C0474Ix() {
        this(10);
    }

    /* renamed from: G */
    public final void m1144G(int i, int i2) {
        C0474Ix c0474Ix = this.f1584q;
        if (c0474Ix != null) {
            c0474Ix.m1144G(i, i2);
        } else {
            Object[] objArr = this.f1582S;
            int i3 = i + i2;
            System.arraycopy(objArr, i3, objArr, i, this.f1585w - i3);
            Object[] objArr2 = this.f1582S;
            int i4 = this.f1585w;
            AbstractC0438II.m991D(i4 - i2, i4, objArr2);
        }
        this.f1585w -= i2;
    }

    /* renamed from: M */
    public final int m1145M(int i, int i2, Collection collection, boolean z) {
        C0474Ix c0474Ix = this.f1584q;
        if (c0474Ix != null) {
            int m1145M = c0474Ix.m1145M(i, i2, collection, z);
            this.f1585w -= m1145M;
            return m1145M;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f1582S[i5]) == z) {
                Object[] objArr = this.f1582S;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.f1582S;
        int i7 = i2 + i;
        System.arraycopy(objArr2, i7, objArr2, i + i4, this.f1585w - i7);
        Object[] objArr3 = this.f1582S;
        int i8 = this.f1585w;
        AbstractC0438II.m991D(i8 - i6, i8, objArr3);
        this.f1585w -= i6;
        return i6;
    }

    /* renamed from: N */
    public final void m1146N(int i, Object obj) {
        C0474Ix c0474Ix = this.f1584q;
        if (c0474Ix != null) {
            c0474Ix.m1146N(i, obj);
            this.f1582S = c0474Ix.f1582S;
            this.f1585w++;
        } else {
            m1151o(i, 1);
            this.f1582S[i] = obj;
        }
    }

    /* renamed from: P */
    public final void m1147P(int i, Collection collection, int i2) {
        C0474Ix c0474Ix = this.f1584q;
        if (c0474Ix != null) {
            c0474Ix.m1147P(i, collection, i2);
            this.f1582S = c0474Ix.f1582S;
            this.f1585w += i2;
        } else {
            m1151o(i, i2);
            Iterator it = collection.iterator();
            for (int i3 = 0; i3 < i2; i3++) {
                this.f1582S[i + i3] = it.next();
            }
        }
    }

    /* renamed from: Q */
    public final void m1148Q() {
        boolean z;
        C0474Ix c0474Ix;
        if (!this.f1580I && ((c0474Ix = this.f1583k) == null || !c0474Ix.f1580I)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: W */
    public final Object m1149W(int i) {
        C0474Ix c0474Ix = this.f1584q;
        if (c0474Ix != null) {
            this.f1585w--;
            return c0474Ix.m1149W(i);
        }
        Object[] objArr = this.f1582S;
        Object obj = objArr[i];
        int i2 = i + 1;
        System.arraycopy(objArr, i2, objArr, i, (this.f1585w + this.f1581R) - i2);
        Object[] objArr2 = this.f1582S;
        int i3 = this.f1585w;
        objArr2[(r4 + i3) - 1] = null;
        this.f1585w = i3 - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m1148Q();
        C0054B3.m98h(i, this.f1585w);
        m1146N(this.f1581R + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m1148Q();
        C0054B3.m98h(i, this.f1585w);
        int size = collection.size();
        m1147P(this.f1581R + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m1148Q();
        m1144G(this.f1581R, this.f1585w);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 == r7) goto L31
            boolean r1 = r8 instanceof java.util.List
            r2 = 0
            if (r1 == 0) goto L30
            java.util.List r8 = (java.util.List) r8
            java.lang.Object[] r1 = r7.f1582S
            int r3 = r7.f1585w
            int r4 = r8.size()
            if (r3 == r4) goto L15
            goto L27
        L15:
            r4 = r2
        L16:
            if (r4 >= r3) goto L2c
            int r5 = r7.f1581R
            int r5 = r5 + r4
            r5 = r1[r5]
            java.lang.Object r6 = r8.get(r4)
            boolean r5 = p000a.AbstractC1292YB.m2695u(r5, r6)
            if (r5 != 0) goto L29
        L27:
            r8 = r2
            goto L2d
        L29:
            int r4 = r4 + 1
            goto L16
        L2c:
            r8 = r0
        L2d:
            if (r8 == 0) goto L30
            goto L31
        L30:
            r0 = r2
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0474Ix.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C0054B3.m101z(i, this.f1585w);
        return this.f1582S[this.f1581R + i];
    }

    @Override // p000a.AbstractC2084nF
    /* renamed from: h */
    public final int mo1150h() {
        return this.f1585w;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        Object[] objArr = this.f1582S;
        int i2 = this.f1585w;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[this.f1581R + i4];
            int i5 = i3 * 31;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i3 = i5 + i;
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f1585w; i++) {
            if (AbstractC1292YB.m2695u(this.f1582S[this.f1581R + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f1585w == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C2636xf(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f1585w - 1; i >= 0; i--) {
            if (AbstractC1292YB.m2695u(this.f1582S[this.f1581R + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C2636xf(this, 0);
    }

    /* renamed from: o */
    public final void m1151o(int i, int i2) {
        int i3 = this.f1585w + i2;
        if (this.f1584q == null) {
            if (i3 >= 0) {
                Object[] objArr = this.f1582S;
                if (i3 > objArr.length) {
                    int length = objArr.length;
                    int i4 = length + (length >> 1);
                    if (i4 - i3 < 0) {
                        i4 = i3;
                    }
                    if (i4 - 2147483639 > 0) {
                        if (i3 > 2147483639) {
                            i4 = Integer.MAX_VALUE;
                        } else {
                            i4 = 2147483639;
                        }
                    }
                    this.f1582S = Arrays.copyOf(objArr, i4);
                }
                Object[] objArr2 = this.f1582S;
                System.arraycopy(objArr2, i, objArr2, i + i2, (this.f1581R + this.f1585w) - i);
                this.f1585w += i2;
                return;
            }
            throw new OutOfMemoryError();
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m1148Q();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            mo1152v(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m1148Q();
        return m1145M(this.f1581R, this.f1585w, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m1148Q();
        return m1145M(this.f1581R, this.f1585w, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m1148Q();
        C0054B3.m101z(i, this.f1585w);
        Object[] objArr = this.f1582S;
        int i2 = this.f1581R + i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        C0054B3.m100v(i, i2, this.f1585w);
        Object[] objArr = this.f1582S;
        int i3 = this.f1581R + i;
        int i4 = i2 - i;
        boolean z = this.f1580I;
        C0474Ix c0474Ix = this.f1583k;
        return new C0474Ix(objArr, i3, i4, z, this, c0474Ix == null ? this : c0474Ix);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        Object[] objArr = this.f1582S;
        int i = this.f1585w;
        int i2 = this.f1581R;
        int i3 = i + i2;
        AbstractC1292YB.m2676g(i3, objArr.length);
        return Arrays.copyOfRange(objArr, i2, i3);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        Object[] objArr = this.f1582S;
        int i = this.f1585w;
        StringBuilder sb = new StringBuilder((i * 3) + 2);
        sb.append("[");
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(objArr[this.f1581R + i2]);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // p000a.AbstractC2084nF
    /* renamed from: v */
    public final Object mo1152v(int i) {
        m1148Q();
        C0054B3.m101z(i, this.f1585w);
        return m1149W(this.f1581R + i);
    }

    public C0474Ix(int i) {
        this(AbstractC0438II.m1047u(i), 0, 0, false, null, null);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m1148Q();
        m1146N(this.f1581R + this.f1585w, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m1148Q();
        int size = collection.size();
        m1147P(this.f1581R + this.f1585w, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C0054B3.m98h(i, this.f1585w);
        return new C2636xf(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f1585w;
        int i2 = this.f1581R;
        if (length < i) {
            return Arrays.copyOfRange(this.f1582S, i2, i + i2, objArr.getClass());
        }
        System.arraycopy(this.f1582S, i2, objArr, 0, (i + i2) - i2);
        int length2 = objArr.length;
        int i3 = this.f1585w;
        if (length2 > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public C0474Ix(Object[] objArr, int i, int i2, boolean z, C0474Ix c0474Ix, C0474Ix c0474Ix2) {
        this.f1582S = objArr;
        this.f1581R = i;
        this.f1585w = i2;
        this.f1580I = z;
        this.f1584q = c0474Ix;
        this.f1583k = c0474Ix2;
    }
}
