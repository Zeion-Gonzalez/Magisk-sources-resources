package p000a;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: a.Xz */
/* loaded from: classes.dex */
public final class C1280Xz {

    /* renamed from: P */
    public final C0872QL f4108P;

    /* renamed from: z */
    public final C1095UY f4112z = new C1095UY(30, 1);

    /* renamed from: h */
    public final ArrayList f4110h = new ArrayList();

    /* renamed from: v */
    public final ArrayList f4111v = new ArrayList();

    /* renamed from: Q */
    public int f4109Q = 0;

    /* renamed from: N */
    public final C2052mg f4107N = new C2052mg(2, this);

    public C1280Xz(C0872QL c0872ql) {
        this.f4108P = c0872ql;
    }

    /* JADX WARN: Code restructure failed: missing block: B:301:0x0144, code lost:
    
        if (r4 > r12.f351h) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x016e, code lost:
    
        if (r4 >= r12.f351h) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0170, code lost:
    
        r11.f350P = r4 - r12.f350P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0175, code lost:
    
        r1.set(r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x017c, code lost:
    
        if (r11.f351h == r11.f350P) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x017e, code lost:
    
        r1.set(r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0182, code lost:
    
        r1.remove(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0185, code lost:
    
        if (r6 == null) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0187, code lost:
    
        r1.add(r3, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:248:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x011b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x010e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0009 A[SYNTHETIC] */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2608G() {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1280Xz.m2608G():void");
    }

    /* renamed from: M */
    public final void m2609M(C0093Bo c0093Bo) {
        c0093Bo.f352v = null;
        this.f4112z.mo1756h(c0093Bo);
    }

    /* renamed from: N */
    public final void m2610N(C0093Bo c0093Bo, int i) {
        C0872QL c0872ql = this.f4108P;
        c0872ql.m2009z(c0093Bo);
        int i2 = c0093Bo.f353z;
        if (i2 != 2) {
            if (i2 == 4) {
                c0872ql.m2004P(i, c0093Bo.f350P, c0093Bo.f352v);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i3 = c0093Bo.f350P;
        RecyclerView recyclerView = c0872ql.f2961z;
        recyclerView.m4948t(i, i3, true);
        recyclerView.f9101dG = true;
        recyclerView.f9064BX.f1664v += i3;
    }

    /* renamed from: P */
    public final void m2611P(C0093Bo c0093Bo) {
        int i;
        int i2 = c0093Bo.f353z;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m2613S = m2613S(c0093Bo.f351h, i2);
        int i3 = c0093Bo.f351h;
        int i4 = c0093Bo.f353z;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0093Bo);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c0093Bo.f350P; i6++) {
            int m2613S2 = m2613S((i * i6) + c0093Bo.f351h, c0093Bo.f353z);
            int i7 = c0093Bo.f353z;
            if (i7 == 2 ? m2613S2 == m2613S : i7 == 4 && m2613S2 == m2613S + 1) {
                i5++;
            } else {
                C0093Bo m2617o = m2617o(c0093Bo.f352v, i7, m2613S, i5);
                m2610N(m2617o, i3);
                m2609M(m2617o);
                if (c0093Bo.f353z == 4) {
                    i3 += i5;
                }
                i5 = 1;
                m2613S = m2613S2;
            }
        }
        Object obj = c0093Bo.f352v;
        m2609M(c0093Bo);
        if (i5 > 0) {
            C0093Bo m2617o2 = m2617o(obj, c0093Bo.f353z, m2613S, i5);
            m2610N(m2617o2, i3);
            m2609M(m2617o2);
        }
    }

