package p000a;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: a.cb */
/* loaded from: classes.dex */
public class C1517cb extends AbstractList implements InterfaceC0133Ca, List, InterfaceC1564dP, InterfaceC0384HJ {

    /* renamed from: S */
    public List f4694S = C1239X8.f4021S;

    /* renamed from: R */
    public final C0503JV f4693R = new C0503JV();

    /* renamed from: Q */
    public static C0934Ra m2942Q(List list, ArrayList arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        C2235q7 c2235q7;
        C2545vu c2545vu;
        ArrayList arrayList4;
        int i;
        C2235q7 c2235q72;
        C2235q7 c2235q73;
        boolean z;
        C1595e1 c1595e1;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        C2545vu c2545vu2;
        boolean z4;
        C2545vu c2545vu3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C0611LU c0611lu = new C0611LU(list, arrayList);
        int size = list.size();
        int size2 = arrayList.size();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new C2235q7(size, size2));
        int i15 = size + size2;
        int i16 = 1;
        int i17 = (((i15 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i17];
        int i18 = i17 / 2;
        int[] iArr2 = new int[i17];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            C2235q7 c2235q74 = (C2235q7) arrayList6.remove(arrayList6.size() - i16);
            int i19 = c2235q74.f6890h;
            int i20 = c2235q74.f6892z;
            int i21 = i19 - i20;
            if (i21 >= i16 && (i4 = c2235q74.f6889P - c2235q74.f6891v) >= i16) {
                int i22 = ((i4 + i21) + i16) / 2;
                int i23 = i16 + i18;
                iArr[i23] = i20;
                iArr2[i23] = i19;
                int i24 = 0;
                while (i24 < i22) {
                    if (Math.abs((c2235q74.f6890h - c2235q74.f6892z) - (c2235q74.f6889P - c2235q74.f6891v)) % 2 == i16) {
                        i5 = i16;
                    } else {
                        i5 = 0;
                    }
                    int i25 = (c2235q74.f6890h - c2235q74.f6892z) - (c2235q74.f6889P - c2235q74.f6891v);
                    int i26 = -i24;
                    int i27 = i26;
                    while (true) {
                        if (i27 <= i24) {
                            if (i27 != i26 && (i27 == i24 || iArr[i27 + 1 + i18] <= iArr[(i27 - 1) + i18])) {
                                i11 = iArr[(i27 - 1) + i18];
                                i12 = i11 + 1;
                            } else {
                                i11 = iArr[i27 + 1 + i18];
                                i12 = i11;
                            }
                            i6 = i22;
                            arrayList2 = arrayList6;
                            int i28 = ((i12 - c2235q74.f6892z) + c2235q74.f6891v) - i27;
                            if (i24 != 0 && i12 == i11) {
                                i13 = i28 - 1;
                            } else {
                                i13 = i28;
                            }
                            arrayList3 = arrayList7;
                            while (i12 < c2235q74.f6890h && i28 < c2235q74.f6889P && c0611lu.m1353z(i12, i28)) {
                                i12++;
                                i28++;
                            }
                            iArr[i27 + i18] = i12;
                            if (i5 != 0) {
                                int i29 = i25 - i27;
                                i14 = i5;
                                if (i29 >= i26 + 1 && i29 <= i24 - 1 && iArr2[i29 + i18] <= i12) {
                                    c2545vu2 = new C2545vu();
                                    c2545vu2.f7788z = i11;
                                    c2545vu2.f7786h = i13;
                                    c2545vu2.f7787v = i12;
                                    c2545vu2.f7785P = i28;
                                    z3 = false;
                                    c2545vu2.f7784N = false;
                                    break;
                                }
                            } else {
                                i14 = i5;
                            }
                            i27 += 2;
                            i22 = i6;
                            arrayList6 = arrayList2;
                            arrayList7 = arrayList3;
                            i5 = i14;
                        } else {
                            arrayList2 = arrayList6;
                            arrayList3 = arrayList7;
                            i6 = i22;
                            z3 = false;
                            c2545vu2 = null;
                            break;
                        }
                    }
                    if (c2545vu2 != null) {
                        c2545vu = c2545vu2;
                        c2235q7 = c2235q74;
                        break;
                    }
                    int i30 = (c2235q74.f6890h - c2235q74.f6892z) - (c2235q74.f6889P - c2235q74.f6891v);
                    if (i30 % 2 == 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    int i31 = i26;
                    while (true) {
                        if (i31 <= i24) {
                            if (i31 != i26 && (i31 == i24 || iArr2[i31 + 1 + i18] >= iArr2[(i31 - 1) + i18])) {
                                i7 = iArr2[(i31 - 1) + i18];
                                i8 = i7 - 1;
                            } else {
                                i7 = iArr2[i31 + 1 + i18];
                                i8 = i7;
                            }
                            int i32 = c2235q74.f6889P - ((c2235q74.f6890h - i8) - i31);
                            if (i24 != 0 && i8 == i7) {
                                i9 = i32 + 1;
                            } else {
                                i9 = i32;
                            }
                            while (i8 > c2235q74.f6892z && i32 > c2235q74.f6891v) {
                                int i33 = i8 - 1;
                                c2235q7 = c2235q74;
                                int i34 = i32 - 1;
                                if (!c0611lu.m1353z(i33, i34)) {
                                    break;
                                }
                                i8 = i33;
                                i32 = i34;
                                c2235q74 = c2235q7;
                            }
                            c2235q7 = c2235q74;
                            iArr2[i31 + i18] = i8;
                            if (z4 && (i10 = i30 - i31) >= i26 && i10 <= i24 && iArr[i10 + i18] >= i8) {
                                c2545vu3 = new C2545vu();
                                c2545vu3.f7788z = i8;
                                c2545vu3.f7786h = i32;
                                c2545vu3.f7787v = i7;
                                c2545vu3.f7785P = i9;
                                c2545vu3.f7784N = true;
                                break;
                            }
                            i31 += 2;
                            c2235q74 = c2235q7;
                        } else {
                            c2235q7 = c2235q74;
                            c2545vu3 = null;
                            break;
                        }
                    }
                    if (c2545vu3 != null) {
                        c2545vu = c2545vu3;
                        break;
                    }
                    i24++;
                    i22 = i6;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList3;
                    c2235q74 = c2235q7;
                    i16 = 1;
                }
            }
            arrayList2 = arrayList6;
            arrayList3 = arrayList7;
            c2235q7 = c2235q74;
            c2545vu = null;
            if (c2545vu != null) {
                if (Math.min(c2545vu.f7787v - c2545vu.f7788z, c2545vu.f7785P - c2545vu.f7786h) > 0) {
                    int i35 = c2545vu.f7785P;
                    int i36 = c2545vu.f7786h;
                    int i37 = i35 - i36;
                    int i38 = c2545vu.f7787v;
                    int i39 = c2545vu.f7788z;
                    int i40 = i38 - i39;
                    if (i37 != i40) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (c2545vu.f7784N) {
                            c1595e1 = new C1595e1(i39, i36, Math.min(i38 - i39, i35 - i36));
                        } else {
                            if (i37 > i40) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                i3 = i36 + 1;
                                i2 = i39;
                            } else {
                                i2 = i39 + 1;
                                i3 = i36;
                            }
                            c1595e1 = new C1595e1(i2, i3, Math.min(i38 - i39, i35 - i36));
                        }
                    } else {
                        c1595e1 = new C1595e1(i39, i36, i40);
                    }
                    arrayList5.add(c1595e1);
                }
                if (arrayList3.isEmpty()) {
                    c2235q72 = new C2235q7();
                    arrayList7 = arrayList3;
                    c2235q73 = c2235q7;
                    i = 1;
                } else {
                    i = 1;
                    arrayList7 = arrayList3;
                    c2235q72 = (C2235q7) arrayList7.remove(arrayList3.size() - 1);
                    c2235q73 = c2235q7;
                }
                c2235q72.f6892z = c2235q73.f6892z;
                c2235q72.f6891v = c2235q73.f6891v;
                c2235q72.f6890h = c2545vu.f7788z;
                c2235q72.f6889P = c2545vu.f7786h;
                arrayList4 = arrayList2;
                arrayList4.add(c2235q72);
                c2235q73.f6890h = c2235q73.f6890h;
                c2235q73.f6889P = c2235q73.f6889P;
                c2235q73.f6892z = c2545vu.f7787v;
                c2235q73.f6891v = c2545vu.f7785P;
                arrayList4.add(c2235q73);
            } else {
                arrayList4 = arrayList2;
                arrayList7 = arrayList3;
                i = 1;
                arrayList7.add(c2235q7);
            }
            i16 = i;
            arrayList6 = arrayList4;
        }
        Collections.sort(arrayList5, AbstractC1292YB.f4143u);
        return new C0934Ra(c0611lu, arrayList5, iArr, iArr2);
    }

    /* renamed from: G */
    public final Object m2943G(ArrayList arrayList, InterfaceC1171Vv interfaceC1171Vv) {
        C0934Ra m2942Q = m2942Q(this.f4694S, arrayList);
        C1080UE c1080ue = AbstractC0037Al.f179z;
        Object m1021ZH = AbstractC0438II.m1021ZH(AbstractC1342Z8.f4236z, new C2050md(this, arrayList, m2942Q, null), interfaceC1171Vv);
        if (m1021ZH != EnumC0464Im.f1557S) {
            return C0329GJ.f1115z;
        }
        return m1021ZH;
    }

    @Override // p000a.InterfaceC0384HJ
    /* renamed from: N */
    public final void mo872N(int i, int i2, Object obj) {
        C0503JV c0503jv = this.f4693R;
        c0503jv.getClass();
        c0503jv.m1195M(this, 1, C0503JV.m1194W(i, 0, i2));
    }

    @Override // p000a.InterfaceC0384HJ
    /* renamed from: P */
    public final void mo873P(int i, int i2) {
        C0503JV c0503jv = this.f4693R;
        c0503jv.getClass();
        c0503jv.m1195M(this, 3, C0503JV.m1194W(i, i2, 1));
    }

    /* renamed from: W */
    public int mo2944W() {
        return this.f4694S.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof InterfaceC0645M7;
        }
        if (!z) {
            return false;
        }
        return super.contains((InterfaceC0645M7) obj);
    }

    @Override // p000a.InterfaceC0384HJ
    /* renamed from: h */
    public final void mo874h(int i, int i2) {
        ((AbstractList) this).modCount++;
        C0503JV c0503jv = this.f4693R;
        c0503jv.getClass();
        c0503jv.m1195M(this, 4, C0503JV.m1194W(i, 0, i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof InterfaceC0645M7;
        }
        if (!z) {
            return -1;
        }
        return super.indexOf((InterfaceC0645M7) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof InterfaceC0645M7;
        }
        if (!z) {
            return -1;
        }
        return super.lastIndexOf((InterfaceC0645M7) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o */
    public InterfaceC0645M7 get(int i) {
        return (InterfaceC0645M7) this.f4694S.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof InterfaceC0645M7;
        }
        if (!z) {
            return false;
        }
        return super.remove((InterfaceC0645M7) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo2944W();
    }

    @Override // p000a.InterfaceC0133Ca
    /* renamed from: u */
    public final void mo262u(AbstractC1193WJ abstractC1193WJ) {
        this.f4693R.m925z(abstractC1193WJ);
    }

    @Override // p000a.InterfaceC0384HJ
    /* renamed from: v */
    public final void mo875v(int i, int i2) {
        ((AbstractList) this).modCount++;
        C0503JV c0503jv = this.f4693R;
        c0503jv.getClass();
        c0503jv.m1195M(this, 2, C0503JV.m1194W(i, 0, i2));
    }

    @Override // p000a.InterfaceC0133Ca
    /* renamed from: z */
    public final void mo263z(AbstractC1193WJ abstractC1193WJ) {
        this.f4693R.m923u(abstractC1193WJ);
    }
}
