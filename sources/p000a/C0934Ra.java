package p000a;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: a.Ra */
/* loaded from: classes.dex */
public final class C0934Ra {

    /* renamed from: N */
    public final int f3204N;

    /* renamed from: P */
    public final C0611LU f3205P;

    /* renamed from: Q */
    public final int f3206Q;

    /* renamed from: h */
    public final int[] f3207h;

    /* renamed from: u */
    public final boolean f3208u;

    /* renamed from: v */
    public final int[] f3209v;

    /* renamed from: z */
    public final List f3210z;

    public C0934Ra(C0611LU c0611lu, ArrayList arrayList, int[] iArr, int[] iArr2) {
        C1595e1 c1595e1;
        C0611LU c0611lu2;
        int[] iArr3;
        int[] iArr4;
        int i;
        C1595e1 c1595e12;
        int i2;
        int i3;
        int i4;
        this.f3210z = arrayList;
        this.f3207h = iArr;
        this.f3209v = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f3205P = c0611lu;
        int size = c0611lu.f1980z.size();
        this.f3204N = size;
        int size2 = c0611lu.f1979h.size();
        this.f3206Q = size2;
        this.f3208u = true;
        if (arrayList.isEmpty()) {
            c1595e1 = null;
        } else {
            c1595e1 = (C1595e1) arrayList.get(0);
        }
        if (c1595e1 == null || c1595e1.f4899z != 0 || c1595e1.f4897h != 0) {
            arrayList.add(0, new C1595e1(0, 0, 0));
        }
        arrayList.add(new C1595e1(size, size2, 0));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0611lu2 = this.f3205P;
            iArr3 = this.f3209v;
            iArr4 = this.f3207h;
            if (!hasNext) {
                break;
            }
            C1595e1 c1595e13 = (C1595e1) it.next();
            for (int i5 = 0; i5 < c1595e13.f4898v; i5++) {
                int i6 = c1595e13.f4899z + i5;
                int i7 = c1595e13.f4897h + i5;
                if (((InterfaceC0645M7) c0611lu2.f1980z.get(i6)).mo556h((InterfaceC0645M7) c0611lu2.f1979h.get(i7))) {
                    i4 = 1;
                } else {
                    i4 = 2;
                }
                iArr4[i6] = (i7 << 4) | i4;
                iArr3[i7] = (i6 << 4) | i4;
            }
        }
        if (this.f3208u) {
            Iterator it2 = arrayList.iterator();
            int i8 = 0;
            while (it2.hasNext()) {
                C1595e1 c1595e14 = (C1595e1) it2.next();
                while (true) {
                    i = c1595e14.f4899z;
                    if (i8 < i) {
                        if (iArr4[i8] == 0) {
                            int size3 = arrayList.size();
                            int i9 = 0;
                            int i10 = 0;
                            while (true) {
                                if (i9 < size3) {
                                    c1595e12 = (C1595e1) arrayList.get(i9);
                                    while (true) {
                                        i2 = c1595e12.f4897h;
                                        if (i10 < i2) {
                                            if (iArr3[i10] == 0 && c0611lu2.m1353z(i8, i10)) {
                                                if (((InterfaceC0645M7) c0611lu2.f1980z.get(i8)).mo556h((InterfaceC0645M7) c0611lu2.f1979h.get(i10))) {
                                                    i3 = 8;
                                                } else {
                                                    i3 = 4;
                                                }
                                                iArr4[i8] = (i10 << 4) | i3;
                                                iArr3[i10] = i3 | (i8 << 4);
                                            } else {
                                                i10++;
                                            }
                                        }
                                    }
                                }
                                i10 = c1595e12.f4898v + i2;
                                i9++;
                            }
                        }
                        i8++;
                    }
                }
                i8 = c1595e14.f4898v + i;
            }
        }
    }

    /* renamed from: h */
    public static C0953Ru m2105h(ArrayDeque arrayDeque, int i, boolean z) {
        C0953Ru c0953Ru;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                c0953Ru = null;
                break;
            }
            c0953Ru = (C0953Ru) it.next();
            if (c0953Ru.f3256z == i && c0953Ru.f3255v == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C0953Ru c0953Ru2 = (C0953Ru) it.next();
            int i2 = c0953Ru2.f3254h;
            c0953Ru2.f3254h = z ? i2 - 1 : i2 + 1;
        }
        return c0953Ru;
    }

    /* renamed from: z */
    public final void m2106z(InterfaceC0384HJ interfaceC0384HJ) {
        C0383HI c0383hi;
        int[] iArr;
        C0611LU c0611lu;
        List list;
        if (interfaceC0384HJ instanceof C0383HI) {
            c0383hi = (C0383HI) interfaceC0384HJ;
        } else {
            c0383hi = new C0383HI(interfaceC0384HJ);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        List list2 = this.f3210z;
        int size = list2.size() - 1;
        int i = this.f3204N;
        int i2 = this.f3206Q;
        int i3 = i;
        while (size >= 0) {
            C1595e1 c1595e1 = (C1595e1) list2.get(size);
            int i4 = c1595e1.f4899z;
            int i5 = c1595e1.f4898v;
            int i6 = i4 + i5;
            int i7 = c1595e1.f4897h;
            int i8 = i5 + i7;
            while (true) {
                iArr = this.f3207h;
                c0611lu = this.f3205P;
                if (i3 <= i6) {
                    break;
                }
                i3--;
                int i9 = iArr[i3];
                if ((i9 & 12) != 0) {
                    list = list2;
                    C0953Ru m2105h = m2105h(arrayDeque, i9 >> 4, false);
                    if (m2105h != null) {
                        int i10 = (i - m2105h.f3254h) - 1;
                        c0383hi.mo873P(i3, i10);
                        if ((i9 & 4) != 0) {
                            c0611lu.getClass();
                            c0383hi.mo872N(i10, 1, null);
                        }
                    } else {
                        arrayDeque.add(new C0953Ru(i3, (i - i3) - 1, true));
                    }
                } else {
                    list = list2;
                    c0383hi.mo874h(i3, 1);
                    i--;
                }
                list2 = list;
            }
            List list3 = list2;
            while (i2 > i8) {
                i2--;
                int i11 = this.f3209v[i2];
                if ((i11 & 12) != 0) {
                    C0953Ru m2105h2 = m2105h(arrayDeque, i11 >> 4, true);
                    if (m2105h2 == null) {
                        arrayDeque.add(new C0953Ru(i2, i - i3, false));
                    } else {
                        c0383hi.mo873P((i - m2105h2.f3254h) - 1, i3);
                        if ((i11 & 4) != 0) {
                            c0611lu.getClass();
                            c0383hi.mo872N(i3, 1, null);
                        }
                    }
                } else {
                    c0383hi.mo875v(i3, 1);
                    i++;
                }
            }
            i3 = c1595e1.f4899z;
            int i12 = i3;
            for (int i13 = 0; i13 < i5; i13++) {
                if ((iArr[i12] & 15) == 2) {
                    c0611lu.getClass();
                    c0383hi.mo872N(i12, 1, null);
                }
                i12++;
            }
            size--;
            i2 = i7;
            list2 = list3;
        }
        c0383hi.m876z();
    }
}