    /* renamed from: Q */
    public final int m2612Q(int i, int i2) {
        ArrayList arrayList = this.f4111v;
        int size = arrayList.size();
        while (i2 < size) {
            C0093Bo c0093Bo = (C0093Bo) arrayList.get(i2);
            int i3 = c0093Bo.f353z;
            if (i3 == 8) {
                int i4 = c0093Bo.f351h;
                if (i4 == i) {
                    i = c0093Bo.f350P;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0093Bo.f350P <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0093Bo.f351h;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0093Bo.f350P;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0093Bo.f350P;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: S */
    public final int m2613S(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = this.f4111v;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0093Bo c0093Bo = (C0093Bo) arrayList.get(size);
            int i9 = c0093Bo.f353z;
            if (i9 == 8) {
                int i10 = c0093Bo.f351h;
                int i11 = c0093Bo.f350P;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            c0093Bo.f351h = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            c0093Bo.f351h = i10 - 1;
                            i6 = i11 - 1;
                        }
                        c0093Bo.f350P = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    c0093Bo.f350P = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    c0093Bo.f351h = i7;
                    i--;
                }
            } else {
                int i12 = c0093Bo.f351h;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    c0093Bo.f351h = i3;
                } else if (i9 == 1) {
                    i -= c0093Bo.f350P;
                } else if (i9 == 2) {
                    i += c0093Bo.f350P;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0093Bo c0093Bo2 = (C0093Bo) arrayList.get(size2);
            if (c0093Bo2.f353z == 8) {
                int i13 = c0093Bo2.f350P;
                if (i13 != c0093Bo2.f351h && i13 >= 0) {
                }
                arrayList.remove(size2);
                m2609M(c0093Bo2);
            } else {
                if (c0093Bo2.f350P > 0) {
                }
                arrayList.remove(size2);
                m2609M(c0093Bo2);
            }
        }
        return i;
    }

    /* renamed from: V */
    public final void m2614V(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m2609M((C0093Bo) arrayList.get(i));
        }
        arrayList.clear();
    }

    /* renamed from: W */
    public final void m2615W(C0093Bo c0093Bo) {
        this.f4111v.add(c0093Bo);
        int i = c0093Bo.f353z;
        C0872QL c0872ql = this.f4108P;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        c0872ql.m2005Q(c0093Bo.f351h, c0093Bo.f350P);
                        return;
                    } else {
                        throw new IllegalArgumentException("Unknown update op type for " + c0093Bo);
                    }
                }
                c0872ql.m2004P(c0093Bo.f351h, c0093Bo.f350P, c0093Bo.f352v);
                return;
            }
            int i2 = c0093Bo.f351h;
            int i3 = c0093Bo.f350P;
            RecyclerView recyclerView = c0872ql.f2961z;
            recyclerView.m4948t(i2, i3, false);
            recyclerView.f9101dG = true;
            return;
        }
        c0872ql.m2003N(c0093Bo.f351h, c0093Bo.f350P);
    }

    /* renamed from: h */
    public final void m2616h() {
        ArrayList arrayList = this.f4111v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f4108P.m2009z((C0093Bo) arrayList.get(i));
        }
        m2614V(arrayList);
        this.f4109Q = 0;
    }

    /* renamed from: o */
    public final C0093Bo m2617o(Object obj, int i, int i2, int i3) {
        C0093Bo c0093Bo = (C0093Bo) this.f4112z.mo1757z();
        if (c0093Bo == null) {
            return new C0093Bo(obj, i, i2, i3);
        }
        c0093Bo.f353z = i;
        c0093Bo.f351h = i2;
        c0093Bo.f350P = i3;
        c0093Bo.f352v = obj;
        return c0093Bo;
    }

    /* renamed from: u */
    public final boolean m2618u() {
        return this.f4110h.size() > 0;
    }

    /* renamed from: v */
    public final void m2619v() {
        m2616h();
        ArrayList arrayList = this.f4110h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0093Bo c0093Bo = (C0093Bo) arrayList.get(i);
            int i2 = c0093Bo.f353z;
            C0872QL c0872ql = this.f4108P;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            c0872ql.m2009z(c0093Bo);
                            c0872ql.m2005Q(c0093Bo.f351h, c0093Bo.f350P);
                        }
                    } else {
                        c0872ql.m2009z(c0093Bo);
                        c0872ql.m2004P(c0093Bo.f351h, c0093Bo.f350P, c0093Bo.f352v);
                    }
                } else {
                    c0872ql.m2009z(c0093Bo);
                    int i3 = c0093Bo.f351h;
                    int i4 = c0093Bo.f350P;
                    RecyclerView recyclerView = c0872ql.f2961z;
                    recyclerView.m4948t(i3, i4, true);
                    recyclerView.f9101dG = true;
                    recyclerView.f9064BX.f1664v += i4;
                }
            } else {
                c0872ql.m2009z(c0093Bo);
                c0872ql.m2003N(c0093Bo.f351h, c0093Bo.f350P);
            }
        }
        m2614V(arrayList);
        this.f4109Q = 0;
    }

    /* renamed from: z */
    public final boolean m2620z(int i) {
        ArrayList arrayList = this.f4111v;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0093Bo c0093Bo = (C0093Bo) arrayList.get(i2);
            int i3 = c0093Bo.f353z;
            if (i3 == 8) {
                if (m2612Q(c0093Bo.f350P, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0093Bo.f351h;
                int i5 = c0093Bo.f350P + i4;
                while (i4 < i5) {
                    if (m2612Q(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
