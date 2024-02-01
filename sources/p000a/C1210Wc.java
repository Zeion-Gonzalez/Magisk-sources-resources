package p000a;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

/* renamed from: a.Wc */
/* loaded from: classes.dex */
public final class C1210Wc extends AbstractMap implements Serializable {

    /* renamed from: s */
    public static final C2496v1 f3927s = new C2496v1(4);

    /* renamed from: g */
    public C1006Sr f3931g;

    /* renamed from: y */
    public C1006Sr f3935y;

    /* renamed from: I */
    public int f3928I = 0;

    /* renamed from: q */
    public int f3933q = 0;

    /* renamed from: S */
    public final Comparator f3930S = f3927s;

    /* renamed from: w */
    public final C0821PK f3934w = new C0821PK();

    /* renamed from: R */
    public C0821PK[] f3929R = new C0821PK[16];

    /* renamed from: k */
    public int f3932k = 12;

    /* renamed from: N */
    public final void m2489N(C0821PK c0821pk, C0821PK c0821pk2) {
        C0821PK c0821pk3 = c0821pk.f2785S;
        c0821pk.f2785S = null;
        if (c0821pk2 != null) {
            c0821pk2.f2785S = c0821pk3;
        }
        if (c0821pk3 == null) {
            this.f3929R[c0821pk.f2786g & (r0.length - 1)] = c0821pk2;
        } else if (c0821pk3.f2784R == c0821pk) {
            c0821pk3.f2784R = c0821pk2;
        } else {
            c0821pk3.f2790w = c0821pk2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0020, code lost:
    
        if (r8.f2789s > r1.f2789s) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0022, code lost:
    
        r1 = r8;
        r8 = r8.f2790w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0027, code lost:
    
        if (r8 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x002a, code lost:
    
        r5 = r1;
        r1 = r1.f2784R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x002f, code lost:
    
        if (r1 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0032, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0033, code lost:
    
        m2490P(r1, false);
        r8 = r7.f2784R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0038, code lost:
    
        if (r8 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x003a, code lost:
    
        r2 = r8.f2789s;
        r1.f2784R = r8;
        r8.f2785S = r1;
        r7.f2784R = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0043, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0044, code lost:
    
        r8 = r7.f2790w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0046, code lost:
    
        if (r8 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0048, code lost:
    
        r3 = r8.f2789s;
        r1.f2790w = r8;
        r8.f2785S = r1;
        r7.f2790w = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0050, code lost:
    
        r1.f2789s = java.lang.Math.max(r2, r3) + 1;
        m2489N(r7, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x005b, code lost:
    
        return;
     */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2490P(p000a.C0821PK r7, boolean r8) {
        /*
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L11
            a.PK r8 = r7.f2788q
            a.PK r1 = r7.f2783I
            r8.f2783I = r1
            a.PK r1 = r7.f2783I
            r1.f2788q = r8
            r7.f2788q = r0
            r7.f2783I = r0
        L11:
            a.PK r8 = r7.f2784R
            a.PK r1 = r7.f2790w
            a.PK r2 = r7.f2785S
            r3 = 0
            if (r8 == 0) goto L5c
            if (r1 == 0) goto L5c
            int r2 = r8.f2789s
            int r4 = r1.f2789s
            if (r2 <= r4) goto L2a
        L22:
            a.PK r1 = r8.f2790w
            r5 = r1
            r1 = r8
            r8 = r5
            if (r8 == 0) goto L33
            goto L22
        L2a:
            a.PK r8 = r1.f2784R
            r5 = r1
            r1 = r8
            r8 = r5
            if (r1 == 0) goto L32
            goto L2a
        L32:
            r1 = r8
        L33:
            r6.m2490P(r1, r3)
            a.PK r8 = r7.f2784R
            if (r8 == 0) goto L43
            int r2 = r8.f2789s
            r1.f2784R = r8
            r8.f2785S = r1
            r7.f2784R = r0
            goto L44
        L43:
            r2 = r3
        L44:
            a.PK r8 = r7.f2790w
            if (r8 == 0) goto L50
            int r3 = r8.f2789s
            r1.f2790w = r8
            r8.f2785S = r1
            r7.f2790w = r0
        L50:
            int r8 = java.lang.Math.max(r2, r3)
            int r8 = r8 + 1
            r1.f2789s = r8
            r6.m2489N(r7, r1)
            return
        L5c:
            if (r8 == 0) goto L64
            r6.m2489N(r7, r8)
            r7.f2784R = r0
            goto L6f
        L64:
            if (r1 == 0) goto L6c
            r6.m2489N(r7, r1)
            r7.f2790w = r0
            goto L6f
        L6c:
            r6.m2489N(r7, r0)
        L6f:
            r6.m2494v(r2, r3)
            int r7 = r6.f3928I
            int r7 = r7 + (-1)
            r6.f3928I = r7
            int r7 = r6.f3933q
            int r7 = r7 + 1
            r6.f3933q = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1210Wc.m2490P(a.PK, boolean):void");
    }

    /* renamed from: Q */
    public final void m2491Q(C0821PK c0821pk) {
        C0821PK c0821pk2 = c0821pk.f2784R;
        C0821PK c0821pk3 = c0821pk.f2790w;
        C0821PK c0821pk4 = c0821pk3.f2784R;
        C0821PK c0821pk5 = c0821pk3.f2790w;
        c0821pk.f2790w = c0821pk4;
        if (c0821pk4 != null) {
            c0821pk4.f2785S = c0821pk;
        }
        m2489N(c0821pk, c0821pk3);
        c0821pk3.f2784R = c0821pk;
        c0821pk.f2785S = c0821pk3;
        int max = Math.max(c0821pk2 != null ? c0821pk2.f2789s : 0, c0821pk4 != null ? c0821pk4.f2789s : 0) + 1;
        c0821pk.f2789s = max;
        c0821pk3.f2789s = Math.max(max, c0821pk5 != null ? c0821pk5.f2789s : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f3929R, (Object) null);
        this.f3928I = 0;
        this.f3933q++;
        C0821PK c0821pk = this.f3934w;
        C0821PK c0821pk2 = c0821pk.f2783I;
        while (c0821pk2 != c0821pk) {
            C0821PK c0821pk3 = c0821pk2.f2783I;
            c0821pk2.f2788q = null;
            c0821pk2.f2783I = null;
            c0821pk2 = c0821pk3;
        }
        c0821pk.f2788q = c0821pk;
        c0821pk.f2783I = c0821pk;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x000b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsKey(java.lang.Object r2) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L8
            a.PK r2 = r1.m2495z(r2, r0)     // Catch: java.lang.ClassCastException -> L8
            goto L9
        L8:
            r2 = 0
        L9:
            if (r2 == 0) goto Lc
            r0 = 1
        Lc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1210Wc.containsKey(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C1006Sr c1006Sr = this.f3931g;
        if (c1006Sr != null) {
            return c1006Sr;
        }
        C1006Sr c1006Sr2 = new C1006Sr(this, 0);
        this.f3931g = c1006Sr2;
        return c1006Sr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            a.PK r3 = r2.m2495z(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Le
            java.lang.Object r0 = r3.f2791y
        Le:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1210Wc.get(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000a.C0821PK m2492h(java.util.Map.Entry r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto Ld
            a.PK r0 = r5.m2495z(r0, r1)     // Catch: java.lang.ClassCastException -> Ld
            goto Le
        Ld:
            r0 = r2
        Le:
            if (r0 == 0) goto L28
            java.lang.Object r3 = r0.f2791y
            java.lang.Object r6 = r6.getValue()
            r4 = 1
            if (r3 == r6) goto L24
            if (r3 == 0) goto L22
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L22
            goto L24
        L22:
            r6 = r1
            goto L25
        L24:
            r6 = r4
        L25:
            if (r6 == 0) goto L28
            r1 = r4
        L28:
            if (r1 == 0) goto L2b
            r2 = r0
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1210Wc.m2492h(java.util.Map$Entry):a.PK");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C1006Sr c1006Sr = this.f3935y;
        if (c1006Sr != null) {
            return c1006Sr;
        }
        C1006Sr c1006Sr2 = new C1006Sr(this, 1);
        this.f3935y = c1006Sr2;
        return c1006Sr2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        C0821PK m2495z = m2495z(obj, true);
        Object obj3 = m2495z.f2791y;
        m2495z.f2791y = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            a.PK r3 = r2.m2495z(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.m2490P(r3, r1)
        L10:
            if (r3 == 0) goto L14
            java.lang.Object r0 = r3.f2791y
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1210Wc.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3928I;
    }

    /* renamed from: u */
    public final void m2493u(C0821PK c0821pk) {
        C0821PK c0821pk2 = c0821pk.f2784R;
        C0821PK c0821pk3 = c0821pk.f2790w;
        C0821PK c0821pk4 = c0821pk2.f2784R;
        C0821PK c0821pk5 = c0821pk2.f2790w;
        c0821pk.f2784R = c0821pk5;
        if (c0821pk5 != null) {
            c0821pk5.f2785S = c0821pk;
        }
        m2489N(c0821pk, c0821pk2);
        c0821pk2.f2790w = c0821pk;
        c0821pk.f2785S = c0821pk2;
        int max = Math.max(c0821pk3 != null ? c0821pk3.f2789s : 0, c0821pk5 != null ? c0821pk5.f2789s : 0) + 1;
        c0821pk.f2789s = max;
        c0821pk2.f2789s = Math.max(max, c0821pk4 != null ? c0821pk4.f2789s : 0) + 1;
    }

    /* renamed from: v */
    public final void m2494v(C0821PK c0821pk, boolean z) {
        while (c0821pk != null) {
            C0821PK c0821pk2 = c0821pk.f2784R;
            C0821PK c0821pk3 = c0821pk.f2790w;
            int i = c0821pk2 != null ? c0821pk2.f2789s : 0;
            int i2 = c0821pk3 != null ? c0821pk3.f2789s : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C0821PK c0821pk4 = c0821pk3.f2784R;
                C0821PK c0821pk5 = c0821pk3.f2790w;
                int i4 = (c0821pk4 != null ? c0821pk4.f2789s : 0) - (c0821pk5 != null ? c0821pk5.f2789s : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    m2493u(c0821pk3);
                }
                m2491Q(c0821pk);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C0821PK c0821pk6 = c0821pk2.f2784R;
                C0821PK c0821pk7 = c0821pk2.f2790w;
                int i5 = (c0821pk6 != null ? c0821pk6.f2789s : 0) - (c0821pk7 != null ? c0821pk7.f2789s : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    m2491Q(c0821pk2);
                }
                m2493u(c0821pk);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c0821pk.f2789s = i + 1;
                if (z) {
                    return;
                }
            } else {
                c0821pk.f2789s = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c0821pk = c0821pk.f2785S;
        }
    }

    /* renamed from: z */
    public final C0821PK m2495z(Object obj, boolean z) {
        C0821PK c0821pk;
        int i;
        C0821PK c0821pk2;
        C0821PK c0821pk3;
        C0821PK c0821pk4;
        C0821PK c0821pk5;
        Comparable comparable;
        int compare;
        C0821PK c0821pk6;
        C0821PK[] c0821pkArr = this.f3929R;
        int hashCode = obj.hashCode();
        int i2 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i3 = (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
        int length = i3 & (c0821pkArr.length - 1);
        C0821PK c0821pk7 = c0821pkArr[length];
        C2496v1 c2496v1 = f3927s;
        int i4 = 0;
        C0821PK c0821pk8 = null;
        Comparator comparator = this.f3930S;
        if (c0821pk7 != null) {
            if (comparator == c2496v1) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = c0821pk7.f2787k;
                if (comparable != null) {
                    compare = comparable.compareTo(obj2);
                } else {
                    compare = comparator.compare(obj, obj2);
                }
                if (compare == 0) {
                    return c0821pk7;
                }
                if (compare < 0) {
                    c0821pk6 = c0821pk7.f2784R;
                } else {
                    c0821pk6 = c0821pk7.f2790w;
                }
                if (c0821pk6 == null) {
                    i = compare;
                    c0821pk = c0821pk7;
                    break;
                }
                c0821pk7 = c0821pk6;
            }
        } else {
            c0821pk = c0821pk7;
            i = 0;
        }
        if (!z) {
            return null;
        }
        C0821PK c0821pk9 = this.f3934w;
        if (c0821pk == null) {
            if (comparator == c2496v1 && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c0821pk2 = new C0821PK(c0821pk, obj, i3, c0821pk9, c0821pk9.f2788q);
            c0821pkArr[length] = c0821pk2;
        } else {
            C0821PK c0821pk10 = new C0821PK(c0821pk, obj, i3, c0821pk9, c0821pk9.f2788q);
            if (i < 0) {
                c0821pk.f2784R = c0821pk10;
            } else {
                c0821pk.f2790w = c0821pk10;
            }
            m2494v(c0821pk, true);
            c0821pk2 = c0821pk10;
        }
        int i5 = this.f3928I;
        this.f3928I = i5 + 1;
        if (i5 > this.f3932k) {
            C0821PK[] c0821pkArr2 = this.f3929R;
            int length2 = c0821pkArr2.length;
            int i6 = length2 * 2;
            C0821PK[] c0821pkArr3 = new C0821PK[i6];
            C2196pM c2196pM = new C2196pM(29, i4);
            C2093nR c2093nR = new C2093nR();
            C2093nR c2093nR2 = new C2093nR();
            int i7 = 0;
            while (i7 < length2) {
                C0821PK c0821pk11 = c0821pkArr2[i7];
                if (c0821pk11 == null) {
                    c0821pk3 = c0821pk8;
                } else {
                    C0821PK c0821pk12 = c0821pk8;
                    for (C0821PK c0821pk13 = c0821pk11; c0821pk13 != null; c0821pk13 = c0821pk13.f2784R) {
                        c0821pk13.f2785S = c0821pk12;
                        c0821pk12 = c0821pk13;
                    }
                    c2196pM.f6755R = c0821pk12;
                    int i8 = i4;
                    int i9 = i8;
                    while (true) {
                        C0821PK c0821pk14 = (C0821PK) c2196pM.f6755R;
                        if (c0821pk14 == null) {
                            c0821pk14 = c0821pk8;
                        } else {
                            C0821PK c0821pk15 = c0821pk14.f2785S;
                            c0821pk14.f2785S = c0821pk8;
                            C0821PK c0821pk16 = c0821pk14.f2790w;
                            while (c0821pk16 != null) {
                                c0821pk16.f2785S = c0821pk15;
                                C0821PK c0821pk17 = c0821pk16;
                                c0821pk16 = c0821pk16.f2784R;
                                c0821pk15 = c0821pk17;
                            }
                            c2196pM.f6755R = c0821pk15;
                        }
                        if (c0821pk14 == null) {
                            break;
                        }
                        if ((c0821pk14.f2786g & length2) == 0) {
                            i8++;
                        } else {
                            i9++;
                        }
                        c0821pk8 = null;
                    }
                    c2093nR.f6462z = ((Integer.highestOneBit(i8) * 2) - 1) - i8;
                    c2093nR.f6461v = 0;
                    c2093nR.f6460h = 0;
                    c2093nR.f6459P = null;
                    c2093nR2.f6462z = ((Integer.highestOneBit(i9) * 2) - 1) - i9;
                    c2093nR2.f6461v = 0;
                    c2093nR2.f6460h = 0;
                    c2093nR2.f6459P = null;
                    C0821PK c0821pk18 = null;
                    while (c0821pk11 != null) {
                        c0821pk11.f2785S = c0821pk18;
                        C0821PK c0821pk19 = c0821pk11;
                        c0821pk11 = c0821pk11.f2784R;
                        c0821pk18 = c0821pk19;
                    }
                    c2196pM.f6755R = c0821pk18;
                    while (true) {
                        C0821PK c0821pk20 = (C0821PK) c2196pM.f6755R;
                        if (c0821pk20 == null) {
                            c0821pk20 = null;
                            c0821pk3 = null;
                        } else {
                            C0821PK c0821pk21 = c0821pk20.f2785S;
                            c0821pk3 = null;
                            c0821pk20.f2785S = null;
                            for (C0821PK c0821pk22 = c0821pk20.f2790w; c0821pk22 != null; c0821pk22 = c0821pk22.f2784R) {
                                c0821pk22.f2785S = c0821pk21;
                                c0821pk21 = c0821pk22;
                            }
                            c2196pM.f6755R = c0821pk21;
                        }
                        if (c0821pk20 == null) {
                            break;
                        }
                        if ((c0821pk20.f2786g & length2) == 0) {
                            c2093nR.m3720z(c0821pk20);
                        } else {
                            c2093nR2.m3720z(c0821pk20);
                        }
                    }
                    if (i8 > 0) {
                        c0821pk4 = (C0821PK) c2093nR.f6459P;
                        if (c0821pk4.f2785S != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        c0821pk4 = c0821pk3;
                    }
                    c0821pkArr3[i7] = c0821pk4;
                    int i10 = i7 + length2;
                    if (i9 > 0) {
                        c0821pk5 = (C0821PK) c2093nR2.f6459P;
                        if (c0821pk5.f2785S != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        c0821pk5 = c0821pk3;
                    }
                    c0821pkArr3[i10] = c0821pk5;
                }
                i7++;
                c0821pk8 = c0821pk3;
                i4 = 0;
            }
            this.f3929R = c0821pkArr3;
            this.f3932k = (i6 / 4) + (i6 / 2);
        }
        this.f3933q++;
        return c0821pk2;
    }
}
