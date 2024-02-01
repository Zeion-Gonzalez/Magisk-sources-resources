package p000a;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: a.M4 */
/* loaded from: classes.dex */
public final class C0642M4 implements Map, Serializable, InterfaceC0743Nw {

    /* renamed from: r */
    public static final C0642M4 f2068r;

    /* renamed from: E */
    public C0230EO f2069E;

    /* renamed from: I */
    public int[] f2070I;

    /* renamed from: R */
    public Object[] f2071R;

    /* renamed from: S */
    public Object[] f2072S;

    /* renamed from: U */
    public C0096Bt f2073U;

    /* renamed from: f */
    public boolean f2074f;

    /* renamed from: g */
    public int f2075g;

    /* renamed from: k */
    public int f2076k;

    /* renamed from: q */
    public int f2077q;

    /* renamed from: s */
    public C0230EO f2078s;

    /* renamed from: w */
    public int[] f2079w;

    /* renamed from: y */
    public int f2080y;

    static {
        new C0054B3();
        C0642M4 c0642m4 = new C0642M4(0);
        c0642m4.f2074f = true;
        f2068r = c0642m4;
    }

    public C0642M4() {
        this(8);
    }

    /* renamed from: N */
    public final int m1435N(Object obj) {
        int m1437Q = m1437Q(obj);
        int i = this.f2077q;
        while (true) {
            int i2 = this.f2070I[m1437Q];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (AbstractC1292YB.m2695u(this.f2072S[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = m1437Q - 1;
            if (m1437Q == 0) {
                m1437Q = this.f2070I.length - 1;
            } else {
                m1437Q = i4;
            }
        }
    }

    /* renamed from: P */
    public final void m1436P(int i) {
        boolean z;
        Object[] objArr;
        Object[] objArr2 = this.f2072S;
        int length = objArr2.length;
        int i2 = this.f2076k;
        int i3 = length - i2;
        int i4 = i2 - this.f2080y;
        int i5 = 1;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr2.length / 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m1440u(this.f2070I.length);
            return;
        }
        int i6 = i2 + i;
        if (i6 >= 0) {
            if (i6 > objArr2.length) {
                int length2 = (objArr2.length * 3) / 2;
                if (i6 <= length2) {
                    i6 = length2;
                }
                this.f2072S = Arrays.copyOf(objArr2, i6);
                Object[] objArr3 = this.f2071R;
                if (objArr3 != null) {
                    objArr = Arrays.copyOf(objArr3, i6);
                } else {
                    objArr = null;
                }
                this.f2071R = objArr;
                this.f2079w = Arrays.copyOf(this.f2079w, i6);
                if (i6 >= 1) {
                    i5 = i6;
                }
                int highestOneBit = Integer.highestOneBit(i5 * 3);
                if (highestOneBit > this.f2070I.length) {
                    m1440u(highestOneBit);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: Q */
    public final int m1437Q(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f2075g;
    }

    @Override // java.util.Map
    public final void clear() {
        m1438h();
        C2482un it = new C0325GF(0, this.f2076k - 1).iterator();
        while (it.f7602w) {
            int m4257h = it.m4257h();
            int[] iArr = this.f2079w;
            int i = iArr[m4257h];
            if (i >= 0) {
                this.f2070I[i] = 0;
                iArr[m4257h] = -1;
            }
        }
        AbstractC0438II.m991D(0, this.f2076k, this.f2072S);
        Object[] objArr = this.f2071R;
        if (objArr != null) {
            AbstractC0438II.m991D(0, this.f2076k, objArr);
        }
        this.f2080y = 0;
        this.f2076k = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m1435N(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i;
        int i2 = this.f2076k;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (this.f2079w[i2] >= 0 && AbstractC1292YB.m2695u(this.f2071R[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0230EO c0230eo = this.f2069E;
        if (c0230eo == null) {
            C0230EO c0230eo2 = new C0230EO(this, 0);
            this.f2069E = c0230eo2;
            return c0230eo2;
        }
        return c0230eo;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f2080y == map.size() && m1441v(map.entrySet())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int m1435N = m1435N(obj);
        if (m1435N < 0) {
            return null;
        }
        return this.f2071R[m1435N];
    }

    /* renamed from: h */
    public final void m1438h() {
        if (this.f2074f) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int i2;
        C1532cu c1532cu = new C1532cu(this, 0);
        int i3 = 0;
        while (c1532cu.hasNext()) {
            int i4 = c1532cu.f1970R;
            C0642M4 c0642m4 = c1532cu.f1971S;
            if (i4 < c0642m4.f2076k) {
                c1532cu.f1970R = i4 + 1;
                c1532cu.f1972w = i4;
                Object obj = c0642m4.f2072S[i4];
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object obj2 = c0642m4.f2071R[c1532cu.f1972w];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                } else {
                    i2 = 0;
                }
                c1532cu.m1342z();
                i3 += i ^ i2;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i3;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.f2080y == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0230EO c0230eo = this.f2078s;
        if (c0230eo == null) {
            C0230EO c0230eo2 = new C0230EO(this, 1);
            this.f2078s = c0230eo2;
            return c0230eo2;
        }
        return c0230eo;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x005a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[LOOP:0: B:68:0x0019->B:92:?, LOOP_END, SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1439o(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f2072S
            r1 = 0
            r0[r12] = r1
            int[] r0 = r11.f2079w
            r0 = r0[r12]
            int r1 = r11.f2077q
            int r1 = r1 * 2
            int[] r2 = r11.f2070I
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L15
            r1 = r2
        L15:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L19:
            int r5 = r0 + (-1)
            r6 = -1
            if (r0 != 0) goto L23
            int[] r0 = r11.f2070I
            int r0 = r0.length
            int r0 = r0 + r6
            goto L24
        L23:
            r0 = r5
        L24:
            int r4 = r4 + 1
            int r5 = r11.f2077q
            if (r4 <= r5) goto L2f
            int[] r0 = r11.f2070I
            r0[r1] = r2
            goto L5e
        L2f:
            int[] r5 = r11.f2070I
            r7 = r5[r0]
            if (r7 != 0) goto L38
            r5[r1] = r2
            goto L5e
        L38:
            if (r7 >= 0) goto L3d
            r5[r1] = r6
            goto L55
        L3d:
            java.lang.Object[] r5 = r11.f2072S
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.m1437Q(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f2070I
            int r10 = r9.length
            int r10 = r10 + r6
            r5 = r5 & r10
            if (r5 < r4) goto L57
            r9[r1] = r7
            int[] r4 = r11.f2079w
            r4[r8] = r1
        L55:
            r1 = r0
            r4 = r2
        L57:
            int r3 = r3 + r6
            if (r3 >= 0) goto L19
            int[] r0 = r11.f2070I
            r0[r1] = r6
        L5e:
            int[] r0 = r11.f2079w
            r0[r12] = r6
            int r12 = r11.f2080y
            int r12 = r12 + r6
            r11.f2080y = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0642M4.m1439o(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m1438h();
        int m1442z = m1442z(obj);
        Object[] objArr = this.f2071R;
        if (objArr == null) {
            objArr = AbstractC0438II.m1047u(this.f2072S.length);
            this.f2071R = objArr;
        }
        if (m1442z < 0) {
            int i = (-m1442z) - 1;
            Object obj3 = objArr[i];
            objArr[i] = obj2;
            return obj3;
        }
        objArr[m1442z] = obj2;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m1438h();
        Set<Map.Entry> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            m1436P(entrySet.size());
            for (Map.Entry entry : entrySet) {
                int m1442z = m1442z(entry.getKey());
                Object[] objArr = this.f2071R;
                if (objArr == null) {
                    objArr = AbstractC0438II.m1047u(this.f2072S.length);
                    this.f2071R = objArr;
                }
                if (m1442z >= 0) {
                    objArr[m1442z] = entry.getValue();
                } else {
                    int i = (-m1442z) - 1;
                    if (!AbstractC1292YB.m2695u(entry.getValue(), objArr[i])) {
                        objArr[i] = entry.getValue();
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m1438h();
        int m1435N = m1435N(obj);
        if (m1435N < 0) {
            m1435N = -1;
        } else {
            m1439o(m1435N);
        }
        if (m1435N < 0) {
            return null;
        }
        Object[] objArr = this.f2071R;
        Object obj2 = objArr[m1435N];
        objArr[m1435N] = null;
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f2080y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f2080y * 3) + 2);
        sb.append("{");
        int i = 0;
        C1532cu c1532cu = new C1532cu(this, 0);
        while (c1532cu.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = c1532cu.f1970R;
            C0642M4 c0642m4 = c1532cu.f1971S;
            if (i2 < c0642m4.f2076k) {
                c1532cu.f1970R = i2 + 1;
                c1532cu.f1972w = i2;
                Object obj = c0642m4.f2072S[i2];
                if (AbstractC1292YB.m2695u(obj, c0642m4)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object obj2 = c0642m4.f2071R[c1532cu.f1972w];
                if (AbstractC1292YB.m2695u(obj2, c0642m4)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                c1532cu.m1342z();
                i++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void m1440u(int i) {
        boolean z;
        int i2;
        if (this.f2076k > this.f2080y) {
            Object[] objArr = this.f2071R;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i2 = this.f2076k;
                if (i3 >= i2) {
                    break;
                }
                if (this.f2079w[i3] >= 0) {
                    Object[] objArr2 = this.f2072S;
                    objArr2[i4] = objArr2[i3];
                    if (objArr != null) {
                        objArr[i4] = objArr[i3];
                    }
                    i4++;
                }
                i3++;
            }
            AbstractC0438II.m991D(i4, i2, this.f2072S);
            if (objArr != null) {
                AbstractC0438II.m991D(i4, this.f2076k, objArr);
            }
            this.f2076k = i4;
        }
        int[] iArr = this.f2070I;
        if (i != iArr.length) {
            this.f2070I = new int[i];
            this.f2075g = Integer.numberOfLeadingZeros(i) + 1;
        } else {
            Arrays.fill(iArr, 0, iArr.length, 0);
        }
        int i5 = 0;
        while (i5 < this.f2076k) {
            int i6 = i5 + 1;
            int m1437Q = m1437Q(this.f2072S[i5]);
            int i7 = this.f2077q;
            while (true) {
                int[] iArr2 = this.f2070I;
                if (iArr2[m1437Q] == 0) {
                    iArr2[m1437Q] = i6;
                    this.f2079w[i5] = m1437Q;
                    z = true;
                    break;
                }
                i7--;
                if (i7 < 0) {
                    z = false;
                    break;
                }
                int i8 = m1437Q - 1;
                if (m1437Q == 0) {
                    m1437Q = iArr2.length - 1;
                } else {
                    m1437Q = i8;
                }
            }
            if (z) {
                i5 = i6;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* renamed from: v */
    public final boolean m1441v(Collection collection) {
        boolean m2695u;
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int m1435N = m1435N(entry.getKey());
                    if (m1435N < 0) {
                        m2695u = false;
                    } else {
                        m2695u = AbstractC1292YB.m2695u(this.f2071R[m1435N], entry.getValue());
                    }
                    if (!m2695u) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Collection values() {
        C0096Bt c0096Bt = this.f2073U;
        if (c0096Bt == null) {
            C0096Bt c0096Bt2 = new C0096Bt(this);
            this.f2073U = c0096Bt2;
            return c0096Bt2;
        }
        return c0096Bt;
    }

    /* renamed from: z */
    public final int m1442z(Object obj) {
        m1438h();
        while (true) {
            int m1437Q = m1437Q(obj);
            int i = this.f2077q * 2;
            int length = this.f2070I.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f2070I;
                int i3 = iArr[m1437Q];
                if (i3 <= 0) {
                    int i4 = this.f2076k;
                    Object[] objArr = this.f2072S;
                    if (i4 >= objArr.length) {
                        m1436P(1);
                    } else {
                        int i5 = i4 + 1;
                        this.f2076k = i5;
                        objArr[i4] = obj;
                        this.f2079w[i4] = m1437Q;
                        iArr[m1437Q] = i5;
                        this.f2080y++;
                        if (i2 > this.f2077q) {
                            this.f2077q = i2;
                        }
                        return i4;
                    }
                } else {
                    if (AbstractC1292YB.m2695u(this.f2072S[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        m1440u(this.f2070I.length * 2);
                        break;
                    }
                    int i6 = m1437Q - 1;
                    if (m1437Q == 0) {
                        m1437Q = this.f2070I.length - 1;
                    } else {
                        m1437Q = i6;
                    }
                }
            }
        }
    }

    public C0642M4(int i) {
        Object[] m1047u = AbstractC0438II.m1047u(i);
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f2072S = m1047u;
        this.f2071R = null;
        this.f2079w = iArr;
        this.f2070I = new int[highestOneBit];
        this.f2077q = 2;
        this.f2076k = 0;
        this.f2075g = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
