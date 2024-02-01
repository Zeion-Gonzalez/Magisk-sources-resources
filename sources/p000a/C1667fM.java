package p000a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: a.fM */
/* loaded from: classes.dex */
public final class C1667fM {

    /* renamed from: P */
    public final C1535cx f5203P;

    /* renamed from: Q */
    public C0847Pp f5204Q;

    /* renamed from: o */
    public final ArrayList f5206o;

    /* renamed from: u */
    public final C0782OY f5207u;

    /* renamed from: z */
    public final C1535cx f5209z;

    /* renamed from: h */
    public boolean f5205h = true;

    /* renamed from: v */
    public boolean f5208v = true;

    /* renamed from: N */
    public final ArrayList f5202N = new ArrayList();

    public C1667fM(C1535cx c1535cx) {
        new ArrayList();
        this.f5204Q = null;
        this.f5207u = new C0782OY();
        this.f5206o = new ArrayList();
        this.f5209z = c1535cx;
        this.f5203P = c1535cx;
    }

    /* renamed from: N */
    public final void m3158N(AbstractC1790hg abstractC1790hg, int i, ArrayList arrayList) {
        C1472bf c1472bf;
        C1472bf c1472bf2;
        C1472bf c1472bf3;
        Iterator it = abstractC1790hg.f5628o.f4564M.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c1472bf = abstractC1790hg.f5626W;
            if (!hasNext) {
                break;
            }
            InterfaceC1298YI interfaceC1298YI = (InterfaceC1298YI) it.next();
            if (interfaceC1298YI instanceof C1472bf) {
                c1472bf3 = (C1472bf) interfaceC1298YI;
            } else if (interfaceC1298YI instanceof AbstractC1790hg) {
                c1472bf3 = ((AbstractC1790hg) interfaceC1298YI).f5628o;
            }
            m3164z(c1472bf3, i, 0, arrayList, null);
        }
        Iterator it2 = c1472bf.f4564M.iterator();
        while (it2.hasNext()) {
            InterfaceC1298YI interfaceC1298YI2 = (InterfaceC1298YI) it2.next();
            if (interfaceC1298YI2 instanceof C1472bf) {
                c1472bf2 = (C1472bf) interfaceC1298YI2;
            } else if (interfaceC1298YI2 instanceof AbstractC1790hg) {
                c1472bf2 = ((AbstractC1790hg) interfaceC1298YI2).f5626W;
            }
            m3164z(c1472bf2, i, 1, arrayList, null);
        }
        if (i == 1) {
            Iterator it3 = ((C1217Wk) abstractC1790hg).f3981M.f4564M.iterator();
            while (it3.hasNext()) {
                InterfaceC1298YI interfaceC1298YI3 = (InterfaceC1298YI) it3.next();
                if (interfaceC1298YI3 instanceof C1472bf) {
                    m3164z((C1472bf) interfaceC1298YI3, i, 2, arrayList, null);
                }
            }
        }
    }

    /* renamed from: P */
    public final int m3159P(C1535cx c1535cx, int i) {
        int i2;
        long j;
        long j2;
        ArrayList arrayList;
        AbstractC1790hg abstractC1790hg;
        AbstractC1790hg abstractC1790hg2;
        long j3;
        long j4;
        long j5;
        float f;
        long j6;
        C1535cx c1535cx2 = c1535cx;
        ArrayList arrayList2 = this.f5206o;
        int size = arrayList2.size();
        int i3 = 0;
        long j7 = 0;
        while (i3 < size) {
            AbstractC1790hg abstractC1790hg3 = ((C2682ye) arrayList2.get(i3)).f8365z;
            if (!(abstractC1790hg3 instanceof C0807P2) ? !(i != 0 ? (abstractC1790hg3 instanceof C1217Wk) : (abstractC1790hg3 instanceof C1715gF)) : ((C0807P2) abstractC1790hg3).f5625Q != i) {
                i2 = size;
                j = j7;
                j2 = 0;
                arrayList = arrayList2;
            } else {
                if (i == 0) {
                    abstractC1790hg = c1535cx2.f5039P;
                } else {
                    abstractC1790hg = c1535cx2.f5037N;
                }
                C1472bf c1472bf = abstractC1790hg.f5628o;
                if (i == 0) {
                    abstractC1790hg2 = c1535cx2.f5039P;
                } else {
                    abstractC1790hg2 = c1535cx2.f5037N;
                }
                C1472bf c1472bf2 = abstractC1790hg2.f5626W;
                boolean contains = abstractC1790hg3.f5628o.f4568V.contains(c1472bf);
                C1472bf c1472bf3 = abstractC1790hg3.f5626W;
                boolean contains2 = c1472bf3.f4568V.contains(c1472bf2);
                long mo1909G = abstractC1790hg3.mo1909G();
                C1472bf c1472bf4 = abstractC1790hg3.f5628o;
                if (contains && contains2) {
                    long m4590h = C2682ye.m4590h(c1472bf4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long m4591z = C2682ye.m4591z(c1472bf3, 0L);
                    long j8 = m4590h - mo1909G;
                    int i4 = c1472bf3.f4567Q;
                    j3 = j7;
                    arrayList = arrayList3;
                    if (j8 >= (-i4)) {
                        j8 += i4;
                    }
                    long j9 = (-m4591z) - mo1909G;
                    long j10 = c1472bf4.f4567Q;
                    long j11 = j9 - j10;
                    if (j11 >= j10) {
                        j11 -= j10;
                    }
                    C1628ed c1628ed = abstractC1790hg3.f5627h;
                    if (i == 0) {
                        f = c1628ed.f5073od;
                    } else if (i == 1) {
                        f = c1628ed.f5070nF;
                    } else {
                        c1628ed.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j6 = (((float) j8) / (1.0f - f)) + (((float) j11) / f);
                    } else {
                        j6 = 0;
                    }
                    float f2 = (float) j6;
                    j2 = (c1472bf4.f4567Q + ((((f2 * f) + 0.5f) + mo1909G) + (((1.0f - f) * f2) + 0.5f))) - c1472bf3.f4567Q;
                } else {
                    i2 = size;
                    j3 = j7;
                    arrayList = arrayList2;
                    if (contains) {
                        j5 = C2682ye.m4590h(c1472bf4, c1472bf4.f4567Q);
                        j4 = c1472bf4.f4567Q + mo1909G;
                    } else if (contains2) {
                        j4 = (-c1472bf3.f4567Q) + mo1909G;
                        j5 = -C2682ye.m4591z(c1472bf3, c1472bf3.f4567Q);
                    } else {
                        j2 = (abstractC1790hg3.mo1909G() + c1472bf4.f4567Q) - c1472bf3.f4567Q;
                    }
                    j2 = Math.max(j5, j4);
                }
                j = j3;
            }
            i3++;
            arrayList2 = arrayList;
            size = i2;
            j7 = Math.max(j, j2);
            c1535cx2 = c1535cx;
        }
        return (int) j7;
    }

    /* renamed from: Q */
    public final void m3160Q(C1628ed c1628ed, int i, int i2, int i3, int i4) {
        boolean z;
        C0782OY c0782oy = this.f5207u;
        c0782oy.f2651z = i;
        c0782oy.f2647h = i3;
        c0782oy.f2650v = i2;
        c0782oy.f2644P = i4;
        this.f5204Q.m1962h(c1628ed, c0782oy);
        c1628ed.m3111p(c0782oy.f2643N);
        c1628ed.m3090F(c0782oy.f2645Q);
        c1628ed.f5058e = c0782oy.f2648o;
        int i5 = c0782oy.f2649u;
        c1628ed.f5051Yd = i5;
        if (i5 > 0) {
            z = true;
        } else {
            z = false;
        }
        c1628ed.f5058e = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x0060, code lost:
    
        if (r2.f5065k == 0) goto L206;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3161h(p000a.C1535cx r17) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1667fM.m3161h(a.cx):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x006c, code lost:
    
        if (r10 == 3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0086, code lost:
    
        if (r8 == 3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0088, code lost:
    
        r2.f7789S = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x008b, code lost:
    
        r2.mo2881P(r3);
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3162u() {
        /*
            r13 = this;
            a.cx r0 = r13.f5209z
            java.util.ArrayList r0 = r0.f3714Pm
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La1
            java.lang.Object r1 = r0.next()
            a.ed r1 = (p000a.C1628ed) r1
            boolean r2 = r1.f5085z
            if (r2 == 0) goto L19
            goto L8
        L19:
            int[] r2 = r1.f5030Ha
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f5075q
            int r4 = r1.f5065k
            r5 = 2
            r11 = 3
            if (r8 == r5) goto L30
            if (r8 != r11) goto L2e
            if (r2 != r9) goto L2e
            goto L30
        L2e:
            r2 = r3
            goto L31
        L30:
            r2 = r9
        L31:
            if (r10 == r5) goto L37
            if (r10 != r11) goto L38
            if (r4 != r9) goto L38
        L37:
            r3 = r9
        L38:
            a.gF r4 = r1.f5039P
            a.vv r4 = r4.f5623N
            boolean r5 = r4.f4563G
            a.Wk r6 = r1.f5037N
            a.vv r6 = r6.f5623N
            boolean r7 = r6.f4563G
            r12 = 1
            if (r5 == 0) goto L55
            if (r7 == 0) goto L55
            int r5 = r4.f4572u
            int r7 = r6.f4572u
            r6 = 1
            r2 = r13
            r3 = r1
            r4 = r6
            r2.m3160Q(r3, r4, r5, r6, r7)
            goto L8e
        L55:
            if (r5 == 0) goto L6f
            if (r3 == 0) goto L6f
            int r5 = r4.f4572u
            int r7 = r6.f4572u
            r4 = 1
            r6 = 2
            r2 = r13
            r3 = r1
            r2.m3160Q(r3, r4, r5, r6, r7)
            a.Wk r2 = r1.f5037N
            a.vv r2 = r2.f5623N
            int r3 = r1.m3101V()
            if (r10 != r11) goto L8b
            goto L88
        L6f:
            if (r7 == 0) goto L90
            if (r2 == 0) goto L90
            int r5 = r4.f4572u
            int r7 = r6.f4572u
            r4 = 2
            r2 = r13
            r3 = r1
            r6 = r12
            r2.m3160Q(r3, r4, r5, r6, r7)
            a.gF r2 = r1.f5039P
            a.vv r2 = r2.f5623N
            int r3 = r1.m3098R()
            if (r8 != r11) goto L8b
        L88:
            r2.f7789S = r3
            goto L90
        L8b:
            r2.mo2881P(r3)
        L8e:
            r1.f5085z = r9
        L90:
            boolean r2 = r1.f5085z
            if (r2 == 0) goto L8
            a.Wk r2 = r1.f5037N
            a.o5 r2 = r2.f3982V
            if (r2 == 0) goto L8
            int r1 = r1.f5051Yd
            r2.mo2881P(r1)
            goto L8
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1667fM.m3162u():void");
    }

    /* renamed from: v */
    public final void m3163v() {
        AbstractC1790hg c2311rV;
        ArrayList arrayList = this.f5202N;
        arrayList.clear();
        C1535cx c1535cx = this.f5203P;
        c1535cx.f5039P.mo1913Q();
        c1535cx.f5037N.mo1913Q();
        arrayList.add(c1535cx.f5039P);
        arrayList.add(c1535cx.f5037N);
        Iterator it = c1535cx.f3714Pm.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C1628ed c1628ed = (C1628ed) it.next();
            if (c1628ed instanceof C2009ln) {
                c2311rV = new C2311rV(c1628ed);
            } else {
                if (c1628ed.m3113s()) {
                    if (c1628ed.f5061h == null) {
                        c1628ed.f5061h = new C0807P2(0, c1628ed);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1628ed.f5061h);
                } else {
                    arrayList.add(c1628ed.f5039P);
                }
                if (c1628ed.m3100U()) {
                    if (c1628ed.f5081v == null) {
                        c1628ed.f5081v = new C0807P2(1, c1628ed);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1628ed.f5081v);
                } else {
                    arrayList.add(c1628ed.f5037N);
                }
                if (c1628ed instanceof AbstractC1389a2) {
                    c2311rV = new C1357ZO(c1628ed);
                }
            }
            arrayList.add(c2311rV);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC1790hg) it2.next()).mo1913Q();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC1790hg abstractC1790hg = (AbstractC1790hg) it3.next();
            if (abstractC1790hg.f5627h != c1535cx) {
                abstractC1790hg.mo1912P();
            }
        }
        ArrayList arrayList2 = this.f5206o;
        arrayList2.clear();
        C1535cx c1535cx2 = this.f5209z;
        m3158N(c1535cx2.f5039P, 0, arrayList2);
        m3158N(c1535cx2.f5037N, 1, arrayList2);
        this.f5205h = false;
    }

    /* renamed from: z */
    public final void m3164z(C1472bf c1472bf, int i, int i2, ArrayList arrayList, C2682ye c2682ye) {
        AbstractC1790hg abstractC1790hg = c1472bf.f4566P;
        if (abstractC1790hg.f5630v == null) {
            C1535cx c1535cx = this.f5209z;
            if (abstractC1790hg != c1535cx.f5039P && abstractC1790hg != c1535cx.f5037N) {
                if (c2682ye == null) {
                    c2682ye = new C2682ye(abstractC1790hg);
                    arrayList.add(c2682ye);
                }
                abstractC1790hg.f5630v = c2682ye;
                c2682ye.f8364h.add(abstractC1790hg);
                C1472bf c1472bf2 = abstractC1790hg.f5628o;
                Iterator it = c1472bf2.f4564M.iterator();
                while (it.hasNext()) {
                    InterfaceC1298YI interfaceC1298YI = (InterfaceC1298YI) it.next();
                    if (interfaceC1298YI instanceof C1472bf) {
                        m3164z((C1472bf) interfaceC1298YI, i, 0, arrayList, c2682ye);
                    }
                }
                C1472bf c1472bf3 = abstractC1790hg.f5626W;
                Iterator it2 = c1472bf3.f4564M.iterator();
                while (it2.hasNext()) {
                    InterfaceC1298YI interfaceC1298YI2 = (InterfaceC1298YI) it2.next();
                    if (interfaceC1298YI2 instanceof C1472bf) {
                        m3164z((C1472bf) interfaceC1298YI2, i, 1, arrayList, c2682ye);
                    }
                }
                if (i == 1 && (abstractC1790hg instanceof C1217Wk)) {
                    Iterator it3 = ((C1217Wk) abstractC1790hg).f3981M.f4564M.iterator();
                    while (it3.hasNext()) {
                        InterfaceC1298YI interfaceC1298YI3 = (InterfaceC1298YI) it3.next();
                        if (interfaceC1298YI3 instanceof C1472bf) {
                            m3164z((C1472bf) interfaceC1298YI3, i, 2, arrayList, c2682ye);
                        }
                    }
                }
                Iterator it4 = c1472bf2.f4568V.iterator();
                while (it4.hasNext()) {
                    m3164z((C1472bf) it4.next(), i, 0, arrayList, c2682ye);
                }
                Iterator it5 = c1472bf3.f4568V.iterator();
                while (it5.hasNext()) {
                    m3164z((C1472bf) it5.next(), i, 1, arrayList, c2682ye);
                }
                if (i == 1 && (abstractC1790hg instanceof C1217Wk)) {
                    Iterator it6 = ((C1217Wk) abstractC1790hg).f3981M.f4568V.iterator();
                    while (it6.hasNext()) {
                        m3164z((C1472bf) it6.next(), i, 2, arrayList, c2682ye);
                    }
                }
            }
        }
    }
}
